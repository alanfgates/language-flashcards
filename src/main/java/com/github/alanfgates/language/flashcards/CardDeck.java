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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

class CardDeck {
  private static final int NUM_TO_TEST_INITIAL = 15;

  private final LinkedList<Word> cards;
  private final Map<String, List<GrammarRule>> rules;
  private int today;

  /**
   * Build the card deck from source, with each word appearing once
   */
  CardDeck(double nonCorePercent) {
    rules = new HashMap<>();
    LanguageBuilder[] builders = new LanguageBuilder[] {new GreekBuilder(), new HebrewBuilder()};
    // Put core words in one list, as we'll test on all of them, and non-core in another where we test only on some
    List<Word> core = new ArrayList<>();
    List<Word> nonCore = new ArrayList<>();
    Random rand = new Random();
    for (LanguageBuilder builder : builders) {
      List<Word> vocab = builder.buildVocabWords();
      for (Word w : vocab) {
        if (w.isCore() || rand.nextDouble() < nonCorePercent) {
          core.add(w);
        }
      }
      // Grammar words are always nonCore
      nonCore.addAll(builder.getGrammarWords());
    }
    cards = new LinkedList<>(core);
    cards.addAll(nonCore);
    for (LanguageBuilder builder : builders) {
      rules.put(builder.getLanguageName(),
          GrammarRule.getSomeGrammarRules(builder.buildRules(), (cards.size() / NUM_TO_TEST_INITIAL) / builders.length));
    }
    Collections.shuffle(cards);
    // Now need to set first day for each of the cards
    int day = 0;
    int cardsToday = 0;
    for (Word card : cards) {
      if (++cardsToday >= NUM_TO_TEST_INITIAL) {
        cardsToday = 0;
        day++;
      }
      card.setFirstDay(day);
    }
    printStatus(day);
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
    today = c.getDay();
  }

  void daily() throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    doGrammarRules(input);

    int succeeded = 0;
    int failed = 0;

    // Go through all the cards, testing each one that indicates it should be done today, removing any that are
    // completely finished
    Word card;
    SortedSet<Integer> lastDays = new TreeSet<>();
    for (Iterator<Word> iter = cards.iterator(); iter.hasNext(); ) {
      card = iter.next();
      if (card.shouldTest(today)) {
        if (card.test(input)) {
          succeeded++;
          if (card.done(today)) {
            iter.remove();
          }
        } else {
          failed++;
          card.missed(today);
        }
      }
      lastDays.add(card.lastTestDay());
    }

    System.out.println("Right:  " + succeeded);
    System.out.println("Wrong:  " + failed);
    System.out.println("Success rate:  " + ((float)succeeded / (float)(succeeded + failed)));
    printStatus(lastDays.last());
    today++;
    if (rules.isEmpty() && cards.isEmpty()) {
      System.out.println("Congratulations, you have finished the deck!");
    }
  }

  void storeDeck(String filename) throws IOException {
    ObjectMapper mapper = new ObjectMapper(new JsonFactory());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    mapper.writeValue(new File(filename), new Container()
        .setCards(cards)
        .setDay(today)
        .setRules(rules));
  }

  void findRule(String pattern) {
    for (Map.Entry<String, List<GrammarRule>> e : rules.entrySet()) {
      System.out.println(e.getKey() + " has " + e.getValue().size() + " rules");
      for (GrammarRule rule : e.getValue()) {
        if (rule.toString().contains(pattern)) rule.show();
      }
    }
  }

  void findDuplicates() {
    Map<String, Integer> counts = new HashMap<>();
    for (Word word : cards) {
      counts.putIfAbsent(word.getOther(), 0);
      counts.put(word.getOther(), counts.get(word.getOther()) + 1);
    }
    for (Map.Entry<String, Integer> e : counts.entrySet()) {
      if (e.getValue() > 1) System.out.println(e.getKey() + ": " + e.getValue());
    }
  }

  private void printStatus(int lastDay) {
    StringBuilder buf = new StringBuilder("Remaining cards: ")
        .append(cards.size())
        .append(", remaining rules: ");
    for (Map.Entry<String, List<GrammarRule>> e : rules.entrySet()) {
      buf.append(e.getKey())
          .append(": ")
          .append(e.getValue().size())
          .append(" ");
    }
    System.out.println("Best case remaining test days: " + (lastDay - today));
    System.out.println(buf);
  }

  private void doGrammarRules(BufferedReader input) throws IOException {
    // Do all of one set of rules, then all of the next
    for (Map.Entry<String, List<GrammarRule>> e : rules.entrySet()) {
      if (e.getValue().isEmpty()) continue;
      showOneGrammarRule(input, e.getKey(), e.getValue());
      return;
    }
  }

  private void showOneGrammarRule(BufferedReader input, String language, List<GrammarRule> ruleList) throws IOException {
    System.out.println("Rule for " + language);
    ruleList.get(0).show();
    input.readLine();
    ruleList.remove(0);
  }

  static class Container {
    private LinkedList<Word> cards;
    private Map<String, List<GrammarRule>> rules;
    private int day;

    public Container() {
    }

    public LinkedList<Word> getCards() {
      return cards;
    }

    public Container setCards(LinkedList<Word> cards) {
      this.cards = cards;
      return this;
    }

    public int getDay() {
      return day;
    }

    public Container setDay(int day) {
      this.day = day;
      return this;
    }

    public Map<String, List<GrammarRule>> getRules() {
      return rules;
    }

    public Container setRules(
        Map<String, List<GrammarRule>> rules) {
      this.rules = rules;
      return this;
    }
  }
}
