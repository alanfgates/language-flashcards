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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Word {
  private String other;
  private List<Form> forms;
  private boolean repeatable; // Indicates it should be put in the repeat pile even when it succeeds

  // For Jackson
  public Word() {
  }

  Word(String other, String english, Classifier... classifiers) {
    this.other = other;
    forms = Collections.singletonList(new Form(english, classifiers));
  }

  Word(String other) {
    this.other = other;
    forms = new ArrayList<>();
  }

  Word addForm(String english, Classifier... classifiers) {
    forms.add(new Form(english, classifiers));
    return this;
  }

  public boolean isRepeatable() {
    return repeatable;
  }

  public Word setRepeatable(boolean repeatable) {
    this.repeatable = repeatable;
    return this;
  }

  boolean test(BufferedReader input) throws IOException {
    showFront();
    input.readLine();
    flipOver();
    System.out.println("Success?[y]");
    String answer = input.readLine();
    return (answer.length() == 0 || answer.toLowerCase().startsWith("y"));
  }

  public String getOther() {
    return other;
  }

  public Word setOther(String other) {
    this.other = other;
    return this;
  }

  public List<Form> getForms() {
    return forms;
  }

  public Word setForms(List<Form> forms) {
    this.forms = forms;
    return this;
  }

  private void showFront() {
    System.out.println(other);
  }

  private void flipOver() {
    StringBuilder buf = new StringBuilder(other)
        .append(" :\n");
    for (Form form : forms) {
      buf.append(form.english)
          .append(" - ");
      boolean first = true;
      for (Classifier classifier : form.classifiers) {
        if (first) first = false;
        else buf .append(", ");
        buf.append(classifier.name().toLowerCase().replace('_', ' '));
      }
      buf.append("\n");
    }
    System.out.println(buf.toString());
  }

  private static class Form {
    String english;
    Classifier[] classifiers;

    public Form() {

    }

    Form(String english, Classifier[] classifiers) {
      this.english = english;
      this.classifiers = classifiers;
    }

    public String getEnglish() {
      return english;
    }

    public Form setEnglish(String english) {
      this.english = english;
      return this;
    }

    public Classifier[] getClassifiers() {
      return classifiers;
    }

    public Form setClassifiers(Classifier[] classifiers) {
      this.classifiers = classifiers;
      return this;
    }
  }
}
