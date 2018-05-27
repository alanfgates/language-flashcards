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
import static com.github.alanfgates.language.flashcards.PartOfSpeech.*;
import static com.github.alanfgates.language.flashcards.Person.*;
import static com.github.alanfgates.language.flashcards.Tense.*;
import static com.github.alanfgates.language.flashcards.VerbRoot.*;

public class HebrewBuilder implements LanguageBuilder {

  @Override
  public String getLanguageName() {
    return "Hebrew";
  }

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
        new Word("שׁוֹמֵר", "guarding", QAL, PARTICIPLE, MASCULINE, SINGULAR),
        new Word("שׁוֹמֶרֶת", "guarding", QAL, PARTICIPLE, FEMININE, SINGULAR),
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
        new Word("אָמַר", "he said"),

        // 4942
        new Word("בֵּן", "son", MASCULINE),
        new Word("בָּנִים", "sons", MASCULINE, PLURAL),
        // 4487
        new Word("כִּי", "that, because, when"),
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
        new Word("בָא", "he came"),
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
        // 2452
        new Word("הוּא", "he"),
        new Word("הִיא", "she"),
        new Word("הֵם", "they", MASCULINE),
        new Word("הֵנָּה", "they", FEMININE),
        // 2303
        new Word("יוֹם", "day", MASCULINE),
        new Word("יָמִים", "days", MASCULINE, PLURAL),
        // 2187
        new Word("אִיש", "man", MASCULINE),
        new Word("אֲנָשִׁים", "men", MASCULINE, PLURAL),
        // 2128
        new Word("פָּנִים", "face", MASCULINE),
        new Word("פָּנִים", "faces", MASCULINE, PLURAL),
        new Word("פְּנֵי", "before, in the presence of"),
        // 2046
        new Word("בַּיִת", "house", MASCULINE),
        new Word("בָּתִּים", "houses", MASCULINE, PLURAL),
        // 2014
        new Word("נָתַן", "he gave, put, set"),
        // 1867
        new Word("עַם", "people, nation", MASCULINE),
        new Word("עַמִּים", "peoples, nations", MASCULINE, PLURAL),
        // 1627
        new Word("יָד", "hand", FEMININE),
        new Word("יָדַיִם", "hands", FEMININE, DUAL),
        // 1554
        new Word("הָלַךּ",	"he walked"),
        // 1494
        new Word("דָּבָר", "word, speech", MASCULINE),
        new Word("דְּבָרִים", "words, speechs", MASCULINE, PLURAL),
        // 1310
        new Word("רָאָה", "he saw"),
        // 1263
        new Word("עַד", "until, as far as"),
        // 1239
        new Word("אֲנִי", "I, myself"),
        new Word("אָנֹכִי", "I, myself"),
        new Word("אֲנַחְנוּ", "we"),
        new Word("נַחְנו", "we"),
        // 1210
        new Word("אָב", "father", MASCULINE),
        new Word("אָבוֹת", "fathers", MASCULINE, PLURAL),
        // 1165
        new Word("שָׁמַע",	 "he heard"),
        // 1135
        new Word("דִּבֶּר",	"he spoke", PIEL),
        // 1104
        new Word("אַתָּה", "you", MASCULINE),
        new Word("אַתְּ", "you", FEMININE),
        new Word("אַתֶּם", "you", MASCULINE, PLURAL),
        new Word("אַתֶּן", "you", FEMININE, PLURAL),
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
        new Word("הִנַּה", "behold"),
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
        new Word("עַיִן", "eye", FEMININE),
        new Word("עֵינַים", "eyes", FEMININE, DUAL),
        new Word("עַיִן", "spring", FEMININE),
        new Word("עֲיָנֹת", "springs", FEMININE, PLURAL),
        // 898
        new Word("אֵת", "with"),
        // 894
        new Word("עָלָה", "he went up"),
        // 879
        new Word("שָׁנָה", "year", FEMININE),
        new Word("שׁנִים", "years", FEMININE, PLURAL),
        // 864
        new Word("שֵׁם", "name", MASCULINE),
        new Word("שֵׁמוֹת", "names", MASCULINE, PLURAL),
        // 847
        new Word("שָׁלַח", "he sent"),
        // 845
        new Word("מֵת", "he died"),
        // 835
        new Word("שָׁם", "there"),
        // 814
        new Word("אָכַל", "he ate"),
        // 803
        new Word("עֶבֶד", "servant, slave", MASCULINE),
        new Word("עֲבָדִים", "servants, slaves", MASCULINE, PLURAL),
        // 783
        new Word("אַיִן", "nothing, there is not"),
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
        new Word("גַּם", "also"),
        // 757
        new Word("נֶפֶש", "soul, person", FEMININE),
        new Word("נְפָשׁוֹת", "souls, persons", FEMININE, PLURAL),
        // 754
        new Word("מָה", "what?"),
        // 750
        new Word("כֹּהַן", "priest", MASCULINE),
        new Word("כֹהֲנִים", "priests", MASCULINE, PLURAL),
        // 748
        new Word("הֲ", "indicates interrogative"),
        // 743
        new Word("כֵּן", "so, thus"),
        // 736
        new Word("קָרָא", "he called"),
        // 729
        new Word("אַל", "no, not temporary"),
        // 712
        new Word("דֶּרֶךּ", "way, road", MASCULINE, FEMININE),
        new Word("דֶּרָכִים", "ways, roads", MASCULINE, FEMININE, PLURAL),
        // 707
        new Word("אַחַר", "after"),
        // 658
        new Word("נָשָׂא", "he lifted, carried, took"),
        // 629
        new Word("אָח", "brother", MASCULINE),
        new Word("אַחִים", "brothers", MASCULINE, PLURAL),
        // 627
        new Word("קָם", "he arose, stood"),
        // 606
        new Word("שָׁלשׁ", "three", FEMININE),
        new Word("שׁלֹשָׁה", "three", MASCULINE),
        // 601
        new Word("לֵב", "heart", MASCULINE),
        new Word("לִבּוֹת", "hearts", MASCULINE, PLURAL),
        new Word("לֵבָב", "heart", MASCULINE),
        new Word("לְבָבוֹת", "hearts", MASCULINE, PLURAL),
        // 600
        new Word("רֹאשׁ", "head", MASCULINE),
        new Word("רָאשִׁים", "heads", MASCULINE, PLURAL),
        // 588
        new Word("בַּת", "daughter", FEMININE),
        new Word("בָּנוֹת", "daughters", FEMININE, PLURAL),
        // 583
        new Word("מָיִם", "water", MASCULINE),
        new Word("מָיִם", "water", MASCULINE, PLURAL),
        new Word("מֵי", "water", MASCULINE, SINGULAR, CONSTRUCT),
        new Word("מֵי", "water", MASCULINE, PLURAL, CONSTRUCT),
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
        // 528
        new Word("שָׂם", "he put, set"),
        // 526
        new Word("גָּדוֹל", "great"),
        // 524
        new Word("עָמַד", "he stood"),
        // 511
        new Word("תַּחַת", "under, instead of"),
        // 508
        new Word("חָמַשׁ", "five", FEMININE),
        new Word("חֲמִשָּׁה", "five", MASCULINE),
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
        new Word("עֶשֶׁר", "ten", FEMININE),
        new Word("עֲשָׂרָה", "ten", MASCULINE),
        // 491
        new Word("שֶׁבַע", "seven", FEMININE),
        new Word("שִׁבְעָה", "seven", MASCULINE),
        // 491
        new Word("עוֹד", "again, still, long"),
        // 470
        new Word("קֹדֶש", "holiness, apartness, sacredness", MASCULINE),
        new Word("קֳדָשִׁים", "holiness, apartness, sacredness", MASCULINE, PLURAL),
        // 469
        new Word("שָׁמַר", "he guarded, watched, preserved"),
        // 457
        new Word("מָצַה", "he found"),
        // 456
        new Word("אַרְבַּע", "four", FEMININE),
        new Word("אַרְבָּעָה", "four", MASCULINE),
        // 439
        new Word("עוֹלָם", "forever", MASCULINE),
        new Word("עוֹלָמִים", "forever", MASCULINE, PLURAL),
        // 435
        new Word("נָפַל", "he fell"),
        new Word("עַתָּה", "now"),
        // 424
        new Word("מִשְׁפָת", "judgement, law", MASCULINE),
        new Word("מִשׁפָּטִים", "judgements, laws", MASCULINE, PLURAL),
        new Word("מִי", "who?"),
        // 421
        new Word("שַׂר", "prince, chief", MASCULINE),
        new Word("שָׂרִים", "princes, chiefs", MASCULINE, PLURAL),
        new Word("שָׁמַיִם", "heavens, sky", MASCULINE),
        new Word("שָׁמַיִם", "heavens, sky", MASCULINE, PLURAL),
        new Word("שְׁמֵי", "heavens, sky", MASCULINE, CONSTRUCT),
        // 420
        new Word("תָּוֶךּ", "midst"),
        // 413
        new Word("חֶרֶב", "sword", FEMININE),
        new Word("חֲרָבוֹת", "swords", FEMININE, PLURAL),
        // 409
        new Word("רַב", "great, many", MASCULINE),
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
        new Word("נְאֻם", "utterance-m", MASCULINE),
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
        // 350
        new Word("מָלַךּ", "he reigned"),
        // 348
        new Word("אֹהֶל", "tent", MASCULINE),
        new Word("אֹהָלִים", "tents", MASCULINE, PLURAL),
        // 338
        new Word("סָבִיב", "all around"),
        // 337
        new Word("עֲשָׂרה", "ten", MASCULINE),
        new Word("עָשָׂר", "ten", FEMININE),
        // 330
        new Word("עֵץ", "tree", MASCULINE),
        new Word("עֵצִים", "trees", MASCULINE, PLURAL),
        // 327
        new Word("בֵּרֵךּ", "he blessed - ברך (he kenlt, he blessed)", PIEL),
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
        new Word("יָרֵא", "he feared"),
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
        new Word("סָר", "he turned aside - סור"),
        new Word("חַטָּאת", "sin, sin offering", FEMININE),
        new Word("לֶחֶם", "bread, food", MASCULINE),
        new Word("מְאֹד", "very"),
        // 296
        new Word("עַת", "time", FEMININE),
        // 290
        new Word("חָזַק", "he was strong"),
        // 289
        new Word("כָּרַת", "he cut off"),
        new Word("עָבַד", "he worked, he served"),
        // 288
        new Word("עֹלָה", "burnt offering", FEMININE),
        new Word("עֹלוֹת", "burnt offerings", FEMININE, PLURAL),
        // 287
        new Word("חָיָה", "he lived"),
        // 284
        new Word("אָיַב", "he was hostile"),
        new Word("בְּרִית", "covenant", FEMININE),
        // 283
        new Word("חֹדֶשׁ", "month", MASCULINE),
        new Word("חֳדָשִׁים", "months", MASCULINE, PLURAL),
        // 280
        new Word("קָרַב", "he came near, he offered")

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
          "    Exception: In אֱלֹהִים  the shortened vowel under א  is removed.  Thus אֱלֹהִים plus לְ becomes לֵאלֹהִים"),

        new GrammarRule("Definite Article\n" +
          " * Definite Article is הַ plus a Dagesh Forte in the first consonant of the noun\n" +
          " * When the first consant in a begadkephat consonant the Dagesh Lene in the begadkephat\n" +
          "   becomes a Dagesh Forte\n" +
          " * When first consontant is a guttural, Dagesh Forte is rejected\n" +
          "   * When the first consonant is א or ע or ר the Patach lengthens to a Qamets, הָ\n" +
          "   * When the first consonant is ה or ח the Dagesh Forte is dropped.  This is\n" +
          "     referred to as \"virtual doubling\"" +
          "   * Before nouns that begin with an unaccented עָ or הָ or חָ (last can also be\n" +
          "     accented), the definite article becomes Seghol הֶ\n" +
          " * With initial יְ or מְ the Dagesh Forte is usually dropped\n" +
          " * A few words change their initial vowel to Qamets, e.g. אֶרֶצ becomes הָאָרֶצ")

        // Continue 5.7, p43
    );
  }
}
