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
import static com.github.alanfgates.language.flashcards.Word.Competence.*;

class GreekBuilderHelperGrammar {
  static List<Word> getGrammar() {
    return Arrays.asList(
        //----------------------------------------------------------------------------------------
        // VERB FORMS
        //
        // Indicative Active Present
        new Word(new WordForm("λύω", "I loosen", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR), STRONG, "indicative active present")
            .addForm(new WordForm("λύεις", "you loosen", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λύει", "s/he loosens", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λύομεν", "we loosen", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λύετε", "you loosen", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λύουσι", "they loosen", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL))
            .addForm(new WordForm("λύουσιν", "they loosen", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL)),

        // Indicative Active Future
        new Word(new WordForm("λύσω", "I will loosen", INDICATIVE, ACTIVE, FUTURE, FIRST_PERSON, SINGULAR), STRONG, "indicative active future")
            .addForm(new WordForm("λύσεις", "you will loosen", INDICATIVE, ACTIVE, FUTURE, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λύσει", "s/he will loosen", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λύσομεν", "we will loosen", INDICATIVE, ACTIVE, FUTURE, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λύσετε", "you will loosen", INDICATIVE, ACTIVE, FUTURE, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λύσουσι", "they will loosen", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, PLURAL))
            .addForm(new WordForm("λύσουσιν", "they will loosen", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, PLURAL)),

        // Indicative Active Imperfect
        new Word(new WordForm("ἔλυον", "I was loosening", INDICATIVE, ACTIVE, IMPERFECT, FIRST_PERSON, SINGULAR), STRONG, "indicative active imperfect")
            .addForm(new WordForm("ἔλυες", "you were loosening", INDICATIVE, ACTIVE, IMPERFECT, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("ἔλυε", "s/he was loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἔλυεν", "s/he was loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἐλύομεν", "we were loosening", INDICATIVE, ACTIVE, IMPERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἐλύετε", "you were loosening", INDICATIVE, ACTIVE, IMPERFECT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("ἔλυον", "they were loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, PLURAL)),

        // Indicative Active Aorist
        new Word(new WordForm("ἔλυσα", "I loosened", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR), STRONG, "indicative active aorist")
            .addForm(new WordForm("ἔλυσας", "you loosened", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("ἔλυσε", "s/he loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἔλυσεν", "s/he loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἐλύσαμεν", "we loosened", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἐλύσατε", "you loosened", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("ἔλυσαν", "they loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL)),

        // Indicative Active Second Aorist
        new Word(new WordForm("ἔβαλον", "I threw", INDICATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR), OK, "indicative active second aorist")
            .addForm(new WordForm("ἔβαλες", "you threw", INDICATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("ἔβαλε", "s/he threw", INDICATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἐβάλομεν", "we threw", INDICATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἐβάλετε", "you threw", INDICATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("ἔβαλον", "they threw", INDICATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL)),

        // Indicative Active Perfect
        new Word(new WordForm("λέλυκα", "I have loosened", INDICATIVE, ACTIVE, PERFECT, FIRST_PERSON, SINGULAR), STRONG, "indicative active perfect")
            .addForm(new WordForm("λέλυκας", "you have loosened", INDICATIVE, ACTIVE, PERFECT, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λέλυκε", "s/he has loosened", INDICATIVE, ACTIVE, PERFECT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λέλυκεν", "s/he has loosened", INDICATIVE, ACTIVE, PERFECT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λελύκαμεν", "we have loosened", INDICATIVE, ACTIVE, PERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λελύκατε", "you have loosened", INDICATIVE, ACTIVE, PERFECT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λέλυκασι", "they have loosened", INDICATIVE, ACTIVE, PERFECT, THIRD_PERSON, PLURAL))
            .addForm(new WordForm("λέλυκασιν", "they have loosened", INDICATIVE, ACTIVE, PERFECT, THIRD_PERSON, PLURAL)),

        // Indicative Active Pluperfect
        new Word(new WordForm("ἐλελύκειν", "I had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, SINGULAR), OK, "indicative active pluperfect")
            .addForm(new WordForm("λελύκειν", "I had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, SINGULAR))
            .addForm(new WordForm("ἐλελύκεις", "you had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λελύκεις", "you had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("ἐλελύκειν", "s/he had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λελύκειν", "s/he had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἐλελύκει", "s/he had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λελύκει", "s/he had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἐλελύκειμεν", "we had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λελύκειμεν", "we had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἐλελύκειτε", "you had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λελύκειτε", "you had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("ἐλελύκεισαν", "they had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, PLURAL))
            .addForm(new WordForm("λελύκεισαν", "they had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, PLURAL)),

        // Indicative Middle Present
        new Word(new WordForm("λύομαι", "I loosen myself/am loosened", INDICATIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR), STRONG, "indicative middle/passive present")
            .addForm(new WordForm("λύῃ", "you loosen yourself/are loosened", INDICATIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λύεται", "s/he loosens her/himself/is loosened", INDICATIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λυόμεθα", "we loosen ourselves/are loosened", INDICATIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λύεσθε", "you loosen yourselves/are loosened", INDICATIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λύονται", "they loosen themselves/are loosened", INDICATIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL)),

        // Athematic indicative middle present
        new Word(new WordForm("δίδομαι", "I give myself/am given - stem διδο", ATHEMATIC, INDICATIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR), WEAK, "athematic indicative middle/passive present"),

        // Indicative Middle Future
        new Word(new WordForm("λύσομαι", "I will loosen myself", INDICATIVE, MIDDLE, FUTURE, FIRST_PERSON, SINGULAR), OK, "indicative middle future")
            .addForm(new WordForm("λύσῃ", "you will loosen yourself", INDICATIVE, MIDDLE, FUTURE, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λύσεται", "s/he will loosen her/himself", INDICATIVE, MIDDLE, FUTURE, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λυσόμεθα", "we will loosen ourselves", INDICATIVE, MIDDLE, FUTURE, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λύσεσθε", "you will loosen yourselves", INDICATIVE, MIDDLE, FUTURE, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λύσονται", "they will loosen themselves", INDICATIVE, MIDDLE, FUTURE, THIRD_PERSON, PLURAL)),

        // Indicative Middle Imperfect
        new Word(new WordForm("ἐλυόμην", "I was loosing myself/being loosened", INDICATIVE, MIDDLE, PASSIVE, IMPERFECT, FIRST_PERSON, SINGULAR), OK, "indicative middle/passive imperfect")
            .addForm(new WordForm("ἐλύου", "you were loosing yourself/being loosened", INDICATIVE, MIDDLE, PASSIVE, IMPERFECT, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("ἐλύετο", "S/he was loosing her/himself/being loosened", INDICATIVE, MIDDLE, PASSIVE, IMPERFECT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἐλυόμεθα", "We were loosing ourselves/being loosened", INDICATIVE, MIDDLE, PASSIVE, IMPERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἐλύεσθε", "You were loosing yourselves/being loosened", INDICATIVE, MIDDLE, PASSIVE, IMPERFECT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("ἐλύοντο", "They were loosing themselves/being loosened", INDICATIVE, MIDDLE, PASSIVE, IMPERFECT, THIRD_PERSON, PLURAL)),

        // Indicative Middle Aorist
        new Word(new WordForm("ἐλυσάμην", "I loosed myself", INDICATIVE, MIDDLE, AORIST, FIRST_PERSON, SINGULAR), OK, "indicative middle aorist")
            .addForm(new WordForm("ἐλύσω", "you loosed yourself", INDICATIVE, MIDDLE, AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("ἐλύσατο", "s/he loosed her/himself", INDICATIVE, MIDDLE, AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἐλυσάμεθα", "we loosed ourselves", INDICATIVE, MIDDLE, AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἐλύσασθε", "you loosed yourselves", INDICATIVE, MIDDLE, AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("ἐλύσαντο", "they loosed themselves", INDICATIVE, MIDDLE, AORIST, THIRD_PERSON, PLURAL)),

        // Indicative Middle Second Arorist
        new Word(new WordForm("ἐγενόμην", "I became", INDICATIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, SINGULAR), OK, "indicative middle second aorist")
            .addForm(new WordForm("ἐγένου", "you became", INDICATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("ἐγένετο", "s/he became", INDICATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἐγενόμεθα", "we became", INDICATIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἐγένεσθε", "you became", INDICATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("ἐγένοντο", "they became", INDICATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, PLURAL)),

        // Indicative Middle Perfect
        new Word(new WordForm("λέλυμαι", "I have loosened myself/been loosened", INDICATIVE, MIDDLE, PASSIVE, PERFECT, FIRST_PERSON, SINGULAR), OK, "indicative middle/passive perfect")
            .addForm(new WordForm("λέλυσαι", "you have loosened yourself/been loosened", INDICATIVE, MIDDLE, PASSIVE, PERFECT, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λέλυται", "s/he has loosened her/himself/been loosened", INDICATIVE, MIDDLE, PASSIVE, PERFECT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λελύμεθα", "we have loosened ourseleves/been loosened", INDICATIVE, MIDDLE, PASSIVE, PERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λελύσθε", "you have loosened yourselves/been loosened", INDICATIVE, MIDDLE, PASSIVE, PERFECT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λέλυνται", "they have loosened themselves/been loosened", INDICATIVE, MIDDLE, PASSIVE, PERFECT, THIRD_PERSON, PLURAL)),

        // Omitting indicative middle/passive plu-perfect as it occurs only 7 times

        // Indicative Passive Future
        new Word(new WordForm("λυθήσομαι", "I will be loosed", INDICATIVE, PASSIVE, FUTURE, FIRST_PERSON, SINGULAR), OK, "indicative passive future")
            .addForm(new WordForm("λυθήσῃ", "you will be loosed", INDICATIVE, PASSIVE, FUTURE, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λυθήσεται", "s/he will be loosed", INDICATIVE, PASSIVE, FUTURE, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λυθησόμεθα", "we will be loosed", INDICATIVE, PASSIVE, FUTURE, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λυθήσεσθε", "you will be loosed", INDICATIVE, PASSIVE, FUTURE, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λυθήσονται", "they will be loosed", INDICATIVE, PASSIVE, FUTURE, THIRD_PERSON, PLURAL)),

        // Indicative Passive Second Future
        new Word(new WordForm("ἀποσταλήσομαι", "I will be sent", INDICATIVE, PASSIVE, SECOND_FUTURE, FIRST_PERSON, SINGULAR), WEAK, "indicative passive second future")
            .addForm(new WordForm("ἀποσταλήσῃ", "you will be sent", INDICATIVE, PASSIVE, SECOND_FUTURE, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("ἀποσταλήσεται", "s/he will be sent", INDICATIVE, PASSIVE, SECOND_FUTURE, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἀποσταλησόμεθα", "we will be sent", INDICATIVE, PASSIVE, SECOND_FUTURE, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἀποσταλήσεσθε", "you will be sent", INDICATIVE, PASSIVE, SECOND_FUTURE, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("ἀποσταλήσονται", "they will be sent", INDICATIVE, PASSIVE, SECOND_FUTURE, THIRD_PERSON, PLURAL)),

        // Indicative Passive Aorist
        new Word(new WordForm("ἐλύθην", "I was loosed", INDICATIVE, PASSIVE, AORIST, FIRST_PERSON, SINGULAR), OK, "indicative passive aorist")
            .addForm(new WordForm("ἐλύθης", "you were loosed", INDICATIVE, PASSIVE, AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("ἐλύθη", "s/he was loosed", INDICATIVE, PASSIVE, AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἐλύθημεν", "we were loosed", INDICATIVE, PASSIVE, AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἐλύθητε", "you were loosed", INDICATIVE, PASSIVE, AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("ἐλύθησαν", "they were loosed", INDICATIVE, PASSIVE, AORIST, THIRD_PERSON, PLURAL)),

        // Indicative Passive Second Aorist
        new Word(new WordForm("ἐγράφην", "I was written", INDICATIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR), OK, "indicative passive second aorist")
            .addForm(new WordForm("ἐγράφης", "you were written", INDICATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("ἐγράφη", "s/he was written", INDICATIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἐγράφημεν", "we were written", INDICATIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἐγράφητε", "you were written", INDICATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("ἐγράφησαν", "they were written", INDICATIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL)),

        // Subjunctive active present
        new Word(new WordForm("λύω", "I might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR), OK, "subjunctive active present")
            .addForm(new WordForm("λύῃς", "you might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λύῃ", "s/he might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λύωμεν", "we might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λύητε", "you might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λύωσι", "they might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL))
            .addForm(new WordForm("λύωσιν", "they might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL)),

        // Athematic subjunctive active present
        new Word(new WordForm("διδῶ", "I might be giving - stem διδω", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR), WEAK, "athematic subjunctive active present"),

        // Subjunctive active aorist
        new Word(new WordForm("λύσω", "I might loosen", SUBJUNCTIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR), OK, "subjunctive active aorist")
            .addForm(new WordForm("λύσῃς", "you might loosen", SUBJUNCTIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λύσῃ", "s/he might loosen", SUBJUNCTIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λύσωμεν", "we might loosen", SUBJUNCTIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λύσητε", "you might loosen", SUBJUNCTIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λύσωσι", "they might loosen", SUBJUNCTIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL))
            .addForm(new WordForm("λύσωσιν", "they might loosen", SUBJUNCTIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL)),

        // Subjunctive active second aorist
        new Word(new WordForm("λάβω", "I might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR), OK, "subjunctive active second aorist")
            .addForm(new WordForm("λάβῃς", "you might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λάβῃ", "s/he might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λάβωμεν", "we might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λάβητε", "you might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λάβωσι", "they might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL))
            .addForm(new WordForm("λάβωσιν", "they might receive", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL)),

        // Athematic subjunctive active second aorist
        new Word(new WordForm("δῶ", "I might give - stem δω", SUBJUNCTIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR), WEAK, "athematic subjunctive active second aorist"),

        // Subjunctive middle present
        new Word(new WordForm("λύωμαι", "I might be loosening myself/be loosened", SUBJUNCTIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR), OK, "subjunctive middle/passive present")
            .addForm(new WordForm("λύῃ", "you might be loosening yourself/be loosened", SUBJUNCTIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λύηται", "s/he might be loosening her/himself/be loosened", SUBJUNCTIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λυώμεθα", "we might be loosening ourselves/be loosened", SUBJUNCTIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λύησθε", "you might be loosening yourselves/be loosened", SUBJUNCTIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λύωνται", "they might be loosening themselves/be loosened", SUBJUNCTIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL)),

        // Athematic subjunctive middle present
        new Word(new WordForm("διδῶμαι", "I might be giving myself/be given - stem διδω", SUBJUNCTIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR), WEAK, "athematic subjunctive middle/passive present"),

        // Subjunctive middle aorist
        new Word(new WordForm("λύσωμαι", "I might loosen myself", SUBJUNCTIVE, MIDDLE, AORIST, FIRST_PERSON, SINGULAR), OK, "subjunctive middle aorist")
            .addForm(new WordForm("λύσῃ", "you might loosen yourself", SUBJUNCTIVE, MIDDLE, AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λύσηται", "s/he might loosen her/himself", SUBJUNCTIVE, MIDDLE, AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λυσώμεθα", "we might loosen ourselves", SUBJUNCTIVE, MIDDLE, AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λύσησθε", "you might loosen yourselves", SUBJUNCTIVE, MIDDLE, AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λύσωνται", "they might loosen themselves", SUBJUNCTIVE, MIDDLE, AORIST, THIRD_PERSON, PLURAL)),

        // Subjunctive middle second aorist
        new Word(new WordForm("γένωμαι", "I might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, SINGULAR), OK, "subjunctive middle second aorist")
            .addForm(new WordForm("γένῃ", "you might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("γένηται", "s/he might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("γενώμεθα", "we might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("γένησθε", "you might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("γένωνται", "they might become", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, PLURAL)),

        // Athematic subjunctive middle second aorist
        new Word(new WordForm("δῶμαι", "I might give myself - stem δω", SUBJUNCTIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, SINGULAR), WEAK, "athematic subjunctive middle second aorist"),

        // Subjunctive passive aorist
        new Word(new WordForm("λυθῶ", "I might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, FIRST_PERSON, SINGULAR), OK, "subjunctive passive aorist")
            .addForm(new WordForm("λυθῇς", "you might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λυθῇ", "s/he might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λυθῶμεν", "we might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λυθῆτε", "you might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λυθῶσι", "they might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, THIRD_PERSON, PLURAL))
            .addForm(new WordForm("λυθῶσιν", "they might be loosened", SUBJUNCTIVE, PASSIVE, AORIST, THIRD_PERSON, PLURAL)),

        // Subjunctive passive second aorist
        new Word(new WordForm("γραφῶ", "I might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR), OK, "subjunctive passive second aorist")
            .addForm(new WordForm("γραφῇς", "you might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("γραφῇ", "s/he might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("γραφῶμεν", "we might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("γραφῆτε", "you might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("γραφῶσι", "they might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL))
            .addForm(new WordForm("γραφῶσιν", "they might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL)),

        // Athematic subjunctive passive second aorist
        new Word(new WordForm("δοθῶ", "I might be given - stem δο", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR), WEAK, "athematic subjunctive passive second aorist"),

        // Imperative active present
        new Word(new WordForm("λῦε", "keep loosing!", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR), WEAK, "imperative active present")
            .addForm(new WordForm("λυέτω", "let him/her keep loosing!", IMPERATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λύετε", "keep loosing!", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λυέτωσαν", "let them keep loosing!", IMPERATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL)),

        // Athematic imperative active present
        new Word(new WordForm("δίδοτε", "keep giving! - stem διδο", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL), WEAK, "athematic imperative active present"),

        // Imperative active aorist
        new Word(new WordForm("λῦσον", "loose!", IMPERATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR), WEAK, "imperative active aorist")
            .addForm(new WordForm("λυσάτω", "let him/her loose!", IMPERATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λύσατε", "loose!", IMPERATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λυσάτωσαν", "let them loose!", IMPERATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL)),

        // Imperative active second aorist
        new Word(new WordForm("λάβε", "take!", IMPERATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR), WEAK, "imperative active second aorist")
            .addForm(new WordForm("λαβέτω", "let him/her take!", IMPERATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λάβετε", "take!", IMPERATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λαβέτωσαν", "let them take!", IMPERATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL)),

        // Athematic imperative active second aorist
        new Word(new WordForm("δότε", "give! - stem δο", IMPERATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL), WEAK, "athematic imperative active second aorist"),

        // Imperative middle present
        new Word(new WordForm("λύου", "keep loosing yourself/being loosened!", IMPERATIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR), WEAK, "imperative middle/passive present")
            .addForm(new WordForm("λυέσθω", "let him/her keep loosing him/herself!/being loosened", IMPERATIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λύεσθε", "keep loosing yourselves!/being loosened", IMPERATIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λυέσθωσαν", "let them keep loosing themselves!/being loosened", IMPERATIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL)),

        // Athematic imperative middle present
        new Word(new WordForm("δίδοσθε", "keep giving yourselves!/being given - stem διδο", IMPERATIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL), WEAK, "athematic imperative middle/passive present"),

        // Imperative middle aorist
        new Word(new WordForm("λῦσαι", "loose yourself!", IMPERATIVE, MIDDLE, AORIST, SECOND_PERSON, SINGULAR), WEAK, "imperative middle aorist")
            .addForm(new WordForm("λυσάσθω", "let him/her loose him/herself!", IMPERATIVE, MIDDLE, AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λύσασθε", "loose yourselves!", IMPERATIVE, MIDDLE, AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λυσάσθωσαν", "let them loose themselves!", IMPERATIVE, MIDDLE, AORIST, THIRD_PERSON, PLURAL)),

        // Imperative middle second aorist
        new Word(new WordForm("γενοῦ", "become!", IMPERATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, SINGULAR), WEAK, "imperative middle second aorist")
            .addForm(new WordForm("γενέσθω", "let him/her become!", IMPERATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("γένεσθε", "become!", IMPERATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("γενέσθωσαν", "let them become!", IMPERATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, PLURAL)),

        // Athematic imperative middle second aorist
        new Word(new WordForm("δόσθε", "give yourselves! - stem δο", IMPERATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL), WEAK, "athematic imperative middle second aorist"),

        // Imperative passive aorist
        new Word(new WordForm("λύθητι", "be loosed!", IMPERATIVE, PASSIVE, AORIST, SECOND_PERSON, SINGULAR), WEAK, "imperative passive aorist")
            .addForm(new WordForm("λυθήτω", "let him/her be loosed!", IMPERATIVE, PASSIVE, AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λύθητε", "be loosed!", IMPERATIVE, PASSIVE, AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λυθήτωσαν", "let them be loosed!", IMPERATIVE, PASSIVE, AORIST, THIRD_PERSON, PLURAL)),

        // Imperative passive second aorist
        new Word(new WordForm("γράφητι", "be written!", IMPERATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR), WEAK, "imperative passive second aorist")
            .addForm(new WordForm("γραφήτω", "let him/her be written!", IMPERATIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("γράφητε", "be written!", IMPERATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("γραφήτωσαν", "let them be written!", IMPERATIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL)),

        // Athematic imperative passive second aorist
        new Word(new WordForm("δόθητε", "be given! - stem δο", IMPERATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL), WEAK, "athematic imperative passive second aorist"),

        // Infinitive active
        new Word(new WordForm("λύειν", "to continually loosen", INFINITIVE, ACTIVE, PRESENT), WEAK, "infinitive active")
            .addForm(new WordForm("λῦσαι", "to loosen", INFINITIVE, ACTIVE, AORIST))
            .addForm(new WordForm("λαβεῖν", "to receive", INFINITIVE, ACTIVE, SECOND_AORIST))
            .addForm(new WordForm("λελυκέναι", "to have loosened", INFINITIVE, ACTIVE, PERFECT)),

        // Athematic infinitive active
        new Word(new WordForm("διδόναι", "to keep giving - stem διδο", INFINITIVE, ACTIVE, PRESENT), WEAK, "athematic infinitive active")
            .addForm(new WordForm("δοῦναι", "to give - stem δο", INFINITIVE, ACTIVE, SECOND_AORIST)),

        // Infinitive middle
        new Word(new WordForm("λύεσθαι", "to continually loosen oneself", INFINITIVE, MIDDLE, PRESENT), WEAK, "infinitive middle")
            .addForm(new WordForm("λύσασθαι", "to loosen oneself", INFINITIVE, MIDDLE, AORIST))
            .addForm(new WordForm("λαβέσθαι", "to receive oneself", INFINITIVE, MIDDLE, SECOND_AORIST))
            .addForm(new WordForm("λελύσθαι", "to have loosened oneself", INFINITIVE, MIDDLE, PERFECT)),

        // Athematic infinitive middle
        new Word(new WordForm("δίδοσθαι", "to keep giving oneself - stem διδο", INFINITIVE, MIDDLE, PRESENT), WEAK, "athematic infinitive middle")
            .addForm(new WordForm("δόσθαι", "to give oneself - stem δο", INFINITIVE, MIDDLE, SECOND_AORIST)),

        // Infinitive passive
        new Word(new WordForm("λύεσθαι", "to continually have been loosened", INFINITIVE, PASSIVE, PRESENT), WEAK, "infinitive passive")
            .addForm(new WordForm("λυθῆναι", "to have been loosened", INFINITIVE, PASSIVE, AORIST))
            .addForm(new WordForm("γραφῆναι", "to have received", INFINITIVE, PASSIVE, SECOND_AORIST))
            .addForm(new WordForm("λελῦσθαι", "to have been loosened", INFINITIVE, PASSIVE, PERFECT)),

        // Athematic infinitive passive
        new Word(new WordForm("δίδοσθαι", "to keep being given - stem διδο", INFINITIVE, PASSIVE, PRESENT), WEAK, "athematic infinitive passive")
            .addForm(new WordForm("δοθῆναι", "to be given - stem δο", INFINITIVE, PASSIVE, SECOND_AORIST)),

        // Participle active present
        new Word(new WordForm("λύων", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR), OK, "participle active present")
            .addForm(new WordForm("λύοντος", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, GENITIVE, SINGULAR))
            .addForm(new WordForm("λύοντι", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, SINGULAR))
            .addForm(new WordForm("λύοντα", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λύοντες", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λύοντων", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, GENITIVE, PLURAL))
            .addForm(new WordForm("λύουσι", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("λύουσιν", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("λύοντας", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("λύουσα", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("λυούσης", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, GENITIVE, SINGULAR))
            .addForm(new WordForm("λυούσῃ", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, DATIVE, SINGULAR))
            .addForm(new WordForm("λύουσαν", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λύουσαι", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λυουσῶν", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, GENITIVE, PLURAL))
            .addForm(new WordForm("λυούσαις", "looseninp", PARTICIPLE, ACTIVE, PRESENT, FEMININE, DATIVE, PLURAL))
            .addForm(new WordForm("λυούσας", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("λῦον", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("λύοντος", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, GENITIVE, SINGULAR))
            .addForm(new WordForm("λύοντι", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, SINGULAR))
            .addForm(new WordForm("λῦον", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λύοντα", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λύοντων", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, GENITIVE, PLURAL))
            .addForm(new WordForm("λύουσι", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("λύουσιν", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("λύοντα", "loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, ACCUSATIVE, PLURAL)),

        // Athematic participle active present
        new Word(new WordForm("διδούς", "giving - stem διδο", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR), WEAK, "athematic participle active present")
            .addForm(new WordForm("διδοῦσα", "giving - stem διδο", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("διδόν", "giving - stem διδο", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, SINGULAR)),

        // Participle active aorist
        new Word(new WordForm("λύσας", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, NOMINATIVE, SINGULAR), OK, "participle active aorist")
            .addForm(new WordForm("λύσαντος", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, GENITIVE, SINGULAR))
            .addForm(new WordForm("λύσαντι", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, DATIVE, SINGULAR))
            .addForm(new WordForm("λύσαντα", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λύσαντες", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λυσάντων", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, GENITIVE, PLURAL))
            .addForm(new WordForm("λύσασι", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("λύσασιν", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("λύσαντας", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("λύσασα", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("λυσάσης", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, GENITIVE, SINGULAR))
            .addForm(new WordForm("λυσάσῃ", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, DATIVE, SINGULAR))
            .addForm(new WordForm("λύσασαν", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λύσασαι", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λυσασῶν", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, GENITIVE, PLURAL))
            .addForm(new WordForm("λυσάσαις", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, DATIVE, PLURAL))
            .addForm(new WordForm("λυσάσας", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("λῦσαν", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("λύσαντος", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, GENITIVE, SINGULAR))
            .addForm(new WordForm("λύσαντι", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, DATIVE, SINGULAR))
            .addForm(new WordForm("λῦσαν", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λύσαντα", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λυσάντων", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, GENITIVE, PLURAL))
            .addForm(new WordForm("λύσασι", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("λύσασιν", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("λύσαντα", "loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, ACCUSATIVE, PLURAL)),

        // Participle active second aorist
        new Word(new WordForm("βαλών", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR), OK, "participle active second aorist")
            .addForm(new WordForm("βαλόντος", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, GENITIVE, SINGULAR))
            .addForm(new WordForm("βαλόντι", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, DATIVE, SINGULAR))
            .addForm(new WordForm("βαλόντα", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("βαλόντες", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("βαλόντων", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, GENITIVE, PLURAL))
            .addForm(new WordForm("βαλοῦσι", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("βαλοῦσιν", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("βαλόντας", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("βαλοῦσα", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("βαλούσης", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, GENITIVE, SINGULAR))
            .addForm(new WordForm("βαλούσῃ", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, DATIVE, SINGULAR))
            .addForm(new WordForm("βαλοῦσαν", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("βαλοῦσαι", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("βαλουσῶν", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, GENITIVE, PLURAL))
            .addForm(new WordForm("βαλούσαις", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, DATIVE, PLURAL))
            .addForm(new WordForm("βαλούσας", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("βαλόν", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("βαλόντος", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, GENITIVE, SINGULAR))
            .addForm(new WordForm("βαλόντι", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, DATIVE, SINGULAR))
            .addForm(new WordForm("βαλόν", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("βαλόντα", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, NOMINATIVE, PLURAL))
            .addForm(new WordForm("βαλόντων", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, GENITIVE, PLURAL))
            .addForm(new WordForm("βαλοῦσι", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("βαλοῦσιν", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("βαλόντα", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, ACCUSATIVE, PLURAL)),

        // Athematic participle active second aorist
        new Word(new WordForm("δούς", "giving - stem δο", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR), WEAK, "athematic participle active second aorist")
            .addForm(new WordForm("δοῦσα", "giving - stem δο", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("δόν", "giving - stem δο", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, NOMINATIVE, SINGULAR)),

        // Participle active perfect
        new Word(new WordForm("λελυκώς", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, NOMINATIVE, SINGULAR), OK, "participle active perfect")
            .addForm(new WordForm("λελυκότος", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, GENITIVE, SINGULAR))
            .addForm(new WordForm("λελυκότι", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, DATIVE, SINGULAR))
            .addForm(new WordForm("λελυκότα", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λελυκότες", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λελυκότων", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, GENITIVE, PLURAL))
            .addForm(new WordForm("λελυκόσι", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("λελυκόσιν", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("λελυκότας", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("λελυκυῖα", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("λελυκυῖας", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, GENITIVE, SINGULAR))
            .addForm(new WordForm("λελυκυῖᾳ", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, DATIVE, SINGULAR))
            .addForm(new WordForm("λελυκυῖαν", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λελυκυῖαι", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λελυκυιων", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, GENITIVE, PLURAL))
            .addForm(new WordForm("λελυκυῖαις", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, DATIVE, PLURAL))
            .addForm(new WordForm("λελυκυίας", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("λελυκός", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("λελυκότος", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, GENITIVE, SINGULAR))
            .addForm(new WordForm("λελυκότι", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, DATIVE, SINGULAR))
            .addForm(new WordForm("λελυκός", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λελυκότα", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λελυκότων", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, GENITIVE, PLURAL))
            .addForm(new WordForm("λελυκόσι", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("λελυκόσιν", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("λελυκότα", "having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, ACCUSATIVE, PLURAL)),

        // Participle middle present
        new Word(new WordForm("λυόμενος", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR), OK, "participle middle/passive present")
            .addForm(new WordForm("λυομένου", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, GENITIVE, SINGULAR))
            .addForm(new WordForm("λυομένῳ", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, DATIVE, SINGULAR))
            .addForm(new WordForm("λυόμενον", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λυόμενοι", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λυομένων", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, GENITIVE, PLURAL))
            .addForm(new WordForm("λυομένοις", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("λυομένους", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("λυομένη", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("λυομένης", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, GENITIVE, SINGULAR))
            .addForm(new WordForm("λυομένῃ", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, DATIVE, SINGULAR))
            .addForm(new WordForm("λυομένην", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λυόμεναι", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λυομένων", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, GENITIVE, PLURAL))
            .addForm(new WordForm("λυομέναις", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, DATIVE, PLURAL))
            .addForm(new WordForm("λυομένας", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("λυόμενον", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("λυομένου", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, GENITIVE, SINGULAR))
            .addForm(new WordForm("λυομένῳ", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, DATIVE, SINGULAR))
            .addForm(new WordForm("λυόμενον", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λυόμενα", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λυομένων", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, GENITIVE, PLURAL))
            .addForm(new WordForm("λυομένοις", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("λυόμενα", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, ACCUSATIVE, PLURAL)),

        // Athematic participle middle present
        new Word(new WordForm("διδόμενος", "giving oneself/being given - stem διδο", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR), WEAK, "athematic participle middle/passive present"),

        // Participle middle aorist
        new Word(new WordForm("λυσάμενος", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, NOMINATIVE, SINGULAR), OK, "participle middle aorist")
            .addForm(new WordForm("λυσαμένου", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, GENITIVE, SINGULAR))
            .addForm(new WordForm("λυσαμένῳ", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, DATIVE, SINGULAR))
            .addForm(new WordForm("λυσάμενον", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λυσάμενοι", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λυσαμένων", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, GENITIVE, PLURAL))
            .addForm(new WordForm("λυσαμένοις", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("λυσαμένους", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("λυσαμένη", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("λυσαμένης", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, GENITIVE, SINGULAR))
            .addForm(new WordForm("λυσαμένῃ", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, DATIVE, SINGULAR))
            .addForm(new WordForm("λυσαμένην", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λυσάμεναι", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λυσαμένων", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, GENITIVE, PLURAL))
            .addForm(new WordForm("λυσαμέναις", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, DATIVE, PLURAL))
            .addForm(new WordForm("λυσαμένας", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("λυσάμενον", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("λυσαμένου", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, GENITIVE, SINGULAR))
            .addForm(new WordForm("λυσαμένῳ", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, DATIVE, SINGULAR))
            .addForm(new WordForm("λυσάμενον", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λυσάμενα", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λυσαμένων", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, GENITIVE, PLURAL))
            .addForm(new WordForm("λυσαμένοις", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("λυσάμενα", "loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, ACCUSATIVE, PLURAL)),

        // Participle middle second aorist
        new Word(new WordForm("γενόμενος", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR), OK, "participle middle second aorist")
            .addForm(new WordForm("γενομένου", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, NEUTER, GENITIVE, SINGULAR))
            .addForm(new WordForm("γενομένῳ", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, NEUTER, DATIVE, SINGULAR))
            .addForm(new WordForm("γενόμενον", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("γενόμενοι", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("γενομένων", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, FEMININE, NEUTER, GENITIVE, PLURAL))
            .addForm(new WordForm("γενομένοις", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("γενομένους", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("γενομένη", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("γενομένης", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, GENITIVE, SINGULAR))
            .addForm(new WordForm("γενομένῃ", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, DATIVE, SINGULAR))
            .addForm(new WordForm("γενομένην", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("γενόμεναι", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("γενομέναις", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, DATIVE, PLURAL))
            .addForm(new WordForm("γενομένας", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("γενόμενον", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, NOMINATIVE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("γενόμενα", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, NOMINATIVE, ACCUSATIVE, PLURAL)),

        // Athematic participle middle second aorist
        new Word(new WordForm("δόμενος", "giving oneself - stem δο", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR), WEAK, "athematic participle middle second aorist"),

        // Participle middle perfect
        new Word(new WordForm("λελυμένος", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, NOMINATIVE, SINGULAR), OK, "participle middle/passive perfect")
            .addForm(new WordForm("λελυμένου", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, GENITIVE, SINGULAR))
            .addForm(new WordForm("λελυμένῳ", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, DATIVE, SINGULAR))
            .addForm(new WordForm("λελυμένον", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λελυμένοι", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λελυμένων", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, GENITIVE, PLURAL))
            .addForm(new WordForm("λελυμένοις", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("λελυμένους", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("λελυμένη", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("λελυμένης", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, GENITIVE, SINGULAR))
            .addForm(new WordForm("λελυμένῃ", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, DATIVE, SINGULAR))
            .addForm(new WordForm("λελυμένην", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λελυμέναι", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λελυμένων", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, GENITIVE, PLURAL))
            .addForm(new WordForm("λελυμέναις", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, DATIVE, PLURAL))
            .addForm(new WordForm("λελυμένας", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("λελυμένον", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("λελυμένου", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, GENITIVE, SINGULAR))
            .addForm(new WordForm("λελυμένῳ", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, DATIVE, SINGULAR))
            .addForm(new WordForm("λελυμένον", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λελυμένα", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λελυμένων", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, GENITIVE, PLURAL))
            .addForm(new WordForm("λελυμένοις", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("λελυμένα", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, ACCUSATIVE, PLURAL)),

        // Participle passive aorist
        new Word(new WordForm("λυθείς", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, NOMINATIVE, SINGULAR), OK, "participle passive aorist")
            .addForm(new WordForm("λυθέντος", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, GENITIVE, SINGULAR))
            .addForm(new WordForm("λυθέντι", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, DATIVE, SINGULAR))
            .addForm(new WordForm("λυθέντα", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λυθέντες", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λυθέντων", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, GENITIVE, PLURAL))
            .addForm(new WordForm("λυθεῖσι", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("λυθεῖσιν", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("λυθέντας", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("λυθεῖσα", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("λυθείσης", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, GENITIVE, SINGULAR))
            .addForm(new WordForm("λυθείσῃ", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, DATIVE, SINGULAR))
            .addForm(new WordForm("λυθεῖσαν", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λυθεῖσαι", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λυθεισῶν", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, GENITIVE, PLURAL))
            .addForm(new WordForm("λυθείσαις", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, DATIVE, PLURAL))
            .addForm(new WordForm("λυθείσας", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("λυθέν", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("λυθέντος", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, GENITIVE, SINGULAR))
            .addForm(new WordForm("λυθέντι", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, DATIVE, SINGULAR))
            .addForm(new WordForm("λυθέν", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("λυθέντα", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, NOMINATIVE, PLURAL))
            .addForm(new WordForm("λυθέντων", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, GENITIVE, PLURAL))
            .addForm(new WordForm("λυθεῖσι", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("λυθεῖσιν", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("λυθέντα", "loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, ACCUSATIVE, PLURAL)),

        // No verb occurring 50 or more times in the NT has 2nd passive participle

        // Athematic participle passive second aorist
        new Word(new WordForm("δοθείς", "being given - stem δο", PARTICIPLE, PASSIVE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR), WEAK, "athematic participle passive second aorist"),


        // Optative Active Present
        new Word(new WordForm("λύοιμι", "I wish to keep loosening", OPTATIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR), OK, "optative active present")
            .addForm(new WordForm("λύοις", "you wish to keep loosening", OPTATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λύοι", "s/he wishes to keep loosening", OPTATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λύοιμεν", "we wish to keep loosening", OPTATIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λύοιτε", "you wish to keep loosening", OPTATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λύοιεν", "they wish to keep loosening", OPTATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL)),

        // Optative Active Aorist
        new Word(new WordForm("λύσαιμι", "I wish to loosen", OPTATIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR), OK, "optative active aorist")
            .addForm(new WordForm("λύσαις", "you wish to loosen", OPTATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λύσαι", "s/he wishes to loosen", OPTATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λύσαιμεν", "we wish to loosen", OPTATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λύσαιτε", "you wish to loosen", OPTATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λύσαιεν", "they wish to loosen", OPTATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL)),

        // Optative Active Second Aorist
        new Word(new WordForm("βάλοιμι", "I wish to throw", OPTATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR), OK, "optative active second aorist")
            .addForm(new WordForm("βάλοις", "you wish to throw", OPTATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("βάλοι", "s/he wishes to throw", OPTATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("βάλοιμεν", "we wish to throw", OPTATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("βάλοιτε", "you wish to throw", OPTATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("βάλοιεν", "they wish to throw", OPTATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL)),

        // Optative Middle Present
        new Word(new WordForm("λυοίμην", "I wish to keep loosening myself/being loosened", OPTATIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR), OK, "optative middle/passive present")
            .addForm(new WordForm("λύοιο", "you wish to keep loosening yourself/being loosened", OPTATIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λύοιτο", "s/he wishes to keep loosening her/himself/being loosened", OPTATIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λυοίμεθα", "we wish to keep loosening ourselves/being loosened", OPTATIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λύοισθε", "you wish to keep loosening yourselves/being loosened", OPTATIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λύοιντο", "they wish to keep loosening themselves/being loosened", OPTATIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL)),

        // Optative Middle Aorist
        new Word(new WordForm("λυσαίμην", "I wish to loosen myself", OPTATIVE, MIDDLE, AORIST, FIRST_PERSON, SINGULAR), OK, "optative middle aorist")
            .addForm(new WordForm("λύσαιο", "you wish to loosen yourself", OPTATIVE, MIDDLE, AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λύσαιτο", "s/he wishes to loosen her/himself", OPTATIVE, MIDDLE, AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λυσαίμεθα", "we wish to loosen ourselves", OPTATIVE, MIDDLE, AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λύσαισθε", "you wish to loosen yourselves", OPTATIVE, MIDDLE, AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λύσαιντο", "they wish to loosen themselves", OPTATIVE, MIDDLE, AORIST, THIRD_PERSON, PLURAL)),

        // Optative Middle Second Aorist
        new Word(new WordForm("βαλοίμην", "I wish to throw myself", OPTATIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, SINGULAR), OK, "optative middle second aorist")
            .addForm(new WordForm("βάλοιο", "you wish to throw yourself", OPTATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("βάλοιτο", "s/he wishes to throw her/himself", OPTATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("βαλοίμεθα", "we wish to throw ourselves", OPTATIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("βάλοισθε", "you wish to throw yourselves", OPTATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("βάλοιντο", "they wish to throw themselves", OPTATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, PLURAL)),

        // Optative Passive Aorist
        new Word(new WordForm("λυθείην", "I wish to be loosened", OPTATIVE, PASSIVE, AORIST, FIRST_PERSON, SINGULAR), OK, "optative passive aorist")
            .addForm(new WordForm("λυθείης", "you wish to be loosened", OPTATIVE, PASSIVE, AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("λυθείη", "s/he wishes to be loosened", OPTATIVE, PASSIVE, AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("λυθείημεν", "we wish to be loosened", OPTATIVE, PASSIVE, AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("λυθείητε", "you wish to be loosened", OPTATIVE, PASSIVE, AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("λυθείησαν", "they wish to be loosened", OPTATIVE, PASSIVE, AORIST, THIRD_PERSON, PLURAL)),

        // Optative Passive Second Aorist
        new Word(new WordForm("γραφείην", "I wish to be written", OPTATIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR), OK, "optative passive second aorist")
            .addForm(new WordForm("γραφείης", "you wish to be written", OPTATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("γραφείη", "s/he wishes to be written", OPTATIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("γραφείημεν", "we wish to be written", OPTATIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("γραφείητε", "you wish to be written", OPTATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("γραφείησαν", "they wish to be written", OPTATIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL)),

        //----------------------------------------------------------------------------------------
        // NOUN FORMS
        new Word(new WordForm("λόγος", "word - root λόγο", MASCULINE, NOMINATIVE, SINGULAR, SECOND_DECLENSION), STRONG, "second declension masculine")
            .addForm(new WordForm("λόγε", "word - root λόγο", MASCULINE, VOCATIVE, SINGULAR, SECOND_DECLENSION))
            .addForm(new WordForm("λόγου", "word - root λόγο", MASCULINE, GENITIVE, SINGULAR, SECOND_DECLENSION))
            .addForm(new WordForm("λόγῳ", "word - root λόγο", MASCULINE, DATIVE, SINGULAR, SECOND_DECLENSION))
            .addForm(new WordForm("λόγον", "word - root λόγο", MASCULINE, ACCUSATIVE, SINGULAR, SECOND_DECLENSION))
            .addForm(new WordForm("λόγοι", "words - root λόγο", MASCULINE, NOMINATIVE, PLURAL, SECOND_DECLENSION))
            .addForm(new WordForm("λόγοι", "words - root λόγο", MASCULINE, VOCATIVE, PLURAL, SECOND_DECLENSION))
            .addForm(new WordForm("λόγων", "words - root λόγο", MASCULINE, GENITIVE, PLURAL, SECOND_DECLENSION))
            .addForm(new WordForm("λόγοις", "words - root λόγο", MASCULINE, DATIVE, PLURAL, SECOND_DECLENSION))
            .addForm(new WordForm("λόγους", "words - root λόγο", MASCULINE, ACCUSATIVE, PLURAL, SECOND_DECLENSION)),

        new Word(new WordForm("γραφή", "writing - root γραφή", FEMININE, NOMINATIVE, SINGULAR, FIRST_DECLENSION), STRONG, "first declension")
            .addForm(new WordForm("γραφή", "writing - root γραφή", FEMININE, VOCATIVE, SINGULAR, FIRST_DECLENSION))
            .addForm(new WordForm("γραφῆς", "writing - root γραφή", FEMININE, GENITIVE, SINGULAR, FIRST_DECLENSION))
            .addForm(new WordForm("γραφῇ", "writing - root γραφή", FEMININE, DATIVE, SINGULAR, FIRST_DECLENSION))
            .addForm(new WordForm("γραφήν", "writing - root γραφή", FEMININE, ACCUSATIVE, SINGULAR, FIRST_DECLENSION))
            .addForm(new WordForm("γραφαί", "writings - root γραφή", FEMININE, NOMINATIVE, PLURAL, FIRST_DECLENSION))
            .addForm(new WordForm("γραφαί", "writings - root γραφή", FEMININE, VOCATIVE, PLURAL, FIRST_DECLENSION))
            .addForm(new WordForm("γραφῶν", "writings - root γραφή", FEMININE, GENITIVE, PLURAL, FIRST_DECLENSION))
            .addForm(new WordForm("γραφαῖς", "writings - root γραφή", FEMININE, DATIVE, PLURAL, FIRST_DECLENSION))
            .addForm(new WordForm("γραφάς", "writings - root γραφή", FEMININE, ACCUSATIVE, PLURAL, FIRST_DECLENSION)),

        new Word(new WordForm("ἔργον", "work - root ἔργο", NEUTER, NOMINATIVE, SINGULAR, SECOND_DECLENSION), STRONG, "second declension neuter")
            .addForm(new WordForm("ἔργου", "work - root ἔργο", NEUTER, GENITIVE, SINGULAR, SECOND_DECLENSION))
            .addForm(new WordForm("ἔργῳ", "work - root ἔργο", NEUTER, DATIVE, SINGULAR, SECOND_DECLENSION))
            .addForm(new WordForm("ἔργον", "work - root ἔργο", NEUTER, ACCUSATIVE, SINGULAR, SECOND_DECLENSION))
            .addForm(new WordForm("ἔργα", "works - root ἔργο", NEUTER, NOMINATIVE, PLURAL, SECOND_DECLENSION))
            .addForm(new WordForm("ἔργων", "works - root ἔργο", NEUTER, GENITIVE, PLURAL, SECOND_DECLENSION))
            .addForm(new WordForm("ἔργοις", "works - root ἔργο", NEUTER, DATIVE, PLURAL, SECOND_DECLENSION))
            .addForm(new WordForm("ἔργα", "works - root ἔργο", NEUTER, ACCUSATIVE, PLURAL, SECOND_DECLENSION)),

        new Word(new WordForm("σάρξ", "flesh - root σάρκ", FEMININE, NOMINATIVE, SINGULAR, THIRD_DECLENSION), STRONG, "third declension")
            .addForm(new WordForm("σάρκ", "flesh - root σάρκ", FEMININE, VOCATIVE, SINGULAR, THIRD_DECLENSION)) // TODO not sure this is right
            .addForm(new WordForm("σαρκός", "flesh - root σάρκ", FEMININE, GENITIVE, SINGULAR, THIRD_DECLENSION))
            .addForm(new WordForm("σαρκί", "flesh - root σάρκ", FEMININE, DATIVE, SINGULAR, THIRD_DECLENSION))
            .addForm(new WordForm("σάρκα", "flesh - root σάρκ", FEMININE, ACCUSATIVE, SINGULAR, THIRD_DECLENSION))
            .addForm(new WordForm("σάρκες", "fleshes - root σάρκ", FEMININE, NOMINATIVE, PLURAL, THIRD_DECLENSION))
            .addForm(new WordForm("σάρκες", "fleshes - root σάρκ", FEMININE, VOCATIVE, PLURAL, THIRD_DECLENSION))
            .addForm(new WordForm("σαρκῶν", "fleshes - root σάρκ", FEMININE, GENITIVE, PLURAL, THIRD_DECLENSION))
            .addForm(new WordForm("σαρξί", "fleshes - root σάρκ", FEMININE, DATIVE, PLURAL, THIRD_DECLENSION))
            .addForm(new WordForm("σαρξίν", "fleshes - root σάρκ", FEMININE, DATIVE, PLURAL, THIRD_DECLENSION))
            .addForm(new WordForm("σάρκας", "fleshes - root σάρκ", FEMININE, ACCUSATIVE, PLURAL, THIRD_DECLENSION))
    );
  }
}
