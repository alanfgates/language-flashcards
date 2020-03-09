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
import java.util.function.BiFunction;

class CardDeck implements Serializable {

  private static final int MAX_CARDS_TO_TEST = 50;
  private static final int MIN_CARDS_TO_TEST = 10;
  private static final int PCT_RETIRED_TO_TRACK = 20;
  private static final double ASSUMED_PCT_RETIRED = 0.6;

  private LinkedList<Word> cards;
  private Map<String, List<GrammarRule>> rules;
  private Deque<Double> percentRetired;
  private Map<String, Integer> missCounts;

  /**
   * Build the card deck from source, with each word appearing once
   */
  CardDeck() {
    rules = new HashMap<>();
    cards = new LinkedList<>();
    LanguageBuilder[] builders = new LanguageBuilder[] {new GreekBuilder(), new HebrewBuilder()};
    for (LanguageBuilder builder : builders) {
      for (Word w : builder.buildWords()) {
        switch (w.getCompetence()) {
          case ZERO: cards.add(w); // Fall through intentional
          case WEAK: cards.add(w); // Fall through intentional
          case OK: cards.add(w); // Fall through intentional
          case STRONG:
            cards.add(w);
            break;
          default:
            throw new RuntimeException("Unexpected enum value");
        }
      }
      // Have to make a copy of the rules list because Arrays.asList returns an implementation of
      // List that doesn't support remove.
      rules.put(builder.getLanguageName(), new ArrayList<>(builder.buildRules()));
    }
    Collections.shuffle(cards);
    percentRetired = new ArrayDeque<>();
    printStatus();
  }

  /**
   * Build the card deck from an existing file.
   * @param filename name of the file
   * @throws IOException if the file cannot be read.
   */
  CardDeck(String filename) throws IOException {
    ObjectMapper mapper = new ObjectMapper(new JsonFactory());
    ObjectReader reader = mapper.readerFor(Container.class);
    Container c = reader.readValue(new File(filename));
    cards = c.getCards();
    rules = c.getRules();
    percentRetired = c.getCardsRetired();
    missCounts = c.getMissCounts();
    if (missCounts == null) missCounts = new HashMap<>();
  }

  void daily() throws IOException {
    int numToTest = calculateNumToTest();
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    doGrammarRules(input);

    List<Word> doAgain = new ArrayList<>();
    int initialSize = cards.size();
    int succeeded = 0;
    int failed = 0;
    for (int i = 0; i < numToTest && !cards.isEmpty(); i++) {
      Word f = cards.pop();
      if (f.test(input)) {
        succeeded++;
      } else {
        missCounts.compute(f.getWordForms().get(0).getOther(), (s, count) -> count == null ? 1 : count + 1);
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
    mapper.writeValue(new File(filename), new Container(cards, rules, percentRetired, missCounts));
  }

  void findRule(String pattern) {
    for (Map.Entry<String, List<GrammarRule>> e : rules.entrySet()) {
      System.out.println(e.getKey() + " has " + e.getValue().size() + " rules");
      for (GrammarRule rule : e.getValue()) {
        if (rule.toString().contains(pattern)) rule.show();
      }
    }
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

  private void doGrammarRules(BufferedReader input) throws IOException {
    // Only do one, pick from whichever has more entries
    List<GrammarRule> most = Collections.emptyList();
    String language = null;
    for (Map.Entry<String, List<GrammarRule>> e : rules.entrySet()) {
      if (e.getValue().size() > most.size()) {
        language = e.getKey();
        most = e.getValue();
      }
    }
    if (language != null) {
      showOneGrammarRule(input, language, most);
    }
  }

  private void showOneGrammarRule(BufferedReader input, String language, List<GrammarRule> ruleList) throws IOException {
    System.out.println("Rule for " + language);
    ruleList.get(0).show();
    input.readLine();
    ruleList.remove(0);
  }

  private int calculateNumToTest() {
    // Base the number of things to test on the number of rules in the largest grammar's rule set.  This way we have at least one
    // rule each time we test.
    double numRules = 0;
    for (List<GrammarRule> ruleSet : rules.values()) {
      numRules += ruleSet.size();
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
    int numToTest = (int)((double)cards.size() / numRules / predicted);

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
    private LinkedList<Word> cards;
    private Map<String, List<GrammarRule>> rules;
    private Deque<Double> percentRetired;
    private Map<String, Integer> missCounts;

    public Container() {
    }

    Container(LinkedList<Word> cards, Map<String, List<GrammarRule>> rules, Deque<Double> percentRetired, Map<String, Integer> missCounts) {
      this.cards = cards;
      this.rules = rules;
      this.percentRetired = percentRetired;
      this.missCounts = missCounts;
    }

    public LinkedList<Word> getCards() {
      return cards;
    }

    public void setCards(LinkedList<Word> cards) {
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

    public Map<String, Integer> getMissCounts() {
      return missCounts;
    }

    public Container setMissCounts(Map<String, Integer> missCounts) {
      this.missCounts = missCounts;
      return this;
    }
  }
}
