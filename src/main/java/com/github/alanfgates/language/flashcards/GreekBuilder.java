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

import java.util.Arrays;
import java.util.List;

import static com.github.alanfgates.language.flashcards.Declension.*;
import static com.github.alanfgates.language.flashcards.Gender.*;
import static com.github.alanfgates.language.flashcards.Mood.*;
import static com.github.alanfgates.language.flashcards.Number.*;
import static com.github.alanfgates.language.flashcards.Other.*;
import static com.github.alanfgates.language.flashcards.Person.*;
import static com.github.alanfgates.language.flashcards.PartOfSpeech.*;
import static com.github.alanfgates.language.flashcards.Voice.*;
import static com.github.alanfgates.language.flashcards.Tense.*;

public class GreekBuilder implements LanguageBuilder {

  @Override
  public String getLanguageName() {
    return "Greek";
  }

  @Override
  public List<Word> buildWords() {
    return Arrays.asList(
        //----------------------------------------------------------------------------------------
        // VERB FORMS
        //
        // Indicative Active Present
        new Word("λύω", "I loosen", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύεις", "you loosen", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύει", "s/he loosens", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λύομεν", "we loosen", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύετε", "you loosen", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύουσι", "they loosen", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),
        new Word("λύουσιν", "they loosen", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),
        //
        /*
        // Indicative Active Aorist
        new Word("ἔλυσα", "I loosened", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("ἔλυσας", "you loosened", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἔλυσε", "s/he loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἐλύσαμεν", "we loosened", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("ἐλύσατε", "you loosened", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("ἔλυσαν", "they loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),
        //
        // Indicative Active Second Aorist
        new Word("ἔβαλον", "I threw", INDICATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("ἔβαλες", "you threw", INDICATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἔβαλε", "s/he threw", INDICATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἐβάλομεν", "we threw", INDICATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("ἐβάλετε", "you threw", INDICATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("ἔβαλον", "they threw", INDICATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Indicative Active Imperfect
        new Word("ἔλυον", "I was loosening", INDICATIVE, ACTIVE, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("ἔλυες", "you were loosening", INDICATIVE, ACTIVE, IMPERFECT, SECOND_PERSON, SINGULAR),
        new Word("ἔλυε", "s/he was loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἔλυεν", "s/he was loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἐλύομεν", "we were loosening", INDICATIVE, ACTIVE, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("ἐλύετε", "you were loosening", INDICATIVE, ACTIVE, IMPERFECT, SECOND_PERSON, PLURAL),
        new Word("ἔλυον", "they were loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, PLURAL),
        */

        // Indicative Active Future
        new Word("λύσω", "I will loosen", INDICATIVE, ACTIVE, FUTURE, FIRST_PERSON, SINGULAR),
        new Word("λύσεις", "you will loosen", INDICATIVE, ACTIVE, FUTURE, SECOND_PERSON, SINGULAR),
        new Word("λύσει", "s/he will loosen", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, SINGULAR),
        new Word("λύσομεν", "we will loosen", INDICATIVE, ACTIVE, FUTURE, FIRST_PERSON, PLURAL),
        new Word("λύσετε", "you will loosen", INDICATIVE, ACTIVE, FUTURE, SECOND_PERSON, PLURAL),
        new Word("λύσουσι", "they will loosen", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, PLURAL),
        new Word("λύσουσιν", "they will loosen", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, PLURAL),

        // Indicative Middle Present
        new Word("λύομαι", "I loosen myself", INDICATIVE, MIDDLE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύῃ", "you loosen yourself", INDICATIVE, MIDDLE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύεται", "s/he loosens him/herself", INDICATIVE, MIDDLE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυόμεθα", "we loosen ourselves", INDICATIVE, MIDDLE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύεσθε", "you loosen yourselves", INDICATIVE, MIDDLE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύονται", "they loosen themselves", INDICATIVE, MIDDLE, PRESENT, THIRD_PERSON, PLURAL),

        // Indicative Middle Future
        new Word("λύσομαι", "I will loosen myself", INDICATIVE, MIDDLE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύσῃ", "you will loosen yourself", INDICATIVE, MIDDLE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύσεται", "s/he will loosen him/herself", INDICATIVE, MIDDLE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυσόμεθα", "we will loosen ourselves", INDICATIVE, MIDDLE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύσεσθε", "you will loosen yourselves", INDICATIVE, MIDDLE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύσονται", "they will loosen themselves", INDICATIVE, MIDDLE, PRESENT, THIRD_PERSON, PLURAL),

        // Indicative Passive Present
        new Word("λύομαι", "I was loosened", INDICATIVE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύῃ", "you were loosened", INDICATIVE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύεται", "s/he was loosened", INDICATIVE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυόμεθα", "we were loosened", INDICATIVE, PASSIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύεσθε", "you were loosened", INDICATIVE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύονται", "they were loosened", INDICATIVE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL),

        /*
        // Subjunctive active present
        new Word("λύω", "I might loosen", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύῃ", "s/he might loosen", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),

        // Subjunctive active aorist
        new Word("λύσω", "I might loosen", SUBJUNCTIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR),

        // Subjunctive middle present
        new Word("λύῃ", "you might loosen yourself", SUBJUNCTIVE, MIDDLE, PRESENT, SECOND_PERSON, SINGULAR),

        // Subjunctive passive present
        new Word("λύῃ", "you might be loosened", SUBJUNCTIVE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR),

        // Imperative active present
        new Word("λύετε", "loosen!", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),

        // Imperative middle present
        new Word("λύεσθε", "loosen yourselves!", IMPERATIVE, MIDDLE, PRESENT, SECOND_PERSON,
            PLURAL),

        // Imperative passive present
        new Word("λύεσθε", "be loosened!", IMPERATIVE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),

        // Participle active present
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
        // Participle active aorist
        new Word("λύσας", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λύσαντος", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, GENITIVE, SINGULAR),
        new Word("λύσαντι", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, DATIVE, SINGULAR),
        new Word("λύσαντα", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("λύσαντες", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λυσάντων", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, GENITIVE, PLURAL),
        new Word("λύσασι", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, DATIVE, PLURAL),
        new Word("λύσασιν", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, DATIVE, PLURAL),
        new Word("λύσαντας", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λύσασα", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λυσάσης", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, GENITIVE, SINGULAR),
        new Word("λυσάσῃ", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, DATIVE, SINGULAR),
        new Word("λύσασαν", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λύσασαι", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, NOMINATIVE, PLURAL),
        new Word("λυσασῶν", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, GENITIVE, PLURAL),
        new Word("λυσάσαις", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, DATIVE, PLURAL),
        new Word("λυσάσας", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, ACCUSATIVE, PLURAL),
        new Word("λῦσαν", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, NOMINATIVE, SINGULAR),
        new Word("λύσαντος", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, GENITIVE, SINGULAR),
        new Word("λύσαντι", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, DATIVE, SINGULAR),
        new Word("λῦσαν", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("λύσαντα", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, NOMINATIVE, PLURAL),
        new Word("λυσάντων", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, GENITIVE, PLURAL),
        new Word("λύσασι", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, DATIVE, PLURAL),
        new Word("λύσασιν", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, DATIVE, PLURAL),
        new Word("λύσαντα", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, ACCUSATIVE, PLURAL),

        // Participle active second aorist
        new Word("βαλών", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("βαλόντος", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, GENITIVE, SINGULAR),
        new Word("βαλόντι", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, DATIVE, SINGULAR),
        new Word("βαλόντα", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("βαλόντες", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, NOMINATIVE, PLURAL),
        new Word("βαλόντων", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, GENITIVE, PLURAL),
        new Word("βαλοῦσι", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, DATIVE, PLURAL),
        new Word("βαλοῦσιν", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, DATIVE, PLURAL),
        new Word("βαλόντας", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("βαλοῦσα", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, NOMINATIVE, SINGULAR),
        new Word("βαλούσης", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, GENITIVE, SINGULAR),
        new Word("βαλούσῃ", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, DATIVE, SINGULAR),
        new Word("βαλοῦσαν", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("βαλοῦσαι", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, NOMINATIVE, PLURAL),
        new Word("βαλουσῶν", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, GENITIVE, PLURAL),
        new Word("βαλούσαις", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, DATIVE, PLURAL),
        new Word("βαλούσας", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, ACCUSATIVE, PLURAL),
        new Word("βαλόν", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, NOMINATIVE, SINGULAR),
        new Word("βαλόντος", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, GENITIVE, SINGULAR),
        new Word("βαλόντι", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, DATIVE, SINGULAR),
        new Word("βαλόν", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("βαλόντα", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, NOMINATIVE, PLURAL),
        new Word("βαλόντων", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, GENITIVE, PLURAL),
        new Word("βαλοῦσι", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, DATIVE, PLURAL),
        new Word("βαλοῦσιν", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, DATIVE, PLURAL),
        new Word("βαλόντα", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, ACCUSATIVE, PLURAL),
        */

        //
        //----------------------------------------------------------------------------------------
        // VOCABULARY, with frequency noted in comments
        // 19904
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
        // 2462
        new Word("εἰμί", "I am", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("εἶ", "you are", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("ἐστίν", "s/he is", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("ἐσμέν", "we are", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("ἐστέ", "you are", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("εἰσίν", "they are", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),
        new Word("εσομαι", "I will be εἰμί", INDICATIVE, ACTIVE, FUTURE, FIRST_PERSON, SINGULAR),
        new Word("ἔσῃ", "You will be εἰμί", INDICATIVE, ACTIVE, FUTURE, SECOND_PERSON, SINGULAR),
        new Word("ἔσται", "S/He will be εἰμί", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, SINGULAR),
        new Word("ἐσόμεθα", "We will be εἰμί", INDICATIVE, ACTIVE, FUTURE, FIRST_PERSON, PLURAL),
        new Word("ἔσεσθε", "You will be εἰμί", INDICATIVE, ACTIVE, FUTURE, SECOND_PERSON, PLURAL),
        new Word("ἔσονται", "They will be εἰμί", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, PLURAL),
        new Word("ἦν", "s/he was", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        // 2357
        new Word("λεγω", "I say"),
        new Word("ερω", "I will say λεγω", FUTURE),
        new Word("ειπον", "I said λεγω", AORIST),
        new Word("ειρηκα", "I have said λεγω", PERFECT),
        new Word("ειρημαι", "I have been said λεγω", MIDDLE, PASSIVE, PERFECT),
        new Word("ερρεθην", "I was said λεγω", PASSIVE, AORIST),
        // 1768
        new Word("εἰς accusative", "into"),
        // 1391
        new Word("οὗτος", "this", MASCULINE),
        new Word("αὕτη", "this", FEMININE),
        new Word("τοῦτο", "this", NEUTER),
        // 1365
        new Word("ὁς", "who, which", MASCULINE, NOMINATIVE, SINGULAR),
        new Word("ὁυ", "who, which", MASCULINE, GENITIVE, SINGULAR),
        new Word("ᾡ", "who, which", MASCULINE, DATIVE, SINGULAR),
        new Word("ὁν", "who, which", MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("ἥ", "who, which", FEMININE, NOMINATIVE, SINGULAR),
        new Word("ἡς", "who, which", FEMININE, GENITIVE, SINGULAR),
        new Word("ᾑ", "who, which", FEMININE, DATIVE, SINGULAR),
        new Word("ἡν", "who, which", FEMININE, ACCUSATIVE, SINGULAR),
        new Word("ὅ", "who, which", NEUTER, NOMINATIVE, SINGULAR),
        new Word("ὁυ", "who, which", NEUTER, GENITIVE, SINGULAR),
        new Word("ᾡ", "who, which", NEUTER, DATIVE, SINGULAR),
        new Word("ὅ", "who, which", NEUTER, ACCUSATIVE, SINGULAR),
        new Word("ὅι", "who, which", MASCULINE, NOMINATIVE, PLURAL),
        new Word("ὡν", "who, which", MASCULINE, GENITIVE, PLURAL),
        new Word("ὁις", "who, which", MASCULINE, DATIVE, PLURAL),
        new Word("ὁυς", "who, which", MASCULINE, ACCUSATIVE, PLURAL),
        new Word("ἅι", "who, which", FEMININE, NOMINATIVE, PLURAL),
        new Word("ὡν", "who, which", FEMININE, GENITIVE, PLURAL),
        new Word("ἁις", "who, which", FEMININE, DATIVE, PLURAL),
        new Word("ἁς", "who, which", FEMININE, ACCUSATIVE, PLURAL),
        new Word("ἁ", "who, which", NEUTER, NOMINATIVE, PLURAL),
        new Word("ὡν", "who, which", NEUTER, GENITIVE, PLURAL),
        new Word("ὁις", "who, which", NEUTER, DATIVE, PLURAL),
        new Word("ἁ", "who, which", NEUTER, ACCUSATIVE, PLURAL),
        // 1318
        new Word("Θεός", "God", MASCULINE),
        new Word("Θεοῦ", "God", MASCULINE, GENITIVE),
        // 1297
        new Word("ὅτι", "that, because"),
        // 1283
        new Word("πᾶς", "all every each", MASCULINE),
        new Word("πᾶσα", "all every each", FEMININE),
        new Word("πᾶν", "all every each", NEUTER),
        // 1042
        new Word("γάρ", "for, because"),
        // 916
        new Word("ἐκ genitive", "out of, from"),
        new Word("ἐξ genitive", "out of, from"),
        // 891
        new Word("ἐπί accusative", "onto"),
        new Word("ἐπί genitive", "over"),
        new Word("ἐπί dative", "at"),
        // 719
        new Word("κύριος", "lord", MASCULINE),
        new Word("κύριου", "lord", MASCULINE, GENITIVE),
        // 708
        new Word("ἐχω",	"I have"),
        new Word("ἑξω",	"I will have ἐχω", FUTURE),
        new Word("ἐσχον", "I had ἐχω", AORIST),
        new Word("ἐσχηκα", "I have had ἐχω", PERFECT),
        // 699
        new Word("πρός accusative", "to, towards"),
        // 669
        new Word("γινομαι",	"I become, I am"),
        new Word("γενησομαι", "I will become γινομαι", FUTURE),
        new Word("εγενομην", "I became γινομαι", AORIST),
        new Word("γεγονα", "I have become γινομαι", PERFECT),
        new Word("γεγενημαι", "I have been made, caused to happen γινομαι", MIDDLE, PASSIVE, PERFECT),
        new Word("εγενηθην", "it happened γινομαι", PASSIVE, AORIST),
        // 668
        new Word("διά accusative", "on account of"),
        new Word("διά genitive", "through"),
        // 663
        new Word("ἵνα", "in order that"),
        // 646
        new Word("ἀπό genitive", "from"),
        // 638
        new Word("ἀλλά", "but (strong)"),
        // 634
        new Word("ἐρχομαι", "I come, I go"),
        new Word("ελευσομαι", "I will come/go 'ερχομαι", FUTURE),
        new Word("ηλθον", "I came/went, 'ερχομαι", AORIST),
        new Word("εληλθυα", "I have come/gone 'ερχομαι", PERFECT),
        // 579
        new Word("τίς", "who? what?", MASCULINE, NOMINATIVE, SINGULAR),
        new Word("τίνος", "who? what?", MASCULINE, GENITIVE, SINGULAR),
        new Word("τίνι", "who? what?", MASCULINE, DATIVE, SINGULAR),
        new Word("τίνα", "who? what?", MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("τίς", "who? what?", FEMININE, NOMINATIVE, SINGULAR),
        new Word("τίνος", "who? what?", FEMININE, GENITIVE, SINGULAR),
        new Word("τίνι", "who? what?", FEMININE, DATIVE, SINGULAR),
        new Word("τίνα", "who? what?", FEMININE, ACCUSATIVE, SINGULAR),
        new Word("τί", "who? what?", NEUTER, NOMINATIVE, SINGULAR),
        new Word("τίνος", "who? what?", NEUTER, GENITIVE, SINGULAR),
        new Word("τίνι", "who? what?", NEUTER, DATIVE, SINGULAR),
        new Word("τί", "who? what?", NEUTER, ACCUSATIVE, SINGULAR),
        new Word("τίνες", "who? what?", MASCULINE, NOMINATIVE, PLURAL),
        new Word("τίνων", "who? what?", MASCULINE, GENITIVE, PLURAL),
        new Word("τίσι", "who? what?", MASCULINE, DATIVE, PLURAL),
        new Word("τίνας", "who? what?", MASCULINE, ACCUSATIVE, PLURAL),
        new Word("τίνες", "who? what?", FEMININE, NOMINATIVE, PLURAL),
        new Word("τίνων", "who? what?", FEMININE, GENITIVE, PLURAL),
        new Word("τίσι", "who? what?", FEMININE, DATIVE, PLURAL),
        new Word("τίνας", "who? what?", FEMININE, ACCUSATIVE, PLURAL),
        new Word("τίνα", "who? what?", NEUTER, NOMINATIVE, PLURAL),
        new Word("τίνων", "who? what?", NEUTER, GENITIVE, PLURAL),
        new Word("τίσι", "who? what?", NEUTER, DATIVE, PLURAL),
        new Word("τίνα", "who? what?", NEUTER, ACCUSATIVE, PLURAL),
        // 572
        new Word("ποιω", "I do, I make ποιεω"),
        new Word("ποιησω", "I will make/do ποιεω", FUTURE),
        new Word("εποιησα", "I did/made ποιεω", AORIST),
        new Word("πεποιηκα", "I have done/made ποιεω", PERFECT),
        new Word("πεποιημαι", "I have been done/made ποιεω", MIDDLE, PASSIVE, PERFECT),
        // 550
        new Word("ἄνθρωπος", "human being", MASCULINE),
        new Word("ἄνθρωποῦ", "human being", MASCULINE, GENITIVE),
        // 538
        new Word("τις", "someone something", MASCULINE, NOMINATIVE, SINGULAR),
        new Word("τινος", "someone something", MASCULINE, GENITIVE, SINGULAR),
        new Word("τινα", "someone something", MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("τινι", "someone something", MASCULINE, DATIVE, SINGULAR),
        new Word("τις", "someone something", FEMININE, NOMINATIVE, SINGULAR),
        new Word("τινος", "someone something", FEMININE, GENITIVE, SINGULAR),
        new Word("τινι", "someone something", FEMININE, DATIVE, SINGULAR),
        new Word("τινα", "someone something", FEMININE, ACCUSATIVE, SINGULAR),
        new Word("τι", "someone something", NEUTER, NOMINATIVE, SINGULAR),
        new Word("τινος", "someone something", NEUTER, GENITIVE, SINGULAR),
        new Word("τινι", "someone something", NEUTER, DATIVE, SINGULAR),
        new Word("τι", "someone something", NEUTER, ACCUSATIVE, SINGULAR),
        new Word("τινες", "someone something", MASCULINE, NOMINATIVE, PLURAL),
        new Word("τινων", "someone something", MASCULINE, GENITIVE, SINGULAR),
        new Word("τισι", "someone something", MASCULINE, DATIVE, PLURAL),
        new Word("τινας", "someone something", MASCULINE, ACCUSATIVE, PLURAL),
        new Word("τινες", "someone something", FEMININE, NOMINATIVE, PLURAL),
        new Word("τινων", "someone something", FEMININE, GENITIVE, SINGULAR),
        new Word("τισι", "someone something", FEMININE, DATIVE, PLURAL),
        new Word("τινας", "someone something", FEMININE, ACCUSATIVE, PLURAL),
        new Word("τινα", "someone something", NEUTER, NOMINATIVE, PLURAL),
        new Word("τινων", "someone something", NEUTER, GENITIVE, SINGULAR),
        new Word("τισι", "someone something", NEUTER, DATIVE, PLURAL),
        new Word("τινα", "someone something", NEUTER, ACCUSATIVE, PLURAL),
        // 531
        new Word("Χριστός", "Christ", MASCULINE),
        new Word("Χριστοῦ", "Christ", MASCULINE, GENITIVE),
        // 504
        new Word("ὡς", "as, like, when, that, how, approximately"),
        // 502
        new Word("εἰ", "if"),
        // 499
        new Word("οὖν", "therefore"),
        // 476
        new Word("κατά accusative", "according to"),
        new Word("κατά genitive", "down from"),
        // 473
        new Word("μετά accusative", "after"),
        new Word("μετά genitive", "with"),
        // 455
        new Word("ὁρω",	"I see ὁραω"),
        new Word("ὀψομαι",	"I will see ὁραω", FUTURE),
        new Word("εἰδον",	"I saw ὁραω", AORIST),
        new Word("ἑωρακα",	"I have seen ὁραω", PERFECT),
        new Word("ὠφθην",	"I was seen ὁραω", PASSIVE, AORIST),
        // 428
        new Word("ακουω", "I hear"),
        new Word("ακουσω", "I will hear, ακουω", FUTURE),
        new Word("ηκουσα", "I heard, ακουω", AORIST),
        new Word("ακηκοα", "I have heard, ακουω", PERFECT),
        new Word("ηκουσθην", "I was heard, ακουω", PASSIVE, AORIST),
        // 418
        new Word("πολύς", "many, much", MASCULINE),
        new Word("πολλή", "many, much", FEMININE),
        new Word("πολύ", "many, much", NEUTER),
        // 417
        new Word("διδωμι", "I give"),
        new Word("δωσω", "I will give, διδωμι", FUTURE),
        new Word("εδωκα", "I gave, διδωμι", AORIST),
        new Word("δεδωκα", "I have given, διδωμι", PERFECT),
        new Word("δεδομαι", "I have been given, διδωμι", MIDDLE, PASSIVE, PERFECT),
        new Word("εδοθην", "I was given, διδωμι passive", PASSIVE, AORIST),
        // 414
        new Word("πατήρ", "father", MASCULINE),
        new Word("πατρός", "father", MASCULINE, GENITIVE),
        // 389
        new Word("ἡμέρα", "day", FEMININE),
        new Word("ἡμέρας", "day", FEMININE, GENITIVE),
        // 379
        new Word("πνεῦμα", "spirit, wind, breath", NEUTER),
        new Word("πνεύματος", "spirit, wind, breath", NEUTER, GENITIVE),
        // 377
        new Word("υἱός", "son", MASCULINE),
        new Word("υἱοῦ", "son", MASCULINE, GENITIVE),
        // 353
        new Word("εἷς", "one", MASCULINE),
        new Word("μία", "one", FEMININE),
        new Word("ἕν", "one", NEUTER),
        // 343
        new Word("ἀδελφός", "brother", MASCULINE),
        new Word("ἀδελφοῦ", "brother", MASCULINE, GENITIVE),
        new Word("ἤ", "or"),
        // 333
        new Word("ἐάν", "if"),
        new Word("περί accusative", "around"),
        new Word("περί genitive", "concerning, about"),
        // 330
        new Word("λόγος", "word", MASCULINE),
        new Word("λόγου", "word", MASCULINE, GENITIVE),
        // 324
        new Word("οἶδα", "I know"),
        // 319
        new Word("ἑαυτοῦ", "himself", MASCULINE, GENITIVE),
        new Word("ἑαυτῆς", "herself", FEMININE, GENITIVE),
        new Word("ἑαυτοῦ", "itself", NEUTER, GENITIVE),
        // 296
        new Word("λαλω", "I speak"),
        new Word("λαλησω", "I will speak, λαλεω", FUTURE),
        new Word("ελαλησα", "I spoke, λαλεω", AORIST),
        new Word("λελαληκα", "I have spoken, λαλεω", PERFECT),
        new Word("λελαλημαι", "I have been spoken, λαλεω", MIDDLE, PASSIVE, PERFECT),
        new Word("ελαληθην", "I was spoken, λαλεω", PASSIVE, AORIST),
        // 273
        new Word("οὐρανός", "heaven", MASCULINE),
        new Word("οὐρανοῦ", "heaven", MASCULINE, GENITIVE),
        // 261
        new Word("μαθητής", "student, disciple", MASCULINE),
        new Word("μαθητοῦ", "student, disciple", MASCULINE, GENITIVE),
        // 258
        new Word("λαμβανω", "I take, I receive"),
        new Word("λημψομαι", "I will take/receive, λαμβανω", PRESENT),
        new Word("ελαβον", "I took/received, λαμβανω", AORIST),
        new Word("ειληφα", "I have taken/received, λαμβανω", PERFECT),
        // 250
        new Word("γῆ", "land, earth", FEMININE),
        new Word("γῆς", "land, earth", FEMININE, GENITIVE),
        // 249
        new Word("πιστεύω", "I believe"),
        new Word("πιστεύσω", "I will believe, πιστευω", FUTURE),
        new Word("ἐπίστευσα", "I believed, πιστευω", AORIST),
        new Word("πεπίστευκα", "I have believed, πιστευω", PERFECT),
        new Word("πεπίστευμαι", "I have been believed, πιστευω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐπιστεύθην", "I was believed, πιστευω", PASSIVE, AORIST),
        // 245
        new Word("μέγας", "large, great", MASCULINE),
        new Word("μεγάλη", "large, great", FEMININE),
        new Word("μέγα", "large, great", NEUTER),
        // 243
        new Word("πίστις", "faith, trust", FEMININE),
        new Word("πίστεως", "faith, trust", FEMININE, GENITIVE),
        // 242
        new Word("γινώσκω", "I know"),
        new Word("γνώσομαι", "I will know γινωσκω", FUTURE),
        new Word("ἔγνων", "I knew γινωσκω", AORIST),
        new Word("ἔγνωσκα", "I have known γινωσκω", PERFECT),
        new Word("ἔγνωσμαι", "I have been known γινωσκω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐγνώσθην", "I was known γινωσκω", PASSIVE, AORIST),
        // 234
        new Word("ὄνομα", "name", MASCULINE),
        new Word("ὄνοματος", "name", MASCULINE, GENITIVE),
        // 233
        new Word("ἅγιος", "holy", ADJECTIVE, MASCULINE),
        new Word("ἅγια", "holy", ADJECTIVE, FEMININE),
        new Word("ἅγιον", "holy", ADJECTIVE, NEUTER),
        // 231
        new Word("ἀποκρίνομαι", "I answer"),
        new Word("ἀπεκρινἀμην", "I answered αποκρινομαιa", AORIST),
        new Word("ἀπεκρίθην", "I was answered αποκρινομαιa", PASSIVE, AORIST),
        // 220
        new Word("ὑπό accusaive", "under"),
        new Word("ὑπό genitive", "by"),
        // 218
        new Word("ἐξέρχομαι", "I go out"),
        new Word("ἐξελεὐσομαι", "I will go out εξερχομαι", FUTURE),
        new Word("ἐξῆλθον", "I went out εξερχομαι", AORIST),
        new Word("ἐξελήλυθα", "I have gone out εξερχομαι", PERFECT),
        // 216
        new Word("ἀνήρ", "man", MASCULINE),
        new Word("ἀνδρός", "man", MASCULINE, GENITIVE),
        // 215
        new Word("γυνή", "woman", FEMININE),
        new Word("γυναικός", "woman", FEMININE, GENITIVE),
        new Word("τέ", "and, so"),
        // 210
        new Word("δύναμαι", "I am able"),
        new Word("δυνήσομαι", "I will be able, δυναμαι", FUTURE),
        new Word("ἠδυνήθην",	"I was enabled (?) δυναμαι", PASSIVE, AORIST),
        // 208
        new Word("θέλω", "I want"),
        new Word("ἠθέλησα", "I wanted θελω", AORIST),
        new Word("ὅυτω", "thus"),
        new Word("ὅυτως", "thus"),
        // 195
        new Word("Ἰοὐδαῖος", "jewish", ADJECTIVE, MASCULINE),
        new Word("Ἰοὐδαῖα", "jewish", ADJECTIVE, FEMININE),
        new Word("Ἰοὐδαῖον", "jewish", ADJECTIVE, NEUTER),
        // 194
        new Word("παρά accusative", "alongside of"),
        new Word("παρά genitive", "from"),
        new Word("παρά dative", "in the presence of"),
        new Word("εισερχομαι", "I enter"),
        new Word("εἰσελεύσομαι", "I will enter εισερχομαι", FUTURE),
        new Word("εἰσῆλθον", "I entered εισερχομαι", AORIST),
        new Word("εἰσελήλυθα", "I have entered εισερχομαι", PERFECT),
        // 191
        new Word("γραφω", "I write"),
        new Word("γράψω", "I will write γραφω", FUTURE),
        new Word("ἔγραψα", "I wrote γραφω", AORIST),
        new Word("γέγραφα", "I have written γράφω", PERFECT),
        new Word("γέγραμμαι", "I have been written γράφω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐγράφην", "I was written γράφω", PASSIVE, AORIST),
        // 186
        new Word("κόσμος", "world", MASCULINE),
        new Word("κόσμου", "world", MASCULINE, GENITIVE),
        // 182
        new Word("καθώς", "just as"),
        // 179
        new Word("μέν", "indeed, on the one hand"),
        // 177
        new Word("χείρ", "hand", FEMININE),
        new Word("χειρός", "hand", FEMININE, GENITIVE),
        // 176
        new Word("ἑυρίσκω", "I find"),
        new Word("εὑρήσω", "I will find ἑυρίσκω", FUTURE),
        new Word("εὗρον", "I found ἑυρίσκω", AORIST),
        new Word("εὕρηκα", "I have found ἑυρίσκω", PERFECT),
        new Word("εὑρέθην", "I was found ἑυρίσκω", PASSIVE, AORIST),
        // 175
        new Word("ἄγγελος", "messenger, angel", MASCULINE),
        new Word("ἄγγελου", "messenger, angel", MASCULINE, GENITIVE),
        new Word("ὄχλος", "crowd", MASCULINE),
        new Word("ὄχλου", "crowd", MASCULINE, GENITIVE),
        // 173
        new Word("ἁμαρτία", "sin", FEMININE),
        new Word("ἁμαρτίας", "sin", FEMININE, GENITIVE),
        // 169
        new Word("ἔργον", "work", NEUTER),
        new Word("ἔργου", "work", NEUTER, GENITIVE),
        // 166
        new Word("δόξα", "glory", FEMININE),
        new Word("δόξης", "glory", FEMININE, GENITIVE),
        new Word("ἄν", "if, would, might"),
        // 163
        new Word("πόλις", "city", FEMININE),
        new Word("πόλεως", "city", FEMININE, GENITIVE),
        // 162
        new Word("βασιλεία", "kingdom", FEMININE),
        new Word("βασιλείας", "kingdom", FEMININE, GENITIVE),
        new Word("ἔθνος", "people", NEUTER),
        new Word("ἔθνους", "people", NEUTER, GENITIVE),
        // 160
        new Word("τοτε", "then"),
        new Word("ἕως", "until"),
        // ?
        new Word("ὅστις", "whoever, everyone (ὅς + τις both parts decline)", ADJECTIVE, MASCULINE),
        new Word("ἥτις", "whoever, everyone (ἥ + τις both parts decline)", ADJECTIVE, FEMININE),
        new Word("ὅτι", "whoever, everyone (ὅ + τις both parts decline)", ADJECTIVE, NEUTER),
        // 159
        new Word("προτος", "first", ADJECTIVE, MASCULINE),
        new Word("προτη", "first", ADJECTIVE, FEMININE),
        new Word("προτον", "first", ADJECTIVE, NEUTER),
        // 157
        new Word("καρδια", "heart", FEMININE),
        new Word("καρδιας", "heart", FEMININE, GENITIVE),
        new Word("ἐσθιω", "I eat"),
        new Word("φάγομαι", "I will eat ἐσθιω", FUTURE),
        new Word("ἔφαγον", "I ate ἐσθιω", AORIST),
        // 155
        new Word("ἱστημι", "Transitive: I set, put, place Intransitive: I stand, I appear, I stop"),
        new Word("στήσω", "I will stand, ἱστημι", FUTURE),
        new Word("ἔστησα", "I put, set ἱστημι", AORIST),
        new Word("ἔστην", "I stood ἱστημι", SECOND_AORIST),
        new Word("ἔστηκα", "I have stood ἱστημι", PERFECT),
        new Word("ἐστάθην", "I was put ἱστημιa", PASSIVE, AORIST),
        new Word("ἀλλος", "other", ADJECTIVE, MASCULINE),
        new Word("ἀλλη", "other", ADJECTIVE, FEMININE),
        new Word("ἀλλο", "other", ADJECTIVE, NEUTER),
        new Word("χαρις", "grace", FEMININE),
        new Word("χαριτος", "grace", FEMININE, GENITIVE),
        // 153
        new Word("πορευομαι", "I go"),
        new Word("πορεύσομαι", "I will go πορευομαι", FUTURE),
        new Word("πεπόρευμαι", "I have been taken πορευομαι", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐπορεὐθην", "I was taken πορευομαι", PASSIVE, AORIST),
        // 152
        new Word("φημι", "I say"),
        // 150
        new Word("ὑπερ accusative", "above"),
        new Word("ὑπερ genitive", "in behalf of"),
        // 148
        new Word("καλεω", "I call"),
        new Word("καλἐσω", "I will call καλεω", FUTURE),
        new Word("ἐκάλεσα", "I called καλεω", AORIST),
        new Word("κέκληκα", "I have called καλεω", PERFECT),
        new Word("κέκλημαι", "I have been called καλεω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐκλήθην", "I was called καλεω", PASSIVE, AORIST),
        // 147
        new Word("σαρξ", "flesh", FEMININE),
        new Word("σαρκος", "flesh", FEMININE, GENITIVE),
        new Word("ἀγαπαω", "I love"),
        new Word("ἀγαπήσω", "I will love ἀγαπαω", FUTURE),
        new Word("ἠγάπησα", "I loved ἀγαπαω", AORIST),
        new Word("ἠγάπηκα", "I have loved ἀγαπαω", PERFECT),
        new Word("ἠγάπημαι", "I have been loved ἀγαπαω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἠγαπἠθην", "I was loved ἀγαπαω", PASSIVE, AORIST),
        new Word("νυν", "now"),
        // 144
        new Word("προφητης", "prophet", MASCULINE),
        new Word("προφητου", "prophet", MASCULINE, GENITIVE),
        new Word("ἐγειρω", "I raise"),
        new Word("ἐγερῶ", "I will raise ἐγειρω", FUTURE),
        new Word("ἤγειρα", "I raised ἐγειρω", AORIST),
        new Word("ἐγήγερμαι", "I have been raised ἐγειρω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἠγέρθην", "I was raised ἐγειρω", PASSIVE, AORIST),
        // 143
        new Word("ὀυδε", "and not, neither"),
        new Word("ἀφιημι", "I let go, divorce, forgive"),
        new Word("ἀφήσω", "I will forgive ἀφιημι", FUTURE),
        new Word("ἀφῆκα", "I forgave ἀφιημι", AORIST),
        new Word("ἀφέωμαι", "I have been forgiven ἀφιημι", MIDDLE, PASSIVE, PERFECT),
        new Word("ἀφέθην", "I was forgiven ἀφιημι", PASSIVE, AORIST),
        // 142
        new Word("λαος", "people", MASCULINE),
        new Word("λαου", "people", MASCULINE, GENITIVE),
        new Word("σωμα", "body", NEUTER),
        new Word("σωματος", "body", NEUTER, GENITIVE),
        // 141
        new Word("παλιν", "again"),
        // 140
        new Word("ζαω", "I live"),
        // 139
        new Word("φωνἠ", "sound, voice", FEMININE),
        new Word("φωνῆς", "sound, voice", FEMININE, GENITIVE),
        new Word("ζωή", "life", FEMININE),
        new Word("ζωῆς", "life", FEMININE, GENITIVE),
        // 135
        new Word("δύο", "two"),
        // 133
        new Word("βλέπω", "I see"),
        new Word("βλέψω", "I will see βλέπω", FUTURE),
        new Word("ἐβλέψα", "I saw βλέπω", AORIST),
        // 132
        new Word("ἀποστέλλω", "I send"),
        new Word("ἀποστελῶ", "I will send ἀποστέλλω", FUTURE),
        new Word("άπέστειλα", "I sent ἀποστέλλω", AORIST),
        new Word("ἀπέσταλκα", "I have sent ἀποστέλλω", PERFECT),
        new Word("ἀπέσταλμαι", "I have been sent ἀποστέλλω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἀπεστάλην", "I was sent ἀποστέλλω", PASSIVE, AORIST),
        // 129
        new Word("ἀμήν", "truly"),
        // 128
        new Word("νεκρός", "dead", ADJECTIVE, MASCULINE),
        new Word("νεκρά", "dead", ADJECTIVE, FEMININE),
        new Word("νεκρόν", "dead", ADJECTIVE, NEUTER),
        new Word("συν dative", "with"),
        // 124
        new Word("δοῦλος", "slave", MASCULINE),
        new Word("δοῦλου", "slave", MASCULINE, GENITIVE),
        // 123
        new Word("ὅταν", "whenever"),
        // 122
        new Word("αἰών", "age", MASCULINE),
        new Word("αἰῶνος", "age", MASCULINE, GENITIVE),
        new Word("ἀρχιερεύς", "high priest", MASCULINE),
        new Word("ἀρχιερέως", "high priest", MASCULINE, GENITIVE),
        new Word("βάλλω", "I throw"),
        new Word("βαλῶ", "I will throw", FUTURE),
        new Word("ἔβαλον", "I threw", AORIST),
        new Word("βέβληκα", "I have thrown", PERFECT),
        new Word("βέβλημαι", "I have been thrown", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐβλήθην", "I was thrown", PASSIVE, AORIST),
        // 120
        new Word("θάνατος", "death", MASCULINE),
        new Word("θάνατου", "death", MASCULINE, GENITIVE),
        // 119
        new Word("δυναμις", "power, ability", FEMININE),
        new Word("δυναμεως", "power, ability", FEMININE, GENITIVE),
        new Word("παραδιδωμι", "I hand over"),
        new Word("παραδώσω", "I will hand over παραδιδωμι", FUTURE),
        new Word("παρέδωκα", "I handed over παραδιδωμι", AORIST),
        new Word("παραδέδωκα", "I have handed over παραδιδωμι", PERFECT),
        new Word("παραδέδομαι", "I have been handed over παραδιδωμι", MIDDLE, PASSIVE, PERFECT),
        new Word("παρεδόθην", "I was handed over παραδιδωμι", PASSIVE, AORIST),
        // 118
        new Word("μένω", "I remain"),
        new Word("μενῶ", "I will remain μένω", FUTURE),
        new Word("ἔμεινα", "I remained μένω", AORIST),
        new Word("μεμένηκα", "I have remained μένω", PERFECT),
        // 117
        new Word("ἀπέρχομαι", "I depart, I go away"),
        new Word("ἀπελεύσομαι", "I will depart ἀπέρχομαι", FUTURE),
        new Word("ἀπῆλθον", "I departed ἀπέρχομαι", AORIST),
        new Word("ἀπελήλθυα", "I have departed ἀπέρχομαι", PERFECT),
        new Word("ζητῶ", "I seek ζητεω"),
        new Word("ζητήσω", "I will seek ζητεω", FUTURE),
        new Word("ἐζήτησα", "I sought ζητεω", AORIST),
        new Word("ἐζητήθην", "I was sought ζητεω", PASSIVE, AORIST),
        // 116
        new Word("ἀγαπη", "love", FEMININE),
        new Word("ἀγαπης", "love", FEMININE, GENITIVE),
        // 115
        new Word("βασιλευς", "king", MASCULINE),
        new Word("βασιλεως", "king", MASCULINE, GENITIVE),
        // 114
        new Word("ἐκκλησια", "assembly, church", FEMININE),
        new Word("ἐκκλησιας", "assembly, church", FEMININE, GENITIVE),
        new Word("ὀικος", "house", MASCULINE),
        new Word("ὀικου", "house", MASCULINE, GENITIVE),
        new Word("ἰδιος", "one's own", ADJECTIVE, MASCULINE),
        new Word("ἰδια", "one's own", ADJECTIVE, FEMININE),
        new Word("ἰδιον", "one's own", ADJECTIVE, NEUTER),
        new Word("μονος", "alone", ADJECTIVE, MASCULINE),
        new Word("μονη", "alone", ADJECTIVE, FEMININE),
        new Word("μονον", "alone", ADJECTIVE, NEUTER),
        new Word("κρίνω", "I judge"),
        new Word("κρινῶ", "I will judge κρίνω", FUTURE),
        new Word("ἔκρινα", "I judged κρίνω", AORIST),
        new Word("κέκρικα", "I have judged κρίνω", PERFECT),
        new Word("κέκριμαι", "I have been judged κρίνω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐκρίθην", "I was judged κρίνω", PASSIVE, AORIST),
        // 111
        new Word("ἀποθνῃσκω", "I die"),
        new Word("ἀποθανοῦμαι", "I will die ἀποθνῃσκω", FUTURE),
        new Word("άπέθανον", "I died ἀποθνῃσκω", AORIST),
        // 110
        new Word("ὁσος", "as/how much/great/far/long", ADJECTIVE, MASCULINE),
        new Word("ὁση", "as/how much/great/far/long", ADJECTIVE, FEMININE),
        new Word("ὁσον", "as/how much/great/far/long", ADJECTIVE, NEUTER),
        // 109
        new Word("ἀληθεια", "truth", FEMININE),
        new Word("ἀληθειας", "truth", FEMININE, GENITIVE),
        new Word("μελλω", "I am about to, I intend"),
        new Word("μελλήσω", "I will intend μελλω", FUTURE),
        new Word("ὁλος", "whole, entire", ADJECTIVE, MASCULINE),
        new Word("ὁλη", "whole, entire", ADJECTIVE, FEMININE),
        new Word("ὁλον", "whole, entire", ADJECTIVE, NEUTER),
        new Word("παρακαλῶ", "I call, I beseech παρακαλέω"),
        new Word("παρεκάλεσα", "I beseeched παρακαλέω", AORIST),
        new Word("παρακέκλημαι", "I have been beseeched παρακαλέω", MIDDLE, PASSIVE, PERFECT),
        new Word("παρεκλήθην", "I was beseeched παρακαλέω", PASSIVE, AORIST),
        // 108
        new Word("ἀνίστημι", "I raise, I stand up"),
        new Word("ἀναστήσω", "I will raise/stand up ἀνίστημι", FUTURE),
        new Word("ἀνέστησα", "I raised ἀνίστημι", AORIST),
        new Word("ἀνέστην", "I was raised ἀνίστημι", PASSIVE, AORIST),
        // 106
        new Word("σῴζω", "I save"),
        new Word("σώζω", "I will save σῴζω", FUTURE),
        new Word("ἔσωσα", "I saved σῴζω", AORIST),
        new Word("σέσωκα", "I have saved σῴζω", PERFECT),
        new Word("σέσῳσμαι", "I have been saved σῴζω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐσώθην", "I was saved σῴζω", PASSIVE, AORIST),
        new Word("ὤρα", "the hour", FEMININE),
        new Word("ὤρας", "the hour", FEMININE, GENITIVE),
        // 105
        new Word("ἐκει", "there"),
        // 103
        new Word("ὁτε", "when"),
        new Word("πως", "how"),
        new Word("ψυχη", "soul, life", FEMININE),
        new Word("ψυχης", "soul, life", FEMININE, GENITIVE),
        // 102
        new Word("ἀγαθός", "good", ADJECTIVE, MASCULINE),
        new Word("ἀγαθή", "good", ADJECTIVE, FEMININE),
        new Word("ἀγαθόν", "good", ADJECTIVE, NEUTER),
        new Word("ἐξουσια", "authority", FEMININE),
        new Word("ἐξουσιας", "authority", FEMININE, GENITIVE),
        // 101
        new Word("αἴρω", "I take up, I take away"),
        new Word("ἀρω", "I will take up αἴρω", FUTURE),
        new Word("ἦρα", "I took up αἴρω", AORIST),
        new Word("ἦρκα", "I have taken up αἴρω", PERFECT),
        new Word("ἦρμαι", "I have been taken up αἴρω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἤρθην", "I was taken up αἴρω", PASSIVE, AORIST),
        new Word("δει", "it is necessary"),
        new Word("ὁδος", "way, road", FEMININE),
        new Word("ὁδου", "way, road", FEMININE, GENITIVE),
        // 100
        new Word("ἀλληλων", "each other"),
        new Word("καλος", "good", ADJECTIVE, MASCULINE),
        new Word("καλη", "good", ADJECTIVE, FEMININE),
        new Word("καλον", "good", ADJECTIVE, NEUTER),
        new Word("ὀφθαλμος", "eye, sight", MASCULINE),
        new Word("ὀφθαλμου", "eye, sight", MASCULINE, GENITIVE),
        new Word("τίθημι", "I put, I place"),
        new Word("θήσω", "I will put τίθημι", FUTURE),
        new Word("ἔθηκα", "I placed τίθημι", AORIST),
        new Word("τέθεικα", "I have put τίθημι", PERFECT),
        new Word("τέθειμαι", "I have been put τίθημι", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐτέθην", "I was put τίθημι", PASSIVE, AORIST),
        // 98
        new Word("φαρισαιος", "Pharisee", MASCULINE),
        new Word("φαρισαιου", "Pharisee", MASCULINE, GENITIVE),
        new Word("ἑτερος", "other, another", ADJECTIVE, MASCULINE),
        new Word("ἑτερα", "other, another", ADJECTIVE, FEMININE),
        new Word("ἑτερον", "other, another", ADJECTIVE, NEUTER),
        new Word("οὐδέ", "and not, neither, nor, not even"),
        // 97
        new Word("ἀρτος", "bread", MASCULINE),
        new Word("ἀρτου", "bread", MASCULINE, GENITIVE),
        new Word("αἱμα", "blood", NEUTER),
        new Word("αἱματος", "blood", NEUTER, GENITIVE),
        new Word("διδασκω", "I teach"),
        new Word("διδάξω", "I will teach διδασκω", FUTURE),
        new Word("ἐδίδαξα", "I taught διδασκω", AORIST),
        new Word("ἐδιδάχθην", "I was taught διδασκω", PASSIVE, AORIST),
        new Word("γεννῶ", "I beget γενναω"),
        new Word("γεννήσω", "I will beget γενναω", FUTURE),
        new Word("ἐγέννησα", "I begat γενναω", AORIST),
        new Word("γεγέννηκα", "I have begotten γενναω", PERFECT),
        new Word("γεγέννημαι", "I have been begotten γενναω", PASSIVE, PERFECT),
        new Word("ἐγεννήθην", "I was begotten γενναω", PASSIVE, AORIST),
        // 95
        new Word("περιπατω", "I walk around"),
        new Word("περιπατήσω", "I will walk around περιπατω", FUTURE),
        new Word("περιεπάτησα", "I walked around περιπατω", AORIST),
        new Word("φοβῶ", "I fear"),
        new Word("ἐφοβήθην", "I have been feared φοβέω", PASSIVE, AORIST),
        // 93
        new Word("ἔτι", "still, yet"),
        new Word("οἰκία", "house, family", FEMININE),
        new Word("οἰκὶας", "house, family", FEMININE, GENITIVE),
        new Word("πούς", "foot", MASCULINE),
        new Word("ποδός", "foot", MASCULINE, GENITIVE),
        // 92
        new Word("δικαιοσύνη", "justice, righteousness", FEMININE),
        new Word("δικαιοσύνης", "justice, righteousness", FEMININE, GENITIVE),
        new Word("εἰρήνη", "peace", FEMININE),
        new Word("εἰρήνης", "peace", FEMININE, GENITIVE),
        // 91
        new Word("θάλασσα", "sea, lake", FEMININE),
        new Word("θάλασσης", "sea, lake", FEMININE, GENITIVE),
        new Word("τόπος", "place, position; opportunity; passage", MASCULINE),
        new Word("τόπου", "place, position; opportunity; passage", MASCULINE, GENITIVE),
        new Word("κάθημαι", "I sit down"),
        new Word("κάθησομαι", "I will sit down κάθημαι", FUTURE),
        // 90
        new Word("ἀκολουθω", "I follow"),
        new Word("ἀκολουθήσω", "I will follow ἀκολουθέω", FUTURE),
        new Word("ἠκολούθησα", "I followed ἀκολουθέω", AORIST),
        new Word("ἠκολούθηκα", "I have followed ἀκολουθέω", PERFECT),
        new Word("ἀπόλλυμι", "I destroy"),
        new Word("ἀπολέσω", "I will destroy ἀπόλλυμι", FUTURE),
        new Word("ἀπώλεσα", "I destroyed ἀπόλλυμι", AORIST),
        new Word("ἀπόλωλα", "I have destroyed ἀπόλλυμι", PERFECT),
        new Word("πίπτω", "I fall"),
        new Word("πεσοῦμαι", "I will fall πίπτω", FUTURE),
        new Word("ἔπεσον", "I fell πίπτω", AORIST),
        new Word("πέπτωκα", "I have fallen πίπτω", PERFECT),
        new Word("μηδείς", "no, no one"),
        // 88
        new Word("ἑπτά", "seven, doesn't decline"),
        // 87
        new Word("οὔτε", "neither"),
        // 86
        new Word("ἄρχω", "I rule (middle, I begin)"),
        new Word("ἄρξω", "I will rule (middle, I will begin) ἄρχω", FUTURE),
        new Word("ἦρξα", "I ruled (middle, I began) ἄρχω", AORIST),
        new Word("πληρω", "I fill, fulfill"),
        new Word("πληρώσω", "I will fill πληρόω", FUTURE),
        new Word("ἐπλήρωσα", "I filled πληρόω", AORIST),
        new Word("πεπλήρωκα", "I have filled πληρόω", PERFECT),
        new Word("πεπλήρωμαι", "I have been filled πληρόω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐπληρώθην", "I was filled πληρόω passive", PASSIVE, AORIST),
        new Word("προσέρχομαι", "I come to"),
        new Word("προσήλθον", "I came to προσέρχομαι", AORIST),
        new Word("προσελήλυθα", "I have come to προσέρχομαι", PERFECT),
        // 85
        new Word("καιρός", "time (point and period)", MASCULINE),
        new Word("καιροῦ", "time (point and period)", MASCULINE, GENITIVE),
        new Word("προσεύχομαι", "I pray"),
        new Word("προσεύξομαι", "I will pray προσεύχομαι", FUTURE),
        new Word("προσηυξάμην", "I prayed προσεύχομαι", AORIST),
        // 83
        new Word("μήτηρ", "mother", FEMININE),
        new Word("μητρός", "mother", FEMININE, GENITIVE),
        new Word("ὥστε", "so that, in order that, thus"),
        // 82
        new Word("ἀναβαίνω", "I go up, rise up, advance"),
        new Word("ἀναβήσομαι", "I will go up, rise up, advance ἀναβαίνω", FUTURE),
        new Word("ἀνέβην", "I went up, rose up, advanced ἀναβαίνω", AORIST),
        new Word("ἀναβέβηκα", "I have gone up, risen up, advanced ἀναβαίνω", PERFECT),
        new Word("ἕκαστος", "each, every", ADJECTIVE, MASCULINE),
        new Word("ἕκαστη", "each, every", ADJECTIVE, FEMININE),
        new Word("ἕκαστον", "each, every", ADJECTIVE, NEUTER),
        new Word("ὅπου", "where, whereas"),
        // 81
        new Word("ἐκβάλλω", "I cast out"),
        new Word("ἐκβαλῶ", "I will cast out ἐκβάλλω", FUTURE),
        new Word("ἐξέβαλον", "I cast out (past) ἐκβάλλω", AORIST),
        new Word("ἐκβέβληκα", "I have cast out ἐκβάλλω", PERFECT),
        new Word("ἐξεβλήθην", "I was cast out ἐκβάλλω", PASSIVE, AORIST),
        new Word("καταβαίνω", "I come/go down"),
        new Word("καταβήσομαι", "I will come/go down καταβαίνω", FUTURE),
        new Word("κατέβην", "I came/went down καταβαίνω", AORIST),
        new Word("καταβέβηκα", "I have come/gone down καταβαίνω", PERFECT),
        new Word("μᾶλλον", "more, rather"),
        // 80
        new Word("άποστολος", "apostle", MASCULINE),
        new Word("άποστολου", "apostle", MASCULINE, GENITIVE),
        // 79
        new Word("πέμπω", "I send"),
        new Word("πέμψω", "I will send πέμπω", FUTURE),
        new Word("ἕπεμψα", "I sent πέμπω", AORIST),
        new Word("ἐπέμφθην", "I was sent πέμπω", PASSIVE, AORIST),
        new Word("ὑπάγω", "I go away, I draw off"),
        new Word("δίκαιος", "upright, just, righteous", ADJECTIVE, MASCULINE),
        new Word("δικαία", "upright, just, righteous", ADJECTIVE, FEMININE),
        new Word("δικαιον", "upright, just, righteous", ADJECTIVE, NEUTER),
        // 78
        new Word("στόµα", "mouth", NEUTER),
        new Word("στόματος", "mouth", NEUTER, GENITIVE),
        new Word("πονηρός", "physical: sick, bad spiritual: evil, wicked", ADJECTIVE, MASCULINE),
        new Word("πονηρά", "physical: sick, bad spiritual: evil, wicked", ADJECTIVE, FEMININE),
        new Word("πονηρόν", "physical: sick, bad spiritual: evil, wicked", ADJECTIVE, NEUTER),
        // 77
        new Word("σηµεῖον", "sign, miracle", NEUTER),
        new Word("σηµεῖου", "sign, miracle", NEUTER, GENITIVE),
        new Word("ἀνοίγω", "I open, unlock, disclose"),
        new Word("ἀνοίξω", "I will open, unlock, disclose, ἀνοίγω", FUTURE),
        new Word("ἤνοιξα", "I opened, unlocked, disclosed, ἀνοίγω", AORIST),
        new Word("ἀνέωγα", "I have opened, unlocked, disclosed, ἀνοίγω", PERFECT),
        new Word("ἀνέῳγμαι", "I have been opened, unlocked, disclosed, ἀνοίγω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἠνοίγην", "I was opened, unlocked, disclosed, ἀνοίγω", PASSIVE, AORIST),
        new Word("βαπτίζω", "I baptize, wash, dip"),
        new Word("βαπτίσω", "I will baptize, wash, dip, βαπτίζω", FUTURE),
        new Word("ἐβαπτισα", "I baptized, washed, dipped, βαπτίζω", AORIST),
        new Word("βεβάπτισμαι", "I have been baptized, washed, dipped, βαπτίζω", PASSIVE, PERFECT),
        new Word("ἐβαπτίσθην", "I was baptized, washed, dipped, βαπτίζω", PASSIVE, AORIST),
        // 76
        new Word("εὐαγγέλιον", "good news, gospel", NEUTER),
        new Word("εὐαγγέλιου", "good news, gospel", NEUTER, GENITIVE),
        new Word("πρόσωπον", "face, countenance", NEUTER),
        new Word("πρόσωπου", "face, countenance", NEUTER, GENITIVE),
        new Word("ὕδωρ", "water", NEUTER),
        new Word("ὕδατος", "water", NEUTER, GENITIVE),
        new Word("μαρτυρῶ", "I bear witness - μαρτυρέω"),
        new Word("μαρτυρήσω", "I will bear witness - μαρτυρέω", FUTURE),
        new Word("ἐμαρτύρησα", "I bore witness - μαρτυρέω", AORIST),
        new Word("μεμαρτύρηκα", "I have born witness - μαρτυρέω", PERFECT),
        new Word("μεμαρτύρημαι", "I have been witnessed - μαρτυρέω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐμαρτυρήθην", "I was witnessed - μαρτυρέω", PASSIVE, AORIST),
        // 75
        new Word("κεφαλή", "head", FEMININE),
        new Word("κεφαλῆς", "head", FEMININE, GENITIVE),
        new Word("δώδεκα", "twelve"),
        // 74
        new Word("ἀποκτείνω", "I kill"),
        new Word("ἀποκτενῶ", "I will kill - ἀποκτείνω", FUTURE),
        new Word("ἀπέκτεινα", "I killed - ἀποκτείνω", AORIST),
        new Word("ἀπεκτάθην", "I was killed - ἀποκτείνω", PASSIVE, AORIST),
        new Word("χαίρω", "I rejoice, I hail"),
        new Word("χαρήσομαι", "I will rejoice, I will hail - χαίρω (deponent)", FUTURE),
        new Word("ἐχάρην", "I was hailed - χαίρω", PASSIVE, AORIST),
        // 73
        new Word("φῶς", "light", NEUTER),
        new Word("φωτός", "light", NEUTER, GENITIVE),
        new Word("πίνω", "I drink"),
        new Word("πίομαι", "I will drink - πίνω", FUTURE),
        new Word("ἔπιον", "I drank - πίνω", AORIST),
        new Word("πέπωκα", "I have drunk - πίνω", PERFECT),
        new Word("ἐπόθην", "I was drunk - πίνω", PASSIVE, AORIST),
        // 71
        new Word("ἱερόν", "temple", NEUTER),
        new Word("ἱεροῦ", "temple", NEUTER, GENITIVE),
        new Word("πῦρ", "fire", NEUTER),
        new Word("πυρός", "fire", NEUTER, GENITIVE),
        new Word("αἰώνος", "eternal", ADJECTIVE, NEUTER),
        new Word("αἰώνον", "eternal", ADJECTIVE, NEUTER, GENITIVE)

        );
  }

  @Override
  public List<GrammarRule> buildRules() {
    return Arrays.asList(
        new GrammarRule("Nouns rules:\n" +
                    "1. Stems ending in α or η are in the first declension, stems ending in ο are in the second, and consonantal stems are in the third.\n" +
                    "2. Every neuter word has the same form in the nominative and accusative.\n" +
                    "3. Almost all neuter words end in α in the nominative and accusative plural.\n" +
                    "4. In the dative singular, the ι subscripts if possible.\n" +
                    "5. Vowels often change their length ('ablaut’).\n" +
                    "6. In the genitive and dative, the masculine and neuter will always be identical.\n" +
                    "7. Square of stops\n" +
                    "8. A tau cannot stand at the end of the word and will drop off"),

        new GrammarRule("Square of stops:\n" +
            "Labial           Unvoiced π  Voiced β  Aspirates φ  Labial + σ = ψ\n" +
            "Velar (Palatals) Unvoiced κ  Voiced γ  Aspirates χ  Velar + σ = ξ\n" +
            "Dental           Unvoiced τ  Voiced δ  Aspirates θ  Dental + σ = σ"),

        new GrammarRule("1st Declension Paradigm, Feminine\n" +
            "Nomanative  Singular: none  Plural: ι\n" +
            "Vocative    Singular: none  Plural: ι\n" +
            "Genitive    Singular: ς     Plural: ων\n" +
            "Dative      Singular: ι     Plural: ις\n" +
            "Accusative  Singular: ν     Plural: ς\n"),

        new GrammarRule("2nd Declension Paradigm, Masculine\n" +
            "Nomanative  Singular: ς     Plural: ι\n" +
            "Vocative    Singular: ε     Plural: ι\n" +
            "Genitive    Singular: υ     Plural: ων\n" +
            "Dative      Singular: ι     Plural: ις\n" +
            "Accusative  Singular: ν     Plural: υς\n"),

        new GrammarRule("2nd Declension Paradigm, Neuter\n" +
            "Nomanative  Singular: ν     Plural: α\n" +
            "Vocative    Singular: ν     Plural: α\n" +
            "Genitive    Singular: υ     Plural: ων\n" +
            "Dative      Singular: ι     Plural: ις\n" +
            "Accusative  Singular: ν     Plural: α\n"),

        new GrammarRule("Uses of Genitive\n" +
            " * descriptive: Let us put on the armor of light ενδθσμεθα τα οπλα του φωτος\n" +
            " * possessive\n" +
            " * showing apposition to the head noun: You will receive the gift, the Holy Spirit\n" +
            "   λημψεσθε την δωρεαν του αγιου πνευματος\n" +
            " * showing separation from the head noun: being alienated from the commonwealth of\n" +
            "   Israel απελλοτριωμενοι της πολιτειας του Ισραηλ\n" +
            " * subjective, expanding on the idea of the head noun: Who will separate us from\n" +
            "   Christ’s love τισ ημας χωρισει απο της αγαπης του Χπριστου\n" +
            " * objective, receiving the action of the head noun: The blasphemy against the\n" +
            "   Spirit will not be forgiven η του πνευματος βλασφημια ουκ αφεθησεται\n" +
            " * plenary, being both subjective and objective: For the love of Christ compels us η\n" +
            "   γαρ αγαπη του Χριστου συνεχει ημας\n" +
            " * relationship: Simon, son of John Σιμων Ιωαννου\n" +
            " * partitive, where the subject is a part of the whole, which is genitive: some of\n" +
            "   the branches τινες των κλαδων"),

        new GrammarRule("Uses of Dative\n" +
            " * Dative Proper (‘to’)\n" +
            " * indirect object: He has given him authority to execute judgment εξουσιαν εδωκεν\n" +
            "   αυτω κρισιν ποιεν\n" +
            " * dative of interest, expression “for”:  Your wife Elizabeth will bear a son for\n" +
            "   you η γυνη σου Ελισαβετ γεννησει υιον σοι (called the “dative of advantage” when\n" +
            "   the idea is to the subject’s advantage and “dative of disadvantage” when the idea\n" +
            "   is not to the subject’s advantage)\n" +
            " * reference or respect (English, with respect to): Consider yourselves dead to sin\n" +
            "   λογιζεσθε εαυτους ειναι νεκρους τη αμαρτια\n" +
            " * Locative (‘in’, ‘with’)\n" +
            " * sphere or realm in which something occurs: Blessed are the pure in heart μακαριοι\n" +
            "   οι καθαροι τη καρδια\n" +
            " * A time designation in the dative specifies when something occurs: On the third\n" +
            "   day he will be raised τη τριτη ημερα εγερθησεται\n" +
            " * Association, indicating “with”: Do not be unequally yoked with unbelievers μη\n" +
            "   γινεσθε ετεροζυγουντες απιστοις\n" +
            " * Instrumental (‘by’)\n" +
            " * The  manner in which something is done: He speaks boldly παρρησια λαλει\n" +
            " * The means or instrument by which an action is accomplished:  For it is by grace\n" +
            "    you have been saved Τη γαρ χαριτι εστε σεσωσμενοι"),

        new GrammarRule("Functions of the Adjective\n" +
            " * Attributive - gives a quality or attribute to the word it modifies: ο αγαθος\n" +
            "   λογος εστιν - in this situation adjective agrees with word it modifies in case,\n" +
            "   number, and gender.\n" +
            " * Substantival - when an adjective functions as a noun: ο αγαθος εστιν “the good\n" +
            "   (person) is” - in this situation case is determined by its function (subject,\n" +
            "   object, etc.) its gender and number by what it stands for.\n" +
            " * Predicate - asserts (predicates) something about the subject. ο ανθρωπος αγαθος\n" +
            "   verb ειμι may be implied"),

        new GrammarRule("Determining adjective function:\n" +
            " * If there is an article immediately before the adjective, it is either attributive\n" +
            "   (if there is a noun to modify) or substantival.  In attributive case, adjective\n" +
            "   may be before or after the noun: ο αγαθος ανθρωπος or ο ανθρωπος ο αγαθος\n" +
            "  (Exception:  demonstrative pronouns are attributive without the article: ουτος ὁ ἀνθρωπος \"this man\")\n" +
            " * If the noun has an article and the adjective does not (called anarthrous) then\n" +
            "   the adjective is functioning as a predicate: ο ανθρωπος αγαθος\n" +
            " * When there is no article context is your only guide."),

        new GrammarRule("Adjective Declensions p86\n" +
            "2-1-2:  masculine and neuter in 2nd, feminine in 1st\n" +
            "3-1-3:  masculine and neuter in 3rd, feminine in 1st\n" +
            "2-2:    all in 2nd (masculine and feminine have same endings)\n" +
            "3-3:    all in 3rd (masculine and feminine have same endings)\n" +
            "2-2 are listed in the lexicon with just 2nd declension masculine and neuter endings."),

        new GrammarRule("Article & a Prepositional Phrase\n" +
            "Articles can proceed prepositional phrases:\n" +
            " * Usually turning them into relative clauses:\n" +
            "     τους παιδας τους εν βηθλεεμ\n" +
            "     The children who are in Bethlehem\n" +
            " * Sometimes turning it into a substantive: The spoke the word of the Lord to all\n" +
            "     ελαλησαν τον λογον του κυριου πασιν τοις εν τῃ οικιᾳ\n" +
            "     who were in the house "),

        new GrammarRule("Neuter Plural Subjects\n" +
            "Greek normally uses a singular verb when the subject is neuter plural.  Indicates\n" +
            "the writer is viewing the subject as a group rather than as individuals.  In English\n" +
            "this will require a plural verb:\n" +
            "  δοκιμαζετε τα πνευματα ει εκ του θεου εστιν\n" +
            "  Test the spirits and see if they are from God."),

        new GrammarRule("Uses of Article in Greek\n" +
            " 1. Definite article\n" +
            " 2. Attaching adjective to preceding noun μετα των αγγελων των αγιων\n" +
            " 3. Is often used with proper names and other nouns that English would not use it with\n" +
            " 4. Can be used with participle or adjective to make it into a noun.\n" +
            " 5. Is sometimes omitted when English would use it: Εν αρχη ην ο λογος\n" +
            " 6. Can function as a personal or possessive pronoun: Οι δε ειπαν προς αυτον And they said to him\n" +
            " 7. Can govern two nouns together, linking them:\n" +
            "    προσδεχομενοι την μακαριαν ελπιδα και επιφανειαν της δοξης του μεγαλου θεου και\n" +
            "      σωτηρος ημων Ιησου Χριστου\n" +
            "    waiting for our blessed hope, the appearing of the glory of our great God and\n" +
            "      Savior Jesus Christ."),

        new GrammarRule("3rd Declension Paradigm, Masculine/Feminine:\n" +
            "Nomanative  Singular: ς     Plural: ες\n" +
            "Vocative    Singular:       Plural: ες\n" +
            "Genitive    Singular: ος    Plural: ων\n" +
            "Dative      Singular: ι     Plural: σι(ν)\n" +
            "Accusative  Singular: α/ν   Plural: ας\n"),

        new GrammarRule("3rd Declension Paradigm, Neuter:\n" +
            "Nomanative  Singular:       Plural: α\n" +
            "Vocative    Singular:       Plural: α\n" +
            "Genitive    Singular: ος    Plural: ων\n" +
            "Dative      Singular: ι     Plural: σι(ν)\n" +
            "Accusative  Singular:       Plural: α\n"),

        new GrammarRule("The Three Uses of αὐτος\n" +
           " 1. Personal pronoun.\n" +
           " 2. Adjectival intensive.  This is used to modify another word and is placed in the\n" +
           "    predicate position.  This is usually translated into English with a reflexive\n" +
           "    pronoun: αὐτος ὁ ἀποστολος the apostle himself.  When functioning as an intensive,\n" +
           "    αὐτος is usually in the nominative case and modifies the subject.\n" +
           " 3. Identical adjective, meaning “the same”.  Usually in the attributive position.\n" +
           "    και παλιν απελθων προσηυξατο τον αυτον λογον\n" +
           "    And again after going away he prayed the same word."),

        new GrammarRule("The demonstratives οὑτος and ἐκεινος can be used as pronouns or\n" +
            "adjectives.  Can also be used as a personal pronoun at times."),

        new GrammarRule("Degrees of an adjective:\n" +
            " * Positive: uncompared e.g μεγας large\n" +
            " * Comparative: greater of two items: e.g. μειζων larger\n" +
            " * Superlative: greatest, or comparison of 3 or more e.g. μεγιστος largest\n" +
            "    where English would expect a superlative"),

        new GrammarRule("ἀν used in conjunction with a relative pronoun makes it indefinite\n" +
            "e.g. ὅς who ὅς ἀν whoever"),

        new GrammarRule("Attraction: Occasionally the case of the relative pronoun is determined\n" +
            "not by its function in the relative clause but by its antecedent.  This usually\n" +
            "happens when it is in the immediate proximity of its antecedent, when the the\n" +
            "antecedent is dative or genitive and the relative pronoun normally would be\n" +
            "accusative."),

        new GrammarRule("Present active indicative paradigm:\n" +
            "     Stem  connecting personal form\n" +
            "           vowel      ending\n" +
            "1sg  λυ    ο                   λυω\n" +
            "2sg  λυ    ε          ς        λυεις\n" +
            "3sg  λυ    ε          ι        λυει\n" +
            "1pl  λυ    ο          μεν      λυομεν\n" +
            "2pl  λυ    ε          τε       λυετε\n" +
            "3pl  λυ    ο          νσι      λυουσι(ν)\n"),

        new GrammarRule("Contract verbs are verbs that end in α, ε, or ο.  In the present and\n" +
            "imperfect tenses the final vowel contracts with the connecting vowel as follows:\n" +
            " * two like vowels combine to the associated long vowel (except following two)" +
            "   * ο + ο = ου\n" +
            "   * ε + ε = ει\n" +
            " * (anything but ε) + ο = ω (commutative)\n" +
            "   * ε + ο = ου (commutative)\n" +
            " * anything + ω = ω (commutative)\n" +
            " * α + ε/η = α\n" +
            " * ε/η + α  = η\n" +
            " * α + ε + ι = ᾳ\n" +
            " * ε + α + ι = ῃ\n" +
            " * ο + ε + ι = οι\n" +
            " * Dipthongs:  if the contract vowel and the first vowel of the dipthong are the\n" +
            "   same, they combine to a single instance of the vowel.  Otherwise they contract.\n" +
            "   If the second vowel of the dipthong is a ι it subscripts if possible.\n"),

        new GrammarRule("Present middle/passive indicative paradigm:\n" +
            "     Stem  connecting personal form\n" +
            "           vowel      ending\n" +
            "1sg  λυ    ο          μαι      λυομαι\n" +
            "2sg  λυ    ε          σαι      λυῃ\n" +
            "3sg  λυ    ε          ται      λυεται\n" +
            "1pl  λυ    ο          μεθα     λυομεθα\n" +
            "2pl  λυ    ε          σθε      λυεσθε\n" +
            "3pl  λυ    ο          νται     λυονται\n"),

        new GrammarRule("A deponent verb is one that is middle or passive in form but active\n" +
            "in meaning.  I does not take a middle or passive meaning.\n" +
            "Verbs can be deponent in one tense but not in another (e.g. ἔρχομαι is deponent in " +
            "the present but non in the aorist.\n" +
            "75% of middle forms in the NT are deponent."),

        new GrammarRule("Four patterns for forming the future tense:\n" +
            "1. Same stem as present + σ (the tense formative) + connecting vowel (same as\n" +
            "   present tense) + primary active personal endings.\n" +
            "   * Contract verbs (ending in α, ε, ο), final vowel elongates: α, ε to η, ο to ω\n" +
            "   * Verbs ending in a stop, final consonant contracts with σ per the rules\n" +
            "     of square of stops.\n"),

        new GrammarRule("Future middle uses future active tense stem + σ (tense formative) +\n" +
            "connecting vowel + primary passive personal endings.")

        // Continue with 20 page 166

    );
  }
}
