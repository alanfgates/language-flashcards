/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class CardDeck implements Serializable {

  private LinkedList<Flashcard> cards;
  private Map<String, List<GrammarRule>> rules;

  CardDeck() {
    Map<String, Flashcard> m = new HashMap<>();
    rules = new HashMap<>();
    LanguageBuilder[] builders = new LanguageBuilder[] {new GreekBuilder(), new HebrewBuilder()};
    for (LanguageBuilder builder : builders) {
      for (Word w : builder.buildWords()) {
        Flashcard f = m.get(w.other);
        if (f == null) {
          f = new Flashcard(w);
          m.put(w.other, f);
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
    printStatus();
  }

  CardDeck(String filename) throws IOException, ClassNotFoundException {
    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
    ObjectReader reader = mapper.readerFor(Container.class);
    Container c = reader.readValue(new File(filename));
    cards = c.getCards();
    rules = c.getRules();
  }

  void daily(int numToTest) throws IOException {
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
    System.out.println("Total right: " + succeeded + ", wrong: " + failed +
        ", success rate: " + ((float)succeeded / (float)numToTest) + 
        ", cards finished: " + (initialSize - cards.size()));
    printStatus();
    if (cards.isEmpty()) {
      System.out.println("Congratulations, you have finished the deck!");
    }
  }

  void storeDeck(String filename) throws IOException {
    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
    mapper.writeValue(new File(filename), new Container(cards, rules));
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

  static class Container {
    LinkedList<Flashcard> cards;
    Map<String, List<GrammarRule>> rules;

    public Container() {
    }

    Container(LinkedList<Flashcard> cards, Map<String, List<GrammarRule>> rules) {
      this.cards = cards;
      this.rules = rules;
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
  }
}
