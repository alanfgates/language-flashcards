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

public enum Classifier {
  // Order here matters, as we want to present these classifiers in a certain order
  NOUN, ADJECTIVE, ADVERB, CONSTRUCT, VERB, PARTICLE, PRONOMINAL_SUFFIX,  // Parts of speech
  QAL, HIPHIL, HITHPAEL, HOPHAL, NIPHAL, PIEL, PUAL,      // Verb roots
  INDICATIVE, SUBJUNCTIVE, IMPERATIVE, INFINITIVE, INFINITIVE_CONSTRUCT, INFINITIVE_ABSOLUTE, PARTICIPLE, OPTATIVE,  // Mood
  ACTIVE, MIDDLE, PASSIVE, // Voice
  PRESENT, FUTURE, SECOND_FUTURE, AORIST, SECOND_AORIST, PERFECT, IMPERFECT, PLUPERFECT, SECOND_PERFECT, JUSSIVE, COHORTATIVE, ROOT, // Tense
  FIRST_PERSON, SECOND_PERSON, THIRD_PERSON, // Person
  MASCULINE, FEMININE, NEUTER, // Gender
  NOMINATIVE, VOCATIVE, GENITIVE, DATIVE, ACCUSATIVE, // Declension
  SINGULAR, PLURAL, DUAL, // Number
  EMPHATIC, DEPONENT, FIRST_DECLENSION, SECOND_DECLENSION, THIRD_DECLENSION, SUFFIX, ATHEMATIC, // Random leftovers

}
