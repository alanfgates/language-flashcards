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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Flashcard implements Serializable {
  // Flashcards can have more than one word due to homonyms or because one conjugation may represent multiple tenses, moods, etc.
  private List<Word> words;
  private int needToGetRight;

  // For Jackson
  public Flashcard() {
  }

  Flashcard(Word word) {
    this.words = new ArrayList<>();
    words.add(word);
    needToGetRight = 1;
  }

  void addWord(Word word) {
    words.add(word);
  }

  boolean test(BufferedReader input) throws IOException {
    words.get(0).showFront();
    input.readLine();
    for (Word word : words) word.flipOver();
    System.out.println("Success?[y]");
    String answer = input.readLine();
    if (answer.length() == 0 || answer.toLowerCase().startsWith("y")) {
      needToGetRight--;
      return true;
    } else {
      needToGetRight++;
      return false;
    }
  }

  boolean needToDoAgain() {
    return needToGetRight > 0;
  }

  public List<Word> getWords() {
    return words;
  }

  public void setWords(List<Word> words) {
    this.words = words;
  }

  public int getNeedToGetRight() {
    return needToGetRight;
  }

  public Flashcard setNeedToGetRight(int needToGetRight) {
    this.needToGetRight = needToGetRight;
    return this;
  }
}
