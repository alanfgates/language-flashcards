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

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Word implements Serializable {
  private String english;
  String other;
  private Enum[] modifiers;

  // For Jackson
  public Word() {
  }

  Word(String other, String english, Enum... modifiers) {
    this.english = english;
    this.other = other;
    this.modifiers = modifiers;
  }

  void showFront() {
    System.out.println(other);
  }

  final void flipOver() {
    StringBuilder buf = new StringBuilder(english)
        .append(" ");
    for (Enum modifier : modifiers) {
      buf.append(modifier.name().toLowerCase())
          .append(' ');
    }
    System.out.println(buf.toString());
  }

  // Following all for YAML
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
  public Map<String, String> getModifiers() {
    Map<String, String> modStrs = new HashMap<>();
    for (Enum modifer : modifiers) modStrs.put(modifer.getClass().getSimpleName(), modifer.name());
    return modStrs;
  }

  public void setModifiers(Map<String, String> modStrs) {
    this.modifiers = new Enum[modStrs.size()];
    int i = 0;
    for (Map.Entry<String, String> e : modStrs.entrySet()) {
      if (e.getKey().equals("Declension")) {
        modifiers[i++] = Declension.valueOf(e.getValue());
      } else if (e.getKey().equals("Gender")) {
        modifiers[i++] = Gender.valueOf(e.getValue());
      } else if (e.getKey().equals("Mood")) {
        modifiers[i++] = Mood.valueOf(e.getValue());
      } else if (e.getKey().equals("Number")) {
        modifiers[i++] = Number.valueOf(e.getValue());
      } else if (e.getKey().equals("Other")) {
        modifiers[i++] = Other.valueOf(e.getValue());
      } else if (e.getKey().equals("PartOfSpeech")) {
        modifiers[i++] = PartOfSpeech.valueOf(e.getValue());
      } else if (e.getKey().equals("Person")) {
        modifiers[i++] = Person.valueOf(e.getValue());
      } else if (e.getKey().equals("Tense")) {
        modifiers[i++] = Tense.valueOf(e.getValue());
      } else if (e.getKey().equals("VerbRoot")) {
        modifiers[i++] = VerbRoot.valueOf(e.getValue());
      } else if (e.getKey().equals("Voice")) {
        modifiers[i++] = Voice.valueOf(e.getValue());
      } else {
        throw new RuntimeException("Unknown modifier type " + e.getKey());
      }
    }
  }
}
