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

public class GreekNoun extends Noun {
  public final Declension declension;

  private GreekNoun(String english, String other, Gender gender, Number number,
                    Declension declension) {
    super(english, other, gender, number);
    this.declension = declension;
  }

  @Override
  public Enum[] getModifiers() {
    return new Enum[] {gender, declension, number};
  }

  public static GreekNounBuilder builder() {
    return new GreekNounBuilder();
  }

  public static class GreekNounBuilder {
    private String english, greek;
    private Gender gender;
    private Number number;
    private Declension declension;

    public GreekNounBuilder english(String english) {
      this.english = english;
      return this;
    }

    public GreekNounBuilder greek(String greek) {
      this.greek = greek;
      return this;
    }

    public GreekNounBuilder masculine() {
      this.gender = Gender.MASCULINE;
      return this;
    }

    public GreekNounBuilder feminine() {
      this.gender = Gender.FEMININE;
      return this;
    }

    public GreekNounBuilder neuter() {
      this.gender = Gender.NEUTER;
      return this;
    }

    public GreekNounBuilder singular() {
      this.number = Number.SINGULAR;
      return this;
    }

    public GreekNounBuilder plural() {
      this.number = Number.PLURAL;
      return this;
    }

    public GreekNounBuilder nominative() {
      this.declension = Declension.NOMINATIVE;
      return this;
    }

    public GreekNounBuilder genitive() {
      this.declension = Declension.GENITIVE;
      return this;
    }

    public GreekNounBuilder dative() {
      this.declension = Declension.DATIVE;
      return this;
    }

    public GreekNounBuilder accusative() {
      this.declension = Declension.ACCUSATIVE;
      return this;
    }

    public GreekNoun build() {
      if (english == null || greek == null) {
        throw new RuntimeException("Have to provide at least English and Greek silly");
      }
      return new GreekNoun(english, greek, gender, number, declension);
    }
  }
}
