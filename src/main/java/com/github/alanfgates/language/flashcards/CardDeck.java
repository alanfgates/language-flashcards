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

import java.io.BufferedReader;
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
import java.util.Random;

class CardDeck implements Serializable {

  private LinkedList<Flashcard> cards;
  private LinkedList<GrammarRule> rules;

  CardDeck() {
    Map<String, Flashcard> m = new HashMap<>();
    rules = new LinkedList<>();
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
      rules.addAll(builder.buildRules());
    }
    cards = new LinkedList<>(m.values());
    Collections.shuffle(cards);
    Collections.shuffle(rules);
    System.out.println("Found a total of " + cards.size() + " words and " + rules.size() + " rules");
  }

  CardDeck(String filename) throws IOException, ClassNotFoundException {
    ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
    cards = (LinkedList<Flashcard>)in.readObject();
    rules = (LinkedList<GrammarRule>)in.readObject();
    in.close();
  }

  void daily(int numToTest) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 2 && rules.size() > 0; i++) {
      GrammarRule rule = rules.get(new Random().nextInt(rules.size()));
      rule.show();
      input.readLine();
      rules.remove(rule);
    }
    
    if (rules.size() == 0) {
      System.out.println("Done with the rules\n");
    }

    List<Flashcard> doAgain = new ArrayList<>();
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
    System.out.println("Total right: " + succeeded + ", wrong: " + failed);
    System.out.println("Remaining cards: " + cards.size() + ", remaining rules: " + rules.size());
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

}
