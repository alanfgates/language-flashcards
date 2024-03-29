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

import static com.github.alanfgates.language.flashcards.Classifier.*;

class GreekBuilderHelperGrammar {
  static List<Word> getGrammar() {
    return Arrays.asList(
        //----------------------------------------------------------------------------------------
        // VERB FORMS
        //
        // Indicative Active Present
        new Word("λύω")
            .addForm("I loosen", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR)
            .addForm("I might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύεις", "you loosen", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύει", "s/he loosens", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λύομεν", "we loosen", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύετε")
            .addForm("you loosen", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL)
            .addForm("keep loosing!", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύουσι")
            .addForm("they loosen", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL)
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, PLURAL),
        new Word("λύουσιν")
            .addForm("they loosen", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL)
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, PLURAL),

        // Indicative Active Future
        new Word("λύσω")
            .addForm("I will loosen", INDICATIVE, ACTIVE, FUTURE, FIRST_PERSON, SINGULAR)
            .addForm("I might loosen", SUBJUNCTIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("λύσεις", "you will loosen", INDICATIVE, ACTIVE, FUTURE, SECOND_PERSON, SINGULAR),
        new Word("λύσει", "s/he will loosen", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, SINGULAR),
        new Word("λύσομεν", "we will loosen", INDICATIVE, ACTIVE, FUTURE, FIRST_PERSON, PLURAL),
        new Word("λύσετε", "you will loosen", INDICATIVE, ACTIVE, FUTURE, SECOND_PERSON, PLURAL),
        new Word("λύσουσι", "they will loosen", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, PLURAL),
        new Word("λύσουσιν", "they will loosen", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, PLURAL),

        // Indicative Active Imperfect
        new Word("ἔλυον")
            .addForm("I was loosening", INDICATIVE, ACTIVE, IMPERFECT, FIRST_PERSON, SINGULAR)
            .addForm("they were loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, PLURAL),
        new Word("ἔλυες", "you were loosening", INDICATIVE, ACTIVE, IMPERFECT, SECOND_PERSON, SINGULAR),
        new Word("ἔλυε", "s/he was loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἔλυεν", "s/he was loosening", INDICATIVE, ACTIVE, IMPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἐλύομεν", "we were loosening", INDICATIVE, ACTIVE, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("ἐλύετε", "you were loosening", INDICATIVE, ACTIVE, IMPERFECT, SECOND_PERSON, PLURAL),

        // Indicative Active Aorist
        new Word("ἔλυσα", "I loosened", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR),
        new Word("ἔλυσας", "you loosened", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἔλυσε", "s/he loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἔλυσεν", "s/he loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἐλύσαμεν", "we loosened", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("ἐλύσατε", "you loosened", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("ἔλυσαν", "they loosened", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),

        // Indicative Active Second Aorist
        new Word("ἔβαλον")
            .addForm("I threw", INDICATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR)
            .addForm("they threw", INDICATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),
        new Word("ἔβαλες", "you threw", INDICATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("ἔβαλε", "s/he threw", INDICATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἐβάλομεν", "we threw", INDICATIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("ἐβάλετε", "you threw", INDICATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),

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
        new Word("ἐλελύκειν")
            .addForm("I had loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, SINGULAR)
            .addForm("s/he had loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR),
        new Word("λελύκειν")
            .addForm("I had loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, SINGULAR)
            .addForm("s/he had loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἐλελύκεις", "you had loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, SINGULAR),
        new Word("λελύκεις", "you had loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, SINGULAR),
        new Word("ἐλελύκει", "s/he had loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR),
        new Word("λελύκει", "s/he had loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἐλελύκειμεν", "we had loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, PLURAL),
        new Word("λελύκειμεν", "we had loosened", INDICATIVE, ACTIVE, PLUPERFECT, FIRST_PERSON, PLURAL),
        new Word("ἐλελύκειτε", "you had loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, PLURAL),
        new Word("λελύκειτε", "you had been loosened", INDICATIVE, ACTIVE, PLUPERFECT, SECOND_PERSON, PLURAL),
        new Word("ἐλελύκεισαν", "they had loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, PLURAL),
        new Word("λελύκεισαν", "they had loosened", INDICATIVE, ACTIVE, PLUPERFECT, THIRD_PERSON, PLURAL),

        // Indicative Middle Present
        new Word("λύομαι", "I loosen myself/am loosened", INDICATIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύῃ")
            .addForm("you loosen yourself/are loosened", INDICATIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR)
            .addForm("s/he might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR)
            .addForm("you might be loosening yourself/be loosened", SUBJUNCTIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύεται", "s/he loosens her/himself/is loosened", INDICATIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυόμεθα", "we loosen ourselves/are loosened", INDICATIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύεσθε")
            .addForm("you loosen yourselves/are loosened", INDICATIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL)
            .addForm("keep loosing yourselves!/being loosened", IMPERATIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύονται", "they loosen themselves/are loosened", INDICATIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic indicative middle present
        new Word("δίδομαι", "I give myself/am given - stem διδο", ATHEMATIC, ATHEMATIC, INDICATIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),
        // TODO add full conjugation

        // Indicative Middle Future
        new Word("λύσομαι", "I will loosen myself", INDICATIVE, MIDDLE, FUTURE, FIRST_PERSON, SINGULAR),
        new Word("λύσῃ")
            .addForm("you will loosen yourself", INDICATIVE, MIDDLE, FUTURE, SECOND_PERSON, SINGULAR)
            .addForm("s/he might loosen", SUBJUNCTIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR)
            .addForm("you might loosen yourself", SUBJUNCTIVE, MIDDLE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λύσεται", "s/he will loosen her/himself", INDICATIVE, MIDDLE, FUTURE, THIRD_PERSON, SINGULAR),
        new Word("λυσόμεθα", "we will loosen ourselves", INDICATIVE, MIDDLE, FUTURE, FIRST_PERSON, PLURAL),
        new Word("λύσεσθε", "you will loosen yourselves", INDICATIVE, MIDDLE, FUTURE, SECOND_PERSON, PLURAL),
        new Word("λύσονται", "they will loosen themselves", INDICATIVE, MIDDLE, FUTURE, THIRD_PERSON, PLURAL),

        // Indicative Middle Imperfect
        new Word("ἐλυόμην", "I was loosing myself/being loosened", INDICATIVE, MIDDLE, PASSIVE, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("ἐλύου", "you were loosing yourself/being loosened", INDICATIVE, MIDDLE, PASSIVE, IMPERFECT, SECOND_PERSON, SINGULAR),
        new Word("ἐλύετο", "S/he was loosing her/himself/being loosened", INDICATIVE, MIDDLE, PASSIVE, IMPERFECT, THIRD_PERSON, SINGULAR),
        new Word("ἐλυόμεθα", "We were loosing ourselves/being loosened", INDICATIVE, MIDDLE, PASSIVE, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("ἐλύεσθε", "You were loosing yourselves/being loosened", INDICATIVE, MIDDLE, PASSIVE, IMPERFECT, SECOND_PERSON, PLURAL),
        new Word("ἐλύοντο", "They were loosing themselves/being loosened", INDICATIVE, MIDDLE, PASSIVE, IMPERFECT, THIRD_PERSON, PLURAL),

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
        new Word("λέλυμαι", "I have loosened myself/been loosened", INDICATIVE, MIDDLE, PASSIVE, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("λέλυσαι", "you have loosened yourself/been loosened", INDICATIVE, MIDDLE, PASSIVE, PERFECT, SECOND_PERSON, SINGULAR),
        new Word("λέλυται", "s/he has loosened her/himself/been loosened", INDICATIVE, MIDDLE, PASSIVE, PERFECT, THIRD_PERSON, SINGULAR),
        new Word("λελύμεθα", "we have loosened ourseleves/been loosened", INDICATIVE, MIDDLE, PASSIVE, PERFECT, FIRST_PERSON, PLURAL),
        new Word("λελύσθε", "you have loosened yourselves/been loosened", INDICATIVE, MIDDLE, PASSIVE, PERFECT, SECOND_PERSON, PLURAL),
        new Word("λέλυνται", "they have loosened themselves/been loosened", INDICATIVE, MIDDLE, PASSIVE, PERFECT, THIRD_PERSON, PLURAL),

        // Omitting indicative middle/passive plu-perfect as it occurs only 7 times

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

        // Subjunctive active present
        // for 1st p singular see indicative active present above
        new Word("λύῃς", "you might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        // for 3rd person singular see indicative middle present
        new Word("λύωμεν", "we might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύητε", "you might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύωσι", "they might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),
        new Word("λύωσιν", "they might be loosening", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic subjunctive active present
        new Word("διδῶ", "I might be giving - stem διδω", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),

        // Subjunctive active aorist
        // for 1st p singular see indicative active future above
        new Word("λύσῃς", "you might loosen", SUBJUNCTIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR),
        // for 3rd p singular see indicative middle future above
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
        new Word("δῶ", "I might give - stem δω", ATHEMATIC, SUBJUNCTIVE, ACTIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        // TODO add full conjugation

        // Subjunctive middle present
        new Word("λύωμαι", "I might be loosening myself/be loosened", SUBJUNCTIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),
        // for 2nd p singular see indicative middle future above
        new Word("λύηται", "s/he might be loosening her/himself/be loosened", SUBJUNCTIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυώμεθα", "we might be loosening ourselves/be loosened", SUBJUNCTIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύησθε", "you might be loosening yourselves/be loosened", SUBJUNCTIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύωνται", "they might be loosening themselves/be loosened", SUBJUNCTIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic subjunctive middle present
        new Word("διδῶμαι", "I might be giving myself/be given - stem διδω", ATHEMATIC, SUBJUNCTIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),
        // TODO add full conjugation

        // Subjunctive middle aorist
        new Word("λύσωμαι", "I might loosen myself", SUBJUNCTIVE, MIDDLE, AORIST, FIRST_PERSON, SINGULAR),
        // for 2nd p singular see indicative middle future above
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
        new Word("δῶμαι", "I might give myself - stem δω", ATHEMATIC, SUBJUNCTIVE, MIDDLE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        // TODO add full conjugation

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
        new Word("γραφῇ")
            .addForm("s/he might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR)
            .addForm("writing - root γραφή", FEMININE, DATIVE, SINGULAR, FIRST_DECLENSION),
        new Word("γραφῶμεν", "we might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, PLURAL),
        new Word("γραφῆτε", "you might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("γραφῶσι", "they might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),
        new Word("γραφῶσιν", "they might be written", SUBJUNCTIVE, PASSIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic subjunctive passive second aorist
        new Word("δοθῶ", "I might be given - stem δο", ATHEMATIC, SUBJUNCTIVE, PASSIVE, SECOND_AORIST, FIRST_PERSON, SINGULAR),
        // TODO add full conjugation

        // Imperative active present
        new Word("λῦε", "keep loosing!", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λυέτω", "let him/her keep loosing!", IMPERATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),
        // For 2nd p plural see indicative active present above
        new Word("λυέτωσαν", "let them keep loosing!", IMPERATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic imperative active present
        new Word("δίδοτε", "keep giving! - stem διδο", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),

        // Imperative active aorist
        new Word("λῦσον", "loose!", IMPERATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR),
        new Word("λυσάτω", "let him/her loose!", IMPERATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λύσατε", "loose!", IMPERATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λυσάτωσαν", "let them loose!", IMPERATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),

        // Imperative active second aorist
        new Word("λάβε", "take!", IMPERATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("λαβέτω", "let him/her take!", IMPERATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("λάβετε", "take!", IMPERATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("λαβέτωσαν", "let them take!", IMPERATIVE, ACTIVE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic imperative active second aorist
        new Word("δότε", "give! - stem δο", ATHEMATIC, IMPERATIVE, ACTIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        // TODO add full conjugation

        // Imperative middle present
        new Word("λύου", "keep loosing yourself/being loosened!", IMPERATIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λυέσθω", "let him/her keep loosing him/herself!/being loosened", IMPERATIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR),
        // for 2nd p plural see indicative middle present above
        new Word("λυέσθωσαν", "let them keep loosing themselves!/being loosened", IMPERATIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL),

        // Athematic imperative middle present
        new Word("δίδοσθε", "keep giving yourselves!/being given - stem διδο", ATHEMATIC, IMPERATIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),
        // TODO add full conjugation

        // Imperative middle aorist
        new Word("λῦσαι")
            .addForm("loose yourself!", IMPERATIVE, MIDDLE, AORIST, SECOND_PERSON, SINGULAR)
            .addForm("to loosen", INFINITIVE, ACTIVE, AORIST),
        new Word("λυσάσθω", "let him/her loose him/herself!", IMPERATIVE, MIDDLE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("λύσασθε", "loose yourselves!", IMPERATIVE, MIDDLE, AORIST, SECOND_PERSON, PLURAL),
        new Word("λυσάσθωσαν", "let them loose themselves!", IMPERATIVE, MIDDLE, AORIST, THIRD_PERSON, PLURAL),

        // Imperative middle second aorist
        new Word("γενοῦ", "become!", IMPERATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, SINGULAR),
        new Word("γενέσθω", "let him/her become!", IMPERATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, SINGULAR),
        new Word("γένεσθε", "become!", IMPERATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        new Word("γενέσθωσαν", "let them become!", IMPERATIVE, MIDDLE, SECOND_AORIST, THIRD_PERSON, PLURAL),

        // Athematic imperative middle second aorist
        new Word("δόσθε", "give yourselves! - stem δο", ATHEMATIC, IMPERATIVE, MIDDLE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        // TODO add full conjugation

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
        new Word("δόθητε", "be given! - stem δο", ATHEMATIC, IMPERATIVE, PASSIVE, SECOND_AORIST, SECOND_PERSON, PLURAL),
        // TODO add full conjugation

        // Infinitive active
        new Word("λύειν", "to continually loosen", INFINITIVE, ACTIVE, PRESENT),
        // for active aorist see imperative middle aorist above
        new Word("λαβεῖν", "to receive", INFINITIVE, ACTIVE, SECOND_AORIST),
        new Word("λελυκέναι", "to have loosened", INFINITIVE, ACTIVE, PERFECT),

        // Athematic infinitive active
        new Word("διδόναι", "to keep giving - stem διδο", ATHEMATIC, INFINITIVE, ACTIVE, PRESENT),
        new Word("δοῦναι", "to give - stem δο", ATHEMATIC, INFINITIVE, ACTIVE, SECOND_AORIST),
        // TODO add full conjugation

        // Infinitive middle
        new Word("λύεσθαι")
            .addForm("to continually loosen oneself", INFINITIVE, MIDDLE, PRESENT)
            .addForm("to continually have been loosened", INFINITIVE, PASSIVE, PRESENT),
        new Word("λύσασθαι", "to loosen oneself", INFINITIVE, MIDDLE, AORIST),
        new Word("λαβέσθαι", "to receive oneself", INFINITIVE, MIDDLE, SECOND_AORIST),
        new Word("λελύσθαι", "to have loosened oneself", INFINITIVE, MIDDLE, PERFECT),

        // Athematic infinitive middle
        new Word("δίδοσθαι")
            .addForm("to keep giving oneself - stem διδο", ATHEMATIC, INFINITIVE, MIDDLE, PRESENT)
            .addForm("to keep being given - stem διδο", ATHEMATIC, INFINITIVE, PASSIVE, PRESENT),
        new Word("δόσθαι", "to give oneself - stem δο", ATHEMATIC, INFINITIVE, MIDDLE, SECOND_AORIST),

        // Infinitive passive
        // for present see infinitive middle above
        new Word("λυθῆναι", "to have been loosened", INFINITIVE, PASSIVE, AORIST),
        new Word("γραφῆναι", "to have been written", INFINITIVE, PASSIVE, SECOND_AORIST),
        new Word("λελῦσθαι", "to have been loosened", INFINITIVE, PASSIVE, PERFECT),

        // Athematic infinitive passive
        // for present see infinitive middle above
        new Word("δοθῆναι", "to be given - stem δο", ATHEMATIC, INFINITIVE, PASSIVE, SECOND_AORIST),

        // Participle active present
        new Word("λύων", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λύοντος")
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, GENITIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, GENITIVE, SINGULAR),
        new Word("λύοντι")
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, SINGULAR),
        new Word("λύοντα")
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, ACCUSATIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, ACCUSATIVE, PLURAL),
        new Word("λύοντες", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λύοντων")
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, GENITIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, GENITIVE, PLURAL),
        // for dative plural see imperative active present above
        new Word("λύοντας", "loosening", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λῦον")
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, ACTIVE, PRESENT, NEUTER, ACCUSATIVE, SINGULAR),

        new Word("λύουσα", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λυούσης", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, GENITIVE, SINGULAR),
        new Word("λυούσῃ", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, DATIVE, SINGULAR),
        new Word("λύουσαν", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λύουσαι", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, PLURAL),
        new Word("λυουσῶν", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, GENITIVE, PLURAL),
        new Word("λυούσαις", "looseninp", PARTICIPLE, ACTIVE, PRESENT, FEMININE, DATIVE, PLURAL),
        new Word("λυούσας", "loosening", PARTICIPLE, ACTIVE, PRESENT, FEMININE, ACCUSATIVE, PLURAL),


        // Athematic participle active present
        new Word("διδούς", "giving - stem διδο", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("διδοῦσα", "giving - stem διδο", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("διδόν", "giving - stem διδο", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, SINGULAR),

        // Participle active aorist
        new Word("λύσας", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λύσαντος")
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, GENITIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, GENITIVE, SINGULAR),
        new Word("λύσαντι")
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, DATIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, DATIVE, SINGULAR),
        new Word("λύσαντα")
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, ACCUSATIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, NOMINATIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, ACCUSATIVE, PLURAL),
        new Word("λύσαντες", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λυσάντων")
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, GENITIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, GENITIVE, PLURAL),
        new Word("λύσασι")
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, DATIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, DATIVE, PLURAL),
        new Word("λύσασιν")
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, DATIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, DATIVE, PLURAL),
        new Word("λύσαντας", "loosening", PARTICIPLE, ACTIVE, AORIST, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λῦσαν")
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, NOMINATIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, ACTIVE, AORIST, NEUTER, ACCUSATIVE, SINGULAR),

        new Word("λύσασα", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λυσάσης", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, GENITIVE, SINGULAR),
        new Word("λυσάσῃ", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, DATIVE, SINGULAR),
        new Word("λύσασαν", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λύσασαι", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, NOMINATIVE, PLURAL),
        new Word("λυσασῶν", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, GENITIVE, PLURAL),
        new Word("λυσάσαις", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, DATIVE, PLURAL),
        new Word("λυσάσας", "loosening", PARTICIPLE, ACTIVE, AORIST, FEMININE, ACCUSATIVE, PLURAL),


        // Participle active second aorist
        new Word("βαλών", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("βαλόντος")
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, GENITIVE, SINGULAR)
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, GENITIVE, SINGULAR),
        new Word("βαλόντι")
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, DATIVE, SINGULAR)
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, DATIVE, SINGULAR),
        new Word("βαλόντα")
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, ACCUSATIVE, SINGULAR)
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, NOMINATIVE, PLURAL)
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, ACCUSATIVE, PLURAL),
        new Word("βαλόντες", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, NOMINATIVE, PLURAL),
        new Word("βαλόντων")
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, GENITIVE, PLURAL)
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, GENITIVE, PLURAL),
        new Word("βαλοῦσι")
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, DATIVE, PLURAL)
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, DATIVE, PLURAL),
        new Word("βαλοῦσιν")
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, DATIVE, PLURAL)
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, DATIVE, PLURAL),
        new Word("βαλόντας", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("βαλόν")
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, NOMINATIVE, SINGULAR)
            .addForm("throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, ACCUSATIVE, SINGULAR),

        new Word("βαλοῦσα", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, NOMINATIVE, SINGULAR),
        new Word("βαλούσης", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, GENITIVE, SINGULAR),
        new Word("βαλούσῃ", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, DATIVE, SINGULAR),
        new Word("βαλοῦσαν", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("βαλοῦσαι", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, NOMINATIVE, PLURAL),
        new Word("βαλουσῶν", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, GENITIVE, PLURAL),
        new Word("βαλούσαις", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, DATIVE, PLURAL),
        new Word("βαλούσας", "throwing", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, ACCUSATIVE, PLURAL),


        // Athematic participle active second aorist
        new Word("δούς", "giving - stem δο", PARTICIPLE, ACTIVE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("δοῦσα", "giving - stem δο", PARTICIPLE, ACTIVE, SECOND_AORIST, FEMININE, NOMINATIVE, SINGULAR),
        new Word("δόν", "giving - stem δο", PARTICIPLE, ACTIVE, SECOND_AORIST, NEUTER, NOMINATIVE, SINGULAR),

        // Participle active perfect
        new Word("λελυκώς", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λελυκότος")
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, GENITIVE, SINGULAR)
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, GENITIVE, SINGULAR),
        new Word("λελυκότι")
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, DATIVE, SINGULAR)
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, DATIVE, SINGULAR),
        new Word("λελυκότα")
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, ACCUSATIVE, SINGULAR)
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, NOMINATIVE, PLURAL)
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, ACCUSATIVE, PLURAL),
        new Word("λελυκότες", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λελυκότων")
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, GENITIVE, PLURAL)
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, GENITIVE, PLURAL),
        new Word("λελυκόσι")
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, DATIVE, PLURAL)
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, DATIVE, PLURAL),
        new Word("λελυκόσιν")
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, DATIVE, PLURAL)
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, DATIVE, PLURAL),
        new Word("λελυκότας", "having loosened", PARTICIPLE, ACTIVE, PERFECT, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λελυκός")
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, NOMINATIVE, SINGULAR)
            .addForm("having loosened", PARTICIPLE, ACTIVE, PERFECT, NEUTER, ACCUSATIVE, SINGULAR),

    new Word("λελυκυῖα", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λελυκυῖας", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, GENITIVE, SINGULAR),
        new Word("λελυκυῖᾳ", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, DATIVE, SINGULAR),
        new Word("λελυκυῖαν", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λελυκυῖαι", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, NOMINATIVE, PLURAL),
        new Word("λελυκυιων", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, GENITIVE, PLURAL),
        new Word("λελυκυῖαις", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, DATIVE, PLURAL),
        new Word("λελυκυίας", "having loosened", PARTICIPLE, ACTIVE, PERFECT, FEMININE, ACCUSATIVE, PLURAL),


        // Participle middle present
        new Word("λυόμενος", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λυομένου")
            .addForm("loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, GENITIVE, SINGULAR)
            .addForm("loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, GENITIVE, SINGULAR),
        new Word("λυομένῳ")
            .addForm("loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, DATIVE, SINGULAR)
            .addForm("loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, DATIVE, SINGULAR),
        new Word("λυόμενον")
            .addForm("loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, ACCUSATIVE, SINGULAR)
            .addForm("loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, NOMINATIVE, SINGULAR)
            .addForm("loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("λυόμενοι", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λυομένων")
            .addForm("loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, GENITIVE, PLURAL)
            .addForm("loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, GENITIVE, PLURAL)
            .addForm("loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, GENITIVE, PLURAL),
        new Word("λυομένοις")
            .addForm("loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, DATIVE, PLURAL)
            .addForm("loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, DATIVE, PLURAL),
        new Word("λυομένους", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λυόμενα")
            .addForm("loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, NOMINATIVE, PLURAL)
            .addForm("loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, NEUTER, ACCUSATIVE, PLURAL),

        new Word("λυομένη", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λυομένης", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, GENITIVE, SINGULAR),
        new Word("λυομένῃ", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, DATIVE, SINGULAR),
        new Word("λυομένην", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λυόμεναι", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, NOMINATIVE, PLURAL),
        new Word("λυομέναις", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, DATIVE, PLURAL),
        new Word("λυομένας", "loosening/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PRESENT, FEMININE, ACCUSATIVE, PLURAL),


        // Athematic participle middle present
        new Word("διδόμενος", "giving oneself/being given - stem διδο", ATHEMATIC, PARTICIPLE, MIDDLE, PASSIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),
        // TODO add full conjugation

        // Participle middle aorist
        new Word("λυσάμενος", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λυσαμένου")
            .addForm("loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, GENITIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, GENITIVE, SINGULAR),
        new Word("λυσαμένῳ")
            .addForm("loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, DATIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, DATIVE, SINGULAR),
        new Word("λυσάμενον")
            .addForm("loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, ACCUSATIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, NOMINATIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("λυσάμενοι", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λυσαμένων")
            .addForm("loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, GENITIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, GENITIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, GENITIVE, PLURAL),
    new Word("λυσαμένοις")
            .addForm("loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, DATIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, DATIVE, PLURAL),
        new Word("λυσαμένους", "loosening", PARTICIPLE, MIDDLE, AORIST, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λυσάμενα")
            .addForm("loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, NOMINATIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, MIDDLE, AORIST, NEUTER, ACCUSATIVE, PLURAL),

    new Word("λυσαμένη", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λυσαμένης", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, GENITIVE, SINGULAR),
        new Word("λυσαμένῃ", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, DATIVE, SINGULAR),
        new Word("λυσαμένην", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λυσάμεναι", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, NOMINATIVE, PLURAL),
        new Word("λυσαμέναις", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, DATIVE, PLURAL),
        new Word("λυσαμένας", "loosening", PARTICIPLE, MIDDLE, AORIST, FEMININE, ACCUSATIVE, PLURAL),


        // Participle middle second aorist
        new Word("γενόμενος", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("γενομένου")
            .addForm("becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, GENITIVE, SINGULAR)
            .addForm("becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, GENITIVE, SINGULAR),
        new Word("γενομένῳ")
            .addForm("becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, DATIVE, SINGULAR)
            .addForm("becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, DATIVE, SINGULAR),
        new Word("γενόμενον")
            .addForm("becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, ACCUSATIVE, SINGULAR)
            .addForm("becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, NOMINATIVE, SINGULAR)
            .addForm("becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("γενόμενοι", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, NOMINATIVE, PLURAL),
        new Word("γενομένων")
            .addForm("becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, GENITIVE, PLURAL)
            .addForm("becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, GENITIVE, PLURAL)
            .addForm("becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, GENITIVE, PLURAL),
        new Word("γενομένοις")
            .addForm("becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, DATIVE, PLURAL)
            .addForm("becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, DATIVE, PLURAL),
        new Word("γενομένους", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("γενόμενα")
            .addForm("becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, NOMINATIVE, PLURAL)
            .addForm("becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, NEUTER, ACCUSATIVE, PLURAL),

        new Word("γενομένη", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, NOMINATIVE, SINGULAR),
        new Word("γενομένης", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, GENITIVE, SINGULAR),
        new Word("γενομένῃ", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, DATIVE, SINGULAR),
        new Word("γενομένην", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("γενόμεναι", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, NOMINATIVE, PLURAL),
        new Word("γενομέναις", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, DATIVE, PLURAL),
        new Word("γενομένας", "becoming", PARTICIPLE, MIDDLE, SECOND_AORIST, FEMININE, ACCUSATIVE, PLURAL),

        // Athematic participle middle second aorist
        new Word("δόμενος", "giving oneself - stem δο", PARTICIPLE, MIDDLE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR),

        // Participle middle/passive perfect
        new Word("λελυμένος", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λελυμένου")
            .addForm("loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, GENITIVE, SINGULAR)
            .addForm("loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, GENITIVE, SINGULAR),
        new Word("λελυμένῳ")
            .addForm("loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, DATIVE, SINGULAR)
            .addForm("loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, DATIVE, SINGULAR),
        new Word("λελυμένον")
            .addForm("loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, ACCUSATIVE, SINGULAR)
            .addForm("loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, NOMINATIVE, SINGULAR)
            .addForm("loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, ACCUSATIVE, SINGULAR),
        new Word("λελυμένοι", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λελυμένων")
            .addForm("loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, GENITIVE, PLURAL)
            .addForm("loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, GENITIVE, PLURAL)
            .addForm("loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, GENITIVE, PLURAL),
        new Word("λελυμένοις")
            .addForm("loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, DATIVE, PLURAL)
            .addForm("loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, DATIVE, PLURAL),
        new Word("λελυμένους", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λελυμένα")
            .addForm("loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, NOMINATIVE, PLURAL)
            .addForm("loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, NEUTER, ACCUSATIVE, PLURAL),

        new Word("λελυμένη", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λελυμένης", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, GENITIVE, SINGULAR),
        new Word("λελυμένῃ", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, DATIVE, SINGULAR),
        new Word("λελυμένην", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λελυμέναι", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, NOMINATIVE, PLURAL),
        new Word("λελυμέναις", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, DATIVE, PLURAL),
        new Word("λελυμένας", "loosening oneself/being loosened", PARTICIPLE, MIDDLE, PASSIVE, PERFECT, FEMININE, ACCUSATIVE, PLURAL),

        // Participle passive aorist
        new Word("λυθείς", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("λυθέντος")
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, GENITIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, GENITIVE, SINGULAR),
        new Word("λυθέντι")
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, DATIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, DATIVE, SINGULAR),
        new Word("λυθέντα")
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, ACCUSATIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, NOMINATIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, ACCUSATIVE, PLURAL),
        new Word("λυθέντες", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, NOMINATIVE, PLURAL),
        new Word("λυθέντων")
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, GENITIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, GENITIVE, PLURAL),
        new Word("λυθεῖσι")
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, DATIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, DATIVE, PLURAL),
        new Word("λυθεῖσιν")
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, DATIVE, PLURAL)
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, DATIVE, PLURAL),
        new Word("λυθέντας", "loosening", PARTICIPLE, PASSIVE, AORIST, MASCULINE, ACCUSATIVE, PLURAL),
        new Word("λυθέν")
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, NOMINATIVE, SINGULAR)
            .addForm("loosening", PARTICIPLE, PASSIVE, AORIST, NEUTER, ACCUSATIVE, SINGULAR),

        new Word("λυθεῖσα", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, NOMINATIVE, SINGULAR),
        new Word("λυθείσης", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, GENITIVE, SINGULAR),
        new Word("λυθείσῃ", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, DATIVE, SINGULAR),
        new Word("λυθεῖσαν", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("λυθεῖσαι", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, NOMINATIVE, PLURAL),
        new Word("λυθεισῶν", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, GENITIVE, PLURAL),
        new Word("λυθείσαις", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, DATIVE, PLURAL),
        new Word("λυθείσας", "loosening", PARTICIPLE, PASSIVE, AORIST, FEMININE, ACCUSATIVE, PLURAL),


        // No verb occurring 50 or more times in the NT has 2nd passive participle

        // Athematic participle passive second aorist
        new Word("δοθείς", "being given - stem δο", ATHEMATIC, PARTICIPLE, PASSIVE, SECOND_AORIST, MASCULINE, NOMINATIVE, SINGULAR),
        // TODO add full conjugation


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
        new Word("λυοίμην", "I wish to keep loosening myself/being loosened", OPTATIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, SINGULAR),
        new Word("λύοιο", "you wish to keep loosening yourself/being loosened", OPTATIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("λύοιτο", "s/he wishes to keep loosening her/himself/being loosened", OPTATIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("λυοίμεθα", "we wish to keep loosening ourselves/being loosened", OPTATIVE, MIDDLE, PASSIVE, PRESENT, FIRST_PERSON, PLURAL),
        new Word("λύοισθε", "you wish to keep loosening yourselves/being loosened", OPTATIVE, MIDDLE, PASSIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("λύοιντο", "they wish to keep loosening themselves/being loosened", OPTATIVE, MIDDLE, PASSIVE, PRESENT, THIRD_PERSON, PLURAL),

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
        new Word("λόγοι")
            .addForm("words - root λόγο", MASCULINE, NOMINATIVE, PLURAL, SECOND_DECLENSION)
            .addForm("words - root λόγο", MASCULINE, VOCATIVE, PLURAL, SECOND_DECLENSION),
        new Word("λόγων", "words - root λόγο", MASCULINE, GENITIVE, PLURAL, SECOND_DECLENSION),
        new Word("λόγοις", "words - root λόγο", MASCULINE, DATIVE, PLURAL, SECOND_DECLENSION),
        new Word("λόγους", "words - root λόγο", MASCULINE, ACCUSATIVE, PLURAL, SECOND_DECLENSION),

        new Word("γραφή")
            .addForm("writing - root γραφή", FEMININE, NOMINATIVE, SINGULAR, FIRST_DECLENSION)
            .addForm("writing - root γραφή", FEMININE, VOCATIVE, SINGULAR, FIRST_DECLENSION),
        new Word("γραφῆς", "writing - root γραφή", FEMININE, GENITIVE, SINGULAR, FIRST_DECLENSION),
        // for dative singular see subjunctive passive second aorist above
        new Word("γραφήν", "writing - root γραφή", FEMININE, ACCUSATIVE, SINGULAR, FIRST_DECLENSION),
        new Word("γραφαί")
            .addForm("writings - root γραφή", FEMININE, NOMINATIVE, PLURAL, FIRST_DECLENSION)
            .addForm("writings - root γραφή", FEMININE, VOCATIVE, PLURAL, FIRST_DECLENSION),
        new Word("γραφῶν", "writings - root γραφή", FEMININE, GENITIVE, PLURAL, FIRST_DECLENSION),
        new Word("γραφαῖς", "writings - root γραφή", FEMININE, DATIVE, PLURAL, FIRST_DECLENSION),
        new Word("γραφάς", "writings - root γραφή", FEMININE, ACCUSATIVE, PLURAL, FIRST_DECLENSION),

        new Word("ἔργον")
            .addForm("work - root ἔργο", NEUTER, NOMINATIVE, SINGULAR, SECOND_DECLENSION)
            .addForm("work - root ἔργο", NEUTER, ACCUSATIVE, SINGULAR, SECOND_DECLENSION),
        new Word("ἔργου", "work - root ἔργο", NEUTER, GENITIVE, SINGULAR, SECOND_DECLENSION),
        new Word("ἔργῳ", "work - root ἔργο", NEUTER, DATIVE, SINGULAR, SECOND_DECLENSION),
        new Word("ἔργα")
            .addForm("works - root ἔργο", NEUTER, NOMINATIVE, PLURAL, SECOND_DECLENSION)
            .addForm("works - root ἔργο", NEUTER, ACCUSATIVE, PLURAL, SECOND_DECLENSION),
        new Word("ἔργων", "works - root ἔργο", NEUTER, GENITIVE, PLURAL, SECOND_DECLENSION),
        new Word("ἔργοις", "works - root ἔργο", NEUTER, DATIVE, PLURAL, SECOND_DECLENSION),

        new Word("σάρξ", "flesh - root σάρκ", FEMININE, NOMINATIVE, SINGULAR, THIRD_DECLENSION),
        new Word("σάρκ", "flesh - root σάρκ", FEMININE, VOCATIVE, SINGULAR, THIRD_DECLENSION),
        new Word("σαρκός", "flesh - root σάρκ", FEMININE, GENITIVE, SINGULAR, THIRD_DECLENSION),
        new Word("σαρκί", "flesh - root σάρκ", FEMININE, DATIVE, SINGULAR, THIRD_DECLENSION),
        new Word("σάρκα", "flesh - root σάρκ", FEMININE, ACCUSATIVE, SINGULAR, THIRD_DECLENSION),
        new Word("σάρκες")
            .addForm("fleshes - root σάρκ", FEMININE, NOMINATIVE, PLURAL, THIRD_DECLENSION)
            .addForm("fleshes - root σάρκ", FEMININE, VOCATIVE, PLURAL, THIRD_DECLENSION),
        new Word("σαρκῶν", "fleshes - root σάρκ", FEMININE, GENITIVE, PLURAL, THIRD_DECLENSION),
        new Word("σαρξί", "fleshes - root σάρκ", FEMININE, DATIVE, PLURAL, THIRD_DECLENSION),
        new Word("σαρξίν", "fleshes - root σάρκ", FEMININE, DATIVE, PLURAL, THIRD_DECLENSION),
        new Word("σάρκας", "fleshes - root σάρκ", FEMININE, ACCUSATIVE, PLURAL, THIRD_DECLENSION)
    );
  }
}
