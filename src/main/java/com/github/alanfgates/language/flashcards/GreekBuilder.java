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

import java.util.stream.Stream;

import static com.github.alanfgates.language.flashcards.Declension.*;
import static com.github.alanfgates.language.flashcards.Gender.*;
import static com.github.alanfgates.language.flashcards.Mood.*;
import static com.github.alanfgates.language.flashcards.Number.*;
import static com.github.alanfgates.language.flashcards.Other.*;
import static com.github.alanfgates.language.flashcards.Person.*;
import static com.github.alanfgates.language.flashcards.PartOfSpeech.*;
import static com.github.alanfgates.language.flashcards.Voice.*;
import static com.github.alanfgates.language.flashcards.Tense.*;

public class GreekBuilder extends BaseLanguageBuilder {

  @Override
  public String getLanguageName() {
    return "Greek";
  }

  @Override
  public Stream<Word> buildAllWords() {
    return Stream.of(
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

        // Indicative Active Future
        new Word("λύσω", "I will loosen", INDICATIVE, ACTIVE, FUTURE, FIRST_PERSON, SINGULAR),
        new Word("λύσεις", "you will loosen", INDICATIVE, ACTIVE, FUTURE, SECOND_PERSON, SINGULAR),
        new Word("λύσει", "s/he will loosen", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, SINGULAR),
        new Word("λύσομεν", "we will loosen", INDICATIVE, ACTIVE, FUTURE, FIRST_PERSON, PLURAL),
        new Word("λύσετε", "you will loosen", INDICATIVE, ACTIVE, FUTURE, SECOND_PERSON, PLURAL),
        new Word("λύσουσι", "they will loosen", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, PLURAL),
        new Word("λύσουσιν", "they will loosen", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, PLURAL),

        // Indicative Active Imperfect
        new Word("ἔλυον", "I was loosening", INDICATIVE, ACTIVE, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("ἔλυες", "you were loosening", INDICATIVE, ACTIVE, IMPERFECT, SECOND_PERSON, SINGULAR),
        new Word("ἔλυε", "s/he was loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἔλυεν", "s/he was loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἐλύομεν", "we were loosening", INDICATIVE, ACTIVE, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("ἐλύετε", "you were loosening", INDICATIVE, ACTIVE, IMPERFECT, SECOND_PERSON, PLURAL),
        new Word("ἔλυον", "they were loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, PLURAL),

        // Indicative Active Aorist
        new Word("ἔλυσα", "I loosened", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("ἔλυσας", "you loosened", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἔλυσε", "s/he loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἔλυσεν", "s/he loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἐλύσαμεν", "we loosened", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("ἐλύσατε", "you loosened", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("ἔλυσαν", "they loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),

        // Indicative Active Second Aorist
        new Word("ἔβαλον", "I threw", INDICATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("ἔβαλες", "you threw", INDICATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἔβαλε", "s/he threw", INDICATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἐβάλομεν", "we threw", INDICATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("ἐβάλετε", "you threw", INDICATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("ἔβαλον", "they threw", INDICATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Indicative Active Perfect
        new Word("λέλυκα", "I have loosened", INDICATIVE, ACTIVE, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("λέλυκας", "you have loosened", INDICATIVE, ACTIVE, PERFECT, SECOND_PERSON, SINGULAR),
        new Word("λέλυκε", "s/he has loosened", INDICATIVE, ACTIVE, PERFECT, THIRD_PERSON, SINGULAR),
        new Word("λέλυκεν", "s/he has loosened", INDICATIVE, ACTIVE, PERFECT, THIRD_PERSON, SINGULAR),
        new Word("λελύκαμεν", "we have loosened", INDICATIVE, ACTIVE, PERFECT, FIRST_PERSON, PLURAL),
        new Word("λελύκατε", "you have loosened", INDICATIVE, ACTIVE, PERFECT, SECOND_PERSON, PLURAL),
        new Word("λέλυκασι", "they have loosened", INDICATIVE, ACTIVE, PERFECT, THIRD_PERSON, PLURAL),
        new Word("λέλυκασιν", "they have loosened", INDICATIVE, ACTIVE, PERFECT, THIRD_PERSON, PLURAL),

        // Indicative Active Pluperfect
        new Word("ἐλελύκειν", "I have been loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, SINGULAR),
        new Word("λελύκειν", "I have been loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, SINGULAR),
        new Word("ἐλελύκεις", "you have been loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, SINGULAR),
        new Word("λελύκεις", "you have been loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, SINGULAR),
        new Word("ἐλελύκειν", "s/he has been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR),
        new Word("λελύκειν", "s/he has been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἐλελύκει", "s/he has been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR),
        new Word("λελύκει", "s/he has been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἐλελύκειμεν", "we have been loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, PLURAL),
        new Word("λελύκειμεν", "we have been loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, PLURAL),
        new Word("ἐλελύκειτε", "you have been loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, PLURAL),
        new Word("λελύκειτε", "you have been loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, PLURAL),
        new Word("ἐλελύκειααν", "they have been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, PLURAL),
        new Word("λελύκειααν", "they have been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, PLURAL),

        // Indicative Middle Present
        new Word("λύομαι", "I loosen myself", INDICATIVE, MIDDLE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύῃ", "you loosen yourself", INDICATIVE, MIDDLE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύεται", "s/he loosens her/himself", INDICATIVE, MIDDLE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυόμεθα", "we loosen ourselves", INDICATIVE, MIDDLE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύεσθε", "you loosen yourselves", INDICATIVE, MIDDLE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύονται", "they loosen themselves", INDICATIVE, MIDDLE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic indicative middle present
        new Word("δίδομαι", "I give myself - stem διδο", INDICATIVE, MIDDLE, PRESENT, FIRST_PERSON, SINGULAR),

        // Indicative Middle Future
        new Word("λύσομαι", "I will loosen myself", INDICATIVE, MIDDLE, FUTURE, FIRST_PERSON, SINGULAR),
        new Word("λύσῃ", "you will loosen yourself", INDICATIVE, MIDDLE, FUTURE, SECOND_PERSON, SINGULAR),
        new Word("λύσεται", "s/he will loosen her/himself", INDICATIVE, MIDDLE, FUTURE, THIRD_PERSON, SINGULAR),
        new Word("λυσόμεθα", "we will loosen ourselves", INDICATIVE, MIDDLE, FUTURE, FIRST_PERSON, PLURAL),
        new Word("λύσεσθε", "you will loosen yourselves", INDICATIVE, MIDDLE, FUTURE, SECOND_PERSON, PLURAL),
        new Word("λύσονται", "they will loosen themselves", INDICATIVE, MIDDLE, FUTURE, THIRD_PERSON, PLURAL),

        // Indicative Middle Imperfect
        new Word("ἐλυόμην", "I was loosing myself", INDICATIVE, MIDDLE, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("ἐλύου", "you were loosing yourself", INDICATIVE, MIDDLE, IMPERFECT, SECOND_PERSON, SINGULAR),
        new Word("ἐλύετο", "S/he was loosing her/himself", INDICATIVE, MIDDLE, IMPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἐλυόμεθα", "We were loosing ourselves", INDICATIVE, MIDDLE, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("ἐλύεσθε", "You were loosing yourselves", INDICATIVE, MIDDLE, IMPERFECT, SECOND_PERSON, PLURAL),
        new Word("ἐλύοντο", "They were loosing themselves", INDICATIVE, MIDDLE, IMPERFECT, THIRD_PERSON, PLURAL),

        // Indicative Middle Aorist
        new Word("ἐλυσάμην", "I loosed myself", INDICATIVE, MIDDLE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("ἐλύσω", "you loosed yourself", INDICATIVE, MIDDLE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἐλύσατο", "s/he loosed her/himself", INDICATIVE, MIDDLE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἐλυσάμεθα", "we loosed ourselves", INDICATIVE, MIDDLE, AORIST, FIRST_PERSON, PLURAL),
        new Word("ἐλύσασθε", "you loosed yourselves", INDICATIVE, MIDDLE, AORIST, SECOND_PERSON, PLURAL),
        new Word("ἐλύσαντο", "they loosed themselves", INDICATIVE, MIDDLE, AORIST, THIRD_PERSON, PLURAL),

        // Indicative Middle Second Arorist
        new Word("ἐγενόμην", "I became", INDICATIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("ἐγένου", "you became", INDICATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἐγένετο", "s/he became", INDICATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἐγενόμεθα", "we became", INDICATIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("ἐγένεσθε", "you became", INDICATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("ἐγένοντο", "they became", INDICATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Indicative Middle Perfect
        new Word("λέλυμαι", "I have loosened myself", INDICATIVE, MIDDLE, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("λέλυσαι", "you have loosened yourself", INDICATIVE, MIDDLE, PERFECT, SECOND_PERSON, SINGULAR),
        new Word("λέλυται", "s/he has loosened her/himself", INDICATIVE, MIDDLE, PERFECT, THIRD_PERSON, SINGULAR),
        new Word("λελύμεθα", "we have loosened ourseleves", INDICATIVE, MIDDLE, PERFECT, FIRST_PERSON, PLURAL),
        new Word("λελύσθε", "you have loosened yourselves", INDICATIVE, MIDDLE, PERFECT, SECOND_PERSON, PLURAL),
        new Word("λέλυνται", "they have loosened themselves", INDICATIVE, MIDDLE, PERFECT, THIRD_PERSON, PLURAL),

        // Omitting indicative middle/passive plu-perfect as it occurs only 7 times

        // Indicative Passive Present
        new Word("λύομαι", "I was loosened", INDICATIVE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύῃ", "you were loosened", INDICATIVE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύεται", "s/he was loosened", INDICATIVE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυόμεθα", "we were loosened", INDICATIVE, PASSIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύεσθε", "you were loosened", INDICATIVE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύονται", "they were loosened", INDICATIVE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic indicative passive present
        new Word("δίδομαι", "I am given - stem διδο", INDICATIVE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),

        // Indicative Passive Future
        new Word("λυθήσομαι", "I will be loosed", INDICATIVE, PASSIVE, FUTURE, FIRST_PERSON, SINGULAR),
        new Word("λυθήσῃ", "you will be loosed", INDICATIVE, PASSIVE, FUTURE, SECOND_PERSON, SINGULAR),
        new Word("λυθήσεται", "s/he will be loosed", INDICATIVE, PASSIVE, FUTURE, THIRD_PERSON, SINGULAR),
        new Word("λυθησόμεθα", "we will be loosed", INDICATIVE, PASSIVE, FUTURE, FIRST_PERSON, PLURAL),
        new Word("λυθήσεσθε", "you will be loosed", INDICATIVE, PASSIVE, FUTURE, SECOND_PERSON, PLURAL),
        new Word("λυθήσονται", "they will be loosed", INDICATIVE, PASSIVE, FUTURE, THIRD_PERSON, PLURAL),

        // Indicative Passive Second Future
        new Word("ἀποσταλήσομαι", "I will be sent", INDICATIVE, PASSIVE, SECOND_FUTURE, FIRST_PERSON, SINGULAR),
        new Word("ἀποσταλήσῃ", "you will be sent", INDICATIVE, PASSIVE, SECOND_FUTURE, SECOND_PERSON, SINGULAR),
        new Word("ἀποσταλήσεται", "s/he will be sent", INDICATIVE, PASSIVE, SECOND_FUTURE, THIRD_PERSON, SINGULAR),
        new Word("ἀποσταλησόμεθα", "we will be sent", INDICATIVE, PASSIVE, SECOND_FUTURE, FIRST_PERSON, PLURAL),
        new Word("ἀποσταλήσεσθε", "you will be sent", INDICATIVE, PASSIVE, SECOND_FUTURE, SECOND_PERSON, PLURAL),
        new Word("ἀποσταλήσονται", "they will be sent", INDICATIVE, PASSIVE, SECOND_FUTURE, THIRD_PERSON, PLURAL),

        // Indicative Passive Imperfect
        new Word("ἐλυόμην", "I was being loosed", INDICATIVE, PASSIVE, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("ἐλύου", "you were being loosed", INDICATIVE, PASSIVE, IMPERFECT, SECOND_PERSON, SINGULAR),
        new Word("ἐλύετο", "s/he was being loosed", INDICATIVE, PASSIVE, IMPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἐλυόμεθα", "we were being loosed", INDICATIVE, PASSIVE, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("ἐλύεσθε", "you were being loosed", INDICATIVE, PASSIVE, IMPERFECT, SECOND_PERSON, PLURAL),
        new Word("ἐλύοντο", "they were being loosed", INDICATIVE, PASSIVE, IMPERFECT, THIRD_PERSON, PLURAL),

        // Indicative Passive Aorist
        new Word("ἐλύθην", "I was loosed", INDICATIVE, PASSIVE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("ἐλύθης", "you were loosed", INDICATIVE, PASSIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἐλύθη", "s/he was loosed", INDICATIVE, PASSIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἐλύθημεν", "we were loosed", INDICATIVE, PASSIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("ἐλύθητε", "you were loosed", INDICATIVE, PASSIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("ἐλύθησαν", "they were loosed", INDICATIVE, PASSIVE, AORIST, THIRD_PERSON, PLURAL),

        // Indicative Passive Second Aorist
        new Word("ἐγράφην", "I was written", INDICATIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("ἐγράφης", "you were written", INDICATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἐγράφη", "s/he was written", INDICATIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἐγράφημεν", "we were written", INDICATIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("ἐγράφητε", "you were written", INDICATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("ἐγράφησαν", "they were written", INDICATIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Indicative Passive Perfect been
        new Word("λέλυμαι", "I have been loosened", INDICATIVE, PASSIVE, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("λέλυσαι", "you have been loosened", INDICATIVE, PASSIVE, PERFECT, SECOND_PERSON, SINGULAR),
        new Word("λέλυται", "s/he has been loosened", INDICATIVE, PASSIVE, PERFECT, THIRD_PERSON, SINGULAR),
        new Word("λελύμεθα", "we have been loosened", INDICATIVE, PASSIVE, PERFECT, FIRST_PERSON, PLURAL),
        new Word("λελύσθε", "you have been loosened", INDICATIVE, PASSIVE, PERFECT, SECOND_PERSON, PLURAL),
        new Word("λέλυνται", "they have been loosened", INDICATIVE, PASSIVE, PERFECT, THIRD_PERSON, PLURAL),

        // Subjunctive active present
        new Word("λύω", "I might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύῃς", "you might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύῃ", "s/he might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λύωμεν", "we might be loosening",  SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύητε", "you might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύωσι", "they might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),
        new Word("λύωσιν", "they might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic subjunctive active present
        new Word("διδῶ", "I might be giving - stem διδω", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),

        // Subjunctive active aorist
        new Word("λύσω", "I might loosen", SUBJUNCTIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("λύσῃς", "you might loosen", SUBJUNCTIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λύσῃ", "s/he might loosen", SUBJUNCTIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λύσωμεν", "we might loosen",  SUBJUNCTIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("λύσητε", "you might loosen", SUBJUNCTIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λύσωσι", "they might loosen", SUBJUNCTIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),
        new Word("λύσωσιν", "they might loosen", SUBJUNCTIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),

        // Subjunctive active second aorist
        new Word("λάβω", "I might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("λάβῃς", "you might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("λάβῃ", "s/he might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("λάβωμεν", "we might receive",  SUBJUNCTIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("λάβητε", "you might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("λάβωσι", "they might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),
        new Word("λάβωσιν", "they might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic subjunctive active second aorist
        new Word("δῶ", "I might give - stem δω", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),

        // Subjunctive middle present
        new Word("λύωμαι", "I might be loosening myself", SUBJUNCTIVE, MIDDLE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύῃ", "you might be loosening yourself", SUBJUNCTIVE, MIDDLE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύηται", "s/he might be loosening her/himself", SUBJUNCTIVE, MIDDLE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυώμεθα", "we might be loosening ourselves",  SUBJUNCTIVE, MIDDLE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύησθε", "you might be loosening yourselves", SUBJUNCTIVE, MIDDLE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύωνται", "they might be loosening themselves", SUBJUNCTIVE, MIDDLE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic subjunctive middle present
        new Word("διδῶμαι", "I might be giving myself - stem διδω", SUBJUNCTIVE, MIDDLE, PRESENT, FIRST_PERSON, SINGULAR),

        // Subjunctive middle aorist
        new Word("λύσωμαι", "I might loosen myself", SUBJUNCTIVE, MIDDLE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("λύσῃ", "you might loosen yourself", SUBJUNCTIVE, MIDDLE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λύσηται", "s/he might loosen her/himself", SUBJUNCTIVE, MIDDLE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λυσώμεθα", "we might loosen ourselves",  SUBJUNCTIVE, MIDDLE, AORIST, FIRST_PERSON, PLURAL),
        new Word("λύσησθε", "you might loosen yourselves", SUBJUNCTIVE, MIDDLE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λύσωνται", "they might loosen themselves", SUBJUNCTIVE, MIDDLE, AORIST, THIRD_PERSON, PLURAL),

        // Subjunctive middle second aorist
        new Word("γένωμαι", "I might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("γένῃ", "you might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("γένηται", "s/he might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("γενώμεθα", "we might become",  SUBJUNCTIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("γένησθε", "you might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("γένωνται", "they might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic subjunctive middle second aorist
        new Word("δῶμαι", "I might give myself - stem δω", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, SINGULAR),

        // Subjunctive passive present
        new Word("λύωμαι", "I might be being loosened", SUBJUNCTIVE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύῃ", "you might be being loosened", SUBJUNCTIVE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύηται", "s/he might be being loosened", SUBJUNCTIVE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυώμεθα", "we might be being loosened",  SUBJUNCTIVE, PASSIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύησθε", "you might be being loosened", SUBJUNCTIVE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύωνται", "they might be being loosened", SUBJUNCTIVE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic subjunctive passive present
        new Word("διδῶμαι", "I might be being given - stem διδω", SUBJUNCTIVE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),

        // Subjunctive passive aorist
        new Word("λυθῶ", "I might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("λυθῇς", "you might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λυθῇ", "s/he might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λυθῶμεν", "we might be loosened",  SUBJUNCTIVE, PASSIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("λυθῆτε", "you might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λυθῶσι", "they might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, THIRD_PERSON, PLURAL),
        new Word("λυθῶσιν", "they might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, THIRD_PERSON, PLURAL),

        // Subjunctive passive second aorist
        new Word("γραφῶ", "I might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("γραφῇς", "you might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("γραφῇ", "s/he might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("γραφῶμεν", "we might be written",  SUBJUNCTIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("γραφῆτε", "you might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("γραφῶσι", "they might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),
        new Word("γραφῶσιν", "they might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic subjunctive passive second aorist
        new Word("δοθῶ", "I might be given - stem δο", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),

        // Imperative active present
        new Word("λῦε", "keep loosing!", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λυέτω", "let him/her keep loosing!", IMPERATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λύετε", "keep loosing!", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λυέτωσαν", "let them keep loosing!", IMPERATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic imperative active present
        new Word("δίδοτε", "keep giving! - stem διδο", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),

        // Imperative active aorist
        new Word("λῦσον", "loose!", IMPERATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λυσάτω", "let him/her loose!", IMPERATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λύσατε", "loose!", IMPERATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λυσάτωσαν", "let them loose!", IMPERATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),

        // Imperative active second aorist
        new Word("λάβε", "throw!", IMPERATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("λαβέτω", "let him/her throw!", IMPERATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("λάβετε", "throw!", IMPERATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("λαβέτωσαν", "let them throw!", IMPERATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic imperative active second aorist
        new Word("δότε", "give! - stem δο", IMPERATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),

        // Imperative middle present
        new Word("λύου", "keep loosing yourself!", IMPERATIVE, MIDDLE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λυέσθω", "let him/her keep loosing him/herself!", IMPERATIVE, MIDDLE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λύεσθε", "keep loosing yourselves!", IMPERATIVE, MIDDLE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λυέσθωσαν", "let them keep loosing themselves!", IMPERATIVE, MIDDLE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic imperative middle present
        new Word("δίδοσθε", "keep giving yourselves! - stem διδο", IMPERATIVE, MIDDLE, PRESENT, SECOND_PERSON, PLURAL),

        // Imperative middle aorist
        new Word("λῦσαι", "loose yourself!", IMPERATIVE, MIDDLE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λυσάσθω", "let him/her loose him/herself!", IMPERATIVE, MIDDLE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λύσασθε", "loose yourselves!", IMPERATIVE, MIDDLE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λυσάσθωσαν", "let them loose themselves!", IMPERATIVE, MIDDLE, AORIST, THIRD_PERSON, PLURAL),

        // Imperative middle second aorist
        new Word("γενοῦ", "become!", IMPERATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("γενέσθω", "let him/her become!", IMPERATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("γένεσθε", "become!", IMPERATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("γενέσθωσαν", "let them become!", IMPERATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic imperative middle second aorist
        new Word("δόσθε", "give yourselves! - stem δο", IMPERATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL),

        // Imperative passive present
        new Word("λύου", "keep being loosed!", IMPERATIVE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λυέσθω", "let him/her keep being loosed!", IMPERATIVE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λύεσθε", "keep being loosed!", IMPERATIVE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λυέσθωσαν", "let them keep being loosed!", IMPERATIVE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic imperative passive present
        new Word("δίδοσθε", "keep being given! - stem διδο", IMPERATIVE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),

        // Imperative passive aorist
        new Word("λύθητι", "be loosed!", IMPERATIVE, PASSIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λυθήτω", "let him/her be loosed!", IMPERATIVE, PASSIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λύθητε", "be loosed!", IMPERATIVE, PASSIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λυθήτωσαν", "let them be loosed!", IMPERATIVE, PASSIVE, AORIST, THIRD_PERSON, PLURAL),

        // Imperative passive second aorist
        new Word("γράφητι", "be written!", IMPERATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("γραφήτω", "let him/her be written!", IMPERATIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("γράφητε", "be written!", IMPERATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("γραφήτωσαν", "let them be written!", IMPERATIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic imperative passive second aorist
        new Word("δόθητε", "be given! - stem δο", IMPERATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),

        // Infinitive active
        new Word("λύειν", "to continually loosen", INFINITIVE, ACTIVE, PRESENT),
        new Word("λῦσαι", "to loosen", INFINITIVE, ACTIVE, AORIST),
        new Word("λαβεῖν", "to receive", INFINITIVE, ACTIVE, SECOND_AORIST),
        new Word("λελυκέναι", "to have loosened", INFINITIVE, ACTIVE, PERFECT),

        // Athematic infinitive active
        new Word("διδόναι", "to keep giving - stem διδο", INFINITIVE, ACTIVE, PRESENT),
        new Word("δοῦναι", "to give - stem δο", INFINITIVE, ACTIVE, SECOND_AORIST),

        // Infinitive middle
        new Word("λύεσθαι", "to continually loosen oneself", INFINITIVE, MIDDLE, PRESENT),
        new Word("λύσασθαι", "to loosen oneself", INFINITIVE, MIDDLE, AORIST),
        new Word("λαβέσθαι", "to receive oneself", INFINITIVE, MIDDLE, SECOND_AORIST),
        new Word("λελύσθαι", "to have loosened oneself", INFINITIVE, MIDDLE, PERFECT),

        // Athematic infinitive middle
        new Word("δίδοσθαι", "to keep giving oneself - stem διδο", INFINITIVE, MIDDLE, PRESENT),
        new Word("δόσθαι", "to give oneself - stem δο", INFINITIVE, MIDDLE, SECOND_AORIST),

        // Infinitive passive
        new Word("λύεσθαι", "to continually have been loosened", INFINITIVE, PASSIVE, PRESENT),
        new Word("λυθῆναι", "to have been loosened", INFINITIVE, PASSIVE, AORIST),
        new Word("γραφῆναι", "to have received", INFINITIVE, PASSIVE, SECOND_AORIST),
        new Word("λελῦσθαι", "to have been loosened", INFINITIVE, PASSIVE, PERFECT),

        // Athematic infinitive passive
        new Word("δίδοσθαι", "to keep being given - stem διδο", INFINITIVE, PASSIVE, PRESENT),
        new Word("δοθῆναι", "to be given - stem δο", INFINITIVE, PASSIVE, SECOND_AORIST),

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

        // Athematic participle active present
        new Word("διδούς", "giving - stem διδο", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("διδοῦσα", "giving - stem διδο", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("διδόν", "giving - stem διδο", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, SINGULAR),

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

        // Athematic participle active second aorist
        new Word("δούς", "giving - stem δο", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("δοῦσα", "giving - stem δο", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, NOMINATIVE, SINGULAR),
        new Word("δόν", "giving - stem δο", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, NOMINATIVE, SINGULAR),

        // Participle active perfect
        new Word("λελυκώς", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λελυκότος", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, GENITIVE, SINGULAR),
        new Word("λελυκότι", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, DATIVE, SINGULAR),
        new Word("λελυκότα", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("λελυκότες", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λελυκότων", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, GENITIVE, PLURAL),
        new Word("λελυκόσι", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, DATIVE, PLURAL),
        new Word("λελυκόσιν", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, DATIVE, PLURAL),
        new Word("λελυκότας", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λελυκυῖα", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λελυκυῖας", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, GENITIVE, SINGULAR),
        new Word("λελυκυῖᾳ", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, DATIVE, SINGULAR),
        new Word("λελυκυῖαν", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λελυκυῖαι", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, NOMINATIVE, PLURAL),
        new Word("λελυκυιων", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, GENITIVE, PLURAL),
        new Word("λελυκυῖαις", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, DATIVE, PLURAL),
        new Word("λελυκυίας", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, ACCUSATIVE, PLURAL),
        new Word("λελυκός", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, NOMINATIVE, SINGULAR),
        new Word("λελυκότος", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, GENITIVE, SINGULAR),
        new Word("λελυκότι", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, DATIVE, SINGULAR),
        new Word("λελυκός", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("λελυκότα", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, NOMINATIVE, PLURAL),
        new Word("λελυκότων", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, GENITIVE, PLURAL),
        new Word("λελυκόσι", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, DATIVE, PLURAL),
        new Word("λελυκόσιν", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, DATIVE, PLURAL),
        new Word("λελυκότα", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, ACCUSATIVE, PLURAL),

        // Participle middle present
        new Word("λυόμενος", "loosening", PARTICIPLE, MIDDLE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λυομένου", "loosening", PARTICIPLE, MIDDLE, PRESENT, MASCULINE, GENITIVE, SINGULAR),
        new Word("λυομένῳ", "loosening", PARTICIPLE, MIDDLE, PRESENT, MASCULINE, DATIVE, SINGULAR),
        new Word("λυόμενον", "loosening", PARTICIPLE, MIDDLE, PRESENT, MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("λυόμενοι", "loosening", PARTICIPLE, MIDDLE, PRESENT, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λυομένων", "loosening", PARTICIPLE, MIDDLE, PRESENT, MASCULINE, GENITIVE, PLURAL),
        new Word("λυομένοις", "loosening", PARTICIPLE, MIDDLE, PRESENT, MASCULINE, DATIVE, PLURAL),
        new Word("λυομένους", "loosening", PARTICIPLE, MIDDLE, PRESENT, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λυομένη", "loosening", PARTICIPLE, MIDDLE, PRESENT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λυομένης", "loosening", PARTICIPLE, MIDDLE, PRESENT, FEMININE, GENITIVE, SINGULAR),
        new Word("λυομένῃ", "loosening", PARTICIPLE, MIDDLE, PRESENT, FEMININE, DATIVE, SINGULAR),
        new Word("λυομένην", "loosening", PARTICIPLE, MIDDLE, PRESENT, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λυόμεναι", "loosening", PARTICIPLE, MIDDLE, PRESENT, FEMININE, NOMINATIVE, PLURAL),
        new Word("λυομένων", "loosening", PARTICIPLE, MIDDLE, PRESENT, FEMININE, GENITIVE, PLURAL),
        new Word("λυομέναις", "loosening", PARTICIPLE, MIDDLE, PRESENT, FEMININE, DATIVE, PLURAL),
        new Word("λυομένας", "loosening", PARTICIPLE, MIDDLE, PRESENT, FEMININE, ACCUSATIVE, PLURAL),
        new Word("λυόμενον", "loosening", PARTICIPLE, MIDDLE, PRESENT, NEUTER, NOMINATIVE, SINGULAR),
        new Word("λυομένου", "loosening", PARTICIPLE, MIDDLE, PRESENT, NEUTER, GENITIVE, SINGULAR),
        new Word("λυομένῳ", "loosening", PARTICIPLE, MIDDLE, PRESENT, NEUTER, DATIVE, SINGULAR),
        new Word("λυόμενον", "loosening", PARTICIPLE, MIDDLE, PRESENT, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("λυόμενα", "loosening", PARTICIPLE, MIDDLE, PRESENT, NEUTER, NOMINATIVE, PLURAL),
        new Word("λυομένων", "loosening", PARTICIPLE, MIDDLE, PRESENT, NEUTER, GENITIVE, PLURAL),
        new Word("λυομένοις", "loosening", PARTICIPLE, MIDDLE, PRESENT, NEUTER, DATIVE, PLURAL),
        new Word("λυόμενα", "loosening", PARTICIPLE, MIDDLE, PRESENT, NEUTER, ACCUSATIVE, PLURAL),

        // Athematic participle middle present
        new Word("διδόμενος", "giving oneself - stem διδο", PARTICIPLE, MIDDLE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),

        // Participle middle aorist
        new Word("λυσάμενος", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λυσαμένου", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, GENITIVE, SINGULAR),
        new Word("λυσαμένῳ", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, DATIVE, SINGULAR),
        new Word("λυσάμενον", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("λυσάμενοι", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λυσαμένων", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, GENITIVE, PLURAL),
        new Word("λυσαμένοις", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, DATIVE, PLURAL),
        new Word("λυσαμένους", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λυσαμένη", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λυσαμένης", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, GENITIVE, SINGULAR),
        new Word("λυσαμένῃ", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, DATIVE, SINGULAR),
        new Word("λυσαμένην", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λυσάμεναι", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, NOMINATIVE, PLURAL),
        new Word("λυσαμένων", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, GENITIVE, PLURAL),
        new Word("λυσαμέναις", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, DATIVE, PLURAL),
        new Word("λυσαμένας", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, ACCUSATIVE, PLURAL),
        new Word("λυσάμενον", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, NOMINATIVE, SINGULAR),
        new Word("λυσαμένου", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, GENITIVE, SINGULAR),
        new Word("λυσαμένῳ", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, DATIVE, SINGULAR),
        new Word("λυσάμενον", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("λυσάμενα", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, NOMINATIVE, PLURAL),
        new Word("λυσαμένων", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, GENITIVE, PLURAL),
        new Word("λυσαμένοις", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, DATIVE, PLURAL),
        new Word("λυσάμενα", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, ACCUSATIVE, PLURAL),

        // Participle middle second aorist
        new Word("γενόμενος", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("γενομένου", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, GENITIVE, SINGULAR),
        new Word("γενομένῳ", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, DATIVE, SINGULAR),
        new Word("γενόμενον", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("γενόμενοι", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, NOMINATIVE, PLURAL),
        new Word("γενομένων", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, GENITIVE, PLURAL),
        new Word("γενομένοις", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, DATIVE, PLURAL),
        new Word("γενομένους", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("γενομένη", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, NOMINATIVE, SINGULAR),
        new Word("γενομένης", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, GENITIVE, SINGULAR),
        new Word("γενομένῃ", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, DATIVE, SINGULAR),
        new Word("γενομένην", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("γενόμεναι", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, NOMINATIVE, PLURAL),
        new Word("γενομένων", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, GENITIVE, PLURAL),
        new Word("γενομέναις", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, DATIVE, PLURAL),
        new Word("γενομένας", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, ACCUSATIVE, PLURAL),
        new Word("γενόμενον", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, NOMINATIVE, SINGULAR),
        new Word("γενομένου", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, GENITIVE, SINGULAR),
        new Word("γενομένῳ", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, DATIVE, SINGULAR),
        new Word("γενόμενον", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("γενόμενα", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, NOMINATIVE, PLURAL),
        new Word("γενομένων", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, GENITIVE, PLURAL),
        new Word("γενομένοις", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, DATIVE, PLURAL),
        new Word("γενόμενα", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, ACCUSATIVE, PLURAL),

        // Athematic participle middle second aorist
        new Word("δόμενος", "giving oneself - stem δο", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR),

        // Participle middle perfect
        new Word("λελυμένος", "loosening", PARTICIPLE, MIDDLE, PERFECT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λελυμένου", "loosening", PARTICIPLE, MIDDLE, PERFECT, MASCULINE, GENITIVE, SINGULAR),
        new Word("λελυμένῳ", "loosening", PARTICIPLE, MIDDLE, PERFECT, MASCULINE, DATIVE, SINGULAR),
        new Word("λελυμένον", "loosening", PARTICIPLE, MIDDLE, PERFECT, MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("λελυμένοι", "loosening", PARTICIPLE, MIDDLE, PERFECT, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λελυμένων", "loosening", PARTICIPLE, MIDDLE, PERFECT, MASCULINE, GENITIVE, PLURAL),
        new Word("λελυμένοις", "loosening", PARTICIPLE, MIDDLE, PERFECT, MASCULINE, DATIVE, PLURAL),
        new Word("λελυμένους", "loosening", PARTICIPLE, MIDDLE, PERFECT, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λελυμένη", "loosening", PARTICIPLE, MIDDLE, PERFECT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λελυμένης", "loosening", PARTICIPLE, MIDDLE, PERFECT, FEMININE, GENITIVE, SINGULAR),
        new Word("λελυμένῃ", "loosening", PARTICIPLE, MIDDLE, PERFECT, FEMININE, DATIVE, SINGULAR),
        new Word("λελυμένην", "loosening", PARTICIPLE, MIDDLE, PERFECT, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λελυμέναι", "loosening", PARTICIPLE, MIDDLE, PERFECT, FEMININE, NOMINATIVE, PLURAL),
        new Word("λελυμένων", "loosening", PARTICIPLE, MIDDLE, PERFECT, FEMININE, GENITIVE, PLURAL),
        new Word("λελυμέναις", "loosening", PARTICIPLE, MIDDLE, PERFECT, FEMININE, DATIVE, PLURAL),
        new Word("λελυμένας", "loosening", PARTICIPLE, MIDDLE, PERFECT, FEMININE, ACCUSATIVE, PLURAL),
        new Word("λελυμένον", "loosening", PARTICIPLE, MIDDLE, PERFECT, NEUTER, NOMINATIVE, SINGULAR),
        new Word("λελυμένου", "loosening", PARTICIPLE, MIDDLE, PERFECT, NEUTER, GENITIVE, SINGULAR),
        new Word("λελυμένῳ", "loosening", PARTICIPLE, MIDDLE, PERFECT, NEUTER, DATIVE, SINGULAR),
        new Word("λελυμένον", "loosening", PARTICIPLE, MIDDLE, PERFECT, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("λελυμένα", "loosening", PARTICIPLE, MIDDLE, PERFECT, NEUTER, NOMINATIVE, PLURAL),
        new Word("λελυμένων", "loosening", PARTICIPLE, MIDDLE, PERFECT, NEUTER, GENITIVE, PLURAL),
        new Word("λελυμένοις", "loosening", PARTICIPLE, MIDDLE, PERFECT, NEUTER, DATIVE, PLURAL),
        new Word("λελυμένα", "loosening", PARTICIPLE, MIDDLE, PERFECT, NEUTER, ACCUSATIVE, PLURAL),

        // Participle passive present
        new Word("λυόμενος", "loosening", PARTICIPLE, PASSIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λυομένου", "loosening", PARTICIPLE, PASSIVE, PRESENT, MASCULINE, GENITIVE, SINGULAR),
        new Word("λυομένῳ", "loosening", PARTICIPLE, PASSIVE, PRESENT, MASCULINE, DATIVE, SINGULAR),
        new Word("λυόμενον", "loosening", PARTICIPLE, PASSIVE, PRESENT, MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("λυόμενοι", "loosening", PARTICIPLE, PASSIVE, PRESENT, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λυομένων", "loosening", PARTICIPLE, PASSIVE, PRESENT, MASCULINE, GENITIVE, PLURAL),
        new Word("λυομένοις", "loosening", PARTICIPLE, PASSIVE, PRESENT, MASCULINE, DATIVE, PLURAL),
        new Word("λυομένους", "loosening", PARTICIPLE, PASSIVE, PRESENT, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λυομένη", "loosening", PARTICIPLE, PASSIVE, PRESENT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λυομένης", "loosening", PARTICIPLE, PASSIVE, PRESENT, FEMININE, GENITIVE, SINGULAR),
        new Word("λυομένῃ", "loosening", PARTICIPLE, PASSIVE, PRESENT, FEMININE, DATIVE, SINGULAR),
        new Word("λυομένην", "loosening", PARTICIPLE, PASSIVE, PRESENT, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λυόμεναι", "loosening", PARTICIPLE, PASSIVE, PRESENT, FEMININE, NOMINATIVE, PLURAL),
        new Word("λυομένων", "loosening", PARTICIPLE, PASSIVE, PRESENT, FEMININE, GENITIVE, PLURAL),
        new Word("λυομέναις", "loosening", PARTICIPLE, PASSIVE, PRESENT, FEMININE, DATIVE, PLURAL),
        new Word("λυομένας", "loosening", PARTICIPLE, PASSIVE, PRESENT, FEMININE, ACCUSATIVE, PLURAL),
        new Word("λυόμενον", "loosening", PARTICIPLE, PASSIVE, PRESENT, NEUTER, NOMINATIVE, SINGULAR),
        new Word("λυομένου", "loosening", PARTICIPLE, PASSIVE, PRESENT, NEUTER, GENITIVE, SINGULAR),
        new Word("λυομένῳ", "loosening", PARTICIPLE, PASSIVE, PRESENT, NEUTER, DATIVE, SINGULAR),
        new Word("λυόμενον", "loosening", PARTICIPLE, PASSIVE, PRESENT, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("λυόμενα", "loosening", PARTICIPLE, PASSIVE, PRESENT, NEUTER, NOMINATIVE, PLURAL),
        new Word("λυομένων", "loosening", PARTICIPLE, PASSIVE, PRESENT, NEUTER, GENITIVE, PLURAL),
        new Word("λυομένοις", "loosening", PARTICIPLE, PASSIVE, PRESENT, NEUTER, DATIVE, PLURAL),
        new Word("λυόμενα", "loosening", PARTICIPLE, PASSIVE, PRESENT, NEUTER, ACCUSATIVE, PLURAL),

        // Athematic participle passive present
        new Word("διδόμενος", "being given - stem διδο", PARTICIPLE, PASSIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),

        // Participle passive aorist
        new Word("λυθείς", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λυθέντος", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, GENITIVE, SINGULAR),
        new Word("λυθέντι", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, DATIVE, SINGULAR),
        new Word("λυθέντα", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("λυθέντες", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λυθέντων", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, GENITIVE, PLURAL),
        new Word("λυθεῖσι", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, DATIVE, PLURAL),
        new Word("λυθεῖσιν", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, DATIVE, PLURAL),
        new Word("λυθέντας", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λυθεῖσα", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λυθείσης", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, GENITIVE, SINGULAR),
        new Word("λυθείσῃ", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, DATIVE, SINGULAR),
        new Word("λυθεῖσαν", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λυθεῖσαι", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, NOMINATIVE, PLURAL),
        new Word("λυθεισῶν", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, GENITIVE, PLURAL),
        new Word("λυθείσαις", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, DATIVE, PLURAL),
        new Word("λυθείσας", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, ACCUSATIVE, PLURAL),
        new Word("λυθέν", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, NOMINATIVE, SINGULAR),
        new Word("λυθέντος", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, GENITIVE, SINGULAR),
        new Word("λυθέντι", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, DATIVE, SINGULAR),
        new Word("λυθέν", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("λυθέντα", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, NOMINATIVE, PLURAL),
        new Word("λυθέντων", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, GENITIVE, PLURAL),
        new Word("λυθεῖσι", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, DATIVE, PLURAL),
        new Word("λυθεῖσιν", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, DATIVE, PLURAL),
        new Word("λυθέντα", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, ACCUSATIVE, PLURAL),

        // No verb occurring 50 or more times in the NT has 2nd passive participle

        // Athematic participle passive second aorist
        new Word("δοθείς", "being given - stem δο", PARTICIPLE, PASSIVE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR),


        // Participle passive perfect
        new Word("λελυμένος", "loosening", PARTICIPLE, PASSIVE, PERFECT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λελυμένου", "loosening", PARTICIPLE, PASSIVE, PERFECT, MASCULINE, GENITIVE, SINGULAR),
        new Word("λελυμένῳ", "loosening", PARTICIPLE, PASSIVE, PERFECT, MASCULINE, DATIVE, SINGULAR),
        new Word("λελυμένον", "loosening", PARTICIPLE, PASSIVE, PERFECT, MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("λελυμένοι", "loosening", PARTICIPLE, PASSIVE, PERFECT, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λελυμένων", "loosening", PARTICIPLE, PASSIVE, PERFECT, MASCULINE, GENITIVE, PLURAL),
        new Word("λελυμένοις", "loosening", PARTICIPLE, PASSIVE, PERFECT, MASCULINE, DATIVE, PLURAL),
        new Word("λελυμένους", "loosening", PARTICIPLE, PASSIVE, PERFECT, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λελυμένη", "loosening", PARTICIPLE, PASSIVE, PERFECT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λελυμένης", "loosening", PARTICIPLE, PASSIVE, PERFECT, FEMININE, GENITIVE, SINGULAR),
        new Word("λελυμένῃ", "loosening", PARTICIPLE, PASSIVE, PERFECT, FEMININE, DATIVE, SINGULAR),
        new Word("λελυμένην", "loosening", PARTICIPLE, PASSIVE, PERFECT, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λελυμέναι", "loosening", PARTICIPLE, PASSIVE, PERFECT, FEMININE, NOMINATIVE, PLURAL),
        new Word("λελυμένων", "loosening", PARTICIPLE, PASSIVE, PERFECT, FEMININE, GENITIVE, PLURAL),
        new Word("λελυμέναις", "loosening", PARTICIPLE, PASSIVE, PERFECT, FEMININE, DATIVE, PLURAL),
        new Word("λελυμένας", "loosening", PARTICIPLE, PASSIVE, PERFECT, FEMININE, ACCUSATIVE, PLURAL),
        new Word("λελυμένον", "loosening", PARTICIPLE, PASSIVE, PERFECT, NEUTER, NOMINATIVE, SINGULAR),
        new Word("λελυμένου", "loosening", PARTICIPLE, PASSIVE, PERFECT, NEUTER, GENITIVE, SINGULAR),
        new Word("λελυμένῳ", "loosening", PARTICIPLE, PASSIVE, PERFECT, NEUTER, DATIVE, SINGULAR),
        new Word("λελυμένον", "loosening", PARTICIPLE, PASSIVE, PERFECT, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("λελυμένα", "loosening", PARTICIPLE, PASSIVE, PERFECT, NEUTER, NOMINATIVE, PLURAL),
        new Word("λελυμένων", "loosening", PARTICIPLE, PASSIVE, PERFECT, NEUTER, GENITIVE, PLURAL),
        new Word("λελυμένοις", "loosening", PARTICIPLE, PASSIVE, PERFECT, NEUTER, DATIVE, PLURAL),
        new Word("λελυμένα", "loosening", PARTICIPLE, PASSIVE, PERFECT, NEUTER, ACCUSATIVE, PLURAL),

        // Optative Active Present
        new Word("λύοιμι", "I wish to keep loosening", OPTATIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύοις", "you wish to keep loosening", OPTATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύοι", "s/he wishes to keep loosening", OPTATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λύοιμεν", "we wish to keep loosening", OPTATIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύοιτε", "you wish to keep loosening", OPTATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύοιεν", "they wish to keep loosening", OPTATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Optative Active Aorist
        new Word("λύσαιμι", "I wish to loosen", OPTATIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("λύσαις", "you wish to loosen", OPTATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λύσαι", "s/he wishes to loosen", OPTATIVE, AORIST, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λύσαιμεν", "we wish to loosen", OPTATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("λύσαιτε", "you wish to loosen", OPTATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λύσαιεν", "they wish to loosen", OPTATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),

        // Optative Active Second Aorist
        new Word("βάλοιμι", "I wish to throw", OPTATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("βάλοις", "you wish to throw", OPTATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("βάλοι", "s/he wishes to throw", OPTATIVE, AORIST, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("βάλοιμεν", "we wish to throw", OPTATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("βάλοιτε", "you wish to throw", OPTATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("βάλοιεν", "they wish to throw", OPTATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Optative Middle Present
        new Word("λυοίμην", "I wish to keep loosening myself", OPTATIVE, MIDDLE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύοιο", "you wish to keep loosening yourself", OPTATIVE, MIDDLE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύοιτο", "s/he wishes to keep loosening her/himself", OPTATIVE, MIDDLE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυοίμεθα", "we wish to keep loosening ourselves", OPTATIVE, MIDDLE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύοισθε", "you wish to keep loosening yourselves", OPTATIVE, MIDDLE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύοιντο", "they wish to keep loosening themselves", OPTATIVE, MIDDLE, PRESENT, THIRD_PERSON, PLURAL),

        // Optative Middle Aorist
        new Word("λυσαίμην", "I wish to loosen myself", OPTATIVE, MIDDLE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("λύσαιο", "you wish to loosen yourself", OPTATIVE, MIDDLE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λύσαιτο", "s/he wishes to loosen her/himself", OPTATIVE, MIDDLE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λυσαίμεθα", "we wish to loosen ourselves", OPTATIVE, MIDDLE, AORIST, FIRST_PERSON, PLURAL),
        new Word("λύσαισθε", "you wish to loosen yourselves", OPTATIVE, MIDDLE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λύσαιντο", "they wish to loosen themselves", OPTATIVE, MIDDLE, AORIST, THIRD_PERSON, PLURAL),

        // Optative Middle Second Aorist
        new Word("βαλοίμην", "I wish to throw myself", OPTATIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("βάλοιο", "you wish to throw yourself", OPTATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("βάλοιτο", "s/he wishes to throw her/himself", OPTATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("βαλοίμεθα", "we wish to throw ourselves", OPTATIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("βάλοισθε", "you wish to throw yourselves", OPTATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("βάλοιντο", "they wish to throw themselves", OPTATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Optative Passive Present
        new Word("λυοίμην", "I wish to keep being loosened", OPTATIVE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύοιο", "you wish to keep being loosened", OPTATIVE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύοιτο", "s/he wishes to keep being loosened", OPTATIVE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυοίμεθα", "we wish to keep being loosened", OPTATIVE, PASSIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύοισθε", "you wish to keep being loosened", OPTATIVE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύοιντο", "they wish to keep being loosened", OPTATIVE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Optative Passive Aorist
        new Word("λυθείην", "I wish to be loosened", OPTATIVE, PASSIVE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("λυθείης", "you wish to be loosened", OPTATIVE, PASSIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λυθείη", "s/he wishes to be loosened", OPTATIVE, PASSIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λυθείημεν", "we wish to be loosened", OPTATIVE, PASSIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("λυθείητε", "you wish to be loosened", OPTATIVE, PASSIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λυθείησαν", "they wish to be loosened", OPTATIVE, PASSIVE, AORIST, THIRD_PERSON, PLURAL),

        // Optative Passive Second Aorist
        new Word("γραφείην", "I wish to be written", OPTATIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("γραφείης", "you wish to be written", OPTATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("γραφείη", "s/he wishes to be written", OPTATIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("γραφείημεν", "we wish to be written", OPTATIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("γραφείητε", "you wish to be written", OPTATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("γραφείησαν", "they wish to be written", OPTATIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        //----------------------------------------------------------------------------------------
        // NOUN FORMS
        new Word("λόγος", "word - root λόγο", MASCULINE, NOMINATIVE, SINGULAR, SECOND_DECLENSION),
        new Word("λόγε", "word - root λόγο", MASCULINE, VOCATIVE, SINGULAR, SECOND_DECLENSION),
        new Word("λόγου", "word - root λόγο", MASCULINE, GENITIVE, SINGULAR, SECOND_DECLENSION),
        new Word("λόγῳ", "word - root λόγο", MASCULINE, DATIVE, SINGULAR, SECOND_DECLENSION),
        new Word("λόγον", "word - root λόγο", MASCULINE, ACCUSATIVE, SINGULAR, SECOND_DECLENSION),
        new Word("λόγοι", "words - root λόγο", MASCULINE, NOMINATIVE, PLURAL, SECOND_DECLENSION),
        new Word("λόγοι", "words - root λόγο", MASCULINE, VOCATIVE, PLURAL, SECOND_DECLENSION),
        new Word("λόγων", "words - root λόγο", MASCULINE, GENITIVE, PLURAL, SECOND_DECLENSION),
        new Word("λόγοις", "words - root λόγο", MASCULINE, DATIVE, PLURAL, SECOND_DECLENSION),
        new Word("λόγους", "words - root λόγο", MASCULINE, ACCUSATIVE, PLURAL, SECOND_DECLENSION),

        new Word("γραφή", "writing - root γραφή", FEMININE, NOMINATIVE, SINGULAR, FIRST_DECLENSION),
        new Word("γραφή", "writing - root γραφή", FEMININE, VOCATIVE, SINGULAR, FIRST_DECLENSION),
        new Word("γραφῆς", "writing - root γραφή", FEMININE, GENITIVE, SINGULAR, FIRST_DECLENSION),
        new Word("γραφῇ", "writing - root γραφή", FEMININE, DATIVE, SINGULAR, FIRST_DECLENSION),
        new Word("γραφήν", "writing - root γραφή", FEMININE, ACCUSATIVE, SINGULAR, FIRST_DECLENSION),
        new Word("γραφαί", "writings - root γραφή", FEMININE, NOMINATIVE, PLURAL, FIRST_DECLENSION),
        new Word("γραφαί", "writings - root γραφή", FEMININE, VOCATIVE, PLURAL, FIRST_DECLENSION),
        new Word("γραφῶν", "writings - root γραφή", FEMININE, GENITIVE, PLURAL, FIRST_DECLENSION),
        new Word("γραφαῖς", "writings - root γραφή", FEMININE, DATIVE, PLURAL, FIRST_DECLENSION),
        new Word("γραφάς", "writings - root γραφή", FEMININE, ACCUSATIVE, PLURAL, FIRST_DECLENSION),

        new Word("ἔργον", "work - root ἔργο", NEUTER, NOMINATIVE, SINGULAR, SECOND_DECLENSION),
        new Word("ἔργου", "work - root ἔργο", NEUTER, GENITIVE, SINGULAR, SECOND_DECLENSION),
        new Word("ἔργῳ", "work - root ἔργο", NEUTER, DATIVE, SINGULAR, SECOND_DECLENSION),
        new Word("ἔργον", "work - root ἔργο", NEUTER, ACCUSATIVE, SINGULAR, SECOND_DECLENSION),
        new Word("ἔργα", "works - root ἔργο", NEUTER, NOMINATIVE, PLURAL, SECOND_DECLENSION),
        new Word("ἔργων", "works - root ἔργο", NEUTER, GENITIVE, PLURAL, SECOND_DECLENSION),
        new Word("ἔργοις", "works - root ἔργο", NEUTER, DATIVE, PLURAL, SECOND_DECLENSION),
        new Word("ἔργα", "works - root ἔργο", NEUTER, ACCUSATIVE, PLURAL, SECOND_DECLENSION),

        new Word("σάρξ", "flesh - root σάρκ", FEMININE, NOMINATIVE, SINGULAR, THIRD_DECLENSION),
        new Word("σάρκ", "flesh - root σάρκ", FEMININE, VOCATIVE, SINGULAR, THIRD_DECLENSION), // TODO not sure this is right
        new Word("σαρκός", "flesh - root σάρκ", FEMININE, GENITIVE, SINGULAR, THIRD_DECLENSION),
        new Word("σαρκί", "flesh - root σάρκ", FEMININE, DATIVE, SINGULAR, THIRD_DECLENSION),
        new Word("σάρκα", "flesh - root σάρκ", FEMININE, ACCUSATIVE, SINGULAR, THIRD_DECLENSION),
        new Word("σάρκες", "fleshes - root σάρκ", FEMININE, NOMINATIVE, PLURAL, THIRD_DECLENSION),
        new Word("σάρκες", "fleshes - root σάρκ", FEMININE, VOCATIVE, PLURAL, THIRD_DECLENSION),
        new Word("σαρκῶν", "fleshes - root σάρκ", FEMININE, GENITIVE, PLURAL, THIRD_DECLENSION),
        new Word("σαρξί", "fleshes - root σάρκ", FEMININE, DATIVE, PLURAL, THIRD_DECLENSION),
        new Word("σαρξίν", "fleshes - root σάρκ", FEMININE, DATIVE, PLURAL, THIRD_DECLENSION),
        new Word("σάρκας", "fleshes - root σάρκ", FEMININE, ACCUSATIVE, PLURAL, THIRD_DECLENSION),

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
        //new Word("ἐν dative", "in"),
        new Word("ἐν", "dative: in"),
        // 2666
        new Word("ἐγώ", "I", NOMINATIVE, SINGULAR),
        new Word("μου", "my", GENITIVE, SINGULAR),
        new Word("ἐμου", "my", GENITIVE, SINGULAR, EMPHATIC),
        new Word("μοι", "me", DATIVE, SINGULAR),
        new Word("ἐμοι", "me", DATIVE, SINGULAR, EMPHATIC),
        new Word("με", "me", ACCUSATIVE, SINGULAR),
        new Word("ἐμε", "me", ACCUSATIVE, SINGULAR, EMPHATIC),
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
        new Word("ἤμην", "I was", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("ἦς", "you were", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἦν", "s/he was", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἦμεν", "We were", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("ἤμεθα", "We were", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("ἦτε", "you were", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("ἦσαν", "They were", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),

        new Word("ὤν", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("ὄντος", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, GENITIVE, SINGULAR),
        new Word("ὄντι", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, SINGULAR),
        new Word("ὄντα", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("ὄντες", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, PLURAL),
        new Word("ὄντων", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, GENITIVE, PLURAL),
        new Word("οὖσι", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, PLURAL),
        new Word("οὖσιν", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, PLURAL),
        new Word("ὄντας", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, ACCUSATIVE, PLURAL),

        new Word("οὖσα", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("οὔσης", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, GENITIVE, SINGULAR),
        new Word("οὔσῃ", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, DATIVE, SINGULAR),
        new Word("οὖσαν", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("οὖσαι", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, PLURAL),
        new Word("οὐσῶν", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, GENITIVE, PLURAL),
        new Word("οὔσαις", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, DATIVE, PLURAL),
        new Word("οὔσας", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, ACCUSATIVE, PLURAL),

        new Word("ὄν", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, SINGULAR),
        new Word("ὄντος", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, GENITIVE, SINGULAR),
        new Word("ὄντι", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, SINGULAR),
        new Word("ὄν", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("ὄντα", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, PLURAL),
        new Word("ὄντων", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, GENITIVE, PLURAL),
        new Word("οὖσι", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, PLURAL),
        new Word("οὖσιν", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, PLURAL),
        new Word("ὄντα", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, ACCUSATIVE, PLURAL),

        new Word("ὦ", "I might be", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("ἦς", "you might be", SUBJUNCTIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("ᾖ", "s/he might be", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("ὦμεν", "we might be", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("ἦτε", "you might be", SUBJUNCTIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("ὦσι", "they might be", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),
        new Word("ὦσιν", "they might be", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),

        new Word("εἶναι", "to be", INFINITIVE, ACTIVE, PRESENT),

        new Word("ἴσθι", "be!", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("ἔστω", "let him/her be!", IMPERATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("ἔστε", "be!", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("ἔστωσαν", "let them be!", IMPERATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),

        // 2357
        new Word("*λεγ", "to say", ROOT),
        new Word("*ιπ", "to say ", ROOT, SECOND_AORIST),
        new Word("*ερ", "to say ", ROOT, FUTURE, PERFECT, PASSIVE, AORIST),
        new Word("λέγω", "I say - root *λεγ"),
        new Word("ἐρῶ", "I will say - λεγω root *ερ", FUTURE),
        new Word("εἶπον", "I said - λεγω root *ιπ", SECOND_AORIST),
        new Word("εἴρηκα", "I have said - λεγω root *ερ", PERFECT),
        new Word("εἴρημαι", "I have been said - λεγω root *ερ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐρρέθην", "I was said - λεγω root *ερ", PASSIVE, AORIST),
        // 1768
        //new Word("εἰς accusative", "into"),
        new Word("εἰς", "accusative: into"),
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
        //new Word("ἐκ genitive", "out of, from"),
        //new Word("ἐξ genitive", "out of, from"),
        new Word("ἐκ", "genitive: out of, from"),
        new Word("ἐξ", "genitive: out of, from"),
        // 891
        //new Word("ἐπί accusative", "onto"),
        //new Word("ἐπί genitive", "over"),
        //new Word("ἐπί dative", "at"),
        new Word("ἐπί", "accusative: onto, genitive: over, dative: at"),
        // 719
        new Word("κύριος", "lord", MASCULINE),
        new Word("κύριου", "lord", MASCULINE, GENITIVE),
        // 708
        new Word("*σεχ",	"to have", ROOT),
        new Word("ἔχω",	"I have - root *σεχ"),
        new Word("ἕξω",	"I will have - ἐχω root *σεχ", FUTURE),
        new Word("ἔσχον", "I had - ἐχω root *σεχ", SECOND_AORIST),
        new Word("ἔσχηκα", "I have had - ἐχω root *σεχ", PERFECT),
        // 699
        //new Word("πρός accusative", "to, towards"),
        new Word("πρός", "accusative: to, towards"),
        // 669
        new Word("*γεν",	"to become, to be", ROOT),
        new Word("γίνομαι",	"I become, I am - root *γεν", DEPONENT),
        new Word("γενήσομαι", "I will become - γινομαι root *γεν", FUTURE, DEPONENT),
        new Word("ἐγένομην", "I became - γινομαι root *γεν", AORIST, DEPONENT),
        new Word("γέγονα", "I have become - γινομαι root *γεν", SECOND_PERFECT),
        new Word("γεγένημαι", "I have been made, caused to happen - γινομαι root *γεν", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐγενήθην", "I happened, became - γινομαι root *γεν", PASSIVE, AORIST),
        // 668
        //new Word("διά accusative", "on account of"),
        //new Word("διά genitive", "through"),
        new Word("διά", "accusative: on account of, genitive: through"),
        // 663
        new Word("ἵνα", "in order that"),
        // 646
        //new Word("ἀπό genitive", "from"),
        new Word("ἀπό", "genitive: from"),
        // 638
        new Word("ἀλλά", "but (strong)"),
        // 634
        new Word("*ερχ", "To come, to go", ROOT, PRESENT),
        new Word("*ελευθ", "to come/go ", ROOT, FUTURE, AORIST, PERFECT),
        new Word("ἔρχομαι", "I come, I go - root *ερχ", DEPONENT),
        new Word("ἐλεύσομαι", "I will come/go - ἔρχομαι root *ελευθ", FUTURE, DEPONENT),
        new Word("ἦλθον", "I came/went, - ἔρχομαι root *ελευθ", SECOND_AORIST),
        new Word("ἐλήλυθα", "I have come/gone - ἔρχομαι root *ελευθ", SECOND_PERFECT),
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
        new Word("*ποιε", "to do, to make", 17, ROOT),
        new Word("ποιω", "I do, I make - root *ποιε", 17),
        new Word("ποιήσω", "I will make/do - root *ποιε", 17, FUTURE),
        new Word("ἐποίησα", "I did/made - root *ποιε", 17, AORIST),
        new Word("πεποίηκα", "I have done/made - root *ποιε", 17, PERFECT),
        new Word("πεποίημαι", "I have been done/made - root *ποιε", 17, MIDDLE, PASSIVE, PERFECT),
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
        new Word("τινων", "someone something", MASCULINE, GENITIVE, PLURAL),
        new Word("τισι", "someone something", MASCULINE, DATIVE, PLURAL),
        new Word("τινας", "someone something", MASCULINE, ACCUSATIVE, PLURAL),
        new Word("τινες", "someone something", FEMININE, NOMINATIVE, PLURAL),
        new Word("τινων", "someone something", FEMININE, GENITIVE, PLURAL),
        new Word("τισι", "someone something", FEMININE, DATIVE, PLURAL),
        new Word("τινας", "someone something", FEMININE, ACCUSATIVE, PLURAL),
        new Word("τινα", "someone something", NEUTER, NOMINATIVE, PLURAL),
        new Word("τινων", "someone something", NEUTER, GENITIVE, PLURAL),
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
        //new Word("κατά accusative", "according to"),
        //new Word("κατά genitive", "down from"),
        new Word("κατά", "accusative: according to, genitive: down from"),
        // 473
        //new Word("μετά accusative", "after"),
        //new Word("μετά genitive", "with"),
        new Word("μετά", "accusative: after, genitive: with"),
        // 455
        new Word("*ορα",	"to see ", ROOT, PRESENT, PASSIVE, PERFECT),
        new Word("*οπ",	"to see ", ROOT, FUTURE, PASSIVE, AORIST),
        new Word("*ιδ",	"to see ", ROOT, SECOND_AORIST),
        new Word("ὁρω",	"I see - ὁραω root *ορα"),
        new Word("ὄψομαι",	"I will see - ὁραω root *οπ", FUTURE, DEPONENT),
        new Word("εἶδον",	"I saw - ὁραω root *ιδ", SECOND_AORIST),
        new Word("ἑώρακα",	"I have seen - ὁραω root *ορα", PERFECT),
        new Word("ὤφθην",	"I was seen - ὁραω root *οπ", PASSIVE, AORIST),
        // 428
        new Word("*ακου", "to hear ", ROOT),
        new Word("ἀκούω", "I hear - root *ακου"),
        new Word("ἀκούσω", "I will hear - root *ακου", FUTURE),
        new Word("ἤκουσα", "I heard - root *ακου", AORIST),
        new Word("ἀκήκοα", "I have heard - root *ακου", SECOND_PERFECT),
        new Word("ἠκούσθην", "I was heard - root *ακου", PASSIVE, AORIST),
        // 418
        new Word("πολύς", "many, much", MASCULINE),
        new Word("πολλή", "many, much", FEMININE),
        new Word("πολύ", "many, much", NEUTER),
        // 417
        new Word("*δο", "to give ", ROOT),
        new Word("δίδωμι", "I give - root *δο"),
        new Word("δώσω", "I will give - διδωμι root *δο", FUTURE),
        new Word("ἔδωκα", "I gave - διδωμι root *δο", AORIST),
        new Word("δέδωκα", "I have given - διδωμι root *δο", PERFECT),
        new Word("δέδομαι", "I have been given - διδωμι root *δο", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐδόθην", "I was given - διδωμι passive root *δο", PASSIVE, AORIST),
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
        //new Word("περί accusative", "around"),
        //new Word("περί genitive", "concerning, about"),
        new Word("περί", "accusative: around, genitive: concerning, about"),
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
        new Word("*λαλε", "to speak ", ROOT),
        new Word("λαλω", "I speak - root *λαλε"),
        new Word("λαλήσω", "I will speak - root *λαλε", FUTURE),
        new Word("ἐλάλησα", "I spoke - root *λαλε", AORIST),
        new Word("λελάληκα", "I have spoken - root *λαλε", PERFECT),
        new Word("λελάλημαι", "I have been spoken - root *λαλε", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐλαλήθην", "I was spoken - root *λαλε", PASSIVE, AORIST),
        // 273
        new Word("οὐρανός", "heaven", MASCULINE),
        new Word("οὐρανοῦ", "heaven", MASCULINE, GENITIVE),
        // 261
        new Word("μαθητής", "student, disciple", MASCULINE),
        new Word("μαθητοῦ", "student, disciple", MASCULINE, GENITIVE),
        // 258
        new Word("*λαβ", "to take, to receive ", ROOT),
        new Word("λαμβάνω", "I take, I receive - root *λαβ"),
        new Word("λήμψομαι", "I will take/receive - λαμβανω root *λαβ", FUTURE, DEPONENT),
        new Word("ἔλαβον", "I took/received - λαμβανω root *λαβ", SECOND_AORIST),
        new Word("εἴληφα", "I have taken/received - λαμβανω root *λαβ", SECOND_PERFECT),
        new Word("εἴλημμαι", "I have been taken/received - λαμβανω root *λαβ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐλήμφθην", "I was taken/received - λαμβανω root *λαβ", AORIST, PERFECT),
        // 250
        new Word("γῆ", "land, earth", FEMININE),
        new Word("γῆς", "land, earth", FEMININE, GENITIVE),
        // 249
        new Word("*πιστευ", "to believe ", ROOT),
        new Word("πιστεύω", "I believe - root *πιστευ"),
        new Word("πιστεύσω", "I will believe - root *πιστευ", FUTURE),
        new Word("ἐπίστευσα", "I believed - root *πιστευ", AORIST),
        new Word("πεπίστευκα", "I have believed - root *πιστευ", PERFECT),
        new Word("πεπίστευμαι", "I have been believed - root *πιστευ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐπιστεύθην", "I was believed - root *πιστευ", PASSIVE, AORIST),
        // 245
        new Word("μέγας", "large, great", MASCULINE),
        new Word("μεγάλη", "large, great", FEMININE),
        new Word("μέγα", "large, great", NEUTER),
        // 243
        new Word("πίστις", "faith, trust", FEMININE),
        new Word("πίστεως", "faith, trust", FEMININE, GENITIVE),
        // 242
        new Word("*γνω", "to know ", ROOT),
        new Word("γινώσκω", "I know - root *γνω"),
        new Word("γνώσομαι", "I will know - γινωσκω root *γνω", FUTURE, DEPONENT),
        new Word("ἔγνων", "I knew - γινωσκω root *γνω", SECOND_AORIST),
        new Word("ἔγνωσκα", "I have known - γινωσκω root *γνω", PERFECT),
        new Word("ἔγνωσμαι", "I have been known - γινωσκω root *γνω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐγνώσθην", "I was known - γινωσκω root *γνω", PASSIVE, AORIST),
        // 234
        new Word("ὄνομα", "name", MASCULINE),
        new Word("ὄνοματος", "name", MASCULINE, GENITIVE),
        // 233
        new Word("ἅγιος", "holy", ADJECTIVE, MASCULINE),
        new Word("ἅγια", "holy", ADJECTIVE, FEMININE),
        new Word("ἅγιον", "holy", ADJECTIVE, NEUTER),
        // 231
        new Word("*αποκριν", "to answer ", ROOT),
        new Word("ἀποκρίνομαι", "I answer - root *αποκριν", DEPONENT),
        new Word("ἀπεκρινἀμην", "I answered - αποκρινομαιa root *αποκριν", AORIST, DEPONENT),
        new Word("ἀπεκρίθην", "I was answered - αποκρινομαιa root *αποκριν", PASSIVE, AORIST),
        // 220
        //new Word("ὑπό accusative", "under"),
        //new Word("ὑπό genitive", "by"),
        new Word("ὑπό", "accusative: under, genitive: by"),
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
        new Word("*δυν", "to be able ", ROOT),
        new Word("δύναμαι", "I am able - root *δυν", DEPONENT),
        new Word("δυνήσομαι", "I will be able - δυναμαι root *δυν", FUTURE, DEPONENT),
        new Word("ἠδυνήθην",	"I was able - δυναμαι root *δυν", PASSIVE, AORIST, DEPONENT),
        // 208
        new Word("*εθελε", "to want ", ROOT),
        new Word("θέλω", "I want - root *εθελε"),
        new Word("ἠθέλησα", "I wanted - θελω root *εθελε", AORIST),
        new Word("ὅυτω", "thus"),
        new Word("ὅυτως", "thus"),
        // 195
        new Word("Ἰοὐδαῖος", "jewish", ADJECTIVE, MASCULINE),
        new Word("Ἰοὐδαῖα", "jewish", ADJECTIVE, FEMININE),
        new Word("Ἰοὐδαῖον", "jewish", ADJECTIVE, NEUTER),
        // 194
        //new Word("παρά accusative", "alongside of"),
        //new Word("παρά genitive", "from"),
        //new Word("παρά dative", "in the presence of"),
        new Word("παρά", "accusative: alongside of, genitive: from, dative: in the presence of"),
        new Word("εισερχομαι", "I enter"),
        new Word("εἰσελεύσομαι", "I will enter εισερχομαι", FUTURE),
        new Word("εἰσῆλθον", "I entered εισερχομαι", AORIST),
        new Word("εἰσελήλυθα", "I have entered εισερχομαι", PERFECT),
        // 191
        new Word("*γραφ", "to write "),
        new Word("γραφω", "I write - root *γραφ"),
        new Word("γράψω", "I will write - root *γραφ", FUTURE),
        new Word("ἔγραψα", "I wrote - root *γραφ", AORIST),
        new Word("γέγραφα", "I have written - root *γράφ", SECOND_PERFECT),
        new Word("γέγραμμαι", "I have been written - root *γράφ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐγράφην", "I was written - root *γράφ", PASSIVE, AORIST),
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
        new Word("*ευρ", "to find ", ROOT),
        new Word("ἑυρίσκω", "I find - root *ευρ"),
        new Word("εὑρήσω", "I will find - ἑυρίσκω root *ευρ", FUTURE),
        new Word("εὗρον", "I found - ἑυρίσκω root *ευρ", SECOND_AORIST),
        new Word("εὕρηκα", "I have found - ἑυρίσκω root *ευρ", PERFECT),
        new Word("εὑρέθην", "I was found - ἑυρίσκω root *ευρ", PASSIVE, AORIST),
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
        new Word("*εσθι", "to eat ", ROOT, PRESENT),
        new Word("*φαγ", "to eat ", ROOT, FUTURE, SECOND_AORIST),
        new Word("ἐσθιω", "I eat - root *εσθι"),
        new Word("φάγομαι", "I will eat - ἐσθιω root *φαγ", FUTURE, DEPONENT),
        new Word("ἔφαγον", "I ate - ἐσθιω root *φαγ", SECOND_AORIST),
        // 155
        new Word("*στα", "to stand ", ROOT),
        new Word("ἵστημι", "Transitive: I set, put, place Intransitive: I stand, I appear, I stop - root *στα "),
        new Word("στήσω", "I will stand - ἱστημι root *στα", FUTURE),
        new Word("ἔστησα", "I put, set - ἱστημι root *στα", AORIST),
        new Word("ἔστην", "I stood - ἱστημι root *στα", SECOND_AORIST),
        new Word("ἕστηκα", "I have stood - ἱστημι root *στα", PERFECT),
        new Word("ἐστάθην", "I was put - ἱστημιa root *στα", PASSIVE, AORIST),
        new Word("ἀλλος", "other", ADJECTIVE, MASCULINE),
        new Word("ἀλλη", "other", ADJECTIVE, FEMININE),
        new Word("ἀλλο", "other", ADJECTIVE, NEUTER),
        new Word("χαρις", "grace", FEMININE),
        new Word("χαριτος", "grace", FEMININE, GENITIVE),
        // 153
        new Word("*πορευ", "to go, to live ", ROOT),
        new Word("πορεύομαι", "I go, I live - root *πορευ", DEPONENT),
        new Word("πορεύσομαι", "I will go, live - πορευομαι root *πορευ", FUTURE, DEPONENT),
        new Word("πεπόρευμαι", "I have gone, lived - πορευομαι root *πορευ", MIDDLE, PASSIVE, PERFECT, DEPONENT),
        new Word("ἐπορεὐθην", "I went, lived - πορευομαι root *πορευ", PASSIVE, AORIST, DEPONENT),
        // 150
        new Word("ὑπερ", "accusative: above, genitive: in behalf of"),
        // 148
        new Word("*καλεϝ", "to call ", ROOT),
        new Word("καλέω", "I call - root *καλεϝ"),
        new Word("καλἐσω", "I will call - καλεω root *καλεϝ", FUTURE),
        new Word("ἐκάλεσα", "I called - καλεω root *καλεϝ", AORIST),
        new Word("κέκληκα", "I have called - καλεω root *καλεϝ", PERFECT),
        new Word("κέκλημαι", "I have been called - καλεω root *καλεϝ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐκλήθην", "I was called - καλεω root *καλεϝ", PASSIVE, AORIST),
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
        new Word("*εγερ", "to raise ", ROOT),
        new Word("ἐγείρω", "I raise - root *εγερ"),
        new Word("ἐγερῶ", "I will raise - ἐγειρω root *εγερ", FUTURE),
        new Word("ἤγειρα", "I raised - ἐγειρω root *εγερ", AORIST),
        new Word("ἐγήγερμαι", "I have been raised - ἐγειρω root *εγερ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἠγέρθην", "I was raised - ἐγειρω root *εγερ", PASSIVE, AORIST),
        // 143
        new Word("ὀυδε", "and not, neither"),
        new Word("απο + *σε", "to let go, divorce, forgive ", ROOT),
        new Word("ἀφιημι", "I let go, divorce, forgive - compound verb απο + ιημι root *σε"),
        new Word("ἀφήσω", "I will forgive - ἀφιημι compound verb απο + ιημι root *σε", FUTURE),
        new Word("ἀφῆκα", "I forgave - ἀφιημι compound verb απο + ιημι root *σε", AORIST),
        new Word("ἀφέωμαι", "I have been forgiven - ἀφιημι compound verb απο + ιημι root *σε", MIDDLE, PASSIVE, PERFECT),
        new Word("ἀφέθην", "I was forgiven - ἀφιημι compound verb απο + ιημι root *σε", PASSIVE, AORIST),
        // 142
        new Word("λαος", "people", MASCULINE),
        new Word("λαου", "people", MASCULINE, GENITIVE),
        new Word("σωμα", "body", NEUTER),
        new Word("σωματος", "body", NEUTER, GENITIVE),
        // 141
        new Word("παλιν", "again"),
        // 140
        new Word("*ζα", "to live ", ROOT),
        new Word("ζάω", "I live - root *ζα"),
        new Word("ζἠσω", "I will live - root *ζα", FUTURE),
        new Word("ἔζεσα", "I lived - root *ζα", AORIST),
        // 139
        new Word("φωνἠ", "sound, voice", FEMININE),
        new Word("φωνῆς", "sound, voice", FEMININE, GENITIVE),
        new Word("ζωή", "life", FEMININE),
        new Word("ζωῆς", "life", FEMININE, GENITIVE),
        // 135
        new Word("δύο", "two"),
        // 133
        new Word("*βλεπ", "to see ", ROOT),
        new Word("βλέπω", "I see - root *βλεπ"),
        new Word("βλέψω", "I will see - βλέπω root *βλεπ", FUTURE),
        new Word("ἐβλέψα", "I saw - βλέπω root *βλεπ", AORIST),
        // 132
        new Word("απο + *στελ", "to send ", ROOT),
        new Word("ἀποστέλλω", "I send - root *αποστελ"),
        new Word("ἀποστελῶ", "I will send - ἀποστέλλω root *αποστελ", FUTURE),
        new Word("άπέστειλα", "I sent - ἀποστέλλω root *αποστελ", AORIST),
        new Word("ἀπέσταλκα", "I have sent - ἀποστέλλω root *αποστελ", PERFECT),
        new Word("ἀπέσταλμαι", "I have been sent - ἀποστέλλω root *αποστελ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἀπεστάλην", "I was sent - ἀποστέλλω root *αποστελ", PASSIVE, SECOND_AORIST),
        // 129
        new Word("ἀμήν", "truly"),
        // 128
        new Word("νεκρός", "dead", ADJECTIVE, MASCULINE),
        new Word("νεκρά", "dead", ADJECTIVE, FEMININE),
        new Word("νεκρόν", "dead", ADJECTIVE, NEUTER),
        //new Word("συν dative", "with"),
        new Word("συν", "dative: with"),
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
        new Word("*βαλ", "to throw ", ROOT),
        new Word("βάλλω", "I throw - root *βαλ"),
        new Word("βαλῶ", "I will throw - βάλλω root *βαλ", FUTURE),
        new Word("ἔβαλον", "I threw - βάλλω root *βαλ", SECOND_AORIST),
        new Word("βέβληκα", "I have thrown - βάλλω root *βαλ", PERFECT),
        new Word("βέβλημαι", "I have been thrown - βάλλω root *βαλ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐβλήθην", "I was thrown - βάλλω root *βαλ", PASSIVE, AORIST),
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
        new Word("*μεν", "to remain ", ROOT),
        new Word("μένω", "I remain - root *μεν"),
        new Word("μενῶ", "I will remain - μένω root *μεν", FUTURE),
        new Word("ἔμεινα", "I remained - μένω root *μεν", AORIST),
        new Word("μεμένηκα", "I have remained - μένω root *μεν", PERFECT),
        // 117
        new Word("ἀπέρχομαι", "I depart, I go away"),
        new Word("ἀπελεύσομαι", "I will depart ἀπέρχομαι", FUTURE),
        new Word("ἀπῆλθον", "I departed ἀπέρχομαι", AORIST),
        new Word("ἀπελήλθυα", "I have departed ἀπέρχομαι", PERFECT),
        new Word("*ζητε", "to seek ", ROOT),
        new Word("ζητῶ", "I seek - root *ζητε"),
        new Word("ζητήσω", "I will seek - root *ζητε", FUTURE),
        new Word("ἐζήτησα", "I sought - root *ζητε", AORIST),
        new Word("ἐζητήθην", "I was sought - root *ζητε", PASSIVE, AORIST),
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
        new Word("*κριν", "to judge ", ROOT),
        new Word("κρίνω", "I judge - root *κριν"),
        new Word("κρινῶ", "I will judge - κρίνω root *κριν", FUTURE),
        new Word("ἔκρινα", "I judged - κρίνω root *κριν", AORIST),
        new Word("κέκρικα", "I have judged - κρίνω root *κριν", PERFECT),
        new Word("κέκριμαι", "I have been judged - κρίνω root *κριν", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐκρίθην", "I was judged - κρίνω root *κριν", PASSIVE, AORIST),
        // 111
        new Word("απο + *θαν", "to die ", ROOT),
        new Word("ἀποθνῃσκω", "I die - compound απο + *θαν"),
        new Word("ἀποθανοῦμαι", "I will die - ἀποθνῃσκω compound απο + *θαν", FUTURE, DEPONENT),
        new Word("άπέθανον", "I died - ἀποθνῃσκω compound απο + *θαν", SECOND_AORIST),
        // 110
        new Word("ὁσος", "as/how much/great/far/long", ADJECTIVE, MASCULINE),
        new Word("ὁση", "as/how much/great/far/long", ADJECTIVE, FEMININE),
        new Word("ὁσον", "as/how much/great/far/long", ADJECTIVE, NEUTER),
        // 109
        new Word("ἀληθεια", "truth", FEMININE),
        new Word("ἀληθειας", "truth", FEMININE, GENITIVE),
        new Word("*μελλε", "to be about to, to intend ", ROOT),
        new Word("μελλω", "I am about to, I intend - root *μελλε"),
        new Word("μελλήσω", "I will intend - μελλω root *μελλε", FUTURE),
        new Word("ὁλος", "whole, entire", ADJECTIVE, MASCULINE),
        new Word("ὁλη", "whole, entire", ADJECTIVE, FEMININE),
        new Word("ὁλον", "whole, entire", ADJECTIVE, NEUTER),
        new Word("παρακαλῶ", "I call, I beseech παρακαλέω"),
        new Word("παρακαλέσω", "I will call, I beseech παρακαλέω", FUTURE),
        new Word("παρεκάλεσα", "I beseeched παρακαλέω", AORIST),
        new Word("παρακέκληκα", "I have beseeched παρακαλέω", PERFECT),
        new Word("παρακέκλημαι", "I have been beseeched παρακαλέω", MIDDLE, PASSIVE, PERFECT),
        new Word("παρεκλήθην", "I was beseeched παρακαλέω", PASSIVE, AORIST),
        // 108
        new Word("ανα + *στα", "to raise, to stand up ", ROOT),
        new Word("ἀνίστημι", "I raise, I stand up - compound ανα + *στα"),
        new Word("ἀναστήσω", "I will raise/stand up - ἀνίστημι compound ανα + *στα", FUTURE),
        new Word("ἀνέστησα", "I raised - ἀνίστημι compound ανα + *στα", AORIST),
        new Word("ἀνέστηκα", "I have raised - ἀνίστημι compound ανα + *στα", PERFECT),
        new Word("ἀνέστυμαι", "I have been raised - ἀνίστημι compound ανα + *στα", MIDDLE, PASSIVE, PERFECT),
        new Word("ἀνέστην", "I was raised - ἀνίστημι compound ανα + *στα", PASSIVE, AORIST),
        // 106
        new Word("*σωζ", "to save ", ROOT),
        new Word("σῴζω", "I save - root *σωζ"),
        new Word("σώζω", "I will save - σῴζω root *σωζ", FUTURE),
        new Word("ἔσωσα", "I saved - σῴζω root *σωζ", AORIST),
        new Word("σέσωκα", "I have saved - σῴζω root *σωζ", PERFECT),
        new Word("σέσῳσμαι", "I have been saved - σῴζω root *σωζ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐσώθην", "I was saved - σῴζω root *σωζ", PASSIVE, AORIST),
        new Word("ὤρα", "hour", FEMININE),
        new Word("ὤρας", "hour", FEMININE, GENITIVE),
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
        new Word("*αρ", "to take up, to take away ", ROOT),
        new Word("αἴρω", "I take up, I take away - root *αρ"),
        new Word("ἀρω", "I will take up  -αἴρω root *αρ", FUTURE),
        new Word("ἦρα", "I took up  -αἴρω root *αρ", AORIST),
        new Word("ἦρκα", "I have taken up  -αἴρω root *αρ", PERFECT),
        new Word("ἦρμαι", "I have been taken up - αἴρω root *αρ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἤρθην", "I was taken up  -αἴρω root *αρ", PASSIVE, AORIST),
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
        new Word("*θε", "to put, place ", ROOT),
        new Word("τίθημι", "I put, I place - root *θε"),
        new Word("θήσω", "I will put - τίθημι root *θε", FUTURE),
        new Word("ἔθηκα", "I placed - τίθημι root *θε", AORIST),
        new Word("τέθεικα", "I have put - τίθημι root *θε", PERFECT),
        new Word("τέθειμαι", "I have been put - τίθημι root *θε", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐτέθην", "I was put - τίθημι root *θε", PASSIVE, AORIST),
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
        new Word("*δακ", "to teach ", ROOT),
        new Word("διδασκω", "I teach - root *δακ"),
        new Word("διδάξω", "I will teach - διδασκω root *δακ", FUTURE),
        new Word("ἐδίδαξα", "I taught - διδασκω root *δακ", AORIST),
        new Word("ἐδιδάχθην", "I was taught - διδασκω root *δακ", PASSIVE, AORIST),
        new Word("*γεννα", "to beget ", ROOT),
        new Word("γεννῶ", "I beget - root *γεννα"),
        new Word("γεννήσω", "I will beget - root *γεννα", FUTURE),
        new Word("ἐγέννησα", "I begat - root *γεννα", AORIST),
        new Word("γεγέννηκα", "I have begotten - root *γεννα", PERFECT),
        new Word("γεγέννημαι", "I have been begotten - root *γεννα", PASSIVE, PERFECT),
        new Word("ἐγεννήθην", "I was begotten - root *γεννα", PASSIVE, AORIST),
        // 95
        new Word("περι + *πατε", "to walk around ", ROOT),
        new Word("περιπατω", "I walk around - compound περι + *πατε"),
        new Word("περιπατήσω", "I will walk around - περιπατω compound περι + *πατε", FUTURE),
        new Word("περιεπάτησα", "I walked around - περιπατω compound περι + *πατε", AORIST),
        new Word("*φοβε", "to fear ", ROOT),
        new Word("φοβέομαι", "I fear - root *φοβε", DEPONENT),
        new Word("ἐφοβήθην", "I feared - φοβέομαι root *φοβε", PASSIVE, AORIST, DEPONENT),
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
        new Word("κατα + *εμ", "to sit down ", ROOT),
        new Word("κάθημαι", "I sit down - compound κατα + *εμ"),
        new Word("κάθησομαι", "I will sit down - κάθημαι compound κατα + *εμ", FUTURE),
        // 90
        new Word("*ἀκολουθε", "to follow ", ROOT),
        new Word("ἀκολουθω", "I follow - root *ἀκολουθε"),
        new Word("ἀκολουθήσω", "I will follow - root *ἀκολουθε", FUTURE),
        new Word("ἠκολούθησα", "I followed - root *ἀκολουθε", AORIST),
        new Word("ἠκολούθηκα", "I have followed - root *ἀκολουθε", PERFECT),
        new Word("απο + *ὀλ", "to destroy ", ROOT),
        new Word("ἀπόλλυμι", "I destroy, middle I perish, I die - compound απο + *ολ"),
        new Word("ἀπολέσω", "I will destroy - ἀπόλλυμι compound απο + *ολ", FUTURE),
        new Word("ἀπώλεσα", "I destroyed - ἀπόλλυμι compound απο + *ολ", AORIST),
        new Word("ἀπόλωλα", "I have destroyed - ἀπόλλυμι compound απο + *ολ", PERFECT),
        new Word("*πετ", "to fall ", ROOT),
        new Word("πίπτω", "I fall - root *πετ"),
        new Word("πεσοῦμαι", "I will fall - πίπτω root *πετ", FUTURE),
        new Word("ἔπεσον", "I fell - πίπτω root *πετ", SECOND_AORIST),
        new Word("πέπτωκα", "I have fallen - πίπτω root *πετ", PERFECT),
        new Word("μηδείς", "no, no one"),
        // 88
        new Word("ἑπτά", "seven, doesn't decline"),
        // 87
        new Word("οὔτε", "neither"),
        // 86
        new Word("*αρχ", "(middle) to begin (active) to rule, rare ", ROOT),
        new Word("ἄρχομαι", "I begin (active I rule, but rare) - root *αρχ", MIDDLE),
        new Word("ἄρξομαι", "I will begin - ἄρχομαι root *αρχ", FUTURE, MIDDLE),
        new Word("ἠρξάμην", "I began - ἄρχομαι root *αρχ", AORIST, MIDDLE),
        new Word("*πληρο", "to fill, fulfill ", ROOT),
        new Word("πληρω", "I fill, fulfill - root *πληρο"),
        new Word("πληρώσω", "I will fill - root *πληρο", FUTURE),
        new Word("ἐπλήρωσα", "I filled - root *πληρο", AORIST),
        new Word("πεπλήρωκα", "I have filled - root *πληρο", PERFECT),
        new Word("πεπλήρωμαι", "I have been filled - root *πληρο", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐπληρώθην", "I was filled - root *πληρο", PASSIVE, AORIST),
        new Word("προσέρχομαι", "I come to"),
        new Word("προσήλθον", "I came to προσέρχομαι", AORIST),
        new Word("προσελήλυθα", "I have come to προσέρχομαι", PERFECT),
        // 85
        new Word("καιρός", "time (point and period)", MASCULINE),
        new Word("καιροῦ", "time (point and period)", MASCULINE, GENITIVE),
        new Word("προσ + *ευχ", "to pray ", DEPONENT),
        new Word("προσεύχομαι", "I pray - root *προσευχ", DEPONENT),
        new Word("προσεύξομαι", "I will pray - προσεύχομαι root *προσευχ", FUTURE, DEPONENT),
        new Word("προσηυξάμην", "I prayed - προσεύχομαι root *προσευχ", AORIST, DEPONENT),
        // 83
        new Word("μήτηρ", "mother", FEMININE),
        new Word("μητρός", "mother", FEMININE, GENITIVE),
        new Word("ὥστε", "so that, in order that, thus"),
        // 82
        new Word("ανα + *βα", "to go up, rise up, advance ", ROOT),
        new Word("ἀναβαίνω", "I go up, rise up, advance - compound ανα + *βα"),
        new Word("ἀναβήσομαι", "I will go up, rise up, advance - ἀναβαίνω compound ανα + *βα", FUTURE, DEPONENT),
        new Word("ἀνέβην", "I went up, rose up, advanced - ἀναβαίνω compound ανα + *βα", SECOND_AORIST),
        new Word("ἀναβέβηκα", "I have gone up, risen up, advanced - ἀναβαίνω compound ανα + *βα", PERFECT),
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
        new Word("καταβαίνω", "I come/go down - compound κατα + *βα"),
        new Word("καταβήσομαι", "I will come/go down - καταβαίνω compound κατα + *βα", FUTURE, DEPONENT),
        new Word("κατέβην", "I came/went down - καταβαίνω compound κατα + *βα", SECOND_AORIST),
        new Word("καταβέβηκα", "I have come/gone down - καταβαίνω compound κατα + *βα", PERFECT),
        new Word("μᾶλλον", "more, rather"),
        // 80
        new Word("άποστολος", "apostle", MASCULINE),
        new Word("άποστολου", "apostle", MASCULINE, GENITIVE),
        // 79
        new Word("*πεμπ", "to send ", ROOT),
        new Word("πέμπω", "I send - root *πεμπ"),
        new Word("πέμψω", "I will send - root *πεμπ", FUTURE),
        new Word("ἕπεμψα", "I sent - root *πεμπ", AORIST),
        new Word("ἐπέμφθην", "I was sent - root *πεμπ", PASSIVE, AORIST),
        new Word("ὑπο + *αγ", "to go away, to draw off ", ROOT),
        new Word("ὑπάγω", "I go away, I draw off - compound ὑπο + *αγ"),
        new Word("ὑπάξω", "I will go away, I will draw off - compound ὑπο + *αγ", FUTURE),
        new Word("ὑπἠγαγον", "I went away, I drew off - compound ὑπο + *αγ", SECOND_AORIST),
        new Word("ὑπῆγμαι", "I have been taken away, I have been drawn off - compound ὑπο + *αγ", MIDDLE, PASSIVE, PERFECT),
        new Word("ὑπήχθην", "I was taken away, I was drawn off - compound ὑπο + *αγ", PASSIVE, AORIST),
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
        new Word("ανα + *οιγω", "to open, unlock, disclose ", ROOT),
        new Word("ἀνοίγω", "I open, unlock, disclose - compound ανα + *οιγω"),
        new Word("ἀνέῳζα", "I opened, unlocked, disclosed - ἀνοίγω compound ανα + *οιγω", AORIST),
        new Word("ἀνεῳχθην", "I was opened, unlocked, disclosed - ἀνοίγω compound ανα + *οιγω", PASSIVE, AORIST),
        new Word("*βαπτιδ", "to baptize, wash, dip ", ROOT),
        new Word("βαπτίζω", "I baptize, wash, dip - root *βαπτιδ"),
        new Word("βαπτίσω", "I will baptize, wash, dip - βαπτίζω root *βαπτιδ", FUTURE),
        new Word("ἐβαπτισα", "I baptized, washed, dipped - βαπτίζω root *βαπτιδ", AORIST),
        new Word("βεβάπτισμαι", "I have been baptized, washed, dipped - βαπτίζω root *βαπτιδ", PASSIVE, PERFECT),
        new Word("ἐβαπτίσθην", "I was baptized, washed, dipped - βαπτίζω root *βαπτιδ", PASSIVE, AORIST),
        // 76
        new Word("εὐαγγέλιον", "good news, gospel", NEUTER),
        new Word("εὐαγγέλιου", "good news, gospel", NEUTER, GENITIVE),
        new Word("πρόσωπον", "face, countenance", NEUTER),
        new Word("πρόσωπου", "face, countenance", NEUTER, GENITIVE),
        new Word("ὕδωρ", "water", NEUTER),
        new Word("ὕδατος", "water", NEUTER, GENITIVE),
        new Word("*μαρτυρε", "to bear witness ", ROOT),
        new Word("μαρτυρῶ", "I bear witness - root *μαρτυρε"),
        new Word("μαρτυρήσω", "I will bear witness - root *μαρτυρε", FUTURE),
        new Word("ἐμαρτύρησα", "I bore witness - root *μαρτυρε", AORIST),
        new Word("μεμαρτύρηκα", "I have born witness - root *μαρτυρε", PERFECT),
        new Word("μεμαρτύρημαι", "I have been witnessed - root *μαρτυρε", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐμαρτυρήθην", "I was witnessed - root *μαρτυρε", PASSIVE, AORIST),
        // 75
        new Word("κεφαλή", "head", FEMININE),
        new Word("κεφαλῆς", "head", FEMININE, GENITIVE),
        new Word("δώδεκα", "twelve"),
        // 74
        new Word("απο + *κτεν", "to kill ", ROOT),
        new Word("ἀποκτείνω", "I kill - compound απο + *κτεν"),
        new Word("ἀποκτενῶ", "I will kill - ἀποκτείνω compound απο + *κτεν", FUTURE),
        new Word("ἀπέκτεινα", "I killed - ἀποκτείνω compound απο + *κτεν", AORIST),
        new Word("ἀπεκτάθην", "I was killed - ἀποκτείνω compound απο + *κτεν", PASSIVE, AORIST),
        new Word("*χαρ", "to rejoice ", ROOT),
        new Word("χαίρω", "I rejoice (infinitive used as a greeting) - root *χαρ"),
        new Word("ἐχάρην", "I rejoiced - χαίρω root *χαρ", PASSIVE, SECOND_AORIST, DEPONENT),
        // 73
        new Word("φῶς", "light", NEUTER),
        new Word("φωτός", "light", NEUTER, GENITIVE),
        new Word("*πι", "to drink ", ROOT),
        new Word("πίνω", "I drink - root *πι"),
        new Word("πίομαι", "I will drink - πίνω root *πι", FUTURE, DEPONENT),
        new Word("ἔπιον", "I drank - πίνω root *πι", SECOND_AORIST),
        new Word("πέπωκα", "I have drunk - πίνω root *πι", PERFECT),
        new Word("ἐπόθην", "I was drunk - πίνω root *πι", PASSIVE, AORIST),
        // 71
        new Word("ἱερόν", "temple", NEUTER),
        new Word("ἱεροῦ", "temple", NEUTER, GENITIVE),
        new Word("πῦρ", "fire", NEUTER),
        new Word("πυρός", "fire", NEUTER, GENITIVE),
        new Word("αἰώνος", "eternal", ADJECTIVE, MASCULINE, FEMININE),
        new Word("αἰώνον", "eternal", ADJECTIVE, NEUTER),
        // 70
        new Word("*αἰτε", "to ask ", ROOT),
        new Word("αἰτέω", "I ask - root *αἰτε"),
        new Word("αἰτήσω", "I will ask - root *αἰτε", FUTURE),
        new Word("ᾔτησα", "I asked - root *αἰτε", AORIST),
        new Word("ᾔτηκα", "I have asked - root *αἰτε", PERFECT),
        new Word("ᾔτημαι", "I have been asked - root *αἰτε", MIDDLE, PASSIVE, PERFECT),
        new Word("*τηρε", "to keep, guard ", ROOT),
        new Word("τηρέω", "I keep, I guard - root *τηρε"),
        new Word("τηρήσω", "I will keep, I will guard - root *τηρε", FUTURE),
        new Word("ἐτήρησα", "I kept, I guarded - root *τηρε", AORIST),
        new Word("τετήρηκα", "I have kept, I have guarded - root *τηρε", PERFECT),
        new Word("τετήρημαι", "I have been kept, I have been guarded - root *τηρε", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐτηρήθην", "I was kept, I was guarded - root *τηρε", PASSIVE, AORIST),
        // 69
        new Word("τρεῖς", "three", MASCULINE, FEMININE),
        new Word("τρία", "three", NEUTER),
        // 68
        new Word("ῥῆμα", "word, thing", NEUTER),
        new Word("ῥῆματος", "word, thing", NEUTER, GENITIVE),
        new Word("σάββατον", "Sabbath, week", NEUTER),
        new Word("σάββατου", "Sabbath, week", NEUTER, GENITIVE),
        // 67
        new Word("ἐντολή", "commandment", FEMININE),
        new Word("ἐντολῆς", "commandment", FEMININE, GENITIVE),
        new Word("πλοῖον", "ship, boat", NEUTER),
        new Word("πλοῖου", "ship, boat", NEUTER, GENITIVE),
        // 66
        new Word("πρεσβύτερος", "elder", NOUN, MASCULINE),
        new Word("πρεσβύτερου", "elder", NOUN, MASCULINE, GENITIVE),
        new Word("πρεσβύτερος", "old", ADJECTIVE, MASCULINE),
        new Word("πρεσβύτερα", "old", ADJECTIVE, FEMININE),
        new Word("πρεσβύτερον", "old", ADJECTIVE, NEUTER),
        new Word("*φερ", "to carry, bear, produce ", ROOT),
        new Word("φέρω", "I carry, bear, produce - root *φερ"),
        new Word("οἴσω", "I will carry, bear, produce φέρω - root *οἰ", FUTURE),
        new Word("ἤνεγκα", "I carried, bore, produced φέρω - root *ἐνεχ", AORIST),
        new Word("ἐνήνοχα", "I have carried, bore, produced φέρω - root *ἐνεχ", PERFECT),
        new Word("ἠνέχθην", "I was carried, born, produced φέρω - root *ἐνεχ", PASSIVE, AORIST),
        new Word("ἀπολύω", "I release - root *ἀπο + *λυ"),
        new Word("ἀπολύσω", "I will release ἀπολύω - root *ἀπο + *λυ", FUTURE),
        new Word("ἀπέλυσα", "I released ἀπολύω - root *ἀπο + *λυ", AORIST),
        new Word("ἀπολέλυμαι", "I have been released ἀπολύω - root *ἀπο + *λυ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἀπελύθην", "I was released ἀπολύω - root *ἀπο + *λυ", PASSIVE, AORIST),
        new Word("καπρός", "fruit, crop, result", MASCULINE),
        new Word("καπροῦ", "fruit, crop, result", MASCULINE, GENITIVE),
        new Word("*φη", "to say ", ROOT),
        new Word("φημί", "I say - root *φη"),
        new Word("ἔφη", "I said - φημί root *φη", AORIST),
        // 65
        new Word("εἴτε", "if, whether", PARTICLE),

        // 63
        new Word("ὄρος", "mountain, hill", NEUTER),
        new Word("ὄρους", "mountain, hill", NEUTER, GENITIVE),
        new Word("γραμματεύς", "scribe", MASCULINE),
        new Word("γραμματέως", "scribe", MASCULINE, GENITIVE),

        // 62
        new Word("Ἱεροσόλυμα", "Jerusalem", NEUTER),
        new Word("*δοκ", "to think, seem ", ROOT),
        new Word("δοκέω", "I think, seem - root *δοκ"),
        new Word("ἔδοξα", "I thought, seemed δοκέω - root *δοκ", AORIST),

        // 61
        new Word("*δοξαδ", "to praise, honor, glorify ", ROOT),
        new Word("δοξάζω", "I praise, honor, glorify - root *δοξαδ"),
        new Word("δοξάσω", "I will praise, honor, glorify δοξάζω - root *δοξαδ", FUTURE),
        new Word("ἐδόξασω", "I praised, honored, glorified δοξάζω - root *δοξαδ", AORIST),
        new Word("δεδόξασμαι", "I have been praised, honored, glorified δοξάζω - root *δοξαδ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐδοξάσθην", "I was praised, honored, glorified δοξάζω - root *δοξαδ", PASSIVE, AORIST),
        new Word("*κηρυγ", "to proclaim, preach ", ROOT),
        new Word("κηρύσσω", "I proclaim, preach - root *κηρυγ"),
        new Word("ἐκήρυξα", "I proclaimed, preached κηρύσσω - root *κηρυγ", AORIST),
        new Word("ἐκηρύχθην", "I was proclaimed, preached - root *κηρυγ", PASSIVE, AORIST),
        new Word("εὐ + *αγγελιδ", "to bring good news", ROOT),
        new Word("εὐαγγελίζω", "I bring good news - root *εὐαγγελιδ, often occurs in middle voice with same meaning"),
        new Word("εὐηγγέλισα", "I brought good news εὐαγγελίζω - root *εὐαγγελιδ", AORIST),
        new Word("εὐηγγέλισμαι", "I have been brought good news εὐαγγελίζω - root *εὐαγγελιδ", MIDDLE, PASSIVE, PERFECT),
        new Word("εὐηγγελίσθην", "I was brought good news εὐαγγελίζω - root *εὐαγγελιδ", PASSIVE, AORIST),
        new Word("*ὑπ + *αρχ", "To be, to exist", ROOT),
        new Word("ὑπάρχω", "I am, I exist - root *ὑπ + *αρχ"),

        // 59
        new Word("*ἀσπαδ", "to greet, salute ", ROOT),
        new Word("ἀσπάζομαι", "I greet, salute - root *ἀσπαδ", DEPONENT),
        new Word("ἠσπασάμην", "I greeted, saluted ἀσπάζομαι - root *ἀσπαδ", DEPONENT),
        new Word("λίθος", "stone", MASCULINE),
        new Word("λίθου", "stone", MASCULINE, GENITIVE),

        // 58
        new Word("*θεωρε", "to look at, behold ", ROOT),
        new Word("θεωρέω", "I look at, behold - root *θεωρε"),
        new Word("θεωρήσω", "I will look at, behold θεωρέω - root *θεωρε", FUTURE),
        new Word("εθεώρησα", "I looked at, beheld θεωρέω - root *θεωρε", AORIST),

        // 57
        new Word("τοιοῦτος", "such, of such kind", ADJECTIVE, MASCULINE),
        new Word("τοιαῦτη", "such, of such kind", ADJECTIVE, FEMININE),
        new Word("τοιοῦτον", "such, of such kind", ADJECTIVE, NEUTER),

        // 56
        new Word("μηδέ", "and not, neither"),
        new Word("*δεχ", "to take, receive ", ROOT),
        new Word("δέχομαι", "I take, receive - root *δεχ", DEPONENT),
        new Word("δέξομαι", "I will take, receive δέχομαι - root *δεχ", FUTURE, DEPONENT),
        new Word("ἐδεξάμην", "I took, received δέχομαι - root *δεχ", AORIST, DEPONENT),
        new Word("δέδεγμαι", "I have been taken, received δέχομαι - root *δεχ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐδἐχθην", "I was taken, received δέχομαι - root *δεχ", PASSIVE, AORIST),

        // 55
        new Word("*κραγ", "to cry out, call out ", ROOT),
        new Word("κράζω", "I cry out, call out - root *κραγ"),
        new Word("κράξω", "I will cry out, call out κράζω - root *κραγ", FUTURE),
        new Word("ἔκραξα", "I cried out, called out κράζω - root *κραγ", AORIST),
        new Word("κέκραγα", "I have cried out, called out κράζω - root *κραγ", PERFECT),
        new Word("λοιπός", "remaining (adj), the rest (noun), henceforth (adv)", MASCULINE),
        new Word("λοιπή", "remaining (adj), the rest (noun), henceforth (adv)", FEMININE),
        new Word("λοιπόν", "remaining (adj), the rest (noun), henceforth (adv)", NEUTER),

        // 54
        new Word("δεξιός", "right (hand, side)", ADJECTIVE, MASCULINE),
        new Word("δεξιά", "right (hand, side)", ADJECTIVE, FEMININE),
        new Word("δεξιόν", "right (hand, side)", ADJECTIVE, NEUTER),
        new Word("ούχι", "not"),

        // 53
        new Word("διό", "therefore, for this reason"),

        // 52
        new Word("*πειθ", "to persuade ", ROOT),
        new Word("πείθω", "I persuade - root *πειθ"),
        new Word("πείσω", "I will persuade πείθω - root *πειθ"),
        new Word("ἔπεισα", "I persuaded πείθω - root *πειθ"),
        new Word("πέποιθα", "I have persuaded πείθω - root *πειθ"),
        new Word("πέπεισμαι", "I have been persuaded πείθω - root *πειθ"),
        new Word("ἐπείσθην", "I was persuaded πείθω - root *πειθ"),
        new Word("παιδίον", "child, infant", NEUTER),
        new Word("παιδίου", "child, infant", NEUTER, GENITIVE),
        new Word("*σπερ", "to sow ", ROOT),
        new Word("σπείρω", "I sow - root *σπερ"),
        new Word("ἔσπειρα", "I sowed σπείρω - root *σπερ", AORIST),
        new Word("ἔσπαρμαι", "I have been sown σπείρω - root *σπερ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐσπάρην", "I was sown σπείρω - root *σπερ", PASSIVE, AORIST)

        // Go back and fill in blanks

        );
  }

  @Override
  public Stream<GrammarRule> buildAllRules() {
    return Stream.of(
        new GrammarRule("Nouns rules:\n" +
            "1. Stems ending in α or η are in the first declension, stems ending in ο are in the second, and consonantal stems are in the third.\n" +
            "2. Every neuter word has the same form in the nominative and accusative.\n" +
            "3. Almost all neuter words end in α in the nominative and accusative plural.\n" +
            "4. In the dative singular, the ι subscripts if possible.\n" +
            "5. Vowels often change their length ('ablaut’).\n" +
            "6. In the genitive and dative, the masculine and neuter will always be identical.\n" +
            "7. Square of stops\n" +
            "8. A tau cannot stand at the end of the word and will drop off", 6),

        new GrammarRule("Square of stops (applies to stops before a θ as well):\n" +
            "Labial           Unvoiced π  Voiced β  Aspirates φ  Labial + σ = ψ\n" +
            "Velar (Palatals) Unvoiced κ  Voiced γ  Aspirates χ  Velar + σ = ξ\n" +
            "Dental           Unvoiced τ  Voiced δ  Aspirates θ  Dental + σ = σ"),

        new GrammarRule("1st Declension Paradigm, Feminine\n" +
            "            Singular              Plural\n" +
            "Nomanative            γραφή       ι        γραφαί\n" +
            "Vocative              γραφή       ι        γραφαί\n" +
            "Genitive    ς         γραφῆς      ων       γραφῶν\n" +
            "Dative      ι         γραφῇ       ις       γραφαῖς\n" +
            "Accusative  ν         γραφήν      ς        γραφάς\n"),

        new GrammarRule("2nd Declension Paradigm, Masculine\n" +
            "            Singular              Plural\n" +
            "Nomanative  ς        λόγος        ι      λόγοι\n" +
            "Vocative    ε        λόγε         ι      λόγοι\n" +
            "Genitive    υ        λόγου        ων     λόγων\n" +
            "Dative      ι        λόγῳ         ις     λόγοις\n" +
            "Accusative  ν        λόγον        υς     λόγους\n"),

        new GrammarRule("2nd Declension Paradigm, Neuter\n" +
            "            Singular              Plural\n" +
            "Nomanative  ν        ἔργον        α      ἔργα\n" +
            "Vocative    ε        ἔργε         α      ἔργα\n" +
            "Genitive    υ        ἔργου        ων     ἔργων\n" +
            "Dative      ι        ἔργῳ         ις     ἔργοις\n" +
            "Accusative  ν        ἔργον        α      ἔργα\n"),

        new GrammarRule("Uses of Genitive\n" +
            " * descriptive: Let us put on the armor of light ενδθσμεθα τα οπλα του φωτος\n" +
            " * possessive\n" +
            " * showing apposition to the head noun: You will receive the gift, the Holy Spirit\n" +
            "   λημψεσθε την δωρεαν του αγιου πνευματος"),

        new GrammarRule("Uses of genitive continued:\n" +
            " * showing separation from the head noun: being alienated from the commonwealth of\n" +
            "   Israel απελλοτριωμενοι της πολιτειας του Ισραηλ\n" +
            " * subjective, expanding on the idea of the head noun: Who will separate us from\n" +
            "   Christ’s love τισ ημας χωρισει απο της αγαπης του Χπριστου\n" +
            " * objective, receiving the action of the head noun: The blasphemy against the\n" +
            "   Spirit will not be forgiven η του πνευματος βλασφημια ουκ αφεθησεται"),

        new GrammarRule("Uses of genitive continued:\n" +
            " * plenary, being both subjective and objective: For the love of Christ compels us η\n" +
            "   γαρ αγαπη του Χριστου συνεχει ημας\n" +
            " * relationship: Simon, son of John Σιμων Ιωαννου\n" +
            " * partitive, where the subject is a part of the whole, which is genitive: some of\n" +
            "   the branches τινες των κλαδων"),

        new GrammarRule("Uses of Dative\n" +
            " * Dative Proper (‘to’)\n" +
            " * indirect object: He has given him authority to execute judgment εξουσιαν εδωκεν\n" +
            "   αυτῳ κρισιν ποιεν\n" +
            " * dative of interest, expression “for”:  Your wife Elizabeth will bear a son for\n" +
            "   you η γυνη σου Ελισαβετ γεννησει υιον σοι (called the “dative of advantage” when\n" +
            "   the idea is to the subject’s advantage and “dative of disadvantage” when the idea\n" +
            "   is not to the subject’s advantage)"),

        new GrammarRule("Uses of dative continued\n" +
            " * reference or respect (English, with respect to): Consider yourselves dead to sin\n" +
            "   λογιζεσθε εαυτους ειναι νεκρους τῃ αμαρτιᾳ\n" +
            " * Locative (‘in’, ‘with’)\n" +
            " * sphere or realm in which something occurs: Blessed are the pure in heart μακαριοι\n" +
            "   οι καθαροι τῃ καρδιᾳ\n" +
            " * A time designation in the dative specifies when something occurs: On the third\n" +
            "   day he will be raised τῃ τριτῃ ημερα εγερθησεται"),

        new GrammarRule("Uses of dative continued\n" +
            " * Association, indicating “with”: Do not be unequally yoked with unbelievers μη\n" +
            "   γινεσθε ετεροζυγουντες απιστοις\n" +
            " * Instrumental (‘by’)\n" +
            " * The manner in which something is done: He speaks boldly παρρησιᾳ λαλει\n" +
            " * The means or instrument by which an action is accomplished:  For it is by grace\n" +
            "    you have been saved Τῃ γαρ χαριτι εστε σεσωσμενοι"),

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
            " * Sometimes turning it into a substantive: \n" +
            "     ελαλησαν τον λογον του κυριου πασιν τοις εν τῃ οικιᾳ\n" +
            "     They spoke the word of the Lord to all who were in the house "),

        new GrammarRule("Neuter Plural Subjects\n" +
            "Greek normally uses a singular verb when the subject is neuter plural.  Indicates\n" +
            "the writer is viewing the subject as a group rather than as individuals.  In English\n" +
            "this will require a plural verb:\n" +
            "  δοκιμαζετε τα πνευματα ει εκ του θεου εστιν\n" +
            "  Test the spirits and see if they are from God."),

        new GrammarRule("Uses of article\n" +
            " 1. Definite article\n" +
            " 2. Attaching adjective to preceding noun μετα των αγγελων των αγιων\n" +
            " 3. Is often used with proper names and other nouns that English would not use it with\n" +
            " 4. Can be used with participle or adjective to make it into a noun."),

        new GrammarRule("Uses of article continued\n" +
            " 5. Is sometimes omitted when English would use it: Εν αρχη ην ο λογος\n" +
            " 6. Can function as a personal or possessive pronoun: Οι δε ειπαν προς αυτον And they said to him\n" +
            " 7. Can govern two nouns together, linking them:\n" +
            "    προσδεχομενοι την μακαριαν ελπιδα και επιφανειαν της δοξης του μεγαλου θεου και\n" +
            "      σωτηρος ημων Ιησου Χριστου\n" +
            "    waiting for our blessed hope, the appearing of the glory of our great God and\n" +
            "      Savior Jesus Christ."),

        new GrammarRule("3rd Declension Paradigm, Masculine/Feminine:\n" +
            "            Singular              Plural\n" +
            "Nomanative  ς        σάρξ         ες     σάρκες\n" +
            "Vocative             σάρκ         ες     σάρκες\n" +
            "Genitive    ος       σαρκός       ων     σαρκῶν\n" +
            "Dative      ι        σαρκί        σι(ν)  σαρξί(ν)\n" +
            "Accusative  α/ν      σάρκα        ας     σάρκας\n"),

        new GrammarRule("3rd Declension Paradigm, Neuter:\n" +
            "            Singular              Plural\n" +
            "Nomanative           ὄνομα        α      ὀνόματα\n" +
            "Vocative             ὄνομα        α      ὀνόματα\n" +
            "Genitive    ος       ὀνόματος     ων     ὀνομἀτων\n" +
            "Dative      ι        ὀνόματι      σι(ν)  ὀνόμασι(ν)\n" +
            "Accusative           ὄνομα        α      ὀνόματα\n"),

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
            " * two like vowels combine to the associated long vowel (except following two)\n" +
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
            "   If the second vowel of the dipthong is a ι it subscripts if possible.\n", 17, true),

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
            "in meaning.  It does not take a middle or passive meaning.\n" +
            "Verbs can be deponent in one tense but not in another (e.g. ἔρχομαι is deponent in\n" +
            "the present but not in the aorist.\n" +
            "75% of middle forms in the NT are deponent."),

        new GrammarRule("Future stems:\n" +
            " * Future active has its own stems.\n" +
            " * Future middle uses future active tense stem.\n" +
            " * Future passive uses aorist passive tense stem."),

        new GrammarRule("Future active indicative paradigm:\n" +
            "     Stem  tense formative   connecting vowel  ending  form\n" +
            "1sg  λυ    σ                 ο                 -       λύσω\n" +
            "2sg  λυ    σ                 ε                 ς       λύσεις\n" +
            "3sg  λυ    σ                 ε                 ι       λύσει\n" +
            "1pl  λυ    σ                 ο                 μεν     λύσομεν\n" +
            "2pl  λυ    σ                 ε                 τε      λύσετε\n" +
            "3pl  λυ    σ                 ο                 νσι     λύσουσι(ν)\n"),

        new GrammarRule("Future middle indicative paradigm:\n" +
            "     Stem  tense formative   connecting vowel  ending  form\n" +
            "1sg  λυ    σ                 ο                 μαι     λύσομαι\n" +
            "2sg  λυ    σ                 ε                 σαι     λύσῃ\n" +
            "3sg  λυ    σ                 ε                 ται     λύσεται\n" +
            "1pl  λυ    σ                 ο                 μεθα    λυσόμεθα\n" +
            "2pl  λυ    σ                 ε                 σθε     λύσεσθε\n" +
            "3pl  λυ    σ                 ο                 νται    λύσονται\n"),

        new GrammarRule("Separating γινομαι, γενναω and γινωσκω:\n" +
            " * γινομαι will always have a vowel between the γ and the ν.  Usually an ε.\n" +
            " * γενναω always has double ν and is completely regular.\n" +
            " * γινωσκω, except in the present tense, does not have a vowel between the γ and the ν."),

        new GrammarRule("Verb roots and stems,\n" +
            " * Pattern 1: root not modified.  Example: *ἀκου\n" +
            " * Pattern 2: different roots in different stems\n" +
            " * Pattern 3: verbs with roots ending in a liquid (λ, μ, ν, ρ)"),

        new GrammarRule("Liquid verbs:\n" +
            " * Tense formative for future is εσ instead of just σ but σ often drops out\n" +
            "   when placed between two vowels resulting in future without σ.\n" +
            "   The contracted vowels always have a circumflex (except in 1st plural middle).\n" +
            "   For example: μεν + εσ + ω = μεν + ε + ω = μενῶ"),

        new GrammarRule("Common verb root modifications:\n" +
            " * When the present tense stem ends in ιζω or αζω the root generally ends in a\n" +
            "   dental (τ, δ, θ) *βαπτιδ -> βαπτιζω\n" +
            " * When the present tense stem ends in ασσω the root generally ends in a\n" +
            "   velar ( κ, γ, χ) *ταραχ -> ταρασσω\n" +
            " * When the present tense stem ends in a double consonant the root often ends in\n" +
            "   a single consonant: *βαλ -> βαλλω\n" +
            " * Some roots add a iota in the present stem: *αρ -> αἴρω\n" +
            " * Some roots add σκ or ισκ to form the present: *γνω -> γινωσκω\n" +
            " * Some stem vowels ablaut."),

        new GrammarRule("Verbs that have second aorists are normally verbs that alter their\n" +
            "root in the formation of their present tense stem."),

        new GrammarRule("Imperfect active paradigm:\n" +
            "       form       connecting vowel  ending\n" +
            "1sg    ἔλυον      ο                 ν\n" +
            "2sg    ἔλυες      ε                 ς\n" +
            "3sg    ἔλυε(ν)    ε                 - (ν)\n" +
            "1pl    ἐλύομεν    ο                 μεν\n" +
            "2pl    ἐλὐετε     ε                 τε\n" +
            "3pl    ἔλυον      ο                 ν"),

        new GrammarRule("Imperfect middle/passive paradigm:\n" +
            "       form       connecting vowel  ending\n" +
            "1sg    ἐλυόμην    ο                 μην\n" +
            "2sg    ἐλύου      ε                 σο\n" +
            "3sg    ἐλύετο     ε                 το\n" +
            "1pl    ἐλυόμεθα   ο                 μεθα\n" +
            "2pl    ἐλύεσθε    ε                 σθε\n" +
            "3pl    ἐλύοντο    ο                 ντο"),

        new GrammarRule("Augments for imperfect and aorist:\n" +
            "* If the word begins with a consonant, an ε is prepended.\n" +
            "* If the word begins with a vowel the vowel lengthens:\n" +
            "  α + ε = η\n" +
            "  ε + ε = η\n" +
            "  ο + ε = ω\n" +
            "  η + ε = η\n" +
            "  ι + ε = ι\n" +
            "  υ + ε = υ\n" +
            "  ω + ε = ω\n" +
            "* If the verb begins with a dipthong then either the first letter lengthens,\n" +
            "  and if the second letter is a ι it subscripts, or the verb does not show an augment."),

        new GrammarRule("Base stems:\n" +
            "* Present stem (active, middle, passive)\n" +
            "* Future active stem (also used for middle)\n" +
            "* Aorist active stem (also used for middle)\n" +
            "* Perfect active stem\n" +
            "* Aorist passive stem\n" +
            "* Perfect middle/passive stem\n"),

        new GrammarRule("Tense stems used for other tenses:\n" +
            "* Imperfect tense built on present tense stem.\n" +
            "* Future passive built on aorist passive stem.\n" +
            "* Present participle built on present tense stem.\n" +
            "* Aorist participle built on aorist tense stem.\n" +
            "* Perfect participle built on perfect tense stem.\n" +
            "* Subjunctive present formed from present stem, aorist from aorist stem, perfect on the perfect stem.\n" +
            "* Infinitive present formed from present stem, aorist from aorist stem, perfect on the perfect stem.\n" +
            "* If verb is deponent in a stem, it will be deponent in other tenses built on that stem."),

        new GrammarRule("In a compound verb the augment comes after the preposition.\n" +
            "* If the preposition ends in a vowel it does not contract with the augment\n" +
            "  * Usually the final vowel of the preposition drops off.\n" +
            "  * Sometimes it remains but does not contract.\n" +
            "* When a compound verb with a preposition that ends in κ augments the κ\n" +
            "  changes to ξ."),

        new GrammarRule("Imperfect can describe:\n" +
            " * An ongoing action in the past (most common), called progressive, durative.\n" +
            "   ἐδιδασκεν τους μαθητας αυτου He was teaching his disciples\n" +
            " * Can place emphasis on the beginning of an action, called ingressive, inceptive.\n" +
            "   ἀγγελοι προσηλθον και διηκονουν αυτῳ Angles came and begin to minister to him\n" +
            " * Can stress the repetitive nature of an action, called iterative.\n" +
            "   ἠρχετο προσ αὐτον [the widow] kept coming to him"),

        new GrammarRule("Imperfect can describe (continued):\n" +
            " * Used to desribe actions that occur regularly, called customary.\n" +
            "   Κατα δε ἑορτην _ἀπελυεν_ αὐτοις ἑνα δεσμιον\n" +
            "   Now at the feast _he used to release_ for them any one prisoner\n" +
            " * Can be used to describe a wish (voluntative)\n" +
            "   _ηὐχομην_ γαρ ἀναθεμα εἰναι αὐτος ἐγω For _I could wish_ that I myself were accursed\n" +
            " * Can be used to describe an attempt (conative)\n" +
            "   και ἐπορθουν αὐτην and I tried to destroy it\n" +
            " * Can describe something almost done (tendential)\n" +
            "   ὁ δε Ἰωαννης διεκωλυεν αὐτον John would have prevented him"),

        new GrammarRule("Second aorist active paradigm:\n" +
            "       form       connecting vowel  ending\n" +
            "1sg    ἔλαβον     ο                 ν\n" +
            "2sg    ἔλαβες     ε                 ς\n" +
            "3sg    ἔλαβε(ν)   ε                 - (ν)\n" +
            "1pl    ἐλαβομεν   ο                 μεν\n" +
            "2pl    ἐλαβετε    ε                 τε\n" +
            "3pl    ἔλαβον     ο                 ν"),

        new GrammarRule("Second aorist middle paradigm:\n" +
            "       form        connecting vowel  ending\n" +
            "1sg    ἐγενόμην    ο                 μην\n" +
            "2sg    ἐγένου      ε                 σο\n" +
            "3sg    ἐγένετο     ε                 το\n" +
            "1pl    ἐγενόμεθα   ο                 μεθα\n" +
            "2pl    ἐγένεσθε    ε                 σθε\n" +
            "3pl    ἐγένοντο    ο                 ντο"),

        new GrammarRule("Aorist stems:\n" +
            " * In the active voice, a second aorist will always have a different stem from\n" +
            "   the present because the root will always have been modified to form the\n" +
            "   present stem.\n" +
            " * Almost always the second aorist stem is identical to the root.\n" +
            " * For first aorist the tense stem is normally identical to the present tense stem."),

        new GrammarRule("Aorist meaning:\n" +
            " * Aorist is undefined, just says that an action happened, nothing about when or\n" +
            "   how long.  It is often used for punctiliar (point in time) as in English\n" +
            "   past tense, but that is not always what it means.\n" +
            " * Aorist can refer to an action as a whole (constative)\n" +
            " * It can refer to the beginning of an action (ingressive)\n" +
            " * It can refer to a timeless truth (gnomic)\n" +
            " * It can refer to a future action that will certainly occur (proleptic)."),

        new GrammarRule("First aorist active paradigm:\n" +
            "    augment  stem tense formative  secondary active personal endings  form\n" +
            "1sg ε        λυ   σα               -                                  ἔλυσα\n" +
            "2sg ε        λυ   σα               ς                                  ἔλυσας\n" +
            "3sg ε        λυ   σε               - (ν)                              ἔλυσε(ν)\n" +
            "1pl ε        λυ   σα               μεν                                ἐλύσαμεν\n" +
            "2pl ε        λυ   σα               τε                                 ἐλύσατε\n" +
            "3pl ε        λυ   σα               ν                                  ἔλυσαν"),

        new GrammarRule("First aorist endings and verb types:\n" +
            " * Contract verbs lengthen the contract vowel before the tense formative:\n" +
            "   ἀγαπάω becomes ἠγάπησα\n" +
            " * Stems that end in a stop combine the stop with the sigma, as per the rules.\n" +
            " * Liquid verbs us α/ε as a tense formative rather than σα."),

        new GrammarRule("First aorist middle paradigm:\n" +
            "    augment  stem tense formative  secondary active personal endings  form\n" +
            "1sg ε        λυ   σα               μην                                ἐλυσάμην\n" +
            "2sg ε        λυ   σα               σο                                 ἐλύσω\n" +
            "3sg ε        λυ   σα               το                                 ἐλύσατο\n" +
            "1pl ε        λυ   σα               μεθα                               ἐλυσάμεθα\n" +
            "2pl ε        λυ   σα               σθε                                ἐλύσασθε\n" +
            "3pl ε        λυ   σα               ντο                                ἐλύσαντο"),

        new GrammarRule("First aorist passive paradigm:\n" +
            "    augment  stem tense formative  secondary active personal endings  form\n" +
            "1sg ε        λυ   θη               ν                                  ἐλύθην\n" +
            "2sg ε        λυ   θη               ς                                  ἐλύθης\n" +
            "3sg ε        λυ   θη               -                                  ἐλύθη\n" +
            "1pl ε        λυ   θη               μεν                                ἐλύθημεν\n" +
            "2pl ε        λυ   θη               τε                                 ἐλύθητε\n" +
            "3pl ε        λυ   θη               σαν                                ἐλύθησαν"),

        new GrammarRule("Second aorist passive paradigm:\n" +
            "    augment  stem tense formative  secondary active personal endings  form\n" +
            "1sg ε        λυ   η                ν                                  ἐγράφην\n" +
            "2sg ε        λυ   η                ς                                  ἐγράφης\n" +
            "3sg ε        λυ   η                -                                  ἐγράφη\n" +
            "1pl ε        λυ   η                μεν                                ἐγράφημεν\n" +
            "2pl ε        λυ   η                τε                                 ἐγράφητε\n" +
            "3pl ε        λυ   η                σαν                                ἐγράφησαν"),

        new GrammarRule("Future passive paradigm:\n" +
            "     Stem  tense formative   connecting vowel  ending  form\n" +
            "1sg  λυ    θησ               ο                 μαι     λυθήσομαι\n" +
            "2sg  λυ    θησ               ε                 σαι     λυθήσῃ\n" +
            "3sg  λυ    θησ               ε                 ται     λυθήσεται\n" +
            "1pl  λυ    θησ               ο                 μεθα    λυθησόμεθα\n" +
            "2pl  λυ    θησ               ε                 σθε     λυθήσεσθε\n" +
            "3pl  λυ    θησ               ο                 νται    λυθήσονται\n"),

        new GrammarRule("Second future passive paradigm:\n" +
            "     Stem      tense formative   connecting vowel  ending  form\n" +
            "1sg  ἀποσταλ   ησ                ο                 μαι     ἀποσταλήσομαι\n" +
            "2sg  ἀποσταλ   ησ                ε                 σαι     ἀποσταλήσῃ\n" +
            "3sg  ἀποσταλ   ησ                ε                 ται     ἀποσταλήσεται\n" +
            "1pl  ἀποσταλ   ησ                ο                 μεθα    ἀποσταλησόμεθα\n" +
            "2pl  ἀποσταλ   ησ                ε                 σθε     ἀποσταλήσεσθε\n" +
            "3pl  ἀποσταλ   ησ                ο                 νται    ἀποσταλήσονται\n"),

        new GrammarRule("Perfect tense describes an action that was brought to completion\n" +
            "and whose effects are felt in the present (consummative, extensive).  Can be\n" +
            "translated with have/has or present, e.g.\n" +
            "τον δρομον τετεκεκα I have finished the race\n" +
            "Can also be intensive, stressing the resulting state of an action:\n" +
            "ἀφεωνται σοι αἱ ἁμαρτιαι σου your sins are forgiven you"),

        new GrammarRule("Perfect tense reduplication:\n" +
            " * If the word starts with a single consonant, that consonant is doubled with\n" +
            "   and ε placed between.\n" +
            "   * φ goes to π   χ goes to κ    θ goes to τ\n" +
            " * If the word starts with a vowel or dipthong, the vowel is lengthened.\n" +
            "   * Dipthongs often do not change.\n" +
            " * If the word starts with two consonants, just the ε will usually be prepended,\n" +
            "   no reduplication.  Does not usually apply to words where λ or ρ are the second\n" +
            "   letter.\n" +
            " * Compound verbs reduplicate the verb portion of the word.\n" +
            " * Contract verbs lengthen their contract vowel (ending vowel).\n" +
            " * Second perfect has α instead of κα for the tense formative."),

        new GrammarRule("Middle voice:\n" +
            " * Indirect middle: the action of the verb in some way affects the subject.\n" +
            "   Example: ὁ Πιλατος ... λαβων ὕδωρ ἀπενιψατο τας χειρας\n" +
            "   Pilate took water and washed his hands.  Emphasizes Pilate's attempt to absolve himself.\n" +
            "   δεξασθε τον ἐμφυτον λογον receive the implanted word, receiving is something done for the self.\n" +
            " * Reflexive middle:  the subject does the action and receives it.\n" +
            "   Ἰουδας ... ἀπελθων ἀπηγξατο Judas went out and hung himself"),

        new GrammarRule("Pluperfect describe an action in the past that was completed and who's effect are felt in the past\n" +
            "    augment     reduplication     stem     tense formative     secondary endings     form\n" +
            "1sg (ε)         λε                λυ       κ                   ν                     ἐλελύκειν\n" +
            "2sg (ε)         λε                λυ       κ                   σ                     ἐλελύκεις\n" +
            "3sg (ε)         λε                λυ       κ                   (ν)                   ἐλελύκει(ν)\n" +
            "1pl (ε)         λε                λυ       κ                   μεν                   ἐλελύκειμεν\n" +
            "2pl (ε)         λε                λυ       κ                   τε                    ἐλελύκειτε\n" +
            "3pl (ε)         λε                λυ       κ                   σαν                   ἐλελύκειααν\n"),

        new GrammarRule("Participle aspect:\n" +
            "Present participle describes a continuous action\n" +
            "Aorist participle describes an action where the aspect is undefined\n" +
            "Perfect participle describes a completed action with present effects\n" +
            "Future participle describes an action that is intended, purposed, or expected."),

        new GrammarRule("Participle relative time:\n" +
            "Present: describes an action occurring at the same time as the main verb\n" +
            "Aorist: describes an action occurring before the main verb\n" +
            "Aspect always trumps relative time."),

        new GrammarRule("Participles have two basic types:\n" +
            "Adverbial:  action described by the participle is primary directed towards the verb\n" +
            "  e.g.: While studying his Greek, Ian fell asleep\n" +
            "  If the participle is active, the word modified does the action of the participle\n" +
            "  If the participle is passive, the word modified receives the action of the participle\n" +
            "  Adverbial participles are always anarthrous (no article)\n" +
            "Adjectival: action described by the participle modifies a noun or pronoun\n" +
            "  e.g.: The book lying on the floor belongs to Kathy"),

        new GrammarRule("Particples and other parts of speech:\n" +
            "* Participles do not have a subject and do not take personal endings\n" +
            "* Participles can take objects and prepositional phrases\n" +
            "* Participles are negated with μη"),

        new GrammarRule("Present (continuous) participle breakdown:\n" +
            "Present tense stem + connecting vowel + participle morpheme + case ending\n" +
            "πιστευ             + ο                + ντ                  + ες\n" +
            "λυ                 + ο                + μενο                + οι"),

        new GrammarRule("Participle morphemes:\n" +
            "               masculine   feminine  neuter\n" +
            "active         ντ          ουσα      ντ    \n" +
            "middle/passive μενο        μενη      μενο  \n" +
            "perfect        οτ          οτ        οτ    \n"),

        new GrammarRule("Participal exegesis:\n" +
            "1. Temporal:  the aorist participle can describe an action occurring before the time\n" +
            "   of the finite verb, while the present participle can describe something happening" +
            "   at the same time as the action of the main verb:\n" +
            "   νηστεύσας ... ὕστερον ἐπείνασεν after fasting, ... he was hungry\n" +
            "   συναλιζόμενας παρήγγειλεν αὐτοις while staying with them he charged them.\n" +
            "2. Manner:  can indicate the manner in which the action of the finite verb occurs:\n" +
            "   ἀκουσας δε ὁ νεακισκος τον λογον ἀπηλθεν _λυπουμενος_\n" +
            "   When the young man heard this, he went away _sad_\n" +
            "3. Means:  can indicate the means by which the action of the finite verb occurs:\n" +
            "   κοπιωμεν _ἐργαζομενοι_ ταις ἰδιας χερσιν We toil _working_ with our own hands"),

        new GrammarRule("Participal exegesis continued:\n" +
            "4. Cause:  can indicate the cause or reason or ground of the action of the finite verb:\n" +
            "   ἠγαλλιασατο πανοικει _πεπιστευκως_ τῳ θεῳ\n" +
            "   He was filled with joy, along with his entire household, _because he had come to believe_ in God.\n" +
            "5. Conditional: can indicate a condition that must be fulfilled if the action of the" +
            "   finite verb is to be accomplished:\n" +
            "   παντα ὅσα ἄν αἰτηστε ... _πιστευοντες_ λημψεσθε\n" +
            "   And whatever you ask in prayer, you will receive, _if you have faith_\n" +
            "6. Concessive:  can indicate that the action of the finite verb is true despite the " +
            "   action of the participle:" +
            "   Και ὑμας _ὄντας_ νεκρους τοις παραπτωμασιν\n" +
            "   And _although you were dead_ in your transgressions"),

        new GrammarRule("Participle exegesis continued:\n" +
            "7. Purpose: can indicate the purpose of the finite verb (often translated as infinitive:\n" +
            "   ἄφες ἴδωμεν εἰ ἔρχεται Ἠλιας _σωσων_ αὐτον\n" +
            "   Wait! Let's see if Elijah comes _to save_ him\n" +
            "8. Result:  can indciate the result of the finite verb:\n" +
            "   ἵνα τους δυο κτισῆ ἐν αὐτῳ εἰς ἕνα καινον ἄνθρωπον _ποιων_ εἰρηνην\n" +
            "   In order ot create in himself one new man out of the two, _thus making peace_"),

        new GrammarRule("Participles are often translated as indicatives for several reasons:" +
            "* Breaking up of long sentances (e.g. Eph 1:3-14 is one sentance in Greek)\n" +
            "* Greek likes aorist participle before the main verb where English prefers two " +
            "  finite verbs: εὐθυς _ἀφεντες_ τα δικτυα ἠκολουθησαν αὐτῳ\n" +
            "  Immediately _they left_ their nets and followed him."),

        new GrammarRule("Aorist (undefined aspect) participle breakdown:\n" +
            "Aorst tense stem + tense formative + participle morpheme + case ending\n" +
            "λυ               + σα              + ντ                  + ες\n" +
            "λυ               + σα              + μενο                + ι\n" +
            "λυ               + θε              + ντ                  + ες\n"),

        new GrammarRule("Participle declensions:\n" +
            "* feminine participle always uses 1st declension\n" +
            "* active masculine & neuter use 3rd declension\n" +
            "* middle/passive present masculine & neuter use 2nd declension\n" +
            "* middle aorist masculine & neuter use 2nd declension\n" +
            "* aorist passive use 3rd declension"),

        new GrammarRule("Adjectival participles can be either:\n" +
            "* attribute - acting as an adjective\n" +
            "* substantival - acting as a noun"),

        new GrammarRule("Adverbial participle is always anarthrous (no definite article)\n" +
            "while the adjectival participle is usually articular (has definite article).\n" +
            "Relative time still applies, so aorist still implies the participle is describing\n" +
            "someone/something that acted before the main verb."),

        new GrammarRule("Perfect participles indicate a completed action with effects in the " +
            "present (from the viewpoint of the writer).\n" +
            "Built on the perfect stem of the verb, with reduplication\n" +
            "                Redup-   + perfect    + tense formative + participle + case\n" +
            "                lication   tense stem   formative         morpheme     ending\n" +
            "active:         λε         λυ           κ                 οτ           ες\n" +
            "middle/passive: λε         λυ                             μενο         ι"),

        new GrammarRule("An 'absolute' grammatical construction is one that is not grammatically\n" +
            "related to the rest of the sentance, that is it does not modify any other words in the sentance.\n" +
            "_ταυτα αὐτου λαλουντος_ πολλοι ἐπιστευσαν εἰς αὐτον\n" +
            "_While he was saying these things_ many believed in him" +
            "This is called a genitive absolute (I assume because the participle is in the genitive case)" +
            "The genitive absolute can have a 'subject' such as he in the above example and and object\n" +
            "such as these things in the above, or other modifiers"),

        new GrammarRule("Subjunctive describes possibility or probability.\n" +
            "Subjunctive has aspect, so present tense indicates continuous action while aorist indicates undefined.\n" +
            "Perfect subjunctive (very rare) indicates completed action with continuing consequences."),

        new GrammarRule("οὐ μή plus subjunctive indicates emphatic denial of a future possibility, e.g. Jesus'\n" +
            "words in Jn 10:28 οὐ μή ἀπόλωνται they [his sheep] will by no means perish."),

        new GrammarRule("Subjunctive active present paradigm:\n" +
            "     Stem  connecting personal form\n" +
            "           vowel      ending\n" +
            "1sg  λυ    ω                   λύω\n" +
            "2sg  λυ    η          ς        λύῃς\n" +
            "3sg  λυ    η          ι        λύῃ\n" +
            "1pl  λυ    ω          μεν      λύωμεν\n" +
            "2pl  λυ    η          τε       λύητε\n" +
            "3pl  λυ    ω          νσι      λύωσι(ν)\n"),

        new GrammarRule("Subjunctive middle/passive present paradigm:\n" +
            "     Stem  connecting personal form\n" +
            "           vowel      ending\n" +
            "1sg  λυ    ω          μαι      λυωμαι\n" +
            "2sg  λυ    η          σαι      λυῃ\n" +
            "3sg  λυ    η          ται      λυηται\n" +
            "1pl  λυ    ω          μεθα     λυωμεθα\n" +
            "2pl  λυ    η          σθε      λυησθε\n" +
            "3pl  λυ    ω          νται     λυωνται\n"),

        new GrammarRule("Subjunctive active aorist paradigm:\n" +
            "     Stem  tense     connecting personal form\n" +
            "           formative vowel      ending\n" +
            "1sg  λυ    σ         ω                   λύσω\n" +
            "2sg  λυ    σ         η          ς        λύσῃς\n" +
            "3sg  λυ    σ         η          ι        λύσῃ\n" +
            "1pl  λυ    σ         ω          μεν      λύσωμεν\n" +
            "2pl  λυ    σ         η          τε       λύσητε\n" +
            "3pl  λυ    σ         ω          νσι      λύσωσι(ν)\n"),

        new GrammarRule("Subjunctive middle aorist paradigm:\n" +
            "     Stem  tense     connecting personal form\n" +
            "           formative vowel      ending\n" +
            "1sg  λυ    σ         ω          μαι      λυσωμαι\n" +
            "2sg  λυ    σ         η          σαι      λυσῃ\n" +
            "3sg  λυ    σ         η          ται      λυσηται\n" +
            "1pl  λυ    σ         ω          μεθα     λυσωμεθα\n" +
            "2pl  λυ    σ         η          σθε      λυσησθε\n" +
            "3pl  λυ    σ         ω          νται     λυσωνται\n"),

        new GrammarRule("Subjunctive passive aorist paradigm:\n" +
            "     Stem  tense     connecting personal form\n" +
            "           formative vowel      ending\n" +
            "1sg  λυ    θ         ω                   λύθω\n" +
            "2sg  λυ    θ         η          ς        λύθῃς\n" +
            "3sg  λυ    θ         η          ι        λύθῃ\n" +
            "1pl  λυ    θ         ω          μεν      λύθωμεν\n" +
            "2pl  λυ    θ         η          τε       λύθητε\n" +
            "3pl  λυ    θ         ω          νσι      λύθωσι(ν)\n"),

        new GrammarRule("Uses of the subjunctive:\n" +
            "* Possibility or probability.\n" +
            "* ἵνα is almost always followed by the subjunctive, can indicate purpose:\n" +
            "  τίς σοι ἔδωκεν τήν ἐξουσίαν ταύτην ἵνα ταῦτα _ποιῇς_;\n" +
            "  Who gave you authority that _you do_ these things? \n" +
            "* Can also indicate content of the preceeding verb:\n" +
            "  ἐκήρθξαν ἵνα μετανοῶσιν they preached that they should repent\n" +
            "* ἵνα μή plus subjunctive can be translated as 'lest'\n" +
            "  οἱ πατέπρες, μή ἐρεθίζετε τὰ τέκνα ὑμῶν, _ἵνα μή ἀθυμῶσιν_\n" +
            "  Fathers, do not provoke your children, _lest they become discouraged_"),

        new GrammarRule("Uses of the subjunctive (cont)" +
            "Conditional statements introduced by ἐάν.  If (protasis) is in subjunctive, then (apodosis) any tense or mood.\n" +
            "  Can be future event: ταῦτα σοι πάντα δώσω, ἐάν πεσὼν _προσκυνήσῃς_ μοι\n" +
            "                       All these things I will give you, if you will fall down and _worship_ me\n" +
            "  Can be a timeless truth: ἐάν _θέλῃς_ δύνασαί με καθαρίσαι\n" +
            "                           if _you want_ you can make me clean\n" +
            "Hortatory: first person subjunctive, usually at the beginning of the sentance and plural:\n" +
            "  _διέλθωμεν_ εἰς τό πέραν _let us to across_ to the other side\n" +
            "Deliberative, when the answer to a question is uncertain: τί φάγωμεν what should we eat?"),

        new GrammarRule("ἴνα, ἕως, and most words that include ἄν are usually followed by a subjunctive:\n" +
            "  ὄταν (whenever) ἐάν (if) ὄς ἄν (whoever) ὅπου ἄν (whenever)\n" +
            "Subjunctive negated with μή"),

        new GrammarRule("Three ways to ask a question:\n" +
            "1. No indication is given as to the answer expected:\n" +
            "   σύ εἶ ὁ βασιλεύς τῶν Ἰουδαίων; Are you the king of the Jews?\n" +
            "2. If the question begins with (not just contains) οὐ the inquistor expects a positive answer:\n" +
            "   Διδάσκαλε, οὐ μέλει σοι ὅτι ἀπολλύμεθα Teacher, do you not care that we are perishing?\n" +
            "3. If the question being with μή the inquistor expects a negative answer:\n" +
            "   μή πάντες ἀπόστολοι;  Are all apostles?"),

        new GrammarRule("Infinitive is a verbal noun.\n" +
            "It is viewed as singular neuter and can take a definite articule in singular neuter, the case" +
            "of which is determined by the function of the infinitive in the sentance." +
            "It can have a direct object and adverbial modifiers."),

        new GrammarRule("Infinitive 'tenses':\n" +
            "* present: continuous Οὐδεὶς δύναται δυσὶ κυρίος δουλεύειν No one is able to serve two masters.\n" +
            "* aorist: undefined μὴ φοβηθῇς παραλαβειν Μαρίαν τὴν γυναῖκά σου Do not be afraid to take Mary as your wife\n" +
            "* perfect: completed ἤκουσαν τοῦτο αὐτὸν πεποιηκέναι τὸ σημεῖον They heard he had done this sign"),

        new GrammarRule("Infinitives cannot take a subject (that's what infinite means in this context), but\n" +
            "they will sometimes have a noun in the accusative that acts like a subject:\n" +
            "οὐκ ἤφιεν λαλεῖν τὰ δαιμόνια literally: he would not permit to speak the demons, better English: he would not permit the demons to speak.\n" +
            "Since infinitive can take direct object (which is in accusative) there are cases of infinitive with two nouns in accusative,\n" +
            "Usually the 'subject' is first the object second:\n" +
            "βλέπειν αὐτὸν αὐτήν he to see her"),

        new GrammarRule("Infinitive can be used as a substantive, and is usually proceeded by the definite article, in which\n" +
            "case it is called articular infinitive.  Best translated with 'to':\n" +
            "ἐμοι _το ζην_ Χριστος και _το ἀποθανειν_ κερδος\n" +
            "Literally: for me the live Christ and the die gain, better: for me to live is Christ, and to die is gain"),

        new GrammarRule("Infinitives can be used to complete a finite verb and are called 'complementary inifinitive'\n" +
            "ἤρξαντο λαλειν ἑτερπαις γλωσσαις They begin to speak in tongues\n" +
            "δει, ἐξεστιν (it is lawful), μελλω, δυναμαι, ἀρχομαι will always be followed by an infinitive"),

        new GrammarRule("δια plus article in the accusative plus infinitive means 'because', indicates reason\n" +
            "αὐτος δε Ἰησους ουκ ἐπιστευεν αὐτον αὐτοις _δια το αὐτον γινωσκειν_ παντες\n" +
            "But Jesus on his part did not entrust himself to hem, _because he knew_ all people"),

        new GrammarRule("εις or προς plus article in the accusative plus infinitive means 'in order that', indicates purpose\n" +
            "παραδοσουσιν αὐτον τοις ἐθνεσιν _εις το ἐμπαιξαι και μαστιγωσαι και σταυρωσαι_\n" +
            "They will deliver him over to the Gentiles _to be mocked and flogged and crucified_\n" +
            "Purpose can also be expressed with no preposition and article in genitive"),

        new GrammarRule("προ plus article in genitive plus infinitive means 'before'\n" +
            "ἐν plus article in dative plus infinitive means 'when' or 'while'\n" +
            "μετα plus article in accusative plus infinitive means 'after'\n" +
            "ἐν τῳ σπειρειν αὐτον ἁ μεν ἐπεσεν παρα την ὁδον As he sowed some seeds fell along the path"),

        new GrammarRule("ὡστε plus infinitive indicates result:\n" +
            "ἐπλησαν ἀμφοτερα τα πλοια _ὡστε βυθιζεσθαι_ αὐτα They filled both boats so full that they began to sink"),

        new GrammarRule("Infinitive can be used to report indirect discourse."),

        new GrammarRule("Imperative conveys command or request (as in 'give us this day our daily bread').\n" +
            "Present imperative conveys a continuous command or a general precept (always ...)\n" +
            "While aorist applies to a particular situation."),

        new GrammarRule("Imperative active present paradigm:\n" +
            "     Stem  connecting personal form\n" +
            "           vowel      ending\n" +
            "2sg  λυ    ε          ?        λῦε\n" +
            "3sg  λυ    ε          τω       λυέτω\n" +
            "2pl  λυ    ε          τε       λύετε\n" +
            "3pl  λυ    ε          τωσαν    λυέτωσαν\n"),

        new GrammarRule("Imperative middle/passive present paradigm:\n" +
            "     Stem  connecting personal form\n" +
            "           vowel      ending\n" +
            "2sg  λυ    ε          ?        λύου\n" +
            "3sg  λυ    ε          σθω      λυέσθω\n" +
            "2pl  λυ    ε          σθε      λύεσθε\n" +
            "3pl  λυ    ε          σθωσαν   λυέσθωσαν\n"),

        new GrammarRule("Imperative active aorist paradigm:\n" +
            "     Stem  tense     connecting personal form\n" +
            "           formative vowel      ending\n" +
            "2sg  λυ    σ         α                   λῦσον\n" +
            "3sg  λυ    σ         α          τω       λυσάτω\n" +
            "2pl  λυ    σ         α          τε       λύσατε\n" +
            "3pl  λυ    σ         α          τωσαν    λυσάτωσαν\n"),

        new GrammarRule("Imperative middle aorist paradigm:\n" +
            "     Stem  tense     connecting personal form\n" +
            "           formative vowel      ending\n" +
            "2sg  λυ    σ         α                   λῦσαι\n" +
            "3sg  λυ    σ         α          σθω      λυσάσθω\n" +
            "2pl  λυ    σ         α          σθε      λύσασθε\n" +
            "3pl  λυ    σ         α          σθωσαν   λυσάσθωσαν\n"),

        new GrammarRule("Imperative passive aorist paradigm:\n" +
            "     Stem  tense     connecting personal form\n" +
            "           formative vowel      ending\n" +
            "2sg  λυ    θ         η                   λύθητι\n" +
            "3sg  λυ    θ         η          τω       λυθήτω\n" +
            "2pl  λυ    θ         η          τε       λύθητε\n" +
            "3pl  λυ    θ         ω          τωσαν    λυθήτωσαν\n"),

        new GrammarRule("Forms of negation:\n" +
            " * οὐ with future indicative = simple negation\n" +
            "   οὐ μοιχεύσεις you shall not commit adultery\n" +
            " * μή plus present imperative = prohibiting a continuous action\n" +
            "   μή μεριμνᾶτε τῇ ψυχῇ ὑμῶν do not worry about your life\n" +
            " * μή plus aorist imperative = prohibiting an undefinted action\n" +
            "   μή γνώτω ἡ ἀριστερά σου τί ποιεῖ ἡ δεξιά σου Do not let your left hand know what your right hand is doing"),

        new GrammarRule("Forms of negation continued:\n" +
            " * μή plus aorist subjunctive = stronger form of no than οὐ plus indicative\n" +
            "   μή φοβηθῇς παραλαβεῖν Μαρῖαν τὴν γυναῖκά σου Do not be afraid to take Mary home as your wife\n" +
            " * οὐ μή plus aorist subjunctive = very strong no\n" +
            "   οἱ λόγοι μου οὐ παρέλθωσιν  My words will by no means [or never, but without time reference] pass away"),

        new GrammarRule("Standard verb conjugation (e.g. λυω) is called thematic.  Verbs ending in μι are called athematic.\n" +
            "(because the connecting vowel is called the thematic vowel and athematic verbs lack a thematic vowel)."),

        new GrammarRule("Athematic verbs rule 1: they reduplicate their initial stem letter to form the present, inserting a ι between.\n" +
            "(This appears to apply to the imperfect as well, I assume because the imperfect is formed from the present stem)"),

        new GrammarRule("Athematic verbs rule 2: they do not ordinarily use a connecting vowel in the present indicative."),

        new GrammarRule("Athematic verbs rule 3: they use different personal endings in present active indicative, but the same endings everywhere else:\n" +
            "Example: *δο\n" +
            "     Stem    personal   form\n" +
            "             ending\n" +
            "1sg  διδω    μι         δίδωμι\n" +
            "2sg  διδω    ς          δίδως\n" +
            "3sg  διδω    σι         δίδωσι(ν)\n" +
            "1pl  διδο    μεν        δίδομεν\n" +
            "2pl  διδο    τε         δίδοτε\n" +
            "3pl  διδο    ασι        διδόασι(ν)\n"),

        new GrammarRule("Athematic verbs rule 4: the stem vowel will often lengthen, shorten, or drop out (e.g. δο to διδωμι)"),

        new GrammarRule("Athematic verbs rule 5: most use κα as the tense formative in the aorist."),

        new GrammarRule("Exceptions to a verb uses first aorist or second aorist only:\n" +
            "δίδωμι uses first aorist in indicative and second aorist for other moods\n" +
            "ἵστημι uses both, first aorist ἔστησα for transitive and second aorist ἔστην for intransitive."),

        new GrammarRule("Athemtic verbs use same endings as thematic verbs in everything but present active indicative.  Following\n" +
            "examples used to show just how the stems change in various situations.  Only first person singular used except where\n" +
            "noted otherwise\n" +
            "mood         voice           tense        stem    form         notes\n" +
            "indicative   active          present      διδω    δίδωμι\n" +
            "indicative   active          future       δω      δώσω\n" +
            "indicative   active          2nd aorist   δω      ἔδωκα\n" +
            "indicative   active          future       δω      δέδωκα\n" +
            "indicative   middle/passive  present      διδο    δίδομαι\n"),

        new GrammarRule("Athematic verb endings continued:\n" +
            "mood         voice           tense        stem    form         notes\n" +
            "subjunctive  active          present      διδω    διδῶ\n" +
            "subjunctive  active          2nd aorist   δω      δῶ\n" +
            "subjunctive  middle/passive  present      διδω    διδῶμαι\n" +
            "subjunctive  middle          2nd aorist   δω      δῶμαι\n" +
            "subjunctive  passive         2nd aorist   δο      δοθῶ\n"),

        new GrammarRule("Athematic verb endings continued:\n" +
            "mood         voice           tense        stem    form         notes\n" +
            "imperative   active          present      διδο    δίδοτε       2nd person plural\n" +
            "imperative   active          2nd aorist   δο      δότε         2nd person plural\n" +
            "imperative   middle/passive  present      διδο    δίδοσθε      2nd person plural\n" +
            "imperative   middle          2nd aorist   δο      δόσθε        2nd person plural\n" +
            "imperative   passive         2nd aorist   δο      δόθητε       2nd person plural"),

        new GrammarRule("Athematic verb endings continued:\n" +
            "mood         voice           tense        stem    form         notes\n" +
            "infinitive   active          present      διδο    διδόναι\n" +
            "infinitive   middle/passive  present      διδο    δίδοσθαι\n" +
            "infinitive   active          2nd aorist   δο      δοῦναι\n" +
            "infinitive   middle          2nd aorist   δο      δόσθαι\n" +
            "infinitive   passive         2nd aorist   δο      δοθῆναι"),

        new GrammarRule("Athematic verb endings continued:\n" +
            "mood         voice           tense        stem    form         notes\n" +
            "participle   active          present      διδο    διδούς       masculine nominative singular\n" +
            "participle   active          present      διδο    διδοῦσα      feminine nominative singular\n" +
            "participle   active          present      διδο    διδόν        neuter nominative singular\n" +
            "participle   active          2nd aorist   δο      δούς         masculine nominative singular\n" +
            "participle   active          2nd aorist   δο      δοῦσα        feminine nominative singular\n" +
            "participle   active          2nd aorist   δο      δόν          neuter nominative singular\n" +
            "participle   middle/passive  present      διδο    διδόμενος    masculine nominative singular\n" +
            "participle   middle          2nd aorist   δο      δόμενος      masculine nominative singular\n" +
            "participle   passive         2nd aorist   δο      δοθείς       masculine nominative singular"),

        new GrammarRule("Conditional senatances, if then:  if called protasis, then apodosis\n" +
            "  * First class conditional, aka conditions of fact:  assume something is true for argument (it may or \n" +
            "    may not be), then the apodosis must be true:" +
            "    protasis: εἰ + indicative any tense; apodosis: any mood, any tense; negated by οὐ\n" +
            "    εἰ δέ ἀνάστασις νεκρῶν οὐκ ἔστιν, οὐδὲ Χριστὸς ἐγήγερται" +
            "    But if there is no ressurection of the dead, then not even Christ has been raised."),

        new GrammarRule("Conditional senatances, if then:  if called protasis, then apodosis\n" +
            "  * Second class conditional, aka contrary to fact:  if something were true, which it isn't, then\n" +
            "    something else would be true." +
            "    protasis: εἰ + indicative past tense; apodosis: ἄν plus same tense as protasis; negated by μή\n" +
            "    εἰ γάρ ἔγνωσαν, ούκ ἂν τὸν κύριον τῆς δόξης ἐσταύπωσαν" +
            "    For if they had known, they would not have crucified the Lord of glory"),

        new GrammarRule("Conditional senatances, if then:  if called protasis, then apodosis\n" +
            "  * Third class conditional, future more probable (something might be true in the future) or present general (generally true at all times)\n" +
            "    protasis: ἐάν + subjunctive; apodosis: any mood, any tense; negated by μή\n" +
            "    Future more probable: ταῦτα σοι πάντα δώσω, ἐάν πεσὼν _προσκυνήσῃς_ μοι\n" +
            "    All these things I will give you, if you will fall down and _worship_ me\n" +
            "    present general: ἐάν _θέλῃς_ δύνασαί με καθαρίσαι\n" +
            "    if _you want_ you can make me clean\n"),

        new GrammarRule("Optative mood, one further step from reality than subjunctive, the mood of wish or desire."),

        new GrammarRule("Optative active present paradigm:\n" +
            "     Stem  tense     mood       personal form\n" +
            "           formative formative  ending\n" +
            "1sg  λυ              οι         μι       λύοιμι\n" +
            "2sg  λυ              οι         ς        λύοις\n" +
            "3sg  λυ              οι         ι        λύοι\n" +
            "1pl  λυ              οι         μεν      λύοιμεν\n" +
            "2pl  λυ              οι         τε       λύοιτε\n" +
            "3pl  λυ              οι         νσι      λύοιεν\n"),

        new GrammarRule("Optative active aorist paradigm:\n" +
            "     Stem  tense     mood       personal form\n" +
            "           formative formative  ending\n" +
            "1sg  λυ    σα        ι          μι       λύσαιμι\n" +
            "2sg  λυ    σα        ι          ς        λύσαις\n" +
            "3sg  λυ    σα        ι          ι        λύσαι\n" +
            "1pl  λυ    σα        ι          μεν      λύσαιμεν\n" +
            "2pl  λυ    σα        ι          τε       λύσαιτε\n" +
            "3pl  λυ    σα        ι          νσι      λύσαιεν\n"),

        new GrammarRule("Optative middle/passive present paradigm:\n" +
            "     Stem  tense     mood       personal form\n" +
            "           formative formative  ending\n" +
            "1sg  λυ              οι         μαι      λυοίμην\n" +
            "2sg  λυ              οι         σαι      λύοιο\n" +
            "3sg  λυ              οι         ται      λύοιτο\n" +
            "1pl  λυ              οι         μεθα     λυοίμεθα\n" +
            "2pl  λυ              οι         σθε      λύοισθε\n" +
            "3pl  λυ              οι         νται     λύοιντο\n"),

        new GrammarRule("Optative middle aorist paradigm:\n" +
            "     Stem  tense     mood       personal form\n" +
            "           formative formative  ending\n" +
            "1sg  λυ    σα        ι          μαι      λυσαίμην\n" +
            "2sg  λυ    σα        ι          σαι      λύσαιο\n" +
            "3sg  λυ    σα        ι          ται      λύσαιτο\n" +
            "1pl  λυ    σα        ι          μεθα     λυσαίμεθα\n" +
            "2pl  λυ    σα        ι          σθε      λύσαισθε\n" +
            "3pl  λυ    σα        ι          νται     λύσαιντο\n"),

        new GrammarRule("Subjunctive passive aorist paradigm:\n" +
            "     Stem  tense     mood       personal form\n" +
            "           formative formative  ending\n" +
            "1sg  λυ    θε        ιη                  λυθείην\n" +
            "2sg  λυ    θε        ιη         ς        λυθείης\n" +
            "3sg  λυ    θε        ιη         ι        λυθείη\n" +
            "1pl  λυ    θε        ιη         μεν      λυθείημεν\n" +
            "2pl  λυ    θε        ιη         τε       λυθείητε\n" +
            "3pl  λυ    θε        ιη         νσι      λυθείησαν\n")


         // Continue with 36.5 page 334
        // Figure out what to do with 25.23


    );
  }
}
