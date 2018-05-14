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
package com.github.alanfgates.language.flashcards;

import java.util.Arrays;
import java.util.List;

import static com.github.alanfgates.language.flashcards.Gender.*;
import static com.github.alanfgates.language.flashcards.Number.*;
import static com.github.alanfgates.language.flashcards.Mood.*;
import static com.github.alanfgates.language.flashcards.Person.*;
import static com.github.alanfgates.language.flashcards.Tense.*;
import static com.github.alanfgates.language.flashcards.VerbRoot.*;

public class HebrewBuilder implements LanguageBuilder {
  @Override
  public List<Word> buildWords() {
    return Arrays.asList(
        // VERBS
        // Qal perfect
        new Word("שָׁמַרְתִּי", "I guarded", QAL, PERFECT, FIRST_PERSON, SINGULAR),
        new Word("שָׁמַרְתָּ", "you guarded", QAL, PERFECT, SECOND_PERSON, MASCULINE, SINGULAR),
        new Word("שָׁמַרְתּ", "you guarded", QAL, PERFECT, SECOND_PERSON, FEMININE, SINGULAR),
        new Word("שָׁמַר", "he guarded", QAL, PERFECT, THIRD_PERSON, MASCULINE, SINGULAR),
        new Word("שָׁמַרָה", "she guarded", QAL, PERFECT, THIRD_PERSON, FEMININE, SINGULAR),
        new Word("שָׁמַרְנוּ", "We guarded", QAL, PERFECT, FIRST_PERSON, PLURAL),
        new Word("שָׁמַרְתֶּם", "you guarded", QAL, PERFECT, SECOND_PERSON, MASCULINE, PLURAL),
        new Word("שָׁמַרְתֶּן", "you guarded", QAL, PERFECT, SECOND_PERSON, FEMININE, PLURAL),
        new Word("שָׁמַרוּ", "They guarded", QAL, PERFECT, THIRD_PERSON, PLURAL),

        // Qal Imperfect
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

        // TODO QAL imperative, cohortative, and jussive, waiting until I get that far in the grammer

        // QAL Participle
        new Word("שׁוֹמֵר", "guarding-Gams", QAL, PARTICIPLE, MASCULINE, SINGULAR),
        new Word("שׁוֹמֶרֶת", "guarding-Gafs", QAL, PARTICIPLE, FEMININE, SINGULAR),
        new Word("שׁוֹמְרִים", "guarding", QAL, PARTICIPLE, MASCULINE, PLURAL),
        new Word("שׁוֹמְרִוֹת", "guarding", QAL, PARTICIPLE, FEMININE, PLURAL),

        // TODO QAL infinitive

        //----------------------------------------------------------------------------------------
        // VOCABULARY, with frequency noted in comments
        // 50524
        new Word("וְ", "and"),
        // 23968
        new Word("הַ", "the"),
        // 20435
        new Word("לְ", "to"),
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
        new Word("אָמַר", "he said")

    );
  }

  @Override
  public List<GrammarRule> buildRules() {
    return Arrays.asList(
        new GrammarRule("Alphabet:\n" +
            "אבגדהוזחטיכלמנסעפצקרשׂשׁת"),

        new GrammarRule("Vowels:\n" +
          "long    a  בָּ  e   בֵּ  o  בֹּ \n" +
          "short   a  בַּ  e   בֶּ  i  בִּ  o   בָּ  u  בֻּ \n" +
          "reduced a  בֲּ  e   בֱּ  o  בֳּ "),

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
          "Most common Hebrew diphthong is אַיִ (aleph not required, just there so I have a\n" +
          "letter to put the patach under).  Syllables that contain a diphthong are considered\n" +
          "to be closed because they end in a consontant."),

        new GrammarRule("Vowel Syllable Preferences\n" +
          " * Short vowels prefer closed, unaccented syllables or open, accented syllables. Both syllables in עֶבֶד\n" +
          " * Long vowels prefer closed, accented syllables or open, pretonic syllables.  Both syllables in" + " דָּבָר\n" +
          " * Vocal Shewa and reduced hateph vowels prefer open, prertonic syllables.  The\n" +
          "   reduced vowels appear with guttural consonants in the open, propretonic position.\n" +
          "   First syllable in דְּבָרִים  and אֱלֹהִים"),

        new GrammarRule("Gender Endings\n" +
          "Masculine Singular: anything\n" +
          "Feminine Singular: אָה אַת אֶת אִית וּת\n" +
          "Masculine Plural: אִים\n" +
          "Feminine Plural: וֹת\n" +
          "Masculine Dual: אַ׳ם\n" +
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
          "    Exception: In אֱלֹהִים  the shortened vowel under א  is removed.  Thus אֱלֹהִים plus לְ becomes לֵאלֹהִים")

        // Continue chapter 5, p40
    );
  }
}
