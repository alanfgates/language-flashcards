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

import static com.github.alanfgates.language.flashcards.Declension.NOMINATIVE;
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

        // TODO QAL imperative, cohortative, and jussive, waiting until I get that far in the grammar

        // QAL Participle
        new Word("שׁוֹמֵר", "guarding", QAL, PARTICIPLE, MASCULINE, SINGULAR),
        new Word("שׁוֹמֶרֶת", "guarding", QAL, PARTICIPLE, FEMININE, SINGULAR),
        new Word("שׁוֹמְרִים", "guarding", QAL, PARTICIPLE, MASCULINE, PLURAL),
        new Word("שׁוֹמְרִוֹת", "guarding", QAL, PARTICIPLE, FEMININE, PLURAL),

        // TODO QAL infinitive

        //----------------------------------------------------------------------------------------
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
        new Word("לֹא", "not, permanent"),
        // 5503
        new Word("אֲשֶׁר", "who, whom, that, which (relative pronoun)"),
        // 5415
        new Word("כֹּל", "all"),
        new Word("כָּל", "all"),
        // 5317
        new Word("אָמַר", "he said"),

        // 4942
        new Word("בֵּן", "son", MASCULINE),
        new Word("בָּנִים", "sons", MASCULINE, PLURAL),
        // 4795
        new Word("אֲנִי", "I, myself", NOMINATIVE),
        new Word("אָנֹכִי", "I, myself", NOMINATIVE),
        new Word("אֲנַחְנוּ", "we", NOMINATIVE),
        new Word("אַתָּה", "you", NOMINATIVE, MASCULINE),
        new Word("אַתְּ", "you", NOMINATIVE, FEMININE),
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
        new Word("כִּי", "that, because; (adversative) but, except; (emphatic) indeed, truly"),
        new Word("כִּי–אִם", "but, except"),
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
        new Word("דְּבָרִים", "words, speeches", MASCULINE, PLURAL),
        // 1310
        new Word("רָאָה", "he saw"),
        // 1263
        new Word("עַד", "until, as far as"),
        // 1210
        new Word("אָב", "father", MASCULINE),
        new Word("אָבוֹת", "fathers", MASCULINE, PLURAL),
        // 1165
        new Word("שָׁמַע",	 "he heard"),
        // 1135
        new Word("דִּבֶּר",	"he spoke", PIEL),
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
        new Word("אֶת–", "with"),
        // 894
        new Word("עָלָה", "he went up"),
        // 879
        new Word("שָׁנָה", "year", FEMININE),
        new Word("שׁנִים", "years", FEMININE, PLURAL),
        // 864
        new Word("שֵׁם", "name", MASCULINE),
        new Word("שֵׁמוֹת", "names", MASCULINE, PLURAL),
        // 853 (601 for לב and 252 for לבב )
        new Word("לֵב", "heart", MASCULINE),
        new Word("לִבּוֹת", "hearts", MASCULINE, PLURAL),
        new Word("לֵבָב", "heart", MASCULINE),
        new Word("לְבָבוֹת", "hearts", MASCULINE, PLURAL),
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
        new Word("בֵּרֵךּ", "he blessed - ברך (he knelt, he blessed)", PIEL),
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
        new Word("קָרַב", "he came near, he offered"),
        // 277
        new Word("אַף", "nose, anger", MASCULINE),
        new Word("אַפַּיִם", "noses, anger", MASCULINE, PLURAL),
        // 274
        new Word("צֹאן", "flock, sheep", FEMININE, SINGULAR, PLURAL),
        new Word("שִׁשָׁה", "six", MASCULINE),
        new Word("שַׁשׁ", "six", FEMININE),
        // 272
        new Word("אֶבֶן", "stone", FEMININE),
        new Word("אֲבָנִים", "stones", FEMININE, PLURAL),
        new Word("לְמַעַן", "because of, in order to, for the sake of"),
        // 270
        new Word("בָּשָׂר", "flesh", MASCULINE),
        new Word("בְּשָׂרִים", "fleshes", MASCULINE, PLURAL),
        new Word("מִדְבָּר", "wilderness", MASCULINE),
        // 268
        new Word("חַיִּים", "life, lives", MASCULINE, SINGULAR, PLURAL),
        // 264
        new Word("רָשָׁע", "wicked", ADJECTIVE, MASCULINE, SINGULAR),
        new Word("רְשָׁעִים", "wicked", ADJECTIVE, MASCULINE, PLURAL),
        new Word("רְשָׁעָה", "wicked", ADJECTIVE, FEMININE, SINGULAR),
        // 252
        new Word("מַטֶּה", "tribe, staff", MASCULINE), // TODO double check this is masculine
        new Word("מָטּוֹת", "tribes, staffs", MASCULINE, PLURAL),
        // 251
        new Word("רֶגֶל", "foot", FEMININE),
        new Word("רַגְלַיִם", "feet", FEMININE, DUAL),
        // 250
        new Word("מָלֵא", "he filled"),
        new Word("אַמָּה", "cubit", FEMININE),
        new Word("אַמּוֹת", "cubits", FEMININE, PLURAL),
        // 249
        new Word("חֶסֶד", "loving kindness, steadfast love", MASCULINE),
        new Word("חֲסָדִים", "loving kindnesses, steadfast loves", MASCULINE, PLURAL),
        // 245
        new Word("חַיַל", "strength, wealth, army", MASCULINE),
        new Word("חֲיָלִים", "armies,strengths, wealths", MASCULINE, PLURAL),
        // 241
        new Word("גְּבוּל", "border", MASCULINE),
        // 240
        new Word("נַעַר", "boy, youth", MASCULINE),
        new Word("נְעָרִים", "boys, youths", MASCULINE, PLURAL),
        // 239
        new Word("חָטָא", "he sinned, he missed"),
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
        new Word("יָרַשׁ", "he inherited, he possessed, he dispossessed"),
        // 229
        new Word("זֶרַע", "seed", MASCULINE),
        // 227
        new Word("לַיְלָה", "night", MASCULINE),
        new Word("לֵילוֹת", "nights", MASCULINE, PLURAL),
        new Word("קֶרֶב", "midst, inward part", MASCULINE),
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
        new Word("אֲדָמָה", "land, ground, earth", FEMININE),
        new Word("אֲדָמוֹת", "lands, grounds", FEMININE, PLURAL),
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
        new Word("שָׁכַב", "he layed down"),
        new Word("בֹּקֶר", "morning", MASCULINE),
        new Word("בְּקָרִים", "mornings", MASCULINE, PLURAL),
        new Word("מַלְאָךּ", "messenger", MASCULINE),
        new Word("מַלְאָכִים", "messengers", MASCULINE, PLURAL),
        // 211
        new Word("מִנְחָה", "gift, tribute, offering", FEMININE),
        // 208
        new Word("כָּלָה", "he completed"),
        // 206
        new Word("צַדּיק", "just, righteous", ADJECTIVE, MASCULINE),
        new Word("צַדִּיקִים", "just, righteous", ADJECTIVE, MASCULINE, PLURAL),
        // 204
        new Word("שָׁפַת", "he judged"),
        // 202
        new Word("אֲרוֹן", "ark, chest", MASCULINE),
        // 200
        new Word("אָסַף", "he gathered"),
        // 199
        new Word("כָּבוֹד", "abundance, honor, glory", MASCULINE),
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
        new Word("חֲצֵרִים", "settlements, villages", MASCULINE),
        new Word("חֲצֵרִים", "settlements, villages", MASCULINE, PLURAL),
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
        new Word("רֵעַ", "friend, companion, fellow", MASCULINE),
        new Word("רֵעִים", "friends, companions, fellows", MASCULINE, PLURAL),
        // 186
        new Word("שָׁבַע", "he swore"),
        // 185
        new Word("אָבַד", "he perished"),
        // 184
        new Word("מִצְוָה", "commandment", FEMININE),
        new Word("מִצְוֹת", "commandments", FEMININE, PLURAL),
        // 183
        new Word("בָּקָר", "cattle, herd, ox", MASCULINE),
        new Word("בּקָרִים", "herds, oxen", MASCULINE, PLURAL),
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
        new Word("רָבָה", "he was(became) great/many"),
        new Word("שָֹפָה", "lip", FEMININE),
        new Word("שְׂפָתַיִם", "lips,", FEMININE, DUAL),
        new Word("לָמָּה", "why?"),
        // 174
        new Word("שָאַל", "he asked"),
        // 173
        new Word("שָׁחָה", "he bowed down"),
        // 171
        new Word("בִּין", "he discerned, understood"),
        new Word("לָחַם", "he fought, did battle"),
        new Word("קָדַשׁ", "he was consecrated, he consecrated"),
        // 170
        new Word("בָּחַר", "he chose"),
        // 167
        new Word("חָרַב", "he attacked, he slew"),
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
        new Word("דָּרַשׁ", "he sought"),
        // 164
        new Word("חוּץ", "outside", NOUN, MASCULINE),
        new Word("פֶּתַח", "opening, doorway, entrace", MASCULINE),
        new Word("פְּתָחִים", "openings, doorways, entraces", MASCULINE, PLURAL),
        // 163
        new Word("סָבַב", "he turned around, went around, surrounded"),
        // 163
        new Word("טָמֵא", "he was unclean"),
        new Word("זֶבַח", "sacrifice", NOUN, MASCULINE),
        // 139
        new Word("שֶׁ", "who, whom, that, which (relative pronoun), prefixed"),
        // 138
        new Word("סוּס", "horse", MASCULINE),
        new Word("סוּסִים", "horses", MASCULINE, PLURAL),
        new Word("חָכָם", "wise", ADJECTIVE, MASCULINE, SINGULAR),
        new Word("חֲכָמִים", "wise", ADJECTIVE, MASCULINE, PLURAL),
        new Word("חֲכָמָה", "wise", ADJECTIVE, FEMININE, SINGULAR),
        new Word("חֲכְמוֹת", "wise", ADJECTIVE, FEMININE, PLURAL)

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
          " * Vocal Shewa and reduced hateph vowels prefer open, propretonic syllables.  The\n" +
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
          "     referred to as \"virtual doubling\"\n" +
          "   * Before nouns that begin with an unaccented עָ or הָ or חָ (last can also be\n" +
          "     accented), the definite article becomes Seghol הֶ\n" +
          " * With initial יְ or מְ the Dagesh Forte is usually dropped\n" +
          " * A few words change their initial vowel to Qamets, e.g. אֶרֶצ becomes הָאָרֶצ"),

        new GrammarRule("Concjuncton ו (and, but, also, even)\n" +
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
            " * preoposition plus דבר\n:" +
            "   * on account of עַל-דְּבַר"),

        new GrammarRule("Use of adjectives:\n" +
            " * Attributive: modifies a noun.  Attributive adjectives follow the noun they\n" +
            "   modify and agree in gender, number, and definiteness.\n" +
            " * Predicative: asserts something about the noun, e.g. the book is big.\n" +
            "   No verb is used.  Predicative adjects agree with the noun in gender and number\n" +
            "   but not definiteness.  They may proceed or follow the noun.\n" +
            " * Sustantive: no noun present, stands for those who have the trait (e.g. the wise)"),

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
            "   * Type 2 is used with plural nouns and some prepositions.\n" +
            " * Singular nouns can take plural pronominal suffixes (e.g. our horse) and vice versa."),

        new GrammarRule("Type 1 pronominal suffixes (singular nouns, some prepositions, direct\n" +
            "object marker) (א in all cases just to give letter to put vowel under):\n" +
            " x אִי  me/my          נוּ   us/our\n" +
            " x ךָ   you/your (ms)  כֶם  you/your (mp)\n" +
            " x :ך you/your (fs)   כֶן  you/your (fp)\n" +
            " x וֹ   he/his         הֶם they/theirs (m)\n" +
            " x אָהּ she/hers       הֶן  they/theirs (f)"),

        new GrammarRule("Type 2 pronominal suffixes (plural nouns, some prepositions) (א in\n" +
            "all cases just to give letter to put vowel under):\n" +
            " x אַי me/my          אֵינוּ us/our\n" +
            " x אֶיךָ you/your (ms) אֵיכֶם you/your (mp)\n" +
            " x אַיִך you/your (fs) אֵיכֶן you/your (fp)\n" +
            " x אָיו he/his        אֵיהֶם they/theirs (m)\n" +
            " x אֶיהָ she/hers     אֵיהֶן  they/theirs (f)")


        // Continue 9.3, p 81
    );
  }
}
