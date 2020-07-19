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
        new Word("אֶקְטֹל", "I will kill", QAL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תִּקְטֹל", "you will kill", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("תִּקְטְלִי", "you will kill", QAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יִקְטֹל", "he will kill", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("תִּקְטֹל", "she will kill", QAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("נִקְטֹל", "we will kill", QAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תִּקְטְלוּ", "you will kill", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תִּקְטֹלְנָה", "you/they will kill", QAL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL),
        new Word("יִקְטְלוּ", "they will kill", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

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
        new Word("הֱיֵה", "be!", IMPERATIVE, MASCULINE, SINGULAR),
        new Word("עֲלֵה", "go up!", IMPERATIVE, MASCULINE, SINGULAR),

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

        // Qal Infinitive Absolute
        new Word("קָטוֹל", "to kill", QAL, INFINITIVE_ABSOLUTE),

        // Qal Active Participle
        new Word("קֹטֵל", "killing", QAL, PARTICIPLE, ACTIVE, MASCULINE, SINGULAR),
        new Word("קֹטְלִים", "killing", QAL, PARTICIPLE, ACTIVE, MASCULINE, PLURAL),
        new Word("קֹטֶלֶת", "killing", QAL, PARTICIPLE, ACTIVE, FEMININE, SINGULAR),
        new Word("קֹטְלָה", "killing", QAL, PARTICIPLE, ACTIVE, FEMININE, SINGULAR),
        new Word("קֹטְלוֹת", "killing", QAL, PARTICIPLE, ACTIVE, FEMININE, PLURAL),

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
        new Word("תִּקָּטַלְנָה", "you/they will be killed", NIPHAL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL),
        new Word("יִקָּטְלוּ", "they will be killed", NIPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        // Niphal Imperative
        new Word("הִקָּטֵל", "be killed!", NIPHAL, IMPERATIVE, MASCULINE, SINGULAR),
        new Word("הִקָּטְלִי", "be killed!", NIPHAL, IMPERATIVE, FEMININE, SINGULAR),
        new Word("הִקָּטְלְוּ", "be killed!", NIPHAL, IMPERATIVE, MASCULINE, PLURAL),
        new Word("הִקָּטַלְנָה", "be killed!", NIPHAL, IMPERATIVE, FEMININE, PLURAL),

        // Niphal Infinitive
        new Word("הִקָּטֵל", "to be kill", NIPHAL, INFINITIVE_CONSTRUCT),
        new Word("נִקְטוֹל", "to be kill", NIPHAL, INFINITIVE_ABSOLUTE),
        new Word("הִקָּטוֹל", "to be kill", NIPHAL, INFINITIVE_ABSOLUTE),

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
        new Word("תְּקַטֵּל", "you will slaughter", PIEL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("תְּקַטְּלִי", "you will slaughter", PIEL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יְקַטֵּל", "he will slaughter", PIEL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("תְּקַטֵּל", "she will slaughter", PIEL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("נְקַטֵּל", "we will slaughter", PIEL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תְּקַטְּלוּ", "you will slaughter", PIEL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תְּקַטֵּלְנָה", "you/they will slaughter", PIEL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL),
        new Word("יְקַטְּלוּ", "they will slaughter", PIEL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        new Word("קַטֵּל", "slaughter!", PIEL, IMPERATIVE, MASCULINE, SINGULAR),
        new Word("קַטְּלִי", "slaughter!", PIEL, IMPERATIVE, FEMININE, SINGULAR),
        new Word("קַטְּלוּ", "slaughter!", PIEL, IMPERATIVE, MASCULINE, PLURAL),
        new Word("קַטֵּלְנָה", "slaughter!", PIEL, IMPERATIVE, FEMININE, PLURAL),

        new Word("קַטֵּל", "to slaughter", PIEL, INFINITIVE_CONSTRUCT, INFINITIVE_ABSOLUTE),

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
        new Word("תְּקֻטַּל", "you will be slaughtered", PUAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("תְּקֻטְּלִי", "you will be slaughtered", PUAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יְקֻטַּל", "he will be slaughtered", PUAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("תְּקֻטַּל", "she will be slaughtered", PUAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("נְקֻטַּל", "we will be slaughtered", PUAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תְּקֻטְּלוּ", "you will be slaughtered", PUAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תְּקֻטַּלְנָה", "you/they will be slaughtered", PUAL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL),
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
        new Word("תַּקְטִיל", "you will cause to kill", HIPHIL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("תַּקְטִילִי", "you will cause to kill", HIPHIL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יַקְטִיל", "he will cause to kill", HIPHIL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("תַּקְטִיל", "she will cause to kill", HIPHIL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("נַקְטִיל", "we will cause to kill", HIPHIL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תַּקְטִילוּ", "you will cause to kill", HIPHIL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תַּקְטֵלְנָה", "you/they will cause to kill", HIPHIL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL),
        new Word("יַקְטִילוּ", "they will cause to kill", HIPHIL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        new Word("הַקְטֵל", "cause to kill", HIPHIL, IMPERATIVE, MASCULINE, SINGULAR),
        new Word("הַקְטִילִי", "cause to kill", HIPHIL, IMPERATIVE, FEMININE, SINGULAR),
        new Word("הַקְטִילוּ", "cause to kill", HIPHIL, IMPERATIVE, MASCULINE, PLURAL),
        new Word("הַקְטֵלְנָה", "cause to kill", HIPHIL, IMPERATIVE, FEMININE, PLURAL),

        new Word("הַקְטִיל", "to cause to kill", HIPHIL, INFINITIVE_CONSTRUCT),
        new Word("הַקְטֵל", "to cause to kill", HIPHIL, INFINITIVE_ABSOLUTE),

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
        new Word("הֻקְטַלְנוּ", "we were made to kill", HOPHAL, PERFECT, FIRST_PERSON, MASCULINE, PLURAL),
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
        new Word("תֻּקְטַל", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("תֻּקְטְלִי", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יֻקְטַל", "he will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("תֻּקְטַל", "she will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("נֻקְטַל", "we will be made to kill", HOPHAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תֻּקְטְלוּ", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תֻּקְטַלְנָה", "you/they will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL),
        new Word("יֻקְטַלוּ", "they will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        new Word("אָקְטַל", "I will be made to kill", HOPHAL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תָּקְטַל", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("תָּקְטְלִי", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יָקְטַל", "he will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("תָּקְטַל", "she will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("נָקְטַל", "we will be made to kill", HOPHAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תָּקְטְלוּ", "you will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תָּקְטַלְנָה", "you/they will be made to kill", HOPHAL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL),
        new Word("יָקְטַלוּ", "they will be made to kill", HOPHAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        new Word("מֻקְטָל", "being made to kill", HOPHAL, PARTICIPLE, MASCULINE, SINGULAR),
        new Word("מֻקְטֶלֶת", "being made to kill", HOPHAL, PARTICIPLE, FEMININE, SINGULAR),
        new Word("מֻקְטָלִים", "being made to kill", HOPHAL, PARTICIPLE, MASCULINE, PLURAL),
        new Word("מֻקְטָלוֹת", "being made to kill", HOPHAL, PARTICIPLE, FEMININE, PLURAL),

        new Word("מָקְטָל", "being made to kill", HOPHAL, PARTICIPLE, MASCULINE, SINGULAR),
        new Word("מָקְטֶלֶת", "being made to kill", HOPHAL, PARTICIPLE, MASCULINE, PLURAL),
        new Word("מָקְטָלִים", "being made to kill", HOPHAL, PARTICIPLE, FEMININE, SINGULAR),
        new Word("מָקְטָלוֹת", "being made to kill", HOPHAL, PARTICIPLE, FEMININE, PLURAL),

        // Hithpael
        new Word("הִתְקַטַּלְתִּי", "I killed myself", HITHPAEL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("הִתְקַטַּלְתָּ", "you killed yourself", HITHPAEL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("הִתְקַטַּלְתְּ", "you killed yourself", HITHPAEL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("הִתְקַטֵּל", "he killed himself", HITHPAEL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("הִתְקַטְּלָה", "she killed herself", HITHPAEL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("הִתְקַטַּלְנוּ", "we killed ourselves", HITHPAEL, PERFECT, FIRST_PERSON, PLURAL),
        new Word("הִתְקַטַּלְתֶּם", "you killed yourselves", HITHPAEL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("הִתְקַטַּלְתֶּן", "you killed yourselves", HITHPAEL, PERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("הִתְקַטְּלוּ", "they killed themselves", HITHPAEL, PERFECT, THIRD_PERSON, PLURAL),

        new Word("אֶתְקַטֵּל", "I will kill myself", HITHPAEL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תִּתְקַטֵּל", "you will kill yourself", HITHPAEL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("תִּתְקַטְּלִי", "you will kill yourself", HITHPAEL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יִתְקַטֵּל", "he will kill himself", HITHPAEL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("תִּתְקַטֵּל", "she will kill herself", HITHPAEL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("נִתְקַטֵּל", "we will kill ourselves", HITHPAEL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תִּתְקַטְּלוּ", "you will kill yourselves", HITHPAEL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תִּתְקַטֵּלְנָה", "you/they will kill yourselves/themselves", HITHPAEL, IMPERFECT, SECOND_PERSON, THIRD_PERSON, FEMININE, PLURAL),
        new Word("יִתְקַטֵּלוּ", "they will kill themselves", HITHPAEL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),

        new Word("הִתְקַטֵּל", "kill yourself", HITHPAEL, IMPERATIVE, MASCULINE, SINGULAR),
        new Word("הִתְקַטְּלִי", "kill yourself", HITHPAEL, IMPERATIVE, FEMININE, SINGULAR),
        new Word("הִתְקַטְּלוּ", "kill yourselves", HITHPAEL, IMPERATIVE, MASCULINE, PLURAL),
        new Word("הִתְקַטֵּלְנָה", "kill yourselves", HITHPAEL, IMPERATIVE, FEMININE, PLURAL),

        new Word("הִתְקַטֵּל", "to kill oneself", HITHPAEL, INFINITIVE_CONSTRUCT, INFINITIVE_ABSOLUTE),

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
        new Word("אֶת–", "definite direct object marker OR with"),
        new Word("אֵת", "definite direct object marker OR with"),
        new Word("אֹתַי", "direct object marker with pronominal suffix 'me', NOT with"), // 898
        new Word("אִתִּי", "with me, NOT direct object marker"),
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

        new Word("הוּא", "he, that", NOMINATIVE),
        new Word("הִיא", "she, that", NOMINATIVE),
        new Word("הִוא", "she, that", NOMINATIVE),
        new Word("הֵם", "they, those", NOMINATIVE, MASCULINE, PLURAL),
        new Word("הֵמָּה", "they, those", NOMINATIVE, MASCULINE, PLURAL),
        new Word("הֵן", "they, those", NOMINATIVE, FEMININE, PLURAL),
        new Word("הֵנָּה", "they, those", NOMINATIVE, FEMININE, PLURAL),

        // 4487
        new Word("כִּי", "that, because; (adversative) but, except; (emphatic) indeed, truly"),
        new Word("כִּי–אִם", "but, except"),
        // 2909
        new Word("כְּ", "as, like"),
        // 2632
        new Word("עָשַׂה", "he did, he made"),
        new Word("מַעֲשֶׂה", "work, deed", MASCULINE), // 235
        new Word("מַעֲשִׂים", "works, deeds", MASCULINE, PLURAL),
        // 2602
        new Word("אֱלֹהִים", "God", MASCULINE),
        new Word("אֱלֹהִים", "gods", MASCULINE, PLURAL),
        new Word("אֵל", "god", MASCULINE), // 236
        // 2579
        new Word("בָּא", "he came, entered - בּוֹא"),
        // 2530
        new Word("מֶלֶך", "king", MASCULINE),
        new Word("מְלָכִים", "kings", MASCULINE, PLURAL),
        new Word("מָלַךּ", "he reigned"), // 350
        new Word("מַמְלָכָה", "kingdom, reign, dominion", FEMININE), // 117
        // 2529
        new Word("זֶה",	"this", MASCULINE),
        new Word("זֹאת", "this", FEMININE),
        new Word("אֵלָה", "these"),
        // 2505
        new Word("אֶרֶץ", "land, earth", FEMININE),
        new Word("אֲרָצוֹת", "lands, earths", FEMININE, PLURAL),
        // 2303
        new Word("יוֹם", "day", MASCULINE),
        new Word("יָמִים", "days", MASCULINE, PLURAL),
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
        // 1867
        new Word("עַם", "people, nation", MASCULINE),
        new Word("עַמִּים", "peoples, nations", MASCULINE, PLURAL),
        // 1627
        new Word("יָד", "hand, (metaphorically) side, power", FEMININE),
        new Word("יַד", "hand of", FEMININE, CONSTRUCT),
        new Word("יָדַיִם", "hands", FEMININE, DUAL),
        // 1554
        new Word("הָלַךּ",	"he walked"),
        // 1494
        new Word("דָּבָר", "word, speech", MASCULINE),
        new Word("דְּבָרִים", "words, speeches", MASCULINE, PLURAL),
        new Word("דִּבֶּר",	"he spoke", PIEL), // 1135
        // 1310
        new Word("רָאָה", "he saw"),
        new Word("מַרְאֶה", "sight, appearance", MASCULINE),  // 103
        // 1263
        new Word("עַד", "until, as far as"),
        // 1210
        new Word("אָב", "father", MASCULINE),
        new Word("אֲבִי", "father of", MASCULINE, CONSTRUCT),
        new Word("אָבוֹת", "fathers", MASCULINE, PLURAL),
        // 1165
        new Word("שָׁמַע",	 "he heard"),
        // 1119
        new Word("ָה", "to, toward, directional ending"),
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
        new Word("אֶחָד", "one", MASCULINE),
        new Word("אַחַת", "one", FEMININE),
        // 966
        new Word("לָקַח", "he took"),
        // 952
        new Word("יָדַע", "he knew"),
        // 896
        new Word("עַיִן", "eye, spring", FEMININE),
        new Word("עֵינַים", "eyes", FEMININE, DUAL),
        new Word("עֲיָנֹת", "springs", FEMININE, PLURAL),
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
        new Word("הִשְׁלְִיך", "he threw, flung, cast - שָׁלַך", HIPHIL), // 127
        // 845
        new Word("מֵת", "he died - מוּת"),
        new Word("מָוֶת", "death, dying", MASCULINE), // 153
        // 835
        new Word("שָׁם", "there"),
        // 814
        new Word("אָכַל", "he ate"),
        // 803
        new Word("עֶבֶד", "servant, slave", MASCULINE),
        new Word("עֲבָדִים", "servants, slaves", MASCULINE, PLURAL),
        new Word("עָבַד", "he worked, he served"), // 289
        new Word("עֲבֹדָה", "work, labor, service, worship", FEMININE), // 147
        // 783
        new Word("אַיִן", "nothing, there is not"),
        new Word("אֵין", "nothing, there is not"),
        // 781
        new Word("אִשָּׁה", "woman, wife", FEMININE),
        new Word("אֵשֶׁת", "woman, wife", FEMININE, SINGULAR, CONSTRUCT),
        new Word("נָשׁים", "women, wives", FEMININE, PLURAL),
        new Word("נְשֵׁי", "women, wives", FEMININE, PLURAL, CONSTRUCT),
        // 774
        new Word("אָדוֹן", "lord, master", MASCULINE),
        new Word("אֲדֹנִים", "lords, masters", MASCULINE, PLURAL),
        // 769
        new Word("שְׁנַיִם", "two", MASCULINE),
        new Word("שְׁתַּים", "two", FEMININE),
        new Word("שֵׁנִי", "second", MASCULINE),
        new Word("שֵׁנִית", "second", FEMININE),
        new Word("גַּם", "also"),
        // 757
        new Word("נֶפֶש", "soul, person", FEMININE),
        new Word("נְפָשׁוֹת", "souls, persons", FEMININE, PLURAL),
        // 754
        new Word("מָה", "what?"),
        new Word("מַה", "what?"),
        new Word("מֶה", "what?"),
        // 750
        new Word("כֹּהַן", "priest", MASCULINE),
        new Word("כֹהֲנִים", "priests", MASCULINE, PLURAL),
        // 748
        new Word("הֲ", "indicates interrogative, prefixed to first word in the sentence"),
        // 743
        new Word("כֵּן", "so, thus"),
        // 736
        new Word("קָרָא", "he called"),
        new Word("קָרָא", "he encountered, he met"), // 139 I don't think these roots are related
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
        new Word("אָחוֹת", "sister", FEMININE), // 119
        // 627
        new Word("קָם", "he arose, stood - קוּם"),
        new Word("מָקוֹם", "place", MASCULINE), // 401
        new Word("מְקוֹמוֹת", "places", MASCULINE, PLURAL),
        // 606
        new Word("שָׁלשׁ", "three", MASCULINE),
        new Word("שְׁלֹשִׁים", "thirty"),
        new Word("שְׁלִישִׁי", "third"),
        // 600
        new Word("רֹאשׁ", "head", MASCULINE),
        new Word("רָאשִׁים", "heads", MASCULINE, PLURAL),
        // 588
        new Word("בַּת", "daughter", FEMININE),
        new Word("בָּנוֹת", "daughters", FEMININE, PLURAL),
        // 583
        new Word("מָיִם", "water, waters", MASCULINE, SINGULAR, PLURAL),
        new Word("מֵי", "water", MASCULINE, SINGULAR, PLURAL, CONSTRUCT),
        new Word("מֵאָה", "hundred"),
        // 577
        new Word("כֹּה", "thus, here"),
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
        new Word("אֲדָמָה", "land, ground, earth", FEMININE),
        new Word("אֲדָמוֹת", "lands, grounds", FEMININE, PLURAL),
        // 528
        new Word("שָׂם", "he put, set - שִׂים"),
        // 526
        new Word("גָּדוֹל", "great"),
        new Word("גָּדַל", "he grew up, became great, strong, wealthy, important"), // 117
        // 524
        new Word("עָמַד", "he stood"),
        // 511
        new Word("תַּחַת", "under, instead of"),
        // 508
        new Word("חָמַשׁ", "five", MASCULINE),
        new Word("חֲמִשִּׁים", "fifty"),
        // 505
        new Word("קוֹל", "voice, sound", MASCULINE),
        new Word("קֹלוֹת", "voices, sounds", MASCULINE, PLURAL),
        // 501
        new Word("הִכָּה", "he hit - נכה (he smote)", HIPHIL),
        // 498
        new Word("פֶה", "mouth", MASCULINE),
        new Word("פִּי", "mouth", MASCULINE, SINGULAR, CONSTRUCT),
        new Word("פִּיּוֹת", "mouths", MASCULINE, PLURAL),
        // 496
        new Word("צָבָא", "host, army, war, service", MASCULINE),
        new Word("צְבָאוֹת", "hosts, armies, wars, services", MASCULINE, PLURAL),
        // 496
        new Word("צִוָּה", "he commanded"),
        // 495
        new Word("יָלַד", "he bore, he begat"),
        // 494
        new Word("אֶלֶף", "thousand"),
        // 492
        new Word("עֶשֶׁר", "ten", MASCULINE),
        new Word("עֲשָׂרָה", "ten", FEMININE),
        new Word("עֶשְׂרִים", "twenty"),
        // 491
        new Word("שֶׁבַע", "seven", MASCULINE),
        new Word("שִׁבְעִים", "seventy"),
        new Word("שָׁבַע", "he swore"), // 186
        // 491
        new Word("עוֹד", "again, still, long"),
        // 470
        new Word("קֹדֶש", "holiness, apartness, sacredness", MASCULINE),
        new Word("קֳדָשִׁים", "holiness, apartness, sacredness", MASCULINE, PLURAL),
        new Word("קָדַשׁ", "he was consecrated, he consecrated"), // 171
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
        new Word("עַתָּה", "now"),
        new Word("עַת", "time, point in time", FEMININE), // 296
        // 424
        new Word("מִשְׁפָת", "judgement, law", MASCULINE),
        new Word("מִשׁפָּטִים", "judgements, laws", MASCULINE, PLURAL),
        new Word("שָׁפַת", "he judged"), // 204
        new Word("מִי", "who?"),
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
        new Word("רַב", "great, many", MASCULINE),
        new Word("רַבָּה", "great, many", FEMININE),
        new Word("רָבָה", "he was(became) great/many"),
        new Word("רֹב", "multitude, greatness", NOUN, MASCULINE), // 150
        new Word("בַּין", "between"),
        new Word("בִּין", "he discerned, understood"), // 171
        // 405
        new Word("נָא", "please, now"),
        // 403
        new Word("כֶּסֶף", "silver, money", MASCULINE),
        new Word("מִזְבֵּחַ", "alter", MASCULINE),
        new Word("מִזְבְּחוֹת", "alters", MASCULINE, PLURAL),
        // 396
        new Word("יָם", "sea", MASCULINE),
        new Word("יַמִּים", "seas", MASCULINE, PLURAL),
        // 389
        new Word("זָהָב", "gold", MASCULINE),
        // 382
        new Word("יָרַד", "he went down"),
        // 377
        new Word("בָּנָה", "he built"),
        new Word("אַשׁ", "fire", FEMININE),
        // 376
        new Word("נְאֻם", "utterance", MASCULINE),
        // 373
        new Word("שַׁעַר", "gate", MASCULINE),
        new Word("שְׁעָרִים", "gates", MASCULINE, PLURAL),
        new Word("טוֹב", "good", ADJECTIVE, MASCULINE, SINGULAR),
        new Word("טוֹבָה", "good", ADJECTIVE, FEMININE, SINGULAR),
        new Word("טוֹבִים", "good", ADJECTIVE, MASCULINE, PLURAL),
        new Word("טוֹבוֹת", "good", ADJECTIVE, FEMININE, PLURAL),
        // 371
        new Word("הִגִיד", "he told, declared - נגד (be conspicuous)", HIPHIL),
        // 363
        new Word("רוּחַ", "spirit, breath, wind", FEMININE),
        new Word("רוּחוֹת", "spirits, breaths, winds", FEMININE, PLURAL),
        // 361
        new Word("דָּם", "blood", MASCULINE),
        new Word("דָּמִים", "bloods", MASCULINE, PLURAL),
        // 357
        new Word("רַע", "bad, evil", ADJECTIVE, MASCULINE, SINGULAR),
        new Word("רָעָה", "bad, evil", ADJECTIVE, FEMININE, SINGULAR),
        new Word("רָעִים", "bad, evil", ADJECTIVE, MASCULINE, PLURAL),
        new Word("רָעוֹת", "bad, evil", ADJECTIVE, FEMININE, PLURAL),
        // 348
        new Word("אֹהֶל", "tent", MASCULINE),
        new Word("אֹהָלִים", "tents", MASCULINE, PLURAL),
        // 338
        new Word("סָבִיב", "all around"),
        new Word("סָבַב", "he turned around, went around, surrounded"), // 163
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
        new Word("נִלְחַם", "he engaged in battle (reciprocal), waged war – לחם", NIPHAL), // 171
        // 318
        new Word("יָרֵא", "he feared"),
        // 317
        new Word("עָנָה", "he answered"),
        new Word("נָבִיא", "prophet", MASCULINE),
        new Word("נְבִיאִים", "prophets", MASCULINE, PLURAL),
        new Word("נִבָּא", "he prophisied - נָבָא", NIPHAL), // 115
        // 311
        new Word("רָעָה", "evil, misery, distress", NOUN, FEMININE),
        // 304
        new Word("פָּקַד", "he attended to, appointed, mustered, visited"),
        new Word("מִשְׁפָּחָה", "family", FEMININE),
        new Word("מִשְׁפָּחוֹת", "families", FEMININE, PLURAL),
        // 298
        new Word("סָר", "he turned aside - סור"),
        new Word("חַטָּאת", "sin, sin offering", FEMININE),
        new Word("חָטָא", "he sinned, he missed"), // 239
        new Word("לֶחֶם", "bread, food", MASCULINE),
        new Word("מְאֹד", "very"),
        // 290
        new Word("חָזַק", "he was strong"),
        // 289
        new Word("כָּרַת", "he cut off"),
        // 288
        new Word("עֹלָה", "whole burnt offering", FEMININE),
        new Word("עֹלוֹת", "whole burnt offerings", FEMININE, PLURAL),
        // 287
        new Word("חָיָה", "he lived"),
        new Word("חַיִּים", "life, lives", MASCULINE, SINGULAR, PLURAL), // 268
        // 285
        new Word("אֹיֵב", "enemy", MASCULINE),
        new Word("אָיַב", "he was hostile"),
        new Word("בְּרִית", "covenant", FEMININE),
        // 283
        new Word("חֹדֶשׁ", "month, new moon", MASCULINE),
        new Word("חֳדָשִׁים", "months, new moons", MASCULINE, PLURAL),
        // 280
        new Word("קָרַב", "he came near, he offered"),
        new Word("קֶרֶב", "midst, inward part", MASCULINE),
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
        new Word("לְמַעַן", "because of, in order to, for the sake of"),
        // 270
        new Word("בָּשָׂר", "flesh, meat, skin", MASCULINE),
        new Word("בְּשָׂרִים", "fleshes, meats, skins", MASCULINE, PLURAL),
        new Word("מִדְבָּר", "wilderness, desert, pasture", MASCULINE),
        // 264
        new Word("רָשָׁע", "wicked", ADJECTIVE, MASCULINE, SINGULAR),
        new Word("רְשָׁעִים", "wicked", ADJECTIVE, MASCULINE, PLURAL),
        new Word("רְשָׁעָה", "wicked", ADJECTIVE, FEMININE, SINGULAR),
        // 252
        new Word("מַטֶּה", "tribe, staff", MASCULINE),
        new Word("מָטּוֹת", "tribes, staffs", MASCULINE, PLURAL),
        // 251
        new Word("רֶגֶל", "foot", FEMININE),
        new Word("רַגְלַיִם", "feet", FEMININE, DUAL),
        // 250
        new Word("מָלֵא", "he filled"),
        new Word("אַמָּה", "cubit, forearm", FEMININE),
        new Word("אַמּוֹת", "cubits, forearms", FEMININE, PLURAL),
        // 249
        new Word("חֶסֶד", "loving kindness, steadfast love", MASCULINE),
        new Word("חֲסָדִים", "loving kindnesses, steadfast loves", MASCULINE, PLURAL),
        // 245
        new Word("חַיַל", "strength, wealth, army", MASCULINE),
        new Word("חֲיָלִים", "armies,strengths, wealths", MASCULINE, PLURAL),
        // 241
        new Word("גְּבוּל", "border, boundary, territory", MASCULINE),
        // 240
        new Word("נַעַר", "boy, youth", MASCULINE),
        new Word("נְעָרִים", "boys, youths", MASCULINE, PLURAL),
        // 237
        new Word("שָׁלוֹם", "peace, completeness", MASCULINE),
        new Word("שָׁלֵם", "he was whole, complete"), // 116
        new Word("שִׁלַּם", "he repaid - שָׁלֵם", PIEL),
        new Word("הִשְׁלִים", "he made peace - שָׁלֵם", HIPHIL),
        // 233
        new Word("עָוֹן", "iniquity", MASCULINE),
        new Word("עֲוֹנוֹת", "iniquities", MASCULINE, PLURAL),
        // 232
        new Word("יָרַשׁ", "he inherited, he possessed, he dispossessed"),
        // 229
        new Word("זֶרַע", "seed", MASCULINE),
        // 227
        new Word("לַיְלָה", "night", MASCULINE),
        new Word("לֵילוֹת", "nights", MASCULINE, PLURAL),
        // 225
        new Word("בִּקֵּשׁ", "he sought", PIEL),
        new Word("זָכַר", "he remembered"),
        new Word("כָּתַב", "he wrote"),
        // 223
        new Word("מוֹעַד", "appointed time, place", MASCULINE),
        new Word("מוֹעֲדִים", "appointed times, places", MASCULINE, PLURAL),
        new Word("תּוֹרָה", "law, instruction", FEMININE),
        new Word("תּוֹרוֹת", "laws, instructions", FEMININE, PLURAL),
        // 222
        new Word("נַחֲלָה", "possession", FEMININE),
        new Word("נְחָלוֹת", "possessions", FEMININE, PLURAL),
        // 220
        new Word("אֵם", "mother", FEMININE),
        // 219
        new Word("נָכְוֹן", "he was firm, established, prepared", NIPHAL),
        // 217
        new Word("אָהַב", "he loved"),
        new Word("שָׁתָה", "he drank"),
        // 216
        new Word("נָטָה", "he stretched out"),
        new Word("בֶּגֶד", "garmet", MASCULINE),
        new Word("בְּגָדִים", "garmets", MASCULINE, PLURAL),
        // 215
        new Word("יָסַף", "he added, he did again"),
        new Word("מַחֲנֶה", "camp", MASCULINE, FEMININE),
        new Word("מַחַנוֹת", "camps", MASCULINE, FEMININE, PLURAL),
        // 214
        new Word("עָזַב", "he forsook, left"),
        // 213
        new Word("הִצִּיל", "he saved, delivered - נצל", HIPHIL),
        new Word("שָׁכַב", "he layed down, he had sex"),
        new Word("בֹּקֶר", "morning", MASCULINE),
        new Word("בְּקָרִים", "mornings", MASCULINE, PLURAL),
        new Word("מַלְאָךּ", "messenger", MASCULINE),
        new Word("מַלְאָכִים", "messengers", MASCULINE, PLURAL),
        // 211
        new Word("מִנְחָה", "gift, tribute, offering", FEMININE),
        // 208
        new Word("כָּלָה", "he was complete, finished, he came to an end"),
        // 206
        new Word("צַדּיק", "just, righteous", ADJECTIVE, MASCULINE),
        new Word("צַדִּיקִים", "just, righteous", ADJECTIVE, MASCULINE, PLURAL),
        new Word("צְדָקָה", "righteousness", FEMININE), // 159
        // 202
        new Word("אֲרוֹן", "ark, chest", MASCULINE),
        // 200
        new Word("אָסַף", "he gathered"),
        // 199
        new Word("כָּבוֹד", "abundance, honor, glory", MASCULINE),
        new Word("כָּבֵד", "he was heavy, he was honored"), // 114
        // 195
        new Word("רוּם", "he was high, exalted"),
        new Word("כַּף", "palm of the hand, sole of the foot", FEMININE),
        new Word("כַּפוֹת", "palms of the hands, soles of the feet", FEMININE, PLURAL),
        // 194
        new Word("יָכוֹל", "he was able"),
        // 193
        new Word("שֶׁמֶן", "fat, oil", MASCULINE),
        new Word("שְמָנִים", "fats, oils", MASCULINE, PLURAL),
        // 191
        new Word("חֲצֵרִים", "settlements, villages", MASCULINE, SINGULAR, PLURAL),
        // 190
        new Word("בְּהֵמָה", "beast", FEMININE),
        new Word("בְּהֵמוֹת", "beasts", FEMININE, PLURAL),
        new Word("שָׁבֶט", "scepter, rod, tribe", MASCULINE),
        new Word("שְׁבָטִים", "scepters, rods, tribes", MASCULINE, PLURAL),
        // 188
        new Word("אֹזֶן", "ear", FEMININE),
        new Word("אָזְנַיִם", "ears", FEMININE, DUAL),
        // 187
        new Word("גָלָה", "he removed, uncovered, departed"),
        new Word("סֵפֶר", "document, book", MASCULINE),
        new Word("סְפָרִים", "documents, books", MASCULINE, PLURAL),
        new Word("מִסְפָּר", "number", NOUN, MASCULINE), // 134
        new Word("סָפַר", "he counted"), // 107
        new Word("רֵעַ", "friend, companion, fellow", MASCULINE),
        new Word("רֵעִים", "friends, companions, fellows", MASCULINE, PLURAL),
        // 185
        new Word("אָבַד", "he perished, he vanished, he became lost"),
        // 184
        new Word("מִצְוָה", "commandment", FEMININE),
        new Word("מִצְוֹת", "commandments", FEMININE, PLURAL),
        // 183
        new Word("בָּקָר", "cattle, herd, ox", MASCULINE),
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
        new Word("הוֹשִׁיעַ", "he saved, delivered - ישׁע", HIPHIL),
        new Word("שָֹפָה", "lip, language, edge, shore", FEMININE),
        new Word("שְׂפָתַיִם", "lips, languages, edges, shores", FEMININE, DUAL),
        new Word("לָמָּה", "why?"),
        // 174
        new Word("שָאַל", "he asked"),
        // 173
        new Word("שָׁחָה", "he bowed down"),
        // 170
        new Word("בָּחַר", "he chose, tested, examined"),
        // 167
        new Word("הָרַג", "he attacked, he slew"),
        new Word("רָעָה", "he pastured, tended, grazed"),
        new Word("דּוֹר", "period, generation, dwelling", MASCULINE),
        new Word("דּוֹרִים", "periods, generations, dwellings", MASCULINE, PLURAL),
        new Word("מְלָאכָה", "work, occupation", FEMININE),
        new Word("מַלְאֲכוֹת", "works, occupations", FEMININE, PLURAL),
        // 166
        new Word("אַחֵר", "another", ADJECTIVE, MASCULINE, SINGULAR),
        new Word("אֲחֵרִים", "another", ADJECTIVE, MASCULINE, PLURAL),
        new Word("אַחֶרֶת", "another", ADJECTIVE, FEMININE, SINGULAR),
        new Word("אֲחֵרוֹת", "another", ADJECTIVE, FEMININE, PLURAL),
        // 165
        new Word("דָּרַשׁ", "he sought, inquired, investigated, required, demanded"),
        // 164
        new Word("חוּץ", "outside, street", NOUN, MASCULINE),
        new Word("פֶּתַח", "opening, doorway, entrace", MASCULINE),
        new Word("פְּתָחִים", "openings, doorways, entraces", MASCULINE, PLURAL),
        new Word("פָּתַח", "he opened"), // 136
        // 162
        new Word("טָמֵא", "he was/became unclean"),
        new Word("זֶבַח", "sacrifice", NOUN, MASCULINE),
        // 161
        new Word("אַיִל", "ram", NOUN, MASCULINE),
        new Word("בַּד", "alone"),
        new Word("אַך", "only, surely, nevertheless"),
        new Word("בַּעַל", "owner, master, husband, (divine title) Baal", MASCULINE),
        // 160
        new Word("נוּס", "he fled, he escaped"),
        new Word("גִּּבּוֹר", "mighty man, hero, warrior", MASCULINE),
        new Word("גִּּבּוֹר", "mighty", ADJECTIVE),
        // 156
        new Word("שָׂמַח", "he rejoiced, he was glad"),
        // 153
        new Word("צָפוֹן", "north, northern", FEMININE),
        new Word("כָּסָה", "he covered"),
        // 151
        new Word("נֶגֶד", "opposite, in front of"),
        // 150
        new Word("נָגַע", "he touched, struck, escaped"),
        // 149
        new Word("עֵדָה", "congregation, assembly", FEMININE),
        new Word("חָכְמָה", "wisdom", FEMININE),
        new Word("חָכָם", "wise", ADJECTIVE, MASCULINE, SINGULAR),
        new Word("חֲכָמִים", "wise", ADJECTIVE, MASCULINE, PLURAL),
        new Word("חֲכָמָה", "wise", ADJECTIVE, FEMININE, SINGULAR),
        new Word("חֲכְמוֹת", "wise", ADJECTIVE, FEMININE, PLURAL),
        // 148
        new Word("שָׁבַר", "he broke (up), smashed"),
        new Word("שָׂנֵא", "he hated"),
        // 147
        new Word("שְׁמֹנֶה", "eight", MASCULINE),
        new Word("שְׁמֹנִים", "eighty"),
        // 146
        new Word("נָסַע", "he pulled out, pulled up, set out, started out, departed, journeyed, marched"),
        new Word("הִלֵּל", "he praised – הָלַל", PIEL),
        // 144
        new Word("רָדַף", "he pursued, followed after, persecuted"),
        // 143
        new Word("חָנָה", "he declined, camped, lay seige to"),
        // 142
        new Word("נִשְׁחַת", "he was corrupt, spoiled", NIPHAL),
        new Word("שִׁחֵת", "he was spoiled, wiped out, ruined", PIEL),
        new Word("הִשְׁהִית", "he destroyed", HIPHIL),
        // 141
        new Word("אָז", "then, since, before"),
        new Word("יַיִן", "wine", MASCULINE),
        new Word("יָמִין", "right hand, south", FEMININE),
        new Word("כְּמוֹ", "like, as"),
        // 140
        new Word("נוּחַ", "he rested, settled down"),
        new Word("הֵנִיחַ", "he gave rest to, he set down", HIPHIL),
        // 139
        new Word("שֶׁ", "who, whom, that, which (relative pronoun), prefixed"),
        new Word("מִשְׁכָּן", "dwelling place, tabernacle", MASCULINE),
        new Word("נְחֹשֶׁת", "copper, bronze", MASCULINE),
        // 138
        new Word("סוּס", "horse", MASCULINE),
        new Word("סוּסִים", "horses", MASCULINE, PLURAL),
        // 137
        new Word("נַחַל", "stream, wadi", MASCULINE),
        // 135
        new Word("כִּסֵּא", "chair, throne", MASCULINE),
        new Word("הֵחֵל", "he began – חָלַל", HIPHIL),
        new Word("נִחָל", "he was defiled – חָלַל", NIPHAL),
        new Word("חִלֵּל", "he polluted, profaned – חָלַל", PIEL),
        // 134
        new Word("שֶׁמֶשׁ", "sun", MASCULINE),
        new Word("זָבַח", "he slaughtered, sacrificed"),
        new Word("פָּנָה", "he turned"),
        new Word("עֶרֶב", "evening, sunset", MASCULINE),
        // 133
        new Word("קָבַר", "he buried"),
        new Word("אַף", "also, indeed, even"),
        new Word("פֶּן–", "lest, otherwise"),
        new Word("פַּר", "bull, ox, steer", MASCULINE),
        new Word("שָׁאַר", "he remained, was left over, survived"),
        new Word("שָׁכַן", "he settled, abode, dwelt, inhabited"),
        new Word("חוֹמָה", "wall", FEMININE),
        // 131
        new Word("חֹק", "statute, appointed time, portion", MASCULINE),
        // 130
        new Word("נָשִׂיא", "chief, leader, prince", MASCULINE),
        // 127
        new Word("אֶמֶת", "truth, fidelity", FEMININE),
        new Word("קָבַץ", "he collected, gathered, assembled"),
        // 126
        new Word("כֹּחַ", "strength, power", MASCULINE),
        new Word("עֶצֶם", "bone, skeleton", FEMININE),
        // 125
        new Word("בּוֹשׁ", "he was ashamed"),
        new Word("נָגַשׁ", "he drew near, approached"),
        new Word("חֵמָה", "wrath, heat, poison", FEMININE),
        new Word("חֲצִי", "half, middle", MASCULINE),
        // 124
        new Word("חָשַׁב", "he thought, considered, devised, planned, valued, esteemed"),
        // 123
        new Word("קָהָל", "assembly, community, crowd", MASCULINE),
        // 121
        new Word("לָכַד", "he took, captured, caught, seized"),
        // 120
        new Word("אוֹר", "light, daylight, sunshine", MASCULINE),
        new Word("רֶכֶב", "chariot, upper millstone", MASCULINE),
        new Word("בְּכֹר", "firstborn", MASCULINE),
        // 119
        new Word("יָשָׁר", "straight, right (correct, not direction)", MASCULINE, ADJECTIVE),
        new Word("פְּרִי", "fruit, offspring", MASCULINE),
        new Word("נָהָר", "river, stream", MASCULINE),
        // 118
        new Word("פַּעַם", "beat (noun), foot, anvil, time (as in music, keeping time)", FEMININE),
        new Word("תּוֹעֵבָה", "abomination, abhorence, offensive thing", FEMININE),
        new Word("בָּטַח", "to trust, be confident, rely upon"),
        // 117
        new Word("יָטַב", "he was well, it went well with, it was pleasing"),
        new Word("שָׁפַך", "he poured, spilt, shed (blood)"),
        new Word("לָשׁוֹן", "tongue, language", MASCULINE, FEMININE),
        new Word("שָׂרַף", "he completely burned, destroyed"),
        // 115
        new Word("קִטֵּר", "he made sacrifices smoke (he offered a burned sacrifice) - קָטַר", PIEL),
        new Word("הִקְטִיר", "he made sacrifices smoke, he caused to smoke (in worship) - קָטַר", HIPHIL),
        // 114
        new Word("בָּכָה", "he wept (in grief or joy)"),
        new Word("מִגְרָשׁ", "common land, open land, pasture", MASCULINE),
        // 113
        new Word("שֶׁקֶר", "deception, lie, disappointment", MASCULINE),
        // 112
        new Word("לָבַשׁ", "he put on a garmet, he clothed"),
        new Word("בִּלְתּי", "not (with infinitive), except"),
        new Word("לְבִלְתּי", "not (with infinitive)"),
        new Word("חָשַׁב", "he thought, accounted"),
        new Word("עַמּוּד", "pillar, column", MASCULINE),
        // 111
        new Word("שַׁבָּת", "Sabbath, rest period", MASCULINE),
        new Word("הוֹדוּ", "they praised, gave thanks - " + "יָדָה" + " - he cast", HIPHIL, PERFECT, THIRD_PERSON, PLURAL),
        // 110
        new Word("עָפָר", "dry earth, dust", MASCULINE),
        // 109
        new Word("רַק", "only, still, but, however"),
        new Word("כָּנָף", "wing, edge (uses dual for wings, standard feminine plural for edges)", FEMININE),
        // 108
        new Word("נִחַם", "he was sorry, moved to pity, had compassion", NIPHAL),
        new Word("נִחַם", "he comforted, consoled", PIEL),
        // 107
        new Word("כֶּבֶשׂ", "lamb, sheep", MASCULINE),
        // 106
        new Word("בָּמָח", "(cultic) high place, hill", MASCULINE),
        new Word("נוֹתַר", "he was left over, he remained - יָתַר", NIPHAL),
        new Word("הוֹתִיר", "he left - יָתַר", HIPHIL),
        // 104
        new Word("תָּמִיד", "continually"),
        new Word("גָּאַל", "he redeemed, delivered, acted as kinsman, avenged"),
        new Word("בַּעַד", "behind, through"),
        new Word("חֻקָּח", "statute, ordinance", MASCULINE),
        new Word("חֻקּוֹת", "statutes, ordinances", MASCULINE, PLURAL),
        new Word("רָץ", "he ran רוּץ"),
        // 102
        new Word("כִּפֶּר", "he covered over, pacified, made propitiation", PIEL),
        new Word("שָׁכַח", "he forgot"),
        // 101
        new Word("רָעָב", "famine, hunger", MASCULINE),
        new Word("רֹחַב", "breadth, width", MASCULINE),
        new Word("מעַט", "a little, a few"),

        // 100
        new Word("יַעַן", "on account of"),

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

        new GrammarRule("Rules of Syllabification (1/4)\n" +
          "  1. Every syllable must begin with one consonant and have only one vowel.\n"),

        new GrammarRule("Rules of Syllabification (2/4)\n" +
            "  2. Syllables are either open or closed.  Open end in a vowel, closed in a consonant.\n" +
            "  Hebrew words are usually accented on the last syllable.\n"),

        new GrammarRule("Rules of Syllabification (3/4)\n" +
            "  3. Syllable classification\n" +
            "     a. Tonic: accented syllable (the one with the “tone”) דָבָר second syllable is tonic\n" +
            "     b. Pretonic: syllable immediately before the tonic; first syllable above\n" +
            "     c. Propretonic: syllable before the pretonic\n"),

        new GrammarRule("Rules of Syllabification (4/4)\n" +
            "  4. Dagesh Forte letters count as two consonants for the purpose of syllabification."),

        new GrammarRule("Differentiating Dagesh Forte and Dagesh Lene in בגדכפת letters (1/3)\n" +
          " * The Dagesh is Forte if it is preceded by a vowel. אַתּה\n"),

        new GrammarRule("Differentiating Dagesh Forte and Dagesh Lene in בגדכפת letters (2/3)\n" +
            " * The Dagesh is Lene if preceded by a consonant. מַלְכּה\n"),

        new GrammarRule("Differentiating Dagesh Forte and Dagesh Lene in בגדכפת letters (3/3)\n" +
            " * The Dagesh is Lene at the beginning of the word unless the previous word ends in a vowel. דָּבָר"),

        new GrammarRule("Silent Schewa and Vocal Schewa (1/9)\n" +
            "The Vocal Schewa will always occur in an open syllable.\n"),

        new GrammarRule("Silent Schewa and Vocal Schewa (2/9)\n" +
            "The Silent Schewa will always come at the end of a closed syllable.\n"),

        new GrammarRule("Silent Schewa and Vocal Schewa (3/9)\n" +
            " * The Schewa is silent if the previous vowel is short.  Implies:\n" +
            "   * A Schewa is silent when immediately preceded by a short vowel. פַּרְעֹה\n"),

        new GrammarRule("Silent Schewa and Vocal Schewa (4/9)\n" +
            " * The Schewa is silent if the previous vowel is short.  Implies:\n" +
            "   * The first of two contiguous Schewas is silent. מִשְׁפְּטֵי\n"),

        new GrammarRule("Silent Schewa and Vocal Schewa (5/9)\n" +
            "The Silent Schewa will always come at the end of a closed syllable.\n" +
            " * The Schewa is silent if the previous vowel is short.  Implies:\n" +
            "   * A Schewa at the end of a word is silent. כָּתַבְתְּ\n"),

        new GrammarRule("Silent Schewa and Vocal Schewa (6/9)\n" +
            " * The Schewa is vocal if not immediately preceded by a short vowel.  Implies:\n" +
            "   * Initial Schewa is always vocal. בְּרָכָה\n"),

        new GrammarRule("Silent Schewa and Vocal Schewa (7/9)\n" +
            " * The Schewa is vocal if not immediately preceded by a short vowel.  Implies:\n" +
            "   * The second of two contiguous Schewas is vocal.\n"),

        new GrammarRule("Silent Schewa and Vocal Schewa (8/9)\n" +
            " * The Schewa is vocal if not immediately preceded by a short vowel.  Implies:\n" +
            "   * A Schewa under any consonant with Daghesh Forte is vocal. הַמְּלָכִים\n"),

        new GrammarRule("Silent Schewa and Vocal Schewa (9/9)\n" +
            " * The Schewa is vocal if not immediately preceded by a short vowel.  Implies:\n" +
            "   * A Schewa after an unaccented long vowel is vocal. כֹּתְבִים"),

        new GrammarRule("Qamets and Qamets Hatuf (1/4)\n" +
            "Both little T, Qamets long as in father, Qamets Hatuf short as in ‘lot’.  Rules for distinguishing:\n" +
            " * When in doubt, go with Qamets as it is much more frequent\n" +
            " * Qamets Hatuf occurs only in closed and unaccented syllables. חָכְמָה (first syllable)\n"),

        new GrammarRule("Qamets and Qamets Hatuf (2/4)\n" +
            "Both little T, Qamets long as in father, Qamets Hatuf short as in ‘lot’.  Rules for distinguishing:\n" +
            " * Qamets Hatuf occurs only in closed and unaccented syllables. חָכְמָה (first syllable)\n"),

        new GrammarRule("Qamets and Qamets Hatuf (3/4)\n" +
            "Both little T, Qamets long as in father, Qamets Hatuf short as in ‘lot’.  Rules for distinguishing:\n" +
            " * Qamets prefers open, pretonic syllable or closed accented syllable. דָּבָר (both syllables)\n"),

        new GrammarRule("Qamets and Qamets Hatuf (4/4)\n" +
          "Both little T, Qamets long as in father, Qamets Hatuf short as in ‘lot’.  Rules for distinguishing:\n" +
          " * Metheg, small vertical line to the left of the Qamets, sometimes used to clarify that it is a Qamets."),

        new GrammarRule("Furtive Pathach\n" +
          " When a word ends in ח or ע , a Pathach (horizontal line) may appear beneath this\n" +
          "consonant and must be pronounced before the guttural rather than after."),

        new GrammarRule("Diphthong\n" +
          "Most common Hebrew diphthong is" + " ַיִ  " + "\n" +
          "Syllables that contain a diphthong are considered to be closed because they end in a consontant."),

        new GrammarRule("Vowel Syllable Preferences 1/3\n" +
            " * Short vowels prefer closed, unaccented syllables or open, accented syllables. Both syllables in עֶבֶד\n"),

        new GrammarRule("Vowel Syllable Preferences 2/3\n" +
            " * Long vowels prefer closed, accented syllables or open, pretonic syllables.  Both syllables in" + " דָּבָר\n"),

        new GrammarRule("Vowel Syllable Preferences 3/3\n" +
          " * Vocal Shewa and reduced hateph vowels prefer open, propretonic syllables.  The\n" +
          "   reduced vowels appear with guttural consonants in the open, propretonic position.\n" +
          "   First syllable in דְּבָרִים  and אֱלֹהִים"),

        new GrammarRule("Gender Endings 1/4\n" +
            "Masculine Singular: anything\n" +
            "Feminine Singular: " + " ָה ַת ֶת  ִית וּת" + "\n"),

        new GrammarRule("Gender Endings 2/4\n" +
            "Masculine Plural: " + " ִים " + "\n" +
            "Feminine Plural: וֹת\n"),

        new GrammarRule("Gender Endings 3/4\n" +
            "Masculine Dual:" + " ַים " + "\n" +
            "Feminine Dual: תַיִם or same as masculine\n"),

        new GrammarRule("Gender Endings 4/4\n" +
          "Exceptions to Gender Ending Rules\n" +
          " 1. Some feminine nouns are endingless.\n" +
          " 2. Some nouns use plural endings from the other gender (e.g. אב שנה)\n" +
          " 3. Special dual nouns: שָׁמַיִם מִצְרַיִם מַיִם  These are always dual.\n" +
          " 4. Some nouns go through irregular stem change in the plural:  אנשים איש  נשים אשה\n" +
          " 5. Some feminine pluralizations will appear with defective spelling תֹ instead of וֹת"),

        new GrammarRule("Patterns of Pluralization 1/5\n" +
            " 1. Pluralization with no change: some nouns do not change their vowels when being\n" +
            "    made plural.  Often happens with monosyllabic words with an unchangeable long\n" +
            "    vowel: שִׁיר to שִׁירִים Also happens with two syllable words with shewa or hateph\n" +
            "    pathach in first syllable and unchangeable long vowel in second: חֳלוֹם to חֳלוֹמוֹת and רְהוֹב to רְהוֹבוֹת\n"),

        new GrammarRule("Patterns of Pluralization 2/5\n" +
            " 2. Two syllable nouns that are accented on the final syllable and have Qamets or\n" +
            "    Tsere pretonic syllable will experience propretonic reduction.  Qamets/Tsere will\n" +
            "    be replaced by Shewa.  דָּבָר -> דְּבָרִים and לֵבָב -> לְבָבוֹת\n" +
            "    If the initial consonant is gutteral it will move to Hateph Patach.  עָנָן –> עֲנָנִים\n" +
            "    Nouns with vowel letters do not experience propretonic reduction.\n"),

        new GrammarRule("Patterns of Pluralization 3/5\n" +
            " 3. Segholate nouns are nouns with accent on the first syllable, so called because in\n" +
            "    most cases one or both vowels are a Seghol.  These pluralize with a Shewa in the\n" +
            "    first syllable (or Hateph vowel for gutturals) and a Qamets in the second:  מֶלֶךּ –> מְלָכִים and חֶרֶב –> חֲרָבוֹת\n"),

        new GrammarRule("Patterns of Pluralization 4/5\n" +
            " 4. Pluralization of Geminate nouns.  Geminate nouns appear to have only 2 root\n" +
            "    consonants (e.g. עַם).  Actually they originally had 3, with the third duplicating\n" +
            "    the second.  These pluralize with Dageshe Forte in the second \n" +
            "    consonant. עַם –> עַמִּים  Not all biconsonantal nouns are geminate, for example אָב\n"),

        new GrammarRule("Patterns of Pluralization 5/5\n" +
          " 5. Irregular pluralization.  Many nouns are irregular in their pluralization."),

        new GrammarRule("The Rules of Shewa 1/2\n" +
            " 1. Hebrew does not allow two contiguous vocal schewas.  If prefixing a preposition\n" +
            "    with a shewa to a word that starts with a schewa, first schewa becomes a\n" +
            "    hireq. נְבִיאִם plus לְ becomes לִנְבִיאִם\n" +
            "    Exception: If the syllable begins with י, after combining the י does not take a\n" +
            "      shewa: יְהוּדָה plus לְ becomes לָיהוּדָה.\n"),

        new GrammarRule("The Rules of Shewa 2/2\n" +
          " 2. Vocal schewa cannot proceed a guttural with a reduced vowel.  The first vocal\n" +
          "    schewa converts to the short vowel that corresponds to the reduced vowel it\n" +
          "    proceeds.  חֲלוֹם plus בְּ becomes בַּחֲלוֹם\n" +
          "    Exception: In אֱלֹהִים  the shortened vowel under א  is removed.  Thus אֱלֹהִים plus לְ becomes לֵאלֹהִים"),

        new GrammarRule("Definite Article 1/6\n" +
            " * Definite Article is הַ plus a Dagesh Forte in the first consonant of the noun\n"),

        new GrammarRule("Definite Article 2/6\n" +
            " * When the first consonant is a בגדכפת consonant the Dagesh Lene in the בגדכפת becomes a Dagesh Forte\n"),

        new GrammarRule("Definite Article 3/6\n" +
            " * When first consontant is a guttural, Dagesh Forte is rejected\n" +
            "   * When the first consonant is א or ע or ר the Patach lengthens to a Qamets, הָ\n"),

        new GrammarRule("Definite Article 4/6\n" +
            " * When first consontant is a guttural, Dagesh Forte is rejected\n" +
            "   * When the first consonant is ה or ח the Dagesh Forte is dropped.  This is\n" +
            "     referred to as \"virtual doubling\"\n"),

        new GrammarRule("Definite Article 5/6\n" +
            " * When first consontant is a guttural, Dagesh Forte is rejected\n" +
            "   * Before nouns that begin with an unaccented עָ or הָ or חָ (last can also be\n" +
            "     accented), the definite article becomes Seghol הֶ\n"),

        new GrammarRule("Definite Article 6/6\n" +
          " * A few words change their initial vowel to Qamets, e.g. אֶרֶצ becomes הָאָרֶצ"),

        new GrammarRule("Conjuncton ו (and, but, also, even) 1/9\n" +
            " * Most frequently spelled וְ\n"),

        new GrammarRule("Conjuncton ו (and, but, also, even) 2/9\n" +
            " * Becomes Shureq וּ \n" +
            "   * before ב, מ, פ (bump rule), ב פ loose Dagesh lene in this case בּיִת becomes וּבַיִת \n"),

        new GrammarRule("Conjuncton ו (and, but, also, even) 3/9\n" +
            " * Becomes Shureq וּ \n" +
            "   * before a vocal Shewa נְעָרִים becomes וּנְעָרִים\n"),

        new GrammarRule("Conjuncton ו (and, but, also, even) 4/9\n" +
            " * Before Hateph vowel, conjuction takes the corresponding short vowel אֲנָשׁים becomes וַאֲנָשׁים  \n" +
            "   * Exception, does not apply to אלהים\n"),

        new GrammarRule("Conjuncton ו (and, but, also, even) 5/9\n" +
            " * May be spelled with Qamets before monosyllabic words or words with initial accent צֹאן becomes וָצֹאן\n"),

        new GrammarRule("Conjuncton ו (and, but, also, even) 6/9\n" +
            " * Demonstrative (this/that): אנכי מצוך היום - I am commanding you the[this] day\n"),

        new GrammarRule("Conjuncton ו (and, but, also, even) 7/9\n" +
            " * Vocative, indicating direct address: ויקרא לאמר המלך - And he called saying the[O] king\n"),

        new GrammarRule("Conjuncton ו (and, but, also, even) 8/9\n" +
            " * Superlative with an adjective: הטוב והישׁר - the good[best] and the upright[most upgright]\n"),

        new GrammarRule("Conjuncton ו (and, but, also, even) 9/9\n" +
            " * Possessive pronoun: ולקח דוד הכנור - And David took the[his] harp"),

        new GrammarRule("Inseparable prepositions: 1/4\n" +
            "* Before most consonants will appear with a vocal Shewa ּּּבְשָדֶה\n"),

        new GrammarRule("Inseparable prepositions: 2/4\n" +
            "* Before a Hateph vowel will take the corresponding short vowel כַּאֲנָשִׁים\n"),

        new GrammarRule("Inseparable prepositions: 3/4\n" +
            "* Before a vocal Shewa will take a Hireq לִנְבִיאִים\n"),

        new GrammarRule("Inseparable prepositions: 4/4\n" +
            "* When combined with a definite article replaces the ה and takes its vowel ּבַשָּׂדֶה\n"),

        new GrammarRule("The preposition מִן" + " 1/8\n" +
            " * Frequently is joined to its object via a Maqqef (-)\n"),

        new GrammarRule("The preposition מִן" + " 2/8\n" +
            " * Can occur as an inseparable preposition, in which case the first consontant of\n" +
            "   the noun to which it is prefixed usually takes a dagesh forte: מִמֶּלֶך\n"),

        new GrammarRule("The preposition מִן" + " 3/8\n" +
            " * Can occur as an inseparable preposition, in which case the first consontant of\n" +
            "   the noun to which it is prefixed usually takes a dagesh forte: מִמֶּלֶך\n" +
            "   * When the first letter is a begadkephat letter with a dagesh lene, the dagesh\n" +
            "     lene becomes a dagesh forte\n"),

        new GrammarRule("The preposition מִן" + " 4/8\n" +
            " * Can occur as an inseparable preposition, in which case the first consontant of\n" +
            "   the noun to which it is prefixed usually takes a dagesh forte: מִמֶּלֶך\n" +
            "   * When the first letter is a gutteral, the hireq under מ lengthens to a tsere\n" +
            "     e.g. מֵאִישׁ\n"),

        new GrammarRule("The preposition מִן" + " 5/8\n" +
            " * Can occur as an inseparable preposition, in which case the first consontant of\n" +
            "   the noun to which it is prefixed usually takes a dagesh forte: מִמֶּלֶך\n" +
            "   * When the first letter is ח there is not usually vowel lengthening.\n"),

        new GrammarRule("The preposition מִן" + " 6/8\n" +
            " * Special uses beyond \"from\"\n" +
            "   * Comparative use: applied to adjective to make it comparative\n" +
            "     e.g. טוֹבָה חָכְמָה מִזָּהָב wisdom is better than gold\n"),

        new GrammarRule("The preposition מִן" + " 7/8\n" +
            " * Special uses beyond \"from\"\n" +
            "   * Superlative use: used with כּל to express superlative\n" +
            "     e.g. עָרוּם מִכֹּל חַיַּת הַשָּׂדֶה the most clever living thing of the field\n"),

        new GrammarRule("The preposition מִן" + " 8/8\n" +
            " * Special uses beyond \"from\"\n" +
            "   * Partitive use: Can mean a part of something: מֵהָאֲנָשִׁים some of the men"),

        new GrammarRule("Compound prepositions: 1/4\n" +
            " * preposition plus פנה (face)\n" +
            "   * before, in the precense of: לִפְנֵי\n"),

        new GrammarRule("Compound prepositions: 2/4\n" +
            " * preposition plus פנה (face)\n" +
            "   * away from, out from, from before, on account of: מִפְּנֵי and מִלִּפְנֵי\n"),

        new GrammarRule("Compound prepositions: 3/4\n" +
            " * preposition plus פנה (face)\n" +
            "   * in the face, in the sight of, before, up against, opposite to: עַלֿֿ-פְּנֵי\n"),

        new GrammarRule("Compound prepositions: 4/4\n" +
            " * preposition plus דבר\n" +
            "   * on account of עַל-דְּבַר"),

        new GrammarRule("Use of adjectives: 1/3\n" +
            " * Attributive: modifies a noun.  Attributive adjectives follow the noun they\n" +
            "   modify and agree in gender, number, and definiteness.\n"),

        new GrammarRule("Use of adjectives: 2/3\n" +
            " * Predicative: asserts something about the noun, e.g. the book is big.\n" +
            "   No verb is used.  Predicative adjectives agree with the noun in gender and number\n" +
            "   but not definiteness.  They may proceed or follow the noun.\n"),

        new GrammarRule("Use of adjectives: 3/3\n" +
            " * Substantive: no noun present, stands for those who have the trait (e.g. the wise)"),

        // TODO - need to understand the difference in how these are translated.
        new GrammarRule("Demonstratives as adjectives and pronouns: 1/2\n" +
            " * When a demonstrative is functioning as an adjective, it will follow the noun\n" +
            "   it modifies and agree in gender, number, and definiteness. האיש הזה\n" +
            "   * Attributive adjective (if present) will be between the noun and the following\n" +
            "     demonstrative: האיש הטוב הזה\n"),

        new GrammarRule("Demonstratives as adjectives and pronouns: 2/2\n" +
            " * When a demonstrative is functioning as a pronoun, it will procede the noun and\n" +
            "   agree in gender and number but not definiteness. זה האיש\n" +
            "   * Attributive adjective (if present) will still follow the noun: זה האיש הטוב"),

        new GrammarRule("Spelling for interrogative particle הֲ" + " 1/2\n" +
            " * Prefixed to a guttural consonant or any consonant with a shewa: הַ\n"),

        new GrammarRule("Spelling for interrogative particle הֲ" + " 2/2\n" +
            " * Prefixed to a guttural consonant followed by a qamets: הֶ"),

        new GrammarRule("Disambiguating the definite article and the interrogative particle: 1/3\n" +
            " * The interrogative particle does not usually have a dagesh forte in the next consonant\n"),

        new GrammarRule("Disambiguating the definite article and the interrogative particle: 2/3\n" +
            " * The interrogative particle is often attached to a verb or another particle\n"),

        new GrammarRule("Disambiguating the definite article and the interrogative particle: 3/3\n" +
            " * The definite article is never spelled with a hateph patach"),

        new GrammarRule("Pronominal suffixes: 1/4\n" +
            " * When attached to a noun they indicate possessive.\n"),

        new GrammarRule("Pronominal suffixes: 2/4\n" +
            " * When attached to a preposition or the definite direct object marker they are objective\n."),

        new GrammarRule("Pronominal suffixes: 3/4\n" +
            " * Come in types 1 and 2:\n" +
            "   * Type 1 is used with singular nouns, some prepositions, and the direct object marker.\n"),

        new GrammarRule("Pronominal suffixes: 4/4\n" +
            " * Come in types 1 and 2:\n" +
            "   * Type 2 is used with plural nouns and some prepositions.\n"),

        new GrammarRule("Spelling changes for pronominal suffixes: 1/7\n" +
            " * Singular nouns can take plural pronominal suffixes (e.g. my horses) and vice versa.\n"),

        new GrammarRule("Spelling changes for pronominal suffixes: 2/7\n" +
            " * When attached to masculine (or feminine endingless) plural nouns, the ים is dropped\n"),

        new GrammarRule("Spelling changes for pronominal suffixes: 3/7\n" +
            " * Nouns ending segol ה (e.g. שָׂדֶה ) will drop the segol ה before adding the\n" +
            "   pronominal suffix: שׂדִי my field\n"),

        new GrammarRule("Spelling changes for pronominal suffixes: 4/7\n" +
            " * Feminine singular nouns ending in patach ה the ה changes to ת before the ending\n" +
            "   is applied.\n"),

        new GrammarRule("Spelling changes for pronominal suffixes: 5/7\n" +
            " * Many monosyllabic nouns add י to their stem before a pronominal suffix.  Can be\n" +
            "   distinguished in the singular (type 1) by the hireq before the י\n"),

        new GrammarRule("Spelling changes for pronominal suffixes: 6/7\n" +
            " * The preposition כְּ changes to כָּמוֹ in singular and first person plural when\n" +
            "   taking a pronominal suffix.\n"),

        new GrammarRule("Spelling changes for pronominal suffixes: 7/7\n" +
            " * The preposition מִן changes to מִמֶ in singular and first person plural when\n" +
            "   taking a pronominal suffix.\n"),

        new GrammarRule("Distinguishing similar words with pronominal suffixes: 1/2\n" +
            " * Direct object marker and אֵת/אֶת are the same alone but differ with pronominal\n" +
            "   suffix.  Direct object marker has a holem: אֹתֵי while the preposition has hireq\n" +
            "   and dagesh forte: אִתִּי\n"),

        new GrammarRule("Distinguishing similar words with pronominal suffixes: 2/2\n" +
            " * Preposition עִם and noun עַם both keep their first vowels throughout, both add\n" +
            "   dagesh forte in mem."),

        new GrammarRule("Construct chains: 1/8\n" +
            " * Roughly equivalent to Greek genitive case.\n"),

        new GrammarRule("Construct chains: 2/8\n" +
            " * Last noun in the chain is in an absolute state, all others are in construct state.\n"),

        new GrammarRule("Construct chains: 3/8\n" +
            " * No other words can come between the nouns in a construct chain.\n"),

        new GrammarRule("Construct chains: 4/8\n" +
            " * A construct chain is either entirely definite or entirely indefinite.  When\n" +
            "   definite only the absolute noun takes the definite article or has a\n" +
            "   pronominal suffix or is a proper noun.\n"),

        new GrammarRule("Construct chains: 5/8\n" +
            " * Adjectives that modify any noun in the chain come after the chain.  Number and\n" +
            "   gender of the adjective can sometimes determine which noun it modifies, sometimes\n" +
            "   you must use context.  This applies to demonstratives adjectives (this, that) as well.\n"),

        new GrammarRule("Construct chains: 6/8\n" +
            " * Substantive adjectives functioning as a noun can form part of the construct chain.\n"),

        new GrammarRule("Construct chains: 7/8\n" +
            " * Inseparable prepositions can be attached to construct nouns.\n"),

        new GrammarRule("Construct chains: 8/8\n" +
            " * A noun can be made superlative by placing it in a construct chain\n" +
            "   with the construct noun singular and the absolute noun plural and definite:\n" +
            "   e.g. קֹדֶשׁ הַקֱּדָשִׁים the holy of holies, or the most holy [place]."),

        new GrammarRule("Spelling in construct state: 1/6\n" +
            " * A construct noun surrenders its primary accent.  A construct chain is pronounced\n" +
            "   as a single word, with the accent on the absolute noun.  This is sometimes\n" +
            "   marked with a maqqef (-).\n"),

        new GrammarRule("Spelling in construct state: 2/6\n" +
            " * Masculine plural and both dual endings change to" + " ֵי " + " e.g. אֱלֹהִים changes to אֱלֹהֵי \n"),

        new GrammarRule("Spelling in construct state: 3/6\n" +
            " * Vowel reduction:\n" +
            "   * Qamets (and sometimes tsere) change to patach in a final closed syllable:\n" +
            "     e.g. מִשְׁפָּט changes to מִשְׁפַּט\n"),

        new GrammarRule("Spelling in construct state: 4/6\n" +
            " * Vowel reduction:\n" +
            "   * Qamets or tsere change to vocal shewa in open, unaccented syllable:\n" +
            "     (or a hateph vowel under a gutteral): נָבִִיא changes to נְבִיא \n"),

        new GrammarRule("Spelling in construct state: 5/6\n" +
            " * Feminine singular nouns ending in" + " ָה " + "changes to" + " ַת " + "\n" +
            "   e.g. תּוֹרָה becomes תּוֹרַת\n"),

        new GrammarRule("Spelling in construct state: 6/6\n" +
            " * Some monosyllabic nouns add a hireq yod in the contruct state."),

        new GrammarRule("Cardinal numbers: 1/4\n" +
            " * 'one' acts as an adjective and comes after the noun and agrees in gender and\n" +
            "   definiteness.  Can be used in a construct in which case it means 'one of'.\n"),

        new GrammarRule("Cardinal numbers: 2/4\n" +
            " * 'two' is a noun, agrees in gender with the modified noun, and can be used in\n" +
            "   absolute or construct state with no change in meaning.\n"),

        new GrammarRule("Cardinal numbers: 3/4\n" +
            " * 3-10 are nouns but take opposite gender from what they are modifying.  Can also\n" +
            "   be absolute or construct.\n"),

        new GrammarRule("Cardinal numbers: 4/4\n" +
            " * 2-10 can have a pronominal suffix, meaning 'x of y', e.g. שְׁנֵיהֶם 'two of them'"),

        new GrammarRule("Patterns of cardinal numbers above 10: 1/10\n" +
            " * 11-19: x 10, e.g. אַחַתּי עָשָׂר is 11\n" +
            " * 11-19: 10 agrees with modified noun in gender, while other number is opposite.\n"),

        new GrammarRule("Patterns of cardinal numbers above 10: 2/10\n" +
            " * 20: Masculine plural of 10\n"),

        new GrammarRule("Patterns of cardinal numbers above 10: 3/10\n" +
            " * 30-90: Masculine plural of 3-9\n"),

        new GrammarRule("Patterns of cardinal numbers above 10: 4/10\n" +
            " * 21-99: x and y: עֶשְׂרִים וְאַחַת twenty and one\n"),

        new GrammarRule("Patterns of cardinal numbers above 10: 5/10\n" +
            " * 200: one hundred dual: מָאתַים\n"),

        new GrammarRule("Patterns of cardinal numbers above 10: 6/10\n" +
            " * 300-900: x 100, e.g. שְׁלֹשׁ מֵאוֹת three hundred\n"),

        new GrammarRule("Patterns of cardinal numbers above 10: 7/10\n" +
            " * 2000: one thousand dual: אַלְפַּיִם\n"),

        new GrammarRule("Patterns of cardinal numbers above 10: 8/10\n" +
            " * 3000-9000: x 1000, e.g. שְׁלֹשֶׁת אֶלֶף\n"),

        new GrammarRule("Patterns of cardinal numbers above 10: 9/10\n" +
            " * 20,000: ten thousand dual: רִבּוֹתַיִם\n"),

        new GrammarRule("Patterns of cardinal numbers above 10: 10/10\n" +
            " * 30,000-90,000: x 10,000, e.g. שְׁלֹשׁ רִבּוֹת"),

        new GrammarRule("Ordinal numbers: 1/2\n" +
            " * Classified as adjectives, when attributive they follow the noun they modify\n" +
            "   and usually agree in gender and definiteness.\n"),

        new GrammarRule("Ordinal numbers: 2/2\n" +
            " * For ordinals greather than tenth, cardinal numbers are used."),

        new GrammarRule("Basic verbal stem meaning:\n" +
            "           Simple    Intensive   Causative\n" +
            "Active     qal       piel        hiphil\n" +
            "Passive    niphal    pual        hophal\n" +
            "Reflexive  niphal    hithpael"),

        new GrammarRule("Hebrew verb conjugations: 1/8\n" +
            " * Perfect:  completed action, state of being.\n"),

        new GrammarRule("Hebrew verb conjugations: 2/8\n" +
            " * Imperfect:  incomplete action, habitual or customary actions, subjunctive.\n"),

        new GrammarRule("Hebrew verb conjugations: 3/8\n" +
            " * Imperative: direct command, sometimes request, second person only.\n"),

        new GrammarRule("Hebrew verb conjugations: 4/8\n" +
            " * Cohortative: wish, request, or command, can express purpose or result, first person only\n"),

        new GrammarRule("Hebrew verb conjugations: 5/8\n" +
            " * Jussive:  mild command or strong wish, third person only\n"),

        new GrammarRule("Hebrew verb conjugations: 6/8\n" +
            " * Infinitive construct: like an English infinitive, a verbal noun.\n"),

        new GrammarRule("Hebrew verb conjugations: 7/8\n" +
            " * Infinitive absolute: used with other verbs to emphasize or intensify action or to\n" +
            "   express contemporaneous action.  Can be used as an imperative.\n"),

        new GrammarRule("Hebrew verb conjugations: 8/8\n" +
            " * Participle:  verbal adjective."),

        // TODO need to align these so they look better; probably don't need every declination; add some examples from imperfect.
        new GrammarRule("Stative verbs often have tsere (..) or holem (o) in second vowel.\n" +
            "In the imperfect they have pathach (_) instead of holem in the second vowel.\n" +
            "           Tsere    Holem    Strong\n" +
            "           Stative  Stative    Verb\n" +
            "Perfect        " + "קָטַל     קָטֹן      כָּבֵד" + "\n" +
            "Imperfect      " + "יִקְטֹל    יִקְטַן    יִכְבַּד" + "\n" +
            "No idea why the dagesh jumps from consontant כ to ב in כבד imperfect."),

        new GrammarRule("Strong verbs have three strong consonants.  Weak verbs classified as follows: 1/8\n" +
            " * I-Guttural\n"),

        new GrammarRule("Strong verbs have three strong consonants.  Weak verbs classified as follows: 2/8\n" +
            " * II-Guttural\n"),

        new GrammarRule("Strong verbs have three strong consonants.  Weak verbs classified as follows: 3/8\n" +
            " * III-Guttural, broken into III-ח/ע, III-א, and III-ה (really III-י but י changes to ה in many forms)\n"),

        new GrammarRule("Strong verbs have three strong consonants.  Weak verbs classified as follows: 4/8\n" +
            " * I-י\n"),

        new GrammarRule("Strong verbs have three strong consonants.  Weak verbs classified as follows: 5/8\n" +
            " * I-נ\n"),

        new GrammarRule("Strong verbs have three strong consonants.  Weak verbs classified as follows: 6/8\n" +
            " * Doubly weak (two of the above)\n"),

        new GrammarRule("Strong verbs have three strong consonants.  Weak verbs classified as follows: 7/8\n" +
            " * Biconsonantal (also called hollow or II-ו/י) these drop middle letter in perfect\n"),

        new GrammarRule("Strong verbs have three strong consonants.  Weak verbs classified as follows: 8/8\n" +
            " * Geminate - identical 2nd and 3rd consonants."),

        new GrammarRule("Verb frequencies:  72K total verbs in OT\n" +
            " Qal:       50,699\n" +
            " Hiphil:     9,496\n" +
            " Piel:       6,473\n" +
            " Niphal:     4,138\n" +
            " Hithpael:     842\n" +
            " Pual:         423\n" +
            " Hophal:       396\n"),

        new GrammarRule("Uses of הִנֵּה:" + " 1/3\n" +
            "* add emphasis or stress (demonstrative interjection):\n" +
            "  " + "הִנֵּה עֵיר יְהוָה אֶל–יְרֵאָיו" + "  Behold, the eye of the LORD is upon those who fear him\n"),

        new GrammarRule("Uses of הִנֵּה:" + " 2/3\n" +
            "* indicate the immediate presence of someone or something with an emphasis on\n" +
            "  immediacy or urgency:\n" +
            "  " + "וַהִנֵּה אָנֹכִי עִמָּך" + "  And he said, behold, here I am\n"),

        new GrammarRule("Uses of הִנֵּה:" + " 3/3\n" +
            "* may be used to introduce a fact or situation on which a subsequent statement is based\n" +
            "  Behold, I have listened to all that you have said to me and [therefore] I have\n" +
            "  caused a king to reign over you"),

        // TODO check the thing about the dagesh, I'm not sure that's right
        new GrammarRule("Waw consecutive is וַ with dagesh in following letter.\n 1/5" +
            "*  Imperfect can still take non-consecutive waw to mean simple and, וְ\n"),

        new GrammarRule("Waw consecutive is וַ with dagesh in following letter.\n 2/5" +
            "*  Waw consecutive imperfect chain can start with וַיְהִי (and it was) meaning 'after'\n"),

        new GrammarRule("Waw consecutive is וַ with dagesh in following letter.\n 3/5" +
            "*  Waw consecutive perfect chain can start with וְהִיִה 'and it will be'\n"),

        new GrammarRule("Waw consecutive is וַ with dagesh in following letter.\n 4/5" +
            "*  Waw consecutive perfect used after imperative to continue imperative chain\n" +
            "   and should be translated as imperative\n"),

        new GrammarRule("Waw consecutive is וַ with dagesh in following letter.\n 5/5" +
            "*  Perfect prefixed with waw in chain of perfects NOT waw consecutive"),

        new GrammarRule("Imperative is not negated, instead use negative with imperfect 1/3\n" +
            "*  To express permanent prohibition: לֹא plus imperfect\n"),

        new GrammarRule("Imperative is not negated, instead use negative with imperfect 2/3\n" +
            "*  To express temporary prohibition: אַל plus imperfect.\n"),

        new GrammarRule("Imperative is not negated, instead use negative with imperfect 3/3\n" +
            "*  Cohortative and jussive negated with אַל, a milder form of prohibition than לֹא"),

        new GrammarRule("Imperative sometimes followed by נָא, which can be translated \"please\""),

        new GrammarRule("Cohortative expresses a wish, request, or command, but only in first person.  Often \n" +
            "translated with 'let me' or 'may we'."),

        new GrammarRule("When verb with imperfect first person form begins a clause, it is generally cohortative."),

        new GrammarRule("Jussive expresses a wish, request, or command, but only in third person.  Often \n" +
            "translated with 'let him' or 'may she'."),

        new GrammarRule("When verb with imperfect third person form begins a clause, it is generally jussive.\n" +
            "In general jussive is same as 3 person imperfect."),

        new GrammarRule("In some weak verb forms, especially III-ה and hiphil final consonant is often dropped in jussive"),

        new GrammarRule("Pronominal suffixes on verbs can be used to express a pronoun as the direct object of\n" +
            "the verb.  This can also be done by attaching the pronoun to the direct object marker את\n" +
            "Type 1 pronominal suffixes are used."),

        new GrammarRule("Pronominal suffixes on imperfect weak III-ה verbs drop the ה\n:" +
            "יִרְאֶה" + "  +  " + "נָּה" + "  becomes " + "יִרְאֶנָּה" + "  he will see her"),

        new GrammarRule("Pronominal suffixes on imperative same as imperfect except 2ms for is קָטְל instead of קְטְל\n\n" +
            "2fs imperative with pronominal suffix very rare and 2fp not attested\n" +
            "קָטְלֵ הוּ" + "      kill him!\n"),

        new GrammarRule("Infinitives (both construct and absolute) are verbal nouns"),

        new GrammarRule("Infinitive is negated with לְבִלְתּי "),

        new GrammarRule("Infinitive construct functions much like the English infinitive"),

        new GrammarRule("Infinitive constructs can take pronominal suffixes.  These suffixes can serve as the\n" +
            "'subject' or object of the infinitive, e.g. קָטְלוֹ can mean 'his killing' or 'killing him'"),

        new GrammarRule("Infinitive construct 1/6\n" +
            "* with ל \n" +
            "  * can indicate purpose, intention, or result:\n    " +
            "וַיִּקַּה אֶת–הַמַּאֲכֶלֶת ––לִשְׁחט—— אֶת–בּנו  " +
            "\n    And he took the _in order to slaughter_ his son\n"),

        new GrammarRule("Infinitive construct 2/6\n" +
            "* with ל \n" +
            "  * can be inceptive (often with היה), meaning it indicates something that is about to happen:\n    " +
            "וַיְהִי הַשֶּׁמֶשׁ ––לָבוֹא––  " + "    The sun was about _to set_\n"),

        new GrammarRule("Infinitive construct 3/6\n" +
            "* with ל \n" +
            "  * can be used to denote sequence of verbal actions or obligation or necessity.  These are less common.\n"),

        new GrammarRule("Infinitive construct 4/6\n" +
            "* can act as a verbal noun:  " + "טוֹב ––לְהֹדוֹת–– לַיהוָה " + "It is good _to praise_ the LORD\n"),

        new GrammarRule("Infinitive construct 5/6\n" +
            "* can be complementary.  That is, it works to explain, clarify, or complement a preceding action or statement.\n" +
            "  In such cases the best English translation is often a finite verb:\n  " +
            "וְשָׁמַרְתָּ אֶת–מִצְוֹת יְהוָה אֱלֹהֶיךָ ––לָלֶכֶת–– בִּדְרָכָיו  " +
            "\n  And you shall observe the commandments of the LORD your God _by walking_ in his ways.\n"),

        new GrammarRule("Infinitive construct 6/6\n" +
            "* with בְּ or כְּ and often a pronominal suffix indicate temporality (while, when).  Often these are paired \n" +
            "  with וַיְהִי (and he was) or וְהָיָה (and he will be) (remember waw consecutive) to indicate perfect or imperfect.\n  " +
            "וַיְהִ בִּהְיוֹתָם בַּשָּׂדֶה  " + "When they were in the field"),

        new GrammarRule("Infinitive absolute is a verbal noun but has no direct English equivalent."),

        new GrammarRule("Common uses of infinitive absolute: 1/4\n" +
            "* Emphatic:  will immediately precede (rarely follow) a im/perfect of the same\n" +
            "  root to emphasize the verb:" + "  אָמוֹר אָמַרְתִּי " + "I have surely said\n"),

        new GrammarRule("Common uses of infinitive absolute: 2/4\n" +
            "* Imperatival:  can stand alone and function as imperative:\n" +
            "  זָכוֹר אֶת–הַיּוֹם הַזֶּה " + "  Remember this day!\n"),

        new GrammarRule("Common uses of infinitive absolute: 3/4\n" +
            "* Contemporaneous action: two infinitives absolutes and a im/perfect of the same\n" +
            "  root as one infinitive expresses contemporary action:\n" +
            "  וַיֵּלֶך הָלוֹך וְאָכֹל " + " and they walked, eating as they went\n"),

        new GrammarRule("Common uses of infinitive absolute: 4/4\n" +
            "* Complementary: may complement the main verb and carry the temporal value\n" +
            // TODO figure out the examples
            "  of that verb (no example given because I don't understand the examples)"),

        // I'm not drunk, this spacing makes it come out right in the display
        new GrammarRule("Qal weak verbs:  Perfect 1/4\n" +
            "Strong              " + "קָטַל" + "\n" +
            "III-" + "מָצָא               א" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Perfect 2/4\n" +
            "Strong              " + "קָטַל" + "\n" +
            "III-" + "בָּנָה               ה" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Perfect 3/4\n" +
            "Strong              " + "קָטַל" + "\n" +
            "Biconsonental        " + "קָם" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Perfect 4/4\n" +
            "Strong              " + "קָטַל" + "\n" +
            "Geminate            " + "סָבַב" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperfect 1/11\n" +
            "Strong              " + "יִקְטֹל" + "\n" +
            "I-" + "יֶאֱסֹר                 א" + "\n" +
            "I-" + "יֹאמַר                 א" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperfect 2/11\n" +
            "Strong              " + "יִקְטֹל" + "\n" +
            "I-" + "יֶחֱזַק                 ח" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperfect 3/11\n" +
            "Strong              " + "יִקְטֹל" + "\n" +
            "I-" + "יֵלֵך                  י" + "\n" +
            "I-" + "יִירַשׁ                 י" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperfect 4/11\n" +
            "Strong              " + "יִקְטֹל" + "\n" +
            "I-" + "יִפֹּל                  נ" + "\n" +
            "I-" + "יִקַּח                  נ" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperfect 5/11\n" +
            "Strong              " + "יִקְטֹל" + "\n" +
            "I-" + "יַעֲמֹד                 ע" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperfect 6/11\n" +
            "Strong              " + "יִקְטֹל" + "\n" +
            "II-Gutteral         " + "יִבְחַר" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperfect 7/11\n" +
            "Strong              " + "יִקְטֹל" + "\n" +
            "III-" + "יִמְצָאָ               א" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperfect 8/11\n" +
            "Strong              " + "יִקְטֹל" + "\n" +
            "III-" + "יִבְנֶה               ה" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperfect 9/11\n" +
            "Strong              " + "יִקְטֹל" + "\n" +
            "III-" + "יִשְׁלַח             ע/ח" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperfect 10/11\n" +
            "Strong              " + "יִקְטֹל" + "\n" +
            "Biconsonental       " + "יָקוּם" + "\n" +
            "Biconsonental       " + "יָבוֹא" + "\n" +
            "Biconsonental       " + "יָשִׂים" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperfect 11/11\n" +
            "Strong              " + "יִקְטֹל" + "\n" +
            "Geminate             " + "יָסֹב" + "\n" +
            "Geminate             " + "יֵתַם" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperative 1/10\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "I-" + "אֱמֹר                 א" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperative 2/10\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "I-" + "חֲזַק                 ח" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperative 3/10\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "I-" + "לֵך                  י" + "\n" +
            "I-" + "רַשׁ                  י" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperative 4/10\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "I-" + "נְפֹל                 נ" + "\n" +
            "I-" + "קַח                  נ" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperative 5/10\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "II-Gutteral         " + "בְּחַר" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperative 6/10\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "III-" + "מְצָא               א" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperative 7/10\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "III-" + "בְּנֵה               ה" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperative 8/10\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "III-" + "שְׁלַח             ע/ח" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperative 9/10\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "Biconsonental       " + "קוּם" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Imperative 10/10\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "Geminate             " + "סֹב" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs: Infinitive Construct 1/8\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "I-" + "אֱמֹר                 א" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs: Infinitive Construct 2/8\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "I-" + "לֶכֶת                 י" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs: Infinitive Construct 3/8\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "I-" + "עֲמֹד                 ע" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs: Infinitive Construct 4/8\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "II-Gutteral         " + "בְּחֹר" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs: Infinitive Construct 5/8\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "III-" + "מְצֹא               א" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs: Infinitive Construct 6/8\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "III-" + "בְּנוֹת              ה" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs: Infinitive Construct 7/8\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "III-" + "שְׁלֹחַ             ע/ח" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs: Infinitive Construct 8/8\n" +
            "Strong              " + "קְטֹל" + "\n" +
            "Biconsonental       " + "קוּם" + "\n" +
            "Biconsonental       " + "בוֹא" + "\n" +
            "Biconsonental       " + "שׂים" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Infinitive Absolute 1/2\n" +
            "Strong              " + "קָטוֹל" + "\n" +
            "III-" + "בָּנֹה                ה" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Infinitive Absolute 2/2\n" +
            "Strong              " + "קָטוֹל" + "\n" +
            "Biconsonental        " + "קוֹם" + "\n" +
            "Biconsonental        " + "בוֹא" + "\n" +
            "Biconsonental        " + "שׂוֹם" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Participle 1/3\n" +
            "Strong              " + "קֹטֵל" + "\n" +
            "III-" + "בֹּנֶה               ה" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Participle 2/3\n" +
            "Strong              " + "קֹטֵל" + "\n" +
            "III-" + "שֹׁמֵעַ             ע/ח" + "\n" +
            ""),

        new GrammarRule("Qal weak verbs:  Participle 3/3\n" +
            "Strong              " + "קֹטֵל" + "\n" +
            "Biconsonental        " + "קָם" + "\n" +
            ""),

        new GrammarRule("Participle יֵשׁ:" + " 1/3\n" +
            "* Is not inflected\n"),

        new GrammarRule("Participle יֵשׁ:" + " 2/3\n" +
            "* Can express existence: יֵשׁ מֶלֶך there is a king, or a king is\n"),

        new GrammarRule("Participle יֵשׁ:" + " 3/3\n" +
            "* Followed by preposition לְ indicates possession: יֶשׁ–לִי תִקְוָה I have hope"),

        new GrammarRule("Participle אֵין (sometimes spelled אַיִן) 1/4\n" +
            "* Is not inflected\n"),

        new GrammarRule("Participle אֵין (sometimes spelled אַיִן) 2/4\n" +
            "* Can take pronominal suffixes\n"),

        new GrammarRule("Participle אֵין (sometimes spelled אַיִן) 3/4\n" +
            "* can express non-existence: אֵין לוֹ בֵּן he had no son\n"),

        new GrammarRule("Participle אֵין (sometimes spelled אַיִן) 4/4\n" +
            "* Can negate a verbless clause: אֵינָם יְרֵאִים אֶת–יְהוָה They do not fear the LORD"),

        new GrammarRule("Participles can be 1/3\n" +
            " * attributive, meaning they can directly modify a noun:\n    " +
            "הָעָם הֵיֹּשֵׁב בָּאָרֶץ " +
            " the people dwelling [or who dwell] in the land\n"),

        new GrammarRule("Participles can be 2/3\n" +
            " * predicative, meaning they assert or predicate something about the noun:\n    " +
            "וְהָהָר בֹּעֵר בָּאֵשׁ " + "  And the mountain was burning with fire\n"),

        new GrammarRule("Participles can be 3/3\n" +
            " * substantive, meaning they act as a noun.  In this situation they can take a direct object, be part of a\n" +
            "   construct chain, or take a pronominal suffix.\n    " +
            "הַיּוֹשֶׁבֶת בַּגַּנִּים " + "the one who dwells in the gardens"),

        new GrammarRule("Qal passive participle: 1/2\n" +
            "             Singular         Plural\n" +
            "Masculine        " + "קְטוּלִים         קָטוּל" + "\n" +
            "Feminine        " + "קְטוּלוֹת         קְטוּלָה"),

        new GrammarRule("Qal passive participle: 2/2\n" +
            "All but III-ה follow the strong pattern\n" +
            "III-ה verb:\n" +
            "             Singular         Plural\n" +
            "                 " + "בְּנוּיִים         בָּנוּי" + "\n" +
            "                " + "בְּנוּיוֹת         בְּנוּיָה"),

        new GrammarRule("Participles, because they behave like nouns, can take a definite article,\n" +
            "prepositional prefix (ל, ב, כ), or pronominal suffix.  They may also occur in a construct chain in the construct state."),

        new GrammarRule("Standard Hebrew word order is VSO\n" +
            "In the object section, direct and indirect object can come in any order\n" +
            "Indirect object usually marked with לְ or -אֶל"),

        new GrammarRule("Verb tense and sentance order: 1/5\n" +
            "* When a perfect verb is describing a completed action it is usually proceeded\n" +
            "    by a time clause or other explanatory clause.\n"),

        new GrammarRule("Verb tense and sentance order: 2/5\n" +
            "* A consecutive perfect is normally the first word in its clause.\n"),

        new GrammarRule("Verb tense and sentance order: 3/5\n" +
            "* A regular imperfect is not normally the first word in the clause.\n"),

        new GrammarRule("Verb tense and sentance order: 4/5\n" +
            "* A consecutive imperfect is always the first word in its clause\n"),

        new GrammarRule("Verb tense and sentance order: 5/5\n" +
            "* A jussive or cohortative (aka volitional imperfect) is normally the first word in its clause."),

        new GrammarRule("Sequences with volational conjugations:\n 1/3" +
            "* Imperatives can occur in succession, possibly linked by ו.  This linkage can consequential or sequential:\n" +
            "  e.g.  עֲלֵח וּקְבֹר אֶת–אָבִיךָ Go up and bury your father.\n"),

        new GrammarRule("Sequences with volational conjugations:\n 2/3" +
            "* An imperative may be followed by a consecutive perfect.  The perfect may carry the full force of the imperative:\n" +
            "  e.g. לֵך וְאָמַרְתָּ אֶל–עַבְדִּי Go and say to my servant...\n"),

        new GrammarRule("Sequences with volational conjugations:\n 3/3" +
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

        new GrammarRule("ו:" + " 1/6\n" +
            "* Conjunctive is usually prefixed to a verb and links clauses sequentially, temporally, logically, or consequentially.\n"),

        new GrammarRule("ו:" + " 2/6\n" +
            "* Disjunctive is prefixed to a non-verb and is non-sequential; it introduces some kind of break in the narrative.\n"),

        new GrammarRule("ו:" + " 3/6\n" +
            "  Disjunctive meaning can be:\n" +
            "  * parenthetical, provides a parenthetical explanation or comment:\n    " +
            "וְהֵם לֹא יָדְעוּ כִּי שֹׁמֵעַ יוֹסֵף כִּי הַמֵּלִיץ בֵּינֹתָם" +
            "\n    Now they did not know that Joseph was understanding them, for there was an interpreter between them.\n"),

        new GrammarRule("ו:" + " 4/6\n" +
            "* Disjunctive meaning can be:\n" +
            "  * circumstantial, gives circumstantial information\n    " +
            "וַיְהִי כְּהַיּוֹם הַזֶּה וַיָּבֹא הַבַּיְתָה לַעֲשׂוֹת מְלַאכְתּוֹ => וְאֵין אִישׁ מֵאַנְשֵׁי חַבַּית שָׁם בַּבָּיִת" +
            "\n    And one day, he went into the house to do his work, => and none of the household servants were there in the house\n"),

        new GrammarRule("ו:" + " 5/6\n" +
            "* Disjunctive meaning can be:\n" +
            "  * contrastive, gives a contrasting idea\n    " +
            "וַיִּשַׁע יְהוָה אֶל–הֶבֶל וְאֶל–מִנְחָתוֹ => וְאֶל–קַיִן וְאֶל–מִנְחָתוֹ לֹא שָׁעָה" +
            "\n    The LORD looked favorably on Abel and his offering, => but on Cain and his offering he did not look favorably\n"),

        new GrammarRule("ו:" + " 6/6\n" +
            "* Disjunctive meaning can be:\n" +
            "  * introductory, begins a new narrative or introduces a new idea or theme\n    " +
            "וְהַנָּחָשׁ הָיָה עָרוּם מִכֹּל חַיַּת הַשָּׂדֶה אֲשֶׁר עָשָׂה יְהוָה אֱלֹהִים" +
            "\n    Now the serpent was more crafty than any creature that the LORD God had made"),

        new GrammarRule("Adverbs of time: עַתָּה (now), אָז (then), טֶרֶם (also as בְּטֶרֶם) (before).\n" +
            "Both עַתָּה and אָז can be followed by an imperfect that should be translated as a perfect.\n"),

        new GrammarRule("Adverbs of place: פֹּה, חֵנָּח (here), שָׁם (there), הוּץ (outside).\n"),

        new GrammarRule("Adverbs of degree: מְאֹד (very), עוֹד (again), תָּמִיד (continually).\n"),

        new GrammarRule("Adverbs of manner: יַחְדָּו (together), פִּתְאֹם (suddenly)."),

        new GrammarRule("Nipal can be passive, reflexive, reciprocal (they heard each other),\n" +
            "or middle where no agency is specified and the subject and object are the same (the gate opened)"),

        new GrammarRule("Niphal weak verbs:  Perfect 1/5\n" +
            "Strong          " + "נִקְטַל" + "\n" +
            "III-" + "נִמְצָא           א"),

        new GrammarRule("Niphal weak verbs:  Perfect 2/5\n" +
            "Strong          " + "נִקְטַל" + "\n" +
            "III-" + "נִבְנָה           ה"),

        new GrammarRule("Niphal weak verbs:  Perfect 3/5\n" +
            "Strong          " + "נִקְטַל" + "\n" +
            "II-Gutteral     " + "נֶעֱזַב"),

        new GrammarRule("Niphal weak verbs:  Perfect 4/5\n" +
            "Strong          " + "נִקְטַל" + "\n" +
            "I-" + "נִצַּל              נ"),

        new GrammarRule("Niphal weak verbs:  Perfect 5/5\n" +
            "Strong          " + "נִקְטַל" + "\n" +
            "I-" + "נוֹשַׁב             י"),

        new GrammarRule("Niphal weak verbs:  Imperfect 1/5\n" +
            "Strong          " + "יִקָּטֵל" + "\n" +
            "III-" + "יִמָּצֵא           א" ),

        new GrammarRule("Niphal weak verbs:  Imperfect 2/5\n" +
            "Strong          " + "יִקָּטֵל" + "\n" +
            "III-" + "יִבָּנֶה           ה" ),

        new GrammarRule("Niphal weak verbs:  Imperfect 3/5\n" +
            "Strong          " + "יִקָּטֵל" + "\n" +
            "II-Gutteral     " + "יֵעָזֵב" ),

        new GrammarRule("Niphal weak verbs:  Imperfect 4/5\n" +
            "Strong          " + "יִקָּטֵל" + "\n" +
            "I-" + "יִנָּצֵל             נ" ),

        new GrammarRule("Niphal weak verbs:  Imperfect 5/5\n" +
            "Strong          " + "יִקָּטֵל" + "\n" +
            "I-" + "יִוָּשֵׁב             י"),

        new GrammarRule("Niphal weak verbs:  Imperative 1/5\n" +
            "Strong          " + "הִקְּטֵל" + "\n" +
            "III-" + "הִמָּצֵא           א" ),

        new GrammarRule("Niphal weak verbs:  Imperative 2/5\n" +
            "Strong          " + "הִקְּטֵל" + "\n" +
            "III-" + "הִבָּנֵה           ה" ),

        new GrammarRule("Niphal weak verbs:  Imperative 3/5\n" +
            "Strong          " + "הִקְּטֵל" + "\n" +
            "II-Gutteral     " + "הֵעָזֵב" ),

        new GrammarRule("Niphal weak verbs:  Imperative 4/5\n" +
            "Strong          " + "הִקְּטֵל" + "\n" +
            "I-" + "הִנָּצֵל             נ" ),

        new GrammarRule("Niphal weak verbs:  Imperative 5/5\n" +
            "Strong          " + "הִקְּטֵל" + "\n" +
            "I-" + "הִוָּשֵׁב             י"),

        new GrammarRule("Niphal weak verbs:  Infinitive Construct 1/5\n" +
            "Strong           " + "הִקָּטֵל" + "\n" +
            "III-" + "הִמָּצֵא            א" ),

        new GrammarRule("Niphal weak verbs:  Infinitive Construct 2/5\n" +
            "Strong           " + "הִקָּטֵל" + "\n" +
            "III-" + "הִבָּנוֹת           ה" ),

        new GrammarRule("Niphal weak verbs:  Infinitive Construct 3/5\n" +
            "Strong           " + "הִקָּטֵל" + "\n" +
            "II-Gutteral      " + "הֵעָזֵב" ),

        new GrammarRule("Niphal weak verbs:  Infinitive Construct 4/5\n" +
            "Strong           " + "הִקָּטֵל" + "\n" +
            "I-" + "הִנָּצֵל              נ" ),

        new GrammarRule("Niphal weak verbs:  Infinitive Construct 5/5\n" +
            "Strong           " + "הִקָּטֵל" + "\n" +
            "I-" + "הִוָּשֵׁב              י"),

        new GrammarRule("Niphal weak verbs:  Infinitive Absolute 1/5\n" +
            "Strong           " + "נִקְטוֹל" + "\n" +
            "Strong           " + "הִקָּטוֹל" + "\n" +
            "III-" + "נִמְצוֹא            א" + "\n"),

        new GrammarRule("Niphal weak verbs:  Infinitive Absolute 2/5\n" +
            "Strong           " + "נִקְטוֹל" + "\n" +
            "Strong           " + "הִקָּטוֹל" + "\n" +
            "III-" + "נִבְנֹה             ה" + "\n" +
            "III-" + "הִבָּנֵה             ה" + "\n"),

        new GrammarRule("Niphal weak verbs:  Infinitive Absolute 3/5\n" +
            "Strong           " + "נִקְטוֹל" + "\n" +
            "Strong           " + "הִקָּטוֹל" + "\n" +
            "II-Gutteral      " + "נַעֳזוֹב" + "\n" +
            "II-Gutteral      " + "הֵעָזוֹב" + "\n"),

        new GrammarRule("Niphal weak verbs:  Infinitive Absolute 5/5\n" +
            "Strong           " + "נִקְטוֹל" + "\n" +
            "Strong           " + "הִקָּטוֹל" + "\n" +
            "I-" + "הִנָּצֵל               נ" + "\n" +
            "I-" + "נִצּוֹל               נ" ),

        new GrammarRule("Niphal weak verbs:  Infinitive Absolute 5/5\n" +
            "Strong           " + "נִקְטוֹל" + "\n" +
            "Strong           " + "הִקָּטוֹל" + "\n" +
            "I-" + "נוֹשָׁב               י"),

        new GrammarRule("Niphal weak verbs:  Participle 1/4\n" +
            "Strong           " + "נִקְטָל" + "\n" +
            "III-" + "נִמְצָא            א" ),

        new GrammarRule("Niphal weak verbs:  Participle 2/4\n" +
            "Strong           " + "נִקְטָל" + "\n" +
            "III-" + "נִבְנֶה            ה" ),

        new GrammarRule("Niphal weak verbs:  Participle 3/4\n" +
            "Strong           " + "נִקְטָל" + "\n" +
            "II-Gutteral      " + "נֶעֱזָב" ),

        new GrammarRule("Niphal weak verbs:  Participle 4/4\n" +
            "Strong           " + "נִקְטָל" + "\n" +
            "I-" + "נִצָּל               נ" + "\n"),

        new GrammarRule("Meaning of the Piel steam: 1/4\n" +
            "  * intensive - can intensify the meaning of the qal stem\n"),

        new GrammarRule("Meaning of the Piel steam: 2/4\n" +
            "  * factitive - turns an intransitive verb transitive\n" +
            "    e.g. " + "קָדַשׁ" + " he is holy, " + "קִדַּשׁ" + " he sanctified\n"),

        new GrammarRule("Meaning of the Piel steam: 3/4\n" +
            "  * denominitive - taking a noun or adjective stem and making it a verb\n" +
            "    e.g. " + "דָּבָר" + " word " + "דִּבֵּר" + " he spoke\n" +
            "    In this case the verb does not have an intensive meaning\n"),

        new GrammarRule("Meaning of the Piel steam: 4/4\n" +
            "  * iterative - often occurs with physical movement"),

        new GrammarRule("Piel weak verbs:  Perfect 1/5\n" +
            "Strong         " + "קֵטֵּל" + "\n" +
            "III-" + "שִׁלַּח        ע/ח" ),

        new GrammarRule("Piel weak verbs:  Perfect 2/5\n" +
            "Strong         " + "קֵטֵּל" + "\n" +
            "III-" + "מִצֵא          א" ),

        new GrammarRule("Piel weak verbs:  Perfect 3/5\n" +
            "Strong         " + "קֵטֵּל" + "\n" +
            "III-" + "גִּלָּה          ה" ),

        new GrammarRule("Piel weak verbs:  Perfect 4/5\n" +
            "Strong         " + "קֵטֵּל" + "\n" +
            "Geminate       " + "הֵלֵּל" ),

        new GrammarRule("Piel weak verbs:  Perfect 5/5\n" +
            "Strong         " + "קֵטֵּל" + "\n" +
            "II-Gutteral    " + "נִחַם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "בֵּרֵך" + " (compensatory lengthening)\n"),

        new GrammarRule("Piel weak verbs:  Imperfect 1/5\n" +
            "Strong         " + "יְקַטֵּל" + "\n" +
            "III-" + "יְשַׁלַּח        ע/ח" ),

        new GrammarRule("Piel weak verbs:  Imperfect 2/5\n" +
            "Strong         " + "יְקַטֵּל" + "\n" +
            "III-" + "יְמַצֵּא          א" ),

        new GrammarRule("Piel weak verbs:  Imperfect 3/5\n" +
            "Strong         " + "יְקַטֵּל" + "\n" +
            "III-" + "יְגַלֶּה          ה" ),

        new GrammarRule("Piel weak verbs:  Imperfect 4/5\n" +
            "Strong         " + "יְקַטֵּל" + "\n" +
            "Geminate       " + "יְהַלֵּל" ),

        new GrammarRule("Piel weak verbs:  Imperfect 5/5\n" +
            "Strong         " + "יְקַטֵּל" + "\n" +
            "II-Gutteral    " + "יְנַחֵם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "יְבָרֵך" + " (compensatory lengthening)"),

        new GrammarRule("Piel weak verbs:  Imperative 1/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "III-" + "שַׁלַּח        ע/ח" ),

        new GrammarRule("Piel weak verbs:  Imperative 2/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "III-" + "מַצֵּא          א" ),

        new GrammarRule("Piel weak verbs:  Imperative 3/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "III-" + "גַּלֵה          ה" ),

        new GrammarRule("Piel weak verbs:  Imperative 4/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "Geminate       " + "הַלֵּל" ),

        new GrammarRule("Piel weak verbs:  Imperative 5/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "II-Gutteral    " + "נַחֵם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "בָּרֵך" + " (compensatory lengthening)"),

        new GrammarRule("Piel weak verbs: Infinitive Construct 1/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "III-" + "שַׁלַּח        ע/ח" ),

        new GrammarRule("Piel weak verbs: Infinitive Construct 2/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "III-" + "מַצֵּא          א" ),

        new GrammarRule("Piel weak verbs: Infinitive Construct 3/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "III-" + "גַּלּוֹת          ה" ),

        new GrammarRule("Piel weak verbs: Infinitive Construct 4/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "Geminate       " + "הַלֵּל" ),

        new GrammarRule("Piel weak verbs: Infinitive Construct 5/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "II-Gutteral    " + "נַחֵם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "בָּרֵך" + " (compensatory lengthening)"),

        new GrammarRule("Piel weak verbs:  Infinitive Absolute 1/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "III-" + "שַׁלֵּחַ        ע/ח" ),

        new GrammarRule("Piel weak verbs:  Infinitive Absolute 2/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "III-" + "מַצֵּא          א" ),

        new GrammarRule("Piel weak verbs:  Infinitive Absolute 3/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "III-" + "גַּלֵּה          ה" ),

        new GrammarRule("Piel weak verbs:  Infinitive Absolute 4/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "Geminate       " + "הַלֵּל" ),

        new GrammarRule("Piel weak verbs:  Infinitive Absolute 5/5\n" +
            "Strong         " + "קַטֵּל" + "\n" +
            "II-Gutteral    " + "נַחֵם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "בָּרֵך" + " (compensatory lengthening)"),

        new GrammarRule("Piel weak verbs: Participle 1/5\n" +
            "Strong         " + "מְקַטֵּל" + "\n" +
            "III-" + "מְשַׁלֵּחַַ        ע/ח" ),

        new GrammarRule("Piel weak verbs: Participle 2/5\n" +
            "Strong         " + "מְקַטֵּל" + "\n" +
            "III-" + "מְמַצֵּא          א" ),

        new GrammarRule("Piel weak verbs: Participle 3/5\n" +
            "Strong         " + "מְקַטֵּל" + "\n" +
            "III-" + "מְגַלֶּה          ה" ),

        new GrammarRule("Piel weak verbs: Participle 4/5\n" +
            "Strong         " + "מְקַטֵּל" + "\n" +
            "Geminate       " + "מְהַלֵּל" ),

        new GrammarRule("Piel weak verbs: Participle 5/5\n" +
            "Strong         " + "מְקַטֵּל" + "\n" +
            "II-Gutteral    " + "מְנַחֵם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "מְבָרֵך" + " (compensatory lengthening)"),

        new GrammarRule("Pual steam is passive counterpart of Piel, indicates intensive action in passive voice"),

        new GrammarRule("Pual weak verbs:  Perfect 1/3\n" +
            "Strong         " + "קֻטַּל" + "\n" +
            "III-" + "מֻצָא          א" + "\n" +
            ""),

        new GrammarRule("Pual weak verbs:  Perfect 2/3\n" +
            "Strong         " + "קֻטַּל" + "\n" +
            "III-" + "גֻּלָּה          ה" + "\n" +
            ""),

        new GrammarRule("Pual weak verbs:  Perfect 3/3\n" +
            "Strong         " + "קֻטַּל" + "\n" +
            "II-Gutteral    " + "נֻחַם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "בֹּרַך" + " (compensatory lengthening)\n" +
            ""),

        new GrammarRule("Pual weak verbs:  Imperfect 1/3\n" +
            "Strong         " + "יְקֻטַּל" + "\n" +
            "III-" + "יְמֻצָּא          א" + "\n" +
            ""),

        new GrammarRule("Pual weak verbs:  Imperfect 2/3\n" +
            "Strong         " + "יְקֻטַּל" + "\n" +
            "III-" + "יְגֻלֶּה          ה" + "\n" +
            ""),

        new GrammarRule("Pual weak verbs:  Imperfect 3/3\n" +
            "Strong         " + "יְקֻטַּל" + "\n" +
            "II-Gutteral    " + "יְנֻחַם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "יְבֹרַך" + " (compensatory lengthening)\n" +
            ""),

        new GrammarRule("Pual weak verbs: Participle 1/3\n" +
            "Strong         " + "מְקֻטָּל" + "\n" +
            "III-" + "מְמֻצָּא          א" + "\n" +
            ""),

        new GrammarRule("Pual weak verbs: Participle 2/3\n" +
            "Strong         " + "מְקֻטָּל" + "\n" +
            "III-" + "מְגֻלֶּה          ה" + "\n" +
            ""),

        new GrammarRule("Pual weak verbs: Participle 3/3\n" +
            "Strong         " + "מְקֻטָּל" + "\n" +
            "II-Gutteral    " + "מְנֻחָם" + " (virtual doubling)\n" +
            "II-Gutteral    " + "מְבֹרָך" + " (compensatory lengthening)\n" +
            ""),

        new GrammarRule("Hiphil stem, most common derived stem.  Meaning can be: 1/4\n" +
            "* causative: Causing something to occur: מָלַך he reigned, הִמְלִיך he corronated, he made a king\n"),

        new GrammarRule("Hiphil stem, most common derived stem.  Meaning can be: 2/4\n" +
            "* simple action: more common in verbs where qal form is not attested in OT"),

        new GrammarRule("Hiphil stem, most common derived stem.  Meaning can be: 3/4\n" +
            "* declarative: the subject declares a certain condition:  רָשַׁע he was guily הִרְשִׁיע he declared someone guilty"),

        new GrammarRule("Hiphil stem, most common derived stem.  Meaning can be: 4/4\n" +
            "* factitive: makes an intransitive verb transitive, similar to piel: גָּדַל to be great הִגְדִיל he made him/her/it great"),

        new GrammarRule("Hiphil weak verbs: 1/7\n" +
            "                      Perfect\n" +
            "             Perfect  msc 2 sng\n" +
            "Strong         " + "הִקְטַלְתָּ      הִקְטִיל"+ "\n" +
            "I-Gutteral     " + "הֶעֱמַדְתָּ      הֶעֱמִיד"),

        new GrammarRule("Hiphil weak verbs: 2/7\n" +
            "                      Perfect\n" +
            "             Perfect  msc 2 sng\n" +
            "Strong         " + "הִקְטַלְתָּ      הִקְטִיל"+ "\n" +
            "III-" + "הִשְׁלַחְתָּ      הִשְׁלִיחַ        ע/ח" ),

        new GrammarRule("Hiphil weak verbs: 3/7\n" +
            "                      Perfect\n" +
            "             Perfect  msc 2 sng\n" +
            "Strong         " + "הִקְטַלְתָּ      הִקְטִיל"+ "\n" +
            "III-" + "הִמְצֵאתָ      הִמְצִיא          א" ),

        new GrammarRule("Hiphil weak verbs: 4/7\n" +
            "                      Perfect\n" +
            "             Perfect  msc 2 sng\n" +
            "Strong         " + "הִקְטַלְתָּ      הִקְטִיל"+ "\n" +
            "III-" + "הִגְלִיתָ      הִגְלָה           ה" ),

        new GrammarRule("Hiphil weak verbs: 5/7\n" +
            "                      Perfect\n" +
            "             Perfect  msc 2 sng\n" +
            "Strong         " + "הִקְטַלְתָּ      הִקְטִיל"+ "\n" +
            "I-" + "הִצַּלְתָּ       הִצִּיל             נ" ),

        new GrammarRule("Hiphil weak verbs: 6/7\n" +
            "                      Perfect\n" +
            "             Perfect  msc 2 sng\n" +
            "Strong         " + "הִקְטַלְתָּ      הִקְטִיל"+ "\n" +
            "I-" + "הוֹשַׁבְתָּ      הוֹשִׁיב            י" ),

        new GrammarRule("Hiphil weak verbs: 7/7\n" +
            "                      Perfect\n" +
            "             Perfect  msc 2 sng\n" +
            "Strong         " + "הִקְטַלְתָּ      הִקְטִיל"+ "\n" +
            "Biconsonental   " + "הֲקִימוֹתָ     הֵקִים" + "\n"),

        new GrammarRule("Hiphil weak verbs:  Imperfect 1/7\n" +
            "Strong         " + "יַקְטִיל"+ "\n" +
            "I-Gutteral     " + "יַעֲמִיד"),

        new GrammarRule("Hiphil weak verbs:  Imperfect 2/7\n" +
            "Strong         " + "יַקְטִיל"+ "\n" +
            "III-" + "יַשְׁלִיחַ        ע/ח" ),

        new GrammarRule("Hiphil weak verbs:  Imperfect 3/7\n" +
            "Strong         " + "יַקְטִיל"+ "\n" +
            "III-" + "יַמְצִיא          א" ),

        new GrammarRule("Hiphil weak verbs:  Imperfect 4/7\n" +
            "Strong         " + "יַקְטִיל"+ "\n" +
            "III-" + "יַגְלֶה           ה" ),

        new GrammarRule("Hiphil weak verbs:  Imperfect 5/7\n" +
            "Strong         " + "יַקְטִיל"+ "\n" +
            "I-" + "יַצִּיל             נ" ),

        new GrammarRule("Hiphil weak verbs:  Imperfect 6/7\n" +
            "Strong         " + "יַקְטִיל"+ "\n" +
            "I-" + "יוֹשִׁיב            י" ),

        new GrammarRule("Hiphil weak verbs:  Imperfect 7/7\n" +
            "Strong         " + "יַקְטִיל"+ "\n" +
            "Biconsonental   " + "יָקִים" + "\n"),

        new GrammarRule("Hiphil weak verbs: 1/7\n" +
            "                          Imperative\n" +
            "               Imperative  fem sng\n" +
            "Strong         " + "הַקְטִילי      הַקְטֵל"+ "\n" +
            "I-Gutteral     " + "הַעֲמִידי      הַעֲמֵד"+ "\n" +
            ""),

        new GrammarRule("Hiphil weak verbs: 2/7\n" +
            "                          Imperative\n" +
            "               Imperative  fem sng\n" +
            "Strong         " + "הַקְטִילי      הַקְטֵל"+ "\n" +
            "III-" + "הַשְׁלִיחִי      חַשְׁלַחַ        ע/ח" + "\n" +
            ""),

        new GrammarRule("Hiphil weak verbs: 3/7\n" +
            "                          Imperative\n" +
            "               Imperative  fem sng\n" +
            "Strong         " + "הַקְטִילי      הַקְטֵל"+ "\n" +
            "III-" + "הַמְצִיאִי      הַמְצֵא          א" + "\n" +
            ""),

        new GrammarRule("Hiphil weak verbs: 4/7\n" +
            "                          Imperative\n" +
            "               Imperative  fem sng\n" +
            "Strong         " + "הַקְטִילי      הַקְטֵל"+ "\n" +
            "III-" + "הַגְלֵה           ה" + "        No example given for III-ה imperative feminine singular, I don't know why.\n" +
            ""),

        new GrammarRule("Hiphil weak verbs: 5/7\n" +
            "                          Imperative\n" +
            "               Imperative  fem sng\n" +
            "Strong         " + "הַקְטִילי      הַקְטֵל"+ "\n" +
            "I-" + "הַצִּילִי       הַצֵּל             נ" + "\n" +
            ""),

        new GrammarRule("Hiphil weak verbs: 6/7\n" +
            "                          Imperative\n" +
            "               Imperative  fem sng\n" +
            "Strong         " + "הַקְטִילי      הַקְטֵל"+ "\n" +
            "I-" + "הוֹשִׁיבִי      הוֹשֵׁב            י" + "\n" +
            ""),

        new GrammarRule("Hiphil weak verbs: 7/7\n" +
            "                          Imperative\n" +
            "               Imperative  fem sng\n" +
            "Biconsonental   " + "הָקִימִי       הָקֵם" + "\n" +
            ""),

        new GrammarRule("Hiphil weak verbs:  Infinitive Construct 1/7\n" +
            "Strong         " + "הַקְטִיל"+ "\n" +
            "I-Gutteral     " + "הַעֲמִיד"),

        new GrammarRule("Hiphil weak verbs:  Infinitive Construct 2/7\n" +
            "Strong         " + "הַקְטִיל"+ "\n" +
            "III-" + "הַשְׁלִיחַַ        ע/ח" ),

        new GrammarRule("Hiphil weak verbs:  Infinitive Construct 3/7\n" +
            "Strong         " + "הַקְטִיל"+ "\n" +
            "III-" + "הַמְצִיא          א" ),

        new GrammarRule("Hiphil weak verbs:  Infinitive Construct 4/7\n" +
            "Strong         " + "הַקְטִיל"+ "\n" +
            "III-" + "הַגְלוֹת          ה" ),

        new GrammarRule("Hiphil weak verbs:  Infinitive Construct 5/7\n" +
            "Strong         " + "הַקְטִיל"+ "\n" +
            "I-" + "הַצִּיל             נ" ),

        new GrammarRule("Hiphil weak verbs:  Infinitive Construct 6/7\n" +
            "Strong         " + "הַקְטִיל"+ "\n" +
            "I-" + "הוֹשִׁיב            י" ),

        new GrammarRule("Hiphil weak verbs:  Infinitive Construct 7/7\n" +
            "Strong         " + "הַקְטִיל"+ "\n" +
            "Biconsonental   " + "הָקִים" + "\n"),

        new GrammarRule("Hiphil weak verbs:  Infinitive Absolute 1/7\n" +
            "Strong         " + "הַקְטֵל"+ "\n" +
            "I-Gutteral     " + "הַעֲמֵד"),

        new GrammarRule("Hiphil weak verbs:  Infinitive Absolute 2/7\n" +
            "Strong         " + "הַקְטֵל"+ "\n" +
            "III-" + "הַשְׁלֵחַַַ        ע/ח" ),

        new GrammarRule("Hiphil weak verbs:  Infinitive Absolute 3/7\n" +
            "Strong         " + "הַקְטֵל"+ "\n" +
            "III-" + "הַמְצֵא          א" ),

        new GrammarRule("Hiphil weak verbs:  Infinitive Absolute 4/7\n" +
            "Strong         " + "הַקְטֵל"+ "\n" +
            "III-" + "הַגְלֵה          ה" ),

        new GrammarRule("Hiphil weak verbs:  Infinitive Absolute 5/7\n" +
            "Strong         " + "הַקְטֵל"+ "\n" +
            "I-" + "הַצֵּל             נ" ),

        new GrammarRule("Hiphil weak verbs:  Infinitive Absolute 6/7\n" +
            "Strong         " + "הַקְטֵל"+ "\n" +
            "I-" + "הוֹשֵׁב            י" ),

        new GrammarRule("Hiphil weak verbs:  Infinitive Absolute 7/7\n" +
            "Strong         " + "הַקְטֵל"+ "\n" +
            "Biconsonental   " + "הָקֵם" + "\n"),

        new GrammarRule("Hiphil weak verbs:  Participle 1/7\n" +
            "Strong         " + "מַקְטִיל"+ "\n" +
            "I-Gutteral     " + "מַעֲמִיד"),

        new GrammarRule("Hiphil weak verbs:  Participle 2/7\n" +
            "Strong         " + "מַקְטִיל"+ "\n" +
            "III-" + "מַשְׁלִיחַַַַ        ע/ח" ),

        new GrammarRule("Hiphil weak verbs:  Participle 3/7\n" +
            "Strong         " + "מַקְטִיל"+ "\n" +
            "III-" + "מַמְצִיא          א" ),

        new GrammarRule("Hiphil weak verbs:  Participle 4/7\n" +
            "Strong         " + "מַקְטִיל"+ "\n" +
            "III-" + "מַגְלֶה          ה" ),

        new GrammarRule("Hiphil weak verbs:  Participle 5/7\n" +
            "Strong         " + "מַקְטִיל"+ "\n" +
            "I-" + "מַצִּיל             נ" ),

        new GrammarRule("Hiphil weak verbs:  Participle 6/7\n" +
            "Strong         " + "מַקְטִיל"+ "\n" +
            "I-" + "מוֹשִׁיב            י" ),

        new GrammarRule("Hiphil weak verbs:  Participle 7/7\n" +
            "Strong         " + "מַקְטִיל"+ "\n" +
            "Biconsonental   " + "מֵקִים" + "\n"),

        new GrammarRule("Hophal stem, least common derived stem, is causative action in the passive voice (so passive of Hiphil). \n" +
            "It occurs much more frequently in the weak form (250 times) versus strong form (50 times)."),

        new GrammarRule("Hophal weak verbs: Perfect 1/6\n" +
            "Strong (u-class)     " + "הֻקְטַל"+ "\n" +
            "Strong (o-class)     " + "הָקְטַל"+ "\n" +
            "I-Gutteral           " + "הָעֳמַד"),

        new GrammarRule("Hophal weak verbs: Perfect 2/6\n" +
            "Strong (u-class)     " + "הֻקְטַל"+ "\n" +
            "Strong (o-class)     " + "הָקְטַל"+ "\n" +
            "III-" + "הָגְלָה                ה" ),

        new GrammarRule("Hophal weak verbs: Perfect 3/6\n" +
            "Strong (u-class)     " + "הֻקְטַל"+ "\n" +
            "Strong (o-class)     " + "הָקְטַל"+ "\n" +
            "I-" + "הֻצַּל                   נ" ),

        new GrammarRule("Hophal weak verbs: Perfect 4/6\n" +
            "Strong (u-class)     " + "הֻקְטַל"+ "\n" +
            "Strong (o-class)     " + "הָקְטַל"+ "\n" +
            "I-" + "הוּשַׁב                  י" ),

        new GrammarRule("Hophal weak verbs: Perfect 5/6\n" +
            "Strong (u-class)     " + "הֻקְטַל"+ "\n" +
            "Strong (o-class)     " + "הָקְטַל"+ "\n" +
            "Biconsonental        " + "הוּקַם" ),

        new GrammarRule("Hophal weak verbs: Perfect 6/6\n" +
            "Strong (u-class)     " + "הֻקְטַל"+ "\n" +
            "Strong (o-class)     " + "הָקְטַל"+ "\n" +
            "Geminate             " + "הוּסַב"),

        new GrammarRule("Hophal weak verbs:  Imperfect 1/6\n" +
            "Strong (u-class)     " + "יֻקְטַל"+ "\n" +
            "Strong (o-class)     " + "יָקְטַל"+ "\n" +
            "I-Gutteral           " + "יָעֳמַד"),

        new GrammarRule("Hophal weak verbs:  Imperfect 2/6\n" +
            "Strong (u-class)     " + "יֻקְטַל"+ "\n" +
            "Strong (o-class)     " + "יָקְטַל"+ "\n" +
            "III-" + "יָגְלֶהה               ה" ),

        new GrammarRule("Hophal weak verbs:  Imperfect 3/6\n" +
            "Strong (u-class)     " + "יֻקְטַל"+ "\n" +
            "Strong (o-class)     " + "יָקְטַל"+ "\n" +
            "I-" + "יֻצַּל                   נ" ),

        new GrammarRule("Hophal weak verbs:  Imperfect 4/6\n" +
            "Strong (u-class)     " + "יֻקְטַל"+ "\n" +
            "Strong (o-class)     " + "יָקְטַל"+ "\n" +
            "I-" + "יוּשַׁב                  י" ),

        new GrammarRule("Hophal weak verbs:  Imperfect 5/6\n" +
            "Strong (u-class)     " + "יֻקְטַל"+ "\n" +
            "Strong (o-class)     " + "יָקְטַל"+ "\n" +
            "Biconsonental        " + "יוּקַם" ),

        new GrammarRule("Hophal weak verbs:  Imperfect 6/6\n" +
            "Strong (u-class)     " + "יֻקְטַל"+ "\n" +
            "Strong (o-class)     " + "יָקְטַל"+ "\n" +
            "Geminate             " + "יוּסַב"),

        new GrammarRule("Hophal weak verbs: Participle 1/6\n" +
            "Strong (u-class)     " + "מֻקְטָל"+ "\n" +
            "Strong (o-class)     " + "מָקְטָל"+ "\n" +
            "I-Gutteral           " + "מָעֳמָד"),

        new GrammarRule("Hophal weak verbs: Participle 2/6\n" +
            "Strong (u-class)     " + "מֻקְטָל"+ "\n" +
            "Strong (o-class)     " + "מָקְטָל"+ "\n" +
            "III-" + "מָגְלֶה                ה" ),

        new GrammarRule("Hophal weak verbs: Participle 3/6\n" +
            "Strong (u-class)     " + "מֻקְטָל"+ "\n" +
            "Strong (o-class)     " + "מָקְטָל"+ "\n" +
            "I-" + "מֻצָּל                   נ" ),

        new GrammarRule("Hophal weak verbs: Participle 4/6\n" +
            "Strong (u-class)     " + "מֻקְטָל"+ "\n" +
            "Strong (o-class)     " + "מָקְטָל"+ "\n" +
            "I-" + "מוּשָׁב                  י" ),

        new GrammarRule("Hophal weak verbs: Participle 5/6\n" +
            "Strong (u-class)     " + "מֻקְטָל"+ "\n" +
            "Strong (o-class)     " + "מָקְטָל"+ "\n" +
            "Biconsonental        " + "מוּקָם" ),

        new GrammarRule("Hophal weak verbs: Participle 6/6\n" +
            "Strong (u-class)     " + "מֻקְטָל"+ "\n" +
            "Strong (o-class)     " + "מָקְטָל"+ "\n" +
            "Geminate             " + "מוּסָב"),

        new GrammarRule("Hithpael stem indicates intensive, reflexive or reciprocal action"),

        new GrammarRule("When a verbal root start with צ ,ש ,ס then the ת of the Hithpael prefix will metathesize (switch places) with\n" +
            "the first consonant.  1/3\n" +
            "שָׁמַר" + " becomes " + "הִשְׁתַּמֵּר" +
            "Notice how the consonants switch places but not the vowel points.\n"),

        new GrammarRule("When a verbal root start with צ ,ש ,ס then the ת of the Hithpael prefix will metathesize (switch places) with\n" +
            "the first consonant.  2/3\n" +
            "When it is a צ the ת will also transform to a ט.\n" +
            "צָדֵק" + " becomes " + "הִצְטַדֵּק" +
            "Notice how the consonants switch places but not the vowel points.\n"),

        new GrammarRule("When a verbal root start with צ ,ש ,ס then the ת of the Hithpael prefix will metathesize (switch places) with\n" +
            "the first consonant.  3/3\n" +
            "When the first consonant of the verbal root is ת ,ט ,ד ,ז then the ת of the prefix will assimilate, becoming a dagesh forte\n" +
            "טָמֵּא" + " becomes " + "הִטַּמֵּא"),

        new GrammarRule("Hithpael weak verbs:  Perfect 1/3\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "Geminate       " + "הִתְפַּלֵּל" ),

        new GrammarRule("Hithpael weak verbs:  Perfect 2/3\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "III-" + "הִתְגַּלָּה          ה" ),

        new GrammarRule("Hithpael weak verbs:  Perfect 3/3\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "II-Gutteral    " + "הִתְנַחֵם"+ "\n" +
            "II-Gutteral    " + "הִתְבָּרֵך"+ "\n"),

        new GrammarRule("Hithpael weak verbs:  Imperfect 1/3\n" +
            "Strong         " + "יִתְקַטֵּל"+ "\n" +
            "Geminate       " + "יִתְפַּלֵּל" ),

        new GrammarRule("Hithpael weak verbs:  Imperfect 2/3\n" +
            "Strong         " + "יִתְקַטֵּל"+ "\n" +
            "III-" + "יִתְגַּלֶּה          ה" ),

        new GrammarRule("Hithpael weak verbs:  Imperfect 3/3\n" +
            "Strong         " + "יִתְקַטֵּל"+ "\n" +
            "II-Gutteral    " + "יִתְנַחֵם"+ "\n" +
            "II-Gutteral    " + "יִתְבָּרֵך"+ "\n"),

        new GrammarRule("Hithpael weak verbs:  Imperative 1/3\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "Geminate       " + "הִתְפַּלֵּל" ),

        new GrammarRule("Hithpael weak verbs:  Imperative 2/3\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "III-" + "הִתְגַּלֵּה          ה" ),

        new GrammarRule("Hithpael weak verbs:  Imperative 3/3\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "II-Gutteral    " + "הִתְנַחֵם"+ "\n" +
            "II-Gutteral    " + "הִתְבָּרֵך"+ "\n"),

        new GrammarRule("Hithpael weak verbs:  Infinitive Construct 1/3\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "Geminate       " + "הִתְפַּלֵּל" ),

        new GrammarRule("Hithpael weak verbs:  Infinitive Construct 2/3\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "III-" + "הִתְגַּלּוֹת         ה" ),

        new GrammarRule("Hithpael weak verbs:  Infinitive Construct 3/3\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "II-Gutteral    " + "הִתְנַחֵם"+ "\n" +
            "II-Gutteral    " + "הִתְבָּרֵך"+ "\n"),

        new GrammarRule("Hithpael weak verbs:  Infinitive Absolute 1/2\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "Geminate       " + "הִתְפַּלֵּל" ),

        new GrammarRule("Hithpael weak verbs:  Infinitive Absolute 2/2\n" +
            "Strong         " + "הִתְקַטֵּל"+ "\n" +
            "II-Gutteral    " + "הִתְנַחֵם"+ "\n" +
            "II-Gutteral    " + "הִתְבָּרֵך"+ "\n"),

        new GrammarRule("Hithpael weak verbs:  Participle 1/3\n" +
            "Strong         " + "מִתְקַטֵּל"+ "\n" +
            "Geminate       " + "מִתְפַּלֵּל" ),

    new GrammarRule("Hithpael weak verbs:  Participle 2/3\n" +
            "Strong         " + "מִתְקַטֵּל"+ "\n" +
            "III-" + "מִתְגַּלֶּה          ה" ),

    new GrammarRule("Hithpael weak verbs:  Participle 3/3\n" +
            "Strong         " + "מִתְקַטֵּל"+ "\n" +
            "II-Gutteral    " + "מִתְנַחֵם"+ "\n" +
            "II-Gutteral    " + "מִתְבָּרֵך"+ "\n")
    );
  }
}
