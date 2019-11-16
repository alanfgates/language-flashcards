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

import java.util.Arrays;
import java.util.List;

import static com.github.alanfgates.language.flashcards.Declension.*;
import static com.github.alanfgates.language.flashcards.Gender.*;
import static com.github.alanfgates.language.flashcards.Mood.*;
import static com.github.alanfgates.language.flashcards.Number.*;
import static com.github.alanfgates.language.flashcards.Other.*;
import static com.github.alanfgates.language.flashcards.Person.*;
import static com.github.alanfgates.language.flashcards.Tense.*;
import static com.github.alanfgates.language.flashcards.Voice.*;

class GreekBuilderHelperGrammar {
  static List<Word> getGrammar() {
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
        new Word("ἐλελύκειν", "I had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, SINGULAR),
        new Word("λελύκειν", "I had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, SINGULAR),
        new Word("ἐλελύκεις", "you had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, SINGULAR),
        new Word("λελύκεις", "you had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, SINGULAR),
        new Word("ἐλελύκειν", "s/he had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR),
        new Word("λελύκειν", "s/he had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἐλελύκει", "s/he had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR),
        new Word("λελύκει", "s/he had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἐλελύκειμεν", "we had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, PLURAL),
        new Word("λελύκειμεν", "we had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, PLURAL),
        new Word("ἐλελύκειτε", "you had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, PLURAL),
        new Word("λελύκειτε", "you had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, PLURAL),
        new Word("ἐλελύκεισαν", "they had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, PLURAL),
        new Word("λελύκεισαν", "they had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, PLURAL),

        // Indicative Middle Present
        new Word("λύομαι", "I loosen myself", INDICATIVE, MIDDLE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύῃ", "you loosen yourself", INDICATIVE, MIDDLE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύεται", "s/he loosens her/himself", INDICATIVE, MIDDLE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυόμεθα", "we loosen ourselves", INDICATIVE, MIDDLE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύεσθε", "you loosen yourselves", INDICATIVE, MIDDLE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύονται", "they loosen themselves", INDICATIVE, MIDDLE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic indicative middle present
        new Word("δίδομαι", "I give myself - stem διδο", true, ATHEMATIC, INDICATIVE, MIDDLE, PRESENT, FIRST_PERSON, SINGULAR),

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
        new Word("δίδομαι", "I am given - stem διδο", true, ATHEMATIC, INDICATIVE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),

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

        // Indicative Passive Perfect
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
        new Word("λύωμεν", "we might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύητε", "you might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύωσι", "they might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),
        new Word("λύωσιν", "they might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic subjunctive active present
        new Word("διδῶ", "I might be giving - stem διδω", true, SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),

        // Subjunctive active aorist
        new Word("λύσω", "I might loosen", SUBJUNCTIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("λύσῃς", "you might loosen", SUBJUNCTIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λύσῃ", "s/he might loosen", SUBJUNCTIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λύσωμεν", "we might loosen", SUBJUNCTIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("λύσητε", "you might loosen", SUBJUNCTIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λύσωσι", "they might loosen", SUBJUNCTIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),
        new Word("λύσωσιν", "they might loosen", SUBJUNCTIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),

        // Subjunctive active second aorist
        new Word("λάβω", "I might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("λάβῃς", "you might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("λάβῃ", "s/he might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("λάβωμεν", "we might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("λάβητε", "you might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("λάβωσι", "they might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),
        new Word("λάβωσιν", "they might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic subjunctive active second aorist
        new Word("δῶ", "I might give - stem δω", true, SUBJUNCTIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),

        // Subjunctive middle present
        new Word("λύωμαι", "I might be loosening myself", SUBJUNCTIVE, MIDDLE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύῃ", "you might be loosening yourself", SUBJUNCTIVE, MIDDLE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύηται", "s/he might be loosening her/himself", SUBJUNCTIVE, MIDDLE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυώμεθα", "we might be loosening ourselves", SUBJUNCTIVE, MIDDLE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύησθε", "you might be loosening yourselves", SUBJUNCTIVE, MIDDLE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύωνται", "they might be loosening themselves", SUBJUNCTIVE, MIDDLE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic subjunctive middle present
        new Word("διδῶμαι", "I might be giving myself - stem διδω", true, SUBJUNCTIVE, MIDDLE, PRESENT, FIRST_PERSON, SINGULAR),

        // Subjunctive middle aorist
        new Word("λύσωμαι", "I might loosen myself", SUBJUNCTIVE, MIDDLE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("λύσῃ", "you might loosen yourself", SUBJUNCTIVE, MIDDLE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λύσηται", "s/he might loosen her/himself", SUBJUNCTIVE, MIDDLE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λυσώμεθα", "we might loosen ourselves", SUBJUNCTIVE, MIDDLE, AORIST, FIRST_PERSON, PLURAL),
        new Word("λύσησθε", "you might loosen yourselves", SUBJUNCTIVE, MIDDLE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λύσωνται", "they might loosen themselves", SUBJUNCTIVE, MIDDLE, AORIST, THIRD_PERSON, PLURAL),

        // Subjunctive middle second aorist
        new Word("γένωμαι", "I might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("γένῃ", "you might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("γένηται", "s/he might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("γενώμεθα", "we might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("γένησθε", "you might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("γένωνται", "they might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic subjunctive middle second aorist
        new Word("δῶμαι", "I might give myself - stem δω", true, SUBJUNCTIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, SINGULAR),

        // Subjunctive passive present
        new Word("λύωμαι", "I might be being loosened", SUBJUNCTIVE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύῃ", "you might be being loosened", SUBJUNCTIVE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύηται", "s/he might be being loosened", SUBJUNCTIVE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυώμεθα", "we might be being loosened", SUBJUNCTIVE, PASSIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύησθε", "you might be being loosened", SUBJUNCTIVE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύωνται", "they might be being loosened", SUBJUNCTIVE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic subjunctive passive present
        new Word("διδῶμαι", "I might be being given - stem διδω", true, SUBJUNCTIVE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),

        // Subjunctive passive aorist
        new Word("λυθῶ", "I might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("λυθῇς", "you might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λυθῇ", "s/he might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λυθῶμεν", "we might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("λυθῆτε", "you might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λυθῶσι", "they might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, THIRD_PERSON, PLURAL),
        new Word("λυθῶσιν", "they might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, THIRD_PERSON, PLURAL),

        // Subjunctive passive second aorist
        new Word("γραφῶ", "I might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("γραφῇς", "you might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("γραφῇ", "s/he might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("γραφῶμεν", "we might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("γραφῆτε", "you might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("γραφῶσι", "they might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),
        new Word("γραφῶσιν", "they might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic subjunctive passive second aorist
        new Word("δοθῶ", "I might be given - stem δο", true, SUBJUNCTIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),

        // Imperative active present
        new Word("λῦε", "keep loosing!", true, IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λυέτω", "let him/her keep loosing!", IMPERATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λύετε", "keep loosing!", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λυέτωσαν", "let them keep loosing!", IMPERATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic imperative active present
        new Word("δίδοτε", "keep giving! - stem διδο", true, IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),

        // Imperative active aorist
        new Word("λῦσον", "loose!", true, IMPERATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λυσάτω", "let him/her loose!", IMPERATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λύσατε", "loose!", IMPERATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λυσάτωσαν", "let them loose!", IMPERATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),

        // Imperative active second aorist
        new Word("λάβε", "take!", IMPERATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("λαβέτω", "let him/her take!", IMPERATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("λάβετε", "take!", IMPERATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("λαβέτωσαν", "let them take!", IMPERATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic imperative active second aorist
        new Word("δότε", "give! - stem δο", true, IMPERATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),

        // Imperative middle present
        new Word("λύου", "keep loosing yourself!", true, IMPERATIVE, MIDDLE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λυέσθω", "let him/her keep loosing him/herself!", true, IMPERATIVE, MIDDLE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λύεσθε", "keep loosing yourselves!", IMPERATIVE, MIDDLE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λυέσθωσαν", "let them keep loosing themselves!", true, IMPERATIVE, MIDDLE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic imperative middle present
        new Word("δίδοσθε", "keep giving yourselves! - stem διδο", true, IMPERATIVE, MIDDLE, PRESENT, SECOND_PERSON, PLURAL),

        // Imperative middle aorist
        new Word("λῦσαι", "loose yourself!", true, IMPERATIVE, MIDDLE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λυσάσθω", "let him/her loose him/herself!", true, IMPERATIVE, MIDDLE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λύσασθε", "loose yourselves!", IMPERATIVE, MIDDLE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λυσάσθωσαν", "let them loose themselves!", true, IMPERATIVE, MIDDLE, AORIST, THIRD_PERSON, PLURAL),

        // Imperative middle second aorist
        new Word("γενοῦ", "become!", IMPERATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("γενέσθω", "let him/her become!", IMPERATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("γένεσθε", "become!", IMPERATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("γενέσθωσαν", "let them become!", IMPERATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic imperative middle second aorist
        new Word("δόσθε", "give yourselves! - stem δο", true, IMPERATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL),

        // Imperative passive present
        new Word("λύου", "keep being loosed!", true, IMPERATIVE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λυέσθω", "let him/her keep being loosed!", true, IMPERATIVE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λύεσθε", "keep being loosed!", IMPERATIVE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λυέσθωσαν", "let them keep being loosed!", true, IMPERATIVE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic imperative passive present
        new Word("δίδοσθε", "keep being given! - stem διδο", true, IMPERATIVE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),

        // Imperative passive aorist
        new Word("λύθητι", "be loosed!", true, IMPERATIVE, PASSIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λυθήτω", "let him/her be loosed!", true, IMPERATIVE, PASSIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λύθητε", "be loosed!", IMPERATIVE, PASSIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λυθήτωσαν", "let them be loosed!", true, IMPERATIVE, PASSIVE, AORIST, THIRD_PERSON, PLURAL),

        // Imperative passive second aorist
        new Word("γράφητι", "be written!", IMPERATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("γραφήτω", "let him/her be written!", IMPERATIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("γράφητε", "be written!", IMPERATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("γραφήτωσαν", "let them be written!", IMPERATIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic imperative passive second aorist
        new Word("δόθητε", "be given! - stem δο", true, IMPERATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),

        // Infinitive active
        new Word("λύειν", "to continually loosen", true, INFINITIVE, ACTIVE, PRESENT),
        new Word("λῦσαι", "to loosen", true, INFINITIVE, ACTIVE, AORIST),
        new Word("λαβεῖν", "to receive", true, INFINITIVE, ACTIVE, SECOND_AORIST),
        new Word("λελυκέναι", "to have loosened", true, INFINITIVE, ACTIVE, PERFECT),

        // Athematic infinitive active
        new Word("διδόναι", "to keep giving - stem διδο", true, INFINITIVE, ACTIVE, PRESENT),
        new Word("δοῦναι", "to give - stem δο", true, INFINITIVE, ACTIVE, SECOND_AORIST),

        // Infinitive middle
        new Word("λύεσθαι", "to continually loosen oneself", true, INFINITIVE, MIDDLE, PRESENT),
        new Word("λύσασθαι", "to loosen oneself", true, INFINITIVE, MIDDLE, AORIST),
        new Word("λαβέσθαι", "to receive oneself", true, INFINITIVE, MIDDLE, SECOND_AORIST),
        new Word("λελύσθαι", "to have loosened oneself", true, INFINITIVE, MIDDLE, PERFECT),

        // Athematic infinitive middle
        new Word("δίδοσθαι", "to keep giving oneself - stem διδο", true, INFINITIVE, MIDDLE, PRESENT),
        new Word("δόσθαι", "to give oneself - stem δο", true, INFINITIVE, MIDDLE, SECOND_AORIST),

        // Infinitive passive
        new Word("λύεσθαι", "to continually have been loosened", true, INFINITIVE, PASSIVE, PRESENT),
        new Word("λυθῆναι", "to have been loosened", true, INFINITIVE, PASSIVE, AORIST),
        new Word("γραφῆναι", "to have received", INFINITIVE, PASSIVE, SECOND_AORIST),
        new Word("λελῦσθαι", "to have been loosened", true, INFINITIVE, PASSIVE, PERFECT),

        // Athematic infinitive passive
        new Word("δίδοσθαι", "to keep being given - stem διδο", true, INFINITIVE, PASSIVE, PRESENT),
        new Word("δοθῆναι", "to be given - stem δο", true, INFINITIVE, PASSIVE, SECOND_AORIST),

        // Participle active present
        new Word("λύων", "loosening", true, PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),
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
        new Word("λῦον", "loosening", true, PARTICIPLE, ACTIVE, PRESENT, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("λύοντα", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, PLURAL),
        new Word("λύοντων", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, GENITIVE, PLURAL),
        new Word("λύουσι", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, PLURAL),
        new Word("λύουσιν", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, PLURAL),
        new Word("λύοντα", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, ACCUSATIVE, PLURAL),

        // Athematic participle active present
        new Word("διδούς", "giving - stem διδο", true, PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("διδοῦσα", "giving - stem διδο", true, PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("διδόν", "giving - stem διδο", true, PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, SINGULAR),

        // Participle active aorist
        new Word("λύσας", "loosening", true, PARTICIPLE, ACTIVE, AORIST, MASCULINE, NOMINATIVE, SINGULAR),
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
        new Word("λῦσαν", "loosening", true, PARTICIPLE, ACTIVE, AORIST, NEUTER, NOMINATIVE, SINGULAR),
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
        new Word("δούς", "giving - stem δο", true, PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("δοῦσα", "giving - stem δο", true, PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, NOMINATIVE, SINGULAR),
        new Word("δόν", "giving - stem δο", true, PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, NOMINATIVE, SINGULAR),

        // Participle active perfect
        new Word("λελυκώς", "having loosened", true, PARTICIPLE, ACTIVE, PERFECT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λελυκότος", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, GENITIVE, SINGULAR),
        new Word("λελυκότι", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, DATIVE, SINGULAR),
        new Word("λελυκότα", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("λελυκότες", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λελυκότων", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, GENITIVE, PLURAL),
        new Word("λελυκόσι", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, DATIVE, PLURAL),
        new Word("λελυκόσιν", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, DATIVE, PLURAL),
        new Word("λελυκότας", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λελυκυῖα", "having loosened", true, PARTICIPLE, ACTIVE, PERFECT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λελυκυῖας", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, GENITIVE, SINGULAR),
        new Word("λελυκυῖᾳ", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, DATIVE, SINGULAR),
        new Word("λελυκυῖαν", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λελυκυῖαι", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, NOMINATIVE, PLURAL),
        new Word("λελυκυιων", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, GENITIVE, PLURAL),
        new Word("λελυκυῖαις", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, DATIVE, PLURAL),
        new Word("λελυκυίας", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, ACCUSATIVE, PLURAL),
        new Word("λελυκός", "having loosened", true, PARTICIPLE, ACTIVE, PERFECT, NEUTER, NOMINATIVE, SINGULAR),
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
        new Word("διδόμενος", "giving oneself - stem διδο", true, PARTICIPLE, MIDDLE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),

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
        new Word("δόμενος", "giving oneself - stem δο", true, PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR),

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
        new Word("διδόμενος", "being given - stem διδο", true, PARTICIPLE, PASSIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),

        // Participle passive aorist
        new Word("λυθείς", "loosening", true, PARTICIPLE, PASSIVE, AORIST, MASCULINE, NOMINATIVE, SINGULAR),
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
        new Word("λυθέν", "loosening", true, PARTICIPLE, PASSIVE, AORIST, NEUTER, NOMINATIVE, SINGULAR),
        new Word("λυθέντος", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, GENITIVE, SINGULAR),
        new Word("λυθέντι", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, DATIVE, SINGULAR),
        new Word("λυθέν", "loosening", true, PARTICIPLE, PASSIVE, AORIST, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("λυθέντα", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, NOMINATIVE, PLURAL),
        new Word("λυθέντων", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, GENITIVE, PLURAL),
        new Word("λυθεῖσι", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, DATIVE, PLURAL),
        new Word("λυθεῖσιν", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, DATIVE, PLURAL),
        new Word("λυθέντα", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, ACCUSATIVE, PLURAL),

        // No verb occurring 50 or more times in the NT has 2nd passive participle

        // Athematic participle passive second aorist
        new Word("δοθείς", "being given - stem δο", true, PARTICIPLE, PASSIVE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR),


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
        new Word("λύσαι", "s/he wishes to loosen", OPTATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λύσαιμεν", "we wish to loosen", OPTATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("λύσαιτε", "you wish to loosen", OPTATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λύσαιεν", "they wish to loosen", OPTATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),

        // Optative Active Second Aorist
        new Word("βάλοιμι", "I wish to throw", OPTATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        new Word("βάλοις", "you wish to throw", OPTATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("βάλοι", "s/he wishes to throw", OPTATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
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
        new Word("σάρκας", "fleshes - root σάρκ", FEMININE, ACCUSATIVE, PLURAL, THIRD_DECLENSION)
    );
  }
}
