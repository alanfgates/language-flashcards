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
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Flashcard implements Serializable {
  final private List<Word> words;

  public Flashcard(Word word) {
    this.words = new ArrayList<>();
    words.add(word);
  }

  public void addWord(Word word) {
    words.add(word);
  }

  public boolean test(BufferedReader input) throws IOException {
    words.get(0).showFront();
    input.readLine();
    for (Word word : words) word.flipOver();
    System.out.println("Success?");
    String answer = input.readLine();
    return answer.length() > 0 && answer.toLowerCase().startsWith("y");

  }
}
