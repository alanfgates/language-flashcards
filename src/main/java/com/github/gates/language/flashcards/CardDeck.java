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
package com.github.gates.language.flashcards;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardDeck implements Serializable {

  private Deque<Flashcard> cards;

  public CardDeck() {
    Map<String, Flashcard> m = new HashMap<>();
    for (Word w : GreekBuilder.buildGreek()) {
      Flashcard f = m.get(w.other);
      if (f == null) {
        f = new Flashcard(w);
        m.put(w.other, f);
      } else {
        f.addWord(w);
      }
    }
    List<Flashcard> tmp = new ArrayList<>(m.values());
    Collections.shuffle(tmp);
    cards = new ArrayDeque<>(tmp);
  }

  public void daily(int numToTest) throws IOException {
    List<Flashcard> missed = new ArrayList<>();
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < numToTest && !cards.isEmpty(); i++) {
      Flashcard f = cards.pop();
      if (!f.test(input)) {
        missed.add(f);
      }
    }
    // Put back the ones we missed so we see them tomorrow.
    for (Flashcard f : missed) cards.push(f);
    if (cards.isEmpty()) {
      System.out.println("Congratulations, you have finished the deck!");
    }
  }

  public static void storeDeck(String filename, CardDeck deck) throws IOException {
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
    out.writeObject(deck);
    out.close();
  }

  public static CardDeck readDeck(String filename) throws IOException, ClassNotFoundException {
    ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
    return (CardDeck)in.readObject();
  }
}
