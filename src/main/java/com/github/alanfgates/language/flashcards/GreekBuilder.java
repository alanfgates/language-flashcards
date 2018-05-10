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
        new Word("λεγω", "I say", ACTIVE, PRESENT),
        new Word("ερω", "I will say λεγω", ACTIVE, FUTURE),
        new Word("ειπον", "I said λεγω", ACTIVE, AORIST),
        new Word("ειρηκα", "I have said λεγω", ACTIVE, PERFECT),
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
        new Word("πᾶν", "all every each", NEUTER)
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
            "Dental           Unvoiced τ  Voiced δ  Aspirates θ  Dental + σ = σ")


    );
  }
}
