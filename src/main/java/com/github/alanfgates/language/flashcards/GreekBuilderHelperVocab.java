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
import static com.github.alanfgates.language.flashcards.PartOfSpeech.*;
import static com.github.alanfgates.language.flashcards.Person.*;
import static com.github.alanfgates.language.flashcards.Tense.*;
import static com.github.alanfgates.language.flashcards.Voice.*;
import static com.github.alanfgates.language.flashcards.Word.Competence.*;

class GreekBuilderHelperVocab {
  static List<Word> getVocab() {
    return Arrays.asList(
        new Word(new WordForm("ὁ", "the", MASCULINE, NOMINATIVE, SINGULAR), STRONG)
            .addForm(new WordForm("τοῦ", "the", MASCULINE, GENITIVE, SINGULAR))
            .addForm(new WordForm("τῷ", "the", MASCULINE, DATIVE, SINGULAR))
            .addForm(new WordForm("τόν", "the", MASCULINE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("ὁι", "the", MASCULINE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("τῶν", "the", MASCULINE, GENITIVE, PLURAL))
            .addForm(new WordForm("τοῖς", "the", MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("τούς", "the", MASCULINE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("ἡ", "the", FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("τῆς", "the", FEMININE, GENITIVE, SINGULAR))
            .addForm(new WordForm("τῇ", "the", FEMININE, DATIVE, SINGULAR))
            .addForm(new WordForm("τήν", "the", FEMININE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("ἁι", "the", FEMININE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("τῶν", "the", FEMININE, GENITIVE, PLURAL))
            .addForm(new WordForm("ταῖς", "the", FEMININE, DATIVE, PLURAL))
            .addForm(new WordForm("τάς", "the", FEMININE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("τό", "the", NEUTER, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("τοῦ", "the", NEUTER, GENITIVE, SINGULAR))
            .addForm(new WordForm("τῷ", "the", NEUTER, DATIVE, SINGULAR))
            .addForm(new WordForm("τό", "the", NEUTER, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("τά", "the", NEUTER, NOMINATIVE, PLURAL))
            .addForm(new WordForm("τῶν", "the", NEUTER, GENITIVE, PLURAL))
            .addForm(new WordForm("τοῖς", "the", NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("τά", "the", NEUTER, ACCUSATIVE, PLURAL)),
        // 9164
        new Word(new WordForm("καί", "and"), STRONG),
        // 5601
        new Word(new WordForm("αὐτός", "he"), STRONG)
            .addForm(new WordForm("αὐτή", "she"))
            .addForm(new WordForm("αὐτό", "it")),
        // 2913
        new Word(new WordForm("συ", "you", NOMINATIVE, SINGULAR), OK)
            .addForm(new WordForm("σου", "your", GENITIVE, SINGULAR))
            .addForm(new WordForm("σοι", "you", DATIVE, SINGULAR))
            .addForm(new WordForm("σε", "you", ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("ὑμεις", "you", NOMINATIVE, PLURAL))
            .addForm(new WordForm("ὑμων", "your", GENITIVE, PLURAL))
            .addForm(new WordForm("ὑμιν", "you", DATIVE, PLURAL))
            .addForm(new WordForm("ὑμας", "you", ACCUSATIVE, PLURAL)),
        // 2801
        new Word(new WordForm("δε", "weak but/yet, and"), STRONG),
        // 2757
        new Word(new WordForm("ἐν", "in", DATIVE), STRONG),
        // 2666
        new Word(new WordForm("ἐγώ", "I", NOMINATIVE, SINGULAR), OK)
            .addForm(new WordForm("μου", "my", GENITIVE, SINGULAR))
            .addForm(new WordForm("ἐμου", "my", GENITIVE, SINGULAR, EMPHATIC))
            .addForm(new WordForm("μοι", "me", DATIVE, SINGULAR))
            .addForm(new WordForm("ἐμοι", "me", DATIVE, SINGULAR, EMPHATIC))
            .addForm(new WordForm("με", "me", ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("ἐμε", "me", ACCUSATIVE, SINGULAR, EMPHATIC))
            .addForm(new WordForm("ἡμεις", "we", NOMINATIVE, PLURAL))
            .addForm(new WordForm("ἡμων", "our", GENITIVE, PLURAL))
            .addForm(new WordForm("ἡμιν", "us", DATIVE, PLURAL))
            .addForm(new WordForm("ἡμας", "us", ACCUSATIVE, PLURAL)),
        // 2656
        new Word(new WordForm("οὐ", "not", INDICATIVE), STRONG)
            .addForm(new WordForm("οὐκ", "not", INDICATIVE))
            .addForm(new WordForm("οὐχ", "not", INDICATIVE)),
        new Word(new WordForm("μη", "not", IMPERATIVE, OPTATIVE, SUBJUNCTIVE, PARTICIPLE), STRONG),
        // 2462
        new Word(new WordForm("εἰμί", "I am", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR), OK)
            .addForm(new WordForm("εἶ", "you are", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("ἐστίν", "s/he is", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἐσμέν", "we are", INDICATIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἐστέ", "you are", INDICATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("εἰσίν", "they are", INDICATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL)),
        new Word(new WordForm("εσομαι", "I will be εἰμί", INDICATIVE, ACTIVE, FUTURE, FIRST_PERSON, SINGULAR), OK)
            .addForm(new WordForm("ἔσῃ", "You will be εἰμί", INDICATIVE, ACTIVE, FUTURE, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("ἔσται", "S/He will be εἰμί", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἐσόμεθα", "We will be εἰμί", INDICATIVE, ACTIVE, FUTURE, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἔσεσθε", "You will be εἰμί", INDICATIVE, ACTIVE, FUTURE, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("ἔσονται", "They will be εἰμί", INDICATIVE, ACTIVE, FUTURE, THIRD_PERSON, PLURAL)),
        new Word(new WordForm("ἤμην", "I was", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, SINGULAR), OK)
            .addForm(new WordForm("ἦς", "you were", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("ἦν", "s/he was", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἦμεν", "We were", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἤμεθα", "We were", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἦτε", "you were", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("ἦσαν", "They were", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL)),

        new Word(new WordForm("ὤν", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR), OK)
            .addForm(new WordForm("ὄντος", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, GENITIVE, SINGULAR))
            .addForm(new WordForm("ὄντι", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, SINGULAR))
            .addForm(new WordForm("ὄντα", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("ὄντες", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("ὄντων", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, GENITIVE, PLURAL))
            .addForm(new WordForm("οὖσι", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("οὖσιν", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("ὄντας", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, ACCUSATIVE, PLURAL))

            .addForm(new WordForm("οὖσα", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("οὔσης", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, GENITIVE, SINGULAR))
            .addForm(new WordForm("οὔσῃ", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, DATIVE, SINGULAR))
            .addForm(new WordForm("οὖσαν", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("οὖσαι", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("οὐσῶν", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, GENITIVE, PLURAL))
            .addForm(new WordForm("οὔσαις", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, DATIVE, PLURAL))
            .addForm(new WordForm("οὔσας", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, ACCUSATIVE, PLURAL))

            .addForm(new WordForm("ὄν", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("ὄντος", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, GENITIVE, SINGULAR))
            .addForm(new WordForm("ὄντι", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, SINGULAR))
            .addForm(new WordForm("ὄν", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("ὄντα", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, PLURAL))
            .addForm(new WordForm("ὄντων", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, GENITIVE, PLURAL))
            .addForm(new WordForm("οὖσι", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("οὖσιν", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("ὄντα", "being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, ACCUSATIVE, PLURAL)),

        new Word(new WordForm("ὦ", "I might be", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR), WEAK)
            .addForm(new WordForm("ἦς", "you might be", SUBJUNCTIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR))
            .addForm(new WordForm("ᾖ", "s/he might be", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ὦμεν", "we might be", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("ἦτε", "you might be", SUBJUNCTIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("ὦσι", "they might be", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL))
            .addForm(new WordForm("ὦσιν", "they might be", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL)),

        new Word(new WordForm("εἶναι", "to be", INFINITIVE, ACTIVE, PRESENT), WEAK),

        new Word(new WordForm("ἴσθι", "be!", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR), WEAK)
            .addForm(new WordForm("ἔστω", "let him/her be!", IMPERATIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR))
            .addForm(new WordForm("ἔστε", "be!", IMPERATIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("ἔστωσαν", "let them be!", IMPERATIVE, ACTIVE, PRESENT, THIRD_PERSON, PLURAL)),

        // 2357
        new Word(new WordForm("*λεγ", "to say", ROOT), STRONG),
        new Word(new WordForm("*ιπ", "to say ", ROOT, SECOND_AORIST), STRONG),
        new Word(new WordForm("*ερ", "to say ", ROOT, FUTURE, PERFECT, PASSIVE, AORIST), STRONG)
            .addForm(new WordForm("λέγω", "I say ", PRESENT))
            .addForm(new WordForm("ἐρῶ", "I will say ", FUTURE))
            .addForm(new WordForm("εἶπον", "I said ", SECOND_AORIST))
            .addForm(new WordForm("εἴρηκα", "I have said ", PERFECT))
            .addForm(new WordForm("εἴρημαι", "I have been said ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐρρέθην", "I was said ", PASSIVE, AORIST)),
        // 1768
        new Word(new WordForm("εἰς", "into ", ACCUSATIVE), STRONG),
        // 1391
        new Word(new WordForm("οὗτος", "this", MASCULINE), STRONG)
            .addForm(new WordForm("αὕτη", "this", FEMININE))
            .addForm(new WordForm("τοῦτο", "this", NEUTER)),
        // 1365
        new Word(new WordForm("ὁς", "who, which", MASCULINE, NOMINATIVE, SINGULAR), STRONG)
            .addForm(new WordForm("ὁυ", "who, which", MASCULINE, GENITIVE, SINGULAR))
            .addForm(new WordForm("ᾡ", "who, which", MASCULINE, DATIVE, SINGULAR))
            .addForm(new WordForm("ὁν", "who, which", MASCULINE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("ἥ", "who, which", FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("ἡς", "who, which", FEMININE, GENITIVE, SINGULAR))
            .addForm(new WordForm("ᾑ", "who, which", FEMININE, DATIVE, SINGULAR))
            .addForm(new WordForm("ἡν", "who, which", FEMININE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("ὅ", "who, which", NEUTER, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("ὁυ", "who, which", NEUTER, GENITIVE, SINGULAR))
            .addForm(new WordForm("ᾡ", "who, which", NEUTER, DATIVE, SINGULAR))
            .addForm(new WordForm("ὅ", "who, which", NEUTER, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("ὅι", "who, which", MASCULINE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("ὡν", "who, which", MASCULINE, GENITIVE, PLURAL))
            .addForm(new WordForm("ὁις", "who, which", MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("ὁυς", "who, which", MASCULINE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("ἅι", "who, which", FEMININE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("ὡν", "who, which", FEMININE, GENITIVE, PLURAL))
            .addForm(new WordForm("ἁις", "who, which", FEMININE, DATIVE, PLURAL))
            .addForm(new WordForm("ἁς", "who, which", FEMININE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("ἁ", "who, which", NEUTER, NOMINATIVE, PLURAL))
            .addForm(new WordForm("ὡν", "who, which", NEUTER, GENITIVE, PLURAL))
            .addForm(new WordForm("ὁις", "who, which", NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("ἁ", "who, which", NEUTER, ACCUSATIVE, PLURAL)),
        // 1318
        new Word(new WordForm("Θεός", "God", MASCULINE), STRONG)
            .addForm(new WordForm("Θεοῦ", "God", MASCULINE, GENITIVE)),
        // 1297
        new Word(new WordForm("ὅτι", "that, because"), STRONG),
        // 1283
        new Word(new WordForm("πᾶς", "all every each", MASCULINE), STRONG)
            .addForm(new WordForm("πᾶσα", "all every each", FEMININE))
            .addForm(new WordForm("πᾶν", "all every each", NEUTER)),
        // 1042
        new Word(new WordForm("γάρ", "for, because"), STRONG),
        // 916
        new Word(new WordForm("ἐκ", "out of, from", GENITIVE), STRONG)
            .addForm(new WordForm("ἐξ", "out of, from", GENITIVE)),
        // 891
        new Word(new WordForm("ἐπί", "onto", ACCUSATIVE), STRONG)
            .addForm(new WordForm("ἐπί", "over", GENITIVE))
            .addForm(new WordForm("ἐπί", "at", DATIVE)),
        // 719
        new Word(new WordForm("κύριος", "lord", MASCULINE), STRONG)
            .addForm(new WordForm("κύριου", "lord", MASCULINE, GENITIVE)),
        // 708
        new Word(new WordForm("*σεχ",	"to have", ROOT), OK)
            .addForm(new WordForm("ἔχω",	"I have ", PRESENT))
            .addForm(new WordForm("ἕξω",	"I will have ", FUTURE))
            .addForm(new WordForm("ἔσχον", "I had ", SECOND_AORIST))
            .addForm(new WordForm("ἔσχηκα", "I have had ", PERFECT)),
        // 699
        new Word(new WordForm("πρός", "to, towards", ACCUSATIVE), WEAK),
        // 669
        new Word(new WordForm("*γεν",	"to become, to be", ROOT), OK)
            .addForm(new WordForm("γίνομαι",	"I become, I am ", PRESENT, DEPONENT))
            .addForm(new WordForm("γενήσομαι", "I will become ", FUTURE, DEPONENT))
            .addForm(new WordForm("ἐγένομην", "I became ", AORIST, DEPONENT))
            .addForm(new WordForm("γέγονα", "I have become ", SECOND_PERFECT))
            .addForm(new WordForm("γεγένημαι", "I have been made, caused to happen ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐγενήθην", "I happened, became ", PASSIVE, AORIST)),
        // 668
        new Word(new WordForm("διά", "on account of", ACCUSATIVE), OK)
            .addForm(new WordForm("διά", "through", GENITIVE)),
        // 663
        new Word(new WordForm("ἵνα", "in order that"), OK),
        // 646
        new Word(new WordForm("ἀπό", "from", GENITIVE), STRONG),
        // 638
        new Word(new WordForm("ἀλλά", "but (strong)"), STRONG),
        // 634
        new Word(new WordForm("*ερχ", "To come, to go", ROOT, PRESENT), OK)
            .addForm(new WordForm("*ελευθ", "to come/go ", ROOT, FUTURE, AORIST, PERFECT))
            .addForm(new WordForm("ἔρχομαι", "I come, I go ", PRESENT, DEPONENT))
            .addForm(new WordForm("ἐλεύσομαι", "I will come/go ", FUTURE, DEPONENT))
            .addForm(new WordForm("ἦλθον", "I came/went", SECOND_AORIST))
            .addForm(new WordForm("ἐλήλυθα", "I have come/gone ", SECOND_PERFECT)),
        // 579
        new Word(new WordForm("τίς", "who? what?", MASCULINE, NOMINATIVE, SINGULAR), STRONG)
            .addForm(new WordForm("τίνος", "who? what?", MASCULINE, GENITIVE, SINGULAR))
            .addForm(new WordForm("τίνι", "who? what?", MASCULINE, DATIVE, SINGULAR))
            .addForm(new WordForm("τίνα", "who? what?", MASCULINE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("τίς", "who? what?", FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("τίνος", "who? what?", FEMININE, GENITIVE, SINGULAR))
            .addForm(new WordForm("τίνι", "who? what?", FEMININE, DATIVE, SINGULAR))
            .addForm(new WordForm("τίνα", "who? what?", FEMININE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("τί", "who? what?", NEUTER, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("τίνος", "who? what?", NEUTER, GENITIVE, SINGULAR))
            .addForm(new WordForm("τίνι", "who? what?", NEUTER, DATIVE, SINGULAR))
            .addForm(new WordForm("τί", "who? what?", NEUTER, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("τίνες", "who? what?", MASCULINE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("τίνων", "who? what?", MASCULINE, GENITIVE, PLURAL))
            .addForm(new WordForm("τίσι", "who? what?", MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("τίνας", "who? what?", MASCULINE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("τίνες", "who? what?", FEMININE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("τίνων", "who? what?", FEMININE, GENITIVE, PLURAL))
            .addForm(new WordForm("τίσι", "who? what?", FEMININE, DATIVE, PLURAL))
            .addForm(new WordForm("τίνας", "who? what?", FEMININE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("τίνα", "who? what?", NEUTER, NOMINATIVE, PLURAL))
            .addForm(new WordForm("τίνων", "who? what?", NEUTER, GENITIVE, PLURAL))
            .addForm(new WordForm("τίσι", "who? what?", NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("τίνα", "who? what?", NEUTER, ACCUSATIVE, PLURAL)),
        // 572
        new Word(new WordForm("*ποιε", "to do, to make", ROOT), STRONG)
            .addForm(new WordForm("ποιω", "I do, I make ", PRESENT))
            .addForm(new WordForm("ποιήσω", "I will make/do ", FUTURE))
            .addForm(new WordForm("ἐποίησα", "I did/made ", AORIST))
            .addForm(new WordForm("πεποίηκα", "I have done/made ", PERFECT))
            .addForm(new WordForm("πεποίημαι", "I have been done/made ", MIDDLE, PASSIVE, PERFECT)),
        // 550
        new Word(new WordForm("ἄνθρωπος", "human being", MASCULINE), STRONG)
            .addForm(new WordForm("ἄνθρωποῦ", "human being", MASCULINE, GENITIVE)),
        // 538
        new Word(new WordForm("τις", "someone something", MASCULINE, NOMINATIVE, SINGULAR), STRONG)
            .addForm(new WordForm("τινος", "someone something", MASCULINE, GENITIVE, SINGULAR))
            .addForm(new WordForm("τινα", "someone something", MASCULINE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("τινι", "someone something", MASCULINE, DATIVE, SINGULAR))
            .addForm(new WordForm("τις", "someone something", FEMININE, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("τινος", "someone something", FEMININE, GENITIVE, SINGULAR))
            .addForm(new WordForm("τινι", "someone something", FEMININE, DATIVE, SINGULAR))
            .addForm(new WordForm("τινα", "someone something", FEMININE, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("τι", "someone something", NEUTER, NOMINATIVE, SINGULAR))
            .addForm(new WordForm("τινος", "someone something", NEUTER, GENITIVE, SINGULAR))
            .addForm(new WordForm("τινι", "someone something", NEUTER, DATIVE, SINGULAR))
            .addForm(new WordForm("τι", "someone something", NEUTER, ACCUSATIVE, SINGULAR))
            .addForm(new WordForm("τινες", "someone something", MASCULINE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("τινων", "someone something", MASCULINE, GENITIVE, PLURAL))
            .addForm(new WordForm("τισι", "someone something", MASCULINE, DATIVE, PLURAL))
            .addForm(new WordForm("τινας", "someone something", MASCULINE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("τινες", "someone something", FEMININE, NOMINATIVE, PLURAL))
            .addForm(new WordForm("τινων", "someone something", FEMININE, GENITIVE, PLURAL))
            .addForm(new WordForm("τισι", "someone something", FEMININE, DATIVE, PLURAL))
            .addForm(new WordForm("τινας", "someone something", FEMININE, ACCUSATIVE, PLURAL))
            .addForm(new WordForm("τινα", "someone something", NEUTER, NOMINATIVE, PLURAL))
            .addForm(new WordForm("τινων", "someone something", NEUTER, GENITIVE, PLURAL))
            .addForm(new WordForm("τισι", "someone something", NEUTER, DATIVE, PLURAL))
            .addForm(new WordForm("τινα", "someone something", NEUTER, ACCUSATIVE, PLURAL)),
        // 531
        new Word(new WordForm("Χριστός", "Christ", MASCULINE), STRONG)
            .addForm(new WordForm("Χριστοῦ", "Christ", MASCULINE, GENITIVE)),
        // 504
        new Word(new WordForm("ὡς", "as, like, when, that, how, approximately"), OK),
        // 502
        new Word(new WordForm("εἰ", "if"), STRONG),
        // 499
        new Word(new WordForm("οὖν", "therefore"), STRONG),
        // 476
        new Word(new WordForm("κατά", "according to", ACCUSATIVE), OK)
            .addForm(new WordForm("κατά", "down from", GENITIVE)),
        // 473
        new Word(new WordForm("μετά", "after", ACCUSATIVE), OK)
            .addForm(new WordForm("μετά", "with", GENITIVE)),
        // 455
        new Word(new WordForm("*ορα",	"to see ", ROOT), OK)
            .addForm(new WordForm("ὁρω",	"I see ", PRESENT))
            .addForm(new WordForm("ἑώρακα",	"I have seen ", PERFECT)),
        new Word(new WordForm("*οπ",	"to see ", ROOT), WEAK)
            .addForm(new WordForm("ὄψομαι",	"I will see ", FUTURE, DEPONENT))
            .addForm(new WordForm("ὤφθην",	"I was seen ", PASSIVE, AORIST)),
        new Word(new WordForm("*ιδ",	"to see ", ROOT), WEAK)
            .addForm(new WordForm("εἶδον",	"I saw ", SECOND_AORIST)),
        // 428
        new Word(new WordForm("*ακου", "to hear ", ROOT), STRONG)
            .addForm(new WordForm("ἀκούω", "I hear ", PRESENT))
            .addForm(new WordForm("ἀκούσω", "I will hear ", FUTURE))
            .addForm(new WordForm("ἤκουσα", "I heard ", AORIST))
            .addForm(new WordForm("ἀκήκοα", "I have heard ", SECOND_PERFECT))
            .addForm(new WordForm("ἠκούσθην", "I was heard ", PASSIVE, AORIST)),
        // 418
        new Word(new WordForm("πολύς", "many, much", MASCULINE), STRONG)
            .addForm(new WordForm("πολλή", "many, much", FEMININE))
            .addForm(new WordForm("πολύ", "many, much", NEUTER)),
        // 417
        new Word(new WordForm("*δο", "to give ", ROOT), OK)
            .addForm(new WordForm("δίδωμι", "I give ", PRESENT))
            .addForm(new WordForm("δώσω", "I will give ", FUTURE))
            .addForm(new WordForm("ἔδωκα", "I gave ", AORIST))
            .addForm(new WordForm("δέδωκα", "I have given ", PERFECT))
            .addForm(new WordForm("δέδομαι", "I have been given ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐδόθην", "I was given ", PASSIVE, AORIST)),
        // 414
        new Word(new WordForm("πατήρ", "father", MASCULINE), STRONG)
            .addForm(new WordForm("πατρός", "father", MASCULINE, GENITIVE)),
        // 389
        new Word(new WordForm("ἡμέρα", "day", FEMININE), STRONG)
            .addForm(new WordForm("ἡμέρας", "day", FEMININE, GENITIVE)),
        // 379
        new Word(new WordForm("πνεῦμα", "spirit, wind, breath", NEUTER), STRONG)
            .addForm(new WordForm("πνεύματος", "spirit, wind, breath", NEUTER, GENITIVE)),
        // 377
        new Word(new WordForm("υἱός", "son", MASCULINE), STRONG)
            .addForm(new WordForm("υἱοῦ", "son", MASCULINE, GENITIVE)),
        // 353
        new Word(new WordForm("εἷς", "one", MASCULINE), OK)
            .addForm(new WordForm("μία", "one", FEMININE))
            .addForm(new WordForm("ἕν", "one", NEUTER)),
        // 343
        new Word(new WordForm("ἀδελφός", "brother", MASCULINE), STRONG)
            .addForm(new WordForm("ἀδελφοῦ", "brother", MASCULINE, GENITIVE)),
        new Word(new WordForm("ἤ", "or"), STRONG),
        // 333
        new Word(new WordForm("ἐάν", "if"), OK),
        new Word(new WordForm("περί", "around", ACCUSATIVE), WEAK)
            .addForm(new WordForm("περί", "concerning, about", GENITIVE)),
        // 324
        new Word(new WordForm("οἶδα", "I know", PRESENT), OK),
        // 319
        new Word(new WordForm("ἑαυτοῦ", "himself", MASCULINE, GENITIVE), OK)
            .addForm(new WordForm("ἑαυτῆς", "herself", FEMININE, GENITIVE))
            .addForm(new WordForm("ἑαυτοῦ", "itself", NEUTER, GENITIVE)),
        // 296
        new Word(new WordForm("*λαλε", "to speak ", ROOT), STRONG)
            .addForm(new WordForm("λαλω", "I speak ", PRESENT))
            .addForm(new WordForm("λαλήσω", "I will speak ", FUTURE))
            .addForm(new WordForm("ἐλάλησα", "I spoke ", AORIST))
            .addForm(new WordForm("λελάληκα", "I have spoken ", PERFECT))
            .addForm(new WordForm("λελάλημαι", "I have been spoken ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐλαλήθην", "I was spoken ", PASSIVE, AORIST)),
        // 273
        new Word(new WordForm("οὐρανός", "heaven", MASCULINE), STRONG)
            .addForm(new WordForm("οὐρανοῦ", "heaven", MASCULINE, GENITIVE)),
        // 261
        new Word(new WordForm("μαθητής", "student, disciple", MASCULINE), STRONG)
            .addForm(new WordForm("μαθητοῦ", "student, disciple", MASCULINE, GENITIVE)),
        // 258
        new Word(new WordForm("*λαβ", "to take, to receive ", ROOT), WEAK)
            .addForm(new WordForm("λαμβάνω", "I take, I receive ", PRESENT))
            .addForm(new WordForm("λήμψομαι", "I will take/receive ", FUTURE, DEPONENT))
            .addForm(new WordForm("ἔλαβον", "I took/received ", SECOND_AORIST))
            .addForm(new WordForm("εἴληφα", "I have taken/received ", SECOND_PERFECT))
            .addForm(new WordForm("εἴλημμαι", "I have been taken/received ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐλήμφθην", "I was taken/received ", PASSIVE, AORIST)),
        // 250
        new Word(new WordForm("γῆ", "land, earth", FEMININE), STRONG)
            .addForm(new WordForm("γῆς", "land, earth", FEMININE, GENITIVE)),
        // 249
        new Word(new WordForm("*πιστευ", "to believe ", ROOT), STRONG)
            .addForm(new WordForm("πιστεύω", "I believe ", PRESENT))
            .addForm(new WordForm("πιστεύσω", "I will believe ", FUTURE))
            .addForm(new WordForm("ἐπίστευσα", "I believed ", AORIST))
            .addForm(new WordForm("πεπίστευκα", "I have believed ", PERFECT))
            .addForm(new WordForm("πεπίστευμαι", "I have been believed ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐπιστεύθην", "I was believed ", PASSIVE, AORIST)),
        // 245
        new Word(new WordForm("μέγας", "large, great", MASCULINE), STRONG)
            .addForm(new WordForm("μεγάλη", "large, great", FEMININE))
            .addForm(new WordForm("μέγα", "large, great", NEUTER)),
        // 243
        new Word(new WordForm("πίστις", "faith, trust", FEMININE), STRONG)
            .addForm(new WordForm("πίστεως", "faith, trust", FEMININE, GENITIVE)),
        // 242
        new Word(new WordForm("*γνω", "to know ", ROOT), OK)
            .addForm(new WordForm("γινώσκω", "I know ", PRESENT))
            .addForm(new WordForm("γνώσομαι", "I will know ", FUTURE, DEPONENT))
            .addForm(new WordForm("ἔγνων", "I knew ", SECOND_AORIST))
            .addForm(new WordForm("ἔγνωσκα", "I have known ", PERFECT))
            .addForm(new WordForm("ἔγνωσμαι", "I have been known ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐγνώσθην", "I was known ", PASSIVE, AORIST)),
        // 234
        new Word(new WordForm("ὄνομα", "name", MASCULINE), OK)
            .addForm(new WordForm("ὄνοματος", "name", MASCULINE, GENITIVE)),
        // 233
        new Word(new WordForm("ἅγιος", "holy", ADJECTIVE, MASCULINE), STRONG)
            .addForm(new WordForm("ἅγια", "holy", ADJECTIVE, FEMININE))
            .addForm(new WordForm("ἅγιον", "holy", ADJECTIVE, NEUTER)),
        // 231
        new Word(new WordForm("*αποκριν", "to answer ", ROOT), WEAK)
            .addForm(new WordForm("ἀποκρίνομαι", "I answer ", PRESENT, DEPONENT))
            .addForm(new WordForm("ἀπεκρινἀμην", "I answered ", AORIST, DEPONENT))
            .addForm(new WordForm("ἀπεκρίθην", "I was answered ", PASSIVE, AORIST)),
        // 220
        new Word(new WordForm("ὑπό", "under", ACCUSATIVE), WEAK)
            .addForm(new WordForm("ὑπό", "by", GENITIVE)),
        // 218
        new Word(new WordForm("ἐξέρχομαι", "I go out"), OK)
            .addForm(new WordForm("ἐξελεὐσομαι", "I will go out εξερχομαι", FUTURE))
            .addForm(new WordForm("ἐξῆλθον", "I went out εξερχομαι", AORIST))
            .addForm(new WordForm("ἐξελήλυθα", "I have gone out εξερχομαι", PERFECT)),
        // 216
        new Word(new WordForm("ἀνήρ", "man", MASCULINE), STRONG)
            .addForm(new WordForm("ἀνδρός", "man", MASCULINE, GENITIVE)),
        // 215
        new Word(new WordForm("γυνή", "woman", FEMININE), STRONG)
            .addForm(new WordForm("γυναικός", "woman", FEMININE, GENITIVE)),
        new Word(new WordForm("τέ", "and, so"), OK),
        // 210
        new Word(new WordForm("*δυν", "to be able ", ROOT), OK)
            .addForm(new WordForm("δύναμαι", "I am able ", PRESENT, DEPONENT))
            .addForm(new WordForm("δυνήσομαι", "I will be able ", FUTURE, DEPONENT))
            .addForm(new WordForm("ἠδυνήθην",	"I was able ", PASSIVE, AORIST, DEPONENT)),
        // 208
        new Word(new WordForm("*εθελε", "to want ", ROOT), OK)
            .addForm(new WordForm("θέλω", "I want ", PRESENT))
            .addForm(new WordForm("ἠθέλησα", "I wanted ", AORIST)),
        new Word(new WordForm("ὅυτω", "thus"), WEAK)
            .addForm(new WordForm("ὅυτως", "thus")),
        // 195
        new Word(new WordForm("Ἰοὐδαῖος", "jewish", ADJECTIVE, MASCULINE), STRONG)
            .addForm(new WordForm("Ἰοὐδαῖα", "jewish", ADJECTIVE, FEMININE))
            .addForm(new WordForm("Ἰοὐδαῖον", "jewish", ADJECTIVE, NEUTER)),
        // 194
        new Word(new WordForm("παρά", "alongside of", ACCUSATIVE), WEAK)
            .addForm(new WordForm("παρά", "from", GENITIVE))
            .addForm(new WordForm("παρά", "in the presence of", DATIVE)),
        new Word(new WordForm("εισερχομαι", "I enter", PRESENT), OK)
            .addForm(new WordForm("εἰσελεύσομαι", "I will enter εισερχομαι", FUTURE))
            .addForm(new WordForm("εἰσῆλθον", "I entered εισερχομαι", AORIST))
            .addForm(new WordForm("εἰσελήλυθα", "I have entered εισερχομαι", PERFECT)),
        // 191
        new Word(new WordForm("*γραφ", "to write "), STRONG)
            .addForm(new WordForm("γραφω", "I write ", PRESENT))
            .addForm(new WordForm("γράψω", "I will write ", FUTURE))
            .addForm(new WordForm("ἔγραψα", "I wrote ", AORIST))
            .addForm(new WordForm("γέγραφα", "I have written ", SECOND_PERFECT))
            .addForm(new WordForm("γέγραμμαι", "I have been written ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐγράφην", "I was written ", PASSIVE, AORIST)),
        // 186
        new Word(new WordForm("κόσμος", "world", MASCULINE), STRONG)
            .addForm(new WordForm("κόσμου", "world", MASCULINE, GENITIVE)),
        // 182
        new Word(new WordForm("καθώς", "just as"), STRONG),
        // 179
        new Word(new WordForm("μέν", "indeed, on the one hand"), STRONG),
        // 177
        new Word(new WordForm("χείρ", "hand", FEMININE), STRONG)
            .addForm(new WordForm("χειρός", "hand", FEMININE, GENITIVE)),
        // 176
        new Word(new WordForm("*ευρ", "to find ", ROOT), OK)
            .addForm(new WordForm("ἑυρίσκω", "I find ", PRESENT))
            .addForm(new WordForm("εὑρήσω", "I will find ", FUTURE))
            .addForm(new WordForm("εὗρον", "I found ", SECOND_AORIST))
            .addForm(new WordForm("εὕρηκα", "I have found ", PERFECT))
            .addForm(new WordForm("εὑρέθην", "I was found ", PASSIVE, AORIST)),
        // 175
        new Word(new WordForm("ἄγγελος", "messenger, angel", MASCULINE), STRONG)
            .addForm(new WordForm("ἄγγελου", "messenger, angel", MASCULINE, GENITIVE)),
        new Word(new WordForm("ὄχλος", "crowd", MASCULINE), STRONG)
            .addForm(new WordForm("ὄχλου", "crowd", MASCULINE, GENITIVE)),
        // 173
        new Word(new WordForm("ἁμαρτία", "sin", FEMININE), STRONG)
            .addForm(new WordForm("ἁμαρτίας", "sin", FEMININE, GENITIVE))
            .addForm(new WordForm("ἁμαρτωλός", "sinful or out of bounds behavior, as substantive sinner or outsider", ADJECTIVE, MASCULINE, FEMININE))
            .addForm(new WordForm("ἁμαρτωλόν", "sinful or out of bounds behavior, as substantive sinner or outsider", ADJECTIVE, NEUTER)),
        // 166
        new Word(new WordForm("δόξα", "glory", FEMININE), OK)
            .addForm(new WordForm("δόξης", "glory", FEMININE, GENITIVE)),
        new Word(new WordForm("ἄν", "if, would, might"), WEAK),
        // 163
        new Word(new WordForm("πόλις", "city", FEMININE), STRONG)
            .addForm(new WordForm("πόλεως", "city", FEMININE, GENITIVE)),
        // 162
        new Word(new WordForm("βασιλεία", "kingdom", FEMININE), WEAK)
            .addForm(new WordForm("βασιλευς", "king", MASCULINE)) // 115
            .addForm(new WordForm("βασιλεως", "king", MASCULINE, GENITIVE))
            .addForm(new WordForm("βασιλείας", "kingdom", FEMININE, GENITIVE)),
        new Word(new WordForm("ἔθνος", "people", NEUTER), OK)
            .addForm(new WordForm("ἔθνους", "people", NEUTER, GENITIVE)),
        // 160
        new Word(new WordForm("τοτε", "then"), WEAK),
        new Word(new WordForm("ἕως", "until"), WEAK),
        // ?
        new Word(new WordForm("ὅστις", "whoever, everyone (ὅς + τις both parts decline)", ADJECTIVE, MASCULINE), WEAK)
            .addForm(new WordForm("ἥτις", "whoever, everyone (ἥ + τις both parts decline)", ADJECTIVE, FEMININE))
            .addForm(new WordForm("ὅτι", "whoever, everyone (ὅ + τις both parts decline)", ADJECTIVE, NEUTER)),
        // 159
        new Word(new WordForm("πρῶτος", "first", ADJECTIVE, MASCULINE), STRONG)
            .addForm(new WordForm("πρῶτη", "first", ADJECTIVE, FEMININE))
            .addForm(new WordForm("πρῶτον", "first", ADJECTIVE, NEUTER)),
        // 157
        new Word(new WordForm("καρδια", "heart", FEMININE), STRONG)
            .addForm(new WordForm("καρδιας", "heart", FEMININE, GENITIVE)),
        new Word(new WordForm("*εσθι", "to eat ", ROOT), OK)
            .addForm(new WordForm("ἐσθιω", "I eat ", PRESENT)),
        new Word(new WordForm("*φαγ", "to eat ", ROOT), WEAK)
            .addForm(new WordForm("φάγομαι", "I will eat ", FUTURE, DEPONENT))
            .addForm(new WordForm("ἔφαγον", "I ate ", SECOND_AORIST)),
        // 155
        new Word(new WordForm("*στα", "to stand ", ROOT), WEAK)
            .addForm(new WordForm("ἵστημι", "Transitive: I set, put, place Intransitive: I stand, I appear, I stop ", PRESENT))
            .addForm(new WordForm("στήσω", "I will stand ", FUTURE))
            .addForm(new WordForm("ἔστησα", "I put, set ", AORIST))
            .addForm(new WordForm("ἔστην", "I stood ", SECOND_AORIST))
            .addForm(new WordForm("ἕστηκα", "I have stood ", PERFECT))
            .addForm(new WordForm("ἐστάθην", "I was put ", PASSIVE, AORIST)),
        new Word(new WordForm("ἀλλος", "other", ADJECTIVE, MASCULINE), STRONG)
            .addForm(new WordForm("ἀλλη", "other", ADJECTIVE, FEMININE))
            .addForm(new WordForm("ἀλλο", "other", ADJECTIVE, NEUTER)),
        new Word(new WordForm("χαρις", "grace", FEMININE), STRONG)
            .addForm(new WordForm("χαριτος", "grace", FEMININE, GENITIVE)),
        // 153
        new Word(new WordForm("*πορευ", "to go, to live ", ROOT), WEAK)
            .addForm(new WordForm("πορεύομαι", "I go, I live ", PRESENT, DEPONENT))
            .addForm(new WordForm("πορεύσομαι", "I will go, live ", FUTURE, DEPONENT))
            .addForm(new WordForm("πεπόρευμαι", "I have gone, lived ", MIDDLE, PASSIVE, PERFECT, DEPONENT))
            .addForm(new WordForm("ἐπορεὐθην", "I went, lived ", PASSIVE, AORIST, DEPONENT)),
        // 150
        new Word(new WordForm("ὑπερ", "above", ACCUSATIVE), OK)
            .addForm(new WordForm("ὑπερ", "in behalf of", GENITIVE)),
        // 148
        new Word(new WordForm("*καλεϝ", "to call ", ROOT), OK)
            .addForm(new WordForm("καλέω", "I call ", PRESENT))
            .addForm(new WordForm("καλἐσω", "I will call ", FUTURE))
            .addForm(new WordForm("ἐκάλεσα", "I called ", AORIST))
            .addForm(new WordForm("κέκληκα", "I have called ", PERFECT))
            .addForm(new WordForm("κέκλημαι", "I have been called ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐκλήθην", "I was called ", PASSIVE, AORIST)),
        // 147
        new Word(new WordForm("ἀγαπαω", "I love", PRESENT), STRONG)
            .addForm(new WordForm("ἀγαπήσω", "I will love ἀγαπαω", FUTURE))
            .addForm(new WordForm("ἠγάπησα", "I loved ἀγαπαω", AORIST))
            .addForm(new WordForm("ἠγάπηκα", "I have loved ἀγαπαω", PERFECT))
            .addForm(new WordForm("ἠγάπημαι", "I have been loved ἀγαπαω", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἠγαπἠθην", "I was loved ἀγαπαω", PASSIVE, AORIST)),
        new Word(new WordForm("νυν", "now"), STRONG),
        // 144
        new Word(new WordForm("προφητης", "prophet", MASCULINE), STRONG)
            .addForm(new WordForm("προφητου", "prophet", MASCULINE, GENITIVE)),
        new Word(new WordForm("*εγερ", "to raise ", ROOT), OK)
            .addForm(new WordForm("ἐγείρω", "I raise ", PRESENT))
            .addForm(new WordForm("ἐγερῶ", "I will raise ", FUTURE))
            .addForm(new WordForm("ἤγειρα", "I raised ", AORIST))
            .addForm(new WordForm("ἐγήγερμαι", "I have been raised ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἠγέρθην", "I was raised ", PASSIVE, AORIST)),
        // 143
        new Word(new WordForm("οὐδέ", "and not, neither"), OK),
        new Word(new WordForm("απο + *σε", "to let go, divorce, forgive ", ROOT), OK)
            .addForm(new WordForm("ἀφιημι", "I let go, divorce, forgive ", PRESENT))
            .addForm(new WordForm("ἀφήσω", "I will forgive ", FUTURE))
            .addForm(new WordForm("ἀφῆκα", "I forgave ", AORIST))
            .addForm(new WordForm("ἀφέωμαι", "I have been forgiven ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἀφέθην", "I was forgiven ", PASSIVE, AORIST)),
        // 142
        new Word(new WordForm("λαος", "people", MASCULINE), OK)
            .addForm(new WordForm("λαου", "people", MASCULINE, GENITIVE)),
        new Word(new WordForm("σωμα", "body", NEUTER), STRONG)
            .addForm(new WordForm("σωματος", "body", NEUTER, GENITIVE)),
        // 141
        new Word(new WordForm("παλιν", "again"), STRONG),
        // 140
        new Word(new WordForm("*ζα", "to live ", ROOT), OK)
            .addForm(new WordForm("ζάω", "I live ", PRESENT))
            .addForm(new WordForm("ζἠσω", "I will live ", FUTURE))
            .addForm(new WordForm("ἔζεσα", "I lived ", AORIST)),
        // 139
        new Word(new WordForm("φωνή", "sound, voice", FEMININE), STRONG)
            .addForm(new WordForm("φωνῆς", "sound, voice", FEMININE, GENITIVE)),
        new Word(new WordForm("ζωή", "life", FEMININE), STRONG)
            .addForm(new WordForm("ζωῆς", "life", FEMININE, GENITIVE)),
        // 135
        new Word(new WordForm("δύο", "two"), OK),
        // 133
        new Word(new WordForm("*βλεπ", "to see ", ROOT), STRONG)
            .addForm(new WordForm("βλέπω", "I see ", PRESENT))
            .addForm(new WordForm("βλέψω", "I will see ", FUTURE))
            .addForm(new WordForm("ἐβλέψα", "I saw ", AORIST)),
        // 132
        new Word(new WordForm("απο + *στελ", "to send ", ROOT), OK)
            .addForm(new WordForm("ἀποστέλλω", "I send ", PRESENT))
            .addForm(new WordForm("ἀποστελῶ", "I will send ", FUTURE))
            .addForm(new WordForm("άπέστειλα", "I sent ", AORIST))
            .addForm(new WordForm("ἀπέσταλκα", "I have sent ", PERFECT))
            .addForm(new WordForm("ἀπέσταλμαι", "I have been sent ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἀπεστάλην", "I was sent ", PASSIVE, SECOND_AORIST)),
        // 129
        new Word(new WordForm("ἀμήν", "truly"), STRONG),
        // 128
        new Word(new WordForm("νεκρός", "dead", ADJECTIVE, MASCULINE), STRONG)
            .addForm(new WordForm("νεκρά", "dead", ADJECTIVE, FEMININE))
            .addForm(new WordForm("νεκρόν", "dead", ADJECTIVE, NEUTER)),
        new Word(new WordForm("συν", "with", DATIVE), STRONG),
        // 124
        new Word(new WordForm("δοῦλος", "slave", MASCULINE), STRONG)
            .addForm(new WordForm("δοῦλου", "slave", MASCULINE, GENITIVE)),
        // 123
        new Word(new WordForm("ὅταν", "whenever"), WEAK),
        // 122
        new Word(new WordForm("αἰών", "age", NOUN, MASCULINE), OK)
            .addForm(new WordForm("αἰῶνος", "age", NOUN, MASCULINE, GENITIVE))
            .addForm(new WordForm("αἰώνος", "eternal", ADJECTIVE, MASCULINE, FEMININE))
            .addForm(new WordForm("αἰώνον", "eternal", ADJECTIVE, NEUTER)),
        new Word(new WordForm("ἀρχιερεύς", "high priest", MASCULINE), STRONG)
            .addForm(new WordForm("ἀρχιερέως", "high priest", MASCULINE, GENITIVE)),
        new Word(new WordForm("*βαλ", "to throw ", ROOT), STRONG)
            .addForm(new WordForm("βάλλω", "I throw ", PRESENT))
            .addForm(new WordForm("βαλῶ", "I will throw ", FUTURE))
            .addForm(new WordForm("ἔβαλον", "I threw ", SECOND_AORIST))
            .addForm(new WordForm("βέβληκα", "I have thrown ", PERFECT))
            .addForm(new WordForm("βέβλημαι", "I have been thrown ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐβλήθην", "I was thrown ", PASSIVE, AORIST)),
        // 120
        new Word(new WordForm("θάνατος", "death", MASCULINE), STRONG)
            .addForm(new WordForm("θάνατου", "death", MASCULINE, GENITIVE)),
        // 119
        new Word(new WordForm("δυναμις", "power, ability", FEMININE), OK)
            .addForm(new WordForm("δυναμεως", "power, ability", FEMININE, GENITIVE)),
        new Word(new WordForm("παραδιδωμι", "I hand over", PRESENT), OK)
            .addForm(new WordForm("παραδώσω", "I will hand over παραδιδωμι", FUTURE))
            .addForm(new WordForm("παρέδωκα", "I handed over παραδιδωμι", AORIST))
            .addForm(new WordForm("παραδέδωκα", "I have handed over παραδιδωμι", PERFECT))
            .addForm(new WordForm("παραδέδομαι", "I have been handed over παραδιδωμι", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("παρεδόθην", "I was handed over παραδιδωμι", PASSIVE, AORIST)),
        // 118
        new Word(new WordForm("*μεν", "to remain ", ROOT), OK)
            .addForm(new WordForm("μένω", "I remain ", PRESENT))
            .addForm(new WordForm("μενῶ", "I will remain ", FUTURE))
            .addForm(new WordForm("ἔμεινα", "I remained ", AORIST))
            .addForm(new WordForm("μεμένηκα", "I have remained ", PERFECT)),
        // 117
        new Word(new WordForm("ἀπέρχομαι", "I depart, I go away", PRESENT), WEAK)
            .addForm(new WordForm("ἀπελεύσομαι", "I will depart ἀπέρχομαι", FUTURE))
            .addForm(new WordForm("ἀπῆλθον", "I departed ἀπέρχομαι", AORIST))
            .addForm(new WordForm("ἀπελήλθυα", "I have departed ἀπέρχομαι", PERFECT)),
        new Word(new WordForm("*ζητε", "to seek ", ROOT), OK)
            .addForm(new WordForm("ζητῶ", "I seek ", PRESENT))
            .addForm(new WordForm("ζητήσω", "I will seek ", FUTURE))
            .addForm(new WordForm("ἐζήτησα", "I sought ", AORIST))
            .addForm(new WordForm("ἐζητήθην", "I was sought ", PASSIVE, AORIST)),
        // 116
        new Word(new WordForm("ἀγαπη", "love", FEMININE), STRONG)
            .addForm(new WordForm("ἀγαπης", "love", FEMININE, GENITIVE))
            .addForm(new WordForm("ἀγαπητός", "beloved", ADJECTIVE, MASCULINE))
            .addForm(new WordForm("ἀγαπητή", "beloved", ADJECTIVE, FEMININE))
            .addForm(new WordForm("ἀγαπητόν", "beloved", ADJECTIVE, NEUTER)),
        // 114
        new Word(new WordForm("ἐκκλησια", "assembly, church", FEMININE), STRONG)
            .addForm(new WordForm("ἐκκλησιας", "assembly, church", FEMININE, GENITIVE)),
        new Word(new WordForm("ὀικος", "house", MASCULINE), WEAK)
            .addForm(new WordForm("ὀικου", "house", MASCULINE, GENITIVE))
            .addForm(new WordForm("οἰκία", "house, family", FEMININE))
            .addForm(new WordForm("οἰκὶας", "house, family", FEMININE, GENITIVE)),
        new Word(new WordForm("ἴδιος", "one's own", ADJECTIVE, MASCULINE), OK)
            .addForm(new WordForm("ἰδία", "one's own", ADJECTIVE, FEMININE))
            .addForm(new WordForm("ἴδιον", "one's own", ADJECTIVE, NEUTER)),
        new Word(new WordForm("μόνος", "alone", ADJECTIVE, MASCULINE), STRONG)
            .addForm(new WordForm("μόνη", "alone", ADJECTIVE, FEMININE))
            .addForm(new WordForm("μόνον", "alone", ADJECTIVE, NEUTER)),
        new Word(new WordForm("*κριν", "to judge ", ROOT), WEAK)
            .addForm(new WordForm("κρίνω", "I judge ", PRESENT))
            .addForm(new WordForm("κρινῶ", "I will judge ", FUTURE))
            .addForm(new WordForm("ἔκρινα", "I judged ", AORIST))
            .addForm(new WordForm("κέκρικα", "I have judged ", PERFECT))
            .addForm(new WordForm("κέκριμαι", "I have been judged ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐκρίθην", "I was judged ", PASSIVE, AORIST)),
        // 111
        new Word(new WordForm("απο + *θαν", "to die ", ROOT), WEAK)
            .addForm(new WordForm("ἀποθνῃσκω", "I die ", PRESENT))
            .addForm(new WordForm("ἀποθανοῦμαι", "I will die ", FUTURE, DEPONENT))
            .addForm(new WordForm("άπέθανον", "I died ", SECOND_AORIST)),
        // 110
        new Word(new WordForm("ὁσος", "as/how much/great/far/long", ADJECTIVE, MASCULINE), WEAK)
            .addForm(new WordForm("ὁση", "as/how much/great/far/long", ADJECTIVE, FEMININE))
            .addForm(new WordForm("ὁσον", "as/how much/great/far/long", ADJECTIVE, NEUTER)),
        // 109
        new Word(new WordForm("ἀληθεια", "truth", FEMININE), OK)
            .addForm(new WordForm("ἀληθειας", "truth", FEMININE, GENITIVE)),
        new Word(new WordForm("*μελλε", "to be about to, to intend ", ROOT), OK)
            .addForm(new WordForm("μελλω", "I am about to, I intend ", PRESENT))
            .addForm(new WordForm("μελλήσω", "I will intend ", FUTURE)),
        new Word(new WordForm("ὁλος", "whole, entire", ADJECTIVE, MASCULINE), OK)
            .addForm(new WordForm("ὁλη", "whole, entire", ADJECTIVE, FEMININE))
            .addForm(new WordForm("ὁλον", "whole, entire", ADJECTIVE, NEUTER)),
        new Word(new WordForm("παρακαλῶ", "I call, I beseech παρακαλέω", PRESENT), OK)
            .addForm(new WordForm("παρακαλέσω", "I will call, I will beseech παρακαλέω", FUTURE))
            .addForm(new WordForm("παρεκάλεσα", "I beseeched παρακαλέω", AORIST))
            .addForm(new WordForm("παρακέκληκα", "I have beseeched παρακαλέω", PERFECT))
            .addForm(new WordForm("παρακέκλημαι", "I have been beseeched παρακαλέω", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("παρεκλήθην", "I was beseeched παρακαλέω", PASSIVE, AORIST)),
        // 108
        new Word(new WordForm("ανα + *στα", "to raise, to stand up ", ROOT), OK)
            .addForm(new WordForm("ἀνίστημι", "I raise, I stand up ", PRESENT))
            .addForm(new WordForm("ἀναστήσω", "I will raise/stand up ", FUTURE))
            .addForm(new WordForm("ἀνέστησα", "I raised ", AORIST))
            .addForm(new WordForm("ἀνέστηκα", "I have raised ", PERFECT))
            .addForm(new WordForm("ἀνέστυμαι", "I have been raised ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἀνέστην", "I was raised ", PASSIVE, AORIST)),
        // 106
        new Word(new WordForm("*σωζ", "to save ", ROOT), OK)
            .addForm(new WordForm("σῴζω", "I save ", PRESENT))
            .addForm(new WordForm("σώζω", "I will save ", FUTURE))
            .addForm(new WordForm("ἔσωσα", "I saved ", AORIST))
            .addForm(new WordForm("σέσωκα", "I have saved ", PERFECT))
            .addForm(new WordForm("σέσῳσμαι", "I have been saved ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐσώθην", "I was saved ", PASSIVE, AORIST)),
        new Word(new WordForm("ὤρα", "hour", FEMININE), OK)
            .addForm(new WordForm("ὤρας", "hour", FEMININE, GENITIVE)),
        // 105
        new Word(new WordForm("ἐκει", "there"), OK),
        // 103
        new Word(new WordForm("ὁτε", "when"), WEAK),
        new Word(new WordForm("πως", "how"), WEAK),
        new Word(new WordForm("ψυχη", "soul, life", FEMININE), STRONG)
            .addForm(new WordForm("ψυχης", "soul, life", FEMININE, GENITIVE)),
        // 102
        new Word(new WordForm("ἀγαθός", "good", ADJECTIVE, MASCULINE), STRONG)
            .addForm(new WordForm("ἀγαθή", "good", ADJECTIVE, FEMININE))
            .addForm(new WordForm("ἀγαθόν", "good", ADJECTIVE, NEUTER)),
        new Word(new WordForm("ἐξουσια", "authority", FEMININE), OK)
            .addForm(new WordForm("ἐξουσιας", "authority", FEMININE, GENITIVE)),
        // 101
        new Word(new WordForm("*αρ", "to take up, to take away ", ROOT), WEAK)
            .addForm(new WordForm("αἴρω", "I take up, I take away ", PRESENT))
            .addForm(new WordForm("ἀρω", "I will take up  ", FUTURE))
            .addForm(new WordForm("ἦρα", "I took up  ", AORIST))
            .addForm(new WordForm("ἦρκα", "I have taken up  ", PERFECT))
            .addForm(new WordForm("ἦρμαι", "I have been taken up ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἤρθην", "I was taken up  ", PASSIVE, AORIST)),
        new Word(new WordForm("δει", "it is necessary"), STRONG),
        new Word(new WordForm("ὁδος", "way, road", FEMININE), WEAK)
            .addForm(new WordForm("ὁδου", "way, road", FEMININE, GENITIVE)),
        // 100
        new Word(new WordForm("ἀλληλων", "each other"), STRONG),
        new Word(new WordForm("καλος", "good", ADJECTIVE, MASCULINE), STRONG)
            .addForm(new WordForm("καλη", "good", ADJECTIVE, FEMININE))
            .addForm(new WordForm("καλον", "good", ADJECTIVE, NEUTER)),
        new Word(new WordForm("ὀφθαλμος", "eye, sight", MASCULINE), STRONG)
            .addForm(new WordForm("ὀφθαλμου", "eye, sight", MASCULINE, GENITIVE)),
        new Word(new WordForm("*θε", "to put, place ", ROOT), OK)
            .addForm(new WordForm("τίθημι", "I put, I place ", PRESENT))
            .addForm(new WordForm("θήσω", "I will put ", FUTURE))
            .addForm(new WordForm("ἔθηκα", "I placed ", AORIST))
            .addForm(new WordForm("τέθεικα", "I have put ", PERFECT))
            .addForm(new WordForm("τέθειμαι", "I have been put ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐτέθην", "I was put ", PASSIVE, AORIST)),
        // 98
        new Word(new WordForm("φαρισαιος", "Pharisee", MASCULINE), STRONG)
            .addForm(new WordForm("φαρισαιου", "Pharisee", MASCULINE, GENITIVE)),
        new Word(new WordForm("ἑτερος", "other, another", ADJECTIVE, MASCULINE), OK)
            .addForm(new WordForm("ἑτερα", "other, another", ADJECTIVE, FEMININE))
            .addForm(new WordForm("ἑτερον", "other, another", ADJECTIVE, NEUTER)),
        new Word(new WordForm("οὐδέ", "and not, neither, nor, not even"), OK),
        // 97
        new Word(new WordForm("ἀρτος", "bread", MASCULINE), OK)
            .addForm(new WordForm("ἀρτου", "bread", MASCULINE, GENITIVE)),
        new Word(new WordForm("αἱμα", "blood", NEUTER), OK)
            .addForm(new WordForm("αἱματος", "blood", NEUTER, GENITIVE)),
        new Word(new WordForm("*δακ", "to teach ", ROOT), OK)
            .addForm(new WordForm("διδασκω", "I teach ", PRESENT))
            .addForm(new WordForm("διδάξω", "I will teach ", FUTURE))
            .addForm(new WordForm("ἐδίδαξα", "I taught ", AORIST))
            .addForm(new WordForm("ἐδιδάχθην", "I was taught ", PASSIVE, AORIST)),
        new Word(new WordForm("*γεννα", "to beget ", ROOT), OK)
            .addForm(new WordForm("γεννῶ", "I beget ", PRESENT))
            .addForm(new WordForm("γεννήσω", "I will beget ", FUTURE))
            .addForm(new WordForm("ἐγέννησα", "I begat ", AORIST))
            .addForm(new WordForm("γεγέννηκα", "I have begotten ", PERFECT))
            .addForm(new WordForm("γεγέννημαι", "I have been begotten ", PASSIVE, PERFECT))
            .addForm(new WordForm("ἐγεννήθην", "I was begotten ", PASSIVE, AORIST)),
        // 95
        new Word(new WordForm("περι + *πατε", "to walk around ", ROOT), WEAK)
            .addForm(new WordForm("περιπατω", "I walk around ", PRESENT))
            .addForm(new WordForm("περιπατήσω", "I will walk around ", FUTURE))
            .addForm(new WordForm("περιεπάτησα", "I walked around ", AORIST)),
        new Word(new WordForm("*φοβε", "to fear ", ROOT), OK)
            .addForm(new WordForm("φοβέομαι", "I fear ", PRESENT, DEPONENT))
            .addForm(new WordForm("ἐφοβήθην", "I feared ", PASSIVE, AORIST, DEPONENT)),
        // 93
        new Word(new WordForm("ἔτι", "still, yet"), OK),
        new Word(new WordForm("πούς", "foot", MASCULINE), OK)
            .addForm(new WordForm("ποδός", "foot", MASCULINE, GENITIVE)),
        // 92
        new Word(new WordForm("δικαιοσύνη", "justice, righteousness", FEMININE), OK)
            .addForm(new WordForm("δικαιοσύνης", "justice, righteousness", FEMININE, GENITIVE)),
        new Word(new WordForm("εἰρήνη", "peace", FEMININE), OK)
            .addForm(new WordForm("εἰρήνης", "peace", FEMININE, GENITIVE)),
        // 91
        new Word(new WordForm("θάλασσα", "sea, lake", FEMININE), OK)
            .addForm(new WordForm("θάλασσης", "sea, lake", FEMININE, GENITIVE)),
        new Word(new WordForm("τόπος", "place, position; opportunity; passage", MASCULINE), OK)
            .addForm(new WordForm("τόπου", "place, position; opportunity; passage", MASCULINE, GENITIVE)),
        new Word(new WordForm("κατα + *εμ", "to sit down ", ROOT), WEAK)
            .addForm(new WordForm("κάθημαι", "I sit down "))
            .addForm(new WordForm("κάθησομαι", "I will sit down ", FUTURE)),
        // 90
        new Word(new WordForm("*ἀκολουθε", "to follow ", ROOT), WEAK)
            .addForm(new WordForm("ἀκολουθω", "I follow ", PRESENT))
            .addForm(new WordForm("ἀκολουθήσω", "I will follow ", FUTURE))
            .addForm(new WordForm("ἠκολούθησα", "I followed ", AORIST))
            .addForm(new WordForm("ἠκολούθηκα", "I have followed ", PERFECT)),
        new Word(new WordForm("απο + *ὀλ", "to destroy ", ROOT), WEAK)
            .addForm(new WordForm("ἀπόλλυμι", "I destroy, middle I perish, I die ", PRESENT))
            .addForm(new WordForm("ἀπολέσω", "I will destroy ", FUTURE))
            .addForm(new WordForm("ἀπώλεσα", "I destroyed ", AORIST))
            .addForm(new WordForm("ἀπόλωλα", "I have destroyed ", PERFECT)),
        new Word(new WordForm("*πετ", "to fall ", ROOT), WEAK)
            .addForm(new WordForm("πίπτω", "I fall ", PRESENT))
            .addForm(new WordForm("πεσοῦμαι", "I will fall ", FUTURE))
            .addForm(new WordForm("ἔπεσον", "I fell ", SECOND_AORIST))
            .addForm(new WordForm("πέπτωκα", "I have fallen ", PERFECT)),
        new Word(new WordForm("μηδείς", "no, no one"), OK),
        // 88
        new Word(new WordForm("ἑπτά", "seven, doesn't decline"), OK),
        // 87
        new Word(new WordForm("οὔτε", "neither"), OK),
        // 86
        new Word(new WordForm("*αρχ", "(middle) to begin (active) to rule, rare ", ROOT), OK)
            .addForm(new WordForm("ἄρχομαι", "I begin (active I rule, but rare) ", MIDDLE, PRESENT))
            .addForm(new WordForm("ἄρξομαι", "I will begin ", FUTURE, MIDDLE))
            .addForm(new WordForm("ἠρξάμην", "I began ", AORIST, MIDDLE)),
        new Word(new WordForm("*πληρο", "to fill, fulfill ", ROOT), OK)
            .addForm(new WordForm("πληρω", "I fill, fulfill ", PRESENT))
            .addForm(new WordForm("πληρώσω", "I will fill ", FUTURE))
            .addForm(new WordForm("ἐπλήρωσα", "I filled ", AORIST))
            .addForm(new WordForm("πεπλήρωκα", "I have filled ", PERFECT))
            .addForm(new WordForm("πεπλήρωμαι", "I have been filled ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐπληρώθην", "I was filled ", PASSIVE, AORIST)),
        new Word(new WordForm("προσέρχομαι", "I come to", PRESENT), WEAK)
            .addForm(new WordForm("προσήλθον", "I came to προσέρχομαι", AORIST))
            .addForm(new WordForm("προσελήλυθα", "I have come to προσέρχομαι", PERFECT)),
        // 85
        new Word(new WordForm("καιρός", "time (point and period)", MASCULINE), WEAK)
            .addForm(new WordForm("καιροῦ", "time (point and period)", MASCULINE, GENITIVE)),
        new Word(new WordForm("προσ + *ευχ", "to pray ", ROOT), WEAK)
            .addForm(new WordForm("προσεύχομαι", "I pray ", PRESENT, DEPONENT))
            .addForm(new WordForm("προσεύξομαι", "I will pray ", FUTURE, DEPONENT))
            .addForm(new WordForm("προσηυξάμην", "I prayed ", AORIST, DEPONENT)),
        // 83
        new Word(new WordForm("μήτηρ", "mother", FEMININE), STRONG)
            .addForm(new WordForm("μητρός", "mother", FEMININE, GENITIVE)),
        new Word(new WordForm("ὥστε", "so that, in order that, thus"), WEAK),
        // 82
        new Word(new WordForm("ανα + *βα", "to go up, rise up, advance ", ROOT), OK)
            .addForm(new WordForm("ἀναβαίνω", "I go up, rise up, advance "))
            .addForm(new WordForm("ἀναβήσομαι", "I will go up, rise up, advance ", FUTURE, DEPONENT))
            .addForm(new WordForm("ἀνέβην", "I went up, rose up, advanced ", SECOND_AORIST))
            .addForm(new WordForm("ἀναβέβηκα", "I have gone up, risen up, advanced ", PERFECT)),
        new Word(new WordForm("ἕκαστος", "each, every", ADJECTIVE, MASCULINE), WEAK)
            .addForm(new WordForm("ἕκαστη", "each, every", ADJECTIVE, FEMININE))
            .addForm(new WordForm("ἕκαστον", "each, every", ADJECTIVE, NEUTER)),
        new Word(new WordForm("ὅπου", "where, whereas"), WEAK),
        // 81
        new Word(new WordForm("ἐκβάλλω", "I cast out"), OK)
            .addForm(new WordForm("ἐκβαλῶ", "I will cast out ἐκβάλλω", FUTURE))
            .addForm(new WordForm("ἐξέβαλον", "I cast out (past) ἐκβάλλω", AORIST))
            .addForm(new WordForm("ἐκβέβληκα", "I have cast out ἐκβάλλω", PERFECT))
            .addForm(new WordForm("ἐξεβλήθην", "I was cast out ἐκβάλλω", PASSIVE, AORIST)),
        new Word(new WordForm("καταβαίνω", "I come/go down "), OK)
            .addForm(new WordForm("καταβήσομαι", "I will come/go down ", FUTURE, DEPONENT))
            .addForm(new WordForm("κατέβην", "I came/went down ", SECOND_AORIST))
            .addForm(new WordForm("καταβέβηκα", "I have come/gone down ", PERFECT)),
        new Word(new WordForm("μᾶλλον", "more, rather"), WEAK),
        // 80
        new Word(new WordForm("άποστολος", "apostle", MASCULINE), STRONG)
            .addForm(new WordForm("άποστολου", "apostle", MASCULINE, GENITIVE)),
        // 79
        new Word(new WordForm("*πεμπ", "to send ", ROOT), WEAK)
            .addForm(new WordForm("πέμπω", "I send ", PRESENT))
            .addForm(new WordForm("πέμψω", "I will send ", FUTURE))
            .addForm(new WordForm("ἕπεμψα", "I sent ", AORIST))
            .addForm(new WordForm("ἐπέμφθην", "I was sent ", PASSIVE, AORIST)),
        new Word(new WordForm("ὑπο + *αγ", "to go away, to draw off ", ROOT), WEAK)
            .addForm(new WordForm("ὑπάγω", "I go away, I draw off ", PRESENT))
            .addForm(new WordForm("ὑπάξω", "I will go away, I will draw off ", FUTURE))
            .addForm(new WordForm("ὑπἠγαγον", "I went away, I drew off ", SECOND_AORIST))
            .addForm(new WordForm("ὑπῆγμαι", "I have been taken away, I have been drawn off ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ὑπήχθην", "I was taken away, I was drawn off ", PASSIVE, AORIST)),
        new Word(new WordForm("δίκαιος", "upright, just, righteous", ADJECTIVE, MASCULINE), WEAK)
            .addForm(new WordForm("δικαία", "upright, just, righteous", ADJECTIVE, FEMININE))
            .addForm(new WordForm("δικαιον", "upright, just, righteous", ADJECTIVE, NEUTER)),
        // 78
        new Word(new WordForm("στόµα", "mouth", NEUTER), OK)
            .addForm(new WordForm("στόματος", "mouth", NEUTER, GENITIVE)),
        new Word(new WordForm("πονηρός", "physical: sick, bad spiritual: evil, wicked", ADJECTIVE, MASCULINE), OK)
            .addForm(new WordForm("πονηρά", "physical: sick, bad spiritual: evil, wicked", ADJECTIVE, FEMININE))
            .addForm(new WordForm("πονηρόν", "physical: sick, bad spiritual: evil, wicked", ADJECTIVE, NEUTER)),
        // 77
        new Word(new WordForm("σηµεῖον", "sign, miracle", NEUTER), OK)
            .addForm(new WordForm("σηµεῖου", "sign, miracle", NEUTER, GENITIVE)),
        new Word(new WordForm("ανα + *οιγω", "to open, unlock, disclose ", ROOT), WEAK)
            .addForm(new WordForm("ἀνοίγω", "I open, unlock, disclose ", PRESENT))
            .addForm(new WordForm("ἀνέῳζα", "I opened, unlocked, disclosed ", AORIST))
            .addForm(new WordForm("ἀνεῳχθην", "I was opened, unlocked, disclosed ", PASSIVE, AORIST)),
        new Word(new WordForm("*βαπτιδ", "to baptize, wash, dip ", ROOT), STRONG)
            .addForm(new WordForm("βαπτίζω", "I baptize, wash, dip ", PRESENT))
            .addForm(new WordForm("βαπτίσω", "I will baptize, wash, dip ", FUTURE))
            .addForm(new WordForm("ἐβαπτισα", "I baptized, washed, dipped ", AORIST))
            .addForm(new WordForm("βεβάπτισμαι", "I have been baptized, washed, dipped ", PASSIVE, PERFECT))
            .addForm(new WordForm("ἐβαπτίσθην", "I was baptized, washed, dipped ", PASSIVE, AORIST)),
        // 76
        new Word(new WordForm("εὐαγγέλιον", "good news, gospel", NEUTER), STRONG)
            .addForm(new WordForm("εὐαγγέλιου", "good news, gospel", NEUTER, GENITIVE)),
        new Word(new WordForm("πρόσωπον", "face, countenance", NEUTER), OK)
            .addForm(new WordForm("πρόσωπου", "face, countenance", NEUTER, GENITIVE)),
        new Word(new WordForm("ὕδωρ", "water", NEUTER), OK)
            .addForm(new WordForm("ὕδατος", "water", NEUTER, GENITIVE)),
        new Word(new WordForm("*μαρτυρε", "to bear witness ", ROOT), STRONG)
            .addForm(new WordForm("μαρτυρῶ", "I bear witness ", PRESENT))
            .addForm(new WordForm("μαρτυρήσω", "I will bear witness ", FUTURE))
            .addForm(new WordForm("ἐμαρτύρησα", "I bore witness ", AORIST))
            .addForm(new WordForm("μεμαρτύρηκα", "I have born witness ", PERFECT))
            .addForm(new WordForm("μεμαρτύρημαι", "I have been witnessed ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐμαρτυρήθην", "I was witnessed ", PASSIVE, AORIST)),
        // 75
        new Word(new WordForm("κεφαλή", "head", FEMININE), OK)
            .addForm(new WordForm("κεφαλῆς", "head", FEMININE, GENITIVE)),
        new Word(new WordForm("δώδεκα", "twelve"), OK),
        // 74
        new Word(new WordForm("απο + *κτεν", "to kill ", ROOT), WEAK)
            .addForm(new WordForm("ἀποκτείνω", "I kill ", PRESENT))
            .addForm(new WordForm("ἀποκτενῶ", "I will kill ", FUTURE))
            .addForm(new WordForm("ἀπέκτεινα", "I killed ", AORIST))
            .addForm(new WordForm("ἀπεκτάθην", "I was killed ", PASSIVE, AORIST)),
        new Word(new WordForm("*χαρ", "to rejoice ", ROOT), WEAK)
            .addForm(new WordForm("χαίρω", "I rejoice (infinitive used as a greeting) ", PRESENT))
            .addForm(new WordForm("ἐχάρην", "I rejoiced ", PASSIVE, SECOND_AORIST, DEPONENT)),
        // 73
        new Word(new WordForm("φῶς", "light", NEUTER), STRONG)
            .addForm(new WordForm("φωτός", "light", NEUTER, GENITIVE)),
        new Word(new WordForm("*πι", "to drink ", ROOT), WEAK)
            .addForm(new WordForm("πίνω", "I drink ", PRESENT))
            .addForm(new WordForm("πίομαι", "I will drink ", FUTURE, DEPONENT))
            .addForm(new WordForm("ἔπιον", "I drank ", SECOND_AORIST))
            .addForm(new WordForm("πέπωκα", "I have drunk ", PERFECT))
            .addForm(new WordForm("ἐπόθην", "I was drunk ", PASSIVE, AORIST)),
        // 71
        new Word(new WordForm("ἱερόν", "temple", NEUTER), WEAK)
            .addForm(new WordForm("ἱεροῦ", "temple", NEUTER, GENITIVE)),
        new Word(new WordForm("πῦρ", "fire", NEUTER), OK)
            .addForm(new WordForm("πυρός", "fire", NEUTER, GENITIVE)),
        // 70
        new Word(new WordForm("*αἰτε", "to ask ", ROOT), WEAK)
            .addForm(new WordForm("αἰτέω", "I ask ", PRESENT))
            .addForm(new WordForm("αἰτήσω", "I will ask ", FUTURE))
            .addForm(new WordForm("ᾔτησα", "I asked ", AORIST))
            .addForm(new WordForm("ᾔτηκα", "I have asked ", PERFECT))
            .addForm(new WordForm("ᾔτημαι", "I have been asked ", MIDDLE, PASSIVE, PERFECT)),
        new Word(new WordForm("*τηρε", "to keep, guard ", ROOT), OK)
            .addForm(new WordForm("τηρέω", "I keep, I guard ", PRESENT))
            .addForm(new WordForm("τηρήσω", "I will keep, I will guard ", FUTURE))
            .addForm(new WordForm("ἐτήρησα", "I kept, I guarded ", AORIST))
            .addForm(new WordForm("τετήρηκα", "I have kept, I have guarded ", PERFECT))
            .addForm(new WordForm("τετήρημαι", "I have been kept, I have been guarded ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐτηρήθην", "I was kept, I was guarded ", PASSIVE, AORIST)),
        // 69
        new Word(new WordForm("τρεῖς", "three", MASCULINE, FEMININE), OK)
            .addForm(new WordForm("τρία", "three", NEUTER)),
        // 68
        new Word(new WordForm("ῥῆμα", "word, thing", NEUTER), OK)
            .addForm(new WordForm("ῥῆματος", "word, thing", NEUTER, GENITIVE)),
        new Word(new WordForm("σάββατον", "Sabbath, week", NEUTER), OK)
            .addForm(new WordForm("σάββατου", "Sabbath, week", NEUTER, GENITIVE)),
        // 67
        new Word(new WordForm("ἐντολή", "commandment", FEMININE), OK)
            .addForm(new WordForm("ἐντολῆς", "commandment", FEMININE, GENITIVE)),
        new Word(new WordForm("πλοῖον", "ship, boat", NEUTER), OK)
            .addForm(new WordForm("πλοῖου", "ship, boat", NEUTER, GENITIVE)),
        // 66
        new Word(new WordForm("πρεσβύτερος", "elder", NOUN, MASCULINE), OK)
            .addForm(new WordForm("πρεσβύτερου", "elder", NOUN, MASCULINE, GENITIVE))
            .addForm(new WordForm("πρεσβύτερος", "old", ADJECTIVE, MASCULINE))
            .addForm(new WordForm("πρεσβύτερα", "old", ADJECTIVE, FEMININE))
            .addForm(new WordForm("πρεσβύτερον", "old", ADJECTIVE, NEUTER)),
        new Word(new WordForm("*φερ", "to carry, bear, produce ", ROOT), WEAK)
            .addForm(new WordForm("φέρω", "I carry, bear, produce ", PRESENT))
            .addForm(new WordForm("οἴσω", "I will carry, bear, produce φέρω ", FUTURE))
            .addForm(new WordForm("ἤνεγκα", "I carried, bore, produced φέρω ", AORIST))
            .addForm(new WordForm("ἐνήνοχα", "I have carried, bore, produced φέρω ", PERFECT))
            .addForm(new WordForm("ἠνέχθην", "I was carried, born, produced φέρω ", PASSIVE, AORIST)),
        new Word(new WordForm("ἀπολύω", "I release + *λυ", PRESENT), WEAK)
            .addForm(new WordForm("ἀπολύσω", "I will release ἀπολύω + *λυ", FUTURE))
            .addForm(new WordForm("ἀπέλυσα", "I released ἀπολύω + *λυ", AORIST))
            .addForm(new WordForm("ἀπολέλυμαι", "I have been released ἀπολύω + *λυ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἀπελύθην", "I was released ἀπολύω + *λυ", PASSIVE, AORIST)),
        new Word(new WordForm("καπρός", "fruit, crop, result", MASCULINE), ZERO)
            .addForm(new WordForm("καπροῦ", "fruit, crop, result", MASCULINE, GENITIVE)),
        new Word(new WordForm("*φη", "to say ", ROOT), WEAK)
            .addForm(new WordForm("φημί", "I say ", PRESENT))
            .addForm(new WordForm("ἔφη", "I said ", AORIST)),
        // 65
        new Word(new WordForm("εἴτε", "if, whether", PARTICLE), WEAK),
        // 63
        new Word(new WordForm("ὄρος", "mountain, hill", NEUTER), WEAK)
            .addForm(new WordForm("ὄρους", "mountain, hill", NEUTER, GENITIVE)),
        new Word(new WordForm("γραμματεύς", "scribe", MASCULINE), OK)
            .addForm(new WordForm("γραμματέως", "scribe", MASCULINE, GENITIVE)),
        new Word(new WordForm("δαιμόνιον", "demon", NEUTER), STRONG)
            .addForm(new WordForm("δαιμόνιου", "demon", NEUTER, GENITIVE)),
        new Word(new WordForm("*ερωτα", "to ask", ROOT), WEAK)
            .addForm(new WordForm("ἐρωτάω", "I ask ", PRESENT))
            .addForm(new WordForm("ἐρωτήσω", "I will ask ", FUTURE))
            .addForm(new WordForm("ἠρώτησα", "I asked ", AORIST))
            .addForm(new WordForm("ἠρωτήθην", "I was asked ", PASSIVE, AORIST)),
        // 62
        new Word(new WordForm("Ἱεροσόλυμα", "Jerusalem", NEUTER), OK),
        new Word(new WordForm("*δοκ", "to think, seem ", ROOT), WEAK)
            .addForm(new WordForm("δοκέω", "I think, seem ", PRESENT))
            .addForm(new WordForm("ἔδοξα", "I thought, seemed δοκέω ", AORIST)),
        new Word(new WordForm("θέλημα", "will, desire", NEUTER), OK)
            .addForm(new WordForm("θέληματος", "will, desire", NEUTER, GENITIVE)),
        new Word(new WordForm("θρόνος", "throne", MASCULINE), OK)
            .addForm(new WordForm("θρόνου", "throne", MASCULINE, GENITIVE)),
        // 61
        new Word(new WordForm("*δοξαδ", "to praise, honor, glorify ", ROOT), WEAK)
            .addForm(new WordForm("δοξάζω", "I praise, honor, glorify ", PRESENT))
            .addForm(new WordForm("δοξάσω", "I will praise, honor, glorify δοξάζω ", FUTURE))
            .addForm(new WordForm("ἐδόξασα", "I praised, honored, glorified δοξάζω ", AORIST))
            .addForm(new WordForm("δεδόξασμαι", "I have been praised, honored, glorified δοξάζω ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐδοξάσθην", "I was praised, honored, glorified δοξάζω ", PASSIVE, AORIST)),
        new Word(new WordForm("*κηρυγ", "to proclaim, preach ", ROOT), OK)
            .addForm(new WordForm("κηρύσσω", "I proclaim, preach "))
            .addForm(new WordForm("ἐκήρυξα", "I proclaimed, preached κηρύσσω ", AORIST))
            .addForm(new WordForm("ἐκηρύχθην", "I was proclaimed, preached ", PASSIVE, AORIST)),
        new Word(new WordForm("εὐ + *αγγελιδ", "to bring good news", ROOT), OK)
            .addForm(new WordForm("εὐαγγελίζω", "I bring good news , often occurs in middle voice with same meaning", PRESENT))
            .addForm(new WordForm("εὐηγγέλισα", "I brought good news εὐαγγελίζω ", AORIST))
            .addForm(new WordForm("εὐηγγέλισμαι", "I have been brought good news εὐαγγελίζω ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("εὐηγγελίσθην", "I was brought good news εὐαγγελίζω ", PASSIVE, AORIST)),
        new Word(new WordForm("ὑπάρχω", "I am, I exist + *αρχ", PRESENT), WEAK),
        new Word(new WordForm("ἤδη", "now, already"), WEAK),
        new Word(new WordForm("ὧδε", "here"), WEAK),
        new Word(new WordForm("νύξ", "night", FEMININE), OK)
            .addForm(new WordForm("νυκτός", "night", FEMININE, GENITIVE)),
        // 60
        new Word(new WordForm("ἱμάτιον", "garment", NEUTER), WEAK)
            .addForm(new WordForm("ἱμάτιου", "garment", NEUTER, GENITIVE)),
        new Word(new WordForm("*προσκυνε", "to fall down to worship", ROOT), WEAK)
            .addForm(new WordForm("προσκυνέω", "I fall down to worship ", PRESENT))
            .addForm(new WordForm("προσκυνήσω", "I will fall down to worship προσκυνέω ", FUTURE))
            .addForm(new WordForm("προσεκύνησα", "I fell down to worship προσκυνέω ", AORIST)),
        // 59
        new Word(new WordForm("*ἀσπαδ", "to greet, salute ", ROOT), ZERO)
            .addForm(new WordForm("ἀσπάζομαι", "I greet, salute ", PRESENT, DEPONENT))
            .addForm(new WordForm("ἠσπασάμην", "I greeted, saluted ἀσπάζομαι ", AORIST, DEPONENT)),
        new Word(new WordForm("λίθος", "stone", MASCULINE), WEAK)
            .addForm(new WordForm("λίθου", "stone", MASCULINE, GENITIVE)),
        new Word(new WordForm("διδάσκαλος ου", "teacher", MASCULINE), STRONG)
            .addForm(new WordForm("διδάσκαλου", "teacher", MASCULINE, GENITIVE)),
        new Word(new WordForm("χαρά", "joy", FEMININE), WEAK)
            .addForm(new WordForm("χαρᾶς", "joy", FEMININE, GENITIVE)),
        new Word(new WordForm("συνάγω", "I bring together, I compile ", PRESENT), WEAK)
            .addForm(new WordForm("συνάξω", "I will bring together, I will compile συνάγω ", FUTURE))
            .addForm(new WordForm("συνήγαγον", "I brought together, I compiled συνάγω ", AORIST))
            .addForm(new WordForm("συνήχθην", "I was brought together, I was compiled συνάγω ", PASSIVE, AORIST))
            .addForm(new WordForm("συνῆγμαι", "I have been brought together, I have been compiled συνάγω ", MIDDLE, PASSIVE, PERFECT)),
        // 58
        new Word(new WordForm("*θεωρε", "to look at, behold ", ROOT), STRONG)
            .addForm(new WordForm("θεωρέω", "I look at, behold ", PRESENT))
            .addForm(new WordForm("θεωρήσω", "I will look at, behold θεωρέω ", FUTURE))
            .addForm(new WordForm("ἐθεώρησα", "I looked at, beheld θεωρέω ", AORIST)),
        // 57
        new Word(new WordForm("τοιοῦτος", "such, of such kind", ADJECTIVE, MASCULINE), WEAK)
            .addForm(new WordForm("τοιαῦτη", "such, of such kind", ADJECTIVE, FEMININE))
            .addForm(new WordForm("τοιοῦτον", "such, of such kind", ADJECTIVE, NEUTER)),
        // 56
        new Word(new WordForm("μηδέ", "and not, neither"), OK),
        new Word(new WordForm("*δεχ", "to take, receive ", ROOT), ZERO)
            .addForm(new WordForm("δέχομαι", "I take, receive ", DEPONENT))
            .addForm(new WordForm("δέξομαι", "I will take, receive δέχομαι ", FUTURE, DEPONENT))
            .addForm(new WordForm("ἐδεξάμην", "I took, received δέχομαι ", AORIST, DEPONENT))
            .addForm(new WordForm("δέδεγμαι", "I have been taken, received δέχομαι ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐδἐχθην", "I was taken, received δέχομαι ", PASSIVE, AORIST)),
        new Word(new WordForm("επι + *ερωτα", "to ask", ROOT), ZERO)
            .addForm(new WordForm("ἐπερωτάω", "I ask *ερωτα", PRESENT))
            .addForm(new WordForm("ἐπερωτήσω", "I will ask ἐπερωτάω ", FUTURE))
            .addForm(new WordForm("ἐπηρώτησα", "I asked ἐπερωτάω ", AORIST)),
        new Word(new WordForm("συναγωγή", "synagogue, meeting", FEMININE), OK)
            .addForm(new WordForm("συναγωγῆς", "synagogue, meeting", FEMININE, GENITIVE)),
        // 55
        new Word(new WordForm("*κραγ", "to cry out, call out ", ROOT), WEAK)
            .addForm(new WordForm("κράζω", "I cry out, call out ", PRESENT))
            .addForm(new WordForm("κράξω", "I will cry out, call out κράζω ", FUTURE))
            .addForm(new WordForm("ἔκραξα", "I cried out, called out κράζω ", AORIST))
            .addForm(new WordForm("κέκραγα", "I have cried out, called out κράζω ", PERFECT)),
        new Word(new WordForm("λοιπός", "the rest, remainder", NOUN, MASCULINE), WEAK)
            .addForm(new WordForm("λοιπός", "remaining", ADJECTIVE, MASCULINE))
            .addForm(new WordForm("λοιπή", "remaining", ADJECTIVE, FEMININE))
            .addForm(new WordForm("λοιπόν", "remaining", ADJECTIVE, NEUTER)),
        new Word(new WordForm("ἀρχή", "beginning; ruler", FEMININE), WEAK)
            .addForm(new WordForm("ἀρχῆς", "beginning; ruler", FEMININE, GENITIVE)),
        // 54
        new Word(new WordForm("δεξιός", "right (hand, side)", ADJECTIVE, MASCULINE), WEAK)
            .addForm(new WordForm("δεξιά", "right (hand, side)", ADJECTIVE, FEMININE))
            .addForm(new WordForm("δεξιόν", "right (hand, side)", ADJECTIVE, NEUTER)),
        new Word(new WordForm("μέσος", "middle, in the midst", ADJECTIVE, MASCULINE), WEAK)
            .addForm(new WordForm("μέση", "middle, in the midst", ADJECTIVE, FEMININE))
            .addForm(new WordForm("μέσον", "middle, in the midst", ADJECTIVE, NEUTER)),
        new Word(new WordForm("χρόνος", "time", MASCULINE), WEAK)
            .addForm(new WordForm("χρόνου", "time", MASCULINE, GENITIVE)),
        new Word(new WordForm("ούχι", "not"), OK),
        // 53
        new Word(new WordForm("ἐλπίς", "hope, expectation", FEMININE), WEAK)
            .addForm(new WordForm("ἐλπίδος", "hope, expectation", FEMININE, GENITIVE)),
        new Word(new WordForm("διό", "therefore, for this reason"), ZERO),
        new Word(new WordForm("ὅπως", "so that, in order that, how that"), ZERO),
        // 52
        new Word(new WordForm("ἐπαγγελία", "promise", FEMININE), ZERO)
            .addForm(new WordForm("ἐπαγγελίας", "promise", FEMININE, GENITIVE)),
        new Word(new WordForm("παιδίον", "child, infant", NEUTER), STRONG)
            .addForm(new WordForm("παιδίου", "child, infant", NEUTER, GENITIVE)),
        new Word(new WordForm("*πειθ", "to persuade ", ROOT), WEAK)
            .addForm(new WordForm("πείθω", "I persuade ", PRESENT))
            .addForm(new WordForm("πείσω", "I will persuade πείθω ", FUTURE))
            .addForm(new WordForm("ἔπεισα", "I persuaded πείθω ", AORIST))
            .addForm(new WordForm("πέποιθα", "I have persuaded πείθω ", PERFECT))
            .addForm(new WordForm("πέπεισμαι", "I have been persuaded πείθω ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐπείσθην", "I was persuaded πείθω ", PASSIVE, AORIST)),
        new Word(new WordForm("*σπερ", "to sow ", ROOT), WEAK)
            .addForm(new WordForm("σπείρω", "I sow ", PRESENT))
            .addForm(new WordForm("ἔσπειρα", "I sowed σπείρω ", AORIST))
            .addForm(new WordForm("ἔσπαρμαι", "I have been sown σπείρω ", MIDDLE, PASSIVE, PERFECT))
            .addForm(new WordForm("ἐσπάρην", "I was sown σπείρω ", PASSIVE, AORIST)),
        // 51
        new Word(new WordForm("σοφία", "skill, wisdom", FEMININE), OK)
            .addForm(new WordForm("σοφίας", "skill, wisdom", FEMININE, GENITIVE)),
        new Word(new WordForm("εὐθύς", "immediately"), OK),
        // 50
        new Word(new WordForm("γλῶσσα", "tongue, language", FEMININE), OK)
            .addForm(new WordForm("γλῶσσης", "tongue, language", FEMININE, GENITIVE)),
        new Word(new WordForm("γραφή", "scripture, writing", FEMININE), OK)
            .addForm(new WordForm("γραφῆς", "scripture, writing", FEMININE, GENITIVE)),
        new Word(new WordForm("παραβολή", "parable", FEMININE), OK)
            .addForm(new WordForm("παραβολῆς", "parable", FEMININE, GENITIVE)),
        new Word(new WordForm("ἔσχατος", "last", ADJECTIVE, MASCULINE), OK)
            .addForm(new WordForm("ἔσχατη", "last", ADJECTIVE, FEMININE))
            .addForm(new WordForm("ἔσχατον", "last", ADJECTIVE, NEUTER)),
        new Word(new WordForm("κακός", "bad, evil", ADJECTIVE, MASCULINE), OK)
            .addForm(new WordForm("κακή", "bad, evil", ADJECTIVE, FEMININE))
            .addForm(new WordForm("κακόν", "bad, evil", ADJECTIVE, NEUTER)),
        new Word(new WordForm("μακάριος", "blessed, happy", ADJECTIVE, MASCULINE), OK)
            .addForm(new WordForm("μακαρία", "blessed, happy", ADJECTIVE, FEMININE))
            .addForm(new WordForm("μακάριον", "blessed, happy", ADJECTIVE, NEUTER)),
        new Word(new WordForm("τυφλός", "blind", ADJECTIVE, MASCULINE), ZERO)
            .addForm(new WordForm("τυφλή", "blind", ADJECTIVE, FEMININE))
            .addForm(new WordForm("τυφλόν", "blind", ADJECTIVE, NEUTER)),
        new Word(new WordForm("μηδέ", "nor, and not"), WEAK),
        // 49
        new Word(new WordForm("ἔτος", "year", NEUTER), ZERO)
            .addForm(new WordForm("ἔτους", "year", NEUTER, GENITIVE)),
        new Word(new WordForm("χρεία", "need, necessity", FEMININE), ZERO)
            .addForm(new WordForm("χρείας", "need, necessity", FEMININE, GENITIVE)),
        new Word(new WordForm("παραλαμβάνω", "I take to myself, take along, take over", PRESENT), ZERO)
            .addForm(new WordForm("παραλήμψομαι", "I will take to myself, will take along, will take over ", FUTURE))
            .addForm(new WordForm("παρέλαβον", "I took to myself, took along, took over ", SECOND_AORIST))
            .addForm(new WordForm("παρελήμφθην", "I was taken along, was taken over ", PASSIVE, AORIST)),
        new Word(new WordForm("*φανερο", "to reveal, make known", ROOT), ZERO)
            .addForm(new WordForm("φανερῶ", "I reveal, make known ", PRESENT))
            .addForm(new WordForm("φανερώσω", "I reveal, make known φανερῶ ", FUTURE))
            .addForm(new WordForm("ἐφανέρωσα", "I revealed, made known φανερῶ ", AORIST))
            .addForm(new WordForm("ἐφανερώθην", "I was revealed, made known φανερῶ ", PASSIVE, AORIST))
            .addForm(new WordForm("πεφανέρωμαι", "I have been revealed, made known φανερῶ ", MIDDLE, PASSIVE, PERFECT)),
        new Word(new WordForm("ἄρα", "then, therefore"), ZERO),
        // 48
        new Word(new WordForm("ἔρημος", "isolated, desolate, deserted, used as substantive, desert (feminine in this case)", ADJECTIVE), WEAK),
        new Word(new WordForm("ἀποδίδωμι", "I give up, give back, pay", PRESENT), ZERO)
            .addForm(new WordForm("ἀποδώσω", "I will give up, give back, pay ", FUTURE))
            .addForm(new WordForm("ἀπέδωκα", "I gave up, gave back, paid ", AORIST))
            .addForm(new WordForm("ἀπεδόθην", "I was given up, given back, paid ", PASSIVE, AORIST)),
        // 47
        new Word(new WordForm("πρό", "before, above"), WEAK),
        new Word(new WordForm("κρίσις", "judgement, legal case", FEMININE), WEAK)
            .addForm(new WordForm("κρίσεως", "judgement, legal case", FEMININE, GENITIVE)),
        new Word(new WordForm("φόβος", "fear, fear inspiring thing, reverence", MASCULINE), STRONG)
            .addForm(new WordForm("φόβου", "fear, fear inspiring thing, reverence", MASCULINE, GENITIVE)),
        new Word(new WordForm("φυλακή", "guard, prison, watch (of the night)", FEMININE), ZERO)
            .addForm(new WordForm("φυλακῆς", "guard, prison, watch (of the night)", FEMININE, GENITIVE)),
        new Word(new WordForm("*κρατε", "to grasp, to be strong, to take possession", ROOT), ZERO)
            .addForm(new WordForm("κρατῶ", "I grasp, am strong, take possession κρατέω ", PRESENT))
            .addForm(new WordForm("κρατήσω", "I will grasp, will be strong, will take possession κρατέω ", FUTURE))
            .addForm(new WordForm("ἐκράτησα", "I grasped, was strong, took possession κρατέω ", AORIST))
            .addForm(new WordForm("κεκράτηκα", "I have grasped, have been strong, have taken possession κρατέω ", PERFECT))
            .addForm(new WordForm("κεκράτημαι", "I have been grasped, have been taken possession κρατέω ", MIDDLE, PASSIVE, PERFECT)),
        new Word(new WordForm("προσφέρω", "I bring, I offer προσ + φερω", PRESENT), ZERO)
            .addForm(new WordForm("προσήνεγκα", "I brought, I offered προσφερω", AORIST))
            .addForm(new WordForm("προσενήνοχα", "I have brought, I have offered προσφερω", PERFECT))
            .addForm(new WordForm("προσήνεχθην", "I was brought, I was offered προσφερω", PASSIVE, AORIST)),
        new Word(new WordForm("οὐκέτι", "no longer"), ZERO),
        // 46
        new Word(new WordForm("θηρίον", "non-human animal, wild animal", NEUTER), ZERO)
            .addForm(new WordForm("θηρίου", "non-human animal, wild animal", NEUTER, GENITIVE)),
        new Word(new WordForm("σωτηρία", "salvation, deliverance, preservation", FEMININE), ZERO)
            .addForm(new WordForm("σωτηρίας", "salvation, deliverance, preservation", FEMININE, GENITIVE)),
        new Word(new WordForm("καθίζω", "I set, seat, appoint, sit down, settle", PRESENT), ZERO)
            .addForm(new WordForm("καθίσω", "I will set, seat, appoint, sit down, settle καθίζω", FUTURE))
            .addForm(new WordForm("ἐκάθισα", "I set, sat, appointed, sat down, settled καθίζω", AORIST))
            .addForm(new WordForm("κεκάθικα", "I have set, sat, appointed, sat down, settled καθίζω", PERFECT)),
        new Word(new WordForm("σταυρῶ", "I crucify", PRESENT), ZERO)
            .addForm(new WordForm("σταυρώσω", "I will crucify σταυρῶ", FUTURE))
            .addForm(new WordForm("ἐσταύρωσα", "I crucifid σταυρῶ", AORIST))
            .addForm(new WordForm("ἐσταυρώθην", "I was crucifid σταυρῶ", PASSIVE, AORIST))
            .addForm(new WordForm("ἐσταύρωμαι", "I have been crucifid σταυρῶ", MIDDLE, PASSIVE, PERFECT)),
        new Word(new WordForm("μικρός", "small, little", ADJECTIVE, MASCULINE), WEAK)
            .addForm(new WordForm("μικρά", "small, little", ADJECTIVE, FEMININE))
            .addForm(new WordForm("μικρόν", "small, little", ADJECTIVE, NEUTER)),
        // 45
        new Word(new WordForm("θλῖψις", "trouble that inflicts distress, oppression, afflication, tribulation", FEMININE), ZERO)
            .addForm(new WordForm("θλῖψεως", "trouble that inflicts distress, oppression, afflication, tribulation", FEMININE, GENITIVE)),
        new Word(new WordForm("ναός", "temple, diety's palace", MASCULINE), ZERO)
            .addForm(new WordForm("ναοῦ", "temple, diety's palace", MASCULINE, GENITIVE)),
        new Word(new WordForm("ἀπαγγέλλω", "I tell, bring news, report", PRESENT), ZERO)
            .addForm(new WordForm("ἀπαγγελῶ", "I will tell, bring news, report ἀπαγγέλλω", FUTURE))
            .addForm(new WordForm("ἀπήγγειλα", "I told, brought news, reported ἀπαγγέλλω", AORIST))
            .addForm(new WordForm("ἀπηγγέλην", "I was told, brought news, reported ἀπαγγέλλω", PASSIVE, AORIST)),
        new Word(new WordForm("διώκω", "I pursue, persecute", PRESENT), ZERO)
            .addForm(new WordForm("διώξω", "I will pursue, persecute διώκω", FUTURE))
            .addForm(new WordForm("ἐδιώξα", "I pursued, persecuted διώκω", AORIST))
            .addForm(new WordForm("ἐδιώχθην", "I was pursued, persecuted διώκω", PASSIVE, AORIST))
            .addForm(new WordForm("δεδίωγμαι", "I have been pursued, persecuted διώκω", MIDDLE, PASSIVE, PERFECT)),
        new Word(new WordForm("ὅμοιος", "of the same nature, like, similar", ADJECTIVE, MASCULINE), ZERO)
            .addForm(new WordForm("ὁμοία", "of the same nature, like, similar", ADJECTIVE, FEMININE))
            .addForm(new WordForm("ὅμοιον", "of the same nature, like, similar", ADJECTIVE, NEUTER)),
        // 44
        new Word(new WordForm("ἐπιγινώσκω", "I understand, recognize", PRESENT), ZERO)
            .addForm(new WordForm("ἐπιγινώσομαι", "I will understand, recognize ἐπιγινώσκω", FUTURE, DEPONENT))
            .addForm(new WordForm("ἐπέγνων", "I understood, recognized ἐπιγινώσκω", AORIST))
            .addForm(new WordForm("ἐπέγνωκα", "I have understood, recognized ἐπιγινώσκω", PERFECT))
            .addForm(new WordForm("ἐπεγινώσθην", "I was understood, recognized ἐπιγινώσκω", PASSIVE, AORIST)),
        new Word(new WordForm("κατοικῶ", "I dwell, settle, inhabit κατοικέω", PRESENT), ZERO)
            .addForm(new WordForm("κατῷκησα", "I dwelt, settled, inhabited κατοικέω", AORIST))


    );
  }
}
