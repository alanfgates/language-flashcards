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

class GreekBuilderHelperVocab {
  static List<Word> getVocab() {
    return Arrays.asList(
        new Word("ὁ", "the", MASCULINE, NOMINATIVE, SINGULAR),
        new Word("τοῦ")
            .addForm("the", MASCULINE, GENITIVE, SINGULAR)
            .addForm("the", NEUTER, GENITIVE, SINGULAR),
        new Word("τῷ")
            .addForm("the", MASCULINE, DATIVE, SINGULAR)
            .addForm("the", NEUTER, DATIVE, SINGULAR),
        new Word("τόν", "the", MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("ὁι", "the", MASCULINE, NOMINATIVE, PLURAL),
        new Word("τῶν")
            .addForm("the", MASCULINE, GENITIVE, PLURAL)
            .addForm("the", FEMININE, GENITIVE, PLURAL)
            .addForm("the", NEUTER, GENITIVE, PLURAL),
        new Word("τοῖς")
            .addForm("the", MASCULINE, DATIVE, PLURAL)
            .addForm("the", NEUTER, DATIVE, PLURAL),
        new Word("τούς", "the", MASCULINE, ACCUSATIVE, PLURAL),
        new Word("ἡ", "the", FEMININE, NOMINATIVE, SINGULAR),
        new Word("τῆς", "the", FEMININE, GENITIVE, SINGULAR),
        new Word("τῇ", "the", FEMININE, DATIVE, SINGULAR),
        new Word("τήν", "the", FEMININE, ACCUSATIVE, SINGULAR),
        new Word("ἁι", "the", FEMININE, NOMINATIVE, PLURAL),
        new Word("ταῖς", "the", FEMININE, DATIVE, PLURAL),
        new Word("τάς", "the", FEMININE, ACCUSATIVE, PLURAL),
        new Word("τό")
            .addForm("the", NEUTER, NOMINATIVE, SINGULAR)
            .addForm("the", NEUTER, ACCUSATIVE, SINGULAR),
        new Word("τά")
            .addForm("the", NEUTER, NOMINATIVE, PLURAL)
            .addForm("the", NEUTER, ACCUSATIVE, PLURAL),
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
        new Word("ἐν", "in", DATIVE),
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
        new Word("ἦς")
            .addForm("you were", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, SINGULAR)
            .addForm("you might be", SUBJUNCTIVE, ACTIVE, PRESENT, SECOND_PERSON, SINGULAR),
        new Word("ἦν", "s/he was", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, SINGULAR),
        new Word("ἦμεν", "We were", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("ἤμεθα", "We were", INDICATIVE, ACTIVE, AORIST, FIRST_PERSON, PLURAL),
        new Word("ἦτε")
            .addForm("you were", INDICATIVE, ACTIVE, AORIST, SECOND_PERSON, PLURAL)
            .addForm("you might be", SUBJUNCTIVE, ACTIVE, PRESENT, SECOND_PERSON, PLURAL),
        new Word("ἦσαν", "They were", INDICATIVE, ACTIVE, AORIST, THIRD_PERSON, PLURAL),

        new Word("ὤν", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, SINGULAR),
        new Word("ὄντος")
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, GENITIVE, SINGULAR)
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, GENITIVE, SINGULAR),
        new Word("ὄντι")
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, SINGULAR)
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, SINGULAR),
        new Word("ὄντα")
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, ACCUSATIVE, SINGULAR)
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, PLURAL)
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, ACCUSATIVE, PLURAL),
        new Word("ὄντες", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, NOMINATIVE, PLURAL),
        new Word("ὄντων")
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, GENITIVE, PLURAL)
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, GENITIVE, PLURAL),
        new Word("οὖσι")
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, PLURAL)
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, PLURAL),
        new Word("οὖσιν")
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, DATIVE, PLURAL)
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, DATIVE, PLURAL),
        new Word("ὄντας", "being", PARTICIPLE, ACTIVE, PRESENT, MASCULINE, ACCUSATIVE, PLURAL),

        new Word("οὖσα", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, SINGULAR),
        new Word("οὔσης", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, GENITIVE, SINGULAR),
        new Word("οὔσῃ", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, DATIVE, SINGULAR),
        new Word("οὖσαν", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, ACCUSATIVE, SINGULAR),
        new Word("οὖσαι", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, NOMINATIVE, PLURAL),
        new Word("οὐσῶν", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, GENITIVE, PLURAL),
        new Word("οὔσαις", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, DATIVE, PLURAL),
        new Word("οὔσας", "being", PARTICIPLE, ACTIVE, PRESENT, FEMININE, ACCUSATIVE, PLURAL),

        new Word("ὄν")
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, NOMINATIVE, SINGULAR)
            .addForm("being", PARTICIPLE, ACTIVE, PRESENT, NEUTER, ACCUSATIVE, SINGULAR),

        new Word("ὦ", "I might be", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, SINGULAR),
        // second person singular see indicative active aorist above
        new Word("ᾖ", "s/he might be", SUBJUNCTIVE, ACTIVE, PRESENT, THIRD_PERSON, SINGULAR),
        new Word("ὦμεν", "we might be", SUBJUNCTIVE, ACTIVE, PRESENT, FIRST_PERSON, PLURAL),
        // second person plural see indicative active aorist above
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
        new Word("λέγω", "I say - root *λεγ", PRESENT),
        new Word("ἐρῶ", "I will say - λέγω root *ερ", FUTURE),
        new Word("εἶπον", "I said - λέγω root *ιπ", SECOND_AORIST),
        new Word("εἴρηκα", "I have said - λέγω root *ερ", PERFECT),
        new Word("εἴρημαι", "I have been said - λέγω root *ερ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐρρέθην", "I was said - λέγω root *ερ", PASSIVE, AORIST),
        // 1768
        new Word("εἰς", "into ", ACCUSATIVE),
        // 1391
        new Word("οὗτος", "this", MASCULINE),
        new Word("αὕτη", "this", FEMININE),
        new Word("τοῦτο", "this", NEUTER),
        // 1365
        new Word("ὁς", "who, which", MASCULINE, NOMINATIVE, SINGULAR),
        new Word("ὁυ")
            .addForm("who, which", MASCULINE, GENITIVE, SINGULAR)
            .addForm("who, which", NEUTER, GENITIVE, SINGULAR),
        new Word("ᾡ")
            .addForm("who, which", MASCULINE, DATIVE, SINGULAR)
            .addForm("who, which", NEUTER, DATIVE, SINGULAR),
        new Word("ὁν", "who, which", MASCULINE, ACCUSATIVE, SINGULAR),
        new Word("ἥ", "who, which", FEMININE, NOMINATIVE, SINGULAR),
        new Word("ἡς", "who, which", FEMININE, GENITIVE, SINGULAR),
        new Word("ᾑ", "who, which", FEMININE, DATIVE, SINGULAR),
        new Word("ἡν", "who, which", FEMININE, ACCUSATIVE, SINGULAR),
        new Word("ὅ")
            .addForm("who, which", NEUTER, NOMINATIVE, SINGULAR)
            .addForm("who, which", NEUTER, ACCUSATIVE, SINGULAR),
        new Word("ὅι", "who, which", MASCULINE, NOMINATIVE, PLURAL),
        new Word("ὡν")
            .addForm("who, which", MASCULINE, GENITIVE, PLURAL)
            .addForm("who, which", FEMININE, GENITIVE, PLURAL)
            .addForm("who, which", NEUTER, GENITIVE, PLURAL),
        new Word("ὁις")
            .addForm("who, which", MASCULINE, DATIVE, PLURAL)
            .addForm("who, which", NEUTER, DATIVE, PLURAL),
        new Word("ὁυς", "who, which", MASCULINE, ACCUSATIVE, PLURAL),
        new Word("ἅι", "who, which", FEMININE, NOMINATIVE, PLURAL),
        new Word("ἁις", "who, which", FEMININE, DATIVE, PLURAL),
        new Word("ἁς", "who, which", FEMININE, ACCUSATIVE, PLURAL),
        new Word("ἁ")
            .addForm("who, which", NEUTER, NOMINATIVE, PLURAL)
            .addForm("who, which", NEUTER, ACCUSATIVE, PLURAL),
        // 1318
        new Word("Θεός", "God", MASCULINE),
        new Word("Θεοῦ", "God", MASCULINE, GENITIVE),
        // 1297
        // for ὅτι see ὅστις below
        // 1283
        new Word("πᾶς", "all every each", MASCULINE),
        new Word("πᾶσα", "all every each", FEMININE),
        new Word("πᾶν", "all every each", NEUTER),
        // 1042
        new Word("γάρ", "for, because"),
        // 916
        new Word("ἐκ", "out of, from", GENITIVE),
        new Word("ἐξ", "out of, from", GENITIVE),
        // 891
        new Word("ἐπί")
          .addForm("onto", ACCUSATIVE)
          .addForm("over", GENITIVE)
          .addForm("at", DATIVE),
        // 719
        new Word("κύριος", "lord", MASCULINE),
        new Word("κύριου", "lord", MASCULINE, GENITIVE),
        // 708
        // TODO add subjunctive, because it's pretty different
        new Word("*σεχ",	"to have", ROOT),
        new Word("ἔχω",	"I have - root *σεχ", PRESENT),
        new Word("ἕξω",	"I will have - ἔχω root *σεχ", FUTURE),
        new Word("ἔσχον", "I had - ἔχω root *σεχ", SECOND_AORIST),
        new Word("ἔσχηκα", "I have had - ἔχω root *σεχ", PERFECT),
        // 699
        new Word("πρός", "to, towards", ACCUSATIVE),
        // 669
        new Word("*γεν",	"to become, to be", ROOT),
        new Word("γίνομαι",	"I become, I am - root *γεν", PRESENT, DEPONENT),
        new Word("γενήσομαι", "I will become - γίνομαι root *γεν", FUTURE, DEPONENT),
        new Word("ἐγένομην", "I became - γίνομαι root *γεν", AORIST, DEPONENT),
        new Word("γέγονα", "I have become - γίνομαι root *γεν", SECOND_PERFECT),
        new Word("γεγένημαι", "I have been made, caused to happen - γίνομαι root *γεν", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐγενήθην", "I happened, became - γίνομαι root *γεν", PASSIVE, AORIST),
        new Word("γενεά", "genus, generation, age", FEMININE),
        new Word("γενεᾶς", "genus, generation, age", FEMININE, GENITIVE),
        // 668
        new Word("διά")
            .addForm("on account of", ACCUSATIVE)
            .addForm("through", GENITIVE),
        // 663
        new Word("ἵνα", "in order that"),
        // 646
        new Word("ἀπό", "from", GENITIVE),
        // 638
        new Word("ἀλλά", "but (strong)"),
        // 634
        new Word("*ερχ", "To come, to go", ROOT, PRESENT),
        new Word("*ελευθ", "to come/go ", ROOT, FUTURE, AORIST, PERFECT),
        new Word("ἔρχομαι", "I come, I go - root *ερχ", PRESENT, DEPONENT),
        new Word("ἐλεύσομαι", "I will come/go - ἔρχομαι root *ελευθ", FUTURE, DEPONENT),
        new Word("ἦλθον", "I came/went - ἔρχομαι root *ελευθ", SECOND_AORIST),
        new Word("ἐλήλυθα", "I have come/gone - ἔρχομαι root *ελευθ", SECOND_PERFECT),
        // 579
        new Word("τίς")
            .addForm("who? what?", MASCULINE, NOMINATIVE, SINGULAR)
            .addForm("who? what?", FEMININE, NOMINATIVE, SINGULAR),
        new Word("τίνος")
            .addForm("who? what?", MASCULINE, GENITIVE, SINGULAR)
            .addForm("who? what?", FEMININE, GENITIVE, SINGULAR)
            .addForm("who? what?", NEUTER, GENITIVE, SINGULAR),
        new Word("τίνι")
            .addForm("who? what?", MASCULINE, DATIVE, SINGULAR)
            .addForm("who? what?", FEMININE, DATIVE, SINGULAR)
            .addForm("who? what?", NEUTER, DATIVE, SINGULAR),
        new Word("τίνα")
            .addForm("who? what?", MASCULINE, ACCUSATIVE, SINGULAR)
            .addForm("who? what?", FEMININE, ACCUSATIVE, SINGULAR)
            .addForm("who? what?", NEUTER, NOMINATIVE, PLURAL)
            .addForm("who? what?", NEUTER, ACCUSATIVE, PLURAL),
        new Word("τί")
            .addForm("who? what?", NEUTER, NOMINATIVE, SINGULAR)
            .addForm("who? what?", NEUTER, ACCUSATIVE, SINGULAR),
        new Word("τίνες")
            .addForm("who? what?", MASCULINE, NOMINATIVE, PLURAL)
            .addForm("who? what?", FEMININE, NOMINATIVE, PLURAL),
        new Word("τίνων")
            .addForm("who? what?", MASCULINE, GENITIVE, PLURAL)
            .addForm("who? what?", FEMININE, GENITIVE, PLURAL)
            .addForm("who? what?", NEUTER, GENITIVE, PLURAL),
        new Word("τίσι")
            .addForm("who? what?", MASCULINE, DATIVE, PLURAL)
            .addForm("who? what?", FEMININE, DATIVE, PLURAL)
            .addForm("who? what?", NEUTER, DATIVE, PLURAL),
        new Word("τίνας")
            .addForm("who? what?", MASCULINE, ACCUSATIVE, PLURAL)
            .addForm("who? what?", FEMININE, ACCUSATIVE, PLURAL),
        // 572
        new Word("*ποιε", "to do, to make", ROOT),
        new Word("ποιω", "I do, I make - root *ποιε", PRESENT),
        new Word("ποιήσω", "I will make/do - ποιω root *ποιε", FUTURE),
        new Word("ἐποίησα", "I did/made - ποιω root *ποιε", AORIST),
        new Word("πεποίηκα", "I have done/made - ποιω root *ποιε", PERFECT),
        new Word("πεποίημαι", "I have been done/made - ποιω root *ποιε", MIDDLE, PASSIVE, PERFECT),
        // 550
        new Word("ἄνθρωπος", "human being", MASCULINE),
        new Word("ἄνθρωποῦ", "human being", MASCULINE, GENITIVE),
        // 538
        new Word("τις")
            .addForm("someone something", MASCULINE, NOMINATIVE, SINGULAR)
            .addForm("someone something", FEMININE, NOMINATIVE, SINGULAR),
        new Word("τινος")
            .addForm("someone something", MASCULINE, GENITIVE, SINGULAR)
            .addForm("someone something", FEMININE, GENITIVE, SINGULAR)
            .addForm("someone something", NEUTER, GENITIVE, SINGULAR),
        new Word("τινι")
            .addForm("someone something", MASCULINE, DATIVE, SINGULAR)
            .addForm("someone something", FEMININE, DATIVE, SINGULAR)
            .addForm("someone something", NEUTER, DATIVE, SINGULAR),
        new Word("τινα")
            .addForm("someone something", MASCULINE, ACCUSATIVE, SINGULAR)
            .addForm("someone something", FEMININE, ACCUSATIVE, SINGULAR)
            .addForm("someone something", NEUTER, NOMINATIVE, PLURAL)
            .addForm("someone something", NEUTER, ACCUSATIVE, PLURAL),
        new Word("τι")
            .addForm("someone something", NEUTER, NOMINATIVE, SINGULAR)
            .addForm("someone something", NEUTER, ACCUSATIVE, SINGULAR),
        new Word("τινες")
            .addForm("someone something", MASCULINE, NOMINATIVE, PLURAL)
            .addForm("someone something", FEMININE, NOMINATIVE, PLURAL),
        new Word("τινων")
            .addForm("someone something", MASCULINE, GENITIVE, PLURAL)
            .addForm("someone something", FEMININE, GENITIVE, PLURAL)
            .addForm("someone something", NEUTER, GENITIVE, PLURAL),
        new Word("τισι")
            .addForm("someone something", MASCULINE, DATIVE, PLURAL)
            .addForm("someone something", FEMININE, DATIVE, PLURAL)
            .addForm("someone something", NEUTER, DATIVE, PLURAL),
    new Word("τινας")
            .addForm("someone something", MASCULINE, ACCUSATIVE, PLURAL)
            .addForm("someone something", FEMININE, ACCUSATIVE, PLURAL),
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
        new Word("κατά")
            .addForm("according to", ACCUSATIVE)
            .addForm("down from", GENITIVE),
        // 473
        new Word("μετά")
            .addForm("after", ACCUSATIVE)
            .addForm("with", GENITIVE),
        // 455
        new Word("*ορα",	"to see ", ROOT),
        new Word("*οπ",	"to see ", ROOT),
        new Word("*ιδ",	"to see ", ROOT),
        new Word("ὁρω",	"I see - root *ορα", PRESENT),
        new Word("ὄψομαι",	"I will see - ὁρω root *οπ", FUTURE, DEPONENT),
        new Word("εἶδον",	"I saw - ὁρω root *ιδ", SECOND_AORIST),
        new Word("ἑώρακα",	"I have seen - ὁρω root *ορα", PERFECT),
        new Word("ὤφθην",	"I was seen - ὁρω root *οπ", PASSIVE, AORIST),
        // 428
        new Word("*ακου", "to hear ", ROOT),
        new Word("ἀκούω", "I hear - root *ακου", PRESENT),
        new Word("ἀκούσω", "I will hear - ἀκούω root *ακου", FUTURE),
        new Word("ἤκουσα", "I heard - ἀκούω root *ακου", AORIST),
        new Word("ἀκήκοα", "I have heard - ἀκούω root *ακου", SECOND_PERFECT),
        new Word("ἠκούσθην", "I was heard - ἀκούω root *ακου", PASSIVE, AORIST),
        // 418
        new Word("πολύς", "many, much", MASCULINE),
        new Word("πολλή", "many, much", FEMININE),
        new Word("πολύ", "many, much", NEUTER),
        // 417
        new Word("*δο", "to give ", ROOT),
        new Word("δίδωμι", "I give - root *δο", PRESENT),
        new Word("δώσω", "I will give - δίδωμι root *δο", FUTURE),
        new Word("ἔδωκα", "I gave - δίδωμι root *δο", AORIST),
        new Word("δέδωκα", "I have given - δίδωμι root *δο", PERFECT),
        new Word("δέδομαι", "I have been given - δίδωμι root *δο", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐδόθην", "I was given - δίδωμι root *δο", PASSIVE, AORIST),
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
        new Word("περί")
            .addForm("around", ACCUSATIVE)
            .addForm("concerning, about", GENITIVE),
        // 324
        new Word("οἶδα", "I know", PRESENT),
        // 319
        new Word("ἑαυτοῦ")
            .addForm("himself", MASCULINE, GENITIVE)
            .addForm("itself", NEUTER, GENITIVE),
        new Word("ἑαυτῆς", "herself", FEMININE, GENITIVE),
        // 296
        new Word("*λαλε", "to speak ", ROOT),
        new Word("λαλω", "I speak - root *λαλε", PRESENT),
        new Word("λαλήσω", "I will speak - λαλω root *λαλε", FUTURE),
        new Word("ἐλάλησα", "I spoke - λαλω root *λαλε", AORIST),
        new Word("λελάληκα", "I have spoken - λαλω root *λαλε", PERFECT),
        new Word("λελάλημαι", "I have been spoken - λαλω root *λαλε", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐλαλήθην", "I was spoken - λαλω root *λαλε", PASSIVE, AORIST),
        // 273
        new Word("οὐρανός", "heaven", MASCULINE),
        new Word("οὐρανοῦ", "heaven", MASCULINE, GENITIVE),
        // 261
        new Word("μαθητής", "student, disciple", MASCULINE),
        new Word("μαθητοῦ", "student, disciple", MASCULINE, GENITIVE),
        // 258
        new Word("*λαβ", "to take, to receive ", ROOT),
        new Word("λαμβάνω", "I take, I receive - root *λαβ", PRESENT),
        new Word("λήμψομαι", "I will take/receive - λαμβάνω root *λαβ", FUTURE, DEPONENT),
        new Word("ἔλαβον", "I took/received - λαμβάνω root *λαβ", SECOND_AORIST),
        new Word("εἴληφα", "I have taken/received - λαμβάνω root *λαβ", SECOND_PERFECT),
        new Word("εἴλημμαι", "I have been taken/received - λαμβάνω root *λαβ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐλήμφθην", "I was taken/received - λαμβάνω root *λαβ", PASSIVE, AORIST),
        // 250
        new Word("γῆ", "land, earth", FEMININE),
        new Word("γῆς", "land, earth", FEMININE, GENITIVE),
        // 249
        new Word("*πιστευ", "to believe ", ROOT),
        new Word("πιστεύω", "I believe - root *πιστευ", PRESENT),
        new Word("πιστεύσω", "I will believe - πιστεύω root *πιστευ", FUTURE),
        new Word("ἐπίστευσα", "I believed - πιστεύω root *πιστευ", AORIST),
        new Word("πεπίστευκα", "I have believed - πιστεύω root *πιστευ", PERFECT),
        new Word("πεπίστευμαι", "I have been believed - πιστεύω root *πιστευ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐπιστεύθην", "I was believed - πιστεύω root *πιστευ", PASSIVE, AORIST),
        // 245
        new Word("μέγας", "large, great", MASCULINE),
        new Word("μεγάλη", "large, great", FEMININE),
        new Word("μέγα", "large, great", NEUTER),
        // 243
        new Word("πίστις", "faith, trust", FEMININE),
        new Word("πίστεως", "faith, trust", FEMININE, GENITIVE),
        // 242
        new Word("*γνω", "to know ", ROOT),
        new Word("γινώσκω", "I know - root *γνω", PRESENT),
        new Word("γνώσομαι", "I will know - γινώσκω root *γνω", FUTURE, DEPONENT),
        new Word("ἔγνων", "I knew - γινώσκω root *γνω", SECOND_AORIST),
        new Word("ἔγνωσκα", "I have known - γινώσκω root *γνω", PERFECT),
        new Word("ἔγνωσμαι", "I have been known - γινώσκω root *γνω", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐγνώσθην", "I was known - γινώσκω root *γνω", PASSIVE, AORIST),
        // 234
        new Word("ὄνομα", "name", MASCULINE),
        new Word("ὄνοματος", "name", MASCULINE, GENITIVE),
        // 233
        new Word("ἅγιος", "holy", ADJECTIVE, MASCULINE),
        new Word("ἅγια", "holy", ADJECTIVE, FEMININE),
        new Word("ἅγιον", "holy", ADJECTIVE, NEUTER),
        // 231
        new Word("απο + *κριν", "to answer ", ROOT),
        new Word("ἀποκρίνομαι", "I answer - root απο + *κριν", PRESENT, DEPONENT),
        new Word("ἀπεκρινἀμην", "I answered - ἀποκρίνομαι root απο + *κριν", AORIST, DEPONENT),
        new Word("ἀπεκρίθην", "I was answered - ἀποκρίνομαι root απο + *κριν", PASSIVE, AORIST),
        // 220
        new Word("ὑπό")
            .addForm("under", ACCUSATIVE)
            .addForm("by", GENITIVE),
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
        new Word("δύναμαι", "I am able - root *δυν", PRESENT, DEPONENT),
        new Word("δυνήσομαι", "I will be able - δύναμαι root *δυν", FUTURE, DEPONENT),
        new Word("ἠδυνήθην",	"I was able - δύναμαι root *δυν", PASSIVE, AORIST, DEPONENT),
        // 208
        new Word("*εθελε", "to want ", ROOT),
        new Word("θέλω", "I want - root *εθελε", PRESENT),
        new Word("ἠθέλησα", "I wanted - θέλω root *εθελε", AORIST),
        new Word("ὅυτω", "thus"),
        new Word("ὅυτως", "thus"),
        // 195
        new Word("Ἰοὐδαῖος", "jewish", ADJECTIVE, MASCULINE),
        new Word("Ἰοὐδαῖα", "jewish", ADJECTIVE, FEMININE),
        new Word("Ἰοὐδαῖον", "jewish", ADJECTIVE, NEUTER),
        // 194
        new Word("παρά")
            .addForm("alongside of", ACCUSATIVE)
            .addForm("from", GENITIVE)
            .addForm("in the presence of", DATIVE),
        new Word("εισερχομαι", "I enter", PRESENT),
        new Word("εἰσελεύσομαι", "I will enter εισερχομαι", FUTURE),
        new Word("εἰσῆλθον", "I entered εισερχομαι", AORIST),
        new Word("εἰσελήλυθα", "I have entered εισερχομαι", PERFECT),
        // 191
        new Word("*γραφ", "to write "),
        new Word("γραφω", "I write - root *γραφ", PRESENT),
        new Word("γράψω", "I will write - γραφω root *γραφ", FUTURE),
        new Word("ἔγραψα", "I wrote - γραφω root *γραφ", AORIST),
        new Word("γέγραφα", "I have written - γραφω root *γραφ", SECOND_PERFECT),
        new Word("γέγραμμαι", "I have been written - γραφω root *γραφ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐγράφην", "I was written - γραφω root *γραφ", PASSIVE, AORIST),
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
        new Word("ἑυρίσκω", "I find - root *ευρ", PRESENT),
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
        new Word("ἁμαρτωλός", "sinful or out of bounds behavior, as substantive sinner or outsider", ADJECTIVE, MASCULINE, FEMININE),
        new Word("ἁμαρτωλόν", "sinful or out of bounds behavior, as substantive sinner or outsider", ADJECTIVE, NEUTER),
        // 166
        new Word("δόξα", "glory", FEMININE),
        new Word("δόξης", "glory", FEMININE, GENITIVE),
        new Word("ἄν", "if, would, might"),
        // 163
        new Word("πόλις", "city", FEMININE),
        new Word("πόλεως", "city", FEMININE, GENITIVE),
        // 162
        new Word("βασιλεία", "kingdom", FEMININE),
        new Word("βασιλευς", "king", MASCULINE), // 115
        new Word("βασιλεως", "king", MASCULINE, GENITIVE),
        new Word("βασιλείας", "kingdom", FEMININE, GENITIVE),
        new Word("ἔθνος", "people", NEUTER),
        new Word("ἔθνους", "people", NEUTER, GENITIVE),
        // 160
        new Word("τοτε", "then"),
        new Word("ἕως", "until"),
        // ?
        new Word("ὅστις", "whoever, everyone (ὅς + τις both parts decline)", ADJECTIVE, MASCULINE),
        new Word("ἥτις", "whoever, everyone (ἥ + τις both parts decline)", ADJECTIVE, FEMININE),
        new Word("ὅτι")
            .addForm("whoever, everyone (ὅ + τις both parts decline)", ADJECTIVE, NEUTER)
            .addForm("that, because"),
        // 159
        new Word("πρῶτος", "first", ADJECTIVE, MASCULINE),
        new Word("πρῶτη", "first", ADJECTIVE, FEMININE),
        new Word("πρῶτον", "first", ADJECTIVE, NEUTER),
        // 157
        new Word("καρδια", "heart", FEMININE),
        new Word("καρδιας", "heart", FEMININE, GENITIVE),
        new Word("*εσθι", "to eat ", ROOT),
        new Word("ἐσθιω", "I eat - root *εσθι", PRESENT),
        new Word("*φαγ", "to eat ", ROOT),
        new Word("φάγομαι", "I will eat - ἐσθιω root *φαγ", FUTURE, DEPONENT),
        new Word("ἔφαγον", "I ate - ἐσθιω root *φαγ", SECOND_AORIST),
        // 155
        new Word("*στα", "to stand ", ROOT),
        new Word("ἵστημι", "Transitive: I set, put, place Intransitive: I stand, I appear, I stop - root *στα", PRESENT),
        new Word("στήσω", "I will stand - ἵστημι root *στα", FUTURE),
        new Word("ἔστησα", "I put, set - ἵστημι root *στα", AORIST),
        new Word("ἔστην", "I stood - ἵστημι root *στα", SECOND_AORIST),
        new Word("ἕστηκα", "I have stood - ἵστημι root *στα", PERFECT),
        new Word("ἐστάθην", "I was put - ἵστημι root *στα", PASSIVE, AORIST),
        new Word("ἀλλος", "other", ADJECTIVE, MASCULINE),
        new Word("ἀλλη", "other", ADJECTIVE, FEMININE),
        new Word("ἀλλο", "other", ADJECTIVE, NEUTER),
        new Word("χαρις", "grace", FEMININE),
        new Word("χαριτος", "grace", FEMININE, GENITIVE),
        // 153
        new Word("*πορευ", "to go, to live ", ROOT),
        new Word("πορεύομαι", "I go, I live - root *πορευ", PRESENT, DEPONENT),
        new Word("πορεύσομαι", "I will go, live - πορεύομαι root *πορευ", FUTURE, DEPONENT),
        new Word("πεπόρευμαι", "I have gone, lived - πορεύομαι root *πορευ", MIDDLE, PASSIVE, PERFECT, DEPONENT),
        new Word("ἐπορεὐθην", "I went, lived - πορεύομαι root *πορευ", PASSIVE, AORIST, DEPONENT),
        // 150
        new Word("ὑπερ")
            .addForm("above", ACCUSATIVE)
            .addForm("in behalf of", GENITIVE),
        // 148
        new Word("*καλεϝ", "to call ", ROOT),
        new Word("καλέω", "I call - root *καλεϝ", PRESENT),
        new Word("καλἐσω", "I will call - καλέω root *καλεϝ", FUTURE),
        new Word("ἐκάλεσα", "I called - καλέω root *καλεϝ", AORIST),
        new Word("κέκληκα", "I have called - καλέω root *καλεϝ", PERFECT),
        new Word("κέκλημαι", "I have been called - καλέω root *καλεϝ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐκλήθην", "I was called - καλέω root *καλεϝ", PASSIVE, AORIST),
        // 147
        new Word("*ἀγαπα", "to love", ROOT),
        new Word("ἀγαπαω", "I love - root *ἀγαπα", PRESENT),
        new Word("ἀγαπήσω", "I will love - ἀγαπαω root *ἀγαπα", FUTURE),
        new Word("ἠγάπησα", "I loved - ἀγαπαω root *ἀγαπα", AORIST),
        new Word("ἠγάπηκα", "I have loved - ἀγαπαω root *ἀγαπα", PERFECT),
        new Word("ἠγάπημαι", "I have been loved - ἀγαπαω root *ἀγαπα", MIDDLE, PASSIVE, PERFECT),
        new Word("ἠγαπἠθην", "I was loved - ἀγαπαω root *ἀγαπα", PASSIVE, AORIST),
        new Word("νυν", "now"),
        // 144
        new Word("προφητης", "prophet", MASCULINE),
        new Word("προφητου", "prophet", MASCULINE, GENITIVE),
        new Word("*εγερ", "to raise ", ROOT),
        new Word("ἐγείρω", "I raise - root *εγερ", PRESENT),
        new Word("ἐγερῶ", "I will raise - ἐγείρω root *εγερ", FUTURE),
        new Word("ἤγειρα", "I raised - ἐγείρω root *εγερ", AORIST),
        new Word("ἐγήγερμαι", "I have been raised - ἐγείρω root *εγερ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἠγέρθην", "I was raised - ἐγείρω root *εγερ", PASSIVE, AORIST),
        // 143
        new Word("οὐδέ", "and not, neither"),
        new Word("απο + *σε", "to let go, divorce, forgive ", ROOT),
        new Word("ἀφιημι", "I let go, divorce, forgive - root απο + *σε", PRESENT),
        new Word("ἀφήσω", "I will forgive - ἀφιημι root απο + *σε", FUTURE),
        new Word("ἀφῆκα", "I forgave - ἀφιημι root απο + *σε", AORIST),
        new Word("ἀφέωμαι", "I have been forgiven - ἀφιημι root απο + *σε", MIDDLE, PASSIVE, PERFECT),
        new Word("ἀφέθην", "I was forgiven - ἀφιημι root απο + *σε", PASSIVE, AORIST),
        // 142
        new Word("λαος", "people", MASCULINE),
        new Word("λαου", "people", MASCULINE, GENITIVE),
        new Word("σωμα", "body", NEUTER),
        new Word("σωματος", "body", NEUTER, GENITIVE),
        // 141
        new Word("παλιν", "again"),
        // 140
        new Word("*ζα", "to live ", ROOT),
        new Word("ζάω", "I live - root *ζα", PRESENT),
        new Word("ζἠσω", "I will live - ζάω root *ζα", FUTURE),
        new Word("ἔζεσα", "I lived - ζάω root *ζα", AORIST),
        // 139
        new Word("φωνή", "sound, voice", FEMININE),
        new Word("φωνῆς", "sound, voice", FEMININE, GENITIVE),
        new Word("ζωή", "life", FEMININE),
        new Word("ζωῆς", "life", FEMININE, GENITIVE),
        // 135
        new Word("δύο", "two"),
        // 133
        new Word("*βλεπ", "to see ", ROOT),
        new Word("βλέπω", "I see - root *βλεπ", PRESENT),
        new Word("βλέψω", "I will see - βλέπω root *βλεπ", FUTURE),
        new Word("ἐβλέψα", "I saw - βλέπω root *βλεπ", AORIST),
        // 132
        new Word("απο + *στελ", "to send ", ROOT),
        new Word("ἀποστέλλω", "I send - root απο + *στελ", PRESENT),
        new Word("ἀποστελῶ", "I will send - ἀποστέλλω root απο + *στελ", FUTURE),
        new Word("άπέστειλα", "I sent - ἀποστέλλω root απο + *στελ", AORIST),
        new Word("ἀπέσταλκα", "I have sent - ἀποστέλλω root απο + *στελ", PERFECT),
        new Word("ἀπέσταλμαι", "I have been sent - ἀποστέλλω root απο + *στελ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἀπεστάλην", "I was sent - ἀποστέλλω root απο + *στελ", PASSIVE, SECOND_AORIST),
        // 129
        new Word("ἀμήν", "truly"),
        // 128
        new Word("νεκρός", "dead", ADJECTIVE, MASCULINE),
        new Word("νεκρά", "dead", ADJECTIVE, FEMININE),
        new Word("νεκρόν", "dead", ADJECTIVE, NEUTER),
        new Word("συν", "with", DATIVE),
        // 124
        new Word("δοῦλος", "slave", MASCULINE),
        new Word("δοῦλου", "slave", MASCULINE, GENITIVE),
        // 123
        new Word("ὅταν", "whenever"),
        // 122
        new Word("αἰών", "age", NOUN, MASCULINE),
        new Word("αἰῶνος", "age", NOUN, MASCULINE, GENITIVE),
        new Word("αἰώνος", "eternal", ADJECTIVE, MASCULINE, FEMININE),
        new Word("αἰώνον", "eternal", ADJECTIVE, NEUTER),
        new Word("ἀρχιερεύς", "high priest", MASCULINE),
        new Word("ἀρχιερέως", "high priest", MASCULINE, GENITIVE),
        new Word("*βαλ", "to throw ", ROOT),
        new Word("βάλλω", "I throw - root *βαλ", PRESENT),
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
        new Word("παραδιδωμι", "I hand over", PRESENT),
        new Word("παραδώσω", "I will hand over παραδιδωμι", FUTURE),
        new Word("παρέδωκα", "I handed over παραδιδωμι", AORIST),
        new Word("παραδέδωκα", "I have handed over παραδιδωμι", PERFECT),
        new Word("παραδέδομαι", "I have been handed over παραδιδωμι", MIDDLE, PASSIVE, PERFECT),
        new Word("παρεδόθην", "I was handed over παραδιδωμι", PASSIVE, AORIST),
        // 118
        new Word("*μεν", "to remain ", ROOT),
        new Word("μένω", "I remain - root *μεν", PRESENT),
        new Word("μενῶ", "I will remain - μένω root *μεν", FUTURE),
        new Word("ἔμεινα", "I remained - μένω root *μεν", AORIST),
        new Word("μεμένηκα", "I have remained - μένω root *μεν", PERFECT),
        // 117
        new Word("ἀπέρχομαι", "I depart, I go away", PRESENT),
        new Word("ἀπελεύσομαι", "I will depart ἀπέρχομαι", FUTURE),
        new Word("ἀπῆλθον", "I departed ἀπέρχομαι", AORIST),
        new Word("ἀπελήλθυα", "I have departed ἀπέρχομαι", PERFECT),
        new Word("*ζητε", "to seek ", ROOT),
        new Word("ζητῶ", "I seek - root *ζητε", PRESENT),
        new Word("ζητήσω", "I will seek - ζητῶ root *ζητε", FUTURE),
        new Word("ἐζήτησα", "I sought - ζητῶ root *ζητε", AORIST),
        new Word("ἐζητήθην", "I was sought - ζητῶ root *ζητε", PASSIVE, AORIST),
        // 116
        new Word("ἀγαπη", "love", FEMININE),
        new Word("ἀγαπης", "love", FEMININE, GENITIVE),
        new Word("ἀγαπητός", "beloved", ADJECTIVE, MASCULINE),
        new Word("ἀγαπητή", "beloved", ADJECTIVE, FEMININE),
        new Word("ἀγαπητόν", "beloved", ADJECTIVE, NEUTER),
        // 114
        new Word("ἐκκλησια", "assembly, church", FEMININE),
        new Word("ἐκκλησιας", "assembly, church", FEMININE, GENITIVE),
        new Word("ὀικος", "house", MASCULINE),
        new Word("ὀικου", "house", MASCULINE, GENITIVE),
        new Word("οἰκία", "house, family", FEMININE),
        new Word("οἰκὶας", "house, family", FEMININE, GENITIVE),
        new Word("ἴδιος", "one's own", ADJECTIVE, MASCULINE),
        new Word("ἰδία", "one's own", ADJECTIVE, FEMININE),
        new Word("ἴδιον", "one's own", ADJECTIVE, NEUTER),
        new Word("μόνος", "alone", ADJECTIVE, MASCULINE),
        new Word("μόνη", "alone", ADJECTIVE, FEMININE),
        new Word("μόνον", "alone", ADJECTIVE, NEUTER),
        new Word("*κριν", "to judge ", ROOT),
        new Word("κρίνω", "I judge - root *κριν", PRESENT),
        new Word("κρινῶ", "I will judge - κρίνω root *κριν", FUTURE),
        new Word("ἔκρινα", "I judged - κρίνω root *κριν", AORIST),
        new Word("κέκρικα", "I have judged - κρίνω root *κριν", PERFECT),
        new Word("κέκριμαι", "I have been judged - κρίνω root *κριν", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐκρίθην", "I was judged - κρίνω root *κριν", PASSIVE, AORIST),
        // 111
        new Word("απο + *θαν", "to die ", ROOT),
        new Word("ἀποθνῃσκω", "I die - root απο + *θαν", PRESENT),
        new Word("ἀποθανοῦμαι", "I will die - ἀποθνῃσκω root απο + *θαν", FUTURE, DEPONENT),
        new Word("άπέθανον", "I died - ἀποθνῃσκω root απο + *θαν", SECOND_AORIST),
        // 110
        new Word("ὁσος", "as/how much/great/far/long", ADJECTIVE, MASCULINE),
        new Word("ὁση", "as/how much/great/far/long", ADJECTIVE, FEMININE),
        new Word("ὁσον", "as/how much/great/far/long", ADJECTIVE, NEUTER),
        // 109
        new Word("ἀληθεια", "truth", FEMININE),
        new Word("ἀληθειας", "truth", FEMININE, GENITIVE),
        new Word("*μελλε", "to be about to, to intend ", ROOT),
        new Word("μελλω", "I am about to, I intend - root *μελλε", PRESENT),
        new Word("μελλήσω", "I will intend - μελλω root *μελλε", FUTURE),
        new Word("ὁλος", "whole, entire", ADJECTIVE, MASCULINE),
        new Word("ὁλη", "whole, entire", ADJECTIVE, FEMININE),
        new Word("ὁλον", "whole, entire", ADJECTIVE, NEUTER),
        new Word("παρακαλῶ", "I call, I beseech παρακαλέω", PRESENT),
        new Word("παρακαλέσω", "I will call, I will beseech παρακαλέω", FUTURE),
        new Word("παρεκάλεσα", "I beseeched παρακαλέω", AORIST),
        new Word("παρακέκληκα", "I have beseeched παρακαλέω", PERFECT),
        new Word("παρακέκλημαι", "I have been beseeched παρακαλέω", MIDDLE, PASSIVE, PERFECT),
        new Word("παρεκλήθην", "I was beseeched παρακαλέω", PASSIVE, AORIST),
        // 108
        new Word("ανα + *στα", "to raise, to stand up ", ROOT),
        new Word("ἀνίστημι", "I raise, I stand up ", PRESENT),
        new Word("ἀναστήσω", "I will raise/stand up ", FUTURE),
        new Word("ἀνέστησα", "I raised ", AORIST),
        new Word("ἀνέστηκα", "I have raised ", PERFECT),
        new Word("ἀνέστυμαι", "I have been raised ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἀνέστην", "I was raised ", PASSIVE, AORIST),
        // 106
        new Word("*σωζ", "to save ", ROOT),
        new Word("σῴζω", "I save - root *σωζ", PRESENT),
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
        new Word("αἴρω", "I take up, I take away - root *αρ", PRESENT),
        new Word("ἀρω", "I will take up - αἴρω root *αρ", FUTURE),
        new Word("ἦρα", "I took up - αἴρω root *αρ", AORIST),
        new Word("ἦρκα", "I have taken up - αἴρω root *αρ", PERFECT),
        new Word("ἦρμαι", "I have been taken up - αἴρω root *αρ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἤρθην", "I was taken up - αἴρω root *αρ", PASSIVE, AORIST),
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
        new Word("τίθημι", "I put, I place - root *θε", PRESENT),
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
        // 97
        new Word("ἀρτος", "bread", MASCULINE),
        new Word("ἀρτου", "bread", MASCULINE, GENITIVE),
        new Word("αἱμα", "blood", NEUTER),
        new Word("αἱματος", "blood", NEUTER, GENITIVE),
        new Word("*δακ", "to teach ", ROOT),
        new Word("διδασκω", "I teach - root *δακ", PRESENT),
        new Word("διδάξω", "I will teach - διδασκω root *δακ", FUTURE),
        new Word("ἐδίδαξα", "I taught - διδασκω root *δακ", AORIST),
        new Word("ἐδιδάχθην", "I was taught - διδασκω root *δακ", PASSIVE, AORIST),
        new Word("*γεννα", "to beget ", ROOT),
        new Word("γεννῶ", "I beget - root *γεννα", PRESENT),
        new Word("γεννήσω", "I will beget - γεννῶ root *γεννα", FUTURE),
        new Word("ἐγέννησα", "I begat - γεννῶ root *γεννα", AORIST),
        new Word("γεγέννηκα", "I have begotten - γεννῶ root *γεννα", PERFECT),
        new Word("γεγέννημαι", "I have been begotten - γεννῶ root *γεννα", PASSIVE, PERFECT),
        new Word("ἐγεννήθην", "I was begotten - γεννῶ root *γεννα", PASSIVE, AORIST),
        // 95
        new Word("περι + *πατε", "to walk around ", ROOT),
        new Word("περιπατω", "I walk around - root περι + *πατε", PRESENT),
        new Word("περιπατήσω", "I will walk around - περιπατω root περι + *πατε", FUTURE),
        new Word("περιεπάτησα", "I walked around - περιπατω root περι + *πατε", AORIST),
        new Word("*φοβε", "to fear ", ROOT),
        new Word("φοβέομαι", "I fear - root *φοβε", PRESENT, DEPONENT),
        new Word("ἐφοβήθην", "I feared - φοβέομαι root *φοβε", PASSIVE, AORIST, DEPONENT),
        // 93
        new Word("ἔτι", "still, yet"),
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
        new Word("κάθημαι", "I sit down "),
        new Word("κάθησομαι", "I will sit down ", FUTURE),
        // 90
        new Word("*ἀκολουθε", "to follow ", ROOT),
        new Word("ἀκολουθω", "I follow - root *ἀκολουθε", PRESENT),
        new Word("ἀκολουθήσω", "I will follow - ἀκολουθω root *ἀκολουθε", FUTURE),
        new Word("ἠκολούθησα", "I followed - ἀκολουθω root *ἀκολουθε", AORIST),
        new Word("ἠκολούθηκα", "I have followed - ἀκολουθω root *ἀκολουθε", PERFECT),
        new Word("απο + *ὀλ", "to destroy ", ROOT),
        new Word("ἀπόλλυμι", "I destroy, middle I perish, I die - root απο + *ὀλ", PRESENT),
        new Word("ἀπολέσω", "I will destroy - ἀπόλλυμι root απο + *ὀλ", FUTURE),
        new Word("ἀπώλεσα", "I destroyed - ἀπόλλυμι root απο + *ὀλ", AORIST),
        new Word("ἀπόλωλα", "I have destroyed - ἀπόλλυμι root απο + *ὀλ", PERFECT),
        new Word("*πετ", "to fall ", ROOT),
        new Word("πίπτω", "I fall - root *πετ", PRESENT),
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
        new Word("ἄρχομαι", "I begin (active I rule, but rare) - root *αρχ", MIDDLE, PRESENT),
        new Word("ἄρξομαι", "I will begin - ἄρχομαι root *αρχ", FUTURE, MIDDLE),
        new Word("ἠρξάμην", "I began - ἄρχομαι root *αρχ", AORIST, MIDDLE),
        new Word("*πληρο", "to fill, fulfill ", ROOT),
        new Word("πληρω", "I fill, fulfill - root *πληρο", PRESENT),
        new Word("πληρώσω", "I will fill - πληρω root *πληρο", FUTURE),
        new Word("ἐπλήρωσα", "I filled - πληρω root *πληρο", AORIST),
        new Word("πεπλήρωκα", "I have filled - πληρω root *πληρο", PERFECT),
        new Word("πεπλήρωμαι", "I have been filled - πληρω root *πληρο", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐπληρώθην", "I was filled - πληρω root *πληρο", PASSIVE, AORIST),
        new Word("προσέρχομαι", "I come to", PRESENT),
        new Word("προσήλθον", "I came to προσέρχομαι", AORIST),
        new Word("προσελήλυθα", "I have come to προσέρχομαι", PERFECT),
        // 85
        new Word("καιρός", "time (point and period)", MASCULINE),
        new Word("καιροῦ", "time (point and period)", MASCULINE, GENITIVE),
        new Word("προσ + *ευχ", "to pray ", ROOT),
        new Word("προσεύχομαι", "I pray - root προσ + *ευχ", PRESENT, DEPONENT),
        new Word("προσεύξομαι", "I will pray - προσεύχομαι root προσ + *ευχ", FUTURE, DEPONENT),
        new Word("προσηυξάμην", "I prayed - προσεύχομαι root προσ + *ευχ", AORIST, DEPONENT),
        // 83
        new Word("μήτηρ", "mother", FEMININE),
        new Word("μητρός", "mother", FEMININE, GENITIVE),
        new Word("ὥστε", "so that, in order that, thus"),
        // 82
        new Word("ανα + *βα", "to go up, rise up, advance ", ROOT),
        new Word("ἀναβαίνω", "I go up, rise up, advance - root ανα + *βα", PRESENT),
        new Word("ἀναβήσομαι", "I will go up, rise up, advance - ἀναβαίνω root ανα + *βα", FUTURE, DEPONENT),
        new Word("ἀνέβην", "I went up, rose up, advanced - ἀναβαίνω root ανα + *βα", SECOND_AORIST),
        new Word("ἀναβέβηκα", "I have gone up, risen up, advanced - ἀναβαίνω root ανα + *βα", PERFECT),
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
        new Word("καταβαίνω", "I come/go down "),
        new Word("καταβήσομαι", "I will come/go down ", FUTURE, DEPONENT),
        new Word("κατέβην", "I came/went down ", SECOND_AORIST),
        new Word("καταβέβηκα", "I have come/gone down ", PERFECT),
        new Word("μᾶλλον", "more, rather"),
        // 80
        new Word("άποστολος", "apostle", MASCULINE),
        new Word("άποστολου", "apostle", MASCULINE, GENITIVE),
        // 79
        new Word("*πεμπ", "to send ", ROOT),
        new Word("πέμπω", "I send - root *πεμπ", PRESENT),
        new Word("πέμψω", "I will send - πέμπω root *πεμπ", FUTURE),
            // TODO Check, I suspect this should be ἔπεμψα instead.
        new Word("ἕπεμψα", "I sent - πέμπω root *πεμπ", AORIST),
        new Word("ἐπέμφθην", "I was sent - πέμπω root *πεμπ", PASSIVE, AORIST),
        new Word("ὑπο + *αγ", "to go away, to draw off ", ROOT),
        new Word("ὑπάγω", "I go away, I draw off - root ὑπο + *αγ", PRESENT),
        new Word("ὑπάξω", "I will go away, I will draw off - ὑπάγω root ὑπο + *αγ", FUTURE),
        new Word("ὑπἠγαγον", "I went away, I drew off - ὑπάγω root ὑπο + *αγ", SECOND_AORIST),
        new Word("ὑπῆγμαι", "I have been taken away, I have been drawn off - ὑπάγω root ὑπο + *αγ", MIDDLE, PASSIVE, PERFECT),
        new Word("ὑπήχθην", "I was taken away, I was drawn off - ὑπάγω root ὑπο + *αγ", PASSIVE, AORIST),
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
        new Word("ἀνοίγω", "I open, unlock, disclose - root ανα + *οιγω", PRESENT),
        new Word("ἀνέῳζα", "I opened, unlocked, disclosed - ἀνοίγω root ανα + *οιγω", AORIST),
        new Word("ἀνεῳχθην", "I was opened, unlocked, disclosed - ἀνοίγω root ανα + *οιγω", PASSIVE, AORIST),
        new Word("*βαπτιδ", "to baptize, wash, dip ", ROOT),
        new Word("βαπτίζω", "I baptize, wash, dip - root *βαπτιδ", PRESENT),
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
        new Word("μαρτυρῶ", "I bear witness - root *μαρτυρε", PRESENT),
        new Word("μαρτυρήσω", "I will bear witness - μαρτυρῶ root *μαρτυρε", FUTURE),
        new Word("ἐμαρτύρησα", "I bore witness - μαρτυρῶ root *μαρτυρε", AORIST),
        new Word("μεμαρτύρηκα", "I have born witness - μαρτυρῶ root *μαρτυρε", PERFECT),
        new Word("μεμαρτύρημαι", "I have been witnessed - μαρτυρῶ root *μαρτυρε", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐμαρτυρήθην", "I was witnessed - μαρτυρῶ root *μαρτυρε", PASSIVE, AORIST),
        // 75
        new Word("κεφαλή", "head", FEMININE),
        new Word("κεφαλῆς", "head", FEMININE, GENITIVE),
        new Word("δώδεκα", "twelve"),
        // 74
        new Word("απο + *κτεν", "to kill ", ROOT),
        new Word("ἀποκτείνω", "I kill - root απο + *κτεν", PRESENT),
        new Word("ἀποκτενῶ", "I will kill - ἀποκτείνω root απο + *κτεν", FUTURE),
        new Word("ἀπέκτεινα", "I killed - ἀποκτείνω root απο + *κτεν", AORIST),
        new Word("ἀπεκτάθην", "I was killed - ἀποκτείνω root απο + *κτεν", PASSIVE, AORIST),
        new Word("*χαρ", "to rejoice ", ROOT),
        new Word("χαίρω", "I rejoice (infinitive used as a greeting) - root *χαρ", PRESENT),
        new Word("ἐχάρην", "I rejoiced - χαίρω root *χαρ", PASSIVE, SECOND_AORIST, DEPONENT),
        // 73
        new Word("φῶς", "light", NEUTER),
        new Word("φωτός", "light", NEUTER, GENITIVE),
        new Word("*πι", "to drink ", ROOT),
        new Word("πίνω", "I drink - root *πι", PRESENT),
        new Word("πίομαι", "I will drink - πίνω root *πι", FUTURE, DEPONENT),
        new Word("ἔπιον", "I drank - πίνω root *πι", SECOND_AORIST),
        new Word("πέπωκα", "I have drunk - πίνω root *πι", PERFECT),
        new Word("ἐπόθην", "I was drunk - πίνω root *πι", PASSIVE, AORIST),
        // 71
        new Word("ἱερόν", "temple", NEUTER),
        new Word("ἱεροῦ", "temple", NEUTER, GENITIVE),
        new Word("πῦρ", "fire", NEUTER),
        new Word("πυρός", "fire", NEUTER, GENITIVE),
        // 70
        new Word("*αἰτε", "to ask ", ROOT),
        new Word("αἰτέω", "I ask - root *αἰτε", PRESENT),
        new Word("αἰτήσω", "I will ask - αἰτέω root *αἰτε", FUTURE),
        new Word("ᾔτησα", "I asked - αἰτέω root *αἰτε", AORIST),
        new Word("ᾔτηκα", "I have asked - αἰτέω root *αἰτε", PERFECT),
        new Word("ᾔτημαι", "I have been asked - αἰτέω root *αἰτε", MIDDLE, PASSIVE, PERFECT),
        new Word("*τηρε", "to keep, guard ", ROOT),
        new Word("τηρέω", "I keep, I guard - root *τηρε", PRESENT),
        new Word("τηρήσω", "I will keep, I will guard - τηρέω root *τηρε", FUTURE),
        new Word("ἐτήρησα", "I kept, I guarded - τηρέω root *τηρε", AORIST),
        new Word("τετήρηκα", "I have kept, I have guarded - τηρέω root *τηρε", PERFECT),
        new Word("τετήρημαι", "I have been kept, I have been guarded - τηρέω root *τηρε", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐτηρήθην", "I was kept, I was guarded - τηρέω root *τηρε", PASSIVE, AORIST),
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
        new Word("πρεσβύτερος")
            .addForm("elder", NOUN, MASCULINE)
            .addForm("old", ADJECTIVE, MASCULINE),
        new Word("πρεσβύτερου", "elder", NOUN, MASCULINE, GENITIVE),
        new Word("πρεσβύτερα", "old", ADJECTIVE, FEMININE),
        new Word("πρεσβύτερον", "old", ADJECTIVE, NEUTER),
        new Word("*φερ", "to carry, bear, produce ", ROOT),
        new Word("φέρω", "I carry, bear, produce - root *φερ", PRESENT),
        new Word("οἴσω", "I will carry, bear, produce - φέρω root ? ", FUTURE),
        new Word("ἤνεγκα", "I carried, bore, produced - φέρω  root ?", AORIST),
        new Word("ἐνήνοχα", "I have carried, bore, produced - φέρω  root ?", PERFECT),
        new Word("ἠνέχθην", "I was carried, born, produced - φέρω  root ?", PASSIVE, AORIST),
        new Word("ἀπολύω", "I release - root απο + *λυ", PRESENT),
        new Word("ἀπολύσω", "I will release - ἀπολύω root απο + *λυ", FUTURE),
        new Word("ἀπέλυσα", "I released - ἀπολύω root απο + *λυ", AORIST),
        new Word("ἀπολέλυμαι", "I have been released - ἀπολύω root απο + *λυ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἀπελύθην", "I was released - ἀπολύω root απο + *λυ", PASSIVE, AORIST),
        new Word("καρπός", "fruit, crop, result", MASCULINE),
        new Word("καρποῦ", "fruit, crop, result", MASCULINE, GENITIVE),
        new Word("*φη", "to say ", ROOT),
        new Word("φημί", "I say - root *φη", PRESENT),
        new Word("ἔφη", "I said - φημί root *φη", AORIST),
        // 65
        new Word("εἴτε", "if, whether", PARTICLE),
        // 63
        new Word("ὄρος", "mountain, hill", NEUTER),
        new Word("ὄρους", "mountain, hill", NEUTER, GENITIVE),
        new Word("γραμματεύς", "scribe", MASCULINE),
        new Word("γραμματέως", "scribe", MASCULINE, GENITIVE),
        new Word("δαιμόνιον", "demon", NEUTER),
        new Word("δαιμόνιου", "demon", NEUTER, GENITIVE),
        new Word("*ερωτα", "to ask", ROOT),
        new Word("ἐρωτάω", "I ask - root *ερωτα", PRESENT),
        new Word("ἐρωτήσω", "I will ask - ἐρωτάω root *ερωτα", FUTURE),
        new Word("ἠρώτησα", "I asked - ἐρωτάω root *ερωτα", AORIST),
        new Word("ἠρωτήθην", "I was asked - ἐρωτάω root *ερωτα", PASSIVE, AORIST),
        // 62
        new Word("Ἱεροσόλυμα", "Jerusalem", NEUTER),
        new Word("*δοκ", "to think, seem ", ROOT),
        new Word("δοκέω", "I think, seem - root *δοκ", PRESENT),
        new Word("ἔδοξα", "I thought, seemed - δοκέω root *δοκ", AORIST),
        new Word("θέλημα", "will, desire", NEUTER),
        new Word("θέληματος", "will, desire", NEUTER, GENITIVE),
        new Word("θρόνος", "throne", MASCULINE),
        new Word("θρόνου", "throne", MASCULINE, GENITIVE),
        // 61
        new Word("*δοξαδ", "to praise, honor, glorify ", ROOT),
        new Word("δοξάζω", "I praise, honor, glorify - root *δοξαδ", PRESENT),
        new Word("δοξάσω", "I will praise, honor, glorify - δοξάζω root *δοξαδ", FUTURE),
        new Word("ἐδόξασα", "I praised, honored, glorified - δοξάζω root *δοξαδ", AORIST),
        new Word("δεδόξασμαι", "I have been praised, honored, glorified - δοξάζω root *δοξαδ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐδοξάσθην", "I was praised, honored, glorified - δοξάζω root *δοξαδ", PASSIVE, AORIST),
        new Word("*κηρυγ", "to proclaim, preach ", ROOT),
        new Word("κηρύσσω", "I proclaim, preach - root *κηρυγ"),
        new Word("ἐκήρυξα", "I proclaimed, preached - κηρύσσω root *κηρυγ", AORIST),
        new Word("ἐκηρύχθην", "I was proclaimed, preached - κηρύσσω root *κηρυγ", PASSIVE, AORIST),
        new Word("εὐ + *αγγελιδ", "to bring good news", ROOT),
        new Word("εὐαγγελίζω", "I bring good news , often occurs in middle voice with same meaning - root εὐ + *αγγελιδ", PRESENT),
        new Word("εὐηγγέλισα", "I brought good news - εὐαγγελίζω root εὐ + *αγγελιδ", AORIST),
        new Word("εὐηγγέλισμαι", "I have been brought good news - εὐαγγελίζω root εὐ + *αγγελιδ", MIDDLE, PASSIVE, PERFECT),
        new Word("εὐηγγελίσθην", "I was brought good news - εὐαγγελίζω root εὐ + *αγγελιδ", PASSIVE, AORIST),
        new Word("ὑπάρχω", "I am, I exist - root ὑπό + *αρχ", PRESENT),
        new Word("ἤδη", "now, already"),
        new Word("ὧδε", "here"),
        new Word("νύξ", "night", FEMININE),
        new Word("νυκτός", "night", FEMININE, GENITIVE),
        // 60
        new Word("ἱμάτιον", "garment", NEUTER),
        new Word("ἱμάτιου", "garment", NEUTER, GENITIVE),
        new Word("*προσκυνε", "to fall down to worship", ROOT),
        new Word("προσκυνέω", "I fall down to worship - root *προσκυνε", PRESENT),
        new Word("προσκυνήσω", "I will fall down to worship - προσκυνέω root *προσκυνε", FUTURE),
        new Word("προσεκύνησα", "I fell down to worship - προσκυνέω root *προσκυνε", AORIST),
        // 59
        new Word("*ἀσπαδ", "to greet, salute ", ROOT),
        new Word("ἀσπάζομαι", "I greet, salute - root *ἀσπαδ", PRESENT, DEPONENT),
        new Word("ἠσπασάμην", "I greeted, saluted - ἀσπάζομαι root *ἀσπαδ", AORIST, DEPONENT),
        new Word("λίθος", "stone", MASCULINE),
        new Word("λίθου", "stone", MASCULINE, GENITIVE),
        new Word("διδάσκαλος", "teacher", MASCULINE),
        new Word("διδάσκαλου", "teacher", MASCULINE, GENITIVE),
        new Word("χαρά", "joy", FEMININE),
        new Word("χαρᾶς", "joy", FEMININE, GENITIVE),
        new Word("συνάγω", "I bring together, I compile ", PRESENT),
        new Word("συνάξω", "I will bring together, I will compile συνάγω ", FUTURE),
        new Word("συνήγαγον", "I brought together, I compiled συνάγω ", AORIST),
        new Word("συνήχθην", "I was brought together, I was compiled συνάγω ", PASSIVE, AORIST),
        new Word("συνῆγμαι", "I have been brought together, I have been compiled συνάγω ", MIDDLE, PASSIVE, PERFECT),
        // 58
        new Word("*θεωρε", "to look at, behold ", ROOT),
        new Word("θεωρέω", "I look at, behold - root *θεωρε", PRESENT),
        new Word("θεωρήσω", "I will look at, behold - θεωρέω root *θεωρε", FUTURE),
        new Word("ἐθεώρησα", "I looked at, beheld - θεωρέω root *θεωρε", AORIST),
        // 57
        new Word("τοιοῦτος", "such, of such kind", ADJECTIVE, MASCULINE),
        new Word("τοιαῦτη", "such, of such kind", ADJECTIVE, FEMININE),
        new Word("τοιοῦτον", "such, of such kind", ADJECTIVE, NEUTER),
        // 56
        new Word("μηδέ", "and not, neither"),
        new Word("*δεχ", "to take, receive ", ROOT),
        new Word("δέχομαι", "I take, receive ", DEPONENT),
        new Word("δέξομαι", "I will take, receive δέχομαι ", FUTURE, DEPONENT),
        new Word("ἐδεξάμην", "I took, received δέχομαι ", AORIST, DEPONENT),
        new Word("δέδεγμαι", "I have been taken, received δέχομαι ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐδἐχθην", "I was taken, received δέχομαι ", PASSIVE, AORIST),
        new Word("επι + *ερωτα", "to ask", ROOT),
        new Word("ἐπερωτάω", "I ask - root επι + *ερωτα", PRESENT),
        new Word("ἐπερωτήσω", "I will ask - ἐπερωτάω root επι + *ερωτα", FUTURE),
        new Word("ἐπηρώτησα", "I asked - ἐπερωτάω root επι + *ερωτα", AORIST),
        new Word("συναγωγή", "synagogue, meeting", FEMININE),
        new Word("συναγωγῆς", "synagogue, meeting", FEMININE, GENITIVE),
        // 55
        new Word("*κραγ", "to cry out, call out ", ROOT),
        new Word("κράζω", "I cry out, call out - root *κραγ", PRESENT),
        new Word("κράξω", "I will cry out, call out - κράζω root *κραγ", FUTURE),
        new Word("ἔκραξα", "I cried out, called out - κράζω root *κραγ", AORIST),
        new Word("κέκραγα", "I have cried out, called out - κράζω root *κραγ", PERFECT),
        new Word("λοιπός")
            .addForm("the rest, remainder", NOUN, MASCULINE)
            .addForm("remaining", ADJECTIVE, MASCULINE),
        new Word("λοιπή", "remaining", ADJECTIVE, FEMININE),
        new Word("λοιπόν", "remaining", ADJECTIVE, NEUTER),
        new Word("ἀρχή", "beginning; ruler", FEMININE),
        new Word("ἀρχῆς", "beginning; ruler", FEMININE, GENITIVE),
        // 54
        new Word("δεξιός", "right (hand, side)", ADJECTIVE, MASCULINE),
        new Word("δεξιά", "right (hand, side)", ADJECTIVE, FEMININE),
        new Word("δεξιόν", "right (hand, side)", ADJECTIVE, NEUTER),
        new Word("μέσος", "middle, in the midst", ADJECTIVE, MASCULINE),
        new Word("μέση", "middle, in the midst", ADJECTIVE, FEMININE),
        new Word("μέσον", "middle, in the midst", ADJECTIVE, NEUTER),
        new Word("χρόνος", "time", MASCULINE),
        new Word("χρόνου", "time", MASCULINE, GENITIVE),
        new Word("ούχι", "not"),
        // 53
        new Word("ἐλπίς", "hope, expectation", FEMININE),
        new Word("ἐλπίδος", "hope, expectation", FEMININE, GENITIVE),
        new Word("διό", "therefore, for this reason"),
        new Word("ὅπως", "so that, in order that, how that"),
        // 52
        new Word("ἐπαγγελία", "promise", FEMININE),
        new Word("ἐπαγγελίας", "promise", FEMININE, GENITIVE),
        new Word("παιδίον", "child, infant", NEUTER),
        new Word("παιδίου", "child, infant", NEUTER, GENITIVE),
        new Word("*πειθ", "to persuade ", ROOT),
        new Word("πείθω", "I persuade - root *πειθ", PRESENT),
        new Word("πείσω", "I will persuade - πείθω root *πειθ", FUTURE),
        new Word("ἔπεισα", "I persuaded - πείθω root *πειθ", AORIST),
        new Word("πέποιθα", "I have persuaded - πείθω root *πειθ", PERFECT),
        new Word("πέπεισμαι", "I have been persuaded - πείθω root *πειθ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐπείσθην", "I was persuaded - πείθω root *πειθ", PASSIVE, AORIST),
        new Word("*σπερ", "to sow ", ROOT),
        new Word("σπείρω", "I sow - root *σπερ", PRESENT),
        new Word("ἔσπειρα", "I sowed - σπείρω root *σπερ", AORIST),
        new Word("ἔσπαρμαι", "I have been sown - σπείρω root *σπερ", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐσπάρην", "I was sown - σπείρω root *σπερ", PASSIVE, AORIST),
        // 51
        new Word("σοφία", "skill, wisdom", FEMININE),
        new Word("σοφίας", "skill, wisdom", FEMININE, GENITIVE),
        new Word("εὐθύς", "immediately"),
        // 50
        new Word("γλῶσσα", "tongue, language", FEMININE),
        new Word("γλῶσσης", "tongue, language", FEMININE, GENITIVE),
        new Word("γραφή", "scripture, writing", FEMININE),
        new Word("γραφῆς", "scripture, writing", FEMININE, GENITIVE),
        new Word("παραβολή", "parable", FEMININE),
        new Word("παραβολῆς", "parable", FEMININE, GENITIVE),
        new Word("ἔσχατος", "last", ADJECTIVE, MASCULINE),
        new Word("ἔσχατη", "last", ADJECTIVE, FEMININE),
        new Word("ἔσχατον", "last", ADJECTIVE, NEUTER),
        new Word("κακός", "bad, evil", ADJECTIVE, MASCULINE),
        new Word("κακή", "bad, evil", ADJECTIVE, FEMININE),
        new Word("κακόν", "bad, evil", ADJECTIVE, NEUTER),
        new Word("μακάριος", "blessed, happy", ADJECTIVE, MASCULINE),
        new Word("μακαρία", "blessed, happy", ADJECTIVE, FEMININE),
        new Word("μακάριον", "blessed, happy", ADJECTIVE, NEUTER),
        new Word("τυφλός", "blind", ADJECTIVE, MASCULINE),
        new Word("τυφλή", "blind", ADJECTIVE, FEMININE),
        new Word("τυφλόν", "blind", ADJECTIVE, NEUTER),
        // 49
        new Word("ἔτος", "year", NEUTER),
        new Word("ἔτους", "year", NEUTER, GENITIVE),
        new Word("χρεία", "need, necessity", FEMININE),
        new Word("χρείας", "need, necessity", FEMININE, GENITIVE),
        new Word("παραλαμβάνω", "I take to myself, take along, take over", PRESENT),
        new Word("παραλήμψομαι", "I will take to myself, will take along, will take over ", FUTURE),
        new Word("παρέλαβον", "I took to myself, took along, took over ", SECOND_AORIST),
        new Word("παρελήμφθην", "I was taken along, was taken over ", PASSIVE, AORIST),
        new Word("*φανερο", "to reveal, make known", ROOT),
        new Word("φανερῶ", "I reveal, make known - root *φανερο", PRESENT),
        new Word("φανερώσω", "I will reveal, make known - φανερῶ root *φανερο", FUTURE),
        new Word("ἐφανέρωσα", "I revealed, made known - φανερῶ root *φανερο", AORIST),
        new Word("ἐφανερώθην", "I was revealed, made known - φανερῶ root *φανερο", PASSIVE, AORIST),
        new Word("πεφανέρωμαι", "I have been revealed, made known - φανερῶ root *φανερο", MIDDLE, PASSIVE, PERFECT),
        new Word("ἄρα", "then, therefore"),
        // 48
        new Word("ἔρημος", "isolated, desolate, deserted, used as substantive, desert (feminine in this case)", ADJECTIVE),
        new Word("ἀποδίδωμι", "I give up, give back, pay", PRESENT),
        new Word("ἀποδώσω", "I will give up, give back, pay ", FUTURE),
        new Word("ἀπέδωκα", "I gave up, gave back, paid ", AORIST),
        new Word("ἀπεδόθην", "I was given up, given back, paid ", PASSIVE, AORIST),
        // 47
        new Word("πρό", "before, above"),
        new Word("κρίσις", "judgement, legal case", FEMININE),
        new Word("κρίσεως", "judgement, legal case", FEMININE, GENITIVE),
        new Word("φόβος", "fear, fear inspiring thing, reverence", MASCULINE),
        new Word("φόβου", "fear, fear inspiring thing, reverence", MASCULINE, GENITIVE),
        new Word("φυλακή", "guard, prison, watch (of the night)", FEMININE),
        new Word("φυλακῆς", "guard, prison, watch (of the night)", FEMININE, GENITIVE),
        new Word("*κρατε", "to grasp, to be strong, to take possession", ROOT),
        new Word("κρατῶ", "I grasp, am strong, take possession - κρατέω root *κρατε", PRESENT),
        new Word("κρατήσω", "I will grasp, will be strong, will take possession - κρατέω root *κρατε", FUTURE),
        new Word("ἐκράτησα", "I grasped, was strong, took possession - κρατέω root *κρατε", AORIST),
        new Word("κεκράτηκα", "I have grasped, have been strong, have taken possession - κρατέω root *κρατε", PERFECT),
        new Word("κεκράτημαι", "I have been grasped, have been taken possession - κρατέω root *κρατε", MIDDLE, PASSIVE, PERFECT),
        new Word("προσφέρω", "I bring, I offer - root προσ + φερω", PRESENT),
        new Word("προσήνεγκα", "I brought, I offered - προσφερω root προσ + φερω", AORIST),
        new Word("προσενήνοχα", "I have brought, I have offered - προσφερω root προσ + φερω", PERFECT),
        new Word("προσήνεχθην", "I was brought, I was offered - προσφερω root προσ + φερω", PASSIVE, AORIST),
        new Word("οὐκέτι", "no longer"),
        // 46
        new Word("θηρίον", "non-human animal, wild animal", NEUTER),
        new Word("θηρίου", "non-human animal, wild animal", NEUTER, GENITIVE),
        new Word("σωτηρία", "salvation, deliverance, preservation", FEMININE),
        new Word("σωτηρίας", "salvation, deliverance, preservation", FEMININE, GENITIVE),
        new Word("καθίζω", "I set, seat, appoint, sit down, settle", PRESENT),
        new Word("καθίσω", "I will set, seat, appoint, sit down, settle - καθίζω", FUTURE),
        new Word("ἐκάθισα", "I set, sat, appointed, sat down, settled - καθίζω", AORIST),
        new Word("κεκάθικα", "I have set, sat, appointed, sat down, settled - καθίζω", PERFECT),
        new Word("σταυρῶ", "I crucify", PRESENT),
        new Word("σταυρώσω", "I will crucify - σταυρῶ", FUTURE),
        new Word("ἐσταύρωσα", "I crucified - σταυρῶ", AORIST),
        new Word("ἐσταυρώθην", "I was crucified - σταυρῶ", PASSIVE, AORIST),
        new Word("ἐσταύρωμαι", "I have been crucified - σταυρῶ", MIDDLE, PASSIVE, PERFECT),
        new Word("μικρός", "small, little", ADJECTIVE, MASCULINE),
        new Word("μικρά", "small, little", ADJECTIVE, FEMININE),
        new Word("μικρόν", "small, little", ADJECTIVE, NEUTER),
        // 45
        new Word("θλῖψις", "trouble that inflicts distress, oppression, affliction, tribulation", FEMININE),
        new Word("θλῖψεως", "trouble that inflicts distress, oppression, affliction, tribulation", FEMININE, GENITIVE),
        new Word("ναός", "temple, deity's palace", MASCULINE),
        new Word("ναοῦ", "temple, deity's palace", MASCULINE, GENITIVE),
        new Word("ἀπαγγέλλω", "I tell, bring news, report", PRESENT),
        new Word("ἀπαγγελῶ", "I will tell, bring news, report - ἀπαγγέλλω", FUTURE),
        new Word("ἀπήγγειλα", "I told, brought news, reported - ἀπαγγέλλω", AORIST),
        new Word("ἀπηγγέλην", "I was told, brought news, reported - ἀπαγγέλλω", PASSIVE, AORIST),
        new Word("διώκω", "I pursue, persecute", PRESENT),
        new Word("διώξω", "I will pursue, persecute - διώκω", FUTURE),
        new Word("ἐδιώξα", "I pursued, persecuted - διώκω", AORIST),
        new Word("ἐδιώχθην", "I was pursued, persecuted - διώκω", PASSIVE, AORIST),
        new Word("δεδίωγμαι", "I have been pursued, persecuted - διώκω", MIDDLE, PASSIVE, PERFECT),
        new Word("ὅμοιος", "of the same nature, like, similar", ADJECTIVE, MASCULINE),
        new Word("ὁμοία", "of the same nature, like, similar", ADJECTIVE, FEMININE),
        new Word("ὅμοιον", "of the same nature, like, similar", ADJECTIVE, NEUTER),
        // 44
        new Word("ἐπιγινώσκω", "I understand, recognize", PRESENT),
        new Word("ἐπιγινώσομαι", "I will understand, recognize - ἐπιγινώσκω", FUTURE, DEPONENT),
        new Word("ἐπέγνων", "I understood, recognized - ἐπιγινώσκω", AORIST),
        new Word("ἐπέγνωκα", "I have understood, recognized - ἐπιγινώσκω", PERFECT),
        new Word("ἐπεγινώσθην", "I was understood, recognized - ἐπιγινώσκω", PASSIVE, AORIST),
        new Word("κατοικῶ", "I dwell, settle, inhabit - κατοικέω", PRESENT),
        new Word("κατῷκησα", "I dwelt, settled, inhabited - κατοικέω", AORIST),
        // 43
        new Word("σπέρμα", "seed, descendant", NEUTER),
        new Word("σπέρματος", "seed, descendant", NEUTER, GENITIVE),
        new Word("σεαυτοῦ", "yourself", SINGULAR),
        new Word("ἁμαρτάνω", "I sin - root ἁμαρτ ?", PRESENT),
        new Word("ἁμαρτήσω", "I will sin - ἁμαρτάνω root ἁμαρτ ?", FUTURE),
        new Word("ἡμάρτησα", "I sinned - ἁμαρτάνω root ἁμαρτ ?", AORIST),
        new Word("ἡμάρτηκα", "I have sinned - ἁμαρτάνω root ἁμαρτ ?", PERFECT),
        new Word("δέω", "I tie, bind - root δε ?", PRESENT),
        new Word("δήσω", "I will tie, bind - δέω root δε ?", FUTURE),
        new Word("ἔδησα", "I tied, bound - δέω root δε ?", AORIST),
        new Word("δέδεκα", "I have tied, bound - δέω root δε ?", PERFECT),
        new Word("δέδεμαι", "I have been tied, bound - δέω root δε ?", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐδέθην", "I was tied, bound - δέω root δε ?", PASSIVE, AORIST),
        new Word("διέρχομαι", "I pass through - δια ερχομαι", PRESENT, DEPONENT),
        new Word("διελεύσομαι", "I will pass through - δια ερχομαι", FUTURE, DEPONENT),
        new Word("διῆλθον", "I passed through - δια ερχομαι", AORIST),
        new Word("διελήλυθα", "I have passed through - δια ερχομαι", PERFECT),
        new Word("θαυμάζω", "I marvel - root θαυμαστ ?", PRESENT),
        new Word("ἐθαύμασα", "I marvelled - θαυμάζω root θαυμαστ ?", AORIST),
        new Word("ἐθαυμάσθην", "I was marvelled at - θαυμάζω root θαυμαστ ?", PASSIVE, AORIST),
        new Word("θεραπεύω", "I serve (a divinity), heal - root θεραπευ ?", PRESENT),
        new Word("θεραπεύσω", "I will serve (a divinity), heal - θεραπεύω root θεραπευ ?", FUTURE),
        new Word("ἐθεράπευσα", "I served (a divinity), healed - θεραπεύω root θεραπευ ?", AORIST),
        new Word("τεθεράπευμαι", "I have healed - θεραπεύω root θεραπευ ?", MIDDLE, PASSIVE, PERFECT),
        new Word("ἐθεραπεύθην", "I was healed - θεραπεύω root θεραπευ ?", PASSIVE, AORIST),
        new Word("φωνῶ", "I call, cry out - root φωνε ?", PRESENT),
        new Word("φωνἠσω", "I will call, cry out - φωνῶ root φωνε ?", FUTURE),
        new Word("ἐφώνησα", "I called, cried out - φωνῶ root φωνε ?", AORIST),
        new Word("ἐφωνήθην", "I was called - φωνῶ root φωνε ?", PASSIVE, AORIST)


    );
  }
}
