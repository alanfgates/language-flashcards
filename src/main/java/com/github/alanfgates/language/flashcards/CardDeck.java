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
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
    cards = (LinkedList<Flashcard>)in.readObject();
    rules = (Map<String, List<GrammarRule>>)in.readObject();
    in.close();
  }

  // Temporary, to convert to Yaml
  static void convertToYaml() throws IOException, ClassNotFoundException {

    LanguageBuilder[] languages = new LanguageBuilder[] {new HebrewBuilder(), new GreekBuilder()};
    for (LanguageBuilder language : languages) {
      File cardFile = new File(".", language.getLanguageName() + "-cards.yaml");
      File ruleFile = new File(".", language.getLanguageName() + "-rules.yaml");
      WordContainer words = new WordContainer(language.buildWords());
      GrammarRuleContainer rules = new GrammarRuleContainer(language.buildRules());
      ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
      mapper.writeValue(cardFile, words);
      mapper.writeValue(ruleFile, rules);
    }

    // Write out the cards

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
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
    out.writeObject(cards);
    out.writeObject(rules);
    out.close();
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

  static class WordContainer {
    List<Word> words;

    public WordContainer(List<Word> words) {
      this.words = words;
    }

    public List<Word> getWords() {
      return words;
    }

    public void setWords(List<Word> words) {
      this.words = words;
    }
  }

  static class GrammarRuleContainer {
    List<GrammarRule> rules;

    public GrammarRuleContainer(List<GrammarRule> rules) {
      this.rules = rules;
    }

    public List<GrammarRule> getRules() {
      return rules;
    }

    public GrammarRuleContainer setRules(List<GrammarRule> rules) {
      this.rules = rules;
      return this;
    }
  }

}
