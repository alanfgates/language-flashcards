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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Word implements Serializable {
  private static final Map<Class<? extends Enum>, Integer> modifierOrder = new HashMap<>();

  static {
    modifierOrder.put(PartOfSpeech.class, 1);
    modifierOrder.put(VerbRoot.class, 2);
    modifierOrder.put(Mood.class, 3);
    modifierOrder.put(Voice.class, 4);
    modifierOrder.put(Tense.class, 5);
    modifierOrder.put(Person.class, 6);
    modifierOrder.put(Gender.class, 7);
    modifierOrder.put(Declension.class, 8);
    modifierOrder.put(Number.class, 9);
    modifierOrder.put(Other.class, 10);
  }

  private String english;
  private String other;
  private Enum[] modifiers;

  // For Jackson
  public Word() {
  }

  public Word(String other, String english, Enum... modifiers) {
    this.english = english;
    this.other = other;
    this.modifiers = modifiers;
  }

  void showFront() {
    System.out.println(other);
  }

  final void flipOver() {
    StringBuilder buf = new StringBuilder(english)
        .append(" - ");
    boolean first = true;
    for (Enum modifier : modifiers) {
      if (first) first = false;
      else buf .append(", ");
      buf.append(modifier.name().toLowerCase().replace('_', ' '));
    }
    System.out.println(buf.toString());
  }

  // Following all for Jackson
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

  // This is nasty and hackish, but if I return a straight Enum[] Jackson balks on the set side because there's no
  // default constructor for Enum.  I could mash all the modifiers together into one Enum, but I like separating them out.
  public Map<String, List<String>> getModifiers() {
    Map<String, List<String>> modStrs = new HashMap<>();
    for (Enum modifer : modifiers) {
      List<String> mods = modStrs.computeIfAbsent(modifer.getClass().getSimpleName(), m -> new ArrayList<>());
      mods.add(modifer.name());
    }
    return modStrs;
  }

  public void setModifiers(Map<String, List<String>> modStrs) {
    int size = 0;
    for (List<String> list : modStrs.values()) size += list.size();
    this.modifiers = new Enum[size];
    int i = 0;
    for (Map.Entry<String, List<String>> e : modStrs.entrySet()) {
      for (String s : e.getValue()) {
        if (e.getKey().equals("Declension")) {
          modifiers[i++] = Declension.valueOf(s);
        } else if (e.getKey().equals("Gender")) {
          modifiers[i++] = Gender.valueOf(s);
        } else if (e.getKey().equals("Mood")) {
          modifiers[i++] = Mood.valueOf(s);
        } else if (e.getKey().equals("Number")) {
          modifiers[i++] = Number.valueOf(s);
        } else if (e.getKey().equals("Other")) {
          modifiers[i++] = Other.valueOf(s);
        } else if (e.getKey().equals("PartOfSpeech")) {
          modifiers[i++] = PartOfSpeech.valueOf(s);
        } else if (e.getKey().equals("Person")) {
          modifiers[i++] = Person.valueOf(s);
        } else if (e.getKey().equals("Tense")) {
          modifiers[i++] = Tense.valueOf(s);
        } else if (e.getKey().equals("VerbRoot")) {
          modifiers[i++] = VerbRoot.valueOf(s);
        } else if (e.getKey().equals("Voice")) {
          modifiers[i++] = Voice.valueOf(s);
        } else {
          throw new RuntimeException("Unknown modifier type " + e.getKey());
        }
      }
    }

    Arrays.sort(modifiers, Comparator.comparingInt(o -> modifierOrder.get(o.getClass())));
  }

}
