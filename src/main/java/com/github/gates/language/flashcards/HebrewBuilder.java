/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
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
package com.github.gates.language.flashcards;

import java.util.Arrays;
import java.util.List;

import static com.github.gates.language.flashcards.Gender.*;
import static com.github.gates.language.flashcards.Mood.*;
import static com.github.gates.language.flashcards.Number.*;
import static com.github.gates.language.flashcards.Person.*;
import static com.github.gates.language.flashcards.VerbRoot.*;
import static com.github.gates.language.flashcards.Tense.*;

public class HebrewBuilder implements LanguageBuilder {
  @Override
  public List<Word> buildWords() {
    return Arrays.asList(
        // 50524
        new Word("וְ", "and"),
        // 23968
        new Word("הַ", "the"),
        // 20435
        new Word("לְ", "to"),
        // 20160
        new Word("שָׁמַרְתִּי", "I guarded", QAL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("שָׁמַרְתָּ", "you guarded", QAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("שָׁמַרְתּ", "you guarded", QAL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("שָׁמַר", "he guarded", QAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("שָׁמַרָה", "she guarded", QAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("שָׁמַרְנוּ", "We guarded", QAL, PERFECT, FIRST_PERSON, PLURAL),
        new Word("שָׁמַרְתֶּם", "you guarded", QAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("שָׁמַרְתֶּן", "you guarded", QAL, PERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("שָׁמַרוּ", "They guarded", QAL, PERFECT, THIRD_PERSON, PLURAL),

        new Word("אֶשְׁמֹר", "I will guard", QAL, IMPERFECT, FIRST_PERSON, SINGULAR),
        new Word("תִּשְׁמֹר", "you will guard", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("תִּשְׁמְרִי", "you will guard", QAL, IMPERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("יִשְׁמֹר", "he will guard", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("תִּשְׁמֹר", "she will guard", QAL, IMPERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("נִשְׁמֹר", "We will guard", QAL, IMPERFECT, FIRST_PERSON, PLURAL),
        new Word("תִּשְׁמְרוּ", "you will guard", QAL, IMPERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("תִּשְׁמֹרְנָה", "you will guard", QAL, IMPERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("יִשְׁמְרוּ", "They will guard", QAL, IMPERFECT, THIRD_PERSON, MASCULINE, PLURAL),
        new Word("תִּשְׁמֹרְנָה", "They will guard", QAL, IMPERFECT, THIRD_PERSON, FEMININE, PLURAL),
        // 15632
        new Word("בְּ", "in, at, with"),
        // 10970
        new Word("אֶת", "direct object marker"),
        // 7586
        new Word("מִן", "from"),
        // 5778
        new Word("עַל", "upon, over, above"),
        // 5518
        new Word("אֶל", "to, toward"),
        // 5518
        new Word("לֹא", "not, permanent"),
        // 5503
        new Word("אֲשֶׁר", "which"),
        // 5415
        new Word("כֹּל", "all"),
        new Word("כָּל", "all"),
        // 5317
        new Word("אָמַר", "he said"),
        // 5040
        new Word("שׁוֹמֵר", "guarding-Gams", QAL, PARTICIPLE, MASCULINE, SINGULAR),
        new Word("שׁוֹמֶרֶת", "guarding-Gafs", QAL, PARTICIPLE, FEMININE, SINGULAR),
        new Word("שׁוֹמְרִים", "guarding", QAL, PARTICIPLE, MASCULINE, PLURAL),
        new Word("שׁוֹמְרִוֹת", "guarding", QAL, PARTICIPLE, FEMININE, PLURAL)
        // 5040
        // TODO imperative, cohortative, and jussive, waiting until I get that far in the grammer

        /*
    */
    );
  }

  @Override
  public List<GrammarRule> buildRules() {
    return Arrays.asList(
        new GrammarRule("אבגדהוזחטיכלמנסעפצקרשׂשׁת"),
        new GrammarRule("        x  a-class x i-class x i-class x u-class x u-class\n" +
                        "----------------------------------------------------------\n" +
                        "        x  a       x   e     x  i      x   o     x  u     \n" +
                        "----------------------------------------------------------\n" +
                        "long    x  בָּ       x   בֵּ     x         x   בֹּ     x        \n" +
                        "short   x  בַּ       x   בֶּ     x  בִּ      x   בָּ     x  בֻּ     \n" +
                        "reduced x  בֲּ       x   בֱּ     x         x   בֳּ     x        \n ")
    );
  }
}
