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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class CardDeck {
  private static final int NUM_TO_TEST = 20;

  private LinkedList<Word> initialCards;
  private LinkedList<Word> repeatCards;
  private List<Word> missedLastTime;
  private Map<String, List<GrammarRule>> rules;

  /**
   * Build the card deck from source, with each word appearing once
   */
  CardDeck() {
    rules = new HashMap<>();
    initialCards = new LinkedList<>();
    repeatCards = new LinkedList<>();
    missedLastTime = new ArrayList<>();
    LanguageBuilder[] builders = new LanguageBuilder[] {new GreekBuilder(), new HebrewBuilder()};
    for (LanguageBuilder builder : builders) {
      initialCards.addAll(builder.buildWords());
      // Have to make a copy of the rules list because Arrays.asList returns an implementation of
      // List that doesn't support remove.
      rules.put(builder.getLanguageName(), new ArrayList<>(builder.buildRules()));
    }
    Collections.shuffle(initialCards);
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
    initialCards = c.getInitialCards();
    repeatCards = c.getRepeatCards();
    missedLastTime = c.getMissedLastTime();
    rules = c.getRules();
  }

  void daily() throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    doGrammarRules(input);

    List<Word> doAgain = new ArrayList<>();
    int succeeded = 0;
    int failed = 0;
    // We will shuffle the repeatCards, do any cards we missed last time, then select NUM_TO_TEST/2 initial cards (if any are left) and up
    // to NUM_TO_TEST cards from the repeat pile.  If we successfully answer a card, it will be put back in the repeat once.  If we miss
    // it will be put back in the missedLastTime pile and in the repeat pile twice.
    List<Word> thisTime = new ArrayList<>(missedLastTime);
    missedLastTime.clear();
    Collections.shuffle(repeatCards);
    for (int i = 0; i < Math.min(NUM_TO_TEST / 2, initialCards.size()); i++) thisTime.add(initialCards.remove(i));
    for (int i = 0; i < Math.min(NUM_TO_TEST / 2, repeatCards.size()); i++) thisTime.add(repeatCards.remove(i));

    for (Word word : thisTime) {
      if (word.test(input)) {
        succeeded++;
      } else {
        missedLastTime.add(word);
        repeatCards.add(word);
      }
      repeatCards.add(word);
    }
    System.out.println("Total right: " + succeeded + ", wrong: " + failed +
        ", success rate: " + ((float)succeeded / (float)thisTime.size()));
    printStatus();
    if (rules.isEmpty()) {
      System.out.println("Congratulations, you have finished the deck!");
    }
  }

  void storeDeck(String filename) throws IOException {
    ObjectMapper mapper = new ObjectMapper(new JsonFactory());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    mapper.writeValue(new File(filename), new Container()
        .setInitialCards(initialCards)
        .setMissedLastTime(missedLastTime)
        .setRepeatCards(repeatCards)
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

  private void printStatus() {
    StringBuilder buf = new StringBuilder("Remaining initial cards: ")
        .append(initialCards.size())
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

  static class Container {
    private LinkedList<Word> initialCards;
    private LinkedList<Word> repeatCards;
    private List<Word> missedLastTime;
    private Map<String, List<GrammarRule>> rules;

    public Container() {
    }

    public Map<String, List<GrammarRule>> getRules() {
      return rules;
    }

    public Container setRules(Map<String, List<GrammarRule>> rules) {
      this.rules = rules;
      return this;
    }

    public LinkedList<Word> getInitialCards() {
      return initialCards;
    }

    public Container setInitialCards(LinkedList<Word> initialCards) {
      this.initialCards = initialCards;
      return this;
    }

    public LinkedList<Word> getRepeatCards() {
      return repeatCards;
    }

    public Container setRepeatCards(LinkedList<Word> repeatCards) {
      this.repeatCards = repeatCards;
      return this;
    }

    public List<Word> getMissedLastTime() {
      return missedLastTime;
    }

    public Container setMissedLastTime(List<Word> missedLastTime) {
      this.missedLastTime = missedLastTime;
      return this;
    }
  }
}
