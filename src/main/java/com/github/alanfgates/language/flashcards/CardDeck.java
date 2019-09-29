/*
 * The author licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.alanfgates.language.flashcards;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class CardDeck implements Serializable {

  private static int MAX_CARDS_TO_TEST = 50;
  private static int MIN_CARDS_TO_TEST = 10;
  private static int PCT_RETIRED_TO_TRACK = 20;
  private static double ASSUMED_PCT_RETIRED = 0.6;

  private LinkedList<Flashcard> cards;
  private Map<String, List<GrammarRule>> rules;
  private Deque<Double> percentRetired;

  CardDeck() {
    Map<String, Flashcard> m = new HashMap<>();
    rules = new HashMap<>();
    LanguageBuilder[] builders = new LanguageBuilder[] {new GreekBuilder(), new HebrewBuilder()};
    for (LanguageBuilder builder : builders) {
      for (Word w : builder.buildWords()) {
        Flashcard f = m.get(w.getOther());
        if (f == null) {
          f = new Flashcard(w);
          m.put(w.getOther(), f);
        } else {
          f.addWord(w);
        }
      }
      // Have to make a copy of the rules list because Arrays.asList returns an implementation of
      // List that doesn't support remove.
      rules.put(builder.getLanguageName(), new ArrayList<>(builder.buildRules()));
    }
    cards = new LinkedList<>(m.values());
    Collections.shuffle(cards);
    percentRetired = new ArrayDeque<>();
    printStatus();
  }

  CardDeck(String filename) throws IOException {
    ObjectMapper mapper = new ObjectMapper(new JsonFactory());
    ObjectReader reader = mapper.readerFor(Container.class);
    Container c = reader.readValue(new File(filename));
    cards = c.getCards();
    rules = c.getRules();
    percentRetired = c.getCardsRetired();
  }

  void daily() throws IOException {
    int numToTest = calculateNumToTest();
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    for (Map.Entry<String, List<GrammarRule>> e : rules.entrySet()) {
      if (e.getValue().size() > 0) {
        System.out.println("Rule for " + e.getKey());
        e.getValue().get(0).show();
        input.readLine();
        e.getValue().remove(0);
      }
    }

    List<Flashcard> doAgain = new ArrayList<>();
    int initialSize = cards.size();
    int succeeded = 0;
    int failed = 0;
    for (int i = 0; i < numToTest && !cards.isEmpty(); i++) {
      Flashcard f = cards.pop();
      if (f.test(input)) {
        succeeded++;
      } else {
        failed++;
      }
      if (f.needToDoAgain()) doAgain.add(f);
    }
    // Put back the ones that need to be done again
    cards.addAll(0, doAgain);

    // Track how many we finished
    int numRetired = trackRetired(initialSize, numToTest);
    System.out.println("Total right: " + succeeded + ", wrong: " + failed +
        ", success rate: " + ((float)succeeded / (float)numToTest) + 
        ", cards finished: " + numRetired);
    printStatus();
    if (cards.isEmpty()) {
      System.out.println("Congratulations, you have finished the deck!");
    }
  }

  void storeDeck(String filename) throws IOException {
    ObjectMapper mapper = new ObjectMapper(new JsonFactory());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    mapper.writeValue(new File(filename), new Container(cards, rules, percentRetired));
  }

  private void printStatus() {
    StringBuilder buf = new StringBuilder("Remaining cards: ")
        .append(cards.size())
        .append(", remaining rules: ");
    for (Map.Entry<String, List<GrammarRule>> e : rules.entrySet()) {
      buf.append(e.getKey())
          .append(": ")
          .append(e.getValue().size())
          .append(" ");
    }
    System.out.println(buf.toString());
  }

  private int calculateNumToTest() {
    // Base the number of things to test on the number of rules in the largest grammar's rule set.  This way we have at least one
    // rule each time we test.
    int maxRules = 1; // avoid div0 errors
    for (Map.Entry<String, List<GrammarRule>> ruleSet : rules.entrySet()) {
      if (ruleSet.getValue().size() > maxRules) {
        maxRules = ruleSet.getValue().size();
      }
    }
    double predicted;
    if (percentRetired.size() < 3) {
      System.out.println("Too few historical instances to use, basing on assumed retirement rate of " + (int)(ASSUMED_PCT_RETIRED * 100) + "%");
      predicted = ASSUMED_PCT_RETIRED;
    } else {
      double sum = 0;
      for (double d : percentRetired) sum += d;
      predicted = sum / (double)percentRetired.size();
    }
    int numToTest = (int)((double)cards.size() / (double)maxRules / predicted);

    if (numToTest > cards.size()) {
      numToTest = cards.size();
    } else if (numToTest > MAX_CARDS_TO_TEST) {
      System.out.println("Should test " + numToTest + " cards, but reducing it to " + MAX_CARDS_TO_TEST);
      numToTest = MAX_CARDS_TO_TEST;
    } else if (numToTest < MIN_CARDS_TO_TEST) {
      System.out.println("Should test " + numToTest + " cards, but increasing it to " + MIN_CARDS_TO_TEST);
      numToTest = MIN_CARDS_TO_TEST;
    }

    System.out.println("Will test with " + numToTest + " cards");
    return numToTest;
  }

  // This has to be called after the missed cards are put back
  private int trackRetired(int initialSize, int numTested) {
    int numRetired = initialSize - cards.size();
    double pct = (double)numRetired / (double)numTested;
    percentRetired.addLast(pct);
    if (percentRetired.size() > PCT_RETIRED_TO_TRACK) percentRetired.removeFirst();
    return numRetired;
  }

  static class Container {
    LinkedList<Flashcard> cards;
    Map<String, List<GrammarRule>> rules;
    Deque<Double> percentRetired;

    public Container() {
    }

    Container(LinkedList<Flashcard> cards, Map<String, List<GrammarRule>> rules, Deque<Double> percentRetired) {
      this.cards = cards;
      this.rules = rules;
      this.percentRetired = percentRetired;
    }

    public LinkedList<Flashcard> getCards() {
      return cards;
    }

    public void setCards(LinkedList<Flashcard> cards) {
      this.cards = cards;
    }

    public Map<String, List<GrammarRule>> getRules() {
      return rules;
    }

    public void setRules(Map<String, List<GrammarRule>> rules) {
      this.rules = rules;
    }

    public Deque<Double> getCardsRetired() {
      return percentRetired == null ? new ArrayDeque<>() : percentRetired;
    }

    public Container setCardsRetired(Deque<Double> cardsRetired) {
      this.percentRetired = cardsRetired;
      return this;
    }
  }
}
