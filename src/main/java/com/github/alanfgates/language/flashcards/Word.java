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

public class Word implements Serializable {
  public enum Competence { STRONG, OK, WEAK, ZERO };

  // Flashcards can have more than one word due to homonyms or because one conjugation may represent multiple tenses, moods, etc.
  private List<WordForm> wordForms;
  private int needToGetRight;
  private Competence competence;
  private String comment;


  // For Jackson
  public Word() {
  }

  Word(WordForm word, Competence competence) {
    this(word, competence, null);
  }

  Word(WordForm word, Competence competence, String comment) {
    this.wordForms = new ArrayList<>();
    wordForms.add(word);
    needToGetRight = 1;
    this.competence = competence;
    this.comment = comment;
  }

  Word addForm(WordForm word) {
    wordForms.add(word);
    return this;
  }

  boolean test(BufferedReader input) throws IOException {
    int index = RandomGenerator.get().getRandom(wordForms.size());
    wordForms.get(index).showFront();
    input.readLine();
    wordForms.get(index).flipOver();
    if (comment != null) System.out.println(comment);
    if (wordForms.size() > 1) {
      System.out.println("Other forms of the word:");
      for (WordForm form : wordForms) form.flipOver();
    }
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

  public List<WordForm> getWordForms() {
    return wordForms;
  }

  public void setWordForms(List<WordForm> wordForms) {
    this.wordForms = wordForms;
  }

  public int getNeedToGetRight() {
    return needToGetRight;
  }

  public Word setNeedToGetRight(int needToGetRight) {
    this.needToGetRight = needToGetRight;
    return this;
  }

  public Competence getCompetence() {
    return competence;
  }

  public void setCompetence(Competence competence) {
    this.competence = competence;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}
