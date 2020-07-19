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

public class Word {
  private String english;
  private String other;
  private Classifier[] classifiers;

  // For Jackson
  public Word() {
  }

  public Word(String other, String english, Classifier... classifiers) {
    this.english = english;
    this.other = other;
    this.classifiers = classifiers;
  }

  boolean test(BufferedReader input) throws IOException {
    showFront();
    input.readLine();
    flipOver();
    System.out.println("Success?[y]");
    String answer = input.readLine();
    return (answer.length() == 0 || answer.toLowerCase().startsWith("y"));
  }

  public String getEnglish() {
    return english;
  }

  public Word setEnglish(String english) {
    this.english = english;
    return this;
  }

  public String getOther() {
    return other;
  }

  public Word setOther(String other) {
    this.other = other;
    return this;
  }

  public Classifier[] getClassifiers() {
    return classifiers;
  }

  public Word setClassifiers(Classifier[] classifiers) {
    this.classifiers = classifiers;
    return this;
  }

  private void showFront() {
    System.out.println(other);
  }

  private void flipOver() {
    StringBuilder buf = new StringBuilder(other)
        .append(" : ")
        .append(english)
        .append(" - ");
    boolean first = true;
    for (Classifier classifier : classifiers) {
      if (first) first = false;
      else buf .append(", ");
      buf.append(classifier.name().toLowerCase().replace('_', ' '));
    }
    System.out.println(buf.toString());
  }
}
