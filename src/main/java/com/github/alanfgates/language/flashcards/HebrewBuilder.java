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

import static com.github.alanfgates.language.flashcards.Declension.NOMINATIVE;
import static com.github.alanfgates.language.flashcards.Gender.*;
import static com.github.alanfgates.language.flashcards.Mood.*;
import static com.github.alanfgates.language.flashcards.Number.*;
import static com.github.alanfgates.language.flashcards.PartOfSpeech.*;
import static com.github.alanfgates.language.flashcards.Person.*;
import static com.github.alanfgates.language.flashcards.Tense.*;
import static com.github.alanfgates.language.flashcards.VerbRoot.*;
import static com.github.alanfgates.language.flashcards.Voice.*;
import static com.github.alanfgates.language.flashcards.Word.Competence.*;

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
        new Word(new WordForm("קָטַלְתִּי", "I killed", PERFECT, FIRST_PERSON, SINGULAR), OK, "Qal perfect")
            .addForm(new WordForm("קָטַלְתָּ", "you killed", QAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("קָטַלְתְּ", "you killed", QAL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("קָטַל", "he killed", QAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("קָטְלָה", "she killed", QAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("קָטַלְנוּ", "we killed", QAL, PERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("קְטַלְתֶּם", "you killed", QAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("קְטַלְתֶּן", "you killed", QAL, PERFECT, SECOND_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("קָטְלוּ", "they killed", QAL, PERFECT, THIRD_PERSON, PLURAL)),

        // To be
        new Word(new WordForm("הָיִיתִי", "I was", QAL, PERFECT, FIRST_PERSON, SINGULAR), WEAK, "'to be' perfect")
            .addForm(new WordForm("הָיִיתָ", "you were", QAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("הָיָה", "he was", QAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("הָיְתָה", "she was", QAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("הָיִינוּ", "we were", QAL, PERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("הֱיִיתֶם", "you were", QAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("הָיוּ", "they were", QAL, PERFECT, THIRD_PERSON, PLURAL)),

        // To give
        new Word(new WordForm("נָתַתִּי", "I gave", QAL, PERFECT, FIRST_PERSON, SINGULAR), WEAK, "'to give' perfect")
            .addForm(new WordForm("נָתַתָּ", "you gave", QAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("נָתַן", "he gave", QAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("נָתְנָה", "she gave", QAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("נָתַנּוּ", "we gave", QAL, PERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("נְתַתֶּם", "you gave", QAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("נָתְנוּ", "they gave", QAL, PERFECT, THIRD_PERSON, PLURAL)),

        // Qal Imperfect
        new Word(new WordForm("אֶקְטֹל", "I will kill", QAL, IMPERFECT, FIRST_PERSON, SINGULAR), OK, "Qal imperfect")
            .addForm(new WordForm("תִּקְטֹל", "you will kill", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תִּקְטְלִי", "you will kill", QAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("יִקְטֹל", "he will kill", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תִּקְטֹל", "she will kill", QAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("נִקְטֹל", "we will kill", QAL, IMPERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("תִּקְטְלוּ", "you will kill", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("תִּקְטֹלְנָה", "you/they will kill", QAL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("יִקְטְלוּ", "they will kill", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL)),

        // to be - imperfect
        new Word(new WordForm("אֶהְיֶה", "I will be", QAL, IMPERFECT, FIRST_PERSON, SINGULAR), WEAK, "'to be', imperfect")
            .addForm(new WordForm("תִּהְיֶה", "you will be", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("יִהְיֶה", "he will be", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תִּהְיֶה", "she will be", QAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("נִהְיֶה", "we will be", QAL, IMPERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("תִּהְיוּ", "you will be", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("יִהְיוּ", "they will be", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL)),

        // to give - imperfect
        new Word(new WordForm("אֶתֵּן", "I will give", QAL, IMPERFECT, FIRST_PERSON, SINGULAR), WEAK, "'to give' imperfect")
            .addForm(new WordForm("תִּתֵּן", "you will give", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("יִתֵּן", "he will give", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תִּתֵּן", "she will give", QAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("נִתֵּן", "we will give", QAL, IMPERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("תִּתְּנוּ", "you will give", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("יִתְּנוּ", "they will give", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL)),

        // Qal Imperative
        new Word(new WordForm("קְטֹל", "kill!", QAL, IMPERATIVE, MASCULINE, SINGULAR), OK, "Qal imperative")
            .addForm(new WordForm("קִטְלִי", "kill!", QAL, IMPERATIVE, FEMININE, SINGULAR))
            .addForm(new WordForm("קִטְלוּ", "kill!", QAL, IMPERATIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("קְטֹלְנָה", "kill!", QAL, IMPERATIVE, FEMININE, PLURAL)),

        // Qal various odd important ones
        new Word(new WordForm("תֵּן", "give!", QAL, IMPERATIVE, MASCULINE, SINGULAR), ZERO),
        new Word(new WordForm("קַח", "take!", QAL, IMPERATIVE, MASCULINE, SINGULAR), ZERO),
        new Word(new WordForm("לֵך", "go/walk!", QAL, IMPERATIVE, MASCULINE, SINGULAR), ZERO),
        new Word(new WordForm("הֱיֵה", "be!", IMPERATIVE, MASCULINE, SINGULAR), ZERO),
        new Word(new WordForm("עֲלֵה", "go up!", IMPERATIVE, MASCULINE, SINGULAR), ZERO),

        // Qal Cohortative
        new Word(new WordForm("אֶקְטֹל", "let me kill", QAL, COHORTATIVE, SINGULAR), WEAK, "Qal cohortative")
            .addForm(new WordForm("אֶקְטְלָה", "let me kill", QAL, COHORTATIVE, SINGULAR))
            .addForm(new WordForm("נִקְטֹל", "let us kill", QAL, COHORTATIVE, PLURAL))
            .addForm(new WordForm("נִקְטְלָה", "let us kill", QAL, COHORTATIVE, PLURAL)),

        // Qal Jussive
        new Word(new WordForm("יִקְטֹל", "let him kill", QAL, JUSSIVE, MASCULINE, SINGULAR), WEAK, "Qal Jussive")
            .addForm(new WordForm("תִּקְטֹל", "let her kill", QAL, JUSSIVE, FEMININE, SINGULAR))
            .addForm(new WordForm("יִקְטְלוּ", "let them kill", QAL, JUSSIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("תִּקְטֹלְנָה", "let them kill", QAL, JUSSIVE, FEMININE, PLURAL)),

        // Qal Infinitive Construct
        new Word(new WordForm("קְטֹל", "to kill", QAL, INFINITIVE_CONSTRUCT), ZERO),
        new Word(new WordForm("נְתֹן", "to give", QAL, INFINITIVE_CONSTRUCT), ZERO),
        new Word(new WordForm("תֵּת", "to give נתן", QAL, INFINITIVE_CONSTRUCT), ZERO),
        new Word(new WordForm("לֶכֶת", "to walk הלך", QAL, INFINITIVE_CONSTRUCT), ZERO),

        // Qal Infinitive Absolute
        new Word(new WordForm("קָטוֹל", "to kill", QAL, INFINITIVE_ABSOLUTE), ZERO),

        // Qal Active Participle
        new Word(new WordForm("קֹטֵל", "killing", QAL, PARTICIPLE, ACTIVE, MASCULINE, SINGULAR), WEAK, "Qal active participle")
            .addForm(new WordForm("קֹטְלִים", "killing", QAL, PARTICIPLE, ACTIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("קֹטֶלֶת", "killing", QAL, PARTICIPLE, ACTIVE, FEMININE, SINGULAR))
            .addForm(new WordForm("קֹטְלָה", "killing", QAL, PARTICIPLE, ACTIVE, FEMININE, SINGULAR))
            .addForm(new WordForm("קֹטְלוֹת", "killing", QAL, PARTICIPLE, ACTIVE, FEMININE, PLURAL)),

        // Qal Passive Participle
        new Word(new WordForm("קָטוּל", "being killed", QAL, PARTICIPLE, PASSIVE, MASCULINE, SINGULAR), WEAK, "Qal passive participle")
            .addForm(new WordForm("קְטוּלָה", "being killed", QAL, PARTICIPLE, PASSIVE, FEMININE, SINGULAR))
            .addForm(new WordForm("קְטוּלִים", "being killed", QAL, PARTICIPLE, PASSIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("קְטוּלוֹת", "being killed", QAL, PARTICIPLE, PASSIVE, FEMININE, PLURAL)),

        // Niphal Perfect
        new Word(new WordForm("נִקְטַלְתִּי", "I was killed", NIPHAL, PERFECT, FIRST_PERSON, SINGULAR), OK, "Niphal perfect")
            .addForm(new WordForm("נִקְטַלְתָּ", "you were killed", NIPHAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("נִקְטַלְתְּ", "you were killed", NIPHAL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("נִקְטַל", "he was killed", NIPHAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("נִקְטְלָה", "she was killed", NIPHAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("נִקְטַלְנוּ", "we were killed", NIPHAL, PERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("נִקְטַלְתֶּם", "you were killed", NIPHAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("נִקְטַלְתֶּן", "you were killed", NIPHAL, PERFECT, SECOND_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("נִקְטְלוּ", "they were killed", NIPHAL, PERFECT, THIRD_PERSON, PLURAL)),

        // Niphal Imperfect
        new Word(new WordForm("אֶקָּטֵל", "I will be killed", NIPHAL, IMPERFECT, FIRST_PERSON, SINGULAR), OK, "Niphal imperfect")
            .addForm(new WordForm("תִּקָּטֵל", "you will be killed", NIPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תִּקָּטְלִי", "you will be killed", NIPHAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("יִקָּטֵל", "he will be killed", NIPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תִּקָּטֵל", "she will be killed", NIPHAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("נִקָּטֵל", "we will be killed", NIPHAL, IMPERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("תִּקָּטְלוּ", "you will be killed", NIPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("תִּקָּטַלְנָה", "you/they will be killed", NIPHAL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("יִקָּטְלוּ", "they will be killed", NIPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL)),

        // Niphal Imperative
        new Word(new WordForm("הִקָּטֵל", "be killed!", NIPHAL, IMPERATIVE, MASCULINE, SINGULAR), WEAK, "Niphal imperative")
            .addForm(new WordForm("הִקָּטְלִי", "be killed!", NIPHAL, IMPERATIVE, FEMININE, SINGULAR))
            .addForm(new WordForm("הִקָּטְלְוּ", "be killed!", NIPHAL, IMPERATIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("הִקָּטַלְנָה", "be killed!", NIPHAL, IMPERATIVE, FEMININE, PLURAL)),

        // Niphal Infinitive
        new Word(new WordForm("הִקָּטֵל", "to be kill", NIPHAL, INFINITIVE_CONSTRUCT), WEAK),
        new Word(new WordForm("נִקְטוֹל", "to be kill", NIPHAL, INFINITIVE_ABSOLUTE), ZERO, "Niphal infinitive absolute")
            .addForm(new WordForm("הִקָּטוֹל", "to be kill", NIPHAL, INFINITIVE_ABSOLUTE)),

        // Niphal Participle
        new Word(new WordForm("נִקְטָל", "being killed", NIPHAL, PARTICIPLE, MASCULINE, SINGULAR), ZERO, "Niphal participle")
            .addForm(new WordForm("נִקְטֶלֶת", "being killed", NIPHAL, PARTICIPLE, FEMININE, SINGULAR))
            .addForm(new WordForm("נִקְטָלִים", "being killed", NIPHAL, PARTICIPLE, MASCULINE, PLURAL))
            .addForm(new WordForm("נִקְטָלוֹת", "being killed", NIPHAL, PARTICIPLE, FEMININE, PLURAL)),

        // Piel
        new Word(new WordForm("קִטַּלְתִּי", "I slaughtered", PIEL, PERFECT, FIRST_PERSON, SINGULAR), OK, "Piel perfect")
            .addForm(new WordForm("קִטַּלְתָּ", "you slaughtered", PIEL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("קִטַּלְתְּ", "you slaughtered", PIEL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("קִטֵּל", "he slaughtered", PIEL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("קִטְּלָה", "she slaughtered", PIEL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("קִטַּלְנוּ", "we slaughtered", PIEL, PERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("קִטַּלְתֶּם", "you slaughtered", PIEL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("קִטֵַּלְתֶּן", "you slaughtered", PIEL, PERFECT, SECOND_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("קִטְּלוּ", "they slaughtered", PIEL, PERFECT, THIRD_PERSON, PLURAL)),

        new Word(new WordForm("אֲקַטֵּל", "I will slaughter", PIEL, IMPERFECT, FIRST_PERSON, SINGULAR), OK, "Piel imperfect")
            .addForm(new WordForm("תְּקַטֵּל", "you will slaughter", PIEL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תְּקַטְּלִי", "you will slaughter", PIEL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("יְקַטֵּל", "he will slaughter", PIEL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תְּקַטֵּל", "she will slaughter", PIEL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("נְקַטֵּל", "we will slaughter", PIEL, IMPERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("תְּקַטְּלוּ", "you will slaughter", PIEL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("תְּקַטֵּלְנָה", "you/they will slaughter", PIEL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("יְקַטְּלוּ", "they will slaughter", PIEL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL)),

        new Word(new WordForm("קַטֵּל", "slaughter!", PIEL, IMPERATIVE, MASCULINE, SINGULAR), WEAK, "Piel imperative")
            .addForm(new WordForm("קַטְּלִי", "slaughter!", PIEL, IMPERATIVE, FEMININE, SINGULAR))
            .addForm(new WordForm("קַטְּלוּ", "slaughter!", PIEL, IMPERATIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("קַטֵּלְנָה", "slaughter!", PIEL, IMPERATIVE, FEMININE, PLURAL)),

        new Word(new WordForm("קַטֵּל", "to slaughter", PIEL, INFINITIVE_CONSTRUCT, INFINITIVE_ABSOLUTE), ZERO),

        new Word(new WordForm("מְקַטֵּל", "slaughtering", PIEL, PARTICIPLE, MASCULINE, SINGULAR), OK, "Piel participle")
            .addForm(new WordForm("מְקַטֶּלֶת", "slaughtering", PIEL, PARTICIPLE, FEMININE, SINGULAR))
            .addForm(new WordForm("מְקַטְּלִים", "slaughtering", PIEL, PARTICIPLE, MASCULINE, PLURAL))
            .addForm(new WordForm("מְקַטְּלוֹת", "slaughtering", PIEL, PARTICIPLE, FEMININE, PLURAL)),

        new Word(new WordForm("קֻטַּלְתִּי", "I was slaughtered", PUAL, PERFECT, FIRST_PERSON, SINGULAR), ZERO, "Pual perfect")
            .addForm(new WordForm("קֻטַּלְתָּ", "you were slaughtered", PUAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("קֻטַּלְתְּ", "you were slaughtered", PUAL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("קֻטַּל", "he was slaughtered", PUAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("קֻטְּלָה", "she was slaughtered", PUAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("קֻטַּלְנוּ", "we were slaughtered", PUAL, PERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("קֻטַּלְתֶּם", "you were slaughtered", PUAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("קֻטַּלְתֶּן", "you were slaughtered", PUAL, PERFECT, SECOND_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("קֻטְּלוּ", "they were slaughtered", PUAL, PERFECT, THIRD_PERSON, PLURAL)),

        new Word(new WordForm("אֲקֻטַּל", "I will be slaughtered", PUAL, IMPERFECT, FIRST_PERSON, SINGULAR), ZERO, "Pual imperfect")
            .addForm(new WordForm("תְּקֻטַּל", "you will be slaughtered", PUAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תְּקֻטְּלִי", "you will be slaughtered", PUAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("יְקֻטַּל", "he will be slaughtered", PUAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תְּקֻטַּל", "she will be slaughtered", PUAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("נְקֻטַּל", "we will be slaughtered", PUAL, IMPERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("תְּקֻטְּלוּ", "you will be slaughtered", PUAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("תְּקֻטַּלְנָה", "you/they will be slaughtered", PUAL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("יְקֻטְּלוּ", "they will be slaughtered", PUAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL)),

        new Word(new WordForm("מְקֻטָּל", "being slaughtered", PUAL, PARTICIPLE, MASCULINE, SINGULAR), ZERO, "Pual participle")
            .addForm(new WordForm("מְקֻטֶּלֶת", "being slaughtered", PUAL, PARTICIPLE, FEMININE, SINGULAR))
            .addForm(new WordForm("מְקֻטָּלִים", "being slaughtered", PUAL, PARTICIPLE, MASCULINE, PLURAL))
            .addForm(new WordForm("מְקֻטָּלוֹת", "being slaughtered", PUAL, PARTICIPLE, FEMININE, PLURAL)),

        // Hiphil
        new Word(new WordForm("הִקְטַלְתִּי", "I caused to kill", HIPHIL, PERFECT, FIRST_PERSON, SINGULAR), WEAK, "Hiphil perfect")
            .addForm(new WordForm("הִקְטַלְתָּ", "you caused to kill", HIPHIL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("הִקְטַלְתְּ", "you caused to kill", HIPHIL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("הִקְטִיל", "he caused to kill", HIPHIL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("הִקְטִילָה", "she caused to kill", HIPHIL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("הִקְטַלְְנוּ", "we caused to kill", HIPHIL, PERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("הִקְטַלְתֶּם", "you caused to kill", HIPHIL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("הִקְטַלְתֶּן", "you caused to kill", HIPHIL, PERFECT, SECOND_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("הִקְטִילוּ", "they caused to kill", HIPHIL, PERFECT, THIRD_PERSON, PLURAL)),

        new Word(new WordForm("אַקְטִיל", "I will cause to kill", HIPHIL, IMPERFECT, FIRST_PERSON, SINGULAR), WEAK, "Hiphil imperfect")
            .addForm(new WordForm("תַּקְטִיל", "you will cause to kill", HIPHIL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תַּקְטִילִי", "you will cause to kill", HIPHIL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("יַקְטִיל", "he will cause to kill", HIPHIL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תַּקְטִיל", "she will cause to kill", HIPHIL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("נַקְטִיל", "we will cause to kill", HIPHIL, IMPERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("תַּקְטִילוּ", "you will cause to kill", HIPHIL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("תַּקְטֵלְנָה", "you/they will cause to kill", HIPHIL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("יַקְטִילוּ", "they will cause to kill", HIPHIL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL)),

        new Word(new WordForm("הַקְטֵל", "cause to kill", HIPHIL, IMPERATIVE, MASCULINE, SINGULAR), ZERO, "Hiphil imperative")
            .addForm(new WordForm("הַקְטִילִי", "cause to kill", HIPHIL, IMPERATIVE, FEMININE, SINGULAR))
            .addForm(new WordForm("הַקְטִילוּ", "cause to kill", HIPHIL, IMPERATIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("הַקְטֵלְנָה", "cause to kill", HIPHIL, IMPERATIVE, FEMININE, PLURAL)),

        new Word(new WordForm("הַקְטִיל", "to cause to kill", HIPHIL, INFINITIVE_CONSTRUCT), ZERO),
        new Word(new WordForm("הַקְטֵל", "to cause to kill", HIPHIL, INFINITIVE_ABSOLUTE), ZERO),

        new Word(new WordForm("מַקְטִיל", "causing to kill", HIPHIL, PARTICIPLE, MASCULINE, SINGULAR), ZERO, "Hiphil participle")
            .addForm(new WordForm("מַקְטֶלֶת", "causing to kill", HIPHIL, PARTICIPLE, FEMININE, SINGULAR))
            .addForm(new WordForm("מַקְטִילִים", "causing to kill", HIPHIL, PARTICIPLE, MASCULINE, PLURAL))
            .addForm(new WordForm("מַקְטִילוֹת", "causing to kill", HIPHIL, PARTICIPLE, FEMININE, PLURAL)),

        // Hophal
        new Word(new WordForm("הֻקְטַלְתִּי", "I was made to kill", HOPHAL, PERFECT, FIRST_PERSON, SINGULAR), ZERO)
            .addForm(new WordForm("הֻקְטַלְתָּ", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("הֻקְטַלְתְּ", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("הֻקְטַל", "he was made to kill", HOPHAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("הֻקְטְלָה", "she was made to kill", HOPHAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("הֻקְטַלְנוּ", "we were made to kill", HOPHAL, PERFECT, FIRST_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("הֻקְטַלְתֶּם", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("הֻקְטַלְתֶּן", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("הֻקְטְלוּ", "they were made to kill", HOPHAL, PERFECT, THIRD_PERSON, MASCULINE, PLURAL)),

        new Word(new WordForm("הָקְטַלְתִּי", "I was made to kill", HOPHAL, PERFECT, FIRST_PERSON, SINGULAR), ZERO)
            .addForm(new WordForm("הָקְטַלְתָּ", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("הָקְטַלְתְּ", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("הָקְטַל", "he was made to kill", HOPHAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("הָקְטְלָה", "she was made to kill", HOPHAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("הָקְטַלְנוּ", "we were made to kill", HOPHAL, PERFECT, FIRST_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("הָקְטַלְתֶּם", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("הָקְטַלְתֶּן", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("הָקְטְלוּ", "they were made to kill", HOPHAL, PERFECT, THIRD_PERSON, MASCULINE, PLURAL)),

        new Word(new WordForm("אֻקְטַל", "I will be made to kill", HOPHAL, IMPERFECT, FIRST_PERSON, SINGULAR), ZERO)
            .addForm(new WordForm("תֻּקְטַל", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תֻּקְטְלִי", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("יֻקְטַל", "he will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תֻּקְטַל", "she will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("נֻקְטַל", "we will be made to kill", HOPHAL, IMPERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("תֻּקְטְלוּ", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("תֻּקְטַלְנָה", "you/they will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("יֻקְטַלוּ", "they will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL)),

        new Word(new WordForm("אָקְטַל", "I will be made to kill", HOPHAL, IMPERFECT, FIRST_PERSON, SINGULAR), ZERO)
            .addForm(new WordForm("תָּקְטַל", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תָּקְטְלִי", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("יָקְטַל", "he will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תָּקְטַל", "she will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("נָקְטַל", "we will be made to kill", HOPHAL, IMPERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("תָּקְטְלוּ", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("תָּקְטַלְנָה", "you/they will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("יָקְטַלוּ", "they will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL)),

        new Word(new WordForm("מֻקְטָל", "being made to kill", HOPHAL, PARTICIPLE, MASCULINE, SINGULAR), ZERO)
            .addForm(new WordForm("מֻקְטֶלֶת", "being made to kill", HOPHAL, PARTICIPLE, FEMININE, SINGULAR))
            .addForm(new WordForm("מֻקְטָלִים", "being made to kill", HOPHAL, PARTICIPLE, MASCULINE, PLURAL))
            .addForm(new WordForm("מֻקְטָלוֹת", "being made to kill", HOPHAL, PARTICIPLE, FEMININE, PLURAL)),

        new Word(new WordForm("מָקְטָל", "being made to kill", HOPHAL, PARTICIPLE, MASCULINE, SINGULAR), ZERO)
            .addForm(new WordForm("מָקְטֶלֶת", "being made to kill", HOPHAL, PARTICIPLE, MASCULINE, PLURAL))
            .addForm(new WordForm("מָקְטָלִים", "being made to kill", HOPHAL, PARTICIPLE, FEMININE, SINGULAR))
            .addForm(new WordForm("מָקְטָלוֹת", "being made to kill", HOPHAL, PARTICIPLE, FEMININE, PLURAL)),

        // Hithpael
        new Word(new WordForm("הִתְקַטַּלְתִּי", "I killed myself", HITHPAEL, PERFECT, FIRST_PERSON, SINGULAR), ZERO)
            .addForm(new WordForm("הִתְקַטַּלְתָּ", "you killed yourself", HITHPAEL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("הִתְקַטַּלְתְּ", "you killed yourself", HITHPAEL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("הִתְקַטֵּל", "he killed himself", HITHPAEL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("הִתְקַטְּלָה", "she killed herself", HITHPAEL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("הִתְקַטַּלְנוּ", "we killed ourselves", HITHPAEL, PERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("הִתְקַטַּלְתֶּם", "you killed yourselves", HITHPAEL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("הִתְקַטַּלְתֶּן", "you killed yourselves", HITHPAEL, PERFECT, SECOND_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("הִתְקַטְּלוּ", "they killed themselves", HITHPAEL, PERFECT, THIRD_PERSON, PLURAL)),

        new Word(new WordForm("אֶתְקַטֵּל", "I will kill myself", HITHPAEL, IMPERFECT, FIRST_PERSON, SINGULAR), ZERO)
            .addForm(new WordForm("תִּתְקַטֵּל", "you will kill yourself", HITHPAEL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תִּתְקַטְּלִי", "you will kill yourself", HITHPAEL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("יִתְקַטֵּל", "he will kill himself", HITHPAEL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("תִּתְקַטֵּל", "she will kill herself", HITHPAEL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("נִתְקַטֵּל", "we will kill ourselves", HITHPAEL, IMPERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("תִּתְקַטְּלוּ", "you will kill yourselves", HITHPAEL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("תִּתְקַטֵּלְנָה", "you/they will kill yourselves/themselves", HITHPAEL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("יִתְקַטֵּלוּ", "they will kill themselves", HITHPAEL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL)),

        new Word(new WordForm("הִתְקַטֵּל", "kill yourself", HITHPAEL, IMPERATIVE, MASCULINE, SINGULAR), ZERO)
            .addForm(new WordForm("הִתְקַטְּלִי", "kill yourself", HITHPAEL, IMPERATIVE, FEMININE, SINGULAR))
            .addForm(new WordForm("הִתְקַטְּלוּ", "kill yourselves", HITHPAEL, IMPERATIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("הִתְקַטֵּלְנָה", "kill yourselves", HITHPAEL, IMPERATIVE, FEMININE, PLURAL)),

        new Word(new WordForm("הִתְקַטֵּל", "to kill oneself", HITHPAEL, INFINITIVE_CONSTRUCT, INFINITIVE_ABSOLUTE), ZERO),

        new Word(new WordForm("מִתְקַטֵּל", "killing oneself", HITHPAEL, PARTICIPLE, MASCULINE, SINGULAR), ZERO)
            .addForm(new WordForm("מִתְקַטֶּלֶת", "killing oneself", HITHPAEL, PARTICIPLE, FEMININE, SINGULAR))
            .addForm(new WordForm("מִתְקַטְּלִים", "killing oneself", HITHPAEL, PARTICIPLE, MASCULINE, PLURAL))
            .addForm(new WordForm("מִתְקַטֵּלוֹת", "killing oneself", HITHPAEL, PARTICIPLE, FEMININE, PLURAL)),
        //----------------------------------------------------------------------------------------
        // PRONOMINAL SUFFIXES
        new Word(new WordForm("סוּסִי", "my horse"), WEAK, "Singular pronominal suffixes")
            .addForm(new WordForm("סוּסְךָ", "your horse", MASCULINE, SINGULAR))
            .addForm(new WordForm("סוּסֵך", "your horse", FEMININE, SINGULAR))
            .addForm(new WordForm("סוּסוֹ", "his horse"))
            .addForm(new WordForm("סוּסָהּ", "her horse"))
            .addForm(new WordForm("סוּסֵנוּ", "our horse"))
            .addForm(new WordForm("סוּסְכֶם", "your horse", MASCULINE, PLURAL))
            .addForm(new WordForm("סוּסְכֶן", "your horse", FEMININE, PLURAL))
            .addForm(new WordForm("סוּסָם", "their horse", MASCULINE))
            .addForm(new WordForm("סוּסָן", "their horse", FEMININE)),

        new Word(new WordForm("סוּסַי", "my horses"), WEAK, "Plural pronominal suffixes")
            .addForm(new WordForm("סוּסֶיךָ", "your horses", MASCULINE, SINGULAR))
            .addForm(new WordForm("סוּסַיִך", "your horses", FEMININE, SINGULAR))
            .addForm(new WordForm("סוּסָיו", "his horses"))
            .addForm(new WordForm("סוּסֶיהָ", "her horses"))
            .addForm(new WordForm("סוּסֵינוּ", "our horses"))
            .addForm(new WordForm("סוּסֵיכֶם", "your horses", MASCULINE, PLURAL))
            .addForm(new WordForm("סוּסֵיכֶן", "your horses", FEMININE, PLURAL))
            .addForm(new WordForm("סוּסֵיהֶם", "their horses", MASCULINE))
            .addForm(new WordForm("סוּסֵיהֶן", "their horses", FEMININE)),

        // Qal perfect with pronominal suffixes
        new Word(new WordForm("קְטָלַנִי", "he killed me", PRONOMINAL_SUFFIX, FIRST_PERSON, SINGULAR), WEAK, "Verb with pronominal suffixes")
            .addForm(new WordForm("קְטָלְךָ", "he killed you", PRONOMINAL_SUFFIX, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("קְטָלֵך", "he killed you", PRONOMINAL_SUFFIX, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("קְטָלוֹ", "he killed him", PRONOMINAL_SUFFIX, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("קְטָלָהוֹ", "he killed him", PRONOMINAL_SUFFIX, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("קְטָלָהּ", "he killed her", PRONOMINAL_SUFFIX, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("קְטָלָנוּ", "he killed us", PRONOMINAL_SUFFIX, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("קְטָלְכֶם", "he killed you", PRONOMINAL_SUFFIX, SECOND_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("קְטָלְכֶן", "he killed you", PRONOMINAL_SUFFIX, SECOND_PERSON, FEMININE, PLURAL))
            .addForm(new WordForm("קְטָלָם", "he killed them", PRONOMINAL_SUFFIX, THIRD_PERSON, MASCULINE, PLURAL))
            .addForm(new WordForm("קְטָלָן", "he killed them", PRONOMINAL_SUFFIX, THIRD_PERSON, FEMININE, PLURAL)),

          new Word((new WordForm("קְטַלְתִּיו", "I killed him", QAL, PERFECT, FIRST_PERSON, SINGULAR)), WEAK)
            .addForm(new WordForm("קְטַלְתָּהוּ", "you killed him", QAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("קְטָלַתְהוּ", "she killed him", QAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("קְטַלְנוּהוּ", "we killed him", QAL, PERFECT, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("קְטַלְוּהוּ", "they killed him", QAL, PERFECT, THIRD_PERSON, PLURAL)),

          new Word((new WordForm("יִקְטְלֵנִי", "he will kill me", PRONOMINAL_SUFFIX, FIRST_PERSON, MASCULINE, SINGULAR)), WEAK)
            .addForm(new WordForm("יִקְטָלְךָ", "he will kill you", PRONOMINAL_SUFFIX, SECOND_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("יִקְטְלֵך", "he will kill you", PRONOMINAL_SUFFIX, SECOND_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("יִקְטְלֵהוּ", "he will kill him", PRONOMINAL_SUFFIX, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("יִקְטְלֵנּוּ", "he will kill him", PRONOMINAL_SUFFIX, THIRD_PERSON, MASCULINE, SINGULAR))
            .addForm(new WordForm("יִקְטְלָהּ", "he will kill her", PRONOMINAL_SUFFIX, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("יִקְטְלֶנָּה", "he will kill her", PRONOMINAL_SUFFIX, THIRD_PERSON, FEMININE, SINGULAR))
            .addForm(new WordForm("יִקְטְלוּנוּ", "they will kill us", PRONOMINAL_SUFFIX, FIRST_PERSON, PLURAL))
            .addForm(new WordForm("יִקְטְלֵכֶם", "they will kill you", PRONOMINAL_SUFFIX, SECOND_PERSON, PLURAL))
            .addForm(new WordForm("יִקְטְלֵכֶן", "they will kill you", PRONOMINAL_SUFFIX, SECOND_PERSON, FEMININE))
            .addForm(new WordForm("יִקְטְלֵם", "they will kill them", PRONOMINAL_SUFFIX, THIRD_PERSON, PLURAL))
            .addForm(new WordForm("יִקְטְלֵן", "they will kill them", PRONOMINAL_SUFFIX, THIRD_PERSON, FEMININE))
    );
  }

  @Override
  public List<Word> buildVocabWords() {
    return Arrays.asList(
        // VOCABULARY, with frequency noted in comments
        // 50524
        new Word(new WordForm("וְ", "and, but, also, even"), STRONG),
        // 23968
        new Word(new WordForm("הַ", "the"), OK),
        // 20435
        new Word(new WordForm("לְ", "to"), STRONG),
        // 15632
        new Word(new WordForm("בְּ", "in, at, with"), STRONG),
        // 10970
        new Word(new WordForm("אֶת–", "definite direct object marker OR with"), WEAK)
            .addForm(new WordForm("אֵת", "definite direct object marker OR with"))
            .addForm(new WordForm("אֹתַי", "direct object marker with pronominal suffix 'me', NOT with")) // 898
            .addForm(new WordForm("אִתִּי", "with me, NOT direct object marker")),
        // 7586
        new Word(new WordForm("מִן", "from"), STRONG),
        // 5778
        new Word(new WordForm("עַל", "upon, over, above"), STRONG),
        // 5518
        new Word(new WordForm("אֶל", "to, toward"), STRONG),
        // 5518
        new Word(new WordForm("לֹא", "no, not, used with perfect, used with imperfect = never"), STRONG),
        // 5503
        new Word(new WordForm("אֲשֶׁר", "who, whom, that, which (relative pronoun)"), STRONG),
        // 5415
        new Word(new WordForm("כֹּל", "all"), STRONG)
            .addForm(new WordForm("כָּל", "all of", CONSTRUCT)),
        // 5317
        new Word(new WordForm("אָמַר", "he said"), STRONG),

        // 4942
        new Word(new WordForm("בֵּן", "son", MASCULINE), STRONG)
            .addForm(new WordForm("בֶּן", "son of", MASCULINE, CONSTRUCT))
            .addForm(new WordForm("בָּנִים", "sons", MASCULINE, PLURAL)),
        // 4795
        new Word(new WordForm("אֲנִי", "I, myself", NOMINATIVE), OK)
            .addForm(new WordForm("אָנֹכִי", "I, myself", NOMINATIVE))
            .addForm(new WordForm("אֲנַחְנוּ", "we", NOMINATIVE)),

        new Word(new WordForm("אַתָּה", "you", NOMINATIVE, MASCULINE, SINGULAR), WEAK)
            .addForm(new WordForm("אַתְּ", "you", NOMINATIVE, FEMININE, SINGULAR))
            .addForm(new WordForm("אַתֶּם", "you", NOMINATIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("אַתֵּנָה", "you", NOMINATIVE, FEMININE, PLURAL)),

        new Word(new WordForm("הוּא", "he, that", NOMINATIVE), WEAK)
            .addForm(new WordForm("הִיא", "she, that", NOMINATIVE))
            .addForm(new WordForm("הִוא", "she, that", NOMINATIVE))
            .addForm(new WordForm("הֵם", "they, those", NOMINATIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("הֵמָּה", "they, those", NOMINATIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("הֵן", "they, those", NOMINATIVE, FEMININE, PLURAL))
            .addForm(new WordForm("הֵנָּה", "they, those", NOMINATIVE, FEMININE, PLURAL)),

        // 4487
        new Word(new WordForm("כִּי", "that, because; (adversative) but, except; (emphatic) indeed, truly"), STRONG),
        new Word(new WordForm("כִּי–אִם", "but, except"), ZERO),
        // 2909
        new Word(new WordForm("כְּ", "as, like"), STRONG),
        // 2632
        new Word(new WordForm("עָשַׂה", "he did, he made"), STRONG)
            .addForm(new WordForm("מַעֲשֶׂה", "work, deed", MASCULINE)) // 235
            .addForm(new WordForm("מַעֲשִׂים", "works, deeds", MASCULINE, PLURAL)),
        // 2602
        new Word(new WordForm("אֱלֹהִים", "God", MASCULINE), STRONG)
            .addForm(new WordForm("אֱלֹהִים", "gods", MASCULINE, PLURAL))
            .addForm(new WordForm("אֵל", "god", MASCULINE)), // 236
        // 2579
        new Word(new WordForm("בָּא", "he came, entered - בּוֹא"), OK),
        // 2530
        new Word(new WordForm("מֶלֶך", "king", MASCULINE), WEAK)
            .addForm(new WordForm("מְלָכִים", "kings", MASCULINE, PLURAL))
            .addForm(new WordForm("מָלַךּ", "he reigned")) // 350
            .addForm(new WordForm("מַמְלָכָה", "kingdom, reign, dominion", FEMININE)), // 117
        // 2529
        new Word(new WordForm("זֶה",	"this", MASCULINE), OK)
            .addForm(new WordForm("זֹאת", "this", FEMININE))
            .addForm(new WordForm("אֵלָה", "these")),
        // 2505
        new Word(new WordForm("אֶרֶץ", "land, earth", FEMININE), STRONG)
            .addForm(new WordForm("אֲרָצוֹת", "lands, earths", FEMININE, PLURAL)),
        // 2303
        new Word(new WordForm("יוֹם", "day", MASCULINE), WEAK)
            .addForm(new WordForm("יָמִים", "days", MASCULINE, PLURAL)),
        // 2187
        new Word(new WordForm("אִיש", "man", MASCULINE), WEAK)
            .addForm(new WordForm("אֲנָשִׁים", "men", MASCULINE, PLURAL)),
        // 2128
        new Word(new WordForm("פָּנִים", "face, faces", MASCULINE, SINGULAR, PLURAL), OK)
            .addForm(new WordForm("פְּנֵי", "before, in the presence of")),
        // 2046
        new Word(new WordForm("בַּיִת", "house", MASCULINE), OK)
            .addForm(new WordForm("בֵּּּית", "house of", MASCULINE, CONSTRUCT))
            .addForm(new WordForm("בָּתִּים", "houses", MASCULINE, PLURAL)),
        // 1867
        new Word(new WordForm("עַם", "people, nation", MASCULINE), OK)
            .addForm(new WordForm("עַמִּים", "peoples, nations", MASCULINE, PLURAL)),
        // 1627
        new Word(new WordForm("יָד", "hand, (metaphorically) side, power", FEMININE), STRONG)
            .addForm(new WordForm("יַד", "hand of", FEMININE, CONSTRUCT))
            .addForm(new WordForm("יָדַיִם", "hands", FEMININE, DUAL)),
        // 1554
        new Word(new WordForm("הָלַךּ",	"he walked"), STRONG),
        // 1494
        new Word(new WordForm("דָּבָר", "word, speech", MASCULINE), STRONG)
            .addForm(new WordForm("דְּבָרִים", "words, speeches", MASCULINE, PLURAL))
            .addForm(new WordForm("דִּבֶּר",	"he spoke", PIEL)), // 1135
        // 1310
        new Word(new WordForm("רָאָה", "he saw"), WEAK)
            .addForm(new WordForm("מַרְאֶה", "sight, appearance", MASCULINE)),  // 103
        // 1263
        new Word(new WordForm("עַד", "until, as far as"), OK),
        // 1210
        new Word(new WordForm("אָב", "father", MASCULINE), STRONG)
            .addForm(new WordForm("אֲבִי", "father of", MASCULINE, CONSTRUCT))
            .addForm(new WordForm("אָבוֹת", "fathers", MASCULINE, PLURAL)),
        // 1165
        new Word(new WordForm("שָׁמַע",	 "he heard"), STRONG),
        // 1119
        new Word(new WordForm("ָה", "to, toward, directional ending"), WEAK),
        // 1094
        new Word(new WordForm("עִיר", "city", FEMININE), STRONG)
            .addForm(new WordForm("עָרִים", "cities", FEMININE, PLURAL)),
        // 1087
        new Word(new WordForm("יָשַׁב",	"he sat, he dwelt"), STRONG),
        // 1075
        new Word(new WordForm("יָצָא", 	"he went out"), STRONG),
        new Word(new WordForm("שָׁב", "he returned"), STRONG),
        // 1070
        new Word(new WordForm("אִם", "if"), STRONG),
        // 1061
        new Word(new WordForm("הִנַּה", "behold, here I am, I am ready"), STRONG),
        // 1048
        new Word(new WordForm("עִם", "with"), OK),
        // 976
        new Word(new WordForm("אֶחָד", "one", MASCULINE), WEAK)
            .addForm(new WordForm("אַחַת", "one", FEMININE)),
        // 966
        new Word(new WordForm("לָקַח", "he took"), OK),
        // 952
        new Word(new WordForm("יָדַע", "he knew"), STRONG),
        // 896
        new Word(new WordForm("עַיִן", "eye, spring", FEMININE), STRONG)
            .addForm(new WordForm("עֵינַים", "eyes", FEMININE, DUAL))
            .addForm(new WordForm("עֲיָנֹת", "springs", FEMININE, PLURAL)),
        // 894
        new Word(new WordForm("עָלָה", "he went up"), STRONG),
        // 879
        new Word(new WordForm("שָׁנָה", "year", FEMININE), OK)
            .addForm(new WordForm("שָׁנִים", "years", FEMININE, PLURAL)),
        // 864
        new Word(new WordForm("שֵׁם", "name", MASCULINE), OK)
            .addForm(new WordForm("שֵׁמוֹת", "names", MASCULINE, PLURAL)),
        // 853 (601 for לב and 252 for לבב )
        new Word(new WordForm("לֵב", "heart", MASCULINE), STRONG)
            .addForm(new WordForm("לִבּוֹת", "hearts", MASCULINE, PLURAL))
            .addForm(new WordForm("לֵבָב", "heart", MASCULINE))
            .addForm(new WordForm("לְבָבוֹת", "hearts", MASCULINE, PLURAL)),
        // 847
        new Word(new WordForm("שָׁלַח", "he sent, stretched out"), STRONG)
            .addForm(new WordForm("הִשְׁלְִיך", "he threw, flung, cast - שָׁלַך", HIPHIL)), // 127
        // 845
        new Word(new WordForm("מֵת", "he died - מוּת"), WEAK)
            .addForm(new WordForm("מָוֶת", "death, dying", MASCULINE)), // 153
        // 835
        new Word(new WordForm("שָׁם", "there"), OK),
        // 814
        new Word(new WordForm("אָכַל", "he ate"), OK),
        // 803
        new Word(new WordForm("עֶבֶד", "servant, slave", MASCULINE), STRONG)
            .addForm(new WordForm("עֲבָדִים", "servants, slaves", MASCULINE, PLURAL))
            .addForm(new WordForm("עָבַד", "he worked, he served")) // 289
            .addForm(new WordForm("עֲבֹדָה", "work, labor, service, worship", FEMININE)), // 147
        // 783
        new Word(new WordForm("אַיִן", "nothing, there is not"), OK)
            .addForm(new WordForm("אֵין", "nothing, there is not")),
        // 781
        new Word(new WordForm("אִשָּׁה", "woman, wife", FEMININE), WEAK)
            .addForm(new WordForm("אֵשֶׁת", "woman, wife", FEMININE, SINGULAR, CONSTRUCT))
            .addForm(new WordForm("נָשׁים", "women, wives", FEMININE, PLURAL))
            .addForm(new WordForm("נְשֵׁי", "women, wives", FEMININE, PLURAL, CONSTRUCT)),
        // 774
        new Word(new WordForm("אָדוֹן", "lord, master", MASCULINE), STRONG)
            .addForm(new WordForm("אֲדֹנִים", "lords, masters", MASCULINE, PLURAL)),
        // 769
        new Word(new WordForm("שְׁנַיִם", "two", MASCULINE), WEAK)
            .addForm(new WordForm("שְׁתַּים", "two", FEMININE))
            .addForm(new WordForm("שֵׁנִי", "second", MASCULINE))
            .addForm(new WordForm("שֵׁנִית", "second", FEMININE)),
        new Word(new WordForm("גַּם", "also"), STRONG),
        // 757
        new Word(new WordForm("נֶפֶש", "soul, person", FEMININE), STRONG)
            .addForm(new WordForm("נְפָשׁוֹת", "souls, persons", FEMININE, PLURAL)),
        // 754
        new Word(new WordForm("מָה", "what?"), WEAK)
            .addForm(new WordForm("מַה", "what?"))
            .addForm(new WordForm("מֶה", "what?")),
        // 750
        new Word(new WordForm("כֹּהַן", "priest", MASCULINE), OK)
            .addForm(new WordForm("כֹהֲנִים", "priests", MASCULINE, PLURAL)),
        // 748
        new Word(new WordForm("הֲ", "indicates interrogative, prefixed to first word in the sentence"), WEAK),
        // 743
        new Word(new WordForm("כֵּן", "so, thus"), OK),
        // 736
        new Word(new WordForm("קָרָא", "he called"), WEAK)
            .addForm(new WordForm("קָרָא", "he encountered, he met")), // 139 I don't think these roots are related
        // 729
        new Word(new WordForm("אַל", "no, not (with imperfect) not at this time"), STRONG),
        // 712
        new Word(new WordForm("דֶּרֶךּ", "way, road", MASCULINE, FEMININE), OK)
            .addForm(new WordForm("דֶּרָכִים", "ways, roads", MASCULINE, FEMININE, PLURAL)),
        // 707
        new Word(new WordForm("אַחַר", "after"), OK),
        // 658
        new Word(new WordForm("נָשָׂא", "he lifted, carried, took"), WEAK),
        // 629
        new Word(new WordForm("אָח", "brother", MASCULINE), OK)
            .addForm(new WordForm("אֲחִי", "brother of", MASCULINE, CONSTRUCT))
            .addForm(new WordForm("אַחִים", "brothers", MASCULINE, PLURAL))
            .addForm(new WordForm("אָחוֹת", "sister", FEMININE)), // 119
        // 627
        new Word(new WordForm("קָם", "he arose, stood - קוּם"), OK)
            .addForm(new WordForm("מָקוֹם", "place", MASCULINE)) // 401
            .addForm(new WordForm("מְקוֹמוֹת", "places", MASCULINE, PLURAL)),
        // 606
        new Word(new WordForm("שָׁלשׁ", "three", MASCULINE), OK)
            .addForm(new WordForm("שְׁלֹשִׁים", "thirty"))
            .addForm(new WordForm("שְׁלִישִׁי", "third")),
        // 600
        new Word(new WordForm("רֹאשׁ", "head", MASCULINE), OK)
            .addForm(new WordForm("רָאשִׁים", "heads", MASCULINE, PLURAL)),
        // 588
        new Word(new WordForm("בַּת", "daughter", FEMININE), STRONG)
            .addForm(new WordForm("בָּנוֹת", "daughters", FEMININE, PLURAL)),
        // 583
        new Word(new WordForm("מָיִם", "water, waters", MASCULINE, SINGULAR, PLURAL), OK)
            .addForm(new WordForm("מֵי", "water", MASCULINE, SINGULAR, PLURAL, CONSTRUCT)),
        new Word(new WordForm("מֵאָה", "hundred"), WEAK),
        // 577
        new Word(new WordForm("כֹּה", "thus, here"), OK),
        // 560
        new Word(new WordForm("גּוֹי", "nation", MASCULINE), OK)
            .addForm(new WordForm("גּוֹיִם", "nations", MASCULINE, PLURAL)),
        // 559
        new Word(new WordForm("הַר", "mountain", MASCULINE), OK)
            .addForm(new WordForm("הָרִים", "mountains", MASCULINE, PLURAL)),
        // 554
        new Word(new WordForm("עָבַר", "he passed over, passed through, passed by"), OK),
        // 545
        new Word(new WordForm("אָדָם", "a man, humankind", MASCULINE), STRONG)
            .addForm(new WordForm("אֲדָמָה", "land, ground, earth", FEMININE))
            .addForm(new WordForm("אֲדָמוֹת", "lands, grounds", FEMININE, PLURAL)),
        // 528
        new Word(new WordForm("שָׂם", "he put, set - שִׂים"), OK),
        // 526
        new Word(new WordForm("גָּדוֹל", "great"), WEAK)
            .addForm(new WordForm("גָּדַל", "he grew up, became great, strong, wealthy, important")), // 117
        // 524
        new Word(new WordForm("עָמַד", "he stood"), OK),
        // 511
        new Word(new WordForm("תַּחַת", "under, instead of"), WEAK),
        // 508
        new Word(new WordForm("חָמַשׁ", "five", MASCULINE), WEAK)
            .addForm(new WordForm("חֲמִשִּׁים", "fifty")),
        // 505
        new Word(new WordForm("קוֹל", "voice, sound", MASCULINE), OK)
            .addForm(new WordForm("קֹלוֹת", "voices, sounds", MASCULINE, PLURAL)),
        // 501
        new Word(new WordForm("הִכָּה", "he hit - נכה (he smote)", HIPHIL), WEAK),
        // 498
        new Word(new WordForm("פֶה", "mouth", MASCULINE), WEAK)
            .addForm(new WordForm("פִּי", "mouth", MASCULINE, SINGULAR, CONSTRUCT))
            .addForm(new WordForm("פִּיּוֹת", "mouths", MASCULINE, PLURAL)),
        // 496
        new Word(new WordForm("צָבָא", "host, army, war, service", MASCULINE), OK)
            .addForm(new WordForm("צְבָאוֹת", "hosts, armies, wars, services", MASCULINE, PLURAL)),
        // 496
        new Word(new WordForm("צִוָּה", "he commanded"), OK),
        // 495
        new Word(new WordForm("יָלַד", "he bore, he begat"), OK),
        // 494
        new Word(new WordForm("אֶלֶף", "thousand"), WEAK),
        // 492
        new Word(new WordForm("עֶשֶׁר", "ten", MASCULINE), WEAK)
            .addForm(new WordForm("עֲשָׂרָה", "ten", FEMININE))
            .addForm(new WordForm("עֶשְׂרִים", "twenty")),
        // 491
        new Word(new WordForm("שֶׁבַע", "seven", MASCULINE), OK)
            .addForm(new WordForm("שִׁבְעִים", "seventy"))
            .addForm(new WordForm("שָׁבַע", "he swore")), // 186
        // 491
        new Word(new WordForm("עוֹד", "again, still, long"), OK),
        // 470
        new Word(new WordForm("קֹדֶש", "holiness, apartness, sacredness", MASCULINE), WEAK)
            .addForm(new WordForm("קֳדָשִׁים", "holiness, apartness, sacredness", MASCULINE, PLURAL))
            .addForm(new WordForm("קָדַשׁ", "he was consecrated, he consecrated")), // 171
        // 469
        new Word(new WordForm("שָׁמַר", "he guarded, watched, preserved"), OK),
        // 457
        new Word(new WordForm("מָצַה", "he found, reached, obtained"), OK),
        // 456
        new Word(new WordForm("אַרְבַּע", "four", MASCULINE), OK)
            .addForm(new WordForm("אַרְבָּעִים", "forty"))
            .addForm(new WordForm("רְבִיעִי", "fourth", MASCULINE)),
        // 439
        new Word(new WordForm("עוֹלָם", "forever", MASCULINE), OK)
            .addForm(new WordForm("עוֹלָמִים", "forever", MASCULINE, PLURAL)),
        // 435
        new Word(new WordForm("נָפַל", "he fell"), OK),
        new Word(new WordForm("עַתָּה", "now"), OK)
            .addForm(new WordForm("עַת", "time, point in time", FEMININE)), // 296
        // 424
        new Word(new WordForm("מִשְׁפָת", "judgement, law", MASCULINE), OK)
            .addForm(new WordForm("מִשׁפָּטִים", "judgements, laws", MASCULINE, PLURAL))
            .addForm(new WordForm("שָׁפַת", "he judged")), // 204
        new Word(new WordForm("מִי", "who?"), WEAK),
        // 421
        new Word(new WordForm("שַׂר", "prince, chief", MASCULINE), OK)
            .addForm(new WordForm("שָׂרִים", "princes, chiefs", MASCULINE, PLURAL)),
        new Word(new WordForm("שָׁמַיִם", "heavens, sky", MASCULINE, SINGULAR, PLURAL), OK)
            .addForm(new WordForm("שְׁמֵי", "heavens, sky", MASCULINE, CONSTRUCT)),
        // 420
        new Word(new WordForm("תָּוֶךּ", "midst"), WEAK),
        // 413
        new Word(new WordForm("חֶרֶב", "sword", FEMININE), OK)
            .addForm(new WordForm("חֲרָבוֹת", "swords", FEMININE, PLURAL)),
        // 409
        new Word(new WordForm("רַב", "great, many", MASCULINE), WEAK)
            .addForm(new WordForm("רַבָּה", "great, many", FEMININE))
            .addForm(new WordForm("רָבָה", "he was(became) great/many"))
            .addForm(new WordForm("רֹב", "multitude, greatness", NOUN, MASCULINE)), // 150
        new Word(new WordForm("בַּין", "between"), WEAK)
            .addForm(new WordForm("בִּין", "he discerned, understood")), // 171
        // 405
        new Word(new WordForm("נָא", "please, now"), OK),
        // 403
        new Word(new WordForm("כֶּסֶף", "silver, money", MASCULINE), OK),
        new Word(new WordForm("מִזְבֵּחַ", "alter", MASCULINE), OK)
            .addForm(new WordForm("מִזְבְּחוֹת", "alters", MASCULINE, PLURAL)),
        // 396
        new Word(new WordForm("יָם", "sea", MASCULINE), WEAK)
            .addForm(new WordForm("יַמִּים", "seas", MASCULINE, PLURAL)),
        // 389
        new Word(new WordForm("זָהָב", "gold", MASCULINE), OK),
        // 382
        new Word(new WordForm("יָרַד", "he went down"), STRONG),
        // 377
        new Word(new WordForm("בָּנָה", "he built"), OK),
        new Word(new WordForm("אַשׁ", "fire", FEMININE), OK),
        // 376
        new Word(new WordForm("נְאֻם", "utterance", MASCULINE), OK),
        // 373
        new Word(new WordForm("שַׁעַר", "gate", MASCULINE), OK)
            .addForm(new WordForm("שְׁעָרִים", "gates", MASCULINE, PLURAL)),
        new Word(new WordForm("טוֹב", "good", ADJECTIVE, MASCULINE, SINGULAR), STRONG)
            .addForm(new WordForm("טוֹבָה", "good", ADJECTIVE, FEMININE, SINGULAR))
            .addForm(new WordForm("טוֹבִים", "good", ADJECTIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("טוֹבוֹת", "good", ADJECTIVE, FEMININE, PLURAL)),
        // 371
        new Word(new WordForm("הִגִיד", "he told, declared - נגד (be conspicuous)", HIPHIL), OK),
        // 363
        new Word(new WordForm("רוּחַ", "spirit, breath, wind", FEMININE), STRONG)
            .addForm(new WordForm("רוּחוֹת", "spirits, breaths, winds", FEMININE, PLURAL)),
        // 361
        new Word(new WordForm("דָּם", "blood", MASCULINE), OK)
            .addForm(new WordForm("דָּמִים", "bloods", MASCULINE, PLURAL)),
        // 357
        new Word(new WordForm("רַע", "bad, evil", ADJECTIVE, MASCULINE, SINGULAR), OK)
            .addForm(new WordForm("רָעָה", "bad, evil", ADJECTIVE, FEMININE, SINGULAR))
            .addForm(new WordForm("רָעִים", "bad, evil", ADJECTIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("רָעוֹת", "bad, evil", ADJECTIVE, FEMININE, PLURAL)),
        // 348
        new Word(new WordForm("אֹהֶל", "tent", MASCULINE), OK)
            .addForm(new WordForm("אֹהָלִים", "tents", MASCULINE, PLURAL)),
        // 338
        new Word(new WordForm("סָבִיב", "all around"), OK)
            .addForm(new WordForm("סָבַב", "he turned around, went around, surrounded")), // 163
        // 330
        new Word(new WordForm("עֵץ", "tree", MASCULINE), OK)
            .addForm(new WordForm("עֵצִים", "trees", MASCULINE, PLURAL)),
        // 327
        new Word(new WordForm("בֵּרַךּ", "he blessed - ברך (he knelt, he blessed)", PIEL), OK),
        // 325
        new Word(new WordForm("כְּלִי", "utensil, weapon", MASCULINE), OK)
            .addForm(new WordForm("כֵּלִים", "utensils, weapons", MASCULINE, PLURAL)),
        // 321
        new Word(new WordForm("שָׂדֶה", "open field, country", MASCULINE), STRONG)
            .addForm(new WordForm("שָׂדוֹת", "open fields, country", MASCULINE, PLURAL)),
        new Word(new WordForm("אוֹ", "or"), OK),
        // 319
        new Word(new WordForm("מִלְחָמָה", "war, battle", FEMININE), OK)
            .addForm(new WordForm("מִלְחָמוֹת", "wars, battles", FEMININE, PLURAL))
            .addForm(new WordForm("נִלְחַם", "he engaged in battle (reciprocal), waged war – לחם", NIPHAL)), // 171
        // 318
        new Word(new WordForm("יָרֵא", "he feared"), WEAK),
        // 317
        new Word(new WordForm("עָנָה", "he answered"), OK),
        new Word(new WordForm("נָבִיא", "prophet", MASCULINE), OK)
            .addForm(new WordForm("נְבִיאִים", "prophets", MASCULINE, PLURAL))
            .addForm(new WordForm("נִבָּא", "he prophisied - נָבָא", NIPHAL)), // 115
        // 311
        new Word(new WordForm("רָעָה", "evil, misery, distress", NOUN, FEMININE), WEAK),
        // 304
        new Word(new WordForm("פָּקַד", "he attended to, appointed, mustered, visited"), WEAK),
        new Word(new WordForm("מִשְׁפָּחָה", "family", FEMININE), OK)
            .addForm(new WordForm("מִשְׁפָּחוֹת", "families", FEMININE, PLURAL)),
        // 298
        new Word(new WordForm("סָר", "he turned aside - סור"), WEAK),
        new Word(new WordForm("חַטָּאת", "sin, sin offering", FEMININE), OK)
            .addForm(new WordForm("חָטָא", "he sinned, he missed")), // 239
        new Word(new WordForm("לֶחֶם", "bread, food", MASCULINE), STRONG),
        new Word(new WordForm("מְאֹד", "very"),STRONG),
        // 290
        new Word(new WordForm("חָזַק", "he was strong"), OK),
        // 289
        new Word(new WordForm("כָּרַת", "he cut off"), WEAK),
        // 288
        new Word(new WordForm("עֹלָה", "whole burnt offering", FEMININE), WEAK)
            .addForm(new WordForm("עֹלוֹת", "whole burnt offerings", FEMININE, PLURAL)),
        // 287
        new Word(new WordForm("חָיָה", "he lived"), STRONG)
            .addForm(new WordForm("חַיִּים", "life, lives", MASCULINE, SINGULAR, PLURAL)), // 268
        // 285
        new Word(new WordForm("אֹיֵב", "enemy", MASCULINE), WEAK)
            .addForm(new WordForm("אָיַב", "he was hostile")),
        new Word(new WordForm("בְּרִית", "covenant", FEMININE), OK),
        // 283
        new Word(new WordForm("חֹדֶשׁ", "month, new moon", MASCULINE), WEAK)
            .addForm(new WordForm("חֳדָשִׁים", "months, new moons", MASCULINE, PLURAL)),
        // 280
        new Word(new WordForm("קָרַב", "he came near, he offered"), WEAK)
            .addForm(new WordForm("קֶרֶב", "midst, inward part", MASCULINE)),
        // 277
        new Word(new WordForm("אַף", "nose, anger", MASCULINE), OK)
            .addForm(new WordForm("אַפַּיִם", "noses, anger", MASCULINE, PLURAL)),
        // 274
        new Word(new WordForm("צֹאן", "flock, sheep", FEMININE, SINGULAR, PLURAL), OK),
        new Word(new WordForm("שַׁשׁ", "six", MASCULINE), WEAK)
            .addForm(new WordForm("שׁשִּׁים", "sixty")),
        // 272
        new Word(new WordForm("אֶבֶן", "stone", FEMININE), STRONG)
            .addForm(new WordForm("אֲבָנִים", "stones", FEMININE, PLURAL)),
        new Word(new WordForm("לְמַעַן", "because of, in order to, for the sake of"), OK),
        // 270
        new Word(new WordForm("בָּשָׂר", "flesh, meat, skin", MASCULINE), OK)
            .addForm(new WordForm("בְּשָׂרִים", "fleshes, meats, skins", MASCULINE, PLURAL)),
        new Word(new WordForm("מִדְבָּר", "wilderness, desert, pasture", MASCULINE), STRONG),
        // 264
        new Word(new WordForm("רָשָׁע", "wicked", ADJECTIVE, MASCULINE, SINGULAR), WEAK)
            .addForm(new WordForm("רְשָׁעִים", "wicked", ADJECTIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("רְשָׁעָה", "wicked", ADJECTIVE, FEMININE, SINGULAR)),
        // 252
        new Word(new WordForm("מַטֶּה", "tribe, staff", MASCULINE), WEAK)
            .addForm(new WordForm("מָטּוֹת", "tribes, staffs", MASCULINE, PLURAL)),
        // 251
        new Word(new WordForm("רֶגֶל", "foot", FEMININE), OK)
            .addForm(new WordForm("רַגְלַיִם", "feet", FEMININE, DUAL)),
        // 250
        new Word(new WordForm("מָלֵא", "he filled"), WEAK),
        new Word(new WordForm("אַמָּה", "cubit, forearm", FEMININE), WEAK)
            .addForm(new WordForm("אַמּוֹת", "cubits, forearms", FEMININE, PLURAL)),
        // 249
        new Word(new WordForm("חֶסֶד", "loving kindness, steadfast love", MASCULINE), STRONG)
            .addForm(new WordForm("חֲסָדִים", "loving kindnesses, steadfast loves", MASCULINE, PLURAL)),
        // 245
        new Word(new WordForm("חַיַל", "strength, wealth, army", MASCULINE), WEAK)
            .addForm(new WordForm("חֲיָלִים", "armies,strengths, wealths", MASCULINE, PLURAL)),
        // 241
        new Word(new WordForm("גְּבוּל", "border, boundary, territory", MASCULINE), WEAK),
        // 240
        new Word(new WordForm("נַעַר", "boy, youth", MASCULINE), STRONG)
            .addForm(new WordForm("נְעָרִים", "boys, youths", MASCULINE, PLURAL)),
        // 237
        new Word(new WordForm("שָׁלוֹם", "peace, completeness", MASCULINE), WEAK)
            .addForm(new WordForm("שָׁלֵם", "he was whole, complete")) // 116
            .addForm(new WordForm("שִׁלַּם", "he repaid - שָׁלֵם", PIEL))
            .addForm(new WordForm("הִשְׁלִים", "he made peace - שָׁלֵם", HIPHIL)),
        // 233
        new Word(new WordForm("עָוֹן", "iniquity", MASCULINE), OK)
            .addForm(new WordForm("עֲוֹנוֹת", "iniquities", MASCULINE, PLURAL)),
        // 232
        new Word(new WordForm("יָרַשׁ", "he inherited, he possessed, he dispossessed"), OK),
        // 229
        new Word(new WordForm("זֶרַע", "seed", MASCULINE), OK),
        // 227
        new Word(new WordForm("לַיְלָה", "night", MASCULINE), STRONG)
            .addForm(new WordForm("לֵילוֹת", "nights", MASCULINE, PLURAL)),
        // 225
        new Word(new WordForm("בִּקֵּשׁ", "he sought", PIEL), WEAK),
        new Word(new WordForm("זָכַר", "he remembered"), OK),
        new Word(new WordForm("כָּתַב", "he wrote"), WEAK),
        // 223
        new Word(new WordForm("מוֹעַד", "appointed time, place", MASCULINE), OK)
            .addForm(new WordForm("מוֹעֲדִים", "appointed times, places", MASCULINE, PLURAL)),
        new Word(new WordForm("תּוֹרָה", "law, instruction", FEMININE), STRONG)
            .addForm(new WordForm("תּוֹרוֹת", "laws, instructions", FEMININE, PLURAL)),
        // 222
        new Word(new WordForm("נַחֲלָה", "possession", FEMININE), WEAK)
            .addForm(new WordForm("נְחָלוֹת", "possessions", FEMININE, PLURAL)),
        // 220
        new Word(new WordForm("אֵם", "mother", FEMININE), OK),
        // 219
        new Word(new WordForm("נָכְוֹן", "he was firm, established, prepared", NIPHAL), WEAK),
        // 217
        new Word(new WordForm("אָהַב", "he loved"), OK),
        new Word(new WordForm("שָׁתָה", "he drank"), WEAK),
        // 216
        new Word(new WordForm("נָטָה", "he stretched out"), WEAK),
        new Word(new WordForm("בֶּגֶד", "garmet", MASCULINE), OK)
            .addForm(new WordForm("בְּגָדִים", "garmets", MASCULINE, PLURAL)),
        // 215
        new Word(new WordForm("יָסַף", "he added, he did again"), OK),
        new Word(new WordForm("מַחֲנֶה", "camp", MASCULINE, FEMININE), WEAK)
            .addForm(new WordForm("מַחַנוֹת", "camps", MASCULINE, FEMININE, PLURAL)),
        // 214
        new Word(new WordForm("עָזַב", "he forsook, left"), WEAK),
        // 213
        new Word(new WordForm("הִצִּיל", "he saved, delivered - נצל", HIPHIL), WEAK),
        new Word(new WordForm("שָׁכַב", "he layed down, he had sex"), WEAK),
        new Word(new WordForm("בֹּקֶר", "morning", MASCULINE), OK)
            .addForm(new WordForm("בְּקָרִים", "mornings", MASCULINE, PLURAL)),
        new Word(new WordForm("מַלְאָךּ", "messenger", MASCULINE), WEAK)
            .addForm(new WordForm("מַלְאָכִים", "messengers", MASCULINE, PLURAL)),
        // 211
        new Word(new WordForm("מִנְחָה", "gift, tribute, offering", FEMININE), WEAK),
        // 208
        new Word(new WordForm("כָּלָה", "he was complete, finished, he came to an end"), WEAK),
        // 206
        new Word(new WordForm("צַדּיק", "just, righteous", ADJECTIVE, MASCULINE), WEAK)
            .addForm(new WordForm("צַדִּיקִים", "just, righteous", ADJECTIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("צְדָקָה", "righteousness", FEMININE)), // 159
        // 202
        new Word(new WordForm("אֲרוֹן", "ark, chest", MASCULINE), WEAK),
        // 200
        new Word(new WordForm("אָסַף", "he gathered"), OK),
        // 199
        new Word(new WordForm("כָּבוֹד", "abundance, honor, glory", MASCULINE), WEAK)
            .addForm(new WordForm("כָּבֵד", "he was heavy, he was honored")), // 114
        // 195
        new Word(new WordForm("רוּם", "he was high, exalted"), WEAK),
        new Word(new WordForm("כַּף", "palm of the hand, sole of the foot", FEMININE), WEAK)
            .addForm(new WordForm("כַּפוֹת", "palms of the hands, soles of the feet", FEMININE, PLURAL)),
        // 194
        new Word(new WordForm("יָכוֹל", "he was able"), WEAK),
        // 193
        new Word(new WordForm("שֶׁמֶן", "fat, oil", MASCULINE), OK)
            .addForm(new WordForm("שְמָנִים", "fats, oils", MASCULINE, PLURAL)),
        // 191
        new Word(new WordForm("חֲצֵרִים", "settlements, villages", MASCULINE, SINGULAR, PLURAL), WEAK),
        // 190
        new Word(new WordForm("בְּהֵמָה", "beast", FEMININE), OK)
            .addForm(new WordForm("בְּהֵמוֹת", "beasts", FEMININE, PLURAL)),
        new Word(new WordForm("שָׁבֶט", "scepter, rod, tribe", MASCULINE), WEAK)
            .addForm(new WordForm("שְׁבָטִים", "scepters, rods, tribes", MASCULINE, PLURAL)),
        // 188
        new Word(new WordForm("אֹזֶן", "ear", FEMININE), WEAK)
            .addForm(new WordForm("אָזְנַיִם", "ears", FEMININE, DUAL)),
        // 187
        new Word(new WordForm("גָלָה", "he removed, uncovered, departed"), ZERO),
        new Word(new WordForm("סֵפֶר", "document, book", MASCULINE), WEAK)
            .addForm(new WordForm("סְפָרִים", "documents, books", MASCULINE, PLURAL))
            .addForm(new WordForm("מִסְפָּר", "number", NOUN, MASCULINE)) // 134
            .addForm(new WordForm("סָפַר", "he counted")), // 107
        new Word(new WordForm("רֵעַ", "friend, companion, fellow", MASCULINE), ZERO)
            .addForm(new WordForm("רֵעִים", "friends, companions, fellows", MASCULINE, PLURAL)),
        // 185
        new Word(new WordForm("אָבַד", "he perished, he vanished, he became lost"), ZERO),
        // 184
        new Word(new WordForm("מִצְוָה", "commandment", FEMININE), WEAK)
            .addForm(new WordForm("מִצְוֹת", "commandments", FEMININE, PLURAL)),
        // 183
        new Word(new WordForm("בָּקָר", "cattle, herd, ox", MASCULINE), ZERO)
            .addForm(new WordForm("בְּקָרִים", "herds, oxen", MASCULINE, PLURAL)),
        // 182
        new Word(new WordForm("רִאשׁוֹן", "first, former", ADJECTIVE, MASCULINE), OK)
            .addForm(new WordForm("רִאשֹׁנִים", "first, former", ADJECTIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("רִאשֹׁנָה", "first, former", ADJECTIVE, FEMININE))
            .addForm(new WordForm("רִאשֹׁנוֹת", "first, former", ADJECTIVE, FEMININE, PLURAL)),
        // 179
        new Word(new WordForm("זָקֵן", "old", ADJECTIVE, MASCULINE), OK)
            .addForm(new WordForm("זְקֵנִים", "old", ADJECTIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("זְקֵנוֹת", "old", ADJECTIVE, FEMININE, PLURAL)),
        // 178
        new Word(new WordForm("הוֹשִׁיעַ", "he saved, delivered - ישׁע", HIPHIL), ZERO),
        new Word(new WordForm("שָֹפָה", "lip, language, edge, shore", FEMININE), ZERO)
            .addForm(new WordForm("שְׂפָתַיִם", "lips, languages, edges, shores", FEMININE, DUAL)),
        new Word(new WordForm("לָמָּה", "why?"), ZERO),
        // 174
        new Word(new WordForm("שָאַל", "he asked"), ZERO),
        // 173
        new Word(new WordForm("שָׁחָה", "he bowed down"), ZERO),
        // 170
        new Word(new WordForm("בָּחַר", "he chose, tested, examined"), ZERO),
        // 167
        new Word(new WordForm("הָרַג", "he attacked, he slew"), ZERO),
        new Word(new WordForm("רָעָה", "he pastured, tended, grazed"), ZERO),
        new Word(new WordForm("דּוֹר", "period, generation, dwelling", MASCULINE), WEAK)
            .addForm(new WordForm("דּוֹרִים", "periods, generations, dwellings", MASCULINE, PLURAL)),
        new Word(new WordForm("מְלָאכָה", "work, occupation", FEMININE), WEAK)
            .addForm(new WordForm("מַלְאֲכוֹת", "works, occupations", FEMININE, PLURAL)),
        // 166
        new Word(new WordForm("אַחֵר", "another", ADJECTIVE, MASCULINE, SINGULAR), WEAK)
            .addForm(new WordForm("אֲחֵרִים", "another", ADJECTIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("אַחֶרֶת", "another", ADJECTIVE, FEMININE, SINGULAR))
            .addForm(new WordForm("אֲחֵרוֹת", "another", ADJECTIVE, FEMININE, PLURAL)),
        // 165
        new Word(new WordForm("דָּרַשׁ", "he sought, inquired, investigated, required, demanded"), ZERO),
        // 164
        new Word(new WordForm("חוּץ", "outside, street", NOUN, MASCULINE), ZERO),
        new Word(new WordForm("פֶּתַח", "opening, doorway, entrace", MASCULINE), WEAK)
            .addForm(new WordForm("פְּתָחִים", "openings, doorways, entraces", MASCULINE, PLURAL))
            .addForm(new WordForm("פָּתַח", "he opened")), // 136
        // 162
        new Word(new WordForm("טָמֵא", "he was/became unclean"), ZERO),
        new Word(new WordForm("זֶבַח", "sacrifice", NOUN, MASCULINE), ZERO),
        // 161
        new Word(new WordForm("אַיִל", "ram", NOUN, MASCULINE), ZERO),
        new Word(new WordForm("בַּד", "alone"), ZERO),
        new Word(new WordForm("אַך", "only, surely, nevertheless"), ZERO),
        new Word(new WordForm("בַּעַל", "owner, master, husband, (divine title) Baal", MASCULINE), OK),
        // 160
        new Word(new WordForm("נוּס", "he fled, he escaped"), ZERO),
        new Word(new WordForm("גִּּבּוֹר", "mighty man, hero, warrior", MASCULINE), ZERO)
            .addForm(new WordForm("גִּּבּוֹר", "mighty", ADJECTIVE)),
        // 156
        new Word(new WordForm("שָׂמַח", "he rejoiced, he was glad"), ZERO),
        // 153
        new Word(new WordForm("צָפוֹן", "north, northern", FEMININE), ZERO),
        new Word(new WordForm("כָּסָה", "he covered"), ZERO),
        // 151
        new Word(new WordForm("נֶגֶד", "opposite, in front of"), ZERO),
        // 150
        new Word(new WordForm("נָגַע", "he touched, struck, escaped"), ZERO),
        // 149
        new Word(new WordForm("עֵדָה", "congregation, assembly", FEMININE), ZERO),
        new Word(new WordForm("חָכְמָה", "wisdom", FEMININE), WEAK)
            .addForm(new WordForm("חָכָם", "wise", ADJECTIVE, MASCULINE, SINGULAR))
            .addForm(new WordForm("חֲכָמִים", "wise", ADJECTIVE, MASCULINE, PLURAL))
            .addForm(new WordForm("חֲכָמָה", "wise", ADJECTIVE, FEMININE, SINGULAR))
            .addForm(new WordForm("חֲכְמוֹת", "wise", ADJECTIVE, FEMININE, PLURAL)),
        // 148
        new Word(new WordForm("שָׁבַר", "he broke (up), smashed"), ZERO),
        new Word(new WordForm("שָׂנֵא", "he hated"), ZERO),
        // 147
        new Word(new WordForm("שְׁמֹנֶה", "eight", MASCULINE), ZERO)
            .addForm(new WordForm("שְׁמֹנִים", "eighty")),
        // 146
        new Word(new WordForm("נָסַע", "he pulled out, pulled up, set out, started out, departed, journeyed, marched"), ZERO),
        new Word(new WordForm("הִלֵּל", "he praised – הָלַל", PIEL), ZERO),
        // 144
        new Word(new WordForm("רָדַף", "he pursued, followed after, persecuted"), ZERO),
        // 143
        new Word(new WordForm("חָנָה", "he declined, camped, lay seige to"), ZERO),
        // 142
        new Word(new WordForm("נִשְׁחַת", "he was corrupt, spoiled", NIPHAL), ZERO)
            .addForm(new WordForm("שִׁחֵת", "he was spoiled, wiped out, ruined", PIEL))
            .addForm(new WordForm("הִשְׁהִית", "he destroyed", HIPHIL)),
        // 141
        new Word(new WordForm("אָז", "then, since, before"), ZERO),
        new Word(new WordForm("יַיִן", "wine", MASCULINE), ZERO),
        new Word(new WordForm("יָמִין", "right hand, south", FEMININE), ZERO),
        new Word(new WordForm("כְּמוֹ", "like, as"), ZERO),
        // 140
        new Word(new WordForm("נוּחַ", "he rested, settled down"), ZERO)
            .addForm(new WordForm("הֵנִיחַ", "he gave rest to, he set down", HIPHIL)),
        // 139
        new Word(new WordForm("שֶׁ", "who, whom, that, which (relative pronoun), prefixed"), ZERO),
        new Word(new WordForm("מִשְׁכָּן", "dwelling place, tabernacle", MASCULINE), ZERO),
        new Word(new WordForm("נְחֹשֶׁת", "copper, bronze", MASCULINE), ZERO),
        // 138
        new Word(new WordForm("סוּס", "horse", MASCULINE), OK)
            .addForm(new WordForm("סוּסִים", "horses", MASCULINE, PLURAL)),
        // 137
        new Word(new WordForm("נַחַל", "stream, wadi", MASCULINE), ZERO),
        // 135
        new Word(new WordForm("כִּסֵּא", "chair, throne", MASCULINE), ZERO),
        new Word(new WordForm("הֵחֵל", "he began – חָלַל", HIPHIL), ZERO)
            .addForm(new WordForm("נִחָל", "he was defiled – חָלַל", NIPHAL))
            .addForm(new WordForm("חִלֵּל", "he polluted, profaned – חָלַל", PIEL)),
        // 134
        new Word(new WordForm("שֶׁמֶשׁ", "sun", MASCULINE), ZERO),
        new Word(new WordForm("זָבַח", "he slaughtered, sacrificed"), ZERO),
        new Word(new WordForm("פָּנָה", "he turned"), ZERO),
        new Word(new WordForm("עֶרֶב", "evening, sunset", MASCULINE), ZERO),
        // 133
        new Word(new WordForm("קָבַר", "he buried"), ZERO),
        new Word(new WordForm("אַף", "also, indeed, even"), ZERO),
        new Word(new WordForm("פֶּן–", "lest, otherwise"), ZERO),
        new Word(new WordForm("פַּר", "bull, ox, steer", MASCULINE), ZERO),
        new Word(new WordForm("שָׁאַר", "he remained, was left over, survived"), ZERO),
        new Word(new WordForm("שָׁכַן", "he settled, abode, dwelt, inhabited"), ZERO),
        new Word(new WordForm("חוֹמָה", "wall", FEMININE), ZERO),
        // 131
        new Word(new WordForm("חֹק", "statute, appointed time, portion", MASCULINE), ZERO),
        // 130
        new Word(new WordForm("נָשִׂיא", "chief, leader, prince", MASCULINE), ZERO),
        // 127
        new Word(new WordForm("אֶמֶת", "truth, fidelity", FEMININE), WEAK),
        new Word(new WordForm("קָבַץ", "he collected, gathered, assembled"), ZERO),
        // 126
        new Word(new WordForm("כֹּחַ", "strength, power", MASCULINE), ZERO),
        new Word(new WordForm("עֶצֶם", "bone, skeleton", FEMININE), ZERO),
        // 125
        new Word(new WordForm("בּוֹשׁ", "he was ashamed"), ZERO),
        new Word(new WordForm("נָגַשׁ", "he drew near, approached"), ZERO),
        new Word(new WordForm("חֵמָה", "wrath, heat, poison", FEMININE), ZERO),
        new Word(new WordForm("חֲצִי", "half, middle", MASCULINE), ZERO),
        // 124
        new Word(new WordForm("חָשַׁב", "he thought, considered, devised, planned, valued, esteemed"), ZERO),
        // 123
        new Word(new WordForm("קָהָל", "assembly, community, crowd", MASCULINE), ZERO),
        // 121
        new Word(new WordForm("לָכַד", "he took, captured, caught, seized"), ZERO),
        // 120
        new Word(new WordForm("אוֹר", "light, daylight, sunshine", MASCULINE), ZERO),
        new Word(new WordForm("רֶכֶב", "chariot, upper millstone", MASCULINE), ZERO),
        new Word(new WordForm("בְּכֹר", "firstborn", MASCULINE), ZERO),
        // 119
        new Word(new WordForm("יָשָׁר", "straight, right (correct, not direction)", MASCULINE, ADJECTIVE), ZERO),
        new Word(new WordForm("פְּרִי", "fruit, offspring", MASCULINE), ZERO),
        new Word(new WordForm("נָהָר", "river, stream", MASCULINE), ZERO),
        // 118
        new Word(new WordForm("פַּעַם", "beat (noun), foot, anvil, time (as in music, keeping time)", FEMININE), ZERO),
        new Word(new WordForm("תּוֹעֵבָה", "abomination, abhorence, offensive thing", FEMININE), ZERO),
        new Word(new WordForm("בָּטַח", "to trust, be confident, rely upon"), ZERO),
        // 117
        new Word(new WordForm("יָטַב", "he was well, it went well with, it was pleasing"), ZERO),
        new Word(new WordForm("שָׁפַך", "he poured, spilt, shed (blood)"), ZERO),
        new Word(new WordForm("לָשׁוֹן", "tongue, language", MASCULINE, FEMININE), ZERO),
        new Word(new WordForm("שָׂרַף", "he completely burned, destroyed"), ZERO),
        // 115
        new Word(new WordForm("קִטֵּר", "he made sacrifices smoke (he offered a burned sacrifice) - קָטַר", PIEL), ZERO)
            .addForm(new WordForm("הִקְטִיר", "he made sacrifices smoke, he caused to smoke (in worship) - קָטַר", HIPHIL)),
        // 114
        new Word(new WordForm("בָּכָה", "he wept (in grief or joy)"), ZERO),
        new Word(new WordForm("מִגְרָשׁ", "common land, open land, pasture", MASCULINE), ZERO),
        // 113
        new Word(new WordForm("שֶׁקֶר", "deception, lie, disappointment", MASCULINE), ZERO),
        // 112
        new Word(new WordForm("לָבַשׁ", "he put on a garmet, he clothed"), ZERO),
        new Word(new WordForm("בִּלְתּי", "not (with infinitive), except"), ZERO)
            .addForm(new WordForm("לְבִלְתּי", "not (with infinitive)")),
        new Word(new WordForm("חָשַׁב", "he thought, accounted"), ZERO),
        new Word(new WordForm("עַמּוּד", "pillar, column", MASCULINE), ZERO),
        // 111
        new Word(new WordForm("שַׁבָּת", "Sabbath, rest period", MASCULINE), OK),
        new Word(new WordForm("הוֹדוּ", "they praised, gave thanks - " + "יָדָה" + " - he cast", HIPHIL, PERFECT, THIRD_PERSON, PLURAL), ZERO),
        // 110
        new Word(new WordForm("עָפָר", "dry earth, dust", MASCULINE), ZERO),
        // 109
        new Word(new WordForm("רַק", "only, still, but, however"), ZERO),
        new Word(new WordForm("כָּנָף", "wing, edge (uses dual for wings, standard feminine plural for edges)", FEMININE), ZERO),
        // 108
        new Word(new WordForm("נִחַם", "he was sorry, moved to pity, had compassion", NIPHAL), ZERO)
            .addForm(new WordForm("נִחַם", "he comforted, consoled", PIEL)),
        // 107
        new Word(new WordForm("כֶּבֶשׂ", "lamb, sheep", MASCULINE), ZERO),
        // 106
        new Word(new WordForm("בָּמָח", "(cultic) high place, hill", MASCULINE), ZERO),
        new Word(new WordForm("נוֹתַר", "he was left over, he remained - יָתַר", NIPHAL), ZERO)
            .addForm(new WordForm("הוֹתִיר", "he left - יָתַר", HIPHIL)),
        // 104
        new Word(new WordForm("תָּמִיד", "continually"), ZERO),
        new Word(new WordForm("גָּאַל", "he redeemed, delivered, acted as kinsman, avenged"), ZERO),
        new Word(new WordForm("בַּעַד", "behind, through"), ZERO),
        new Word(new WordForm("חֻקָּח", "statute, ordinance", MASCULINE), ZERO)
            .addForm(new WordForm("חֻקּוֹת", "statutes, ordinances", MASCULINE, PLURAL)),
        new Word(new WordForm("רָץ", "he ran רוּץ"), ZERO),
        // 102
        new Word(new WordForm("כִּפֶּר", "he covered over, pacified, made propitiation", PIEL), ZERO),
        new Word(new WordForm("שָׁכַח", "he forgot"), ZERO),
        // 101
        new Word(new WordForm("רָעָב", "famine, hunger", MASCULINE), ZERO),
        new Word(new WordForm("רֹחַב", "breadth, width", MASCULINE), ZERO),
        new Word(new WordForm("מעַט", "a little, a few"), ZERO),

        // 100
        new Word(new WordForm("יַעַן", "on account of"), ZERO)/*,

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
        new GrammarRule("Alphabet:\n" +
            "אבגדהוזחטיכלמנסעפצקרשׂשׁת" + "\n" +
            "Gutturals:  אעהח"),

        new GrammarRule("Vowels:\n" +
            "              a     e      i    o     u\n " +
            "long         " + " ָ      ֵ           ֹ      " + "\n" +
            "short        " + " ַ      ֶ      ִ     ָ      ֻ " + "\n" +
            "reduced      " + " ֲ      ֱ           ֳ       "),

        new GrammarRule("Rules of Syllabification\n" +
          "  1. Every syllable must begin with one consonant and have only one vowel.\n" +
          "  2. Syllables are either open or closed.  Open end in a vowel, closed in a consonant.\n" +
          "  Hebrew words are usually accented on the last syllable.\n" +
          "  3. Syllable classification\n" +
          "     a. Tonic: accented syllable (the one with the “tone”) דָבָר second syllable is tonic\n" +
          "     b. Pretonic: syllable immediately before the tonic; first syllable above\n" +
          "     c. Propretonic: syllable before the pretonic\n" +
          "  4. Dagesh Forte letters count as two consonants for the purpose of syllabification."),

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
          "   * A Schewa at the end of a word is silent. כָּתַבְתְּ\n" +
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
          "Feminine Dual: תַיִם or same as masculine\n" +
          "Exceptions to Gender Ending Rules\n" +
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
          "    Nouns with vowel letters do not experience propretonic reduction.\n" +
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
            " * May be spelled with Qamets before monosyllabic words or words with initial accent צֹאן becomes וָצֹאן\n" +
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
            "   * When the first letter is ח there is not usually vowel lengthening.\n" +
            " * Special uses beyond \"from\"\n" +
            "   * Comparative use: applied to adjective to make it comparative\n" +
            "     e.g. טוֹבָה חָכְמָה מִזָּהָב wisdom is better than gold\n" +
            "   * Superlative use: used with כּל to express superlative\n" +
            "     e.g. עָרוּם מִכֹּל חַיַּת הַשָּׂדֶה the most clever living thing of the field\n" +
            "   * Partitive use: Can mean a part of something: מֵהָאֲנָשִׁים some of the men"),

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
            "   is applied.\n" +
            " * Many monosyllabic nouns add י to their stem before a pronominal suffix.  Can be\n" +
            "   distinguished in the singular (type 1) by the hireq before the י\n" +
            " * The preposition כְּ changes to כָּמוֹ in singular and first person plural when\n" +
            "   taking a pronominal suffix.\n" +
            " * The preposition מִן changes to מִמֶ in singular and first person plural when\n" +
            "   taking a pronominal suffix.\n"),

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
            "   pronominal suffix or is a proper noun.\n" +
            " * Adjectives that modify any noun in the chain come after the chain.  Number and\n" +
            "   gender of the adjective can sometimes determine which noun it modifies, sometimes\n" +
            "   you must use context.  This applies to demonstratives adjectives (this, that) as well.\n" +
            " * Substantive adjectives functioning as a noun can form part of the construct chain.\n" +
            " * Inseparable prepositions can be attached to construct nouns.\n" +
            " * A noun can be made superlative by placing it in a construct chain\n" +
            "   with the construct noun singular and the absolute noun plural and definite:\n" +
            "   e.g. קֹדֶשׁ הַקֱּדָשִׁים the holy of holies, or the most holy [place]."),

        new GrammarRule("Spelling in construct state:\n" +
            " * A construct noun surrenders its primary accent.  A construct chain is pronounced\n" +
            "   as a single word, with the accent on the absolute noun.  This is sometimes\n" +
            "   marked with a maqqef (-).\n" +
            " * Masculine plural and both dual endings change to" + " ֵי " + " e.g. אֱלֹהִים changes to אֱלֹהֵי \n" +
            " * Vowel reduction:\n" +
            "   * Qamets (and sometimes tsere) change to patach in a final closed syllable:\n" +
            "     e.g. מִשְׁפָּט changes to מִשְׁפַּט\n" +
            "   * Qamets or tsere change to vocal shewa in open, unaccented syllable:\n" +
            "     (or a hateph vowel under a gutteral): נָבִִיא changes to נְבִיא \n" +
            " * Feminine singular nouns ending in" + " ָה " + "changes to" + " ַת " + "\n" +
            "   e.g. תּוֹרָה becomes תּוֹרַת\n" +
            " * Some monosyllabic nouns add a hireq yod in the contruct state."),

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
            " * Cohortative: wish, request, or command, can express purpose or result, first person only\n" +
            " * Jussive:  mild command or strong wish, third person only\n" +
            " * Infinitive construct: like an English infinitive, a verbal noun.\n" +
            " * Infinitive absolute: used with other verbs to emphasize or intensify action or to\n" +
            "   express contemporaneous action.  Can be used as an imperative.\n" +
            " * Participle:  verbal adjective."),

        // TODO need to align these so they look better; probably don't need every declination; add some examples from imperfect.
        new GrammarRule("Stative verbs often have tsere (..) or holem (o) in second vowel.\n" +
            "In the imperfect they have pathach (_) instead of holem in the second vowel.\n" +
            "           Tsere    Holem    Strong\n" +
            "           Stative  Stative    Verb\n" +
            "Perfect        " + "קָטַל     קָטֹן      כָּבֵד" + "\n" +
            "Imperfect      " + "יִקְטֹל    יִקְטַן    יִכְבַּד" + "\n" +
            "No idea why the dagesh jumps from consontant כ to ב in כבד imperfect."),

        new GrammarRule("Strong verbs have three strong consonants.  Weak verbs classified as follows:\n" +
            " * I-Guttural\n" +
            " * II-Guttural\n" +
            " * III-Guttural, broken into III-ח/ע, III-א, and III-ה (really III-י but י changes to ה in many forms)\n" +
            " * I-י\n" +
            " * I-נ\n" +
            " * Doubly weak (two of the above)\n" +
            " * Biconsonantal (also called hollow or II-ו/י) these drop middle letter in perfect\n" +
            " * Geminate - identical 2nd and 3rd consonants."),

        new GrammarRule("Verb frequencies:  72K total verbs in OT\n" +
            " Qal:       50,699\n" +
            " Hiphil:     9,496\n" +
            " Piel:       6,473\n" +
            " Niphal:     4,138\n" +
            " Hithpael:     842\n" +
            " Pual:         423\n" +
            " Hophal:       396\n"),

        new GrammarRule("Uses of הִנֵּה:\n" +
            "* add emphasis or stress (demonstrative interjection):\n" +
            "  " + "הִנֵּה עֵיר יְהוָה אֶל–יְרֵאָיו" + "  Behold, the eye of the LORD is upon those who fear him\n" +
            "* indicate the immediate presence of someone or something with an emphasis on\n" +
            "  immediacy or urgency:\n" +
            "  " + "וַהִנֵּה אָנֹכִי עִמָּך" + "  And he said, behold, here I am\n" +
            "* may be used to introduce a fact or situation on which a subsequent statement is based\n" +
            "  Behold, I have listened to all that you have said to me and [therefore] I have\n" +
            "  caused a king to reign over you"),

        // TODO check the thing about the dagesh, I'm not sure that's right
        new GrammarRule("Waw consecutive is וַ with dagesh in following letter.\n" +
            "Imperfect can still take non-consecutive waw to mean simple and, וְ\n" +
            "Waw consecutive imperfect chain can start with וַיְהִי (and it was) meaning 'after'\n" +
            "Waw consecutive perfect chain can start with וְהִיִה 'and it will be'\n" +
            "Waw consecutive perfect used after imperative to continue imperative chain\n" +
            "    and should be translated as imperative\n" +
            "Perfect prefixed with waw in chain of perfects NOT waw consecutive"),

        new GrammarRule("Imperative is not negated, instead use negative with imperfect\n" +
            "To express permanent prohibition: לֹא plus imperfect\n" +
            "To express temporary prohibition: אַל plus imperfect.\n" +
            "Cohortative and jussive negated with אַל, a milder form of prohibition than לֹא"),

        new GrammarRule("Imperative sometimes followed by נָא, which can be translated \"please\""),

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

        new GrammarRule("Pronominal suffixes on imperfect weak III-ה verbs drop the ה\n:" +
            "יִרְאֶה" + "  +  " + "נָּה" + "  becomes " + "יִרְאֶנָּה" + "  he will see her"),

        new GrammarRule("Pronominal suffixes on imperative same as imperfect except 2ms for is קָטְל instead of קְטְל\n\n" +
            "2fs imperative with pronominal suffix very rare and 2fp not attested\n" +
            "קָטְלֵ הוּ" + "      kill him!\n"),

        new GrammarRule("Infinitives (both construct and absolute) are verbal nouns\n" +
            "Infinitive is negated with לְבִלְתּי "),


        new GrammarRule("Infinitive construct functions much like the English infinitive\n" +
            "Infinitive constructs can take pronominal suffixes.  These suffixes can serve as the\n" +
            "'subject' or object of the infinitive, e.g. קָטְלוֹ can mean 'his killing' or 'killing him'"),

        new GrammarRule("Infinitive construct\n" +
            "* with ל \n" +
            "  * can indicate purpose, intention, or result:\n    " +
            "וַיִּקַּה אֶת–הַמַּאֲכֶלֶת ––לִשְׁחט—— אֶת–בּנו  " +
            "\n    And he took the _in order to slaughter_ his son\n" +
            "  * can be inceptive (often with היה), meaning it indicates something that is about to happen:\n    " +
            "וַיְהִי הַשֶּׁמֶשׁ ––לָבוֹא––  " + "    The sun was about _to set_\n" +
            "  * can be used to denote sequence of verbal actions or obligation or necessity.  These are less common.\n" +
            "* with or without ל\n" +
            "  * can act as a verbal noun:  " + "טוֹב ––לְהֹדוֹת–– לַיהוָה " + "It is good _to praise_ the LORD\n" +
            "  * can be complementary.  That is, it works to explain, clarify, or complement a preceding action or statement.\n" +
            "    In such cases the best English translation is often a finite verb:\n    " +
            "וְשָׁמַרְתָּ אֶת–מִצְוֹת יְהוָה אֱלֹהֶיךָ ––לָלֶכֶת–– בִּדְרָכָיו  " +
            "\n    And you shall observe the commandments of the LORD your God _by walking_ in his ways.\n" +
            "* with בְּ or כְּ and often a pronominal suffix indicate temporality (while, when).  Often these are paired \n" +
            "  with וַיְהִי (and he was) or וְהָיָה (and he will be) (remember waw consecutive) to indicate perfect or imperfect.\n  " +
            "וַיְהִ בִּהְיוֹתָם בַּשָּׂדֶה  " + "When they were in the field"),

        new GrammarRule("Infinitive absolute is a verbal noun but has no direct English equivalent.\n" +
            "Common uses of infinitive absolute:\n" +
            "* Emphatic:  will immediately precede (rarely follow) a im/perfect of the same\n" +
            "  root to emphasize the verb:" + "  אָמוֹר אָמַרְתִּי " + "I have surely said\n" +
            "* Imperatival:  can stand alone and function as imperative:\n" +
            "  זָכוֹר אֶת–הַיּוֹם הַזֶּה " + "  Remember this day!\n" +
            "* Contemporaneous action: two infinitives absolutes and a im/perfect of the same\n" +
            "  root as one infinitive expresses contemporary action:\n" +
            "  וַיֵּלֶך הָלוֹך וְאָכֹל " + " and they walked, eating as they went\n" +
            "* Complementary: may complement the main verb and carry the temporal value\n" +
            // TODO figure out the examples
            "  of that verb (no example given because I don't understand the examples)"),

        // I'm not drunk, this spacing makes it come out right in the display

        new GrammarRule("Qal weak verbs:  Perfect\n" +
            "Strong              " + "קָטַל" + "\n" +
            "III-" + "מָצָא               א" + "\n" +
            "III-" + "בָּנָה               ה" + "\n" +
            "Biconsonental        " + "קָם" + "\n" +
            "Geminate            " + "סָבַב" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperfect\n" +
            "Strong              " + "יִקְטֹל" + "\n" +
            "I-" + "יֶאֱסֹר                 א" + "\n" +
            "I-" + "יֹאמַר                 א" + "\n" +
            "I-" + "יֶחֱזַק                 ח" + "\n" +
            "I-" + "יֵלֵך                  י" + "\n" +
            "I-" + "יִירַשׁ                 י" + "\n" +
            "I-" + "יִפֹּל                  נ" + "\n" +
            "I-" + "יִקַּח                  נ" + "\n" +
            "I-" + "יַעֲמֹד                 ע" + "\n" +
            "II-Gutteral         " + "יִבְחַר" + "\n" +
            "III-" + "יִמְצָאָ               א" + "\n" +
            "III-" + "יִבְנֶה               ה" + "\n" +
            "III-" + "יִשְׁלַח             ע/ח" + "\n" +
            "Biconsonental       " + "יָקוּם" + "\n" +
            "Biconsonental       " + "יָבוֹא" + "\n" +
            "Biconsonental       " + "יָשִׂים" + "\n" +
            "Geminate             " + "יָסֹב" + "\n" +
            "Geminate             " + "יֵתַם" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperative\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "I-" + "אֱמֹר                 א" + "\n" +
            "I-" + "חֲזַק                 ח" + "\n" +
            "I-" + "לֵך                  י" + "\n" +
            "I-" + "רַשׁ                  י" + "\n" +
            "I-" + "נְפֹל                 נ" + "\n" +
            "I-" + "קַח                  נ" + "\n" +
            "II-Gutteral         " + "בְּחַר" + "\n" +
            "III-" + "מְצָא               א" + "\n" +
            "III-" + "בְּנֵה               ה" + "\n" +
            "III-" + "שְׁלַח             ע/ח" + "\n" +
            "Biconsonental       " + "קוּם" + "\n" +
            "Geminate             " + "סֹב" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs: Infinitive Construct\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "I-" + "אֱמֹר                 א" + "\n" +
            "I-" + "לֶכֶת                 י" + "\n" +
            "I-" + "עֲמֹד                 ע" + "\n" +
            "II-Gutteral         " + "בְּחֹר" + "\n" +
            "III-" + "מְצֹא               א" + "\n" +
            "III-" + "בְּנוֹת              ה" + "\n" +
            "III-" + "שְׁלֹחַ             ע/ח" + "\n" +
            "Biconsonental       " + "קוּם" + "\n" +
            "Biconsonental       " + "בוֹא" + "\n" +
            "Biconsonental       " + "שׂים" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Infinitive Absolute\n" +
            "Strong              " + "קָטוֹל" + "\n" +
            "III-" + "בָּנֹה                ה" + "\n" +
            "Biconsonental        " + "קוֹם" + "\n" +
            "Biconsonental        " + "בוֹא" + "\n" +
            "Biconsonental        " + "שׂוֹם" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Participle\n" +
            "Strong              " + "קֹטֵל" + "\n" +
            "III-" + "בֹּנֶה               ה" + "\n" +
            "III-" + "שֹׁמֵעַ             ע/ח" + "\n" +
            "Biconsonental        " + "קָם" + "\n" +
            ""),

    new GrammarRule("Participle יֵשׁ:\n" +
            "* Is not inflected\n" +
            "* Can express existence: יֵשׁ מֶלֶך there is a king, or a king is\n" +
            "* Followed by preposition לְ indicates possession: יֶשׁ–לִי תִקְוָה I have hope"),

        new GrammarRule("Participle אֵין (sometimes spelled אַיִן)\n" +
            "* Is not inflected\n" +
            "* Can take pronominal suffixes\n" +
            "* can express non-existence: אֵין לוֹ בֵּן he had no son\n" +
            "* Can negate a verbless clause: אֵינָם יְרֵאִים אֶת–יְהוָה They do not fear the LORD"),

        new GrammarRule("Participles can be\n" +
            " * attributive, meaning they can directly modify a noun:\n    " +
            "הָעָם הֵיֹּשֵׁב בָּאָרֶץ " +
            " the people dwelling [or who dwell] in the land\n" +
            " * predicative, meaning they assert or predicate something about the noun:\n    " +
            "וְהָהָר בֹּעֵר בָּאֵשׁ " + "  And the mountain was burning with fire\n" +
            " * substantive, meaning they act as a noun.  In this situation they can take a direct object, be part of a\n" +
            "   construct chain, or take a pronominal suffix.\n    " +
            "הַיּוֹשֶׁבֶת בַּגַּנִּים " + "the one who dwells in the gardens"),

        new GrammarRule("Qal passive participle:\n" +
            "             Singular         Plural\n" +
            "Masculine        " + "קְטוּלִים         קָטוּל" + "\n" +
            "Feminine        " + "קְטוּלוֹת         קְטוּלָה" + "\n\n" +
            "All but III-ה follow the strong pattern\n" +
            "III-ה verb:\n" +
            "                 " + "בְּנוּיִים         בָּנוּי" + "\n" +
            "                " + "בְּנוּיוֹת         בְּנוּיָה"),

        new GrammarRule("Participles, because they behave like nouns, can take a definite article,\n" +
            "prepositional prefix (ל, ב, כ), or pronominal suffix.  They may also occur in a construct chain in the construct state."),

        new GrammarRule("Standard Hebrew word order is VSO\n" +
            "In the object section, direct and indirect object can come in any order\n" +
            "Indirect object usually marked with לְ or -אֶל"),

        new GrammarRule("Verb tense and sentance order:\n" +
            "* When a perfect verb is describing a completed action it is usually proceeded\n" +
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

        new GrammarRule("ו:\n" +
            "* Conjunctive is usually prefixed to a verb and links clauses sequentially, temporally, logically, or consequentially.\n" +
            "* Disjunctive is prefixed to a non-verb and is non-sequential; it introduces some kind of break in the narrative.\n" +
            "  Meaning can be:\n" +
            "  * parenthetical, provides a parenthetical explanation or comment:\n    " +
            "וְהֵם לֹא יָדְעוּ כִּי שֹׁמֵעַ יוֹסֵף כִּי הַמֵּלִיץ בֵּינֹתָם" +
            "\n    Now they did not know that Joseph was understanding them, for there was an interpreter between them.\n" +
            "  * circumstantial, gives circumstantial information\n    " +
            "וַיְהִי כְּהַיּוֹם הַזֶּה וַיָּבֹא הַבַּיְתָה לַעֲשׂוֹת מְלַאכְתּוֹ => וְאֵין אִישׁ מֵאַנְשֵׁי חַבַּית שָׁם בַּבָּיִת" +
            "\n    And one day, he went into the house to do his work, => and none of the household servants were there in the house\n" +
            "  * contrastive, gives a contrasting idea\n    " +
            "וַיִּשַׁע יְהוָה אֶל–הֶבֶל וְאֶל–מִנְחָתוֹ => וְאֶל–קַיִן וְאֶל–מִנְחָתוֹ לֹא שָׁעָה" +
            "\n    The LORD looked favorably on Abel and his offering, => but on Cain and his offering he did not look favorably\n" + "" +
            "  * introductory, begins a new narrative or introduces a new idea or theme\n    " +
            "וְהַנָּחָשׁ הָיָה עָרוּם מִכֹּל חַיַּת הַשָּׂדֶה אֲשֶׁר עָשָׂה יְהוָה אֱלֹהִים" +
            "\n    Now the serpent was more crafty than any creature that the LORD God had made"),

        new GrammarRule("Adverbs of time: עַתָּה (now), אָז (then), טֶרֶם (also as בְּטֶרֶם) (before).\n" +
            "Both עַתָּה and אָז can be followed by an imperfect that should be translated as a perfect.\n" +
            "Adverbs of place: פֹּה, חֵנָּח (here), שָׁם (there), הוּץ (outside).\n" +
            "Adverbs of degree: מְאֹד (very), עוֹד (again), תָּמִיד (continually).\n" +
            "Adverbs of manner: יַחְדָּו (together), פִּתְאֹם (suddenly)."),

        new GrammarRule("Nipal can be passive, reflexive, reciprocal (they heard each other),\n" +
            "or middle where no agency is specified and the subject and object are the same (the gate opened)"),

        new GrammarRule("Niphal weak verbs:  Perfect\n" +
            "Strong          " + "נִקְטַל" + "\n" +
            "III-" + "נִמְצָא           א" + "\n" +
            "III-" + "נִבְנָה           ה" + "\n" +
            "II-Gutteral     " + "נֶעֱזַב" + "\n" +
            "I-" + "נִצַּל              נ" + "\n" +
            "I-" + "נוֹשַׁב             י"),

        new GrammarRule("Niphal weak verbs:  Imperfect \n" +
            "Strong          " + "יִקָּטֵל" + "\n" +
            "III-" + "יִמָּצֵא           א" + "\n" +
            "III-" + "יִבָּנֶה           ה" + "\n" +
            "II-Gutteral     " + "יֵעָזֵב" + "\n" +
            "I-" + "יִנָּצֵל             נ" + "\n" +
            "I-" + "יִוָּשֵׁב             י"),

        new GrammarRule("Niphal weak verbs:  Imperative\n" +
            "Strong          " + "הִקְּטֵל" + "\n" +
            "III-" + "הִמָּצֵא           א" + "\n" +
            "III-" + "הִבָּנֵה           ה" + "\n" +
            "II-Gutteral     " + "הֵעָזֵב" + "\n" +
            "I-" + "הִנָּצֵל             נ" + "\n" +
            "I-" + "הִוָּשֵׁב             י"),

        new GrammarRule("Niphal weak verbs:  Infinitive Construct\n" +
            "Strong           " + "הִקָּטֵל" + "\n" +
            "III-" + "הִמָּצֵא            א" + "\n" +
            "III-" + "הִבָּנוֹת           ה" + "\n" +
            "II-Gutteral      " + "הֵעָזֵב" + "\n" +
            "I-" + "הִנָּצֵל              נ" + "\n" +
            "I-" + "הִוָּשֵׁב              י"),

        new GrammarRule("Niphal weak verbs:  Infinitive Absolute\n" +
            "Strong           " + "נִקְטוֹל" + "\n" +
            "Strong           " + "הִקָּטוֹל" + "\n" +
            "III-" + "נִמְצוֹא            א" + "\n" +
            "III-" + "נִבְנֹה             ה" + "\n" +
            "III-" + "הִבָּנֵה             ה" + "\n" +
            "II-Gutteral      " + "נַעֳזוֹב" + "\n" +
            "II-Gutteral      " + "הֵעָזוֹב" + "\n" +
            "I-" + "הִנָּצֵל               נ" + "\n" +
            "I-" + "נִצּוֹל               נ" + "\n" +
            "I-" + "נוֹשָׁב               י"),

        new GrammarRule("Niphal weak verbs:  Participle\n" +
            "Strong           " + "נִקְטָל" + "\n" +
            "III-" + "נִמְצָא            א" + "\n" +
            "III-" + "נִבְנֶה            ה" + "\n" +
            "II-Gutteral      " + "נֶעֱזָב" + "\n" +
            "I-" + "נִצָּל               נ" + "\n"),

        new GrammarRule("Meaning of the Piel steam:\n" +
            "  * intensive - can intensify the meaning of the qal stem\n" +
            "  * factitive - turns an intransitive verb transitive\n" +
            "    e.g. " + "קָדַשׁ" + " he is holy, " + "קִדַּשׁ" + " he sanctified\n" +
            "  * denominitive - taking a noun or adjective stem and making it a verb\n" +
            "    e.g. " + "דָּבָר" + " word " + "דִּבֵּר" + " he spoke\n" +
            "    In this case the verb does not have an intensive meaning\n" +
            "  * iterative - often occurs with physical movement"),

        new GrammarRule("Piel weak verbs:  Perfect\n" +
            "Strong         " + "קֵטֵּל" + "\n" +
            "III-" + "שִׁלַּח        ע/ח" + "\n" +
            "III-" + "מִצֵא          א" + "\n" +
            "III-" + "גִּלָּה          ה" + "\n" +
            "Geminate       " + "הֵלֵּל" + "\n" +
            "II-Gutteral    " + "נִחַם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "בֵּרֵך" + " (compensatory lengthening)\n"),

        new GrammarRule("Piel weak verbs:  Imperfect\n" +
            "Strong         " + "יְקַטֵּל" + "\n" +
            "III-" + "יְשַׁלַּח        ע/ח" + "\n" +
            "III-" + "יְמַצֵּא          א" + "\n" +
            "III-" + "יְגַלֶּה          ה" + "\n" +
            "Geminate       " + "יְהַלֵּל" + "\n" +
            "II-Gutteral    " + "יְנַחֵם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "יְבָרֵך" + " (compensatory lengthening)"),

        new GrammarRule("Piel weak verbs:  Imperative\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "III-" + "שַׁלַּח        ע/ח" + "\n" +
            "III-" + "מַצֵּא          א" + "\n" +
            "III-" + "גַּלֵה          ה" + "\n" +
            "Geminate       " + "הַלֵּל" + "\n" +
            "II-Gutteral    " + "נַחֵם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "בָּרֵך" + " (compensatory lengthening)"),

        new GrammarRule("Piel weak verbs: Infinitive Construct\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "III-" + "שַׁלַּח        ע/ח" + "\n" +
            "III-" + "מַצֵּא          א" + "\n" +
            "III-" + "גַּלּוֹת          ה" + "\n" +
            "Geminate       " + "הַלֵּל" + "\n" +
            "II-Gutteral    " + "נַחֵם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "בָּרֵך" + " (compensatory lengthening)"),

        new GrammarRule("Piel weak verbs:  Infinitive Absolute\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "III-" + "שַׁלֵּחַ        ע/ח" + "\n" +
            "III-" + "מַצֵּא          א" + "\n" +
            "III-" + "גַּלֵּה          ה" + "\n" +
            "Geminate       " + "הַלֵּל" + "\n" +
            "II-Gutteral    " + "נַחֵם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "בָּרֵך" + " (compensatory lengthening)"),

        new GrammarRule("Piel weak verbs: Participle\n" +
            "Strong         " + "מְקַטֵּל" + "\n" +
            "III-" + "מְשַׁלֵּחַַ        ע/ח" + "\n" +
            "III-" + "מְמַצֵּא          א" + "\n" +
            "III-" + "מְגַלֶּה          ה" + "\n" +
            "Geminate       " + "מְהַלֵּל" + "\n" +
            "II-Gutteral    " + "מְנַחֵם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "מְבָרֵך" + " (compensatory lengthening)"),

        new GrammarRule("Pual steam is passive counterpart of Piel, indicates intensive action in passive voice"),

        new GrammarRule("Pual weak verbs:  Perfect\n" +
            "Strong         " + "קֻטַּל" + "\n" +
            "III-" + "מֻצָא          א" + "\n" +
            "III-" + "גֻּלָּה          ה" + "\n" +
            "II-Gutteral    " + "נֻחַם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "בֹּרַך" + " (compensatory lengthening)\n" +
            ""),

        new GrammarRule("Pual weak verbs:  Imperfect\n" +
            "Strong         " + "יְקֻטַּל" + "\n" +
            "III-" + "יְמֻצָּא          א" + "\n" +
            "III-" + "יְגֻלֶּה          ה" + "\n" +
            "II-Gutteral    " + "יְנֻחַם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "יְבֹרַך" + " (compensatory lengthening)\n" +
            ""),

        new GrammarRule("Pual weak verbs: Participle\n" +
            "Strong         " + "מְקֻטָּל" + "\n" +
            "III-" + "מְמֻצָּא          א" + "\n" +
            "III-" + "מְגֻלֶּה          ה" + "\n" +
            "II-Gutteral    " + "מְנֻחָם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "מְבֹרָך" + " (compensatory lengthening)\n" +
            ""),

        new GrammarRule("Hiphil stem, most common derived stem.  Meaning can be:\n" +
            "* causative: Causing something to occur: מָלַך he reigned, הִמְלִיך he corronated, he made a king\n" +
            "* simple action: more common in verbs where qal form is not attested in OT\n" +
            "* declarative: the subject declares a certain condition:  רָשַׁע he was guily הִרְשִׁיע he declared someone guilty\n" +
            "* factitive: makes an intransitive verb transitive, similar to piel: גָּדַל to be great הִגְדִיל he made him/her/it great"),

        new GrammarRule("Hiphil weak verbs:\n" +
            "                      Perfect\n" +
            "             Perfect  msc 2 sng\n" +
            "Strong         " + "הִקְטַלְתָּ      הִקְטִיל"+ "\n" +
            "I-Gutteral     " + "הֶעֱמַדְתָּ      הֶעֱמִיד"+ "\n" +
            "III-" + "הִשְׁלַחְתָּ      הִשְׁלִיחַ        ע/ח" + "\n" +
            "III-" + "הִמְצֵאתָ      הִמְצִיא          א" + "\n" +
            "III-" + "הִגְלִיתָ      הִגְלָה           ה" + "\n" +
            "I-" + "הִצַּלְתָּ       הִצִּיל             נ" + "\n" +
            "I-" + "הוֹשַׁבְתָּ      הוֹשִׁיב            י" + "\n" +
            "Biconsonental   " + "הֲקִימוֹתָ     הֵקִים" + "\n"),

        new GrammarRule("Hiphil weak verbs:  Imperfect  \n" +
            "Strong         " + "יַקְטִיל"+ "\n" +
            "I-Gutteral     " + "יַעֲמִיד"+ "\n" +
            "III-" + "יַשְׁלִיחַ        ע/ח" + "\n" +
            "III-" + "יַמְצִיא          א" + "\n" +
            "III-" + "יַגְלֶה           ה" + "\n" +
            "I-" + "יַצִּיל             נ" + "\n" +
            "I-" + "יוֹשִׁיב            י" + "\n" +
            "Biconsonental   " + "יָקִים" + "\n"),

        new GrammarRule("Hiphil weak verbs:\n" +
            "                          Imperative\n" +
            "               Imperative  fem sng\n" +
            "Strong         " + "הַקְטִילי      הַקְטֵל"+ "\n" +
            "I-Gutteral     " + "הַעֲמִידי      הַעֲמֵד"+ "\n" +
            "III-" + "הַשְׁלִיחִי      חַשְׁלַחַ        ע/ח" + "\n" +
            "III-" + "הַמְצִיאִי      הַמְצֵא          א" + "\n" +
            "III-" + "הַגְלֵה           ה" + "        No example given for III-ה imperative feminine singular, I don't know why.\n" +
            "I-" + "הַצִּילִי       הַצֵּל             נ" + "\n" +
            "I-" + "הוֹשִׁיבִי      הוֹשֵׁב            י" + "\n" +
            "Biconsonental   " + "הָקִימִי       הָקֵם" + "\n" +
            ""),

        new GrammarRule("Hiphil weak verbs:  Infinitive Construct\n" +
            "Strong         " + "הַקְטִיל"+ "\n" +
            "I-Gutteral     " + "הַעֲמִיד"+ "\n" +
            "III-" + "הַשְׁלִיחַַ        ע/ח" + "\n" +
            "III-" + "הַמְצִיא          א" + "\n" +
            "III-" + "הַגְלוֹת          ה" + "\n" +
            "I-" + "הַצִּיל             נ" + "\n" +
            "I-" + "הוֹשִׁיב            י" + "\n" +
            "Biconsonental   " + "הָקִים" + "\n"),

        new GrammarRule("Hiphil weak verbs:  Infinitive Absolute\n" +
            "Strong         " + "הַקְטֵל"+ "\n" +
            "I-Gutteral     " + "הַעֲמֵד"+ "\n" +
            "III-" + "הַשְׁלֵחַַַ        ע/ח" + "\n" +
            "III-" + "הַמְצֵא          א" + "\n" +
            "III-" + "הַגְלֵה          ה" + "\n" +
            "I-" + "הַצֵּל             נ" + "\n" +
            "I-" + "הוֹשֵׁב            י" + "\n" +
            "Biconsonental   " + "הָקֵם" + "\n"),

        new GrammarRule("Hiphil weak verbs:  Participle\n" +
            "Strong         " + "מַקְטִיל"+ "\n" +
            "I-Gutteral     " + "מַעֲמִיד"+ "\n" +
            "III-" + "מַשְׁלִיחַַַַ        ע/ח" + "\n" +
            "III-" + "מַמְצִיא          א" + "\n" +
            "III-" + "מַגְלֶה          ה" + "\n" +
            "I-" + "מַצִּיל             נ" + "\n" +
            "I-" + "מוֹשִׁיב            י" + "\n" +
            "Biconsonental   " + "מֵקִים" + "\n"),

        new GrammarRule("Hophal stem, least common derived stem, is causative action in the passive voice (so passive of Hiphil). \n" +
            "It occurs much more frequently in the weak form (250 times) versus strong form (50 times)."),

        new GrammarRule("Hophal weak verbs: Perfect\n" +
            "Strong (u-class)     " + "הֻקְטַל"+ "\n" +
            "Strong (o-class)     " + "הָקְטַל"+ "\n" +
            "I-Gutteral           " + "הָעֳמַד"+ "\n" +
            "III-" + "הָגְלָה                ה" + "\n" +
            "I-" + "הֻצַּל                   נ" + "\n" +
            "I-" + "הוּשַׁב                  י" + "\n" +
            "Biconsonental        " + "הוּקַם" + "\n" +
            "Geminate             " + "הוּסַב"),

        new GrammarRule("Hophal weak verbs:  Imperfect\n" +
            "Strong (u-class)     " + "יֻקְטַל"+ "\n" +
            "Strong (o-class)     " + "יָקְטַל"+ "\n" +
            "I-Gutteral           " + "יָעֳמַד"+ "\n" +
            "III-" + "יָגְלֶהה               ה" + "\n" +
            "I-" + "יֻצַּל                   נ" + "\n" +
            "I-" + "יוּשַׁב                  י" + "\n" +
            "Biconsonental        " + "יוּקַם" + "\n" +
            "Geminate             " + "יוּסַב"),

        new GrammarRule("Hophal weak verbs: Participle\n" +
            "Strong (u-class)     " + "מֻקְטָל"+ "\n" +
            "Strong (o-class)     " + "מָקְטָל"+ "\n" +
            "I-Gutteral           " + "מָעֳמָד"+ "\n" +
            "III-" + "מָגְלֶה                ה" + "\n" +
            "I-" + "מֻצָּל                   נ" + "\n" +
            "I-" + "מוּשָׁב                  י" + "\n" +
            "Biconsonental        " + "מוּקָם" + "\n" +
            "Geminate             " + "מוּסָב"),

        new GrammarRule("Hithpael stem indicates intensive, reflexive or reciprocal action"),

        new GrammarRule("When a verbal root start with צ ,ש ,ס then the ת of the Hithpael prefix will metathesize (switch places) with\n" +
            "the first consonant.  When it is a צ the ת will also transform to a ט.\n" +
            "שָׁמַר" + " becomes " + "הִשְׁתַּמֵּר" + "\n" +
            "צָדֵק" + " becomes " + "הִצְטַדֵּק" + "\n" +
            "Notice how the consonants switch places but not the vowel points.\n" +
            "When the first consonant of the verbal root is ת ,ט ,ד ,ז then the ת of the prefix will assimilate, becoming a dagesh forte\n" +
            "טָמֵּא" + " becomes " + "הִטַּמֵּא"),

        new GrammarRule("Hithpael weak verbs:  Perfect\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "Geminate       " + "הִתְפַּלֵּל" + "\n" +
            "III-" + "הִתְגַּלָּה          ה" + "\n" +
            "II-Gutteral    " + "הִתְנַחֵם"+ "\n" +
            "II-Gutteral    " + "הִתְבָּרֵך"+ "\n"),

        new GrammarRule("Hithpael weak verbs:  Imperfect\n" +
            "Strong         " + "יִתְקַטֵּל"+ "\n" +
            "Geminate       " + "יִתְפַּלֵּל" + "\n" +
            "III-" + "יִתְגַּלֶּה          ה" + "\n" +
            "II-Gutteral    " + "יִתְנַחֵם"+ "\n" +
            "II-Gutteral    " + "יִתְבָּרֵך"+ "\n"),

        new GrammarRule("Hithpael weak verbs:  Imperative\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "Geminate       " + "הִתְפַּלֵּל" + "\n" +
            "III-" + "הִתְגַּלֵּה          ה" + "\n" +
            "II-Gutteral    " + "הִתְנַחֵם"+ "\n" +
            "II-Gutteral    " + "הִתְבָּרֵך"+ "\n"),

        new GrammarRule("Hithpael weak verbs:  Infinitive Construct\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "Geminate       " + "הִתְפַּלֵּל" + "\n" +
            "III-" + "הִתְגַּלּוֹת         ה" + "\n" +
            "II-Gutteral    " + "הִתְנַחֵם"+ "\n" +
            "II-Gutteral    " + "הִתְבָּרֵך"+ "\n"),

        new GrammarRule("Hithpael weak verbs:  Infinitive Absolute\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "Geminate       " + "הִתְפַּלֵּל" + "\n" +
            "II-Gutteral    " + "הִתְנַחֵם"+ "\n" +
            "II-Gutteral    " + "הִתְבָּרֵך"+ "\n"),

        new GrammarRule("Hithpael weak verbs:  Participle\n" +
            "Strong         " + "מִתְקַטֵּל"+ "\n" +
            "Geminate       " + "מִתְפַּלֵּל" + "\n" +
            "III-" + "מִתְגַּלֶּה          ה" + "\n" +
            "II-Gutteral    " + "מִתְנַחֵם"+ "\n" +
            "II-Gutteral    " + "מִתְבָּרֵך"+ "\n")


    );
  }
}
