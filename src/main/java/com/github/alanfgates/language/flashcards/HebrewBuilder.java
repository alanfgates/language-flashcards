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

import com.sun.org.apache.xerces.internal.xni.grammars.Grammar;

import java.util.Arrays;
import java.util.List;

import static com.github.alanfgates.language.flashcards.Declension.NOMINATIVE;
import static com.github.alanfgates.language.flashcards.Gender.*;
import static com.github.alanfgates.language.flashcards.Mood.*;
import static com.github.alanfgates.language.flashcards.Number.*;
import static com.github.alanfgates.language.flashcards.PartOfSpeech.*;
import static com.github.alanfgates.language.flashcards.Person.*;
import static com.github.alanfgates.language.flashcards.Tense.*;
import static com.github.alanfgates.language.flashcards.VerbRoot.*;
import static com.github.alanfgates.language.flashcards.Voice.*;

public class HebrewBuilder extends BaseLanguageBuilder {

  @Override
  public String getLanguageName() {
    return "Hebrew";
  }

  @Override
  public List<Word> buildGrammarWords() {
    return Arrays.asList(
        // VERBS
        // Qal perfect
        new Word("קָטַלְתִּי", "I killed", QAL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("קָטַלְתָּ", "you killed", QAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("קָטַלְתְּ", "you killed", QAL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("קָטַל", "he killed", QAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("קָטְלָה", "she killed", QAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("קָטַלְנוּ", "we killed", QAL, PERFECT, FIRST_PERSON, PLURAL),
        new Word("קְטַלְתֶּם", "you killed", QAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("קְטַלְתֶּן", "you killed", QAL, PERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("קָטְלוּ", "they killed", QAL, PERFECT, THIRD_PERSON, PLURAL),

        // To be
        new Word("הָיִיתִי", "I was", QAL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("הָיִיתָ", "you were", QAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("הָיָה", "he was", QAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("הָיְתָה", "she was", QAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("הָיִינוּ", "we were", QAL, PERFECT, FIRST_PERSON, PLURAL),
        new Word("הֱיִיתֶם", "you were", QAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("הָיוּ", "they were", QAL, PERFECT, THIRD_PERSON, PLURAL),

        // To give
        new Word("נָתַתִּי", "I gave", QAL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("נָתַתָּ", "you gave", QAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("נָתַן", "he gave", QAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("נָתְנָה", "she gave", QAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("נָתַנּוּ", "we gave", QAL, PERFECT, FIRST_PERSON, PLURAL),
        new Word("נְתַתֶּם", "you gave", QAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("נָתְנוּ", "they gave", QAL, PERFECT, THIRD_PERSON, PLURAL),

        // Qal Imperfect
        new Word("אֶקְטֹל", "I will kill", QAL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תִּקְטֹל", "you will kill", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("תִּקְטְלִי", "you will kill", QAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יִקְטֹל", "he will kill", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("תִּקְטֹל", "she will kill", QAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("נִקְטֹל", "we will kill", QAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תִּקְטְלוּ", "you will kill", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תִּקְטֹלְנָה", "you will kill", QAL, IMPERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("יִקְטְלוּ", "they will kill", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),
        new Word("תִּקְטֹלְנָה", "they will kill", QAL, IMPERFECT, THIRD_PERSON, FEMININE, PLURAL),

        // to be - imperfect
        new Word("אֶהְיֶה", "I will be", QAL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תִּהְיֶה", "you will be", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("יִהְיֶה", "he will be", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("תִּהְיֶה", "she will be", QAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("נִהְיֶה", "we will be", QAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תִּהְיוּ", "you will be", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("יִהְיוּ", "they will be", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        // to give - imperfect
        new Word("אֶתֵּן", "I will give", QAL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תִּתֵּן", "you will give", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("יִתֵּן", "he will give", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("תִּתֵּן", "she will give", QAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("נִתֵּן", "we will give", QAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תִּתְּנוּ", "you will give", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("יִתְּנוּ", "they will give", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        // Qal Imperative
        new Word("קְטֹל", "kill!", QAL, IMPERATIVE, MASCULINE, SINGULAR),
        new Word("קִטְלִי", "kill!", QAL, IMPERATIVE, FEMININE, SINGULAR),
        new Word("קִטְלוּ", "kill!", QAL, IMPERATIVE, MASCULINE, PLURAL),
        new Word("קְטֹלְנָה", "kill!", QAL, IMPERATIVE, FEMININE, PLURAL),

        // Qal various odd important ones
        new Word("תֵּן", "give!", QAL, IMPERATIVE, MASCULINE, SINGULAR),
        new Word("קַח", "take!", QAL, IMPERATIVE, MASCULINE, SINGULAR),
        new Word("לֵך", "go/walk!", QAL, IMPERATIVE, MASCULINE, SINGULAR),
        new Word("הֱיֵה", "be!", QAL, IMPERATIVE, MASCULINE, SINGULAR),
        new Word("עֲלֵה", "go up!", QAL, IMPERATIVE, MASCULINE, SINGULAR),

        // Qal Cohortative
        new Word("אֶקְטֹל", "let me kill", QAL, COHORTATIVE, SINGULAR),
        new Word("אֶקְטְלָה", "let me kill", QAL, COHORTATIVE, SINGULAR),
        new Word("נִקְטֹל", "let us kill", QAL, COHORTATIVE, PLURAL),
        new Word("נִקְטְלָה", "let us kill", QAL, COHORTATIVE, PLURAL),

        // Qal Jussive
        new Word("יִקְטֹל", "let him kill", QAL, JUSSIVE, MASCULINE, SINGULAR),
        new Word("תִּקְטֹל", "let her kill", QAL, JUSSIVE, FEMININE, SINGULAR),
        new Word("יִקְטְלוּ", "let them kill", QAL, JUSSIVE, MASCULINE, PLURAL),
        new Word("תִּקְטֹלְנָה", "let them kill", QAL, JUSSIVE, FEMININE, PLURAL),

        // Qal Infinitive Construct
        new Word("קְטֹל", "to kill", QAL, INFINITIVE_CONSTRUCT),
        new Word("נְתֹן", "to give", QAL, INFINITIVE_CONSTRUCT),
        new Word("תֵּת", "to give נתן", QAL, INFINITIVE_CONSTRUCT),
        new Word("לֶכֶת", "to walk הלך", QAL, INFINITIVE_CONSTRUCT),

        // Qal Infinitive construct weak forms
        new Word("עֲשׂוֹת", "to do, to make", QAL, INFINITIVE_CONSTRUCT),
        new Word("מוּת", "to die", QAL, INFINITIVE_CONSTRUCT),

        // Qal Infinitive Absolute
        new Word("קָטוֹל", "to kill", QAL, INFINITIVE_ABSOLUTE),

        // Qal Infinitive Absolute weak forms
        new Word("עָשׂה", "to do, to make", QAL, INFINITIVE_ABSOLUTE),
        new Word("עָשׂוֹ", "to do, to make", QAL, INFINITIVE_ABSOLUTE),
        new Word("מוֹת", "to die", QAL, INFINITIVE_ABSOLUTE),

        // Qal Active Participle
        new Word("קֹטֵל", "killing", QAL, PARTICIPLE, ACTIVE, MASCULINE, SINGULAR),
        new Word("קֹטְלִים", "killing", QAL, PARTICIPLE, ACTIVE, MASCULINE, PLURAL),
        new Word("קֹטֶלֶת", "killing", QAL, PARTICIPLE, ACTIVE, FEMININE, SINGULAR),
        new Word("קֹטְלָה", "killing", QAL, PARTICIPLE, ACTIVE, FEMININE, SINGULAR),
        new Word("קֹטְלוֹת", "killing", QAL, PARTICIPLE, ACTIVE, FEMININE, PLURAL),

        // Qal Active Participle weak forms
        new Word("בֹּנִים", "building", QAL, PARTICIPLE, ACTIVE, MASCULINE, PLURAL),
        new Word("קָם", "arising", QAL, PARTICIPLE, ACTIVE, MASCULINE, SINGULAR),
        new Word("בָּנוּי", "being built", QAL, PARTICIPLE, PASSIVE, MASCULINE, SINGULAR),

        // Qal Passive Participle
        new Word("קָטוּל", "being killed", QAL, PARTICIPLE, PASSIVE, MASCULINE, SINGULAR),
        new Word("קְטוּלָה", "being killed", QAL, PARTICIPLE, PASSIVE, FEMININE, SINGULAR),
        new Word("קְטוּלִים", "being killed", QAL, PARTICIPLE, PASSIVE, MASCULINE, PLURAL),
        new Word("קְטוּלוֹת", "being killed", QAL, PARTICIPLE, PASSIVE, FEMININE, PLURAL),

        // Niphal Perfect
        new Word("נִקְטַלְתִּי", "I was killed", NIPHAL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("נִקְטַלְתָּ", "you were killed", NIPHAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("נִקְטַלְתְּ", "you were killed", NIPHAL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("נִקְטַל", "he was killed", NIPHAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("נִקְטְלָה", "she was killed", NIPHAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("נִקְטַלְנוּ", "we were killed", NIPHAL, PERFECT, FIRST_PERSON, PLURAL),
        new Word("נִקְטַלְתֶּם", "you were killed", NIPHAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("נִקְטַלְתֶּן", "you were killed", NIPHAL, PERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("נִקְטְלוּ", "they were killed", NIPHAL, PERFECT, THIRD_PERSON, PLURAL),

        // Niphal Imperfect
        new Word("אֶקָּטֵל", "I will be killed", NIPHAL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תִּקָּטֵל", "you will be killed", NIPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("תִּקָּטְלִי", "you will be killed", NIPHAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יִקָּטֵל", "he will be killed", NIPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("תִּקָּטֵל", "she will be killed", NIPHAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("נִקָּטֵל", "we will be killed", NIPHAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תִּקָּטְלוּ", "you will be killed", NIPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תִּקָּטַלְנָה", "you will be killed", NIPHAL, IMPERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("יִקָּטְלוּ", "they will be killed", NIPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),
        new Word("תִּקָּטַלְנָה", "they will be killed", NIPHAL, IMPERFECT, THIRD_PERSON, FEMININE, PLURAL),

        // Niphal Imperative
        new Word("הִקָּטֵל", "be killed!", NIPHAL, IMPERATIVE, MASCULINE, SINGULAR),
        new Word("הִקָּטְלִי", "be killed!", NIPHAL, IMPERATIVE, FEMININE, SINGULAR),
        new Word("הִקָּטְלְוּ", "be killed!", NIPHAL, IMPERATIVE, MASCULINE, PLURAL),
        new Word("הִקָּטַלְנָה", "be killed!", NIPHAL, IMPERATIVE, FEMININE, PLURAL),

        // Niphal Infinitive
        new Word("הִקָּטֵל", "to kill", NIPHAL, INFINITIVE_CONSTRUCT),
        new Word("נִקְטוֹל", "to kill", NIPHAL, INFINITIVE_ABSOLUTE),
        new Word("הִקָּטוֹל", "to kill", NIPHAL, INFINITIVE_ABSOLUTE),

        // Niphal Participle
        new Word("נִקְטָל", "being killed", NIPHAL, PARTICIPLE, MASCULINE, SINGULAR),
        new Word("נִקְטֶלֶת", "being killed", NIPHAL, PARTICIPLE, FEMININE, SINGULAR),
        new Word("נִקְטָלִים", "being killed", NIPHAL, PARTICIPLE, MASCULINE, PLURAL),
        new Word("נִקְטָלוֹת", "being killed", NIPHAL, PARTICIPLE, FEMININE, PLURAL),


        //----------------------------------------------------------------------------------------
        // PRONOMINAL SUFFIXES
        new Word("סוּסִי", "my horse"),
        new Word("סוּסְךָ", "your horse", MASCULINE, SINGULAR),
        new Word("סוּסֵך:", "your horse", FEMININE, SINGULAR),
        new Word("סוּסוֹ", "his horse"),
        new Word("סוּסָהּ", "her horse"),
        new Word("סוּסֵנוּ", "our horse"),
        new Word("סוּסְכֶם", "your horse", MASCULINE, PLURAL),
        new Word("סוּסְכֶן", "your horse", FEMININE, PLURAL),
        new Word("סוּסָם", "their horse", MASCULINE),
        new Word("סוּסָן", "their horse", FEMININE),

        new Word("סוּסַי", "my horses"),
        new Word("סוּסֶיךָ", "your horses", MASCULINE, SINGULAR),
        new Word("סוּסַיִך:", "your horses", FEMININE, SINGULAR),
        new Word("סוּסָיו", "his horses"),
        new Word("סוּסֶיהָ", "her horses"),
        new Word("סוּסֵינוּ", "our horses"),
        new Word("סוּסֵיכֶם", "your horses", MASCULINE, PLURAL),
        new Word("סוּסֵיכֶן", "your horses", FEMININE, PLURAL),
        new Word("סוּסֵיהֶם", "their horses", MASCULINE),
        new Word("סוּסֵיהֶן", "their horses", FEMININE),

        // Qal perfect with pronominal suffixes
        new Word("קְטָלַנִי", "he killed me", PRONOMINAL_SUFFIX, FIRST_PERSON, SINGULAR),
        new Word("קְטָלְךָ", "he killed you", PRONOMINAL_SUFFIX, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("קְטָלֵך", "he killed you", PRONOMINAL_SUFFIX, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("קְטָלוֹ", "he killed him", PRONOMINAL_SUFFIX, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("קְטָלָהוֹ", "he killed him", PRONOMINAL_SUFFIX, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("קְטָלָהּ", "he killed her", PRONOMINAL_SUFFIX, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("קְטָלָנוּ", "he killed us", PRONOMINAL_SUFFIX, FIRST_PERSON, PLURAL),
        new Word("קְטָלְכֶם", "he killed you", PRONOMINAL_SUFFIX, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("קְטָלְכֶן", "he killed you", PRONOMINAL_SUFFIX, SECOND_PERSON, FEMININE, PLURAL),
        new Word("קְטָלָם", "he killed them", PRONOMINAL_SUFFIX, THIRD_PERSON, MASCULINE, PLURAL),
        new Word("קְטָלָן", "he killed them", PRONOMINAL_SUFFIX, THIRD_PERSON, FEMININE, PLURAL),

        new Word("קְטַלְתִּיו", "I killed him", QAL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("קְטַלְתָּהוּ", "you killed him", QAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("קְטָלַתְהוּ", "she killed him", QAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("קְטַלְנוּהוּ", "we killed him", QAL, PERFECT, FIRST_PERSON, PLURAL),
        new Word("קְטַלְוּהוּ", "they killed him", QAL, PERFECT, THIRD_PERSON, PLURAL),

        // Qal imperfect with pronominal suffixes
        new Word("יִקְטְלֵנִי", "he will kill me", PRONOMINAL_SUFFIX, FIRST_PERSON, MASCULINE, SINGULAR),
        new Word("יִקְטָלְךָ", "he will kill you", PRONOMINAL_SUFFIX, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("יִקְטְלֵך", "he will kill you", PRONOMINAL_SUFFIX, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יִקְטְלֵהוּ", "he will kill him", PRONOMINAL_SUFFIX, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("יִקְטְלֵנּוּ", "he will kill him", PRONOMINAL_SUFFIX, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("יִקְטְלָהּ", "he will kill her", PRONOMINAL_SUFFIX, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("יִקְטְלֶנָּה", "he will kill her", PRONOMINAL_SUFFIX, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("יִקְטְלוּנוּ", "they will kill us", PRONOMINAL_SUFFIX, FIRST_PERSON, PLURAL),
        new Word("יִקְטְלֵכֶם", "they will kill you", PRONOMINAL_SUFFIX, SECOND_PERSON, PLURAL),
        new Word("יִקְטְלֵכֶן", "they will kill you", PRONOMINAL_SUFFIX, SECOND_PERSON, FEMININE),
        new Word("יִקְטְלֵם", "they will kill them", PRONOMINAL_SUFFIX, THIRD_PERSON, PLURAL),
        new Word("יִקְטְלֵן", "they will kill them", PRONOMINAL_SUFFIX, THIRD_PERSON, FEMININE)
    );
  }

  @Override
  public List<Word> buildVocabWords() {
    return Arrays.asList(
        // VOCABULARY, with frequency noted in comments
        // 50524
        new Word("וְ", "and, but, also, even"),
        // 23968
        new Word("הַ", "the"),
        // 20435
        new Word("לְ", "to"),
        // 15632
        new Word("בְּ", "in, at, with"),
        // 10970
        new Word("אֶת–", "definite direct object marker"),
        new Word("אֵת", "definite direct object marker"),
        // 7586
        new Word("מִן", "from"),
        // 5778
        new Word("עַל", "upon, over, above"),
        // 5518
        new Word("אֶל", "to, toward"),
        // 5518
        new Word("לֹא", "no, not, used with perfect, used with imperfect = never"),
        // 5503
        new Word("אֲשֶׁר", "who, whom, that, which (relative pronoun)"),
        // 5415
        new Word("כֹּל", "all"),
        new Word("כָּל", "all of", CONSTRUCT),
        // 5317
        new Word("אָמַר", "he said"),

        // 4942
        new Word("בֵּן", "son", MASCULINE),
        new Word("בֶּן", "son of", MASCULINE, CONSTRUCT),
        new Word("בָּנִים", "sons", MASCULINE, PLURAL),
        // 4795
        new Word("אֲנִי", "I, myself", NOMINATIVE),
        new Word("אָנֹכִי", "I, myself", NOMINATIVE),
        new Word("אֲנַחְנוּ", "we", NOMINATIVE),
        new Word("אַתָּה", "you", NOMINATIVE, MASCULINE, SINGULAR),
        new Word("אַתְּ", "you", NOMINATIVE, FEMININE, SINGULAR),
        new Word("אַתֶּם", "you", NOMINATIVE, MASCULINE, PLURAL),
        new Word("אַתֵּנָה", "you", NOMINATIVE, FEMININE, PLURAL),
        new Word("הוּא", "he", NOMINATIVE),
        new Word("הוּא", "that", MASCULINE),
        new Word("הִיא", "she", NOMINATIVE),
        new Word("הִיא", "that", FEMININE),
        new Word("הִוא", "she", NOMINATIVE),
        new Word("הֵם", "they", NOMINATIVE, MASCULINE, PLURAL),
        new Word("הֵם", "those", MASCULINE, PLURAL),
        new Word("הֵמָּה", "they", NOMINATIVE, MASCULINE, PLURAL),
        new Word("הֵמָּה", "those", MASCULINE, PLURAL),
        new Word("הֵן", "they", NOMINATIVE, FEMININE, PLURAL),
        new Word("הֵנָּה", "they", NOMINATIVE, FEMININE, PLURAL),
        new Word("הֵן", "those", FEMININE, PLURAL),
        new Word("הֵנָּה", "those", FEMININE, PLURAL),
        // 4487
        new Word("כִּי", "that, because; (adversative) but, except; (emphatic) indeed, truly", true),
        new Word("כִּי–אִם", "but, except", true),
        // 3576
        new Word("הָיָה",	"he was"),
        // 2909
        new Word("כְּ", "as, like"),
        // 2632
        new Word("עָשַׂה", "he did, he made"),
        // 2602
        new Word("אֱלֹהִים", "God", MASCULINE),
        new Word("אֱלֹהִים", "gods", MASCULINE, PLURAL),
        // 2579
        new Word("בָּא", "he came, entered - בּוֹא"),
        // 2530
        new Word("מֶלֶך", "king", MASCULINE),
        new Word("מְלָכִים", "kings", MASCULINE, PLURAL),
        // 2529
        new Word("זֶה",	"this", MASCULINE),
        new Word("זֹאת", "this", FEMININE),
        new Word("אֵלָה", "these"),
        // 2505
        new Word("אֶרֶץ", "land, earth", FEMININE),
        new Word("אֲרָצוֹת", "lands, earths", FEMININE, PLURAL),
        // 2303
        new Word("יוֹם", "day", true, MASCULINE),
        new Word("יָמִים", "days", true, MASCULINE, PLURAL),
        // 2187
        new Word("אִיש", "man", MASCULINE),
        new Word("אֲנָשִׁים", "men", MASCULINE, PLURAL),
        // 2128
        new Word("פָּנִים", "face, faces", MASCULINE, SINGULAR, PLURAL),
        new Word("פְּנֵי", "before, in the presence of"),
        // 2046
        new Word("בַּיִת", "house", MASCULINE),
        new Word("בֵּּּית", "house of", MASCULINE, CONSTRUCT),
        new Word("בָּתִּים", "houses", MASCULINE, PLURAL),
        // 2014
        new Word("נָתַן", "he gave, put, set"),
        // 1867
        new Word("עַם", "people, nation", MASCULINE),
        new Word("עַמִּים", "peoples, nations", MASCULINE, PLURAL),
        // 1627
        new Word("יָד", "hand, (metaphorically) side, power", FEMININE),
        new Word("יַד", "hand of", true, FEMININE, CONSTRUCT),
        new Word("יָדַיִם", "hands", FEMININE, DUAL),
        // 1554
        new Word("הָלַךּ",	"he walked"),
        // 1494
        new Word("דָּבָר", "word, speech", MASCULINE),
        new Word("דְּבָרִים", "words, speeches", MASCULINE, PLURAL),
        // 1310
        new Word("רָאָה", "he saw", true),
        // 1263
        new Word("עַד", "until, as far as"),
        // 1210
        new Word("אָב", "father", MASCULINE),
        new Word("אֲבִי", "father of", MASCULINE, CONSTRUCT),
        new Word("אָבוֹת", "fathers", MASCULINE, PLURAL),
        // 1165
        new Word("שָׁמַע",	 "he heard"),
        // 1135
        new Word("דִּבֶּר",	"he spoke", PIEL),
        // 1119
        new Word("ָה", "to, toward, directional ending", true),
        // 1094
        new Word("עִיר", "city", FEMININE),
        new Word("עָרִים", "cities", FEMININE, PLURAL),
        // 1087
        new Word("יָשַׁב",	"he sat, he dwelt"),
        // 1075
        new Word("יָצָא", 	"he went out"),
        new Word("שָׁב", "he returned"),
        // 1070
        new Word("אִם", "if"),
        // 1061
        new Word("הִנַּה", "behold, here I am, I am ready"),
        // 1048
        new Word("עִם", "with"),
        // 976
        new Word("אֶחָד", "one", true, MASCULINE),
        new Word("אַחַת", "one", true, FEMININE),
        // 966
        new Word("לָקַח", "he took"),
        // 952
        new Word("יָדַע", "he knew"),
        // 896
        new Word("עַיִן", "eye, spring", FEMININE),
        new Word("עֵינַים", "eyes", FEMININE, DUAL),
        new Word("עֲיָנֹת", "springs", FEMININE, PLURAL),
        // 898
        new Word("אֵת", "with"),
        new Word("אֶת–", "with"),
        // 894
        new Word("עָלָה", "he went up"),
        // 879
        new Word("שָׁנָה", "year", FEMININE),
        new Word("שָׁנִים", "years", FEMININE, PLURAL),
        // 864
        new Word("שֵׁם", "name", MASCULINE),
        new Word("שֵׁמוֹת", "names", MASCULINE, PLURAL),
        // 853 (601 for לב and 252 for לבב )
        new Word("לֵב", "heart", MASCULINE),
        new Word("לִבּוֹת", "hearts", MASCULINE, PLURAL),
        new Word("לֵבָב", "heart", MASCULINE),
        new Word("לְבָבוֹת", "hearts", MASCULINE, PLURAL),
        // 847
        new Word("שָׁלַח", "he sent, stretched out"),
        // 845
        new Word("מֵת", "he died - מוּת"),
        // 835
        new Word("שָׁם", "there"),
        // 814
        new Word("אָכַל", "he ate"),
        // 803
        new Word("עֶבֶד", "servant, slave", MASCULINE),
        new Word("עֲבָדִים", "servants, slaves", MASCULINE, PLURAL),
        // 783
        new Word("אַיִן", "nothing, there is not", true),
        new Word("אֵין", "nothing, there is not", true),
        // 781
        new Word("אִשָּׁה", "woman, wife", FEMININE),
        new Word("אֵשֶׁת", "woman, wife", true, FEMININE, SINGULAR, CONSTRUCT),
        new Word("נָשׁים", "women, wives", FEMININE, PLURAL),
        new Word("נְשֵׁי", "women, wives", true, FEMININE, PLURAL, CONSTRUCT),
        // 774
        new Word("אָדוֹן", "lord, master", MASCULINE),
        new Word("אֲדֹנִים", "lords, masters", MASCULINE, PLURAL),
        // 769
        new Word("שְׁנַיִם", "two", true, MASCULINE),
        new Word("שְׁתַּים", "two", true, FEMININE),
        new Word("שֵׁנִי", "second", true, MASCULINE),
        new Word("שֵׁנִית", "second", true, FEMININE),
        new Word("גַּם", "also"),
        // 757
        new Word("נֶפֶש", "soul, person", FEMININE),
        new Word("נְפָשׁוֹת", "souls, persons", FEMININE, PLURAL),
        // 754
        new Word("מָה", "what?", true),
        new Word("מַה", "what?", true),
        new Word("מֶה", "what?", true),
        // 750
        new Word("כֹּהַן", "priest", MASCULINE),
        new Word("כֹהֲנִים", "priests", MASCULINE, PLURAL),
        // 748
        new Word("הֲ", "indicates interrogative, prefixed to first word in the sentence", true),
        // 743
        new Word("כֵּן", "so, thus", true),
        // 736
        new Word("קָרָא", "he called"),
        // 729
        new Word("אַל", "no, not (with imperfect) not at this time"),
        // 712
        new Word("דֶּרֶךּ", "way, road", MASCULINE, FEMININE),
        new Word("דֶּרָכִים", "ways, roads", MASCULINE, FEMININE, PLURAL),
        // 707
        new Word("אַחַר", "after"),
        // 658
        new Word("נָשָׂא", "he lifted, carried, took"),
        // 629
        new Word("אָח", "brother", MASCULINE),
        new Word("אֲחִי", "brother of", MASCULINE, CONSTRUCT),
        new Word("אַחִים", "brothers", MASCULINE, PLURAL),
        // 627
        new Word("קָם", "he arose, stood - קוּם"),
        // 606
        new Word("שָׁלשׁ", "three", MASCULINE),
        new Word("שְׁלֹשִׁים", "thirty"),
        new Word("שְׁלִישִׁי", "third", true),
        // 600
        new Word("רֹאשׁ", "head", MASCULINE),
        new Word("רָאשִׁים", "heads", MASCULINE, PLURAL),
        // 588
        new Word("בַּת", "daughter", FEMININE),
        new Word("בָּנוֹת", "daughters", FEMININE, PLURAL),
        // 583
        new Word("מָיִם", "water, waters", MASCULINE, SINGULAR, PLURAL),
        new Word("מֵי", "water", MASCULINE, SINGULAR, PLURAL, CONSTRUCT),
        new Word("מֵאָה", "hundred", true),
        // 577
        new Word("כֹּה", "thus, here", true),
        // 560
        new Word("גּוֹי", "nation", MASCULINE),
        new Word("גּוֹיִם", "nations", MASCULINE, PLURAL),
        // 559
        new Word("הַר", "mountain", MASCULINE),
        new Word("הָרִים", "mountains", MASCULINE, PLURAL),
        // 554
        new Word("עָבַר", "he passed over, passed through, passed by"),
        // 545
        new Word("אָדָם", "a man, humankind", MASCULINE),
        // 528
        new Word("שָׂם", "he put, set - שִׂים"),
        // 526
        new Word("גָּדוֹל", "great"),
        // 524
        new Word("עָמַד", "he stood"),
        // 511
        new Word("תַּחַת", "under, instead of", true),
        // 508
        new Word("חָמַשׁ", "five", true, MASCULINE),
        new Word("חֲמִשִּׁים", "fifty"),
        // 505
        new Word("קוֹל", "voice, sound", MASCULINE),
        new Word("קֹלוֹת", "voices, sounds", MASCULINE, PLURAL),
        // 501
        new Word("הִכָּה", "he hit - נכה (he smote)", true, HIPHIL),
        // 498
        new Word("פֶה", "mouth", true, MASCULINE),
        new Word("פִּי", "mouth", true, MASCULINE, SINGULAR, CONSTRUCT),
        new Word("פִּיּוֹת", "mouths", MASCULINE, PLURAL),
        // 496
        new Word("צָבָא", "host, army, war, service", MASCULINE),
        new Word("צְבָאוֹת", "hosts, armies, wars, services", MASCULINE, PLURAL),
        // 496
        new Word("צִוָּה", "he commanded", true),
        // 495
        new Word("יָלַד", "he bore, he begat"),
        // 494
        new Word("אֶלֶף", "thousand", true),
        // 492
        new Word("עֶשֶׁר", "ten", true, MASCULINE),
        new Word("עֲשָׂרָה", "ten", true, FEMININE),
        new Word("עֶשְׂרִים", "twenty", true),
        // 491
        new Word("שֶׁבַע", "seven", MASCULINE),
        new Word("שִׁבְעִים", "seventy"),
        // 491
        new Word("עוֹד", "again, still, long"),
        // 470
        new Word("קֹדֶש", "holiness, apartness, sacredness", true, MASCULINE),
        new Word("קֳדָשִׁים", "holiness, apartness, sacredness", MASCULINE, PLURAL),
        // 469
        new Word("שָׁמַר", "he guarded, watched, preserved"),
        // 457
        new Word("מָצַה", "he found, reached, obtained"),
        // 456
        new Word("אַרְבַּע", "four", MASCULINE),
        new Word("אַרְבָּעִים", "forty"),
        new Word("רְבִיעִי", "fourth", MASCULINE),
        // 439
        new Word("עוֹלָם", "forever", MASCULINE),
        new Word("עוֹלָמִים", "forever", MASCULINE, PLURAL),
        // 435
        new Word("נָפַל", "he fell"),
        new Word("עַתָּה", "now", true),
        // 424
        new Word("מִשְׁפָת", "judgement, law", MASCULINE),
        new Word("מִשׁפָּטִים", "judgements, laws", MASCULINE, PLURAL),
        new Word("מִי", "who?", true),
        // 421
        new Word("שַׂר", "prince, chief", MASCULINE),
        new Word("שָׂרִים", "princes, chiefs", MASCULINE, PLURAL),
        new Word("שָׁמַיִם", "heavens, sky", MASCULINE, SINGULAR, PLURAL),
        new Word("שְׁמֵי", "heavens, sky", MASCULINE, CONSTRUCT),
        // 420
        new Word("תָּוֶךּ", "midst"),
        // 413
        new Word("חֶרֶב", "sword", FEMININE),
        new Word("חֲרָבוֹת", "swords", FEMININE, PLURAL),
        // 409
        new Word("רַב", "great, many", true, MASCULINE),
        new Word("רַבָּה", "great, many", FEMININE),
        new Word("בַּין", "between"),
        // 405
        new Word("נָא", "please, now"),
        // 403
        new Word("כֶּסֶף", "silver, money", MASCULINE),
        new Word("מִזְבֵּחַ", "alter", MASCULINE),
        new Word("מִזְבְּחוֹת", "alters", MASCULINE, PLURAL),
        // 401
        new Word("מָקוֹם", "place", MASCULINE),
        new Word("מְקוֹמוֹת", "places", MASCULINE, PLURAL),
        // 396
        new Word("יָם", "sea", true, MASCULINE),
        new Word("יַמִּים", "seas", true, MASCULINE, PLURAL),
        // 389
        new Word("זָהָב", "gold", MASCULINE),
        // 382
        new Word("יָרַד", "he went down"),
        // 377
        new Word("בָּנָה", "he built"),
        new Word("אַשׁ", "fire", FEMININE),
        // 376
        new Word("נְאֻם", "utterance", true, MASCULINE),
        // 373
        new Word("שַׁעַר", "gate", MASCULINE),
        new Word("שְׁעָרִים", "gates", MASCULINE, PLURAL),
        new Word("טוֹב", "good", ADJECTIVE, MASCULINE, SINGULAR),
        new Word("טוֹבָה", "good", ADJECTIVE, FEMININE, SINGULAR),
        new Word("טוֹבִים", "good", ADJECTIVE, MASCULINE, PLURAL),
        new Word("טוֹבוֹת", "good", ADJECTIVE, FEMININE, PLURAL),
        // 371
        new Word("הִגִיד", "he told, declared - נגד (be conspicuous)", true, HIPHIL),
        // 363
        new Word("רוּחַ", "spirit, breath, wind", FEMININE),
        new Word("רוּחוֹת", "spirits, breaths, winds", FEMININE, PLURAL),
        // 361
        new Word("דָּם", "blood", MASCULINE),
        new Word("דָּמִים", "bloods", MASCULINE, PLURAL),
        // 357
        new Word("רַע", "bad, evil", true, ADJECTIVE, MASCULINE, SINGULAR),
        new Word("רָעָה", "bad, evil", ADJECTIVE, FEMININE, SINGULAR),
        new Word("רָעִים", "bad, evil", ADJECTIVE, MASCULINE, PLURAL),
        new Word("רָעוֹת", "bad, evil", ADJECTIVE, FEMININE, PLURAL),
        // 350
        new Word("מָלַךּ", "he reigned"),
        // 348
        new Word("אֹהֶל", "tent", MASCULINE),
        new Word("אֹהָלִים", "tents", MASCULINE, PLURAL),
        // 338
        new Word("סָבִיב", "all around", true),
        // 330
        new Word("עֵץ", "tree", MASCULINE),
        new Word("עֵצִים", "trees", MASCULINE, PLURAL),
        // 327
        new Word("בֵּרַךּ", "he blessed - ברך (he knelt, he blessed)", PIEL),
        // 325
        new Word("כְּלִי", "utensil, weapon", MASCULINE),
        new Word("כֵּלִים", "utensils, weapons", MASCULINE, PLURAL),
        // 321
        new Word("שָׂדֶה", "open field, country", MASCULINE),
        new Word("שָׂדוֹת", "open fields, country", MASCULINE, PLURAL),
        new Word("אוֹ", "or"),
        // 319
        new Word("מִלְחָמָה", "war, battle", FEMININE),
        new Word("מִלְחָמוֹת", "wars, battles", FEMININE, PLURAL),
        // 318
        new Word("יָרֵא", "he feared", true),
        // 317
        new Word("עָנָה", "he answered"),
        new Word("נָבִיא", "prophet", MASCULINE),
        new Word("נְבִיאִים", "prophets", MASCULINE, PLURAL),
        // 311
        new Word("רָעָה", "evil, misery, distress", NOUN, FEMININE),
        // 304
        new Word("פָּקַד", "he attended to, appointed, mustered, visited"),
        new Word("מִשְׁפָּחָה", "family", FEMININE),
        new Word("מִשְׁפָּחוֹת", "families", FEMININE, PLURAL),
        // 298
        new Word("סָר", "he turned aside - סור", true),
        new Word("חַטָּאת", "sin, sin offering", FEMININE),
        new Word("לֶחֶם", "bread, food", MASCULINE),
        new Word("מְאֹד", "very"),
        // 296
        new Word("עַת", "time, point in time", true, FEMININE),
        // 290
        new Word("חָזַק", "he was strong", true),
        // 289
        new Word("כָּרַת", "he cut off", true),
        new Word("עָבַד", "he worked, he served"),
        // 288
        new Word("עֹלָה", "whole burnt offering", FEMININE),
        new Word("עֹלוֹת", "whole burnt offerings", FEMININE, PLURAL),
        // 287
        new Word("חָיָה", "he lived"),
        // 285
        new Word("אֹיֵב", "enemy", true, MASCULINE),
        // 284
        new Word("אָיַב", "he was hostile", true),
        new Word("בְּרִית", "covenant", FEMININE),
        // 283
        new Word("חֹדֶשׁ", "month, new moon", true, MASCULINE),
        new Word("חֳדָשִׁים", "months, new moons", MASCULINE, PLURAL),
        // 280
        new Word("קָרַב", "he came near, he offered", true),
        // 277
        new Word("אַף", "nose, anger", MASCULINE),
        new Word("אַפַּיִם", "noses, anger", MASCULINE, PLURAL),
        // 274
        new Word("צֹאן", "flock, sheep", FEMININE, SINGULAR, PLURAL),
        new Word("שַׁשׁ", "six", MASCULINE),
        new Word("שׁשִּׁים", "sixty"),
        // 272
        new Word("אֶבֶן", "stone", FEMININE),
        new Word("אֲבָנִים", "stones", FEMININE, PLURAL),
        new Word("לְמַעַן", "because of, in order to, for the sake of", true),
        // 270
        new Word("בָּשָׂר", "flesh, meat, skin", true, MASCULINE),
        new Word("בְּשָׂרִים", "fleshes, meats, skins", MASCULINE, PLURAL),
        new Word("מִדְבָּר", "wilderness, desert, pasture", MASCULINE),
        // 268
        new Word("חַיִּים", "life, lives", MASCULINE, SINGULAR, PLURAL),
        // 264
        new Word("רָשָׁע", "wicked", true, ADJECTIVE, MASCULINE, SINGULAR),
        new Word("רְשָׁעִים", "wicked", ADJECTIVE, MASCULINE, PLURAL),
        new Word("רְשָׁעָה", "wicked", ADJECTIVE, FEMININE, SINGULAR),
        // 252
        new Word("מַטֶּה", "tribe, staff", true, MASCULINE),
        new Word("מָטּוֹת", "tribes, staffs", MASCULINE, PLURAL),
        // 251
        new Word("רֶגֶל", "foot", FEMININE),
        new Word("רַגְלַיִם", "feet", FEMININE, DUAL),
        // 250
        new Word("מָלֵא", "he filled", true),
        new Word("אַמָּה", "cubit, forearm", true, FEMININE),
        new Word("אַמּוֹת", "cubits, forearms", FEMININE, PLURAL),
        // 249
        new Word("חֶסֶד", "loving kindness, steadfast love", MASCULINE),
        new Word("חֲסָדִים", "loving kindnesses, steadfast loves", MASCULINE, PLURAL),
        // 245
        new Word("חַיַל", "strength, wealth, army", true, MASCULINE),
        new Word("חֲיָלִים", "armies,strengths, wealths", MASCULINE, PLURAL),
        // 241
        new Word("גְּבוּל", "border, boundary, territory", true, MASCULINE),
        // 240
        new Word("נַעַר", "boy, youth", MASCULINE),
        new Word("נְעָרִים", "boys, youths", MASCULINE, PLURAL),
        // 239
        new Word("חָטָא", "he sinned, he missed", true),
        // 237
        new Word("שָׁלוֹם", "peace, completeness", MASCULINE),
        // 236
        new Word("אֵל", "god", MASCULINE),
        // 235
        new Word("מַעֲשֶׂה", "work, deed", MASCULINE),
        new Word("מַעֲשִׂים", "works, deeds", MASCULINE, PLURAL),
        // 233
        new Word("עָוֹן", "iniquity", MASCULINE),
        new Word("עֲוֹנוֹת", "iniquities", MASCULINE, PLURAL),
        // 232
        new Word("יָרַשׁ", "he inherited, he possessed, he dispossessed", true),
        // 229
        new Word("זֶרַע", "seed", MASCULINE),
        // 227
        new Word("לַיְלָה", "night", MASCULINE),
        new Word("לֵילוֹת", "nights", MASCULINE, PLURAL),
        new Word("קֶרֶב", "midst, inward part", true, MASCULINE),
        // 225
        new Word("בִּקֵּשׁ", "he sought", true, PIEL),
        new Word("זָכַר", "he remembered", true),
        new Word("כָּתַב", "he wrote", true),
        // 223
        new Word("מוֹעַד", "appointed time, place", MASCULINE),
        new Word("מוֹעֲדִים", "appointed times, places", MASCULINE, PLURAL),
        new Word("תּוֹרָה", "law, instruction", FEMININE),
        new Word("תּוֹרוֹת", "laws, instructions", FEMININE, PLURAL),
        // 222
        new Word("נַחֲלָה", "possession", true, FEMININE),
        new Word("נְחָלוֹת", "possessions", FEMININE, PLURAL),
        new Word("אֲדָמָה", "land, ground, earth", FEMININE),
        new Word("אֲדָמוֹת", "lands, grounds", FEMININE, PLURAL),
        // 220
        new Word("אֵם", "mother", FEMININE),
        // 219
        new Word("נָכְוֹן", "he was firm, established, prepared", true, NIPHAL),
        // 217
        new Word("אָהַב", "he loved"),
        new Word("שָׁתָה", "he drank", true),
        // 216
        new Word("נָטָה", "he stretched out", true),
        new Word("בֶּגֶד", "garmet", MASCULINE),
        new Word("בְּגָדִים", "garmets", MASCULINE, PLURAL),
        // 215
        new Word("יָסַף", "he added, he did again"),
        new Word("מַחֲנֶה", "camp", true, MASCULINE, FEMININE),
        new Word("מַחַנוֹת", "camps", MASCULINE, FEMININE, PLURAL),
        // 214
        new Word("עָזַב", "he forsook, left", true),
        // 213
        new Word("הִצִּיל", "he saved, delivered - נצל", true, HIPHIL),
        new Word("שָׁכַב", "he layed down, he had sex", true),
        new Word("בֹּקֶר", "morning", MASCULINE),
        new Word("בְּקָרִים", "mornings", MASCULINE, PLURAL),
        new Word("מַלְאָךּ", "messenger", MASCULINE),
        new Word("מַלְאָכִים", "messengers", MASCULINE, PLURAL),
        // 211
        new Word("מִנְחָה", "gift, tribute, offering", true, FEMININE),
        // 208
        new Word("כָּלָה", "he was complete, finished, he came to an end", true),
        // 206
        new Word("צַדּיק", "just, righteous", ADJECTIVE, MASCULINE),
        new Word("צַדִּיקִים", "just, righteous", ADJECTIVE, MASCULINE, PLURAL),
        // 204
        new Word("שָׁפַת", "he judged"),
        // 202
        new Word("אֲרוֹן", "ark, chest", true, MASCULINE),
        // 200
        new Word("אָסַף", "he gathered"),
        // 199
        new Word("כָּבוֹד", "abundance, honor, glory", true, MASCULINE),
        // 195
        new Word("רוּם", "he was high, exalted", true),
        new Word("כַּף", "palm of the hand, sole of the foot", true, FEMININE),
        new Word("כַּפוֹת", "palms of the hands, soles of the feet", FEMININE, PLURAL),
        // 194
        new Word("יָכוֹל", "he was able", true),
        // 193
        new Word("שֶׁמֶן", "fat, oil", MASCULINE),
        new Word("שְמָנִים", "fats, oils", MASCULINE, PLURAL),
        // 191
        new Word("חֲצֵרִים", "settlements, villages", true, MASCULINE),
        new Word("חֲצֵרִים", "settlements, villages", MASCULINE, PLURAL),
        // 190
        new Word("בְּהֵמָה", "beast", FEMININE),
        new Word("בְּהֵמוֹת", "beasts", FEMININE, PLURAL),
        new Word("שָׁבֶט", "scepter, rod, tribe", true, MASCULINE),
        new Word("שְׁבָטִים", "scepters, rods, tribes", MASCULINE, PLURAL),
        // 188
        new Word("אֹזֶן", "ear", true, FEMININE),
        new Word("אָזְנַיִם", "ears", FEMININE, DUAL),
        // 187
        new Word("גָלָה", "he removed, uncovered, departed", true),
        new Word("סֵפֶר", "document, book", true, MASCULINE),
        new Word("סְפָרִים", "documents, books", MASCULINE, PLURAL),
        new Word("רֵעַ", "friend, companion, fellow", true, MASCULINE),
        new Word("רֵעִים", "friends, companions, fellows", MASCULINE, PLURAL),
        // 186
        new Word("שָׁבַע", "he swore"),
        // 185
        new Word("אָבַד", "he perished, he vanished, he became lost", true),
        // 184
        new Word("מִצְוָה", "commandment", true, FEMININE),
        new Word("מִצְוֹת", "commandments", FEMININE, PLURAL),
        // 183
        new Word("בָּקָר", "cattle, herd, ox", true, MASCULINE),
        new Word("בְּקָרִים", "herds, oxen", MASCULINE, PLURAL),
        // 182
        new Word("רִאשׁוֹן", "first, former", ADJECTIVE, MASCULINE),
        new Word("רִאשֹׁנִים", "first, former", ADJECTIVE, MASCULINE, PLURAL),
        new Word("רִאשֹׁנָה", "first, former", ADJECTIVE, FEMININE),
        new Word("רִאשֹׁנוֹת", "first, former", ADJECTIVE, FEMININE, PLURAL),
        // 179
        new Word("זָקֵן", "old", ADJECTIVE, MASCULINE),
        new Word("זְקֵנִים", "old", ADJECTIVE, MASCULINE, PLURAL),
        new Word("זְקֵנוֹת", "old", ADJECTIVE, FEMININE, PLURAL),
        // 178
        new Word("הוֹשִׁיעַ", "he saved, delivered - ישׁע", true, HIPHIL),
        new Word("רָבָה", "he was(became) great/many", true),
        new Word("שָֹפָה", "lip, language, edge, shore", true, FEMININE),
        new Word("שְׂפָתַיִם", "lips, languages, edges, shores", FEMININE, DUAL),
        new Word("לָמָּה", "why?", true),
        // 174
        new Word("שָאַל", "he asked", true),
        // 173
        new Word("שָׁחָה", "he bowed down", true),
        // 171
        new Word("בִּין", "he discerned, understood", true),
        new Word("נִלְחַם", "he engaged in battle (reciprocal), waged war – לחם", true, NIPHAL),
        new Word("קָדַשׁ", "he was consecrated, he consecrated", true),
        // 170
        new Word("בָּחַר", "he chose, tested, examined", true),
        // 167
        new Word("הָרַג", "he attacked, he slew", true),
        new Word("רָעָה", "he pastured, tended, grazed", true),
        new Word("דּוֹר", "period, generation, dwelling", true, MASCULINE),
        new Word("דּוֹרִים", "periods, generations, dwellings", MASCULINE, PLURAL),
        new Word("מְלָאכָה", "work, occupation", true, FEMININE),
        new Word("מַלְאֲכוֹת", "works, occupations", FEMININE, PLURAL),
        // 166
        new Word("אַחֵר", "another", true, ADJECTIVE, MASCULINE, SINGULAR),
        new Word("אֲחֵרִים", "another", ADJECTIVE, MASCULINE, PLURAL),
        new Word("אַחֶרֶת", "another", ADJECTIVE, FEMININE, SINGULAR),
        new Word("אֲחֵרוֹת", "another", ADJECTIVE, FEMININE, PLURAL),
        // 165
        new Word("דָּרַשׁ", "he sought, inquired, investigated, required, demanded", true),
        // 164
        new Word("חוּץ", "outside, street", true, NOUN, MASCULINE),
        new Word("פֶּתַח", "opening, doorway, entrace", MASCULINE),
        new Word("פְּתָחִים", "openings, doorways, entraces", MASCULINE, PLURAL),
        // 163
        new Word("סָבַב", "he turned around, went around, surrounded", true),
        // 162
        new Word("טָמֵא", "he was/became unclean", true),
        new Word("זֶבַח", "sacrifice", true, NOUN, MASCULINE),
        // 161
        new Word("אַיִל", "ram", true, NOUN, MASCULINE),
        new Word("בַּד", "alone", true),
        new Word("אַך:", "only, surely, nevertheless", true),
        new Word("בַּעַל", "owner, master, husband, (divine title) Baal", MASCULINE),
        // 160
        new Word("נוּס", "he fled, he escaped", true),
        new Word("גִּּבּוֹר", "mighty man, hero, warrior", true, MASCULINE),
        new Word("גִּּבּוֹר", "mighty", true, ADJECTIVE),
        // 159
        new Word("צדָקָה", "righteousness", true, FEMININE),
        // 156
        new Word("שָׂמַח", "he rejoiced, he was glad", true),
        // 153
        new Word("מָוֶת", "death, dying", true, MASCULINE),
        new Word("צָפוֹן", "north, northern", true, FEMININE),
        new Word("כָּסָה", "he covered", true),
        // 151
        new Word("נֶגֶד", "opposite, in front of", true),
        // 150
        new Word("רֹב", "multitude, greatness", true, NOUN, MASCULINE),
        new Word("נָגַע", "he touched, struck, escaped", true),
        // 149
        new Word("עֵדָה", "congregation, assembly", true, FEMININE),
        new Word("חָכְמָה", "wisdom", true, FEMININE),
        // 148
        new Word("שָׁבַר", "he broke (up), smashed", true),
        new Word("שָׂנֵא", "he hated", true),
        // 147
        new Word("שְׁמֹנֶה", "eight", true, MASCULINE),
        new Word("שְׁמֹנִים", "eighty", true),
        new Word("עֲבֹדָה", "work, labor, service, worship", FEMININE),
        // 146
        new Word("נָסַע", "he pulled out, pulled up, set out, started out, departed, journeyed, marched", true),
        new Word("הִלֵּל", "he praised – הָלַל", true, PIEL),
        new Word("הוּלָּל", "he was praised – הָלַל", true, PUAL),
        // TODO why does this start with y, that doesn't seem right.
        new Word("יִתְהַלִּל", "he boasted about himself – הָלַל", true, HITHPAEL),
        // 145
        new Word("עֲבֹדָה", "labor, service", true, NOUN, FEMININE),
        // 144
        new Word("רָדַף", "he pursued, followed after, persecuted", true),
        // 143
        new Word("חָנָה", "he declined, camped, lay seige to", true),
        // 142
        new Word("נִשְׁחַת", "he was corrupt, spoiled", true, NIPHAL),
        new Word("שִׁחֵת", "he was spoiled, wiped out, ruined", true, PIEL),
        new Word("הִשְׁהִית", "he destroyed", true, HIPHIL),
        // 141
        new Word("אָז", "then, since, before", true),
        new Word("יַיִן", "wine", true, MASCULINE),
        new Word("יָמִין", "right hand, south", true, FEMININE),
        new Word("כְּמוֹ", "like, as", true),
        // 140
        new Word("נוּחַ", "he rested, settled down", true),
        new Word("הֵנִיחַ", "he gave rest to, he set down", true, HIPHIL),
        // 139
        new Word("שֶׁ", "who, whom, that, which (relative pronoun), prefixed", true),
        new Word("מִשְׁכָּן", "dwelling place, tabernacle", true, MASCULINE),
        new Word("נְחֹשֶׁת", "copper, bronze", true, MASCULINE),
        new Word("קָרָא", "he encountered, he met", true),
        // 138
        new Word("סוּס", "horse", MASCULINE),
        new Word("סוּסִים", "horses", MASCULINE, PLURAL),
        new Word("חָכָם", "wise", true, ADJECTIVE, MASCULINE, SINGULAR),
        new Word("חֲכָמִים", "wise", ADJECTIVE, MASCULINE, PLURAL),
        new Word("חֲכָמָה", "wise", ADJECTIVE, FEMININE, SINGULAR),
        new Word("חֲכְמוֹת", "wise", ADJECTIVE, FEMININE, PLURAL),
        // 137
        new Word("נַחַל", "stream, wadi", true, MASCULINE),
        // 136
        new Word("פָּתַח", "he opened", true),
        // 135
        new Word("כִּסֵּא", "chair, throne", true, MASCULINE),
        new Word("הֵחֵל", "he began – חָלַל", true, HIPHIL),
        new Word("נִחָל", "he was defiled – חָלַל", true, NIPHAL),
        new Word("חִלֵּל", "he polluted, profaned – חָלַל", true, PIEL),
        // 134
        new Word("מִסְפָּר", "number", true, NOUN, MASCULINE),
        new Word("שֶׁמֶשׁ", "sun", true, MASCULINE),
        new Word("זָבַח", "he slaughtered, sacrificed", true),
        new Word("פָּנָה", "he turned", true),
        new Word("עֶרֶב", "evening, sunset", true, MASCULINE),
        // 133
        new Word("קָבַר", "he buried", true),
        new Word("אַף", "also, indeed, even", true),
        new Word("פֶּן–", "lest, otherwise", true),
        new Word("פַּר", "bull, ox, steer", true, MASCULINE),
        new Word("שָׁאַר", "he remained, was left over, survived", true),
        new Word("שָׁכַן", "he settled, abode, dwelt, inhabited", true),
        new Word("חוֹמָה", "wall", true, FEMININE),
        // 131
        new Word("חֹק", "statute, appointed time, portion", true, MASCULINE),
        // 130
        new Word("נָשִׂיא", "chief, leader, prince", true, MASCULINE),
        // 127
        new Word("אֶמֶת", "truth, fidelity", true, FEMININE),
        new Word("קָבַץ", "he collected, gathered, assembled", true),
        // 126
        new Word("כֹּחַ", "strength, power", true, MASCULINE),
        new Word("עֶצֶם", "bone, skeleton", true, FEMININE),
        // 125
        new Word("בּוֹשׁ", "he was ashamed", true),
        new Word("נָגַשׁ", "he drew near, approached", true),
        new Word("חֵמָה", "wrath, heat, poison", true, FEMININE),
        new Word("חֲצִי", "half, middle", true, MASCULINE),
        new Word("הִשְׁלְִיך:", "he threw, flung, cast - שָׁלַך", true, HIPHIL),
        // 124
        new Word("חָשַׁב", "he thought, considered, devised, planned, valued, esteemed", true),
        // 123
        new Word("קָהָל", "assembly, community, crowd", true, MASCULINE),
        // 121
        new Word("לָכַד", "he took, captured, caught, seized", true),
        // 120
        new Word("אוֹר", "light, daylight, sunshine", true, MASCULINE),
        new Word("רֶכֶב", "chariot, upper millstone", true, MASCULINE),
        new Word("בְּכֹר", "firstborn", true, MASCULINE),
        // 119
        new Word("יָשָׁר", "straight, right (correct, not direction)", true, MASCULINE, ADJECTIVE),
        new Word("אָחוֹת", "sister", FEMININE),
        new Word("פְּרִי", "fruit, offspring", true, MASCULINE),
        new Word("נָהָר", "river, stream", true, MASCULINE),
        // 118
        new Word("פַּעַם", "beat (noun), foot, anvil, time (as in music, keeping time)", true, FEMININE),
        new Word("תּוֹעֵבָה", "abomination, abhorence, offensive thing", true, FEMININE),
        new Word("בָּטַח", "to trust, be confident, rely upon", true),
        // 117
        new Word("יָטַב", "he was well, it went well with, it was pleasing", true),
        new Word("שָׁפַך", "he poured, spilt, shed (blood)", true),
        new Word("לָשׁוֹן", "tongue, language", true, MASCULINE, FEMININE),
        new Word("מַמְלָכָה", "kingdom, reign, dominion", true, FEMININE),
        new Word("שָׂרַף", "he completely burned, destroyed", true),
        new Word("גָּדַל", "he grew up, became great, strong, wealthy, important", true),
        // 116
        new Word("שָׁלֵם", "he was whole, complete"),
        new Word("שִׁלַּם", "he repaid - שָׁלֵם", true, PIEL),
        new Word("הִשְׁלִים", "he made peace - שָׁלֵם", true, HIPHIL),
        // 115
        new Word("נִבָּא", "he prophisied - נָבָא", true, NIPHAL),
        new Word("קִטֵּר", "he made sacrifices smoke (he offered a burned sacrifice) - קָטַל", true, PIEL),
        new Word("הִקְטִיר", "he made sacrifices smoke, he caused to smoke (in worship) - קָטַל", true, HIPHIL),
        // 114
        new Word("כָּבֵד", "he was heavy, he was honored", true),
        new Word("בָּכָה", "he wept (in grief or joy)", true),
        new Word("מִגְרָשׁ", "common land, open land, pasture", true, MASCULINE),
        // 113
        new Word("שֶׁקֶר", "deception, lie, disappointment", true, MASCULINE),
        // 112
        new Word("לָבַשׁ", "he put on a garmet, he clothed", true),
        new Word("בִּלְתּי", "not (with infinitive), except", true),
        new Word("לְבִלְתּי", "not (with infinitive)", true),
        new Word("חָשַׁב", "he thought, accounted", true),
        new Word(" עַמּוּד", "pillar, column", true, MASCULINE),
        // 111
        new Word("שַׁבָּת", "Sabbath, rest period", true, MASCULINE),
        new Word("הוֹדוּ", "he praised, he confessed - " + "יָדָה" + " - he cast", true, HIPHIL),
        // 110
        new Word("עָפָר", "dry earth, dust", true, MASCULINE),

        // 109
        new Word("רַק", "only, still, but, however", true),

        // 107
        new Word("סָפַר", "he counted", true),
        new Word("כֶּבֶשׂ", "lamb, sheep", true, MASCULINE),

        // 106
        new Word("בָּמָח", "(cultic) high place, hill", true, MASCULINE),

        // 104
        new Word("תָּמִיד", "continually", true),
        new Word("גָּאַל", "he redeemed, delivered, acted as kinsman, avenged", true),
        new Word("בַּעַד", "behind, through", true),
        new Word("חֻקָּח", "statute, ordinance", true, MASCULINE),
        new Word("חֻקּוֹת", "statutes, ordinances", MASCULINE, PLURAL),

        // 102
        new Word("כָּפַר", "he covered, atoned, made atonement", true),

        // 101
        new Word("רָעָב", "famine, hunger", true, MASCULINE),

        // 100
        new Word("יַעַן", "on account of", true)/*,

        // 96
        new Word("יַחְדָּו", "together, united", ADVERB),

        // 94
        new Word("טָהֵר", "to be clean, pure"),

        // 82
        new Word("פֹּה", "here, at this place"),

        // 78
        new Word("תֵּשַׁע", "nine", MASCULINE),
        new Word("תִּשְׁעִים", "ninety"),

        // 74
        new Word("חָפֵץ", "he delighted in, desired, was willing"),

        // 71
        new Word("שָׁבַת", "he stopped, ceased, rested"),

        // 64
        new Word("תָּמַם", "he be(came) complete, came to an end, ceased, was consumed, was spent, " +
            "was burned out"),
        new Word("אָרַר", "he cursed"),

        // 63
        new Word("אָחַז", "he seized, grasped, took"),
        new Word("יָצַר", "he formed, fashioned, shaped, created"),

        // 60
        new Word("בָּעַר", "he burned up, consumed"),

        // 46
        new Word("יַחַד", "unitedness", MASCULINE, NOUN),

        // 44
        new Word("טוֹב", "he was good"),

        // 18
        new Word("רְבָבָה", "ten thousand")

        */


    );
  }

  @Override
  public List<GrammarRule> buildRules() {
    return Arrays.asList(
        /*
        new GrammarRule("Alphabet:\n" +
            "אבגדהוזחטיכלמנסעפצקרשׂשׁת"),

        new GrammarRule("Gutturals:  אעהח"),

        new GrammarRule("Vowels:\n" +
            "              a     e      i    o     u\n " +
            "long    " + " ָ      ֵ           ֹ      " + "\n" +
            "short   " + " ַ      ֶ      ִ     ָ      ֻ " + "\n" +
            "reduced " + " ֲ      ֱ           ֳ       "),

        new GrammarRule("Rules of Syllabification p18\n" +
          "  1. Every syllable must begin with one consonant and have only one vowel.\n" +
          "  2. Syllables are either open or closed.  Open end in a vowel, closed in a consonant."),

        new GrammarRule("Hebrew words are usually accented on the last syllable."),

        new GrammarRule("Syllable classification p19\n" +
          "  1. Tonic: accented syllable (the one with the “tone”) דָבָר second syllable is tonic\n" +
          "  2. Pretonic: syllable immediately before the tonic; first syllable above\n" +
          "  3. Propretonic: syllable before the pretonic"),

        new GrammarRule("Dagesh Forte letters count as two consonants for the purpose of syllabification."),

        new GrammarRule("Differentiating Dagesh Forte and Dagesh Lene in בגדכפת letters\n" +
          " * The Dagesh is Forte if it is preceded by a vowel. אַתּה\n" +
          " * The Dagesh is Lene if preceded by a consonant. מַלְכּה\n" +
          " * The Dagesh is Lene at the beginning of the word unless the previous word ends in a vowel. דָּבָר"),

        new GrammarRule("Silent Schewa and Vocal Schewa\n" +
          "The Vocal Schewa will always occur in an open syllable.\n" +
          "The Silent Schewa will always come at the end of a closed syllable.\n" +
          " * The Schewa is silent if the previous vowel is short.  Implies:\n" +
          "   * A Schewa is silent when immediately preceded by a short vowel. פַּרְעֹה\n" +
          "   * The first of two contiguous Schewas is silent. מִשְׁפְּטֵי\n" +
          "   * A Schewa at the end of a word is silent. כָּתַבְתְּ"),

        new GrammarRule("Silent Schewa and Vocal Schewa (continued)\n" +
            "The Vocal Schewa will always occur in an open syllable.\n" +
            "The Silent Schewa will always come at the end of a closed syllable.\n" +
          " * The Schewa is vocal if not immediately preceded by a short vowel.  Implies:\n" +
          "   * Initial Schewa is always vocal. בְּרָכָה\n" +
          "   * The second of two contiguous Schewas is vocal.\n" +
          "   * A Schewa under any consonant with Daghesh Forte is vocal. הַמְּלָכִים\n" +
          "   * A Schewa after an unaccented long vowel is vocal. כֹּתְבִים"),

        new GrammarRule("Qamets and Qamets Hatuf p22\n" +
          "Both little T, Qamets long as in father, Qamets Hatuf short as in ‘lot’.  Rules for distinguishing:\n" +
          " * When in doubt, go with Qamets as it is much more frequent\n" +
          " * Qamets Hatuf occurs only in closed and unaccented syllables. חָכְמָה (first syllable)\n" +
          " * Qamets prefers open, pretonic syllable or closed accented syllable. דָּבָר (both syllables)\n" +
          " * Metheg, small vertical line to the left of the Qamets, sometimes used to clarify that it is a Qamets."),

        new GrammarRule("Furtive Pathach\n" +
          " When a word ends in ח or ע , a Pathach (horizontal line) may appear beneath this\n" +
          "consonant and must be pronounced before the guttural rather than after."),

        new GrammarRule("Diphthong\n" +
          "Most common Hebrew diphthong is" + " ַיִ  " + "\n" +
          "Syllables that contain a diphthong are considered to be closed because they end in a consontant."),

        new GrammarRule("Vowel Syllable Preferences\n" +
          " * Short vowels prefer closed, unaccented syllables or open, accented syllables. Both syllables in עֶבֶד\n" +
          " * Long vowels prefer closed, accented syllables or open, pretonic syllables.  Both syllables in" + " דָּבָר\n" +
          " * Vocal Shewa and reduced hateph vowels prefer open, propretonic syllables.  The\n" +
          "   reduced vowels appear with guttural consonants in the open, propretonic position.\n" +
          "   First syllable in דְּבָרִים  and אֱלֹהִים"),

        new GrammarRule("Gender Endings\n" +
          "Masculine Singular: anything\n" +
          "Feminine Singular: " + " ָה ַת ֶת  ִית וּת" + "\n" +
          "Masculine Plural: " + " ִים " + "\n" +
          "Feminine Plural: וֹת\n" +
          "Masculine Dual:" + " ַים " + "\n" +
          "Feminine Dual: תַיִם or same as masculine\n"),

        new GrammarRule("Exceptions to Gender Ending Rules\n" +
          " 1. Some feminine nouns are endingless.\n" +
          " 2. Some nouns use plural endings from the other gender (e.g. אב שנה)\n" +
          " 3. Special dual nouns: שָׁמַיִם מִצְרַיִם מַיִם  These are always dual.\n" +
          " 4. Some nouns go through irregular stem change in the plural:  אנשים איש  נשים אשה\n" +
          " 5. Some feminine pluralizations will appear with defective spelling תֹ instead of וֹת"),

        new GrammarRule("Patterns of Pluralization p 32\n" +
          " 1. Pluralization with no change: some nouns do not change their vowels when being\n" +
          "    made plural.  Often happens with monosyllabic words with an unchangeable long\n" +
          "    vowel: שִׁיר to שִׁירִים Also happens with two syllable words with shewa or hateph\n" +
          "    pathach in first syllable and unchangeable long vowel in second: חֳלוֹם to חֳלוֹמוֹת and רְהוֹב to רְהוֹבוֹת\n" +
          " 2. Two syllable nouns that are accented on the final syllable and have Qamets or\n" +
          "    Tsere pretonic syllable will experience propretonic reduction.  Qamets/Tsere will\n" +
          "    be replaced by Shewa.  דָּבָר -> דְּבָרִים and לֵבָב -> לְבָבוֹת\n" +
          "    If the initial consonant is gutteral it will move to Hateph Patach.  עָנָן –> עֲנָנִים\n" +
          "    Nouns with vowel letters do not experience propretonic reduction."),

        new GrammarRule("Patterns of Pluralization (continued)\n" +
          " 3. Segholate nouns are nouns with accent on the first syllable, so called because in\n" +
          "    most cases one or both vowels are a Seghol.  These pluralize with a Shewa in the\n" +
          "    first syllable (or Hateph vowel for gutturals) and a Qamets in the second:  מֶלֶךּ –> מְלָכִים and חֶרֶב –> חֲרָבוֹת\n" +
          " 4. Pluralization of Geminate nouns.  Geminate nouns appear to have only 2 root\n" +
          "    consonants (e.g. עַם).  Actually they originally had 3, with the third duplicating\n" +
          "    the second.  These pluralize with Dageshe Forte in the second \n" +
          "    consonant. עַם –> עַמִּים  Not all biconsonantal nouns are geminate, for example אָב\n" +
          " 5. Irregular pluralization.  Many nouns are irregular in their pluralization."),

        new GrammarRule("The Rules of Shewa p38\n" +
          " 1. Hebrew does not allow two contiguous vocal schewas.  If prefixing a preposition\n" +
          "    with a shewa to a word that starts with a schewa, first schewa becomes a\n" +
          "    hireq. נְבִיאִם plus לְ becomes לִנְבִיאִם\n" +
          "    Exception: If the syllable begins with י, after combining the י does not take a\n" +
          "      shewa: יְהוּדָה plus לְ becomes לָיהוּדָה.\n" +
          " 2. Vocal schewa cannot proceed a guttural with a reduced vowel.  The first vocal\n" +
          "    schewa converts to the short vowel that corresponds to the reduced vowel it\n" +
          "    proceeds.  חֲלוֹם plus בְּ becomes בַּחֲלוֹם\n" +
          "    Exception: In אֱלֹהִים  the shortened vowel under א  is removed.  Thus אֱלֹהִים plus לְ becomes לֵאלֹהִים"),

        new GrammarRule("Definite Article\n" +
          " * Definite Article is הַ plus a Dagesh Forte in the first consonant of the noun\n" +
          " * When the first consant in a begadkephat consonant the Dagesh Lene in the begadkephat\n" +
          "   becomes a Dagesh Forte\n" +
          " * When first consontant is a guttural, Dagesh Forte is rejected\n" +
          "   * When the first consonant is א or ע or ר the Patach lengthens to a Qamets, הָ\n" +
          "   * When the first consonant is ה or ח the Dagesh Forte is dropped.  This is\n" +
          "     referred to as \"virtual doubling\"\n" +
          "   * Before nouns that begin with an unaccented עָ or הָ or חָ (last can also be\n" +
          "     accented), the definite article becomes Seghol הֶ\n" +
          " * A few words change their initial vowel to Qamets, e.g. אֶרֶצ becomes הָאָרֶצ"),

        new GrammarRule("Conjuncton ו (and, but, also, even)\n" +
            " * Most frequently spelled וְ\n" +
            " * Becomes Shureq וּ \n" +
            "   * before ב, מ, פ (bump rule), ב פ loose Dagesh lene in this case בּיִת becomes וּבַיִת \n" +
            "   * and before a vocal Shewa נְעָרִים becomes וּנְעָרִים\n" +
            " * Before Hateph vowel, conjuction takes the corresponding short vowel אֲנָשׁים becomes וַאֲנָשׁים  \n" +
            "   * Exception, does not apply to אלהים\n" +
            " * May be spelled with Qamets before monosyllabic words or words with initial accent צֹאן becomes וָצֹאן "),

        new GrammarRule("Additional uses of definite article:\n" +
            " * Demonstrative (this/that): אנכי מצוך היום - I am commanding you the[this] day\n" +
            " * Vocative, indicating direct address: ויקרא לאמר המלך - And he called saying the[O] king\n" +
            " * Superlative with an adjective: הטוב והישׁר - the good[best] and the upright[most upgright]\n" +
            " * Possessive pronoun: ולקח דוד הכנור - And David took the[his] harp"),

        new GrammarRule("Inseparable prepositions:\n" +
            "* Before most consonants will appear with a vocal Shewa ּּּבְשָדֶה\n" +
            "* Before a Hateph vowel will take the corresponding short vowel כַּאֲנָשִׁים\n" +
            "* Before a vocal Shewa will take a Hireq לִנְבִיאִים\n" +
            "* When combined with a definite article replaces the ה and takes its vowel ּבַשָּׂדֶה\n"),

        new GrammarRule("The preposition מִן\n" +
            " * Frequently is joined to its object via a Maqqef (-)\n" +
            " * Can occur as an inseparable preposition, in which case the first consontant of\n" +
            "   the noun to which it is prefixed usually takes a dagesh forte: מִמֶּלֶך\n" +
            "   * When the first letter is a begadkephat letter with a dagesh lene, the dagesh\n" +
            "     lene becomes a dagesh forte\n" +
            "   * When the first letter is a gutteral, the hireq under מ lengthens to a tsere\n" +
            "     e.g. מֵאִישׁ\n" +
            "   * When the first letter is ח there is not usually vowel lengthening."),

        new GrammarRule("Special uses of מִן (beyond \"from\")\n" +
            " * Comparative use: applied to adjective to make it comparative\n" +
            "   e.g. טוֹבָה חָכְמָה מִזָּהָב wisdom is better than gold\n" +
            " * Superlative use: used with כּל to express superlative\n" +
            "   e.g. עָרוּם מִכֹּל חַיַּת הַשָּׂדֶה the most clever living thing of the field\n" +
            " * Partitive use: Can mean a part of something: מֵהָאֲנָשִׁים some of the men"),

        new GrammarRule("Compound prepositions:\n" +
            " * preposition plus פנה (face)\n" +
            "   * before, in the precense of: לִפְנֵי\n" +
            "   * away from, out from, from before, on account of: מִפְּנֵי and מִלִּפְנֵי\n" +
            "   * in the face, in the sight of, before, up against, opposite to: עַלֿֿ-פְּנֵי\n" +
            " * preposition plus דבר\n" +
            "   * on account of עַל-דְּבַר"),

        new GrammarRule("Use of adjectives:\n" +
            " * Attributive: modifies a noun.  Attributive adjectives follow the noun they\n" +
            "   modify and agree in gender, number, and definiteness.\n" +
            " * Predicative: asserts something about the noun, e.g. the book is big.\n" +
            "   No verb is used.  Predicative adjectives agree with the noun in gender and number\n" +
            "   but not definiteness.  They may proceed or follow the noun.\n" +
            " * Substantive: no noun present, stands for those who have the trait (e.g. the wise)"),

        // TODO - need to understand the difference in how these are translated.
        new GrammarRule("Demonstratives as adjectives and pronouns:\n" +
            " * When a demonstrative is functioning as an adjective, it will follow the noun\n" +
            "   it modifies and agree in gender, number, and definiteness. האיש הזה\n" +
            "   * Attributive adjective (if present) will be between the noun and the following\n" +
            "     demonstrative: האיש הטוב הזה\n" +
            " * When a demonstrative is functioning as a pronoun, it will procede the noun and\n" +
            "   agree in gender and number but not definiteness. זה האיש\n" +
            "   * Attributive adjective (if present) will still follow the noun: זה האיש הטוב"),

        new GrammarRule("Spelling for interrogative particle הֲ\n" +
            " * Prefixed to a guttural consonant or any consonant with a shewa: הַ\n" +
            " * Prefixed to a guttural consonant followed by a qamets: הֶ"),

        new GrammarRule("Disambiguating the definite article and the interrogative particle:\n" +
            " * The interrogative particle does not usually have a dagesh forte in the next consonant\n" +
            " * The interrogative particle is often attached to a verb or another particle\n" +
            " * The definite article is never spelled with a hateph patach"),

        new GrammarRule("Pronominal suffixes:\n" +
            " * When attached to a noun they indicate possessive.\n" +
            " * When attached to a preposition or the definite direct object marker they are objective\n." +
            " * Come in types 1 and 2:\n" +
            "   * Type 1 is used with singular nouns, some prepositions, and the direct object marker.\n" +
            "   * Type 2 is used with plural nouns and some prepositions.\n"),

        new GrammarRule("Spelling changes for pronominal suffixes:\n" +
            " * Singular nouns can take plural pronominal suffixes (e.g. my horses) and vice versa.\n" +
            " * When attached to masculine (or feminine endingless) plural nouns, the ים is dropped\n" +
            " * Nouns ending segol ה (e.g. שָׂדֶה ) will drop the segol ה before adding the\n" +
            "   pronominal suffix: שׂדִי my field\n" +
            " * Feminine singular nouns ending in patach ה the ה changes to ת before the ending\n" +
            "   is applied."),

        new GrammarRule("Spelling changes for pronominal suffixes (continued):\n" +
            " * Many monosyllabic nouns add י to their stem before a pronominal suffix.  Can be\n" +
            "   distinguished in the singular (type 1) by the hireq before the י\n" +
            " * The preposition כְּ changes to כָּמוֹ in singular and first person plural when\n" +
            "   taking a pronominal suffix.\n" +
            " * The preposition מִן changes to מִמֶ in singular and first person plural when\n" +
            "   taking a pronominal suffix.\n" +
            ""),

        // TODO add a real word here
        new GrammarRule("Type 1 pronominal suffixes (singular nouns, some prepositions, direct\n" +
            "object marker, most verbs):\n" +
            "        singular           plural\n" +
            "1p      " +  " נוּ               נִי / ִי   " + "\n" +
            "2pm     " + " כֶם               ךָ       " + "\n" +
            "2pf     " + " כֶן               ך:      " + "\n" +
            "3pm     " + "חֶם / ָם          הוּ / וֹ   " + "\n" +
            "3pf     " + "הֶן / ָן           הָ / ָהּ   " + "\n"),

        // TODO use a real word here to show how masculine plural nouns loose their endings
        new GrammarRule("Type 2 pronominal suffixes (plural nouns, some prepositions) (א in\n" +
            "all cases just to give letter to put vowel under).  All type 2 have י in them.\n" +
            "        singular           plural\n" +
            "1p" +  " ֵינוּ                 ַי    " + "\n" +
            "2pm" + " ֵיכֶם                ֶיךָ    " + "\n" +
            "2pf" + " ֵיכֶן                ַיִך:   " + "\n" +
            "3pm" + " ֵיהֶם                ָיו    " + "\n" +
            "3pf" + " ֵיהֶן                 ֶיהָ   " + "\n"),

        new GrammarRule("Distinguishing similar words with pronominal suffixes:\n" +
            " * Direct object marker and אֵת/אֶת are the same alone but differ with pronominal\n" +
            "   suffix.  Direct object marker has a holem: אֹתֵי while the preposition has hireq\n" +
            "   and dagesh forte: אִתִּי\n" +
            " * Preposition עִם and noun עַם both keep their first vowels throughout, both add\n" +
            "   dagesh forte in mem."),

        new GrammarRule("Construct chains:\n" +
            " * Roughly equivalent to Greek genitive case.\n" +
            " * Last noun in the chain is in an absolute state, all others are in construct state.\n" +
            " * No other words can come between the nouns in a construct chain.\n" +
            " * A construct chain is either entirely definite or entirely indefinite.  When\n" +
            "   definite only the absolute noun takes the definite article or has a\n" +
            "   pronominal suffix or is a proper noun."),

        new GrammarRule("Construct chains continued:\n" +
            " * Adjectives that modify any noun in the chain come after the chain.  Number and\n" +
            "   gender of the adjective can sometimes determine which noun it modifies, sometimes\n" +
            "   you must use context.  This applies to demonstratives adjectives (this, that) as well.\n" +
            " * Substantive adjectives functioning as a noun can form part of the construct chain.\n" +
            " * Inseparable prepositions can be attached to construct nouns."),

        new GrammarRule("Spelling in construct state:\n" +
            " * A construct noun surrenders its primary accent.  A construct chain is pronounced\n" +
            "   as a single word, with the accent on the absolute noun.  This is sometimes\n" +
            "   marked with a maqqef (-).\n" +
            " * Masculine plural and both dual endings change to" + " ֵי " + " e.g. אֱלֹהִים changes to אֱלֹהֵי "),

        new GrammarRule("Spelling in construct state continued:\n" +
            " * Vowel reduction:\n" +
            "   * Qamets (and sometimes tsere) change to patach in a final closed syllable:\n" +
            "     e.g. מִשְׁפָּט changes to מִשְׁפַּט\n" +
            "   * Qamets or tsere change to vocal shewa in open, unaccented syllable:\n" +
            "     (or a hateph vowel under a gutteral): נָבִִיא changes to נְבִיא \n" +
            " * Feminine singular nouns ending in" + " ָה " + "changes to" + " ַת " + "\n" +
            "   e.g. תּוֹרָה becomes תּוֹרַת\n" +
            " * Some monosyllabic nouns add a hireq yod in the contruct state."),

        new GrammarRule("A noun can be made superlative by placing it in a construct chain\n" +
            "with the construct noun singular and the absolute noun plural and definite:\n" +
            "e.g. קֹדֶשׁ הַקֱּדָשִׁים the holy of holies, or the most holy [place]."),

        new GrammarRule("Cardinal numbers:\n" +
            " * 'one' acts as an adjective and comes after the noun and agrees in gender and\n" +
            "   definiteness.  Can be used in a construct in which case it means 'one of'.\n" +
            " * 'two' is a noun, agrees in gender with the modified noun, and can be used in\n" +
            "   absolute or construct state with no change in meaning.\n" +
            " * 3-10 are nouns but take opposite gender from what they are modifying.  Can also\n" +
            "   be absolute or construct.\n" +
            " * 2-10 can have a pronominal suffix, meaning 'x of y', e.g. שְׁנֵיהֶם 'two of them'"),

        new GrammarRule("Patterns of cardinal numbers above 10:\n" +
            " * 11-19: x 10, e.g. אַחַתּי עָשָׂר is 11\n" +
            " * 11-19: 10 agrees with modified noun in gender, while other number is opposite.\n" +
            " * 20: Masculine plural of 10\n" +
            " * 30-90: Masculine plural of 3-9\n" +
            " * 21-99: x and y: עֶשְׂרִים וְאַחַת twenty and one\n" +
            " * 200: one hundred dual: מָאתַים\n" +
            " * 300-900: x 100, e.g. שְׁלֹשׁ מֵאוֹת three hundred\n" +
            " * 2000: one thousand dual: אַלְפַּיִם\n" +
            " * 3000-9000: x 1000, e.g. שְׁלֹשֶׁת אֶלֶף\n" +
            " * 20,000: ten thousand dual: רִבּוֹתַיִם\n" +
            " * 30,000-90,000: x 10,000, e.g. שְׁלֹשׁ רִבּוֹת"),

        new GrammarRule("Ordinal numbers:\n" +
            " * Classified as adjectives, when attributive they follow the noun they modify\n" +
            "   and usually agree in gender and definiteness.\n" +
            " * For ordinals greather than tenth, cardinal numbers are used."),

        new GrammarRule("Basic verbal stem meaning:\n" +
            "           Simple    Intensive   Causative\n" +
            "Active     qal       piel        hiphil\n" +
            "Passive    niphal    pual        hophal\n" +
            "Reflexive  niphal    hithpael"),

        new GrammarRule("Hebrew verb conjugations:\n" +
            " * Perfect:  completed action, state of being.\n" +
            " * Imperfect:  incomplete action, habitual or customary actions, subjunctive.\n" +
            " * Imperative: direct command, sometimes request, second person only.\n" +
            " * Cohortative: wish, request, or command, can express purpose or result, first person only"),
        
        new GrammarRule("Hebrew verb conjugations (continued):\n" +
            " * Jussive:  mild command or strong wish, third person only\n" +
            " * Infinitive construct: like an English infinitive, a verbal noun.\n" +
            " * Infinitive absolute: used with other verbs to emphasize or intensify action or to\n" +
            "   express contemporaneous action.  Can be used as an imperative.\n" +
            " * Participle:  verbal adjective."),

        new GrammarRule("Qal perfect paradigm of the strong verb:\n" +
            "      Perfect                  Sufformative\n" +
            "1s    תּי                          קָטַלְתִּי\n" +
            "2ms   תָּ                           קָטַלְתָּ \n" +
            "2fs   תְּ                           קָטַלְתְּ\n" +
            "3ms    קָטַל\n" +
            "3fs   אָה                          קָטְלָה\n" +
            "1p    נוּ                           קָטַלְנוּ\n" +
            "2mp  תֶּם                          קְטַלְתֶּם\n" +
            "2fp   תֶּן                          קְטַלְתֶּן\n" +
            "3p     וּ                           קָטְלוּ"),

        new GrammarRule("Stative verbs often have tsere (..) or holem (o) in second vowel.\n" +
            "In the imperfect they have pathach (_) instead of holem in the second vowel.\n" +
            "Tsere    Holem    Strong\n" +
            "Stative  Stative    Verb\n" +
            "קָטַלְתִּי    קָטֹנְתִּי    כָּבַדְתִּי" + "\n" +
            "קָטַלְתָּ     קָטֹנְתָּ    כָּבַדְתָּ " + "\n" +
            "קָטַלְתְּ     קָטֹנְתְּ    כָּבַדְתְּ " + "\n" +
            "קָטַל       קָטֹן     כָּבֵד  " + "\n" +
            "קָטְלָה     קָטְנָה    כּבְדָה " + "\n" +
            "קָטַלְנוּ     קָטֹנּוּ     כָּבַדְנוּ " + "\n" +
            "קְטַלְתֶּם    קְטָנְתֶּם   כְּבַדְתֶּם" + "\n" +
            "קְטַלְתֶּן     קְטָנְתֶּן   כְּבַדְתֶּן " + "\n" +
            "קָטְלוּ     קָטְנוּ     כָּבְדוּ  "),

        new GrammarRule("Strong verbs have three strong consonants.  Weak verbs classified as follows:\n" +
            " * I-Guttural\n" +
            " * II-Guttural\n" +
            " * III-Guttural, broken into III-ח/ע, III-א, and III-ה (really III-י but י changes to ה in many forms)\n" +
            " * I-י\n" +
            " * I-נ\n" +
            " * Doubly weak (two of the above)\n" +
            " * Biconsonantal (also called hollow or II-ו/י) these drop middle letter in perfect\n" +
            " * Geminate - identical 2nd and 3rd consonants."),

        // I'm not drunk, this spacing makes it come out right in the display
        new GrammarRule("Qal perfect weak verbs, I and II gutteral:\n" +
            "      II Guttural       I Guttural   Strong\n" +
            "1s    " + "קָטַלְתִּי        עָמַדְתִּי             בָּחַרְתִּי" + "\n" +
            "2ms    " + "קָטַלְתָּ         עָמַדְתָּ              בָּחַרְתָּ " + "\n" +
            "2fs    " + "קָטַלְתְּ         עָמַדְתְּ              בָּחַרְתְּ " + "\n" +
            "3ms     " + "קָטַל          עָמַד               בָּחַר  " + "\n" +
            "3fs    " + "קָטְדָה         עָמְדָה              בָּחֲרָה " + "\n" +
            "1p    " + "קָטַלְנוּ        עָמַדְנוּ             בָּחַרְנוּּּ " + "\n" +
            "2mp   " + "קְטַלְתֶּם        עֲמַדְתֶּם             בְּחַרְתֶּם" + "\n" +
            "2fp   " + "קְטַלְתֶּן        עֲמַדְתֶּן             בְּחַרְתֶּן" + "\n" +
            "3p     " + "קָטְלוּ         עָמְדוּ              בָּחֲרוּ  "),

        new GrammarRule("Qal perfect weak verbs, III gutteral:\n" +
            "      III-ה    III-א   III-ע/ח   Strong\n" +
            "1s    " + "קָטַלְתִּי    שָׁמַעְתִּי    מָצָאתִי    בָּנִיתִי " + "\n" +
            "2ms    " + "קָטַלְתָּ     שָׁמַעְתָּ     מָצָאתָ     בָּנִיתָ " + "\n" +
            "2fs    " + "קָטַלְתְּ     שָׁמַעְתְּ     מָצָאת     בָּנִית " + "\n" +
            "3ms     " + "קָטַל      שָׁמַע      מָצָא      בָּנָה  " + "\n" +
            "3fs    " + "קָטְדָה     שָׁמְעָה     מָצְאָה     בָּנְתָה " + "\n" +
            "1p    " + "קָטַלְנוּּ    שָׁמַעְנוּ    מָצָאנוּ    בָּנִינוּּּ " + "\n" +
            "2mp   " + "קְטַלְתֶּם    שְׁמַעְתֶּם    מְצָאתֶם    בְּנִיתֶם" + "\n" +
            "2fp   " + "קְטַלְתֶּן    שְׁמַעְתֶּן    מְצָאתֶן    בְּנִיתֶן" + "\n" +
            "3p      " + "קָטְלוּ     שׁמְעוּ     מָצְאוּ     בָּנוּ  "),

        new GrammarRule("Qal perfect weak verbs, doubly weak:\n" +
            "      Doubly\n" +
            "      Weak           Strong\n" +
            "1s    " + "קָטַלְתִּי           עָלִיתִיִ" + "\n" +
            "2ms    " + "קָטַלְתָּ            עָלִיתָ" + "\n" +
            "2fs    " + "קָטַלְתְּ            עָלִית" + "\n" +
            "3ms     " + "קָטַל             עָלָה" + "\n" +
            "3fs    " + "קָטְדָה            עָלְתָה" + "\n" +
            "1p    " + "קָטַלְנוּ           עָלִינוּּּ" + "\n" +
            "2mp   " + "קְטַלְתֶּם           עֲלִיתֶם" + "\n" +
            "2fp   " + "קְטַלְתֶּן           עֲלִיתֶן" + "\n" +
            "3p      " + "קָטְלוּ            עָלוּּ"),

        new GrammarRule("Qal perfect weak verbs, geminate:\n" +
            "      Geminate    Strong\n" +
            "1s    " + "קָטַלְתִּי        סַבּוֹתִי" + "\n" +
            "2ms    " + "קָטַלְתָּ         סַבּוֹתָ" + "\n" +
            "2fs    " + "קָטַלְתְּ         סַבּוֹת" + "\n" +
            "3ms     " + "קָטַל          סָבַב" + "\n" +
            "3fs    " + "קָטְדָה         סָבְבָה" + "\n" +
            "1p    " + "קָטַלְנוּ        סַבּוֹנוּ" + "\n" +
            "2mp   " + "קְטַלְתֶּם        סַבּוֹתֶם" + "\n" +
            "2fp   " + "קְטַלְתֶּן        סַבּוֹתֶן" + "\n" +
            "3p     " + "קָטְלוּ         סָבְבוּ" + ""),

        new GrammarRule("Qal perfect weak verbs, biconsonental:\n" +
            "      Biconsonental  Strong\n" +
            "1s    " + "קָטַלְתִּי            קַמְתִּי" + "\n" +
            "2ms    " + "קָטַלְתָּ             קַמְתָּ" + "\n" +
            "2fs    " + "קָטַלְתְּ             קַמְתְּ" + "\n" +
            "3ms     " + "קָטַל              קָם" + "\n" +
            "3fs    " + "קָטְדָה             קָמָה" + "\n" +
            "1p    " + "קָטַלְנוּ            קַמְנוּ" + "\n" +
            "2mp   " + "קְטַלְתֶּם            קַמְתֶּם" + "\n" +
            "2fp   " + "קְטַלְתֶּן            קַמְתֶּן" + "\n" +
            "3p     " + "קָטְלוּ             קָמוּ" + ""),

        */
        // TODO fix formatting on these, they come out all messed up
        new GrammarRule("Qal imperfect strong verb:\n" +
            "Preformative  Sufformative   Imperfect\n" +
            "אֶקְטֹל                     אֶ          " + " 1s\n" +
            " תִּקְטֹל                     תִּ          " + " 2ms\n" +
            " תִּקְטֹלִי        ִי            תִּ          " + " 2fs\n" +
            " יִקְטֹל                      יִ          " + " 3ms\n" +
            " תִּקְטֹל                     תִּ          " + " 3fs\n" +
            " נִקְטֹל                      נִ          " + " 1p\n" +
            "תִּקְטְלוּ        וּ            תִּ          " + " 2mp\n" +
            "תִּקְטֹלְנָה      נִה           תִּ          " + " 2fp\n" +
            "יִקְטְלוּ        וּ             יִ          " + " 3mp\n" +
            "תִּקְטֹלְנָה      נִה           תִּ          " + " 3fp"),

        new GrammarRule("All stative verbs (regardless of stem vowel) use patach as the stem vowel rather than holem in imperfect:\n" +
            "יִכְבַּד <– כָּבֵד    יִקְטַן  <– קָטֹן"),

        new GrammarRule("Qal imperfect weak verbs, II-Guttural:\n" +
            "II-Guttural      Strong\n" +
            " אֶקְטֹל           אֶבְחַר  " + "1s\n" +
            " תִּקְטֹל           תִּבְחַר  " + "2ms\n" +
            " תִּקְטְלִי           תִּבחֲרִי " + "2fs\n" +
            " יִקְטֹל           יִבְחַר   " + "3ms\n" +
            " תִּקְטֹל           תִּבְחַר  " + "3fs\n" +
            " נִקְטֹל            נִבְחַר  " + "1p\n" +
            " תִּקְטְלוּ           תִּבְחֲרוּ " + "2mp\n" +
            " תִּקְטֹלְנָה         תִּבְחֲרְנָה" + "2fp\n" +
            " יִקְטְלוּ           יִבְחֲרוּ  " + "3mp\n" +
            " תִּקְטֹלְנָה         תִּבְחֲרְנָה" + "3fp\n"),

        new GrammarRule("Qal imperfect weak verbs, III-Guttural:\n" +
            "III ע/ח         III-א       III-ה      Strong\n" +
            " אֶקְטֹל        אֶבְנֶה       אֶמְצָא         אֶשְׁלַח   " + "1s\n" +
            " תִּקְטֹל        תִּבְנֶה       תִּמְצָא         תִּשְׁלַח   " + "2ms\n" +
            " תִּקְטְלִי        תִּבְנִי       תִּמְצְאִי         תִּשְׁלְחִי  " + "2fs\n" +
            " יִקְטֹל         יִבְנֶה       יִמְצָא          יִשְׁלַח   " + "3ms\n" +
            " תִּקְטֹל        תִּבְנֶה       תִּמְצָא         תִּשְׁלַח   " + "3fs\n" +
            " נִקְטֹל        נִבְנֶה       נִמְצָה          נִשְׁלַח   " + "1p\n" +
            " תִּקְטְלוּ       תִּבְנוּ       תִּמְצְאוּ         תִּשְׁלְחוּ  " + "2mp\n" +
            " תִּקְטֹלְנָה      תִּבְנֶינָה     תִּמְצֶאנָה       תִּשְׁלַחְנָה " + "2fp\n" +
            " יִקְטְלוּ       יִבְנוּ        יִמְצְאוּ          יִשְׁלְחוּ  " + "3mp\n" +
            " תִּקְטֹלְנָה      תִּבְנֶינָה     תִּמְצֶאנָה       תִּשְׁלַחְנָה " + "3fp"),

        new GrammarRule("Qal imperfect weak verbs, I-Guttural:\n" +
            "I-Gutteral  I-Gutteral   I-א      I-א            \n" +
            "Type 1      Type 2       Type 1   Type 2   Strong\n" +
            " אֶקְטֹל    אֹמַר      אֶאֱסֹר    אֶעֱמֹד       אֶחֱזַק     " + "1s\n" +
            " תִּקְטֹל    תֹּאמַר     תֶּאֱסֹר    תַּעֲמֹד       תֶּחֱזַק     " + "2ms\n" +
            " תִּקְטְלִי    תֹּאמְרִי    תַּאַסְרִי   תַּעַמְדִי       תֶּחֶזְקִי    " + "2fs\n" +
            " יִקְטֹל     יֹאמַר     יֶאֱסֹר     יַעֲמֹד        יֶחֱזַק     " + "3ms\n" +
            " תִּקְטֹל    תֹּאמַר     תֶּאֱסֹר    תַּעֲמֹד       תֶּחֱזַק     " + "3fs\n" +
            " נִקְטֹל    נֹאמַר      נֶאֱסֹר    נַעֲמֹד        נֶחֱזַק     " + "1p\n" +
            " תִּקְטְלוּ   תֹּאמְרוּ     תַּאַסְרוּ   תַּעַמְדוּ       תֶּחֶזְקוּ    " + "2mp\n" +
            " תִּקְטֹלְנָה  תֹּאמַרנָה    תֶּאֱסֹרְנָה  תַּעֲמֹדְנָה     תֶּחֱזַקְנָה   " + "2fp\n" +
            " יִקְטְלוּ    יֹאמְרוּ     יַאַסְרוּ    יַעַמְדוּ       יֶחֶזְקוּ     " + "3mp\n" +
            " תִּקְטֹלְנָה  תֹּאמַרנָה    תֶּאֱסֹרְנָה  תַּעֲמֹדְנָה     תֶּחֱזַקְנָה   " + "3fp"),

        new GrammarRule("Qal imperfect weak verbs, Geminate:\n" +
            "Type 1      Type 2       Strong\n" +
            " אֶקְטֹל         אֵתַם       אָסֹב   " + "1s\n" +
            " תִּקְטֹל         תֵּתַם       תָּסֹב   " + "2ms\n" +
            " תִּקְטְלִי        תֵּתַמִּי       תָּסֹבִּי  " + "2fs\n" +
            " יִקְטֹל         יֵתַם        יָסֹב   " + "3ms\n" +
            " תִּקְטֹל         תֵּתַם       תָּסֹב   " + "3fs\n" +
            " נִקְטֹל         נֵתַם        נָסֹב   " + "1p\n" +
            " תִּקְטְלוּ        תֵּתַמּוּ       תָּסֹבּוּ  " + "2mp\n" +
            " תִּקְטֹלְנָה       תְּתַמֶּינָה     תְּסֻבֶּינָה" + "2fp\n" +
            " יִקְטְלוּ         יֵתַמּוּ        יָסֹבּוּ  " + "3mp\n" +
            " תִּקְטֹלְנָה       תְּתַמֶּינָה     תְּסֻבֶּינָה" + "3fp"),

        new GrammarRule("Qal imperfect weak verbs, Biconsonantal (aka II-י/ו, the middle consonant returns):\n" +
            " וֹ          ִי         וּ      "+"    Strong\n" +
            " אֶקְטֹל       אָבוֹא      אָשִׂים      אָקוּם   " + "1s\n" +
            " תִּקְטֹל       תָּבוֹא      תָּשִׂים      תָּקוּם   " + "2ms\n" +
            " תִּקְטְלִי       תָּבוֹאִי     תָּשִׂימִי      תָּקוּמִי  " + "2fs\n" +
            " יִקְטֹל        יָבוֹא      יָשִׂים       יָקוּם   " + "3ms\n" +
            " תִּקְטֹל       תָּבוֹא      תָּשִׂים      תָּקוּם   " + "3fs\n" +
            " נִקְטֹל        נָבוֹא      נָשִׂים       נָקוּם   " + "1p\n" +
            " תִּקְטְלוּ       תָּבוֹאוּ     תָּשִׂימוּ      תָּקוּמוּ  " + "2mp\n" +
            " תִּקְטֹלְנָה     תָּבוֹאנָה    תְּשִׂימֶינָה    תְּקוּמֶינָה" + "2fp\n" +
            " יִקְטְלוּ       יָבוֹאוּ      יָשִׂימוּ       יָקוּמוּ  " + "3mp\n" +
            " תִּקְטֹלְנָה     תָּבוֹאנָה    תְּשִׂימֶינָה    תְּקוּמֶינָה" + "3fp\n"),

        new GrammarRule("Qal imperfect weak verbs, I-נ/י plus הלך and לקח:\n" +
            " I-י Type-1    I-י Type 2   I-נ Type 1   I-נ Type 2    Strong\n" +
            "  לקח                                  הלך       " + "\n" +
            " אֶקְטֹל     אֶקַּח         אֶפֹּל         אִירַשׁ          אֵלֵך:      " + "1s\n" +
            " תִּקְטֹל      תִּקַּח        תִּפֹּל         תִּירַשׁ          תֵּלֵך:      " + "2ms\n" +
            " תִּקְטְלִי     תִּקְחִי        תִּפְּלִי        תִּירְשִׁי          תֵּלְכִי      " + "2fs\n" +
            " יִקְטֹל      יִקַּח         יִפֹּל          יִירַשׁ           יֵלֵך:      " + "3ms\n" +
            " תִּקְטֹל      תִּקַּח        תִּפֹּל         תִּירַשׁ          תֵּלֵך:      " + "3fs\n" +
            " נִקְטֹל      נִקַּח         נִפֹּל         נִירַשׁ           נֵלֵך:      " + "1p\n" +
            " תִּקְטְלוּ     תִּקְחוּ        תִּפְּלוּ        תִּירְשׁוּ          תֵּלְכוּ      " + "2mp\n" +
            " תִּקְטֹלְנָה   תִּקַּחְנָה       תִּפֹּלְנָה       תִּירַשְׁנָה         תֵּלַכְנָה    " + "2fp\n" +
            " יִקְטְלוּ      יִקְחוּ        יִפְּלוּ         יִירְשׁוּ           יֵלְכוּ      " + "3mp\n" +
            " תִּקְטֹלְנָה   תִּקַּחְנָה       תִּפֹּלְנָה       תִּירַשְׁנָה         תֵּלַכְנָה    " + "3fp\n"),

        new GrammarRule("Verb frequencies:  72K total verbs in OT\n" +
            " Qal:       50,699\n" +
            " Hiphil:     9,496\n" +
            " Piel:       6,473\n" +
            " Niphal:     4,138\n" +
            " Hithpael:     842\n" +
            " Pual:         423\n" +
            " Hophal:       396\n"),

        new GrammarRule("Uses of הִנֵּה\n:" +
            "* add emphasis or stress (demonstrative interjection):\n" +
            "x הִנֵּה עֵיר יְהוָה אֶל–יְרֵאָיו Behold, the eye of the LORD is upon those who fear him\n" +
            "* indicate the immediate presence of someone or something with an emphasis on\n" +
            "  immediacy or urgency:\n" +
            "x וַהִנֵּה אָנֹכִי עִמָּך And he said, behold, here I am\n" +
            "* may be used to introduce a fact or situation on which a subsequent statement is based\n" +
            "  Behold, I have listened to all that you have said to me and [therefore] I have\n" +
            "  caused a king to reign over you"),

        new GrammarRule("Waw consecutive is וַ with dagesh in following letter.\n" +
            "Imperfect can still take non-consecutive waw to mean simple and, וְ\n" +
            "Waw consecutive imperfect chain can start with וַיְהִי (and it was) meaning 'after'\n" +
            "Waw consecutive perfect chain can start with וְהִיִה 'and it will be'\n" +
            "Waw consecutive perfect used after imperative to continue imperative chain\n" +
            "and should be translated as imperative\n" +
            "Perfect prefixed with waw in chain of perfects NOT waw consecutive"),

        new GrammarRule("Qal imperative strong verb:\n" +
            "Sufformative   Imperfect\n" +
            "קְטֹל                  " + " 2ms\n" +
            "קִטְלִי       ִי          " + " 2fs\n" +
            "קִטְלוּ       וּ          " + " 2mp\n" +
            "קְטֹלְנָה     נִה         " + " 2fp\n"),

        new GrammarRule("Qal imperative weak, I & II Guttural:\n" +
            "I-Guttural      I-א   II-Guttural   Strong\n" +
            "קְטֹל      בְּחַר          אֱמֹר      חֲזַק      " + " 2ms\n" +
            "קִטְלִי      בַּחֲרִי         אִמְרִי      חִזְקִי     " + " 2fs\n" +
            "קִטְלוּ      בַּחֲרוּ         אִמְרוּ      חִזְקוּ     " + " 2mp\n" +
            "קְטֹלְנָה     בְּחַרְנָה        אֱמֹרְנָה    חֲזַקְנָה    " + " 2fp\n"),

        new GrammarRule("Qal imperative weak, III-Guttural:\n" +
            "III-ע/ח      III-א     III-ה       Strong\n" +
            "קְטֹל         בְּנֵה       מְצָא       שְׁלַח    " + " 2ms\n" +
            "קִטְלִי         בְּנֵי       מִצְאִי       שִׁלְחִי   " + " 2fs\n" +
            "קִטְלוּ         בְּנוּ       מִצְאוּ       שִׁלְחוּ   " + " 2mp\n" +
            "קְטֹלְנָה        בְּנֶינָה     מְצֶאנָה     שְׁלַחְנָה  " + " 2fp\n"),

        new GrammarRule("Qal imperative weak, Geminate and Biconsonantal:\n" +
            "Geminate   Biconsonantal       Strong\n" +
            "קְטֹל          קוּם             סֹב     " + " 2ms\n" +
            "קִטְלִי         קוּמִי             סֹבִּי    " + " 2fs\n" +
            "קִטְלוּ         קוּמוּ             סֹבּוּ    " + " 2mp\n" +
            "קְטֹלְנָה        קֹמְנָה            סֹבְנָה   " + " 2fp\n"),

        new GrammarRule("Qal imperative weak, I-י/נ:\n" +
            "I-נ Type 1   I-נ Type 2   I-י Type 1   I-י Type 2   Strong\n" +
            "קְטֹל      רַשׁ          שֵב         סַע          נְפֹל       " + " 2ms\n" +
            "קִטְלִי     רְשִׁי          שְׁבִי         סְעִי         נִפְלִי      " + " 2fs\n" +
            "קִטְלוּ     רְשׁוּ          שְׁבוּ         סְעוּ         נִפְלוּ      " + " 2mp\n" +
            "קְטֹלְנָה    רַשְׁנָה         שֵׁבְנָה       סַעְנָה        נְפֹלְנָה     " + " 2fp\n"),

        new GrammarRule("Imperative is not negated, instead use negative with imperfect\n" +
            "To express permanent prohibition: לֹא plus imperfect\n" +
            "To express temporary prohibition: אַל plus imperfect.\n" +
            "Cohortative and jussive negated with אַל, a milder form of prohibition than לֹא"),

        new GrammarRule("Imperative sometimes followed by נָא, which can be translated \"please\""),

        new GrammarRule("Imperative forms of III-ה, geminate, I-נ (sometimes), and I-י still loose the first consonant in imperative\n" +
            "Other weak forms keep the first consonant\n" +
            "Biconsonantal, aka II-י/ה, retain the second vowel letter."),

        new GrammarRule("Qal cohortative verb:\n" +
            "Cohortative             \n" +
            "Type 1        Type 2    \n" +
            "    אֶקְטְלָה       אֶקְטֹל  " + " singular\n" +
            "    נִקְטְלָה        נִקְטֹל  " + " plural\n"),

        new GrammarRule("Cohortative expresses a wish, request, or command, but only in first person.  Often \n" +
            "translated with 'let me' or 'may we'.\n" +
            "When verb with imperfect first person form begins a clause, it is generally cohortative."),

        new GrammarRule("Jussive expresses a wish, request, or command, but only in third person.  Often \n" +
            "translated with 'let him' or 'may she'.\n" +
            "When verb with imperfect third person form begins a clause, it is generally jussive.\n" +
            "In general jussive is same as 3 person imperfect.\n" +
            "In some weak verb forms, especially III-ה and hiphil final consonant is often dropped in jussive"),

        new GrammarRule("Pronominal suffixes on verbs can be used to express a pronoun as the direct object of\n" +
            "the verb.  This can also be done by attaching the pronoun to the direct object marker את\n" +
            "Type 1 pronominal suffixes are used."),

        new GrammarRule("Pronominal suffixes on 3ms perfect:\n" +
            "קְטָלַ  נִי" + "     he killed me\n" +
            "קְטָלְ  ךָ" + "      he killed you\n" +
            "קְטָלֵ  ך" + "      he killed you\n" +
            "קְטָל  וֹ" + "      he killed him\n" +
            "קְטָלָ  הּ" + "      he killed her\n" +
            "קְטָלָ  נוּ" + "      he killed us\n" +
            "קְטָלְ כֶם" + "      he killed you\n" +
            "קְטָלְ  כֶן" + "      he killed you\n" +
            "קְטָלָ  ם" + "      he killed them\n" +
            "קְטָלָ  ן" + "      he killed them"),

        new GrammarRule("Pronominal suffixes on 3ms imperfect:\n" +
            "יִקְטְלֵ  נִי" + "      he will kill me\n" +
            "יִקְטָלְ  ךָ" + "      he will kill you\n" +
            "יִקְטְלֵ  ך" + "      he will kill you\n" +
            "יִקְטְלֵ הוּ" + "      he will kill him\n" +
            "יִקְטְלֵ  נּוּ" + "      he will kill him\n" +
            "יִקְטְלָ  הּ" + "      he will kill her\n" +
            "יִקְטְלֶ נָּה" + "      he will kill her\n" +
            "יִקְטְלֵ  נוּ" + "      he will kill us\n" +
            "יִקְטְלֵ כֶם" + "      he will kill you\n" +
            "יִקְטְלֵ כֶן" + "      he will kill you\n" +
            "יִקְטְלֵ  ם" + "      he will kill them\n" +
            "יִקְטְלֵ  ן" + "      he will kill them\n"),

        new GrammarRule("Pronominal suffixes on imperfect weak III-ה verbs drop the ה\n:" +
            "יִרְאֶה" + "  +  " + "נָּה" + "  becomes " + "יִרְאֶנָּה" + "  he will see her"),

        new GrammarRule("Pronominal suffixes on imperative same as imperfect except 2ms for is קָטְל instead of קְטְל\n\n" +
            "2fs imperative with pronominal suffix very rare and 2fp not attested\n" +
            "קָטְלֵ הוּ" + "      kill him!\n"),

        new GrammarRule("Infinitives (both construct and absolute) are verbal nouns"),

        new GrammarRule("Infinitive construct functions much like the English infinitive"),

        new GrammarRule("Infinitive construct form:\n" +
            "Strong            " + "קְטֹל" + "\n" +
            "I-Gutteral        " + "עֲזֹר" + "\n" +
            "I-א               " + "אֱמֹר" + "\n" +
            "II-Gutteral       " + "בְּחֹר" + "\n" +
            "III-א             " + "קְרֹא" + "\n" +
            "III-ע             " + "שְׁמֹעַ" + "\n" +
            "III-ח             " + "שְׁלֹחַ" + "\n" +
            "III-ה             " + "בְּנוֹת" + "    From בנה\n" +
            "I-נ               " + "סַעַת" + "    From נסע  Many I-נ verbs follow strong paradigm, others drop initial נ and append ת\n" +
            "I-י               " + "שֶׁבֶת" + "    From ישׁב  A few I-י verbs follow strong paradigm, most drop initial י and append ת\n" +
            "Biconsonantal     " + "מוּת" + "    Keep their middle vowel\n"),

        new GrammarRule("Infinitive constructs can take pronominal suffixes.  These suffixes can serve as the\n" +
            "'subject' or object of the infinitive, e.g. קָטְלוֹ can mean 'his killing' or 'killing him'"),

        new GrammarRule("Infinitive is negated with לְבִלְתּי "),

        new GrammarRule("Infinitive construct with ל can indicate purpose, intention, or result:\n" +
            "וַיִּקַּה אֶת–הַמַּאֲכֶלֶת ––לִשְׁחט—— אֶת–בּנו  ֹ" +
            "And he took the _in order to slaughter_ his son"),

        new GrammarRule("Infinitive construct with ל and often היה can be inceptive, meaning it indicates something that is about to happen:\n" +
            "וַיְהִי הַשֶּׁמֶשׁ ––לָבוֹא––  " +
            "The sun was about _to set_"),

        new GrammarRule("Infinitive construct, with or without ל can act as a verbal noun:\n" +
            "טוֹב ––לְהֹדוֹת–– לַיהוָה " +
            "It is good _to praise_ the LORD"),

        new GrammarRule("Infinitive construct, with or without ל, can be complementary.\n" +
            "That is, it works to explain, clarify, or complement a preceding action or statement.\n" +
            "In such cases the best English translation is often a finite verb:\n" +
            "וְשָׁמַרְתָּ אֶת–מִצְוֹת יְהוָה אֱלֹהֶיךָ ––לָלֶכֶת–– בִּדְרָכָיו  " +
            "\nAnd you shall observe the commandments of the LORD your God _by walking_ in his ways."),

        new GrammarRule("Infinitive construct with ל can also be used to denote sequence of verbal actions\n" +
            "or obligation or necessity.  These are less common."),

        new GrammarRule("Infinitive construct with בְּ or כְּ and often a pronominal suffix indicate temporality (while, when).\n" +
            "Often these are paired with וַיְהִי (and he was) or וְהָיָה (and he will be)\n" +
            "(remember waw consecutive) to indicate perfect or imperfect.\n" +
            "וַיְהִ בִּהְיוֹתָם בַּשָּׂדֶה  " +
            "When they were in the field"),

        new GrammarRule("Infinitive absolute is a verbal noun but has no direct English equivalent.\n" +
            "Common uses of infinitive absolute:\n" +
            "* Emphatic:  will immediately precede (rarely follow) a im/perfect of the same\n" +
            "  root to emphasize the verb:" + "  אָמוֹר אָמַרְתִּי " + "I have surely said\n" +
            "* Imperatival:  can stand alone and function as imperative:\n" +
            "  זָכוֹר אֶת–הַיּוֹם הַזֶּה " + "  Remember this day!"),

        new GrammarRule("Common uses of infinitive absolute continued:\n " +
            "* Contemporaneous action: two infinitives absolutes and a im/perfect of the same\n" +
            "  root as one infinitive expresses contemporary action:\n" +
            "  וַיֵּלֶך הָלוֹך וְאָכֹל " + " and they walked, eating as they went\n" +
            "* Complementary: may complement the main verb and carry the temporal value\n" +
            "  of that verb (no example given because I don't understand the examples)"),

        new GrammarRule("Almost all weak verbs follow the strong verb paradigm in infinitive absolute.\n" +
            "Only III-ה and biconsonantal verbs differ:\n" +
            "Strong        " + "קָטוֹל" + "\n" +
            "III-ה         " + "עָשׂה" + " or " + "עָשׂוֹ" + "\n" +
            "Biconsonantal " + "שׂוֹם" + " middle vowel becomes וֹ regardless of what it is in the root, as here from " + "שִׂים"),

        new GrammarRule("Qal active participle strong verb:\n" +
            "             Singular         Plural\n" +
            "Masculine    " + "קֹטֵל" + "         " + "קֹטְלִים" + "\n" +
            "Feminine     " + "קֹטֶלֶת" + "/" + "קֹטְלָה" + "    " + "קֹטְלוֹת" + "\n" +
            "I-Guttural, I-נ, I-י, and geminate verbs follow the strong verb pattern\n" +
            "II-Gutteral schewa changes to hateph pathach in plural and alternate feminie forms: " + "בֹּחֲרִים" + "\n" +
            "III-א only alternate feminine singular varies:  " + "מֹצְאָה"),

        // TODO put in strong verb to see difference
        new GrammarRule("Qal active participle III-ע/ח verb:\n" +
            "             Singular         Plural\n" +
            "Masculine    " + "שֹׁמֵעַ" + "         " + "שֹׁמְעִים" + "\n" +
            "Feminine     " + "שֹׁמַעַת" + "/" + "שֹׁמְעָה" + "    " + "שֹׁמְעוֹת" + "\n"),

        new GrammarRule("Qal active participle III-ה verb:\n" +
            "             Singular         Plural\n" +
            "Masculine    " + "בֹּנֶה" + "         " + "בֹּנִים" + "\n" +
            "Feminine     " + "בֹּנָה" + "/" + "בֹּנִיָּה" + "    " + "בֹּנוֹת" + "\n"),

        new GrammarRule("Qal active participle Biconsonantal verb:\n" +
            "             Singular         Plural\n" +
            "Masculine    " + "קָם" + "         " + "קָמִים" + "\n" +
            "Feminine     " + "קָמָה"  + "    " + "קָמוֹת" + "\n"),

        new GrammarRule("Participle יֵשׁ:\n" +
            "* Is not inflected\n" +
            "* Can express existence: יֵשׁ מֶלֶך there is a king, or a king is\n" +
            "* Followed by preposition לְ indicates possession: יֶשׁ–לִי תִקְוָה I have hope"),

        new GrammarRule("Participle אֵין (sometimes spelled אַיִן)\n" +
            "* Is not inflected\n" +
            "* Can take pronominal suffixes\n" +
            "* can express non-existence: אֵין לוֹ בֵּן he had no son\n" +
            "* Can negate a verbless clause: אֵינָם יְרֵאִים אֶת–יְהוָה They do not fear the LORD"),

        new GrammarRule("Participles can be attributive, meaning they can directly modify a noun:\n" +
            "הָעָם הֵיֹּשֵׁב בָּאָרֶץ " +
            "the people dwelling [or who dwell] in the land"),

        new GrammarRule("Participles can be predicative, meaning they assert or predicate something about the noun:\n" +
            "וְהָהָר בֹּעֵר בָּאֵשׁ " +
            "And the mountain was burning with fire"),

        new GrammarRule("Participles can be substantive, meaning they act as a noun.  In this situation they can take a direct\n" +
            "object, be part of a construct chain, or take a pronominal suffix.\n" +
            "הַיּוֹשֶׁבֶת בַּגַּנִּים " +
            "the one who dwells in the gardens"),

        new GrammarRule("Qal passive participle strong verb:\n" +
            "             Singular         Plural\n" +
            "Masculine    " + "קָטוּל" + "         " + "קְטוּלִים" + "\n" +
            "Feminine     " + "קְטוּלָה" + "         " + "קְטוּלוֹת" + "\n" +
            "All but III-ה follow the strong pattern"),

        new GrammarRule("Qal passive participle III-ה verb:\n" +
            "             Singular         Plural\n" +
            "Masculine    " + "בָּנוּי" + "         " + "בְּנוּיִים" + "\n" +
            "Feminine     " + "בְּנוּיָה" + "         " + "בְּנוּיוֹת" + "\n"),

        new GrammarRule("Participles, because they behave like nouns, can take a definite article,\n" +
            "prepositional prefix (ל, ב, כ), or pronominal suffix.  They may also occur construct chain in the construct state."),

        new GrammarRule("Standard Hebrew word order is verb-subject-object\n" +
            "In the object section, direct and indirect object can come in any order\n" +
            "Indirect object usually marked with לְ or -אֶל"),

        new GrammarRule("Verb tense and sentance order:\n" +
            "* When a perfect verb is describing a completely action it is usually proceeded\n" +
            "    by a time clause or other explanatory clause.\n" +
            "* A consecutive perfect is normally the first word in its clause.\n" +
            "* A regular imperfect is not normally the first word in the clause.\n" +
            "* A consecutive imperfect is always the first word in its clause\n" +
            "* A jussive or cohortative (aka volitional imperfect) is normally the first word in its clause."),

        new GrammarRule("Sequences with volational conjugations:\n" +
            "* Imperatives can occur in succession, possibly linked by ו.  This linkage can consequential or sequential:\n" +
            "  e.g.  עֲלֵח וּקְבֹר אֶת–אָבִיךָ Go up and bury your father.\n" +
            "* An imperative may be followed by a consecutive perfect.  The perfect may carry the full force of the imperative:\n" +
            "  e.g. לֵך וְאָמַרְתָּ אֶל–עַבְדִּי Go and say to my servant...\n" +
            "* An imperative may be followed by an imperfect or cohortative, creating a purpose or result clause:\n" +
            "  e.g. בֹּא הֵנָּה וְאֶשְׁלְחָה אֹתְךָ אֶל–הַמֶּלֶך Come here so that I may send you to the king."),

        new GrammarRule("Conditional clauses, if/then protasis/apodosis.  Protasis often begins with one of\n" +
            "אִם כִּי הֵן אֲשֶׁר" +
            "\n and the apodosis often begins with וְ\n" +
            "אִם–תֵּלְכִי עִמִּי וְהָלָכְתִּי" +
            "\n if you go with her, then I will go"),

        new GrammarRule("Causal clause, indicates cause of another clause.  Often begins with כִּי or אֲשֶׁר\n" +
            "קְדֹשִׁים תִּהְיוּ כִּי קָדוֹשׁ אֲנִי" +
            "\n You will [must] be holy because I am holy"),

        new GrammarRule("Purpose clause, indicates the purpose of the action of the subject of another clause.\n" +
            "Can begin with לְמַעַן so that, בּעֲבוּר so that,  אֲשֶׁר so that, לְבִלְתִּי so that not, or לְמַעַן לֹא so that not\n" +
            "וְשָׁמַרְתָּ לַעֲשׂוֹת אֲשֶׁר יִיטַב לְךָ " +
            "\nAnd you will be careful to do so that it will go well with you."),

        new GrammarRule("A result clause states something that is true because of another clause.\n" +
            "Often begins with Waw consecutive verb or כִּי\n" +
            "וַיֹּאמֶר יוֹאָב יָקֻמוּ וַיָּקֻמוּ" +
            "\nAnd Joab said, 'Let them arise!', so they arose"),

        new GrammarRule("A concessive clause states something that might be thought to prevent another clause, but does not.\n" +
            "Often marked by אִם, or גַּם or גַּם כִּי or וְ or כִּי or עַל, all of which can be transalted 'although', or 'even though'\n" +
            "גַּם כִּי–אֵלֵך צַלְמָוֶת לֹא–אִירָא רָע" +
            "\nEven though I walk through the valley of the shadow of death, I will not fear evil"),

        new GrammarRule("Conjunctive waw is usually prefixed to a verb and links clauses sequentially, temporally, logically, or consequentially.\n" +
            "Disjunctive waw is prefixed to a non-verb and is non-sequential; it introduces some kind of break in the narrative."),

        new GrammarRule("Disjunctive waw parenthetical, provides a parenthetical explanation or comment:" +
            "וְהֵם לֹא יָדְעוּ כִּי שֹׁמֵעַ יוֹסֵף כִּי הַמֵּלִיץ בֵּינֹתָם" +
            "\nNow they did not know that Joseph was understanding them, for there was an interpreter between them."),

        new GrammarRule("Disjunctive waw circumstantial, gives circumstantial information\n" +
            "וַיְהִי כְּהַיּוֹם הַזֶּה וַיָּבֹא הַבַּיְתָה לַעֲשׂוֹת מְלַאכְתּוֹ => וְאֵין אִישׁ מֵאַנְשֵׁי חַבַּית שָׁם בַּבָּיִת" +
            "\nAnd one day, he went into the house to do his work, => and none of the household servants were there in the house"),

        new GrammarRule("Disjunctive waw contrastive, gives a contrasting idea\n" +
            "וַיִּשַׁע יְהוָה אֶל–הֶבֶל וְאֶל–מִנְחָתוֹ => וְאֶל–קַיִן וְאֶל–מִנְחָתוֹ לֹא שָׁעָה" +
            "\nThe LORD looked favorably on Abel and his offering, => but on Cain and his offering he did not look favorably"),

        new GrammarRule("Disjunctive waw introductory, begins a new narrative or introduces a new idea or theme\n" +
            "וְהַנָּחָשׁ הָיָה עָרוּם מִכֹּל חַיַּת הַשָּׂדֶה אֲשֶׁר עָשָׂה יְהוָה אֱלֹהִים" +
            "\nNow the serpent was more crafty than any creature that the LORD God had made"),

        new GrammarRule("Adverbs of time: עַתָּה (now), (then), טֶרֶם (also as בְּטֶרֶם) (before).\n" +
            "Both עַתָּה and אָז can be followed by an imperfect that should be translated as a perfect.\n" +
            "Adverbs of place: פֹּה, חֵנָּח (here), שָׁם (there), הוּץ (outside).\n" +
            "Adverbs of degree: מְאֹד (very), עוֹד (again), תָּמִיד (continually).\n" +
            "Adverbs of manner: יַחְדָּו (together), פִּתְאֹם (suddenly)."),

        new GrammarRule("Nipal can be passive, reflexive, reciprocal (they heard each other),\n" +
            "or middle where no agency is specified and the subject and object are the same (the gate opened)"),

        new GrammarRule("Niphal strong verb perfect:\n" +
            "1s    " + "נִקְטַלְתִּי" + "\n" +
            "2ms   " + "נִקְטַלְתָּ" + "\n" +
            "2fs   " + "נִקְטַלתְּ" + "\n" +
            "3ms   " + "נִקְטַל" + "\n" +
            "3fs   " + "נִקְטְלָה" + "\n" +
            "1p    " + "נִקְטַלְנוּ" + "\n" +
            "2mp   " + "נִקְטַלְתֶּם" + "\n" +
            "2fp   " + "נִקְטַלְתֶּן" + "\n" +
            "3p    " + "נִקְטְלוּ" + "\n"),

        new GrammarRule("Niphal strong verb imperfect:\n" +
            "1s    " + "אֶקָּטֵל" + "\n" +
            "2ms   " + "תִּקָּטֵל" + "\n" +
            "2fs   " + "תִּקָּטְלִי" + "\n" +
            "3ms   " + "יִקָּטֵל" + "\n" +
            "3fs   " + "תִּקָּטֵל" + "\n" +
            "1p    " + "נִקָּטֵל" + "\n" +
            "2mp   " + "תִּקָּטְלוּ" + "\n" +
            "2fp   " + "תִּקָּטַלְנָה" + "\n" +
            "3mp   " + "יִקָּטְלוּ" + "\n" +
            "3fp   " + "תִּקָּטַלְנָה" + "\n"),

        new GrammarRule("Niphal strong verb imperative:\n" +
            "ms   " + "הִקָּטֵל" + "\n" +
            "fs   " + "הִקָּטְלִי" + "\n" +
            "mp   " + "הִקָּטְלְוּ" + "\n" +
            "fp   " + "הִקָּטַלְנָה" + "\n"),

        new GrammarRule("Niphal strong verb infinitive:\n" +
            "infinitive construct  " + "הִקָּטֵל" + "\n" +
            "infinitive absolute   " + "נִקְטוֹל" + "\n" +
            "infinitive absolute   " + "הִקָּטוֹל" + "\n"),

        new GrammarRule("Niphal strong verb participle:\n" +
            "ms   " + "נִקְטָל" + "\n" +
            "fs   " + "נִקְטֶלֶת" + "\n" +
            "mp   " + "נִקְטָלִים" + "\n" +
            "fp   " + "נִקְטָלוֹת" + "\n"),

        new GrammarRule("III-א niphal differ from strong verbs only in perfect:\n" +
            "1s    " + "נִמְצֵאתִי" + "\n" +
            "2ms   " + "נִמְצֵאתָ" + "\n" +
            "2fs   " + "נִמְצֵאת" + "\n" +
            "3ms   " + "נִמְצָא" + "\n" +
            "3fs   " + "נִמְצְאָה" + "\n" +
            "1p    " + "נִמְצֵאנוּ" + "\n" +
            "2mp   " + "נִמְצֵאתֶם" + "\n" +
            "2fp   " + "נִמְצֵאתֶן" + "\n" +
            "3p    " + "נִמְצְאוּ" + "\n"),

        new GrammarRule("III-ה niphal differ from strong verbs only in perfect and participle:\n" +
            "perfect 1s    " + "נִבְנֵיתִי" + "\n" +
            "perfect 2ms   " + "נִבְנֵיתָ" + "\n" +
            "perfect 2fs   " + "נִבְנֵית" + "\n" +
            "perfect 3ms   " + "נִבְנָה" + "\n" +
            "perfect 3fs   " + "נִבְנְתָה" + "\n" +
            "perfect 1p    " + "נִבְנֵינוּ" + "\n" +
            "perfect 2mp   " + "נִבְנֵיתֶם" + "\n" +
            "perfect 2fp   " + "נִבְנֵיתֶן" + "\n" +
            "perfect 3p    " + "נִבְנוּ" + "\n" +
            "participle ms    " + "נִבְנֶה" + "\n" +
            "participle fs    " + "נִבְנָה" + "\n" +
            "participle mp    " + "נִבְנִים" + "\n" +
            "participle fp    " + "נִבְנוֹת" + "\n"),

        // TODO Continue 25.6 p 302

        // Jumping ahead, I'll backfill all the weak forms over time
        new GrammarRule("Meaning of the Piel steam:\n" +
            "  * intensive - can intensify the meaning of the qal stem\n" +
            "  * factitive - turns an intransitive verb transitive\n" +
            "    e.g. " + "קָדַשׁ" + " he is holy, " + "קִדַּשׁ" + " he sanctified\n" +
            "  * denominitive - taking a noun or adjective stem and making it a verb\n" +
            "    e.g. " + "דָּבָר" + " word " + "דִּבֵּר" + " he spoke\n" +
            "    In this case the verb does not have an intensive meaning\n" +
            "  * iterative - often occurs with physical movement")

        // TODO continue 26.3

    );
  }
}
