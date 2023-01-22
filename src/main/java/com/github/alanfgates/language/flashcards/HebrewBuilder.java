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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.github.alanfgates.language.flashcards.Classifier.*;

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
        new Word("קָטַלְתִּי", "I killed", PERFECT, FIRST_PERSON, SINGULAR),
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
        new Word("אֶקְטֹל")
            .addForm("I will kill", QAL, IMPERFECT, FIRST_PERSON, SINGULAR)
            .addForm("let me kill", QAL, COHORTATIVE, SINGULAR),
        new Word("תִּקְטְלִי", "you will kill", QAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יִקְטֹל")
            .addForm("he will kill", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR)
            .addForm("let him kill", QAL, JUSSIVE, MASCULINE, SINGULAR),
        new Word("תִּקְטֹל")
            .addForm("you will kill", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR)
            .addForm("she will kill", QAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR)
            .addForm("let her kill", QAL, JUSSIVE, FEMININE, SINGULAR),
        new Word("נִקְטֹל")
            .addForm("we will kill", QAL, IMPERFECT, FIRST_PERSON, PLURAL)
            .addForm("let us kill", QAL, COHORTATIVE, PLURAL),
        new Word("תִּקְטְלוּ", "you will kill", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תִּקְטֹלְנָה")
            .addForm("you will kill", QAL, IMPERFECT, SECOND_PERSON, FEMININE, PLURAL)
            .addForm("they will kill", QAL, IMPERFECT, THIRD_PERSON, FEMININE, PLURAL)
            .addForm("let them kill", QAL, JUSSIVE, FEMININE, PLURAL),
        new Word("יִקְטְלוּ")
            .addForm("they will kill", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL)
            .addForm("let them kill", QAL, JUSSIVE, MASCULINE, PLURAL),

        // to be - imperfect
        new Word("אֶהְיֶה", "I will be", QAL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תִּהְיֶה")
            .addForm("you will be", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR)
            .addForm("she will be", QAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("יִהְיֶה", "he will be", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("נִהְיֶה", "we will be", QAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תִּהְיוּ", "you will be", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("יִהְיוּ", "they will be", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        // to give - imperfect
        new Word("אֶתֵּן", "I will give", QAL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תִּתֵּן")
            .addForm("you will give", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR)
            .addForm("she will give", QAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("יִתֵּן", "he will give", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("נִתֵּן", "we will give", QAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תִּתְּנוּ", "you will give", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("יִתְּנוּ", "they will give", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        // Qal Imperative
        new Word("קְטֹל")
            .addForm("kill!", QAL, IMPERATIVE, MASCULINE, SINGULAR)
            .addForm("to kill", QAL, INFINITIVE_CONSTRUCT),
        new Word("קִטְלִי", "kill!", QAL, IMPERATIVE, FEMININE, SINGULAR),
        new Word("קִטְלוּ", "kill!", QAL, IMPERATIVE, MASCULINE, PLURAL),
        new Word("קְטֹלְנָה", "kill!", QAL, IMPERATIVE, FEMININE, PLURAL),

        // Qal various odd important ones
        new Word("תֵּן", "give!", QAL, IMPERATIVE, MASCULINE, SINGULAR),
        new Word("קַח", "take!", QAL, IMPERATIVE, MASCULINE, SINGULAR),
        new Word("לֵך", "go/walk!", QAL, IMPERATIVE, MASCULINE, SINGULAR),
        new Word("הֱיֵה", "be!", IMPERATIVE, MASCULINE, SINGULAR),
        new Word("עֲלֵה", "go up!", IMPERATIVE, MASCULINE, SINGULAR),

        // Qal Cohortative
        new Word("אֶקְטְלָה", "let me kill", QAL, COHORTATIVE, SINGULAR),
        new Word("נִקְטְלָה")
            .addForm("let us kill", QAL, COHORTATIVE, PLURAL)
            .addForm("she was killed", NIPHAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),

        // Qal Infinitive Construct
        // See Imperative above
        new Word("נְתֹן", "to give", QAL, INFINITIVE_CONSTRUCT),
        new Word("תֵּת", "to give נתן", QAL, INFINITIVE_CONSTRUCT),
        new Word("לֶכֶת", "to walk הלך", QAL, INFINITIVE_CONSTRUCT),

        // Qal Infinitive Absolute
        new Word("קָטוֹל")
            .addForm("to kill", QAL, INFINITIVE_ABSOLUTE)
            .addForm("being killed", QAL, PARTICIPLE, PASSIVE, MASCULINE, SINGULAR),

        // Qal Active Participle
        new Word("קֹטֵל", "killing", QAL, PARTICIPLE, ACTIVE, MASCULINE, SINGULAR),
        new Word("קֹטְלִים", "killing", QAL, PARTICIPLE, ACTIVE, MASCULINE, PLURAL),
        new Word("קֹטֶלֶת", "killing", QAL, PARTICIPLE, ACTIVE, FEMININE, SINGULAR),
        new Word("קֹטְלָה", "killing", QAL, PARTICIPLE, ACTIVE, FEMININE, SINGULAR),
        new Word("קֹטְלוֹת", "killing", QAL, PARTICIPLE, ACTIVE, FEMININE, PLURAL),

        // Qal Passive Participle
        // For masculine singular see infinitive absolute
        new Word("קְטוּלָה", "being killed", QAL, PARTICIPLE, PASSIVE, FEMININE, SINGULAR),
        new Word("קְטוּלִים", "being killed", QAL, PARTICIPLE, PASSIVE, MASCULINE, PLURAL),
        new Word("קְטוּלוֹת", "being killed", QAL, PARTICIPLE, PASSIVE, FEMININE, PLURAL),

        // Niphal Perfect
        new Word("נִקְטַלְתִּי", "I was killed", NIPHAL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("נִקְטַלְתָּ", "you were killed", NIPHAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("נִקְטַלְתְּ", "you were killed", NIPHAL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("נִקְטַל", "he was killed", NIPHAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        // feminine 3rd person singular see qal cohortative above
        new Word("נִקְטַלְנוּ", "we were killed", NIPHAL, PERFECT, FIRST_PERSON, PLURAL),
        new Word("נִקְטַלְתֶּם", "you were killed", NIPHAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("נִקְטַלְתֶּן", "you were killed", NIPHAL, PERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("נִקְטְלוּ", "they were killed", NIPHAL, PERFECT, THIRD_PERSON, PLURAL),

        // Niphal Imperfect
        new Word("אֶקָּטֵל", "I will be killed", NIPHAL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תִּקָּטֵל")
            .addForm("you will be killed", NIPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR)
            .addForm("she will be killed", NIPHAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("תִּקָּטְלִי", "you will be killed", NIPHAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יִקָּטֵל", "he will be killed", NIPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("נִקָּטֵל", "we will be killed", NIPHAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תִּקָּטְלוּ", "you will be killed", NIPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תִּקָּטַלְנָה")
            .addForm("you will be killed", NIPHAL, IMPERFECT, SECOND_PERSON, FEMININE, PLURAL)
            .addForm("they will be killed", NIPHAL, IMPERFECT, THIRD_PERSON, FEMININE, PLURAL),
        new Word("יִקָּטְלוּ", "they will be killed", NIPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        // Niphal Imperative
        new Word("הִקָּטֵל")
            .addForm("be killed!", NIPHAL, IMPERATIVE, MASCULINE, SINGULAR)
            .addForm("to be killed", NIPHAL, INFINITIVE_CONSTRUCT),
        new Word("הִקָּטְלִי", "be killed!", NIPHAL, IMPERATIVE, FEMININE, SINGULAR),
        new Word("הִקָּטְלְוּ", "be killed!", NIPHAL, IMPERATIVE, MASCULINE, PLURAL),
        new Word("הִקָּטַלְנָה", "be killed!", NIPHAL, IMPERATIVE, FEMININE, PLURAL),

        // Niphal Infinitive
        // For infinitive construct see imperative
        new Word("נִקְטוֹל", "to be killed", NIPHAL, INFINITIVE_ABSOLUTE),
        new Word("הִקָּטוֹל", "to be killed", NIPHAL, INFINITIVE_ABSOLUTE),

        // Niphal Participle
        new Word("נִקְטָל", "being killed", NIPHAL, PARTICIPLE, MASCULINE, SINGULAR),
        new Word("נִקְטֶלֶת", "being killed", NIPHAL, PARTICIPLE, FEMININE, SINGULAR),
        new Word("נִקְטָלִים", "being killed", NIPHAL, PARTICIPLE, MASCULINE, PLURAL),
        new Word("נִקְטָלוֹת", "being killed", NIPHAL, PARTICIPLE, FEMININE, PLURAL),

        // Piel
        new Word("קִטַּלְתִּי", "I slaughtered", PIEL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("קִטַּלְתָּ", "you slaughtered", PIEL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("קִטַּלְתְּ", "you slaughtered", PIEL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("קִטֵּל", "he slaughtered", PIEL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("קִטְּלָה", "she slaughtered", PIEL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("קִטַּלְנוּ", "we slaughtered", PIEL, PERFECT, FIRST_PERSON, PLURAL),
        new Word("קִטַּלְתֶּם", "you slaughtered", PIEL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("קִטֵַּלְתֶּן", "you slaughtered", PIEL, PERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("קִטְּלוּ", "they slaughtered", PIEL, PERFECT, THIRD_PERSON, PLURAL),

        new Word("אֲקַטֵּל", "I will slaughter", PIEL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תְּקַטֵּל")
            .addForm("you will slaughter", PIEL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR)
            .addForm("she will slaughter", PIEL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("תְּקַטְּלִי", "you will slaughter", PIEL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יְקַטֵּל", "he will slaughter", PIEL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("נְקַטֵּל", "we will slaughter", PIEL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תְּקַטְּלוּ", "you will slaughter", PIEL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תְּקַטֵּלְנָה")
            .addForm("you will slaughter", PIEL, IMPERFECT, SECOND_PERSON, FEMININE, PLURAL)
            .addForm("they will slaughter", PIEL, IMPERFECT, THIRD_PERSON, FEMININE, PLURAL),
        new Word("יְקַטְּלוּ", "they will slaughter", PIEL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        new Word("קַטֵּל")
            .addForm("slaughter!", PIEL, IMPERATIVE, MASCULINE, SINGULAR)
            .addForm("to slaughter", PIEL, INFINITIVE_CONSTRUCT)
            .addForm("to slaughter", PIEL, INFINITIVE_ABSOLUTE),
        new Word("קַטְּלִי", "slaughter!", PIEL, IMPERATIVE, FEMININE, SINGULAR),
        new Word("קַטְּלוּ", "slaughter!", PIEL, IMPERATIVE, MASCULINE, PLURAL),
        new Word("קַטֵּלְנָה", "slaughter!", PIEL, IMPERATIVE, FEMININE, PLURAL),

        // infinitives see imperative above

        new Word("מְקַטֵּל", "slaughtering", PIEL, PARTICIPLE, MASCULINE, SINGULAR),
        new Word("מְקַטֶּלֶת", "slaughtering", PIEL, PARTICIPLE, FEMININE, SINGULAR),
        new Word("מְקַטְּלִים", "slaughtering", PIEL, PARTICIPLE, MASCULINE, PLURAL),
        new Word("מְקַטְּלוֹת", "slaughtering", PIEL, PARTICIPLE, FEMININE, PLURAL),

        new Word("קֻטַּלְתִּי", "I was slaughtered", PUAL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("קֻטַּלְתָּ", "you were slaughtered", PUAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("קֻטַּלְתְּ", "you were slaughtered", PUAL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("קֻטַּל", "he was slaughtered", PUAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("קֻטְּלָה", "she was slaughtered", PUAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("קֻטַּלְנוּ", "we were slaughtered", PUAL, PERFECT, FIRST_PERSON, PLURAL),
        new Word("קֻטַּלְתֶּם", "you were slaughtered", PUAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("קֻטַּלְתֶּן", "you were slaughtered", PUAL, PERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("קֻטְּלוּ", "they were slaughtered", PUAL, PERFECT, THIRD_PERSON, PLURAL),

        new Word("אֲקֻטַּל", "I will be slaughtered", PUAL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תְּקֻטַּל")
            .addForm("you will be slaughtered", PUAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR)
            .addForm("she will be slaughtered", PUAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("תְּקֻטְּלִי", "you will be slaughtered", PUAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יְקֻטַּל", "he will be slaughtered", PUAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("נְקֻטַּל", "we will be slaughtered", PUAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תְּקֻטְּלוּ", "you will be slaughtered", PUAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תְּקֻטַּלְנָה")
            .addForm("you will be slaughtered", PUAL, IMPERFECT, SECOND_PERSON, FEMININE, PLURAL)
            .addForm("they will be slaughtered", PUAL, IMPERFECT, THIRD_PERSON, FEMININE, PLURAL),
        new Word("יְקֻטְּלוּ", "they will be slaughtered", PUAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        new Word("מְקֻטָּל", "being slaughtered", PUAL, PARTICIPLE, MASCULINE, SINGULAR),
        new Word("מְקֻטֶּלֶת", "being slaughtered", PUAL, PARTICIPLE, FEMININE, SINGULAR),
        new Word("מְקֻטָּלִים", "being slaughtered", PUAL, PARTICIPLE, MASCULINE, PLURAL),
        new Word("מְקֻטָּלוֹת", "being slaughtered", PUAL, PARTICIPLE, FEMININE, PLURAL),

        // Hiphil
        new Word("הִקְטַלְתִּי", "I caused to kill", HIPHIL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("הִקְטַלְתָּ", "you caused to kill", HIPHIL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("הִקְטַלְתְּ", "you caused to kill", HIPHIL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("הִקְטִיל", "he caused to kill", HIPHIL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("הִקְטִילָה", "she caused to kill", HIPHIL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("הִקְטַלְְנוּ", "we caused to kill", HIPHIL, PERFECT, FIRST_PERSON, PLURAL),
        new Word("הִקְטַלְתֶּם", "you caused to kill", HIPHIL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("הִקְטַלְתֶּן", "you caused to kill", HIPHIL, PERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("הִקְטִילוּ", "they caused to kill", HIPHIL, PERFECT, THIRD_PERSON, PLURAL),

        new Word("אַקְטִיל", "I will cause to kill", HIPHIL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תַּקְטִיל")
            .addForm("you will cause to kill", HIPHIL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR)
            .addForm("she will cause to kill", HIPHIL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("תַּקְטִילִי", "you will cause to kill", HIPHIL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יַקְטִיל", "he will cause to kill", HIPHIL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("נַקְטִיל", "we will cause to kill", HIPHIL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תַּקְטִילוּ", "you will cause to kill", HIPHIL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תַּקְטֵלְנָה")
            .addForm("you will cause to kill", HIPHIL, IMPERFECT, SECOND_PERSON, FEMININE, PLURAL)
            .addForm("they will cause to kill", HIPHIL, IMPERFECT, THIRD_PERSON, FEMININE, PLURAL),
        new Word("יַקְטִילוּ", "they will cause to kill", HIPHIL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        new Word("הַקְטֵל")
            .addForm("cause to kill", HIPHIL, IMPERATIVE, MASCULINE, SINGULAR)
            .addForm("to cause to kill", HIPHIL, INFINITIVE_ABSOLUTE),
        new Word("הַקְטִילִי", "cause to kill", HIPHIL, IMPERATIVE, FEMININE, SINGULAR),
        new Word("הַקְטִילוּ", "cause to kill", HIPHIL, IMPERATIVE, MASCULINE, PLURAL),
        new Word("הַקְטֵלְנָה", "cause to kill", HIPHIL, IMPERATIVE, FEMININE, PLURAL),

        new Word("הַקְטִיל", "to cause to kill", HIPHIL, INFINITIVE_CONSTRUCT),
        // infinitive absolute see imperative

        new Word("מַקְטִיל", "causing to kill", HIPHIL, PARTICIPLE, MASCULINE, SINGULAR),
        new Word("מַקְטֶלֶת", "causing to kill", HIPHIL, PARTICIPLE, FEMININE, SINGULAR),
        new Word("מַקְטִילִים", "causing to kill", HIPHIL, PARTICIPLE, MASCULINE, PLURAL),
        new Word("מַקְטִילוֹת", "causing to kill", HIPHIL, PARTICIPLE, FEMININE, PLURAL),

        // Hophal
        new Word("הֻקְטַלְתִּי", "I was made to kill", HOPHAL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("הֻקְטַלְתָּ", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("הֻקְטַלְתְּ", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("הֻקְטַל", "he was made to kill", HOPHAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("הֻקְטְלָה", "she was made to kill", HOPHAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("הֻקְטַלְנוּ", "we were made to kill", HOPHAL, PERFECT, FIRST_PERSON, PLURAL),
        new Word("הֻקְטַלְתֶּם", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("הֻקְטַלְתֶּן", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("הֻקְטְלוּ", "they were made to kill", HOPHAL, PERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        new Word("הָקְטַלְתִּי", "I was made to kill", HOPHAL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("הָקְטַלְתָּ", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("הָקְטַלְתְּ", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("הָקְטַל", "he was made to kill", HOPHAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("הָקְטְלָה", "she was made to kill", HOPHAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("הָקְטַלְנוּ", "we were made to kill", HOPHAL, PERFECT, FIRST_PERSON, MASCULINE, PLURAL),
        new Word("הָקְטַלְתֶּם", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("הָקְטַלְתֶּן", "you were made to kill", HOPHAL, PERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("הָקְטְלוּ", "they were made to kill", HOPHAL, PERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        new Word("אֻקְטַל", "I will be made to kill", HOPHAL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תֻּקְטַל")
            .addForm("you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR)
            .addForm("she will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("תֻּקְטְלִי", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יֻקְטַל", "he will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("נֻקְטַל", "we will be made to kill", HOPHAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תֻּקְטְלוּ", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תֻּקְטַלְנָה")
            .addForm("you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, FEMININE, PLURAL)
            .addForm("they will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, FEMININE, PLURAL),
        new Word("יֻקְטַלוּ", "they will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        new Word("אָקְטַל", "I will be made to kill", HOPHAL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תָּקְטַל")
            .addForm("you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR)
            .addForm("she will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("תָּקְטְלִי", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יָקְטַל", "he will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("נָקְטַל", "we will be made to kill", HOPHAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תָּקְטְלוּ", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תָּקְטַלְנָה")
            .addForm("you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, FEMININE, PLURAL)
            .addForm("they will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, FEMININE, PLURAL),
        new Word("יָקְטַלוּ", "they will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        new Word("מֻקְטָל", "being made to kill", HOPHAL, PARTICIPLE, MASCULINE, SINGULAR),
        new Word("מֻקְטֶלֶת", "being made to kill", HOPHAL, PARTICIPLE, FEMININE, SINGULAR),
        new Word("מֻקְטָלִים", "being made to kill", HOPHAL, PARTICIPLE, MASCULINE, PLURAL),
        new Word("מֻקְטָלוֹת", "being made to kill", HOPHAL, PARTICIPLE, FEMININE, PLURAL),

        new Word("מָקְטָל", "being made to kill", HOPHAL, PARTICIPLE, MASCULINE, SINGULAR),
        new Word("מָקְטֶלֶת", "being made to kill", HOPHAL, PARTICIPLE, FEMININE, SINGULAR),
        new Word("מָקְטָלִים", "being made to kill", HOPHAL, PARTICIPLE, MASCULINE, PLURAL),
        new Word("מָקְטָלוֹת", "being made to kill", HOPHAL, PARTICIPLE, FEMININE, PLURAL),

        // Hithpael
        new Word("הִתְקַטַּלְתִּי", "I killed myself", HITHPAEL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("הִתְקַטַּלְתָּ", "you killed yourself", HITHPAEL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("הִתְקַטַּלְתְּ", "you killed yourself", HITHPAEL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("הִתְקַטֵּל")
            .addForm("he killed himself", HITHPAEL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR)
            .addForm("kill yourself", HITHPAEL, IMPERATIVE, MASCULINE, SINGULAR)
            .addForm("to kill oneself", HITHPAEL, INFINITIVE_CONSTRUCT)
            .addForm("to kill oneself", HITHPAEL, INFINITIVE_ABSOLUTE),
        new Word("הִתְקַטְּלָה", "she killed herself", HITHPAEL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("הִתְקַטַּלְנוּ", "we killed ourselves", HITHPAEL, PERFECT, FIRST_PERSON, PLURAL),
        new Word("הִתְקַטַּלְתֶּם", "you killed yourselves", HITHPAEL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("הִתְקַטַּלְתֶּן", "you killed yourselves", HITHPAEL, PERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("הִתְקַטְּלוּ")
            .addForm("they killed themselves", HITHPAEL, PERFECT, THIRD_PERSON, PLURAL)
            .addForm("kill yourselves", HITHPAEL, IMPERATIVE, MASCULINE, PLURAL),

        new Word("אֶתְקַטֵּל", "I will kill myself", HITHPAEL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תִּתְקַטֵּל")
            .addForm("you will kill yourself", HITHPAEL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR)
            .addForm("she will kill herself", HITHPAEL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("תִּתְקַטְּלִי", "you will kill yourself", HITHPAEL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יִתְקַטֵּל", "he will kill himself", HITHPAEL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("נִתְקַטֵּל", "we will kill ourselves", HITHPAEL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תִּתְקַטְּלוּ", "you will kill yourselves", HITHPAEL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תִּתְקַטֵּלְנָה")
            .addForm("you will kill yourselves/themselves", HITHPAEL, IMPERFECT, SECOND_PERSON, FEMININE, PLURAL)
            .addForm("they will kill yourselves/themselves", HITHPAEL, IMPERFECT, THIRD_PERSON, FEMININE, PLURAL),
        new Word("יִתְקַטֵּלוּ", "they will kill themselves", HITHPAEL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        // Masculine singular see perfect above
        new Word("הִתְקַטְּלִי", "kill yourself", HITHPAEL, IMPERATIVE, FEMININE, SINGULAR),
        // Masculine plural see perfect above
        new Word("הִתְקַטֵּלְנָה", "kill yourselves", HITHPAEL, IMPERATIVE, FEMININE, PLURAL),

        // Both infinitives see perfect above

        new Word("מִתְקַטֵּל", "killing oneself", HITHPAEL, PARTICIPLE, MASCULINE, SINGULAR),
        new Word("מִתְקַטֶּלֶת", "killing oneself", HITHPAEL, PARTICIPLE, FEMININE, SINGULAR),
        new Word("מִתְקַטְּלִים", "killing oneself", HITHPAEL, PARTICIPLE, MASCULINE, PLURAL),
        new Word("מִתְקַטֵּלוֹת", "killing oneself", HITHPAEL, PARTICIPLE, FEMININE, PLURAL),
        //----------------------------------------------------------------------------------------
        // PRONOMINAL SUFFIXES
        new Word("סוּסִי", "my horse"),
        new Word("סוּסְךָ", "your horse", MASCULINE, SINGULAR),
        new Word("סוּסֵך", "your horse", FEMININE, SINGULAR),
        new Word("סוּסוֹ", "his horse"),
        new Word("סוּסָהּ", "her horse"),
        new Word("סוּסֵנוּ", "our horse"),
        new Word("סוּסְכֶם", "your horse", MASCULINE, PLURAL),
        new Word("סוּסְכֶן", "your horse", FEMININE, PLURAL),
        new Word("סוּסָם", "their horse", MASCULINE),
        new Word("סוּסָן", "their horse", FEMININE),

        new Word("סוּסַי", "my horses"),
        new Word("סוּסֶיךָ", "your horses", MASCULINE, SINGULAR),
        new Word("סוּסַיִך", "your horses", FEMININE, SINGULAR),
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

        new Word("יִקְטְלֵנִי", "he will kill me", PRONOMINAL_SUFFIX, FIRST_PERSON, MASCULINE, SINGULAR),
        new Word("יִקְטָלְךָ", "he will kill you", PRONOMINAL_SUFFIX, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("יִקְטְלֵך", "he will kill you", PRONOMINAL_SUFFIX, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יִקְטְלֵהוּ", "he will kill him", PRONOMINAL_SUFFIX, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("יִקְטְלֵנּוּ", "he will kill him", PRONOMINAL_SUFFIX, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("יִקְטְלָהּ", "he will kill her", PRONOMINAL_SUFFIX, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("יִקְטְלֶנָּה", "he will kill her", PRONOMINAL_SUFFIX, THIRD_PERSON, FEMININE, SINGULAR),
        // TODO double check, why are these all they and above he yet they
        // look the same minus the suffix
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
        new Word("וְ", "and, but, also, even", true),
        // 23968
        new Word("הַ", "the", true),
        // 20435
        new Word("לְ", "to", true),
        // 15632
        new Word("בְּ", "in, at, with", true),
        // 10970
        new Word("אֶת–", "definite direct object marker OR with", true),
        new Word("אֵת", "definite direct object marker OR with", true),
        new Word("אֹתַי", "direct object marker with pronominal suffix 'me', NOT with", true), // 898
        new Word("אִתִּי", "with me, NOT direct object marker", true),
        // 7586
        new Word("מִן", "from", true),
        // 5778
        new Word("עַל", "upon, over, above", true),
        // 5518
        new Word("אֶל", "to, toward", true),
        // 5518
        new Word("לֹא", "no, not, used with perfect, used with imperfect = never", true),
        // 5503
        new Word("אֲשֶׁר", "who, whom, that, which (relative pronoun)", true),
        // 5415
        new Word("כֹּל", "all", true),
        new Word("כָּל", "all of", CONSTRUCT),
        // 5317
        new Word("אָמַר", "he said", true),

        // 4942
        new Word("בֵּן", "son", true, MASCULINE),
        new Word("בֶּן", "son of", MASCULINE, CONSTRUCT),
        new Word("בָּנִים", "sons", MASCULINE, PLURAL),
        // 4795
        new Word("אֲנִי", "I, myself", true, NOMINATIVE),
        new Word("אָנֹכִי", "I, myself", true, NOMINATIVE),
        new Word("אֲנַחְנוּ", "we", true, NOMINATIVE),

        new Word("אַתָּה", "you", true, NOMINATIVE, MASCULINE, SINGULAR),
        new Word("אַתְּ", "you", true, NOMINATIVE, FEMININE, SINGULAR),
        new Word("אַתֶּם", "you", true, NOMINATIVE, MASCULINE, PLURAL),
        new Word("אַתֵּנָה", "you", true, NOMINATIVE, FEMININE, PLURAL),

        new Word("הוּא", "he, that", true, NOMINATIVE),
        new Word("הִיא", "she, that", true, NOMINATIVE),
        new Word("הִוא", "she, that", true, NOMINATIVE),
        new Word("הֵם", "they, those", true, NOMINATIVE, MASCULINE, PLURAL),
        new Word("הֵמָּה", "they, those", true, NOMINATIVE, MASCULINE, PLURAL),
        new Word("הֵן", "they, those", true, NOMINATIVE, FEMININE, PLURAL),
        new Word("הֵנָּה", "they, those", true, NOMINATIVE, FEMININE, PLURAL),

        // 4487
        new Word("כִּי", "that, because; (adversative) but, except; (emphatic) indeed, truly", true),
        new Word("כִּי–אִם", "but, except", true),
        // 2909
        new Word("כְּ", "as, like", true),
        // 2632
        new Word("עָשַׂה", "he did, he made", true),
        new Word("מַעֲשֶׂה", "work, deed", true, MASCULINE), // 235
        new Word("מַעֲשִׂים", "works, deeds", MASCULINE, PLURAL),
        // 2602
        new Word("אֱלֹהִים", true)
            .addForm("God", MASCULINE)
            .addForm("gods", MASCULINE, PLURAL),
        new Word("אֵל", "god", true, MASCULINE), // 236
        // 2579
        new Word("בָּא", "he came, entered - בּוֹא", true),
        // 2530
        new Word("מֶלֶך", "king", true, MASCULINE),
        new Word("מְלָכִים", "kings", MASCULINE, PLURAL),
        new Word("מָלַךּ", "he reigned", true), // 350
        new Word("מַמְלָכָה", "kingdom, reign, dominion", true, FEMININE), // 117
        // 2529
        new Word("זֶה",	"this", true, MASCULINE),
        new Word("זֹאת", "this", true, FEMININE),
        new Word("אֵלָה", "these", true),
        // 2505
        new Word("אֶרֶץ", "land, earth", true, FEMININE),
        new Word("אֲרָצוֹת", "lands, earths", FEMININE, PLURAL),
        // 2303
        new Word("יוֹם", "day", true, MASCULINE),
        new Word("יָמִים", "days", MASCULINE, PLURAL),
        // 2187
        new Word("אִיש", "man", true, MASCULINE),
        new Word("אֲנָשִׁים", "men", true, MASCULINE, PLURAL),
        // 2128
        new Word("פָּנִים", "face, faces", true, MASCULINE, SINGULAR, PLURAL),
        new Word("פְּנֵי", "before, in the presence of", true),
        // 2046
        new Word("בַּיִת", "house", true, MASCULINE),
        new Word("בֵּּּית", "house of", MASCULINE, CONSTRUCT),
        new Word("בָּתִּים", "houses", MASCULINE, PLURAL),
        // 1867
        new Word("עַם", "people, nation", true, MASCULINE),
        new Word("עַמִּים", "peoples, nations", MASCULINE, PLURAL),
        // 1627
        new Word("יָד", "hand, (metaphorically) side, power", true, FEMININE),
        new Word("יַד", "hand of", FEMININE, CONSTRUCT),
        new Word("יָדַיִם", "hands", FEMININE, DUAL),
        // 1554
        new Word("הָלַךּ",	"he walked", true),
        // 1494
        new Word("דָּבָר", "word, speech", true, MASCULINE),
        new Word("דְּבָרִים", "words, speeches", MASCULINE, PLURAL),
        new Word("דִּבֶּר",	"he spoke", true, PIEL), // 1135
        // 1310
        new Word("רָאָה", "he saw", true),
        new Word("מַרְאֶה", "sight, appearance", true, MASCULINE),  // 103
        // 1263
        new Word("עַד", "until, as far as", true),
        // 1210
        new Word("אָב", "father", true, MASCULINE),
        new Word("אֲבִי", "father of", MASCULINE, CONSTRUCT),
        new Word("אָבוֹת", "fathers", MASCULINE, PLURAL),
        // 1165
        new Word("שָׁמַע",	 "he heard", true),
        // 1119
        new Word("ָה", "to, toward, directional ending", true),
        // 1094
        new Word("עִיר", "city", true, FEMININE),
        new Word("עָרִים", "cities", FEMININE, PLURAL),
        // 1087
        new Word("יָשַׁב",	"he sat, he dwelt", true),
        // 1075
        new Word("יָצָא", 	"he went out", true),
        new Word("שָׁב", "he returned", true),
        // 1070
        new Word("אִם", "if", true),
        // 1061
        new Word("הִנַּה", "behold, here I am, I am ready", true),
        // 1048
        new Word("עִם", "with", true),
        // 976
        new Word("אֶחָד", "one", true, MASCULINE),
        new Word("אַחַת", "one", FEMININE),
        // 966
        new Word("לָקַח", "he took", true),
        // 952
        new Word("יָדַע", "he knew", true),
        // 896
        new Word("עַיִן", "eye, spring", true, FEMININE),
        new Word("עֵינַים", "eyes", FEMININE, DUAL),
        new Word("עֲיָנֹת", "springs", FEMININE, PLURAL),
        // 894
        new Word("עָלָה", "he went up", true),
        // 879
        new Word("שָׁנָה", "year", true, FEMININE),
        new Word("שָׁנִים", "years", FEMININE, PLURAL),
        // 864
        new Word("שֵׁם", "name", true, MASCULINE),
        new Word("שֵׁמוֹת", "names", MASCULINE, PLURAL),
        // 853 (601 for לב and 252 for לבב )
        new Word("לֵב", "heart", true, MASCULINE),
        new Word("לִבּוֹת", "hearts", MASCULINE, PLURAL),
        new Word("לֵבָב", "heart", true, MASCULINE),
        new Word("לְבָבוֹת", "hearts", MASCULINE, PLURAL),
        // 847
        new Word("שָׁלַח", "he sent, stretched out", true),
        new Word("הִשְׁלְִיך", "he threw, flung, cast - שָׁלַך", HIPHIL), // 127
        // 845
        new Word("מֵת", "he died - מוּת", true),
        new Word("מָוֶת", "death, dying", true, MASCULINE), // 153
        // 835
        new Word("שָׁם", "there", true),
        // 814
        new Word("אָכַל", "he ate", true),
        // 803
        new Word("עֶבֶד", "servant, slave", true, MASCULINE),
        new Word("עֲבָדִים", "servants, slaves", MASCULINE, PLURAL),
        new Word("עָבַד", "he worked, he served", true), // 289
        new Word("עֲבֹדָה", "work, labor, service, worship", true, FEMININE), // 147
        // 783
        new Word("אַיִן", "nothing, there is not", true),
        new Word("אֵין", "nothing, there is not", true),
        // 781
        new Word("אִשָּׁה", "woman, wife", true, FEMININE),
        new Word("אֵשֶׁת", "woman, wife", FEMININE, SINGULAR, CONSTRUCT),
        new Word("נָשׁים", "women, wives", true, FEMININE, PLURAL),
        new Word("נְשֵׁי", "women, wives", FEMININE, PLURAL, CONSTRUCT),
        // 774
        new Word("אָדוֹן", "lord, master", true, MASCULINE),
        new Word("אֲדֹנִים", "lords, masters", MASCULINE, PLURAL),
        // 769
        new Word("שְׁנַיִם", "two", true, MASCULINE),
        new Word("שְׁתַּים", "two", FEMININE),
        new Word("שֵׁנִי", "second", MASCULINE),
        new Word("שֵׁנִית", "second", FEMININE),
        new Word("גַּם", "also", true),
        // 757
        new Word("נֶפֶש", "soul, person", true, FEMININE),
        new Word("נְפָשׁוֹת", "souls, persons", FEMININE, PLURAL),
        // 754
        new Word("מָה", "what?", true),
        new Word("מַה", "what?", true),
        new Word("מֶה", "what?", true),
        // 750
        new Word("כֹּהַן", "priest", true, MASCULINE),
        new Word("כֹהֲנִים", "priests", MASCULINE, PLURAL),
        // 748
        new Word("הֲ", "indicates interrogative, prefixed to first word in the sentence", true),
        // 743
        new Word("כֵּן", "so, thus", true),
        // 736
        new Word("קָרָא", true)
            .addForm("he called")
            .addForm("he encountered, he met"), // 139 I don't think these roots are related
        // 729
        new Word("אַל", "no, not (with imperfect) not at this time", true),
        // 712
        new Word("דֶּרֶךּ", "way, road", true, MASCULINE, FEMININE),
        new Word("דֶּרָכִים", "ways, roads", MASCULINE, FEMININE, PLURAL),
        // 707
        new Word("אַחַר", "after", true),
        // 658
        new Word("נָשָׂא", "he lifted, carried, took", true),
        // 629
        new Word("אָח", "brother", true, MASCULINE),
        new Word("אֲחִי", "brother of", MASCULINE, CONSTRUCT),
        new Word("אַחִים", "brothers", MASCULINE, PLURAL),
        new Word("אָחוֹת", "sister", true, FEMININE), // 119
        // 627
        new Word("קָם", "he arose, stood - קוּם", true),
        new Word("מָקוֹם", "place", true, MASCULINE), // 401
        new Word("מְקוֹמוֹת", "places", MASCULINE, PLURAL),
        // 606
        new Word("שָׁלשׁ", "three", true, MASCULINE),
        new Word("שְׁלֹשִׁים", "thirty"),
        new Word("שְׁלִישִׁי", "third"),
        // 600
        new Word("רֹאשׁ", "head", true, MASCULINE),
        new Word("רָאשִׁים", "heads", MASCULINE, PLURAL),
        // 588
        new Word("בַּת", "daughter", true, FEMININE),
        new Word("בָּנוֹת", "daughters", FEMININE, PLURAL),
        // 583
        new Word("מָיִם", "water, waters", true, MASCULINE, SINGULAR, PLURAL),
        new Word("מֵי", "water", MASCULINE, SINGULAR, PLURAL, CONSTRUCT),
        new Word("מֵאָה", "hundred", true),
        // 577
        new Word("כֹּה", "thus, here", true),
        // 560
        new Word("גּוֹי", "nation", true, MASCULINE),
        new Word("גּוֹיִם", "nations", MASCULINE, PLURAL),
        // 559
        new Word("הַר", "mountain", true, MASCULINE),
        new Word("הָרִים", "mountains", MASCULINE, PLURAL),
        // 554
        new Word("עָבַר", "he passed over, passed through, passed by", true),
        // 545
        new Word("אָדָם", "a man, humankind", true, MASCULINE),
        new Word("אֲדָמָה", "land, ground, earth", true, FEMININE),
        new Word("אֲדָמוֹת", "lands, grounds", FEMININE, PLURAL),
        // 528
        new Word("שָׂם", "he put, set - שִׂים", true),
        // 526
        new Word("גָּדוֹל", "great", true),
        new Word("גָּדַל", "he grew up, became great, strong, wealthy, important", true), // 117
        // 524
        new Word("עָמַד", "he stood", true),
        // 511
        new Word("תַּחַת", "under, instead of", true),
        // 508
        new Word("חָמַשׁ", "five", true, MASCULINE),
        new Word("חֲמִשִּׁים", "fifty"),
        // 505
        new Word("קוֹל", "voice, sound", true, MASCULINE),
        new Word("קֹלוֹת", "voices, sounds", MASCULINE, PLURAL),
        // 501
        new Word("הִכָּה", "he hit - נכה (he smote)", true, HIPHIL),
        // 498
        new Word("פֶה", "mouth", true, MASCULINE),
        new Word("פִּי", "mouth", MASCULINE, SINGULAR, CONSTRUCT),
        new Word("פִּיּוֹת", "mouths", MASCULINE, PLURAL),
        // 496
        new Word("צָבָא", "host, army, war, service", true, MASCULINE),
        new Word("צְבָאוֹת", "hosts, armies, wars, services", MASCULINE, PLURAL),
        // 496
        new Word("צִוָּה", "he commanded", true),
        // 495
        new Word("יָלַד", "he bore, he begat", true),
        // 494
        new Word("אֶלֶף", "thousand", true),
        // 492
        new Word("עֶשֶׁר", "ten", true, MASCULINE),
        new Word("עֲשָׂרָה", "ten", FEMININE),
        new Word("עֶשְׂרִים", "twenty"),
        // 491
        new Word("שֶׁבַע", "seven", true, MASCULINE),
        new Word("שִׁבְעִים", "seventy"),
        new Word("שָׁבַע", "he swore", true), // 186
        // 491
        new Word("עוֹד", "again, still, long", true),
        // 470
        new Word("קֹדֶש", "holiness, apartness, sacredness", true, MASCULINE),
        new Word("קֳדָשִׁים", "holiness, apartness, sacredness", MASCULINE, PLURAL),
        new Word("קָדַשׁ", "he was consecrated, he consecrated", true), // 171
        // 469
        new Word("שָׁמַר", "he guarded, watched, preserved", true),
        // 457
        new Word("מָצַה", "he found, reached, obtained", true),
        // 456
        new Word("אַרְבַּע", "four", true, MASCULINE),
        new Word("אַרְבָּעִים", "forty"),
        new Word("רְבִיעִי", "fourth", MASCULINE),
        // 439
        new Word("עוֹלָם", "forever", true, MASCULINE),
        new Word("עוֹלָמִים", "forever", MASCULINE, PLURAL),
        // 435
        new Word("נָפַל", "he fell", true),
        new Word("עַתָּה", "now", true),
        new Word("עַת", "time, point in time", true, FEMININE), // 296
        // 424
        new Word("מִשְׁפָת", "judgement, law", true, MASCULINE),
        new Word("מִשׁפָּטִים", "judgements, laws", MASCULINE, PLURAL),
        new Word("שָׁפַת", "he judged", true), // 204
        new Word("מִי", "who?, true"),
        // 421
        new Word("שַׂר", "prince, chief", true, MASCULINE),
        new Word("שָׂרִים", "princes, chiefs", MASCULINE, PLURAL),
        new Word("שָׁמַיִם", "heavens, sky", true, MASCULINE, SINGULAR, PLURAL),
        new Word("שְׁמֵי", "heavens, sky", MASCULINE, CONSTRUCT),
        // 420
        new Word("תָּוֶךּ", "midst", true),
        // 413
        new Word("חֶרֶב", "sword", true, FEMININE),
        new Word("חֲרָבוֹת", "swords", FEMININE, PLURAL),
        // 409
        new Word("רַב", "great, many", true, MASCULINE),
        new Word("רַבָּה", "great, many", FEMININE),
        new Word("רָבָה", "he was(became) great/many", true),
        new Word("רֹב", "multitude, greatness", true, NOUN, MASCULINE), // 150
        new Word("בַּין", "between", true),
        new Word("בִּין", "he discerned, understood", true), // 171
        // 405
        new Word("נָא", "please, now", true),
        // 403
        new Word("כֶּסֶף", "silver, money", true, MASCULINE),
        new Word("מִזְבֵּחַ", "alter", true, MASCULINE),
        new Word("מִזְבְּחוֹת", "alters", MASCULINE, PLURAL),
        // 396
        new Word("יָם", "sea", true, MASCULINE),
        new Word("יַמִּים", "seas", MASCULINE, PLURAL),
        // 389
        new Word("זָהָב", "gold", true, MASCULINE),
        // 382
        new Word("יָרַד", "he went down", true),
        // 377
        new Word("בָּנָה", "he built", true),
        new Word("אַשׁ", "fire", true, FEMININE),
        // 376
        new Word("נְאֻם", "utterance", true, MASCULINE),
        // 373
        new Word("שַׁעַר", "gate", true, MASCULINE),
        new Word("שְׁעָרִים", "gates", MASCULINE, PLURAL),
        new Word("טוֹב", true)
            .addForm("good", ADJECTIVE, MASCULINE, SINGULAR)
            .addForm("he was good"),
        new Word("טוֹבָה", "good", ADJECTIVE, FEMININE, SINGULAR),
        new Word("טוֹבִים", "good", ADJECTIVE, MASCULINE, PLURAL),
        new Word("טוֹבוֹת", "good", ADJECTIVE, FEMININE, PLURAL),
        // 371
        new Word("הִגִיד", "he told, declared - נגד (be conspicuous)", true, HIPHIL),
        // 363
        new Word("רוּחַ", "spirit, breath, wind", true, FEMININE),
        new Word("רוּחוֹת", "spirits, breaths, winds", FEMININE, PLURAL),
        // 361
        new Word("דָּם", "blood", true, MASCULINE),
        new Word("דָּמִים", "bloods", MASCULINE, PLURAL),
        // 357
        new Word("רַע", "bad, evil", true, ADJECTIVE, MASCULINE, SINGULAR)
            .addForm("he was bad/evil"), // 97 times
        new Word("רָעָה", true)
            .addForm("bad, evil", ADJECTIVE, FEMININE, SINGULAR)
            .addForm("evil, misery, distress", NOUN, FEMININE)
            .addForm("he pastured, tended, grazed"),
        new Word("רָעִים", "bad, evil", ADJECTIVE, MASCULINE, PLURAL),
        new Word("רָעוֹת", "bad, evil", ADJECTIVE, FEMININE, PLURAL),
        // 348
        new Word("אֹהֶל", "tent", true, MASCULINE),
        new Word("אֹהָלִים", "tents", MASCULINE, PLURAL),
        // 338
        new Word("סָבִיב", "all around", true),
        new Word("סָבַב", "he turned around, went around, surrounded", true), // 163
        // 330
        new Word("עֵץ", "tree", true, MASCULINE),
        new Word("עֵצִים", "trees", MASCULINE, PLURAL),
        // 327
        new Word("בֵּרַךּ", "he blessed - ברך (he knelt, he blessed)", true, PIEL),
        // 325
        new Word("כְּלִי", "utensil, weapon", true, MASCULINE),
        new Word("כֵּלִים", "utensils, weapons", MASCULINE, PLURAL),
        // 321
        new Word("שָׂדֶה", "open field, country", true, MASCULINE),
        new Word("שָׂדוֹת", "open fields, country", MASCULINE, PLURAL),
        new Word("אוֹ", "or"),
        // 319
        new Word("מִלְחָמָה", "war, battle", true, FEMININE),
        new Word("מִלְחָמוֹת", "wars, battles", FEMININE, PLURAL),
        new Word("נִלְחַם", "he engaged in battle (reciprocal), waged war – לחם", true, NIPHAL), // 171
        // 318
        new Word("יָרֵא", "he feared", true),
        // 317
        new Word("עָנָה", "he answered", true),
        new Word("נָבִיא", "prophet", true, MASCULINE),
        new Word("נְבִיאִים", "prophets", MASCULINE, PLURAL),
        new Word("נִבָּא", "he prophisied - נָבָא", true, NIPHAL), // 115
        // 304
        new Word("פָּקַד", "he attended to, appointed, mustered, visited", true),
        new Word("מִשְׁפָּחָה", "family", true, FEMININE),
        new Word("מִשְׁפָּחוֹת", "families", FEMININE, PLURAL),
        // 298
        new Word("סָר", "he turned aside - סור", true),
        new Word("חַטָּאת", "sin, sin offering", true, FEMININE),
        new Word("חָטָא", "he sinned, he missed", true), // 239
        new Word("לֶחֶם", "bread, food", true, MASCULINE),
        new Word("מְאֹד", "very", true),
        // 290
        new Word("חָזַק", "he was strong", true),
        // 289
        new Word("כָּרַת", "he cut off", true),
        // 288
        new Word("עֹלָה", "whole burnt offering", true, FEMININE),
        new Word("עֹלוֹת", "whole burnt offerings", FEMININE, PLURAL),
        // 287
        new Word("חָיָה", "he lived", true),
        new Word("חַיִּים", "life, lives", true, MASCULINE, SINGULAR, PLURAL), // 268
        // 285
        new Word("אֹיֵב", "enemy", true, MASCULINE),
        new Word("אָיַב", "he was hostile", true),
        new Word("בְּרִית", "covenant", true, FEMININE),
        // 283
        new Word("חֹדֶשׁ", "month, new moon", true, MASCULINE),
        new Word("חֳדָשִׁים", "months, new moons", MASCULINE, PLURAL),
        // 280
        new Word("קָרַב", "he came near, he offered", true),
        new Word("קֶרֶב", "midst, inward part", true, MASCULINE),
        // 277
        new Word("אַף", true)
            .addForm("nose, anger", MASCULINE)
            .addForm("also, indeed, even"),
        new Word("אַפַּיִם", "noses, anger", MASCULINE, PLURAL),
        // 274
        new Word("צֹאן", "flock, sheep", true, FEMININE, SINGULAR, PLURAL),
        new Word("שַׁשׁ", "six", true, MASCULINE),
        new Word("שׁשִּׁים", "sixty"),
        // 272
        new Word("אֶבֶן", "stone", true, FEMININE),
        new Word("אֲבָנִים", "stones", FEMININE, PLURAL),
        new Word("לְמַעַן", "because of, in order to, for the sake of", true),
        // 270
        new Word("בָּשָׂר", "flesh, meat, skin", true, MASCULINE),
        new Word("בְּשָׂרִים", "fleshes, meats, skins", MASCULINE, PLURAL),
        new Word("מִדְבָּר", "wilderness, desert, pasture", true, MASCULINE),
        // 264
        new Word("רָשָׁע", "wicked", true, ADJECTIVE, MASCULINE, SINGULAR),
        new Word("רְשָׁעִים", "wicked", ADJECTIVE, MASCULINE, PLURAL),
        new Word("רְשָׁעָה", "wicked", ADJECTIVE, FEMININE, SINGULAR),
        // 252
        new Word("מַטֶּה", "tribe, staff", true, MASCULINE),
        new Word("מָטּוֹת", "tribes, staffs", MASCULINE, PLURAL),
        // 251
        new Word("רֶגֶל", "foot", true, FEMININE),
        new Word("רַגְלַיִם", "feet", FEMININE, DUAL),
        // 250
        new Word("מָלֵא", "he filled", true),
        new Word("אַמָּה", "cubit, forearm", true, FEMININE),
        new Word("אַמּוֹת", "cubits, forearms", FEMININE, PLURAL),
        // 249
        new Word("חֶסֶד", "loving kindness, steadfast love", true, MASCULINE),
        new Word("חֲסָדִים", "loving kindnesses, steadfast loves", MASCULINE, PLURAL),
        // 245
        new Word("חַיַל", "strength, wealth, army", true, MASCULINE),
        new Word("חֲיָלִים", "armies,strengths, wealths", MASCULINE, PLURAL),
        // 241
        new Word("גְּבוּל", "border, boundary, territory", true, MASCULINE),
        // 240
        new Word("נַעַר", "boy, youth", true, MASCULINE),
        new Word("נְעָרִים", "boys, youths", MASCULINE, PLURAL),
        // 237
        new Word("שָׁלוֹם", "peace, completeness", true, MASCULINE),
        new Word("שָׁלֵם", "he was whole, complete", true), // 116
        new Word("שִׁלַּם", "he repaid - שָׁלֵם", true, PIEL),
        new Word("הִשְׁלִים", "he made peace - שָׁלֵם", true, HIPHIL),
        // 233
        new Word("עָוֹן", "iniquity", true, MASCULINE),
        new Word("עֲוֹנוֹת", "iniquities", MASCULINE, PLURAL),
        // 232
        new Word("יָרַשׁ", "he inherited, he possessed, he dispossessed", true),
        // 229
        new Word("זֶרַע", "seed", true, MASCULINE),
        // 227
        new Word("לַיְלָה", "night", true, MASCULINE),
        new Word("לֵילוֹת", "nights", MASCULINE, PLURAL),
        // 225
        new Word("בִּקֵּשׁ", "he sought", true, PIEL),
        new Word("זָכַר", "he remembered", true),
        new Word("כָּתַב", "he wrote", true),
        // 223
        new Word("מוֹעַד", "appointed time, place", true, MASCULINE),
        new Word("מוֹעֲדִים", "appointed times, places", MASCULINE, PLURAL),
        new Word("תּוֹרָה", "law, instruction", true, FEMININE),
        new Word("תּוֹרוֹת", "laws, instructions", FEMININE, PLURAL),
        // 222
        new Word("נַחֲלָה", "possession", true, FEMININE),
        new Word("נְחָלוֹת", "possessions", FEMININE, PLURAL),
        // 220
        new Word("אֵם", "mother", true, FEMININE),
        // 219
        new Word("נָכְוֹן", "he was firm, established, prepared", true, NIPHAL),
        // 217
        new Word("אָהַב", "he loved", true),
        new Word("שָׁתָה", "he drank", true),
        // 216
        new Word("נָטָה", "he stretched out", true),
        new Word("בֶּגֶד", "garmet", true, MASCULINE),
        new Word("בְּגָדִים", "garmets", MASCULINE, PLURAL),
        // 215
        new Word("יָסַף", "he added, he did again", true),
        new Word("מַחֲנֶה", "camp", true, MASCULINE, FEMININE),
        new Word("מַחַנוֹת", "camps", MASCULINE, FEMININE, PLURAL),
        // 214
        new Word("עָזַב", "he forsook, left", true),
        // 213
        new Word("הִצִּיל", "he saved, delivered - נצל", true, HIPHIL),
        new Word("שָׁכַב", "he layed down, he had sex", true),
        new Word("בֹּקֶר", "morning", true, MASCULINE),
        new Word("בְּקָרִים")
            .addForm("mornings", MASCULINE, PLURAL)
            .addForm("herds, oxen", MASCULINE, PLURAL),
        new Word("מַלְאָךּ", "messenger", true, MASCULINE),
        new Word("מַלְאָכִים", "messengers", MASCULINE, PLURAL),
        // 211
        new Word("מִנְחָה", "gift, tribute, offering", true, FEMININE),
        // 208
        new Word("כָּלָה", "he was complete, finished, he came to an end", true),
        // 206
        new Word("צַדּיק", "just, righteous", true, ADJECTIVE, MASCULINE),
        new Word("צַדִּיקִים", "just, righteous", ADJECTIVE, MASCULINE, PLURAL),
        new Word("צְדָקָה", "righteousness", FEMININE), // 159
        // 202
        new Word("אֲרוֹן", "ark, chest", true, MASCULINE),
        // 200
        new Word("אָסַף", "he gathered", true),
        // 199
        new Word("כָּבוֹד", "abundance, honor, glory", true, MASCULINE),
        new Word("כָּבֵד", "he was heavy, he was honored", true), // 114
        // 195
        new Word("רוּם", "he was high, exalted", true),
        new Word("כַּף", "palm of the hand, sole of the foot", true, FEMININE),
        new Word("כַּפוֹת", "palms of the hands, soles of the feet", FEMININE, PLURAL),
        // 194
        new Word("יָכוֹל", "he was able", true),
        // 193
        new Word("שֶׁמֶן", "fat, oil", true, MASCULINE),
        new Word("שְמָנִים", "fats, oils", MASCULINE, PLURAL),
        // 191
        new Word("חֲצֵרִים", "settlements, villages", true, MASCULINE, SINGULAR, PLURAL),
        // 190
        new Word("בְּהֵמָה", "beast", true, FEMININE),
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
        new Word("מִסְפָּר", "number", true, NOUN, MASCULINE), // 134
        new Word("סָפַר", "he counted", true), // 107
        new Word("רֵעַ", "friend, companion, fellow", true, MASCULINE),
        new Word("רֵעִים", "friends, companions, fellows", MASCULINE, PLURAL),
        // 185
        new Word("אָבַד", "he perished, he vanished, he became lost", true),
        // 184
        new Word("מִצְוָה", "commandment", true, FEMININE),
        new Word("מִצְוֹת", "commandments", FEMININE, PLURAL),
        // 183
        new Word("בָּקָר", "cattle, herd, ox", true, MASCULINE),
        // For plural see "mornings" above
        // 182
        new Word("רִאשׁוֹן", "first, former", true, ADJECTIVE, MASCULINE),
        new Word("רִאשֹׁנִים", "first, former", ADJECTIVE, MASCULINE, PLURAL),
        new Word("רִאשֹׁנָה", "first, former", ADJECTIVE, FEMININE),
        new Word("רִאשֹׁנוֹת", "first, former", ADJECTIVE, FEMININE, PLURAL),
        // 179
        new Word("זָקֵן", "old", true, ADJECTIVE, MASCULINE),
        new Word("זְקֵנִים", "old", ADJECTIVE, MASCULINE, PLURAL),
        new Word("זְקֵנוֹת", "old", ADJECTIVE, FEMININE, PLURAL),
        // 178
        new Word("הוֹשִׁיעַ", "he saved, delivered - ישׁע", true, HIPHIL),
        new Word("שָֹפָה", "lip, language, edge, shore", true, FEMININE),
        new Word("שְׂפָתַיִם", "lips, languages, edges, shores", FEMININE, DUAL),
        new Word("לָמָּה", "why?", true),
        // 174
        new Word("שָאַל", "he asked", true),
        // 173
        new Word("שָׁחָה", "he bowed down", true),
        // 170
        new Word("בָּחַר", "he chose, tested, examined", true),
        // 167
        new Word("הָרַג", "he attacked, he slew", true),
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
        new Word("פֶּתַח", "opening, doorway, entrace", true, MASCULINE),
        new Word("פְּתָחִים", "openings, doorways, entraces", MASCULINE, PLURAL),
        new Word("פָּתַח", "he opened", true), // 136
        // 162
        new Word("טָמֵא", "he was/became unclean", true),
        new Word("זֶבַח", "sacrifice", true, NOUN, MASCULINE),
        // 161
        new Word("אַיִל", "ram", true, NOUN, MASCULINE),
        new Word("בַּד", "alone", true),
        new Word("אַך", "only, surely, nevertheless", true),
        new Word("בַּעַל", "owner, master, husband, (divine title) Baal", true, MASCULINE),
        // 160
        new Word("נוּס", "he fled, he escaped", true),
        new Word("גִּּבּוֹר", true)
            .addForm("mighty man, hero, warrior", MASCULINE)
            .addForm("mighty", ADJECTIVE),
        // 156
        new Word("שָׂמַח", "he rejoiced, he was glad", true),
        // 153
        new Word("צָפוֹן", "north, northern", true, FEMININE),
        new Word("כָּסָה", "he covered", true),
        // 151
        new Word("נֶגֶד", "opposite, in front of", true),
        // 150
        new Word("נָגַע", "he touched, struck, escaped", true),
        // 149
        new Word("עֵדָה", "congregation, assembly", true, FEMININE),
        new Word("חָכְמָה", "wisdom", true, FEMININE),
        new Word("חָכָם", "wise", true, ADJECTIVE, MASCULINE, SINGULAR),
        new Word("חֲכָמִים", "wise", ADJECTIVE, MASCULINE, PLURAL),
        new Word("חֲכָמָה", "wise", ADJECTIVE, FEMININE, SINGULAR),
        new Word("חֲכְמוֹת", "wise", ADJECTIVE, FEMININE, PLURAL),
        // 148
        new Word("שָׁבַר", "he broke (up), smashed", true),
        new Word("שָׂנֵא", "he hated", true),
        // 147
        new Word("שְׁמֹנֶה", "eight", true, MASCULINE),
        new Word("שְׁמֹנִים", "eighty"),
        // 146
        new Word("נָסַע", "he pulled out, pulled up, set out, started out, departed, journeyed, marched", true),
        new Word("הִלֵּל", "he praised – הָלַל", true, PIEL),
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
        // 138
        new Word("סוּס", "horse", true, MASCULINE),
        new Word("סוּסִים", "horses", MASCULINE, PLURAL),
        // 137
        new Word("נַחַל", "stream, wadi", true, MASCULINE),
        // 135
        new Word("כִּסֵּא", "chair, throne", true, MASCULINE),
        new Word("הֵחֵל", "he began – חָלַל", true, HIPHIL),
        new Word("נִחָל", "he was defiled – חָלַל", true, NIPHAL),
        new Word("חִלֵּל", "he polluted, profaned – חָלַל", true, PIEL),
        // 134
        new Word("שֶׁמֶשׁ", "sun", true, MASCULINE),
        new Word("זָבַח", "he slaughtered, sacrificed", true),
        new Word("פָּנָה", "he turned", true),
        new Word("עֶרֶב", "evening, sunset", true, MASCULINE),
        // 133
        new Word("קָבַר", "he buried", true),
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
        new Word("אֶמֶת", "truth, fidelity", true, FEMININE), // see 96 for verb form
        new Word("קָבַץ", "he collected, gathered, assembled", true),
        // 126
        new Word("כֹּחַ", "strength, power", true, MASCULINE),
        new Word("עֶצֶם", "bone, skeleton", true, FEMININE),
        // 125
        new Word("בּוֹשׁ", "he was ashamed", true),
        new Word("נָגַשׁ", "he drew near, approached", true),
        new Word("חֵמָה", "wrath, heat, poison", true, FEMININE),
        new Word("חֲצִי", "half, middle", true, MASCULINE),
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
        new Word("שָׂרַף", "he completely burned, destroyed", true),
        // 115
        new Word("קִטֵּר", "he made sacrifices smoke (he offered a burned sacrifice) - קָטַר", true, PIEL),
        new Word("הִקְטִיר", "he made sacrifices smoke, he caused to smoke (in worship) - קָטַר", true, HIPHIL),
        // 114
        new Word("בָּכָה", "he wept (in grief or joy)", true),
        new Word("מִגְרָשׁ", "common land, open land, pasture", true, MASCULINE),
        // 113
        new Word("שֶׁקֶר", "deception, lie, disappointment", true, MASCULINE),
        // 112
        new Word("לָבַשׁ", "he put on a garmet, he clothed", true),
        new Word("בִּלְתּי", "not (with infinitive), except", true),
        new Word("לְבִלְתּי", "not (with infinitive)", true),
        new Word("עַמּוּד", "pillar, column", true, MASCULINE),
        // 111
        new Word("שַׁבָּת", "Sabbath, rest period", true, MASCULINE),
        new Word("הוֹדוּ", "they praised, gave thanks - " + "יָדָה" + " - he cast", true, HIPHIL, PERFECT, THIRD_PERSON, PLURAL),
        // 110
        new Word("עָפָר", "dry earth, dust", true, MASCULINE),
        // 109
        new Word("רַק", "only, still, but, however", true),
        new Word("כָּנָף", "wing, edge (uses dual for wings, standard feminine plural for edges)", true, FEMININE),
        // 108
        new Word("נִחַם", true)
            .addForm("he was sorry, moved to pity, had compassion", NIPHAL)
            .addForm("he comforted, consoled", PIEL),
        // 107
        new Word("כֶּבֶשׂ", "lamb, sheep", true, MASCULINE),
        // 106
        new Word("בָּמָח", "(cultic) high place, hill", true, MASCULINE),
        new Word("נוֹתַר", "he was left over, he remained - יָתַר", true, NIPHAL),
        new Word("הוֹתִיר", "he left - יָתַר", true, HIPHIL),
        // 104
        new Word("תָּמִיד", "continually", true),
        new Word("גָּאַל", "he redeemed, delivered, acted as kinsman, avenged", true),
        new Word("בַּעַד", "behind, through", true),
        new Word("חֻקָּח", "statute, ordinance", true, MASCULINE),
        new Word("חֻקּוֹת", "statutes, ordinances", MASCULINE, PLURAL),
        new Word("רָץ", "he ran רוּץ", true),
        // 102
        new Word("כִּפֶּר", "he covered over, pacified, made propitiation", true, PIEL),
        new Word("שָׁכַח", "he forgot", true),
        // 101
        new Word("רָעָב", "famine, hunger", true, MASCULINE),
        new Word("רֹחַב", "breadth, width", true, MASCULINE),
        new Word("מעַט", "a little, a few", true),
        // 100
        new Word("יַעַן", "on account of", true),
        new Word("הֵן", "behold", true),
        // 99
        new Word("עוֹר", "skin", true, MASCULINE),
        // 98
        new Word("שֵׁרֵת", "he served, he ministered to", true, PIEL),
        // 97
        new Word("שָׂבַע", "he was filled, satisfied", true),
        // for רעע see רע above
        // 96
        new Word("יַחְדָּו", "together, united", true, ADVERB),
        new Word("אָמַן", "he confirmed, supported", true),
        new Word("נֶאֱמַן", "he was made firm - root אמן", true, NIPHAL),
        new Word("הֶאֱמִין", "he trusted, believed - root אמן", true, HIPHIL),

        // 94
        new Word("טָהֵר", "to be clean, pure", true),

        // 82
        new Word("פֹּה", "here, at this place", true),

        // 78
        new Word("תֵּשַׁע", "nine", true, MASCULINE),
        new Word("תִּשְׁעִים", "ninety"),

        // 74
        new Word("חָפֵץ", "he delighted in, desired, was willing", true),

        // 71
        new Word("שָׁבַת", "he stopped, ceased, rested", true),

        // 64
        new Word("תָּמַם", "he be(came) complete, came to an end, ceased, was consumed, was spent, " +
            "was burned out", true),
        new Word("אָרַר", "he cursed", true),

        // 63
        new Word("אָחַז", "he seized, grasped, took", true),
        new Word("יָצַר", "he formed, fashioned, shaped, created", true),

        // 60
        new Word("בָּעַר", "he burned up, consumed", true),

        // 46
        new Word("יַחַד", "unitedness", true, MASCULINE, NOUN),

        // 44
        // טוֹב as a verb, see adjective form

        // 18
        new Word("רְבָבָה", "ten thousand", true)


    );
  }

  @Override
  public List<GrammarRule> buildRules() {
    List<GrammarRule> allRules = new ArrayList<>();
    allRules.add(new GrammarRule("Alphabet:\n" +
            "אבגדהוזחטיכלמנסעפצקרשׂשׁת" + "\n" +
            "Gutturals:  אעהח"));

    allRules.add(new GrammarRule("Vowels:\n" +
            "              a     e      i    o     u\n " +
            "long         " + " ָ      ֵ           ֹ      " + "\n" +
            "short        " + " ַ      ֶ      ִ     ָ      ֻ " + "\n" +
            "reduced      " + " ֲ      ֱ           ֳ       "));

    allRules.addAll(new GrammarRuleSet("Rules of Syllabification",
            "  1. Every syllable must begin with one consonant and have only one vowel.",
            "  2. Syllables are either open or closed.  Open end in a vowel, closed in a consonant.\n" +
            "  Hebrew words are usually accented on the last syllable.",
            "  3. Dagesh Forte letters count as two consonants for the purpose of syllabification.").toGrammarRules());


    allRules.addAll(new GrammarRuleSet("Syllable classification",
            "     a. Tonic: accented syllable (the one with the “tone”) דָבָר second syllable is tonic",
            "     b. Pretonic: syllable immediately before the tonic; first syllable above",
            "     c. Propretonic: syllable before the pretonic\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Differentiating Dagesh Forte and Dagesh Lene in בגדכפת letters",
            " * The Dagesh is Forte if it is preceded by a vowel. אַתּה",
            " * The Dagesh is Lene if preceded by a consonant. מַלְכּה",
            " * The Dagesh is Lene at the beginning of the word unless the previous word ends in a vowel. דָּבָר").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Silent Schewa and Vocal Schewa",
            "The Vocal Schewa will always occur in an open syllable.",
            " * The Schewa is vocal if not immediately preceded by a short vowel.  Implies:\n" +
            "   * Initial Schewa is always vocal. בְּרָכָה\n" +
            "   * The second of two contiguous Schewas is vocal.\n" +
            "   * A Schewa under any consonant with Daghesh Forte is vocal. הַמְּלָכִים\n" +
            "   * A Schewa after an unaccented long vowel is vocal. כֹּתְבִים",
            "The Silent Schewa will always come at the end of a closed syllable.\n" +
            " * The Schewa is silent if the previous vowel is short.  Implies:\n" +
            "   * A Schewa is silent when immediately preceded by a short vowel. פַּרְעֹה\n" +
            "   * The first of two contiguous Schewas is silent. מִשְׁפְּטֵי\n" +
            "   * A Schewa at the end of a word is silent. כָּתַבְתְּ\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Qamets and Qamets Hatuf \n" +
            "Both little T, Qamets long as in father, Qamets Hatuf short as in ‘lot’.  Rules for distinguishing:",
            " * When in doubt, go with Qamets as it is much more frequent",
            " * Qamets Hatuf occurs only in closed and unaccented syllables. חָכְמָה (first syllable)",
            " * Qamets prefers open, pretonic syllable or closed accented syllable. דָּבָר (both syllables)",
            " * Metheg, small vertical line to the left of the Qamets, sometimes used to clarify that it is a Qamets.").toGrammarRules());

    allRules.add(new GrammarRule("Furtive Pathach\n" +
          " When a word ends in ח or ע , a Pathach (horizontal line) may appear beneath this\n" +
          "consonant and must be pronounced before the guttural rather than after."));

    allRules.add(new GrammarRule("Diphthong\n" +
          "Most common Hebrew diphthong is" + " ַיִ  " + "\n" +
          "Syllables that contain a diphthong are considered to be closed because they end in a consontant."));

    allRules.addAll(new GrammarRuleSet("Vowel Syllable Preferences",
            " * Short vowels prefer closed, unaccented syllables or open, accented syllables. Both syllables in עֶבֶד",
            " * Long vowels prefer closed, accented syllables or open, pretonic syllables.  Both syllables in" + " דָּבָר\n" ,
            " * Vocal Shewa and reduced hateph vowels prefer open, propretonic syllables.  The\n" +
            "   reduced vowels appear with guttural consonants in the open, propretonic position.",
            "   First syllable in דְּבָרִים  and אֱלֹהִים").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Gender Endings",
            "Masculine Singular: anything",
            "Feminine Singular: " + " ָה ַת ֶת  ִית וּת" + "\n" +
            "Masculine Plural: " + " ִים " + "\n" +
            "Feminine Plural: וֹת\n" +
            "Masculine Dual:" + " ַים " + "\n" +
            "Feminine Dual: תַיִם or same as masculine\n",
          "Exceptions to Gender Ending Rules\n" +
          " 1. Some feminine nouns are endingless.\n" +
          " 2. Some nouns use plural endings from the other gender (e.g. אב שנה)\n" +
          " 3. Special dual nouns: שָׁמַיִם מִצְרַיִם מַיִם  These are always dual.\n" +
          " 4. Some nouns go through irregular stem change in the plural:  אנשים איש  נשים אשה\n" +
          " 5. Some feminine pluralizations will appear with defective spelling תֹ instead of וֹת").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Patterns of Pluralization",
          " 1. Pluralization with no change: some nouns do not change their vowels when being\n" +
          "    made plural.  Often happens with monosyllabic words with an unchangeable long\n" +
          "    vowel: שִׁיר to שִׁירִים \n" +
          "    Also happens with two syllable words with shewa or hateph\n" +
          "    pathach in first syllable and unchangeable long vowel in second:\n" +
          "    חֳלוֹם to חֳלוֹמוֹת and רְהוֹב to רְהוֹבוֹת\n",
          " 2. Two syllable nouns that are accented on the final syllable and have Qamets or\n" +
          "    Tsere pretonic syllable will experience propretonic reduction.  Qamets/Tsere will\n" +
          "    be replaced by Shewa.  דָּבָר -> דְּבָרִים and לֵבָב -> לְבָבוֹת\n" +
          "    If the initial consonant is gutteral it will move to Hateph Patach.  עָנָן –> עֲנָנִים\n" +
          "    Nouns with vowel letters do not experience propretonic reduction.\n",
          " 3. Segholate nouns are nouns with accent on the first syllable, so called because in\n" +
          "    most cases one or both vowels are a Seghol.  These pluralize with a Shewa in the\n" +
          "    first syllable (or Hateph vowel for gutturals) and a Qamets in the second:  מֶלֶךּ –> מְלָכִים and חֶרֶב –> חֲרָבוֹת\n",
          " 4. Pluralization of Geminate nouns.  Geminate nouns appear to have only 2 root\n" +
          "    consonants (e.g. עַם).  Actually they originally had 3, with the third duplicating\n" +
          "    the second.  These pluralize with Dageshe Forte in the second \n" +
          "    consonant. עַם –> עַמִּים  Not all biconsonantal nouns are geminate, for example אָב\n" +
          " 5. Irregular pluralization.  Many nouns are irregular in their pluralization.").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("The Rules of Shewa",
          " 1. Hebrew does not allow two contiguous vocal schewas.  If prefixing a preposition\n" +
          "    with a shewa to a word that starts with a schewa, first schewa becomes a\n" +
          "    hireq. נְבִיאִם plus לְ becomes לִנְבִיאִם\n" +
          "    Exception: If the syllable begins with י, after combining the י does not take a\n" +
          "      shewa: יְהוּדָה plus לְ becomes לָיהוּדָה.",
          " 2. Vocal schewa cannot proceed a guttural with a reduced vowel.  The first vocal\n" +
          "    schewa converts to the short vowel that corresponds to the reduced vowel it\n" +
          "    proceeds.  חֲלוֹם plus בְּ becomes בַּחֲלוֹם\n" +
          "    Exception: In אֱלֹהִים  the shortened vowel under א  is removed.  Thus אֱלֹהִים plus לְ becomes לֵאלֹהִים").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Definite Article",
            " * Definite Article is הַ plus a Dagesh Forte in the first consonant of the noun",
            " * When the first consonant is a בגדכפת consonant the Dagesh Lene in the בגדכפת becomes a Dagesh Forte",
            " * When first consontant is a guttural, Dagesh Forte is rejected",
            "   * When the first consonant is א or ע or ר the Patach lengthens to a Qamets, הָ",
            "   * When the first consonant is ה or ח the Dagesh Forte is dropped.  This is\n" +
            "     referred to as \"virtual doubling\"",
            "   * Before nouns that begin with an unaccented עָ or הָ or חָ (last can also be\n" +
            "     accented), the definite article becomes Seghol הֶ",
            " * A few words change their initial vowel to Qamets, e.g. אֶרֶצ becomes הָאָרֶצ").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Additional meanings of the definite article:",
            " * Demonstrative (this/that): אנכי מצוך היום - I am commanding you the[this] day",
            " * Vocative, indicating direct address: ויקרא לאמר המלך - And he called saying the[O] king",
            " * Superlative with an adjective: הטוב והישׁר - the good[best] and the upright[most upright]",
            " * Possessive pronoun: ולקח דוד הכנור - And David took the[his] harp").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Conjunction ו (and, but, also, even)",
            " * Most frequently spelled וְ",
            " * Becomes Shureq וּ \n" +
            "   * before ב, מ, פ (bump rule), ב פ loose Dagesh lene in this case בּיִת becomes וּבַיִת \n" +
            "   * before a vocal Shewa נְעָרִים becomes וּנְעָרִים",
            " * Before Hateph vowel, conjunction takes the corresponding short vowel אֲנָשׁים becomes וַאֲנָשׁים  \n" +
            "   * Exception, does not apply to אלהים",
            " * May be spelled with Qamets before monosyllabic words or words with initial accent צֹאן becomes וָצֹאן\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Inseparable prepositions",
            "* Before most consonants will appear with a vocal Shewa ּּּבְשָדֶה",
            "* Before a Hateph vowel will take the corresponding short vowel כַּאֲנָשִׁים",
            "* Before a vocal Shewa will take a Hireq לִנְבִיאִים",
            "* When combined with a definite article replaces the ה and takes its vowel ּבַשָּׂדֶה\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("The preposition מִן",
            " * Frequently is joined to its object via a Maqqef (-)",
            " * Can occur as an inseparable preposition, in which case the first consontant of\n" +
            "   the noun to which it is prefixed usually takes a dagesh forte: מִמֶּלֶך",
            "   * When the first letter is a begadkephat letter with a dagesh lene, the dagesh\n" +
            "     lene becomes a dagesh forte\n" +
            "   * When the first letter is a gutteral, the hireq under מ lengthens to a tsere\n" +
            "     e.g. מֵאִישׁ\n" +
            "   * When the first letter is ח there is not usually vowel lengthening.\n",
            "   * (Beyond from) Comparative use: applied to adjective to make it comparative\n" +
            "     e.g. טוֹבָה חָכְמָה מִזָּהָב wisdom is better than gold\n" +
            "   * (Beyond from) Superlative use: used with כּל to express superlative\n" +
            "     e.g. עָרוּם מִכֹּל חַיַּת הַשָּׂדֶה the most clever living thing of the field\n" +
            "   * (Beyond from) Partitive use: Can mean a part of something: מֵהָאֲנָשִׁים some of the men").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Preposition plus פנה (face)",
            "   * before, in the precense of: לִפְנֵי",
            "   * away from, out from, from before, on account of: מִפְּנֵי and מִלִּפְנֵי",
            "   * in the face, in the sight of, before, up against, opposite to: עַלֿֿ-פְּנֵי\n").toGrammarRules());

    allRules.add(new GrammarRule("Preposition plus דבר\n" +
            "   * on account of עַל-דְּבַר"));

    allRules.addAll(new GrammarRuleSet("Adjectives can be attributive, predictive, or substantive",
            " * Attributive: modifies a noun.  Attributive adjectives follow the noun they\n" +
            "   modify and agree in gender, number, and definiteness.\n",
            " * Predicative: asserts something about the noun, e.g. the book is big.\n" +
            "   No verb is used.  Predicative adjectives agree with the noun in gender and number\n" +
            "   but not definiteness.  They may proceed or follow the noun.",
            " * Substantive: no noun present, stands for those who have the trait (e.g. the wise)").toGrammarRules());

        // TODO - need to understand the difference in how these are translated.
    allRules.addAll(new GrammarRuleSet("Demonstratives as adjectives and pronouns",
            " * When a demonstrative is functioning as an adjective, it will follow the noun\n" +
            "   it modifies and agree in gender, number, and definiteness. האיש הזה\n" +
            "   * Attributive adjective (if present) will be between the noun and the following\n" +
            "     demonstrative: האיש הטוב הזה",
            " * When a demonstrative is functioning as a pronoun, it will precede the noun and\n" +
            "   agree in gender and number but not definiteness. זה האיש\n" +
            "   * Attributive adjective (if present) will still follow the noun: זה האיש הטוב").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Spelling for interrogative particle הֲ",
            " * Prefixed to a guttural consonant or any consonant with a shewa: הַ",
            " * Prefixed to a guttural consonant followed by a qamets: הֶ").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Disambiguating the definite article and the interrogative particle",
            " * The interrogative particle does not usually have a dagesh forte in the next consonant",
            " * The interrogative particle is often attached to a verb or another particle",
            " * The definite article is never spelled with a hateph patach").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Pronominal suffixes",
            " * When attached to a noun they indicate possessive.",
            " * When attached to a preposition or the definite direct object marker they are objective.",
            " * Come in types 1 and 2:\n" +
            "   * Type 1 is used with singular nouns, some prepositions, and the direct object marker.\n" +
            "   * Type 2 is used with plural nouns and some prepositions.\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Spelling changes for pronominal suffixes",
            " * Singular nouns can take plural pronominal suffixes (e.g. my horses) and vice versa.",
            " * When attached to masculine (or feminine endingless) plural nouns, the ים is dropped",
            " * Nouns ending segol ה (e.g. שָׂדֶה ) will drop the segol ה before adding the\n" +
            "   pronominal suffix: שׂדִי my field",
            " * Feminine singular nouns ending in patach ה the ה changes to ת before the ending\n" +
            "   is applied.",
            " * Many monosyllabic nouns add י to their stem before a pronominal suffix.  Can be\n" +
            "   distinguished in the singular (type 1) by the hireq before the י\n",
            " * The preposition כְּ changes to כָּמוֹ in singular and first person plural when\n" +
            "   taking a pronominal suffix.",
            " * The preposition מִן changes to מִמֶ in singular and first person plural when\n" +
            "   taking a pronominal suffix.\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Distinguishing similar words with pronominal suffixes",
            " * Direct object marker and אֵת/אֶת are the same alone but differ with pronominal\n" +
            "   suffix.  Direct object marker has a holem: אֹתֵי while the preposition has hireq\n" +
            "   and dagesh forte: אִתִּי",
            " * Preposition עִם and noun עַם both keep their first vowels throughout, both add\n" +
            "   dagesh forte in mem.").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Construct chains",
            " * Roughly equivalent to Greek genitive case.",
            " * Last noun in the chain is in an absolute state, all others are in construct state.",
            " * No other words can come between the nouns in a construct chain.",
            " * A construct chain is either entirely definite or entirely indefinite.  When\n" +
            "   definite only the absolute noun takes the definite article or has a\n" +
            "   pronominal suffix or is a proper noun.",
            " * Adjectives that modify any noun in the chain come after the chain.  Number and\n" +
            "   gender of the adjective can sometimes determine which noun it modifies, sometimes\n" +
            "   you must use context.  This applies to demonstratives adjectives (this, that) as well.",
            " * Substantive adjectives functioning as a noun can form part of the construct chain.",
            " * Inseparable prepositions can be attached to construct nouns.",
            " * A noun can be made superlative by placing it in a construct chain\n" +
            "   with the construct noun singular and the absolute noun plural and definite:\n" +
            "   e.g. קֹדֶשׁ הַקֱּדָשִׁים the holy of holies, or the most holy [place].").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Spelling in construct state",
            " * A construct noun surrenders its primary accent.  A construct chain is pronounced\n" +
            "   as a single word, with the accent on the absolute noun.  This is sometimes\n" +
            "   marked with a maqqef (-).",
            " * Masculine plural and both dual endings change to" + " ֵי " + " e.g. אֱלֹהִים changes to אֱלֹהֵי ",
            " * Vowel reduction:\n" +
            "   * Qamets (and sometimes tsere) change to patach in a final closed syllable:\n" +
            "     e.g. מִשְׁפָּט changes to מִשְׁפַּט\n" +
            "   * Qamets or tsere change to vocal shewa in open, unaccented syllable:\n" +
            "     (or a hateph vowel under a gutteral): נָבִִיא changes to נְבִיא \n" +
            " * Feminine singular nouns ending in" + " ָה " + "changes to" + " ַת " + "\n" +
            "   e.g. תּוֹרָה becomes תּוֹרַת",
            " * Some monosyllabic nouns add a hireq yod in the contruct state.").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Cardinal numbers",
            " * 'one' acts as an adjective and comes after the noun and agrees in gender and\n" +
            "   definiteness.  Can be used in a construct in which case it means 'one of'.",
            " * 'two' is a noun, agrees in gender with the modified noun, and can be used in\n" +
            "   absolute or construct state with no change in meaning.",
            " * 3-10 are nouns but take opposite gender from what they are modifying.  Can also\n" +
            "   be absolute or construct.",
            " * 2-10 can have a pronominal suffix, meaning 'x of y', e.g. שְׁנֵיהֶם 'two of them'",
            " * 11-19: x 10, e.g. אַחַתּי עָשָׂר is 11",
            " * 11-19: 10 agrees with modified noun in gender, while other number is opposite.",
            " * 20: Masculine plural of 10",
            " * 30-90: Masculine plural of 3-9",
            " * 21-99: x and y: עֶשְׂרִים וְאַחַת twenty and one\n",
            " * 200: one hundred dual: מָאתַים",
            " * 300-900: x 100, e.g. שְׁלֹשׁ מֵאוֹת three hundred",
            " * 2000: one thousand dual: אַלְפַּיִם",
            " * 3000-9000: x 1000, e.g. שְׁלֹשֶׁת אֶלֶף",
            " * 20,000: ten thousand dual: רִבּוֹתַיִם",
            " * 30,000-90,000: x 10,000, e.g. שְׁלֹשׁ רִבּוֹת").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Ordinal numbers",
            " * Classified as adjectives, when attributive they follow the noun they modify\n" +
            "   and usually agree in gender and definiteness.",
            " * For ordinals greater than tenth, cardinal numbers are used.").toGrammarRules());

    allRules.add(new GrammarRule("Basic verbal stem meaning:\n" +
            "           Simple    Intensive   Causative\n" +
            "Active     qal       piel        hiphil\n" +
            "Passive    niphal    pual        hophal\n" +
            "Reflexive  niphal    hithpael"));

    allRules.addAll(new GrammarRuleSet("Hebrew verb conjugations:",
            " * Perfect:  completed action, state of being.",
            " * Imperfect:  incomplete action, habitual or customary actions, subjunctive.",
            " * Imperative: direct command, sometimes request, second person only.",
            " * Cohortative: wish, request, or command, can express purpose or result, first person only",
            " * Jussive:  mild command or strong wish, third person only",
            " * Infinitive construct: like an English infinitive, a verbal noun.",
            " * Infinitive absolute: used with other verbs to emphasize or intensify action or to\n" +
            "   express contemporaneous action.  Can be used as an imperative.",
            " * Participle:  verbal adjective.").toGrammarRules());

        // TODO need to align these so they look better; probably don't need every declination; add some examples from imperfect.
    allRules.add(new GrammarRule("Stative verbs often have tsere (..) or holem (o) in second vowel.\n" +
            "In the imperfect they have pathach (_) instead of holem in the second vowel.\n" +
            "           Tsere    Holem    Strong\n" +
            "           Stative  Stative    Verb\n" +
            "Perfect        " + "קָטַל     קָטֹן      כָּבֵד" + "\n" +
            "Imperfect      " + "יִקְטֹל    יִקְטַן    יִכְבַּד" + "\n" +
            "No idea why the dagesh jumps from consontant כ to ב in כבד imperfect."));

        // TODO these need examples
    allRules.addAll(new GrammarRuleSet("Strong verbs have three strong consonants.",
            " * I-Guttural",
            " * II-Guttural",
            " * III-Guttural, broken into III-ח/ע, III-א, and III-ה (really III-י but י changes to ה in many forms)",
            " * I-י",
            " * I-נ",
            " * Doubly weak (two of the above)",
            " * Biconsonantal (also called hollow or II-ו/י) these drop middle letter in perfect",
            " * Geminate - identical 2nd and 3rd consonants.").toGrammarRules());

    allRules.add(new GrammarRule("Verb frequencies:  72K total verbs in OT\n" +
            " Qal:       50,699\n" +
            " Hiphil:     9,496\n" +
            " Piel:       6,473\n" +
            " Niphal:     4,138\n" +
            " Hithpael:     842\n" +
            " Pual:         423\n" +
            " Hophal:       396\n"));

   allRules.addAll(new GrammarRuleSet("Uses of הִנֵּה:",
            "* add emphasis or stress (demonstrative interjection):\n" +
            "  " + "הִנֵּה עֵיר יְהוָה אֶל–יְרֵאָיו" + "  Behold, the eye of the LORD is upon those who fear him",
            "* indicate the immediate presence of someone or something with an emphasis on\n" +
            "  immediacy or urgency:\n" +
            "  " + "וַהִנֵּה אָנֹכִי עִמָּך" + "  And he said, behold, here I am",
            "* may be used to introduce a fact or situation on which a subsequent statement is based\n" +
            "  Behold, I have listened to all that you have said to me and [therefore] I have\n" +
            "  caused a king to reign over you").toGrammarRules());

        // TODO check the thing about the dagesh, I'm not sure that's right
   allRules.addAll(new GrammarRuleSet("Waw consecutive is וַ with dagesh in following letter.",
            "*  Imperfect can still take non-consecutive waw to mean simple and, וְ",
            "*  Waw consecutive imperfect chain can start with וַיְהִי (and it was) meaning 'after'",
            "*  Waw consecutive perfect chain can start with וְהִיִה 'and it will be'",
            "*  Waw consecutive perfect used after imperative to continue imperative chain\n" +
            "   and should be translated as imperative",
            "*  Perfect prefixed with waw in chain of perfects NOT waw consecutive").toGrammarRules());

   allRules.addAll(new GrammarRuleSet("Imperative is not negated, instead use negative with imperfect",
            "*  To express permanent prohibition: לֹא plus imperfect",
            "*  To express temporary prohibition: אַל plus imperfect.",
            "*  Cohortative and jussive negated with אַל, a milder form of prohibition than לֹא").toGrammarRules());

    allRules.add(new GrammarRule("Imperative sometimes followed by נָא, which can be translated \"please\""));

    allRules.add(new GrammarRule("Cohortative expresses a wish, request, or command, but only in first person.  Often \n" +
            "translated with 'let me' or 'may we'."));

    allRules.add(new GrammarRule("When verb with imperfect first person form begins a clause, it is generally cohortative."));

    allRules.addAll(new GrammarRuleSet("Jussive expresses a wish, request, or command, but only in third person",
        "Often translated with 'let him' or 'may she'.",
        "When verb with imperfect third person form begins a clause, it is generally jussive.\n" +
        "In general jussive is same as 3 person imperfect.",
        "In some weak verb forms, especially III-ה and hiphil final consonant is often dropped in jussive").toGrammarRules());

    allRules.add(new GrammarRule("Pronominal suffixes on verbs can be used to express a pronoun as the direct object of\n" +
            "the verb.  This can also be done by attaching the pronoun to the direct object marker את\n" +
            "Type 1 pronominal suffixes are used."));

    allRules.add(new GrammarRule("Pronominal suffixes on imperfect weak III-ה verbs drop the ה\n:" +
            "יִרְאֶה" + "  +  " + "נָּה" + "  becomes " + "יִרְאֶנָּה" + "  he will see her"));

    allRules.add(new GrammarRule("Pronominal suffixes on imperative same as imperfect except 2ms for is קָטְל instead" +
        " of קְטְל\n\n2fs imperative with pronominal suffix very rare and 2fp not attested\n" +
            "קָטְלֵ הוּ" + "      kill him!\n"));

    allRules.add(new GrammarRule("Infinitives (both construct and absolute) are verbal nouns"));

    allRules.add(new GrammarRule("Infinitive is negated with לְבִלְתּי "));

    allRules.addAll(new GrammarRuleSet("Infinitive construct functions much like the English infinitive",
        "Can take pronominal suffixes.  These suffixes can serve as the\n" +
        "  'subject' or object of the infinitive, e.g. קָטְלוֹ can mean 'his killing' or 'killing him'",
        "* with ל " +
        "   can indicate purpose, intention, or result:\n    " +
        "וַיִּקַּה אֶת–הַמַּאֲכֶלֶת ––לִשְׁחט—— אֶת–בּנו  " +
        "\n    And he took the _in order to slaughter_ his son",
        "* with ל " +
        "  can be inceptive (often with היה), meaning it indicates something that is about to happen:\n    " +
        "וַיְהִי הַשֶּׁמֶשׁ ––לָבוֹא––  " + "    The sun was about _to set_",
        "* with ל " +
        "  can be used to denote sequence of verbal actions or obligation or necessity.  These are less common.\n",
        "* can act as a verbal noun:  " + "טוֹב ––לְהֹדוֹת–– לַיהוָה " + "It is good _to praise_ the LORD",
        "* can be complementary.  That is, it works to explain, clarify, or complement a preceding action or statement.\n" +
        "  In such cases the best English translation is often a finite verb:\n  " +
        "וְשָׁמַרְתָּ אֶת–מִצְוֹת יְהוָה אֱלֹהֶיךָ ––לָלֶכֶת–– בִּדְרָכָיו  " +
        "\n  And you shall observe the commandments of the LORD your God _by walking_ in his ways.",
        "* with בְּ or כְּ and often a pronominal suffix indicate temporality (while, when).  Often these are paired \n" +
        "  with וַיְהִי (and he was) or וְהָיָה (and he will be) (remember waw consecutive) to indicate perfect or imperfect.\n  " +
        "וַיְהִ בִּהְיוֹתָם בַּשָּׂדֶה  " + "When they were in the field").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Common uses of infinitive absolute:",
            "* Emphatic:  will immediately precede (rarely follow) a im/perfect of the same\n" +
            "  root to emphasize the verb:" + "  אָמוֹר אָמַרְתִּי " + "I have surely said",
            "* Imperatival:  can stand alone and function as imperative:\n" +
            "  זָכוֹר אֶת–הַיּוֹם הַזֶּה " + "  Remember this day!",
            "* Contemporaneous action: two infinitives absolutes and a im/perfect of the same\n" +
            "  root as one infinitive expresses contemporary action:\n" +
            "  וַיֵּלֶך הָלוֹך וְאָכֹל " + " and they walked, eating as they went",
            "* Complementary: may complement the main verb and carry the temporal value\n" +
            // TODO figure out the examples
            "  of that verb (no example given because I don't understand the examples)").toGrammarRules());

        // I'm not drunk, this spacing makes it come out right in the display
    allRules.addAll(new GrammarRuleSet("Qal perfect weak verbs, some switch to double kamatz, biconsonental just have single kamatz:\n" +
            "Strong              " + "קָטַל" ,
            "III-" + "מָצָא               א" ,
            "III-" + "בָּנָה               ה" ,
            "Biconsonental        " + "קָם" ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Qal imperfect weak verbs.  Many switch second vowel to patach (though these often have\n " +
            "forms where they retain the holem.  Where necessary schwa changes to shortened vowel under initial\n" +
            "guttural.  Final guttural causes changes in the second vowel.  Biconsonentals maintain their middle long vowel.\n" +
            "Strong              " + "יִקְטֹל" ,
            "I-" + "יֶאֱסֹר                 א" ,
            "I-" + "יֹאמַר                 א" ,
            "I-" + "יֶחֱזַק                 ח" ,
            "I-" + "יֵלֵך                  י" ,
            "I-" + "יִירַשׁ                 י" ,
            "I-" + "יִפֹּל                  נ" ,
            "I-" + "יִקַּח                  נ" ,
            "I-" + "יַעֲמֹד                 ע" ,
            "II-Gutteral         " + "יִבְחַר" ,
            "III-" + "יִמְצָאָ               א" ,
            "III-" + "יִבְנֶה               ה" ,
            "III-" + "יִשְׁלַח             ע/ח" ,
            "Biconsonental       " + "יָקוּם" ,
            "Biconsonental       " + "יָבוֹא" ,
            "Biconsonental       " + "יָשִׂים" ,
            "Geminate             " + "יָסֹב" ,
            "Geminate             " + "יֵתַם" ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Qal imperative weak verbs.  Many switch second vowel to patach (though these often have\n" +
            "forms where they retain the holem.  Initial yodh and nun disappear.  Biconsonental all have holem\n" +
            "waw as middle vowel.\n" +
            "Strong              " + "קְטֹל" ,
            "I-" + "אֱמֹר                 א" ,
            "I-" + "חֲזַק                 ח" ,
            "I-" + "לֵך                  י" ,
            "I-" + "רַשׁ                  י" ,
            "I-" + "נְפֹל                 נ" ,
            "I-" + "קַח                  נ" ,
            "II-Gutteral         " + "בְּחַר" ,
            "III-" + "מְצָא               א" ,
            "III-" + "בְּנֵה               ה" ,
            "III-" + "שְׁלַח             ע/ח" ,
            "Biconsonental       " + "קוּם" ,
            "Geminate             " + "סֹב" ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Qal infinitive construct weak verbs.  Initial yodh drops the yodh and add taw at the end.\n" +
            "Initial gutturals change initial schwa to shortened vowel.  Final heh changes to holem waw taw.\n" +
            "Final heth gets a patach.  Biconsonental verbs keep their middle long vowel.\n" +
            "Strong              " + "קְטֹל" ,
            "I-" + "אֱמֹר                 א" ,
            "I-" + "לֶכֶת                 י" ,
            "I-" + "עֲמֹד                 ע" ,
            "III-" + "בְּנוֹת              ה" ,
            "III-" + "שְׁלֹחַ             ע/ח" ,
            "Biconsonental       " + "קוּם" ,
            "Biconsonental       " + "בוֹא" ,
            "Biconsonental       " + "שׂים" ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Qal infinitive absolute weak verbs.  Final heh has holem rather than holem waw.\n" +
            "Biconsonental all have holem waw for middle vowel.\n" +
            "Strong              " + "קָטוֹל" ,
            "III-" + "בָּנֹה                ה" ,
            "Biconsonental        " + "קוֹם" ,
            "Biconsonental        " + "בוֹא" ,
            "Biconsonental        " + "שׂוֹם" ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Qal participle weak verbs.  Final heh second vowel changes to segol.  Final guttural\n" +
            "third vowel, patach added to guttural.  Biconsonentals drop their middle vowel.\n" +
            "Strong              " + "קֹטֵל" ,
            "III-" + "בֹּנֶה               ה" ,
            "III-" + "שֹׁמֵעַ             ע/ח" ,
            "Biconsonental        " + "קָם" ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Participle יֵשׁ:",
            "* Is not inflected",
            "* Can express existence: יֵשׁ מֶלֶך there is a king, or a king is",
            "* Followed by preposition לְ indicates possession: יֶשׁ–לִי תִקְוָה I have hope").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Participle אֵין (sometimes spelled אַיִן)",
            "* Is not inflected",
            "* Can take pronominal suffixes",
            "* can express non-existence: אֵין לוֹ בֵּן he had no son",
            "* Can negate a verbless clause: אֵינָם יְרֵאִים אֶת–יְהוָה They do not fear the LORD").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Participles can be attributive, predicative, or substantive",
            " * attributive, meaning they can directly modify a noun:\n    " +
            "הָעָם הֵיֹּשֵׁב בָּאָרֶץ " +
            " the people dwelling [or who dwell] in the land",
            " * predicative, meaning they assert or predicate something about the noun:\n    " +
            "וְהָהָר בֹּעֵר בָּאֵשׁ " + "  And the mountain was burning with fire",
            " * substantive, meaning they act as a noun.  In this situation they can take a direct object, be part of a\n" +
            "   construct chain, or take a pronominal suffix.",
            "הַיּוֹשֶׁבֶת בַּגַּנִּים " + "the one who dwells in the gardens").toGrammarRules());

    allRules.add(new GrammarRule("Qal passive participle.  All but III-ה follow the strong pattern\n" +
            "III-ה verb:\n" +
            "             Singular         Plural\n" +
            "                 " + "בְּנוּיִים         בָּנוּי" + "\n" +
            "                " + "בְּנוּיוֹת         בְּנוּיָה"));

    allRules.add(    new GrammarRule("Participles, because they behave like nouns, can take a definite article,\n" +
            "prepositional prefix (ל, ב, כ), or pronominal suffix.  They may also occur in a construct chain in the construct state."));

    allRules.add(    new GrammarRule("Standard Hebrew word order is VSO\n" +
            "In the object section, direct and indirect object can come in any order\n" +
            "Indirect object usually marked with לְ or -אֶל"));

    allRules.addAll(new GrammarRuleSet("Verb tense and sentance order: \n" +
            "* When a perfect verb is describing a completed action it is usually proceeded\n" +
            "    by a time clause or other explanatory clause.\n" +
            "* A consecutive perfect is normally the first word in its clause.\n" +
            "* A regular imperfect is not normally the first word in the clause.\n" +
            "* A consecutive imperfect is always the first word in its clause\n" +
            "* A jussive or cohortative (aka volitional imperfect) is normally the first word in its clause.").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Sequences with volational conjugations:\n" +
            "* Imperatives can occur in succession, possibly linked by ו.  This linkage can consequential or sequential:\n" +
            "  e.g.  עֲלֵח וּקְבֹר אֶת–אָבִיךָ Go up and bury your father.\n" +
            "* An imperative may be followed by a consecutive perfect.  The perfect may carry the full force of the imperative:\n" +
            "  e.g. לֵך וְאָמַרְתָּ אֶל–עַבְדִּי Go and say to my servant...\n" +
            "* An imperative may be followed by an imperfect or cohortative, creating a purpose or result clause:\n" +
            "  e.g. בֹּא הֵנָּה וְאֶשְׁלְחָה אֹתְךָ אֶל–הַמֶּלֶך Come here so that I may send you to the king.").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Conditional clauses, if/then protasis/apodosis.  Protasis often begins with one of\n" +
            "אִם כִּי הֵן אֲשֶׁר" +
            "\n and the apodosis often begins with וְ\n" +
            "אִם–תֵּלְכִי עִמִּי וְהָלָכְתִּי" +
            "\n if you go with her, then I will go").toGrammarRules());

    allRules.add(new GrammarRule("Causal clause, indicates cause of another clause.  Often begins with כִּי or אֲשֶׁר\n" +
            "קְדֹשִׁים תִּהְיוּ כִּי קָדוֹשׁ אֲנִי" +
            "\n You will [must] be holy because I am holy"));

    allRules.add(new GrammarRule("Purpose clause, indicates the purpose of the action of the subject of another clause.\n" +
            "Can begin with לְמַעַן so that, בּעֲבוּר so that,  אֲשֶׁר so that, לְבִלְתִּי so that not, or לְמַעַן לֹא so that not\n" +
            "וְשָׁמַרְתָּ לַעֲשׂוֹת אֲשֶׁר יִיטַב לְךָ " +
            "\nAnd you will be careful to do so that it will go well with you."));

    allRules.add(new GrammarRule("A result clause states something that is true because of another clause.\n" +
            "Often begins with Waw consecutive verb or כִּי\n" +
            "וַיֹּאמֶר יוֹאָב יָקֻמוּ וַיָּקֻמוּ" +
            "\nAnd Joab said, 'Let them arise!', so they arose"));

    allRules.add(new GrammarRule("A concessive clause states something that might be thought to prevent another clause, but does not.\n" +
            "Often marked by אִם, or גַּם or גַּם כִּי or וְ or כִּי or עַל, all of which can be transalted 'although', or 'even though'\n" +
            "גַּם כִּי–אֵלֵך צַלְמָוֶת לֹא–אִירָא רָע" +
            "\nEven though I walk through the valley of the shadow of death, I will not fear evil"));

    allRules.addAll(new GrammarRuleSet("ו:"  + " can be conjunctive or disjunctive",
            "* Conjunctive is usually prefixed to a verb and links clauses sequentially, temporally, logically, or consequentially.",
            "* Disjunctive is prefixed to a non-verb and is non-sequential; it introduces some kind of break in the narrative.",
            "  Disjunctive meaning can be parenthetical, provides a parenthetical explanation or comment:\n    " +
            "וְהֵם לֹא יָדְעוּ כִּי שֹׁמֵעַ יוֹסֵף כִּי הַמֵּלִיץ בֵּינֹתָם" +
            "\n    Now they did not know that Joseph was understanding them, for there was an interpreter between them.",
            "  Disjunctive meaning can be circumstantial, gives circumstantial information\n    " +
            "וַיְהִי כְּהַיּוֹם הַזֶּה וַיָּבֹא הַבַּיְתָה לַעֲשׂוֹת מְלַאכְתּוֹ => וְאֵין אִישׁ מֵאַנְשֵׁי חַבַּית שָׁם בַּבָּיִת" +
            "\n    And one day, he went into the house to do his work, => and none of the household servants were there in the house",
            "  Disjunctive meaning can be contrastive, gives a contrasting idea\n    " +
            "וַיִּשַׁע יְהוָה אֶל–הֶבֶל וְאֶל–מִנְחָתוֹ => וְאֶל–קַיִן וְאֶל–מִנְחָתוֹ לֹא שָׁעָה" +
            "\n    The LORD looked favorably on Abel and his offering, => but on Cain and his offering he did not look favorably",
            "  Disjunctive meaning can be introductory, begins a new narrative or introduces a new idea or theme\n    " +
            "וְהַנָּחָשׁ הָיָה עָרוּם מִכֹּל חַיַּת הַשָּׂדֶה אֲשֶׁר עָשָׂה יְהוָה אֱלֹהִים" +
            "\n    Now the serpent was more crafty than any creature that the LORD God had made").toGrammarRules());

    allRules.add(new GrammarRule("Adverbs of time: עַתָּה (now), אָז (then), טֶרֶם (also as בְּטֶרֶם) (before).\n" +
            "Both עַתָּה and אָז can be followed by an imperfect that should be translated as a perfect.\n"));

    allRules.add(new GrammarRule("Adverbs of place: פֹּה, חֵנָּח (here), שָׁם (there), הוּץ (outside)."));

    allRules.add(new GrammarRule("Adverbs of degree: מְאֹד (very), עוֹד (again), תָּמִיד (continually).\n"));

    allRules.add(new GrammarRule("Adverbs of manner: יַחְדָּו (together), פִּתְאֹם (suddenly)."));

    allRules.add(new GrammarRule("Niphal can be passive, reflexive, reciprocal (they heard each other),\n" +
            "or middle where no agency is specified and the subject and object are the same (the gate opened)"));

    allRules.addAll(new GrammarRuleSet("Niphal perfect weak verbs.  Final gutterals cause the last vowel to change to patach.\n" +
            "Initial gutterals cause second vowel to shift from schwa to shortened vowel.  Initial nun drops off.\n" +
            "Initial yodh converts to waw.\n" +
            "Strong          " + "נִקְטַל" ,
            "III-" + "נִמְצָא           א" ,
            "III-" + "נִבְנָה           ה" ,
            "II-Gutteral     " + "נֶעֱזַב" ,
            "I-" + "נִצַּל              נ" ,
            "I-" + "נוֹשַׁב             י").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Niphal imperfect weak verbs:  Second vowel changes in final heh.\n" +
            "Strong          " + "יִקָּטֵל" ,
            "III-" + "יִבָּנֶה           ה" ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Niphal imperative weak verbs.  In many cases schwa under initial consonant changes \n" +
            "to kamatz.\n" +
            "Strong          " + "הִקְּטֵל" ,
            "III-" + "הִמָּצֵא           א" ,
            "III-" + "הִבָּנֵה           ה" ,
            "II-Gutteral     " + "הֵעָזֵב" ,
            "I-" + "הִנָּצֵל             נ" ,
            "I-" + "הִוָּשֵׁב             י").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Niphal infinitive construct weak verbs.  Final heh changes to holem waw taw.\n" +
            "Strong           " + "הִקָּטֵל" ,
            "III-" + "הִבָּנוֹת           ה" ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Niphal infinitive absolute weak verbs.  Final heh holem waw changes to just holem.\n" +
            "Secong gutturals cause initial hireq to change.  Initial yodh changes to holem waw.\n" +
            "Strong           " + "נִקְטוֹל" ,
            "Strong           " + "הִקָּטוֹל" ,
            "III-" + "נִבְנֹה             ה" ,
            "III-" + "הִבָּנֵה             ה" ,
            "II-Gutteral      " + "נַעֳזוֹב" ,
            "II-Gutteral      " + "הֵעָזוֹב" ,
            "I-" + "נוֹשָׁב               י").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Niphal participle weak verbs:  Vowel changes in final heh and second guttural.\n" +
            "Strong           " + "נִקְטָל" ,
            "III-" + "נִבְנֶה            ה" ,
            "II-Gutteral      " + "נֶעֱזָב" ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Meaning of the Piel steam",
            "  * intensive - can intensify the meaning of the qal stem",
            "  * factitive - turns an intransitive verb transitive\n" +
            "    e.g. " + "קָדַשׁ" + " he is holy, " + "קִדַּשׁ" + " he sanctified",
            "  * denominitive - taking a noun or adjective stem and making it a verb\n" +
            "    e.g. " + "דָּבָר" + " word " + "דִּבֵּר" + " he spoke\n" +
            "    In this case the verb does not have an intensive meaning",
            "  * iterative - often occurs with physical movement").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Piel perfect weak verbs:  Second gutturals do not take dagesh, vowel changes vary.\n" +
            "Final gutterals cause vowel changes as well.\n" +
            "Strong         " + "קִטֵּל" ,
            "III-" + "שִׁלַּח        ע/ח" ,
            "III-" + "מִצֵא          א" ,
            "III-" + "גִּלָּה          ה" ,
            "II-Gutteral    " + "נִחַם" + " (virtual doubling)\n" ,
            "II-Gutteral    " + "בֵּרֵך" + " (compensatory lengthening)\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Piel imperfect weak verbs.  Final guttural causes vowel changes.  Second gutturals\n" +
            "do not take a dagesh.\n" +
            "Strong         " + "יְקַטֵּל" ,
            "III-" + "יְשַׁלַּח        ע/ח" ,
            "III-" + "יְמַצֵּא          א" ,
            "III-" + "יְגַלֶּה          ה" ,
            "II-Gutteral    " + "יְנַחֵם" ,
            "II-Gutteral    " + "יְבָרֵך" + " (compensatory lengthening)").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Piel imperative weak verbs.  Final guttural causes vowel changes.  Second gutturals\n" +
            "do not take a dagesh.\n" +
            "Strong         " + "קַטֵּל" ,
            "III-" + "שַׁלַּח        ע/ח" ,
            "III-" + "מַצֵּא          א" ,
            "III-" + "גַּלֵה          ה" ,
            "II-Gutteral    " + "נַחֵם" + " (virtual doubling)\n" ,
            "II-Gutteral    " + "בָּרֵך" + " (compensatory lengthening)").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Piel infinitive construct weak verbs.  Final guttural causes vowel changes.  Second\n" +
            "gutturals do not take a dagesh.\n" +
            "Strong         " + "קַטֵּל" ,
            "III-" + "שַׁלַּח        ע/ח" ,
            "III-" + "מַצֵּא          א" ,
            "III-" + "גַּלּוֹת          ה" ,
            "II-Gutteral    " + "נַחֵם" + " (virtual doubling)\n" ,
            "II-Gutteral    " + "בָּרֵך" + " (compensatory lengthening)").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Piel infinitive absolute weak verbs.  Final guttural causes vowel changes.  Second\n" +
            "gutturals do not take a dagesh.\n" +
            "Strong         " + "קַטֵּל" ,
            "III-" + "שַׁלֵּחַ        ע/ח" ,
            "III-" + "מַצֵּא          א" ,
            "III-" + "גַּלֵּה          ה" ,
            "II-Gutteral    " + "נַחֵם" + " (virtual doubling)\n" ,
            "II-Gutteral    " + "בָּרֵך" + " (compensatory lengthening)").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Piel participle weak verbs.  Final guttural causes vowel changes.  Second\n" +
            "gutturals do not take a dagesh.\n" +
            "Strong         " + "מְקַטֵּל" ,
            "III-" + "מְשַׁלֵּחַַ        ע/ח" ,
            "III-" + "מְמַצֵּא          א" ,
            "III-" + "מְגַלֶּה          ה" ,
            "II-Gutteral    " + "מְנַחֵם" + " (virtual doubling)\n" ,
            "II-Gutteral    " + "מְבָרֵך" + " (compensatory lengthening)").toGrammarRules());

    allRules.add(    new GrammarRule("Pual steam is passive counterpart of Piel, indicates intensive action in passive voice"));

    allRules.addAll(new GrammarRuleSet("Pual perfect weak verbs.  Final guttural causes vowel changes.  Second\n" +
            "gutturals do not take a dagesh.\n" +
            "Strong         " + "קֻטַּל" ,
            "III-" + "מֻצָא          א" ,
            "III-" + "גֻּלָּה          ה" ,
            "II-Gutteral    " + "נֻחַם" + " (virtual doubling)" ,
            "II-Gutteral    " + "בֹּרַך" + " (compensatory lengthening)").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Pual imperfect weak verbs.  Final guttural causes vowel changes.  Second\n" +
            "gutturals do not take a dagesh.\n" +
            "Strong         " + "יְקֻטַּל" ,
            "III-" + "יְמֻצָּא          א" ,
            "III-" + "יְגֻלֶּה          ה" ,
            "II-Gutteral    " + "יְנֻחַם" + " (virtual doubling)" ,
            "II-Gutteral    " + "יְבֹרַך" + " (compensatory lengthening)" ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Pual participle weak verbs.  Final guttural causes vowel changes.  Second\n" +
            "gutturals do not take a dagesh.\n" +
            "Strong         " + "מְקֻטָּל" ,
            "III-" + "מְמֻצָּא          א" ,
            "III-" + "מְגֻלֶּה          ה" ,
            "II-Gutteral    " + "מְנֻחָם" + " (virtual doubling)" ,
            "II-Gutteral    " + "מְבֹרָך" + " (compensatory lengthening)" ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Hiphil stem, most common derived stem.  Meaning can be",
            "* causative: Causing something to occur: מָלַך he reigned, הִמְלִיך he corronated, he made a king",
            "* simple action: more common in verbs where qal form is not attested in OT",
            "* declarative: the subject declares a certain condition:  רָשַׁע he was guilty הִרְשִׁיע he declared someone guilty",
            "* factitive: makes an intransitive verb transitive, similar to piel: גָּדַל to be great הִגְדִיל he made him/her/it great").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Hiphil perfect weak verbs.  Initial and final gutturals cause vowel changes.  Initial nun " +
            "drops.\nInitial yodh converts to holem waw.  Biconsonental middle vowel assimilates with yodh.\n" +
            "                      Perfect\n" +
            "             Perfect  msc 2 sng\n" +
            "Strong         " + "הִקְטַלְתָּ      הִקְטִיל",
            "I-Gutteral     " + "הֶעֱמַדְתָּ      הֶעֱמִיד",
            "III-" + "הִשְׁלַחְתָּ      הִשְׁלִיחַ        ע/ח" ,
            "III-" + "הִגְלִיתָ      הִגְלָה           ה" ,
            "I-" + "הִצַּלְתָּ       הִצִּיל             נ" ,
            "I-" + "הוֹשַׁבְתָּ      הוֹשִׁיב            י" ,
            "Biconsonental   " + "הֲקִימוֹתָ     הֵקִים" + "\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Hiphil imperfect weak verbs.  Initial and final gutturals cause vowel changes.  Initial nun drops.\n" +
            "Initial yodh converts to holem waw.  Biconsonental middle vowel assimilates with yodh.\n" +
            "Strong         " + "יַקְטִיל",
            "I-Gutteral     " + "יַעֲמִיד",
            "III-" + "יַשְׁלִיחַ        ע/ח" ,
            "III-" + "יַמְצִיא          א" ,
            "III-" + "יַגְלֶה           ה" ,
            "I-" + "יַצִּיל             נ" ,
            "I-" + "יוֹשִׁיב            י" ,
            "Biconsonental   " + "יָקִים" + "\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Hiphil imperative weak verbs.  Initial and final gutturals cause vowel changes.  Initial nun drops.\n" +
            "Initial yodh converts to holem waw.  Biconsonental middle vowel assimilates with yodh.\n" +
            "                          Imperative\n" +
            "               Imperative  fem sng\n" +
            "Strong         " + "הַקְטִילי      הַקְטֵל",
            "I-Gutteral     " + "הַעֲמִידי      הַעֲמֵד",
            "III-" + "הַשְׁלִיחִי      חַשְׁלַחַ        ע/ח" ,
            "III-" + "הַמְצִיאִי      הַמְצֵא          א" ,
            "III-" + "הַגְלֵה           ה" + "        No example given for III-ה imperative feminine singular, I don't know why.\n" ,
            "I-" + "הַצִּילִי       הַצֵּל             נ" ,
            "I-" + "הוֹשִׁיבִי      הוֹשֵׁב            י" ,
            "Biconsonental   " + "הָקִימִי       הָקֵם" ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Hiphil infinitive construct weak verbs.  Initial and final gutturals cause vowel changes.  Initial nun drops.\n" +
            "Initial yodh converts to holem waw.  Biconsonental middle vowel assimilates with yodh.\n" +
            "Strong         " + "הַקְטִיל",
            "I-Gutteral     " + "הַעֲמִיד",
            "III-" + "הַשְׁלִיחַַ        ע/ח" ,
            "III-" + "הַמְצִיא          א" ,
            "III-" + "הַגְלוֹת          ה" ,
            "I-" + "הַצִּיל             נ" ,
            "I-" + "הוֹשִׁיב            י" ,
            "Biconsonental   " + "הָקִים" + "\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Hiphil infinitive absolute weak verbs.  Initial and final gutturals cause vowel changes.  Initial nun drops.\n" +
            "Initial yodh converts to holem waw.  Biconsonental middle vowel drops out.\n" +
            "Strong         " + "הַקְטֵל",
            "I-Gutteral     " + "הַעֲמֵד",
            "III-" + "הַשְׁלֵחַַַ        ע/ח" ,
            "III-" + "הַמְצֵא          א" ,
            "III-" + "הַגְלֵה          ה" ,
            "I-" + "הַצֵּל             נ" ,
            "I-" + "הוֹשֵׁב            י" ,
            "Biconsonental   " + "הָקֵם" + "\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Hiphil participle weak verbs.  Initial and final gutturals cause vowel changes.  Initial nun drops.\n" +
            "Initial yodh converts to holem waw.  Biconsonental middle vowel assimilates with yodh.\n" +
            "Strong         " + "מַקְטִיל",
            "I-Gutteral     " + "מַעֲמִיד",
            "III-" + "מַשְׁלִיחַַַַ        ע/ח" ,
            "III-" + "מַמְצִיא          א" ,
            "III-" + "מַגְלֶה          ה" ,
            "I-" + "מַצִּיל             נ" ,
            "I-" + "מוֹשִׁיב            י" ,
            "Biconsonental   " + "מֵקִים" + "\n").toGrammarRules());

    allRules.add(new GrammarRule("Hophal stem, least common derived stem, is causative action in the passive voice " +
            "(so passive of Hiphil). \n" +
            "It occurs much more frequently in the weak form (250 times) versus strong form (50 times)."));

    allRules.addAll(new GrammarRuleSet("Hophal perfect weak verbs.  Initial and final guttural cause vowel changes.  Initial nun\n" +
            "drops off.  Initial yodh changes to holem waw.  Biconsonental take holem waw between heh and inital\n" +
            "vowel.\n" +
            "Strong (u-class)     " + "הֻקְטַל" ,
            "Strong (o-class)     " + "הָקְטַל" ,
            "I-Gutteral           " + "הָעֳמַד" ,
            "III-" + "הָגְלָה                ה" ,
            "I-" + "הֻצַּל                   נ" ,
            "I-" + "הוּשַׁב                  י" ,
            "Biconsonental        " + "הוּקַם" ,
            "Geminate             " + "הוּסַב").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Hophal imperfect weak verbs.  Initial and final guttural cause vowel changes.  Initial nun\n" +
            "drops off.  Initial yodh changes to holem waw.  Biconsonental take holem waw between heh and inital\n" +
            "vowel.\n" +
            "Strong (u-class)     " + "יֻקְטַל",
            "Strong (o-class)     " + "יָקְטַל",
            "I-Gutteral           " + "יָעֳמַד" ,
            "III-" + "יָגְלֶהה               ה" ,
            "I-" + "יֻצַּל                   נ" ,
            "I-" + "יוּשַׁב                  י" ,
            "Biconsonental        " + "יוּקַם" ,
            "Geminate             " + "יוּסַב").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Hophal participle weak verbs.  Initial and final guttural cause vowel changes.  Initial nun\n" +
            "drops off.  Initial yodh changes to holem waw.  Biconsonental take holem waw between heh and inital\n" +
            "vowel.\n" +
            "Strong (u-class)     " + "מֻקְטָל",
            "Strong (o-class)     " + "מָקְטָל",
            "I-Gutteral           " + "מָעֳמָד" ,
            "III-" + "מָגְלֶה                ה" ,
            "I-" + "מֻצָּל                   נ" ,
            "I-" + "מוּשָׁב                  י" ,
            "Biconsonental        " + "מוּקָם" ,
            "Geminate             " + "מוּסָב").toGrammarRules());

    allRules.add(    new GrammarRule("Hithpael stem indicates intensive, reflexive or reciprocal action"));

    allRules.addAll(new GrammarRuleSet("When a verbal root start with צ ,ש ,ס then the ת of the Hithpael prefix will metathesize (switch places) with\n" +
            "the first consonant.",
            "שָׁמַר" + " becomes " + "הִשְׁתַּמֵּר" ,
            "When it is a צ the ת will also transform to a ט.\n" +
            "צָדֵק" + " becomes " + "הִצְטַדֵּק" ,
            "When the first consonant of the verbal root is ת ,ט ,ד ,ז then the ת of the prefix will assimilate, becoming a dagesh forte\n" +
            "טָמֵּא" + " becomes " + "הִטַּמֵּא" ,
            "Notice how the consonants switch places but not the vowel points.\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Hithpael perfect weak verbs.  Second and third gutturals can cause vowel shifts.\n" +
            "Strong         " + "הִתְקַטֵּל",
            "III-" + "הִתְגַּלָּה          ה" ,
            "II-Gutteral    " + "הִתְנַחֵם",
            "II-Gutteral    " + "הִתְבָּרֵך"+ "\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Hithpael imperfect weak verbs.  Second and third gutturals can cause vowel shifts.\n" +
            "Strong         " + "יִתְקַטֵּל",
            "III-" + "יִתְגַּלֶּה          ה" ,
            "II-Gutteral    " + "יִתְנַחֵם",
            "II-Gutteral    " + "יִתְבָּרֵך"+ "\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Hithpael imperative weak verbs.  Second and third gutturals can cause vowel shifts.\n" +
            "Strong         " + "הִתְקַטֵּל",
            "III-" + "הִתְגַּלֵּה          ה" ,
            "II-Gutteral    " + "הִתְנַחֵם",
            "II-Gutteral    " + "הִתְבָּרֵך"+ "\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Hithpael infinitive construct weak verbs.  Second and third gutturals can cause vowel shifts.\n" +
            "Strong         " + "הִתְקַטֵּל",
            "III-" + "הִתְגַּלּוֹת         ה" ,
            "II-Gutteral    " + "הִתְבָּרֵך"+ "\n").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Hithpael infinitive absolute weak verbs.  Second and third gutturals can cause vowel shifts.\n" +
            "Strong         " + "הִתְקַטֵּל",
            "Geminate       " + "הִתְפַּלֵּל" ,
            "II-Gutteral    " + "הִתְבָּרֵך"+ "\n").toGrammarRules());

   allRules.addAll(new GrammarRuleSet("Hithpael participle weak verbs.  Second and third gutturals can cause vowel shifts.\n" +
            "Strong         " + "מִתְקַטֵּל",
            "III-" + "מִתְגַּלֶּה          ה" ,
            "II-Gutteral    " + "מִתְנַחֵם",
            "II-Gutteral    " + "מִתְבָּרֵך"+ "\n").toGrammarRules());
    return allRules;
  }
}
