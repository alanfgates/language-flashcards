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
        // Indicative active present
        new Word("λύω", "I loosen", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύεις", "you loosen", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύει", "s/he loosens", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λύομεν", "we loosen", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύετε", "you loosen", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύουσι", "they loosen", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),
        new Word("λύουσιν", "they loosen", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),
        //
        // Indicative active aorist
        new Word("ἔλυσα", "I loosened", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("ἔλυσας", "you loosened", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἔλυσε", "s/he loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἐλύσαμεν", "we loosened", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("ἐλύσατε", "you loosened", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("ἔλυσαν", "they loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),
        //
        // Indicative active second aorist
        new Word("ἔβαλον", "I threw", INDICATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("ἔβαλες", "you threw", INDICATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἔβαλε", "s/he threw", INDICATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἐβάλομεν", "we threw", INDICATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("ἐβάλετε", "you threw", INDICATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("ἔβαλον", "they threw", INDICATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Indicative active imperfect
        new Word("ἔλυον", "I was loosening", INDICATIVE, ACTIVE, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("ἔλυες", "you were loosening", INDICATIVE, ACTIVE, IMPERFECT, SECOND_PERSON, SINGULAR),
        new Word("ἔλυε", "s/he was loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἔλυεν", "s/he was loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἐλύομεν", "we were loosening", INDICATIVE, ACTIVE, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("ἐλύετε", "you were loosening", INDICATIVE, ACTIVE, IMPERFECT, SECOND_PERSON, PLURAL),
        new Word("ἔλυον", "they were loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, PLURAL),

        // Indicative active future
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

        // Indicative Passive Present
        new Word("λύομαι", "I was loosened", INDICATIVE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύῃ", "you were loosened", INDICATIVE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύεται", "s/he was loosened", INDICATIVE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυόμεθα", "we were loosened", INDICATIVE, PASSIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύεσθε", "you were loosened", INDICATIVE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύονται", "they were loosened", INDICATIVE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL),

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
        new Word("ἦν", "s/he was", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        // 2357
        new Word("λεγω", "I say"),
        new Word("ερω", "I will say λεγω", FUTURE),
        new Word("ειπον", "I said λεγω", AORIST),
        new Word("ειρηκα", "I have said λεγω", PERFECT),
        new Word("ειρημαι", "I have been said λεγω", MIDDLE, PERFECT),
        new Word("ειρημαι", "I have been said λεγω", PASSIVE, PERFECT),
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
        new Word("γεγενημαι", "I have been become γινομαι", MIDDLE, PERFECT), // TODO  figure out what this means
        new Word("γεγενημαι", "I have been become γινομαι", PASSIVE, PERFECT), // TODO  figure out what this means
        new Word("εγενηθην", "it became γινομαι", PASSIVE, AORIST), // TODO  figure out what this means
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
        new Word("πεποιημαι", "I have been done/made ποιεω", MIDDLE, PERFECT),
        new Word("πεποιημαι", "I have been done/made ποιεω", PASSIVE, PERFECT),
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
        new Word("ὡς", "as"),
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
        new Word("δεδωκα", "I have given, διδωμι-Az", PERFECT),
        new Word("δεδομαι", "I have given myself, διδωμι", MIDDLE, PERFECT),
        new Word("δεδομαι", "I have been given, διδωμι", PASSIVE, PERFECT),
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
        new Word("ἕν", "one", NEUTER)

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
            "    προσδεχομενοι την μακαριαν ελπιδα και επιφανειαν της δοξης του μεγαλου θεου και " +
            "      σωτηρος ημων Ιησου Χριστου\n" +
            "    waiting for our blessed hope, the appearing of the glory of our great God and " +
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
            "   (Note, superlative was dying off in Koine Greek and thus we often see comparative\n" +
            "    where English would expect a superlative")

        // Continue with chapter 14 page 113

    );
  }
}
