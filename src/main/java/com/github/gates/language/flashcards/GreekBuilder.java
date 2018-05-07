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

import com.oracle.jrockit.jfr.ValueDefinition;

import java.util.Arrays;
import java.util.List;

import static com.github.gates.language.flashcards.Declension.*;
import static com.github.gates.language.flashcards.Gender.*;
import static com.github.gates.language.flashcards.Mood.*;
import static com.github.gates.language.flashcards.Number.*;
import static com.github.gates.language.flashcards.Other.*;
import static com.github.gates.language.flashcards.Person.*;
import static com.github.gates.language.flashcards.Tense.*;
import static com.github.gates.language.flashcards.Voice.*;

public class GreekBuilder implements LanguageBuilder {

  @Override
  public List<Word> buildWords() {
    return Arrays.asList(
        // frequency 19904
        new Word("ὁ", "the", MASCULINE, NOMINATIVE, SINGULAR),
        new Word("τοῦ", "the", MASCULINE, GENITIVE, SINGULAR),
        new Word("τῷ", "the", MASCULINE, DATIVE, SINGULAR),
        new Word("τόν", "the", MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("ὁι", "the", MASCULINE, NOMINATIVE, PLURAL),
        new Word("τῶν", "the", MASCULINE, GENITIVE, PLURAL),
        new Word("τοῖς", "the", MASCULINE, DATIVE, PLURAL),
        new Word("τούς", "the", MASCULINE, ACCUSATIVE, PLURAL),
        new Word("ἡ", "the", FEMININE, NOMINATIVE, SINGULAR),
        new Word("τῆς", "the", FEMININE, GENITIVE, SINGULAR),
        new Word("τῇ", "the", FEMININE, DATIVE, SINGULAR),
        new Word("τήν", "the", FEMININE, ACCUSATIVE, SINGULAR),
        new Word("ἁι", "the", FEMININE, NOMINATIVE, PLURAL),
        new Word("τῶν", "the", FEMININE, GENITIVE, PLURAL),
        new Word("ταῖς", "the", FEMININE, DATIVE, PLURAL),
        new Word("τάς", "the", FEMININE, ACCUSATIVE, PLURAL),
        new Word("τό", "the", NEUTER, NOMINATIVE, SINGULAR),
        new Word("τοῦ", "the", NEUTER, GENITIVE, SINGULAR),
        new Word("τῷ", "the", NEUTER, DATIVE, SINGULAR),
        new Word("τό", "the", NEUTER, ACCUSATIVE, SINGULAR),
        new Word("τά", "the", NEUTER, NOMINATIVE, PLURAL),
        new Word("τῶν", "the", NEUTER, GENITIVE, PLURAL),
        new Word("τοῖς", "the", NEUTER, DATIVE, PLURAL),
        new Word("τά", "the", NEUTER, ACCUSATIVE, PLURAL),
        // 9164
        new Word("καί", "and"),
        // 5601
        new Word("αὐτός", "he"),
        new Word("αὐτή", "she"),
        new Word("αὐτό", "it"),
        // 4440
        new Word("ἔλυσα", "I loosened", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("ἔλυσας", "you loosened", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἔλυσε", "s/he loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἐλύσαμεν", "we loosened", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("ἐλύσατε", "you loosened", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("ἔλυσαν", "they loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),
        new Word("ἔβαλον", "I threw", INDICATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("ἔβαλες", "you threw", INDICATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἔβαλε", "s/he threw", INDICATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἐβάλομεν", "we threw", INDICATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("ἐβάλετε", "you threw", INDICATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("ἔβαλον", "they threw", INDICATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),
        // 4070
        new Word("λύω", "I loosen", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύεις", "you loosen", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύει", "s/he loosens", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λύομεν", "we loosen", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύετε", "you loosen", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύουσι", "they loosen", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),
        new Word("λύουσιν", "they loosen", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),
        // 2913
        new Word("συ", "you", NOMINATIVE, SINGULAR),
        new Word("σου", "your", GENITIVE, SINGULAR),
        new Word("σοι", "you", DATIVE, SINGULAR),
        new Word("σε", "you", ACCUSATIVE, SINGULAR),
        new Word("ὑμεις", "you", NOMINATIVE, PLURAL),
        new Word("ὑμων", "your", GENITIVE, PLURAL),
        new Word("ὑμιν", "you", DATIVE, PLURAL),
        new Word("ὑμας", "you", ACCUSATIVE, PLURAL),
        // 2801
        new Word("δε", "weak but/yet, and"),
        // 2757
        new Word("ἐν dative", "in"),
        // 2666
        new Word("ἐγώ", "I", NOMINATIVE, SINGULAR),
        new Word("μου", "my", GENITIVE, SINGULAR),
        new Word("εμου", "my", GENITIVE, SINGULAR, EMPHATIC),
        new Word("μοι", "me", DATIVE, SINGULAR),
        new Word("εμοι", "me", DATIVE, SINGULAR, EMPHATIC),
        new Word("με", "me", ACCUSATIVE, SINGULAR),
        new Word("εμε", "me", ACCUSATIVE, SINGULAR, EMPHATIC),
        new Word("ἡμεις", "we", NOMINATIVE, PLURAL),
        new Word("ἡμων", "our", GENITIVE, PLURAL),
        new Word("ἡμιν", "us", DATIVE, PLURAL),
        new Word("ἡμας", "us", ACCUSATIVE, PLURAL),
        // 2656
        new Word("οὐ", "not", INDICATIVE),
        new Word("οὐκ", "not", INDICATIVE),
        new Word("οὐχ", "not", INDICATIVE),
        new Word("μη", "not", IMPERATIVE, OPTATIVE, SUBJUNCTIVE, PARTICIPLE),
        // 2590
        new Word("λύων", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λύοντος", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, GENITIVE, SINGULAR),
        new Word("λύοντι", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, SINGULAR),
        new Word("λύοντα", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("λύοντες", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λύοντων", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, GENITIVE, PLURAL),
        new Word("λύουσι", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, PLURAL),
        new Word("λύουσιν", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, PLURAL),
        new Word("λύοντας", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λύουσα", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λυούσης", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, GENITIVE, SINGULAR),
        new Word("λυούσῃ", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, DATIVE, SINGULAR),
        new Word("λύουσαν", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λύουσαι", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, PLURAL),
        new Word("λυουσῶν", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, GENITIVE, PLURAL),
        new Word("λυούσαις", "looseninp", PARTICIPLE, ACTIVE, PRESENT, FEMININE, DATIVE, PLURAL),
        new Word("λυούσας", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, ACCUSATIVE, PLURAL),
        new Word("λῦον", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, SINGULAR),
        new Word("λύοντος", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, GENITIVE, SINGULAR),
        new Word("λύοντι", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, SINGULAR),
        new Word("λῦον", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("λύοντα", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, PLURAL),
        new Word("λύοντων", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, GENITIVE, PLURAL),
        new Word("λύουσι", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, PLURAL),
        new Word("λύουσιν", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, PLURAL),
        new Word("λύοντα", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, ACCUSATIVE, PLURAL),
        // 2462
        new Word("εἰμί", "I am", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("εἶ", "you are", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("ἐστίν", "s/he is", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("ἐσμέν", "we are", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("ἐστέ", "you are", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("εἰσίν", "they are", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),
        new Word("εσομαι", "I will be εἰμί", INDICATIVE, ACTIVE, FUTURE, FIRST_PERSON, SINGULAR),
        new Word("ἦν", "s/he was", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        // 2357
        new Word("λεγω", "I say", ACTIVE, PRESENT),
        new Word("ερω", "I will say λεγω", ACTIVE, FUTURE),
        new Word("ειπον", "I said λεγω", ACTIVE, AORIST),
        new Word("ειρηκα", "I have said λεγω", ACTIVE, PERFECT),
        new Word("ειρημαι", "I have been said λεγω", MIDDLE, PERFECT),
        new Word("ειρημαι", "I have been said λεγω", PASSIVE, PERFECT),
        new Word("ερρεθην", "I was said λεγω", PASSIVE, AORIST),
        // 1768
        new Word("εἰς accusative", "into"),
    /*


        */
        new Word("λύω", "I might loosen", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),

        new Word("λύετε", "loosen!", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL)

    );
  }

  @Override
  public List<GrammarRule> buildRules() {
    return Arrays.asList(
    new GrammarRule("First noun rule:  Stems ending in α or η are in the first declension, stems ending in ο are in the second, and consonantal stems are in the third."),
    new GrammarRule("Second noun rule: Every neuter word has the same form in the nominative and accusative."),
    new GrammarRule("Third noun rule: Almost all neuter words end in α in the nominative and accusative plural."),
    new GrammarRule("Fourth noun rule: In the dative singular, the ι subscripts if possible."),
    new GrammarRule("Fifth noun rule: Vowels often change their length ('ablaut’)."),
    new GrammarRule("Sixth noun rule: In the genitive and dative, the masculine and neuter will always be identical."),
    new GrammarRule("Seventh noun rule: Square of stops (see below)"),
    new GrammarRule("Eighth noun rule: A tau cannot stand at the end of the word and will drop off")
    );
  }
}
