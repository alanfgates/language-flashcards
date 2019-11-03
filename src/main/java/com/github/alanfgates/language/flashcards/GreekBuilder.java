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

public class GreekBuilder extends BaseLanguageBuilder {

  @Override
  public String getLanguageName() {
    return "Greek";
  }

  @Override
  public List<Word> buildGrammarWords() {
    return GreekBuilderHelperGrammar.getGrammar();
  }

  @Override
  public List<Word> buildVocabWords() {
    return GreekBuilderHelperVocab.getVocab();
  }

  @Override
  public List<GrammarRule> buildRules() {
    return Arrays.asList(
        new GrammarRule("Nouns rules:\n" +
            "1. Stems ending in α or η are in the first declension, stems ending in ο are in the second, and consonantal stems are in the" +
            " third.\n" +
            "2. Every neuter word has the same form in the nominative and accusative.\n" +
            "3. Almost all neuter words end in α in the nominative and accusative plural.\n" +
            "4. In the dative singular, the ι subscripts if possible.\n" +
            "5. Vowels often change their length ('ablaut’).\n" +
            "6. In the genitive and dative, the masculine and neuter will always be identical.\n" +
            "7. Square of stops\n" +
            "8. A tau cannot stand at the end of the word and will drop off"),

        new GrammarRule("Square of stops (applies to stops before a θ as well):\n" +
            "Labial           Unvoiced π  Voiced β  Aspirates φ  Labial + σ = ψ\n" +
            "Velar (Palatals) Unvoiced κ  Voiced γ  Aspirates χ  Velar + σ = ξ\n" +
            "Dental           Unvoiced τ  Voiced δ  Aspirates θ  Dental + σ = σ"),

        new GrammarRule("1st Declension Paradigm, Feminine\n" +
            "            Singular              Plural\n" +
            "Nomanative            γραφή       ι        γραφαί\n" +
            "Vocative              γραφή       ι        γραφαί\n" +
            "Genitive    ς         γραφῆς      ων       γραφῶν\n" +
            "Dative      ι         γραφῇ       ις       γραφαῖς\n" +
            "Accusative  ν         γραφήν      ς        γραφάς\n"),

        new GrammarRule("2nd Declension Paradigm, Masculine\n" +
            "            Singular              Plural\n" +
            "Nomanative  ς        λόγος        ι      λόγοι\n" +
            "Vocative    ε        λόγε         ι      λόγοι\n" +
            "Genitive    υ        λόγου        ων     λόγων\n" +
            "Dative      ι        λόγῳ         ις     λόγοις\n" +
            "Accusative  ν        λόγον        υς     λόγους\n"),

        new GrammarRule("2nd Declension Paradigm, Neuter\n" +
            "            Singular              Plural\n" +
            "Nomanative  ν        ἔργον        α      ἔργα\n" +
            "Vocative    ε        ἔργε         α      ἔργα\n" +
            "Genitive    υ        ἔργου        ων     ἔργων\n" +
            "Dative      ι        ἔργῳ         ις     ἔργοις\n" +
            "Accusative  ν        ἔργον        α      ἔργα\n"),

        new GrammarRule("Uses of Genitive\n" +
            " * descriptive: Let us put on the armor of light ενδυσμεθα τα οπλα του φωτος\n" +
            " * possessive\n" +
            " * showing apposition to the head noun: You will receive the gift, the Holy Spirit\n" +
            "   λημψεσθε την δωρεαν του αγιου πνευματος"),

        new GrammarRule("Uses of genitive continued:\n" +
            " * showing separation from the head noun: being alienated from the commonwealth of\n" +
            "   Israel απελλοτριωμενοι της πολιτειας του Ισραηλ\n" +
            " * subjective, expanding on the idea of the head noun: Who will separate us from\n" +
            "   Christ’s love τισ ημας χωρισει απο της αγαπης του Χπριστου\n" +
            " * objective, receiving the action of the head noun: The blasphemy against the\n" +
            "   Spirit will not be forgiven η του πνευματος βλασφημια ουκ αφεθησεται"),

        new GrammarRule("Uses of genitive continued:\n" +
            " * plenary, being both subjective and objective: For the love of Christ compels us η\n" +
            "   γαρ αγαπη του Χριστου συνεχει ημας\n" +
            " * relationship: Simon, son of John Σιμων Ιωαννου\n" +
            " * partitive, where the subject is a part of the whole, which is genitive: some of\n" +
            "   the branches τινες των κλαδων"),

        new GrammarRule("Uses of Dative\n" +
            " * Dative Proper (‘to’)\n" +
            " * indirect object: He has given him authority to execute judgment εξουσιαν εδωκεν\n" +
            "   αυτῳ κρισιν ποιεν\n" +
            " * dative of interest, expression “for”:  Your wife Elizabeth will bear a son for\n" +
            "   you η γυνη σου Ελισαβετ γεννησει υιον σοι (called the “dative of advantage” when\n" +
            "   the idea is to the subject’s advantage and “dative of disadvantage” when the idea\n" +
            "   is not to the subject’s advantage)"),

        new GrammarRule("Uses of dative continued\n" +
            " * reference or respect (English, with respect to): Consider yourselves dead to sin\n" +
            "   λογιζεσθε εαυτους ειναι νεκρους τῃ αμαρτιᾳ\n" +
            " * Locative (‘in’, ‘with’)\n" +
            " * sphere or realm in which something occurs: Blessed are the pure in heart μακαριοι\n" +
            "   οι καθαροι τῃ καρδιᾳ\n" +
            " * A time designation in the dative specifies when something occurs: On the third\n" +
            "   day he will be raised τῃ τριτῃ ημερα εγερθησεται"),

        new GrammarRule("Uses of dative continued\n" +
            " * Association, indicating “with”: Do not be unequally yoked with unbelievers μη\n" +
            "   γινεσθε ετεροζυγουντες απιστοις\n" +
            " * Instrumental (‘by’)\n" +
            " * The manner in which something is done: He speaks boldly παρρησιᾳ λαλει\n" +
            " * The means or instrument by which an action is accomplished:  For it is by grace\n" +
            "    you have been saved Τῃ γαρ χαριτι εστε σεσωσμενοι"),

        new GrammarRule("Functions of the Adjective\n" +
            " * Attributive - gives a quality or attribute to the word it modifies: ο αγαθος\n" +
            "   λογος εστιν - in this situation adjective agrees with word it modifies in case,\n" +
            "   number, and gender.\n" +
            " * Substantival - when an adjective functions as a noun: ο αγαθος εστιν “the good\n" +
            "   (person) is” - in this situation case is determined by its function (subject,\n" +
            "   object, etc.) its gender and number by what it stands for.\n" +
            " * Predicate - asserts (predicates) something about the subject. ο ανθρωπος αγαθος\n" +
            "   verb ειμι may be implied"),

        new GrammarRule("Determining adjective function:\n" +
            " * If there is an article immediately before the adjective, it is either attributive\n" +
            "   (if there is a noun to modify) or substantival.  In attributive case, adjective\n" +
            "   may be before or after the noun: ο αγαθος ανθρωπος or ο ανθρωπος ο αγαθος\n" +
            "  (Exception:  demonstrative pronouns are attributive without the article: ουτος ὁ ἀνθρωπος \"this man\")\n" +
            " * If the noun has an article and the adjective does not (called anarthrous) then\n" +
            "   the adjective is functioning as a predicate: ο ανθρωπος αγαθος\n" +
            " * When there is no article context is your only guide."),

        new GrammarRule("Adjective Declensions p86\n" +
            "2-1-2:  masculine and neuter in 2nd, feminine in 1st\n" +
            "3-1-3:  masculine and neuter in 3rd, feminine in 1st\n" +
            "2-2:    all in 2nd (masculine and feminine have same endings)\n" +
            "3-3:    all in 3rd (masculine and feminine have same endings)\n" +
            "2-2 are listed in the lexicon with just 2nd declension masculine and neuter endings."),

        new GrammarRule("Article & a Prepositional Phrase\n" +
            "Articles can proceed prepositional phrases:\n" +
            " * Usually turning them into relative clauses:\n" +
            "     τους παιδας τους εν βηθλεεμ\n" +
            "     The children who are in Bethlehem\n" +
            " * Sometimes turning it into a substantive: \n" +
            "     ελαλησαν τον λογον του κυριου πασιν τοις εν τῃ οικιᾳ\n" +
            "     They spoke the word of the Lord to all who were in the house "),

        new GrammarRule("Neuter Plural Subjects\n" +
            "Greek normally uses a singular verb when the subject is neuter plural.  Indicates\n" +
            "the writer is viewing the subject as a group rather than as individuals.  In English\n" +
            "this will require a plural verb:\n" +
            "  δοκιμαζετε τα πνευματα ει εκ του θεου εστιν\n" +
            "  Test the spirits and see if they are from God."),

        new GrammarRule("Uses of article\n" +
            " 1. Definite article\n" +
            " 2. Attaching adjective to preceding noun μετα των αγγελων των αγιων\n" +
            " 3. Is often used with proper names and other nouns that English would not use it with\n" +
            " 4. Can be used with participle or adjective to make it into a noun."),

        new GrammarRule("Uses of article continued\n" +
            " 5. Is sometimes omitted when English would use it: Εν αρχη ην ο λογος\n" +
            " 6. Can function as a personal or possessive pronoun: Οι δε ειπαν προς αυτον And they said to him\n" +
            " 7. Can govern two nouns together, linking them:\n" +
            "    προσδεχομενοι την μακαριαν ελπιδα και επιφανειαν της δοξης του μεγαλου θεου και\n" +
            "      σωτηρος ημων Ιησου Χριστου\n" +
            "    waiting for our blessed hope, the appearing of the glory of our great God and\n" +
            "      Savior Jesus Christ."),

        new GrammarRule("3rd Declension Paradigm, Masculine/Feminine:\n" +
            "            Singular              Plural\n" +
            "Nomanative  ς        σάρξ         ες     σάρκες\n" +
            "Vocative             σάρκ         ες     σάρκες\n" +
            "Genitive    ος       σαρκός       ων     σαρκῶν\n" +
            "Dative      ι        σαρκί        σι(ν)  σαρξί(ν)\n" +
            "Accusative  α/ν      σάρκα        ας     σάρκας\n"),

        new GrammarRule("3rd Declension Paradigm, Neuter:\n" +
            "            Singular              Plural\n" +
            "Nomanative           ὄνομα        α      ὀνόματα\n" +
            "Vocative             ὄνομα        α      ὀνόματα\n" +
            "Genitive    ος       ὀνόματος     ων     ὀνομἀτων\n" +
            "Dative      ι        ὀνόματι      σι(ν)  ὀνόμασι(ν)\n" +
            "Accusative           ὄνομα        α      ὀνόματα\n"),

        new GrammarRule("The Three Uses of αὐτος\n" +
            " 1. Personal pronoun.\n" +
            " 2. Adjectival intensive.  This is used to modify another word and is placed in the\n" +
            "    predicate position.  This is usually translated into English with a reflexive\n" +
            "    pronoun: αὐτος ὁ ἀποστολος the apostle himself.  When functioning as an intensive,\n" +
            "    αὐτος is usually in the nominative case and modifies the subject.\n" +
            " 3. Identical adjective, meaning “the same”.  Usually in the attributive position.\n" +
            "    και παλιν απελθων προσηυξατο τον αυτον λογον\n" +
            "    And again after going away he prayed the same word."),

        new GrammarRule("The demonstratives οὑτος and ἐκεινος can be used as pronouns or\n" +
            "adjectives.  Can also be used as a personal pronoun at times."),

        new GrammarRule("Degrees of an adjective:\n" +
            " * Positive: uncompared e.g μεγας large\n" +
            " * Comparative: greater of two items: e.g. μειζων larger\n" +
            " * Superlative: greatest, or comparison of 3 or more e.g. μεγιστος largest\n" +
            "    where English would expect a superlative"),

        new GrammarRule("ἀν used in conjunction with a relative pronoun makes it indefinite\n" +
            "e.g. ὅς who ὅς ἀν whoever"),

        new GrammarRule("Attraction: Occasionally the case of the relative pronoun is determined\n" +
            "not by its function in the relative clause but by its antecedent.  This usually\n" +
            "happens when it is in the immediate proximity of its antecedent, when the\n" +
            "antecedent is dative or genitive and the relative pronoun normally would be\n" +
            "accusative."),

        new GrammarRule("Present active indicative paradigm:\n" +
            "     Stem  connecting personal form\n" +
            "           vowel      ending\n" +
            "1sg  λυ    ο                   λυω\n" +
            "2sg  λυ    ε          ς        λυεις\n" +
            "3sg  λυ    ε          ι        λυει\n" +
            "1pl  λυ    ο          μεν      λυομεν\n" +
            "2pl  λυ    ε          τε       λυετε\n" +
            "3pl  λυ    ο          νσι      λυουσι(ν)\n"),

        new GrammarRule("Contract verbs are verbs that end in α, ε, or ο.  In the present and\n" +
            "imperfect tenses the final vowel contracts with the connecting vowel as follows:\n" +
            " * two like vowels combine to the associated long vowel (except following two)\n" +
            "   * ο + ο = ου\n" +
            "   * ε + ε = ει\n" +
            " * (anything but ε) + ο = ω (commutative)\n" +
            "   * ε + ο = ου (commutative)\n" +
            " * anything + ω = ω (commutative)\n" +
            " * α + ε/η = α\n" +
            " * ε/η + α  = η\n" +
            " * α + ε + ι = ᾳ\n" +
            " * ε + α + ι = ῃ\n" +
            " * ο + ε + ι = οι\n" +
            " * Dipthongs:  if the contract vowel and the first vowel of the dipthong are the\n" +
            "   same, they combine to a single instance of the vowel.  Otherwise they contract.\n" +
            "   If the second vowel of the dipthong is a ι it subscripts if possible.\n"),

        new GrammarRule("Present middle/passive indicative paradigm:\n" +
            "     Stem  connecting personal form\n" +
            "           vowel      ending\n" +
            "1sg  λυ    ο          μαι      λυομαι\n" +
            "2sg  λυ    ε          σαι      λυῃ\n" +
            "3sg  λυ    ε          ται      λυεται\n" +
            "1pl  λυ    ο          μεθα     λυομεθα\n" +
            "2pl  λυ    ε          σθε      λυεσθε\n" +
            "3pl  λυ    ο          νται     λυονται\n"),

        new GrammarRule("A deponent verb is one that is middle or passive in form but active\n" +
            "in meaning.  It does not take a middle or passive meaning.\n" +
            "Verbs can be deponent in one tense but not in another (e.g. ἔρχομαι is deponent in\n" +
            "the present but not in the aorist.\n" +
            "75% of middle forms in the NT are deponent."),

        new GrammarRule("Future stems:\n" +
            " * Future active has its own stems.\n" +
            " * Future middle uses future active tense stem.\n" +
            " * Future passive uses aorist passive tense stem."),

        new GrammarRule("Future active indicative paradigm:\n" +
            "     Stem  tense formative   connecting vowel  ending  form\n" +
            "1sg  λυ    σ                 ο                 -       λύσω\n" +
            "2sg  λυ    σ                 ε                 ς       λύσεις\n" +
            "3sg  λυ    σ                 ε                 ι       λύσει\n" +
            "1pl  λυ    σ                 ο                 μεν     λύσομεν\n" +
            "2pl  λυ    σ                 ε                 τε      λύσετε\n" +
            "3pl  λυ    σ                 ο                 νσι     λύσουσι(ν)\n"),

        new GrammarRule("Future middle indicative paradigm:\n" +
            "     Stem  tense formative   connecting vowel  ending  form\n" +
            "1sg  λυ    σ                 ο                 μαι     λύσομαι\n" +
            "2sg  λυ    σ                 ε                 σαι     λύσῃ\n" +
            "3sg  λυ    σ                 ε                 ται     λύσεται\n" +
            "1pl  λυ    σ                 ο                 μεθα    λυσόμεθα\n" +
            "2pl  λυ    σ                 ε                 σθε     λύσεσθε\n" +
            "3pl  λυ    σ                 ο                 νται    λύσονται\n"),

        new GrammarRule("Separating γινομαι, γενναω and γινωσκω:\n" +
            " * γινομαι will always have a vowel between the γ and the ν.  Usually an ε.\n" +
            " * γενναω always has double ν and is completely regular.\n" +
            " * γινωσκω, except in the present tense, does not have a vowel between the γ and the ν."),

        new GrammarRule("Verb roots and stems,\n" +
            " * Pattern 1: root not modified.  Example: *ἀκου\n" +
            " * Pattern 2: different roots in different stems\n" +
            " * Pattern 3: verbs with roots ending in a liquid (λ, μ, ν, ρ)"),

        new GrammarRule("Liquid verbs:\n" +
            " * Tense formative for future is εσ instead of just σ but σ often drops out\n" +
            "   when placed between two vowels resulting in future without σ.\n" +
            "   The contracted vowels always have a circumflex (except in 1st plural middle).\n" +
            "   For example: μεν + εσ + ω = μεν + ε + ω = μενῶ"),

        new GrammarRule("Common verb root modifications:\n" +
            " * When the present tense stem ends in ιζω or αζω the root generally ends in a\n" +
            "   dental (τ, δ, θ) *βαπτιδ -> βαπτιζω\n" +
            " * When the present tense stem ends in ασσω the root generally ends in a\n" +
            "   velar ( κ, γ, χ) *ταραχ -> ταρασσω\n" +
            " * When the present tense stem ends in a double consonant the root often ends in\n" +
            "   a single consonant: *βαλ -> βαλλω\n" +
            " * Some roots add a iota in the present stem: *αρ -> αἴρω\n" +
            " * Some roots add σκ or ισκ to form the present: *γνω -> γινωσκω\n" +
            " * Some stem vowels ablaut."),

        new GrammarRule("Verbs that have second aorists are normally verbs that alter their\n" +
            "root in the formation of their present tense stem."),

        new GrammarRule("Imperfect active paradigm:\n" +
            "       form       connecting vowel  ending\n" +
            "1sg    ἔλυον      ο                 ν\n" +
            "2sg    ἔλυες      ε                 ς\n" +
            "3sg    ἔλυε(ν)    ε                 - (ν)\n" +
            "1pl    ἐλύομεν    ο                 μεν\n" +
            "2pl    ἐλὐετε     ε                 τε\n" +
            "3pl    ἔλυον      ο                 ν"),

        new GrammarRule("Imperfect middle/passive paradigm:\n" +
            "       form       connecting vowel  ending\n" +
            "1sg    ἐλυόμην    ο                 μην\n" +
            "2sg    ἐλύου      ε                 σο\n" +
            "3sg    ἐλύετο     ε                 το\n" +
            "1pl    ἐλυόμεθα   ο                 μεθα\n" +
            "2pl    ἐλύεσθε    ε                 σθε\n" +
            "3pl    ἐλύοντο    ο                 ντο"),

        new GrammarRule("Augments for imperfect and aorist:\n" +
            "* If the word begins with a consonant, an ε is prepended.\n" +
            "* If the word begins with a vowel the vowel lengthens:\n" +
            "  α + ε = η\n" +
            "  ε + ε = η\n" +
            "  ο + ε = ω\n" +
            "  η + ε = η\n" +
            "  ι + ε = ι\n" +
            "  υ + ε = υ\n" +
            "  ω + ε = ω\n" +
            "* If the verb begins with a dipthong then either the first letter lengthens,\n" +
            "  and if the second letter is a ι it subscripts, or the verb does not show an augment."),

        new GrammarRule("Base stems:\n" +
            "* Present stem (active, middle, passive)\n" +
            "* Future active stem (also used for middle)\n" +
            "* Aorist active stem (also used for middle)\n" +
            "* Perfect active stem\n" +
            "* Aorist passive stem\n" +
            "* Perfect middle/passive stem\n"),

        new GrammarRule("Tense stems used for other tenses:\n" +
            "* Imperfect tense built on present tense stem.\n" +
            "* Future passive built on aorist passive stem.\n" +
            "* Present participle built on present tense stem.\n" +
            "* Aorist participle built on aorist tense stem.\n" +
            "* Perfect participle built on perfect tense stem.\n" +
            "* Subjunctive present formed from present stem, aorist from aorist stem, perfect on the perfect stem.\n" +
            "* Infinitive present formed from present stem, aorist from aorist stem, perfect on the perfect stem.\n" +
            "* If verb is deponent in a stem, it will be deponent in other tenses built on that stem."),

        new GrammarRule("In a compound verb the augment comes after the preposition.\n" +
            "* If the preposition ends in a vowel it does not contract with the augment\n" +
            "  * Usually the final vowel of the preposition drops off.\n" +
            "  * Sometimes it remains but does not contract.\n" +
            "* When a compound verb with a preposition that ends in κ augments the κ\n" +
            "  changes to ξ."),

        new GrammarRule("Imperfect can describe:\n" +
            " * An ongoing action in the past (most common), called progressive, durative.\n" +
            "   ἐδιδασκεν τους μαθητας αυτου He was teaching his disciples\n" +
            " * Can place emphasis on the beginning of an action, called ingressive, inceptive.\n" +
            "   ἀγγελοι προσηλθον και διηκονουν αυτῳ Angles came and begin to minister to him\n" +
            " * Can stress the repetitive nature of an action, called iterative.\n" +
            "   ἠρχετο προσ αὐτον [the widow] kept coming to him"),

        new GrammarRule("Imperfect can describe (continued):\n" +
            " * Used to desribe actions that occur regularly, called customary.\n" +
            "   Κατα δε ἑορτην _ἀπελυεν_ αὐτοις ἑνα δεσμιον\n" +
            "   Now at the feast _he used to release_ for them any one prisoner\n" +
            " * Can be used to describe a wish (voluntative)\n" +
            "   _ηὐχομην_ γαρ ἀναθεμα εἰναι αὐτος ἐγω For _I could wish_ that I myself were accursed\n" +
            " * Can be used to describe an attempt (conative)\n" +
            "   και ἐπορθουν αὐτην and I tried to destroy it\n" +
            " * Can describe something almost done (tendential)\n" +
            "   ὁ δε Ἰωαννης διεκωλυεν αὐτον John would have prevented him"),

        new GrammarRule("Second aorist active paradigm:\n" +
            "       form       connecting vowel  ending\n" +
            "1sg    ἔλαβον     ο                 ν\n" +
            "2sg    ἔλαβες     ε                 ς\n" +
            "3sg    ἔλαβε(ν)   ε                 - (ν)\n" +
            "1pl    ἐλαβομεν   ο                 μεν\n" +
            "2pl    ἐλαβετε    ε                 τε\n" +
            "3pl    ἔλαβον     ο                 ν"),

        new GrammarRule("Second aorist middle paradigm:\n" +
            "       form        connecting vowel  ending\n" +
            "1sg    ἐγενόμην    ο                 μην\n" +
            "2sg    ἐγένου      ε                 σο\n" +
            "3sg    ἐγένετο     ε                 το\n" +
            "1pl    ἐγενόμεθα   ο                 μεθα\n" +
            "2pl    ἐγένεσθε    ε                 σθε\n" +
            "3pl    ἐγένοντο    ο                 ντο"),

        new GrammarRule("Aorist stems:\n" +
            " * In the active voice, a second aorist will always have a different stem from\n" +
            "   the present because the root will always have been modified to form the\n" +
            "   present stem.\n" +
            " * Almost always the second aorist stem is identical to the root.\n" +
            " * For first aorist the tense stem is normally identical to the present tense stem."),

        new GrammarRule("Aorist meaning:\n" +
            " * Aorist is undefined, just says that an action happened, nothing about when or\n" +
            "   how long.  It is often used for punctiliar (point in time) as in English\n" +
            "   past tense, but that is not always what it means.\n" +
            " * Aorist can refer to an action as a whole (constative)\n" +
            " * It can refer to the beginning of an action (ingressive)\n" +
            " * It can refer to a timeless truth (gnomic)\n" +
            " * It can refer to a future action that will certainly occur (proleptic)."),

        new GrammarRule("First aorist active paradigm:\n" +
            "    augment  stem tense formative  secondary active personal endings  form\n" +
            "1sg ε        λυ   σα               -                                  ἔλυσα\n" +
            "2sg ε        λυ   σα               ς                                  ἔλυσας\n" +
            "3sg ε        λυ   σε               - (ν)                              ἔλυσε(ν)\n" +
            "1pl ε        λυ   σα               μεν                                ἐλύσαμεν\n" +
            "2pl ε        λυ   σα               τε                                 ἐλύσατε\n" +
            "3pl ε        λυ   σα               ν                                  ἔλυσαν"),

        new GrammarRule("First aorist endings and verb types:\n" +
            " * Contract verbs lengthen the contract vowel before the tense formative:\n" +
            "   ἀγαπάω becomes ἠγάπησα\n" +
            " * Stems that end in a stop combine the stop with the sigma, as per the rules.\n" +
            " * Liquid verbs use α/ε as a tense formative rather than σα."),

        new GrammarRule("First aorist middle paradigm:\n" +
            "    augment  stem tense formative  secondary active personal endings  form\n" +
            "1sg ε        λυ   σα               μην                                ἐλυσάμην\n" +
            "2sg ε        λυ   σα               σο                                 ἐλύσω\n" +
            "3sg ε        λυ   σα               το                                 ἐλύσατο\n" +
            "1pl ε        λυ   σα               μεθα                               ἐλυσάμεθα\n" +
            "2pl ε        λυ   σα               σθε                                ἐλύσασθε\n" +
            "3pl ε        λυ   σα               ντο                                ἐλύσαντο"),

        new GrammarRule("First aorist passive paradigm:\n" +
            "    augment  stem tense formative  secondary active personal endings  form\n" +
            "1sg ε        λυ   θη               ν                                  ἐλύθην\n" +
            "2sg ε        λυ   θη               ς                                  ἐλύθης\n" +
            "3sg ε        λυ   θη               -                                  ἐλύθη\n" +
            "1pl ε        λυ   θη               μεν                                ἐλύθημεν\n" +
            "2pl ε        λυ   θη               τε                                 ἐλύθητε\n" +
            "3pl ε        λυ   θη               σαν                                ἐλύθησαν"),

        // TODO fix the stem here, it isn't lu
        new GrammarRule("Second aorist passive paradigm:\n" +
            "    augment  stem tense formative  secondary active personal endings  form\n" +
            "1sg ε        λυ   η                ν                                  ἐγράφην\n" +
            "2sg ε        λυ   η                ς                                  ἐγράφης\n" +
            "3sg ε        λυ   η                -                                  ἐγράφη\n" +
            "1pl ε        λυ   η                μεν                                ἐγράφημεν\n" +
            "2pl ε        λυ   η                τε                                 ἐγράφητε\n" +
            "3pl ε        λυ   η                σαν                                ἐγράφησαν"),

        new GrammarRule("Future passive paradigm:\n" +
            "     Stem  tense formative   connecting vowel  ending  form\n" +
            "1sg  λυ    θησ               ο                 μαι     λυθήσομαι\n" +
            "2sg  λυ    θησ               ε                 σαι     λυθήσῃ\n" +
            "3sg  λυ    θησ               ε                 ται     λυθήσεται\n" +
            "1pl  λυ    θησ               ο                 μεθα    λυθησόμεθα\n" +
            "2pl  λυ    θησ               ε                 σθε     λυθήσεσθε\n" +
            "3pl  λυ    θησ               ο                 νται    λυθήσονται\n"),

        new GrammarRule("Second future passive paradigm:\n" +
            "     Stem      tense formative   connecting vowel  ending  form\n" +
            "1sg  ἀποσταλ   ησ                ο                 μαι     ἀποσταλήσομαι\n" +
            "2sg  ἀποσταλ   ησ                ε                 σαι     ἀποσταλήσῃ\n" +
            "3sg  ἀποσταλ   ησ                ε                 ται     ἀποσταλήσεται\n" +
            "1pl  ἀποσταλ   ησ                ο                 μεθα    ἀποσταλησόμεθα\n" +
            "2pl  ἀποσταλ   ησ                ε                 σθε     ἀποσταλήσεσθε\n" +
            "3pl  ἀποσταλ   ησ                ο                 νται    ἀποσταλήσονται\n"),

        new GrammarRule("Perfect tense describes an action that was brought to completion\n" +
            "and whose effects are felt in the present (consummative, extensive).  Can be\n" +
            "translated with have/has or present, e.g.\n" +
            "τον δρομον τετεκεκα I have finished the race\n" +
            "Can also be intensive, stressing the resulting state of an action:\n" +
            "ἀφεωνται σοι αἱ ἁμαρτιαι σου your sins are forgiven you"),

        new GrammarRule("Perfect tense reduplication:\n" +
            " * If the word starts with a single consonant, that consonant is doubled with\n" +
            "   and ε placed between.\n" +
            "   * φ goes to π   χ goes to κ    θ goes to τ\n" +
            " * If the word starts with a vowel or dipthong, the vowel is lengthened.\n" +
            "   * Dipthongs often do not change.\n" +
            " * If the word starts with two consonants, just the ε will usually be prepended,\n" +
            "   no reduplication.  Does not usually apply to words where λ or ρ are the second\n" +
            "   letter.\n" +
            " * Compound verbs reduplicate the verb portion of the word.\n" +
            " * Contract verbs lengthen their contract vowel (ending vowel).\n" +
            " * Second perfect has α instead of κα for the tense formative."),

        new GrammarRule("Middle voice:\n" +
            " * Indirect middle: the action of the verb in some way affects the subject.\n" +
            "   Example: ὁ Πιλατος ... λαβων ὕδωρ ἀπενιψατο τας χειρας\n" +
            "   Pilate took water and washed his hands.  Emphasizes Pilate's attempt to absolve himself.\n" +
            "   δεξασθε τον ἐμφυτον λογον receive the implanted word, receiving is something done for the self.\n" +
            " * Reflexive middle:  the subject does the action and receives it.\n" +
            "   Ἰουδας ... ἀπελθων ἀπηγξατο Judas went out and hung himself"),

        new GrammarRule("Pluperfect describe an action in the past that was completed and who's effect are felt in the past\n" +
            "    augment     reduplication     stem     tense formative     secondary endings     form\n" +
            "1sg (ε)         λε                λυ       κ                   ν                     ἐλελύκειν\n" +
            "2sg (ε)         λε                λυ       κ                   σ                     ἐλελύκεις\n" +
            "3sg (ε)         λε                λυ       κ                   (ν)                   ἐλελύκει(ν)\n" +
            "1pl (ε)         λε                λυ       κ                   μεν                   ἐλελύκειμεν\n" +
            "2pl (ε)         λε                λυ       κ                   τε                    ἐλελύκειτε\n" +
            "3pl (ε)         λε                λυ       κ                   σαν                   ἐλελύκειααν\n"),

        new GrammarRule("Participle aspect:\n" +
            "Present participle describes a continuous action\n" +
            "Aorist participle describes an action where the aspect is undefined\n" +
            "Perfect participle describes a completed action with present effects\n" +
            "Future participle describes an action that is intended, purposed, or expected."),

        new GrammarRule("Participle relative time:\n" +
            "Present: describes an action occurring at the same time as the main verb\n" +
            "Aorist: describes an action occurring before the main verb\n" +
            "Aspect always trumps relative time."),

        new GrammarRule("Participles have two basic types:\n" +
            "Adverbial:  action described by the participle is primary directed towards the verb\n" +
            "  e.g.: While studying his Greek, Ian fell asleep\n" +
            "  If the participle is active, the word modified does the action of the participle\n" +
            "  If the participle is passive, the word modified receives the action of the participle\n" +
            "  Adverbial participles are always anarthrous (no article)\n" +
            "Adjectival: action described by the participle modifies a noun or pronoun\n" +
            "  e.g.: The book lying on the floor belongs to Kathy"),

        new GrammarRule("Particples and other parts of speech:\n" +
            "* Participles do not have a subject and do not take personal endings\n" +
            "* Participles can take objects and prepositional phrases\n" +
            "* Participles are negated with μη"),

        new GrammarRule("Present (continuous) participle breakdown:\n" +
            "Present tense stem + connecting vowel + participle morpheme + case ending\n" +
            "πιστευ             + ο                + ντ                  + ες\n" +
            "λυ                 + ο                + μενο                + οι"),

        // TODO, this chart doesn't make any sense, perfect is a tense, while active etc. are voices
        new GrammarRule("Participle morphemes:\n" +
            "               masculine   feminine  neuter\n" +
            "active         ντ          ουσα      ντ    \n" +
            "middle/passive μενο        μενη      μενο  \n" +
            "perfect        οτ          οτ        οτ    \n"),
        // TODO this last line doesn't seem true, as I never see t in perfect
        // feminine.  Double check this.

        new GrammarRule("Participal exegesis:\n" +
            "1. Temporal:  the aorist participle can describe an action occurring before the time\n" +
            "   of the finite verb, while the present participle can describe something happening\n" +
            "   at the same time as the action of the main verb:\n" +
            "   νηστεύσας ... ὕστερον ἐπείνασεν after fasting, ... he was hungry\n" +
            "   συναλιζόμενας παρήγγειλεν αὐτοις while staying with them he charged them.\n" +
            "2. Manner:  can indicate the manner in which the action of the finite verb occurs:\n" +
            "   ἀκουσας δε ὁ νεακισκος τον λογον ἀπηλθεν _λυπουμενος_\n" +
            "   When the young man heard this, he went away _sad_\n" +
            "3. Means:  can indicate the means by which the action of the finite verb occurs:\n" +
            "   κοπιωμεν _ἐργαζομενοι_ ταις ἰδιας χερσιν We toil _working_ with our own hands"),

        new GrammarRule("Participal exegesis continued:\n" +
            "4. Cause:  can indicate the cause or reason or ground of the action of the finite verb:\n" +
            "   ἠγαλλιασατο πανοικει _πεπιστευκως_ τῳ θεῳ\n" +
            "   He was filled with joy, along with his entire household, _because he had come to believe_ in God.\n" +
            "5. Conditional: can indicate a condition that must be fulfilled if the action of the\n" +
            "   finite verb is to be accomplished:\n" +
            "   παντα ὅσα ἄν αἰτηστε ... _πιστευοντες_ λημψεσθε\n" +
            "   And whatever you ask in prayer, you will receive, _if you have faith_\n" +
            "6. Concessive:  can indicate that the action of the finite verb is true despite the\n" +
            "   action of the participle:\n" +
            "   Και ὑμας _ὄντας_ νεκρους τοις παραπτωμασιν\n" +
            "   And _although you were dead_ in your transgressions"),

        new GrammarRule("Participle exegesis continued:\n" +
            "7. Purpose: can indicate the purpose of the finite verb (often translated as infinitive:\n" +
            "   ἄφες ἴδωμεν εἰ ἔρχεται Ἠλιας _σωσων_ αὐτον\n" +
            "   Wait! Let's see if Elijah comes _to save_ him\n" +
            "8. Result:  can indciate the result of the finite verb:\n" +
            "   ἵνα τους δυο κτισῆ ἐν αὐτῳ εἰς ἕνα καινον ἄνθρωπον _ποιων_ εἰρηνην\n" +
            "   In order ot create in himself one new man out of the two, _thus making peace_"),

        new GrammarRule("Participles are often translated as indicatives for several reasons:\n" +
            "* Breaking up of long sentances (e.g. Eph 1:3-14 is one sentance in Greek)\n" +
            "* Greek likes aorist participle before the main verb where English prefers two\n" +
            "  finite verbs: εὐθυς _ἀφεντες_ τα δικτυα ἠκολουθησαν αὐτῳ\n" +
            "  Immediately _they left_ their nets and followed him."),

        new GrammarRule("Aorist (undefined aspect) participle breakdown:\n" +
            "Voice   Aorst tense stem + tense formative + participle morpheme + case ending\n" +
            "active  λυ               + σα              + ντ                  + ες\n" +
            "middle  λυ               + σα              + μενο                + ι\n" +
            "passive λυ               + θε              + ντ                  + ες\n"),

        new GrammarRule("Participle declensions:\n" +
            "* feminine participle always uses 1st declension\n" +
            "* active masculine & neuter use 3rd declension\n" +
            "* middle/passive present masculine & neuter use 2nd declension\n" +
            "* middle aorist masculine & neuter use 2nd declension\n" +
            "* aorist passive use 3rd declension"),
        // TODO add perfect to this list, as it's not clear to me what it does

        new GrammarRule("Adjectival participles can be either:\n" +
            "* attributive - acting as an adjective\n" +
            "* substantival - acting as a noun"),

        new GrammarRule("Adverbial participle is always anarthrous (no definite article)\n" +
            "while the adjectival participle is usually articular (has definite article).\n" +
            "Relative time still applies, so aorist still implies the participle is describing\n" +
            "someone/something that acted before the main verb."),

        new GrammarRule("Perfect participles indicate a completed action with effects in the " +
            "present (from the viewpoint of the writer).\n" +
            "Built on the perfect stem of the verb, with reduplication\n" +
            "                Redup-   + perfect    + tense formative + participle + case\n" +
            "                lication   tense stem   formative         morpheme     ending\n" +
            "active:         λε         λυ           κ                 οτ           ες\n" +
            "middle/passive: λε         λυ                             μενο         ι"),

        new GrammarRule("An 'absolute' grammatical construction is one that is not grammatically\n" +
            "related to the rest of the sentance, that is it does not modify any other words in the sentance.\n" +
            "_ταυτα αὐτου λαλουντος_ πολλοι ἐπιστευσαν εἰς αὐτον\n" +
            "_While he was saying these things_ many believed in him\n" +
            "This is called a genitive absolute (I assume because the participle is in the genitive case)\n" +
            "The genitive absolute can have a 'subject' such as he in the above example and and object\n" +
            "such as these things in the above, or other modifiers"),

        new GrammarRule("Subjunctive describes possibility or probability.\n" +
            "Subjunctive has aspect, so present tense indicates continuous action while aorist indicates undefined.\n" +
            "Perfect subjunctive (very rare) indicates completed action with continuing consequences."),

        new GrammarRule("οὐ μή plus subjunctive indicates emphatic denial of a future possibility, e.g. Jesus'\n" +
            "words in Jn 10:28 οὐ μή ἀπόλωνται they [his sheep] will by no means perish."),

        new GrammarRule("Subjunctive active present paradigm:\n" +
            "     Stem  connecting personal form\n" +
            "           vowel      ending\n" +
            "1sg  λυ    ω                   λύω\n" +
            "2sg  λυ    η          ς        λύῃς\n" +
            "3sg  λυ    η          ι        λύῃ\n" +
            "1pl  λυ    ω          μεν      λύωμεν\n" +
            "2pl  λυ    η          τε       λύητε\n" +
            "3pl  λυ    ω          νσι      λύωσι(ν)\n"),

        new GrammarRule("Subjunctive middle/passive present paradigm:\n" +
            "     Stem  connecting personal form\n" +
            "           vowel      ending\n" +
            "1sg  λυ    ω          μαι      λυωμαι\n" +
            "2sg  λυ    η          σαι      λυῃ\n" +
            "3sg  λυ    η          ται      λυηται\n" +
            "1pl  λυ    ω          μεθα     λυωμεθα\n" +
            "2pl  λυ    η          σθε      λυησθε\n" +
            "3pl  λυ    ω          νται     λυωνται\n"),

        new GrammarRule("Subjunctive active aorist paradigm:\n" +
            "     Stem  tense     connecting personal form\n" +
            "           formative vowel      ending\n" +
            "1sg  λυ    σ         ω                   λύσω\n" +
            "2sg  λυ    σ         η          ς        λύσῃς\n" +
            "3sg  λυ    σ         η          ι        λύσῃ\n" +
            "1pl  λυ    σ         ω          μεν      λύσωμεν\n" +
            "2pl  λυ    σ         η          τε       λύσητε\n" +
            "3pl  λυ    σ         ω          νσι      λύσωσι(ν)\n"),

        new GrammarRule("Subjunctive middle aorist paradigm:\n" +
            "     Stem  tense     connecting personal form\n" +
            "           formative vowel      ending\n" +
            "1sg  λυ    σ         ω          μαι      λυσωμαι\n" +
            "2sg  λυ    σ         η          σαι      λυσῃ\n" +
            "3sg  λυ    σ         η          ται      λυσηται\n" +
            "1pl  λυ    σ         ω          μεθα     λυσωμεθα\n" +
            "2pl  λυ    σ         η          σθε      λυσησθε\n" +
            "3pl  λυ    σ         ω          νται     λυσωνται\n"),

        new GrammarRule("Subjunctive passive aorist paradigm:\n" +
            "     Stem  tense     connecting personal form\n" +
            "           formative vowel      ending\n" +
            "1sg  λυ    θ         ω                   λύθω\n" +
            "2sg  λυ    θ         η          ς        λύθῃς\n" +
            "3sg  λυ    θ         η          ι        λύθῃ\n" +
            "1pl  λυ    θ         ω          μεν      λύθωμεν\n" +
            "2pl  λυ    θ         η          τε       λύθητε\n" +
            "3pl  λυ    θ         ω          νσι      λύθωσι(ν)\n"),

        new GrammarRule("Uses of the subjunctive:\n" +
            "* Possibility or probability.\n" +
            "* ἵνα is almost always followed by the subjunctive, can indicate purpose:\n" +
            "  τίς σοι ἔδωκεν τήν ἐξουσίαν ταύτην ἵνα ταῦτα _ποιῇς_;\n" +
            "  Who gave you authority that _you do_ these things? \n" +
            "* Can also indicate content of the preceeding verb:\n" +
            "  ἐκήρθξαν ἵνα μετανοῶσιν they preached that they should repent\n" +
            "* ἵνα μή plus subjunctive can be translated as 'lest'\n" +
            "  οἱ πατέπρες, μή ἐρεθίζετε τὰ τέκνα ὑμῶν, _ἵνα μή ἀθυμῶσιν_\n" +
            "  Fathers, do not provoke your children, _lest they become discouraged_"),

        new GrammarRule("Uses of the subjunctive (cont)\n" +
            "Conditional statements introduced by ἐάν.  If (protasis) is in subjunctive, then (apodosis) any tense or mood.\n" +
            "  Can be future event: ταῦτα σοι πάντα δώσω, ἐάν πεσὼν _προσκυνήσῃς_ μοι\n" +
            "                       All these things I will give you, if you will fall down and _worship_ me\n" +
            "  Can be a timeless truth: ἐάν _θέλῃς_ δύνασαί με καθαρίσαι\n" +
            "                           if _you want_ you can make me clean\n" +
            "Hortatory: first person subjunctive, usually at the beginning of the sentance and plural:\n" +
            "  _διέλθωμεν_ εἰς τό πέραν _let us to across_ to the other side\n" +
            "Deliberative, when the answer to a question is uncertain: τί φάγωμεν what should we eat?"),

        new GrammarRule("ἴνα, ἕως, and most words that include ἄν are usually followed by a subjunctive:\n" +
            "  ὄταν (whenever) ἐάν (if) ὄς ἄν (whoever) ὅπου ἄν (whenever)\n" +
            "Subjunctive negated with μή"),

        new GrammarRule("Three ways to ask a question:\n" +
            "1. No indication is given as to the answer expected:\n" +
            "   σύ εἶ ὁ βασιλεύς τῶν Ἰουδαίων; Are you the king of the Jews?\n" +
            "2. If the question begins with (not just contains) οὐ the inquistor expects a positive answer:\n" +
            "   Διδάσκαλε, οὐ μέλει σοι ὅτι ἀπολλύμεθα Teacher, do you not care that we are perishing?\n" +
            "3. If the question being with μή the inquistor expects a negative answer:\n" +
            "   μή πάντες ἀπόστολοι;  Are all apostles?"),

        new GrammarRule("Infinitive is a verbal noun.\n" +
            "It is viewed as singular neuter and can take a definite articule in singular neuter, the case\n" +
            "of which is determined by the function of the infinitive in the sentance.\n" +
            "It can have a direct object and adverbial modifiers."),

        new GrammarRule("Infinitive 'tenses':\n" +
            "* present: continuous Οὐδεὶς δύναται δυσὶ κυρίος δουλεύειν No one is able to serve two masters.\n" +
            "* aorist: undefined μὴ φοβηθῇς παραλαβειν Μαρίαν τὴν γυναῖκά σου Do not be afraid to take Mary as your wife\n" +
            "* perfect: completed ἤκουσαν τοῦτο αὐτὸν πεποιηκέναι τὸ σημεῖον They heard he had done this sign"),

        new GrammarRule("Infinitives cannot take a subject (that's what infinite means in this context), but\n" +
            "they will sometimes have a noun in the accusative that acts like a subject:\n" +
            "οὐκ ἤφιεν λαλεῖν τὰ δαιμόνια literally: he would not permit to speak the demons,\n" +
            "better English: he would not permit the demons to speak.\n" +
            "Since infinitive can take direct object (which is in accusative) there are cases of\n" +
            "infinitive with two nouns in accusative,\n" +
            "Usually the 'subject' is first the object second:\n" +
            "βλέπειν αὐτὸν αὐτήν he to see her"),

        new GrammarRule("Infinitive can be used as a substantive, and is usually proceeded by the definite article, in which\n" +
            "case it is called articular infinitive.  Best translated with 'to':\n" +
            "ἐμοι _το ζην_ Χριστος και _το ἀποθανειν_ κερδος\n" +
            "Literally: for me the live Christ and the die gain, better: for me to live is Christ, and to die is gain"),

        new GrammarRule("Infinitives can be used to complete a finite verb and are called 'complementary inifinitive'\n" +
            "ἤρξαντο λαλειν ἑτερπαις γλωσσαις They begin to speak in tongues\n" +
            "δει, ἐξεστιν (it is lawful), μελλω, δυναμαι, ἀρχομαι will always be followed by an infinitive"),

        new GrammarRule("δια plus article in the accusative plus infinitive means 'because', indicates reason\n" +
            "αὐτος δε Ἰησους ουκ ἐπιστευεν αὐτον αὐτοις _δια το αὐτον γινωσκειν_ παντες\n" +
            "But Jesus on his part did not entrust himself to them, _because he knew_ all people"),

        new GrammarRule("εις or προς plus article in the accusative plus infinitive means 'in order that', indicates purpose\n" +
            "παραδοσουσιν αὐτον τοις ἐθνεσιν _εις το ἐμπαιξαι και μαστιγωσαι και σταυρωσαι_\n" +
            "They will deliver him over to the Gentiles _to be mocked and flogged and crucified_\n" +
            "Purpose can also be expressed with no preposition and article in genitive"),

        new GrammarRule("προ plus article in genitive plus infinitive means 'before'\n" +
            "ἐν plus article in dative plus infinitive means 'when' or 'while'\n" +
            "μετα plus article in accusative plus infinitive means 'after'\n" +
            "ἐν τῳ σπειρειν αὐτον ἁ μεν ἐπεσεν παρα την ὁδον As he sowed some seeds fell along the path\n" +
            "ὡστε plus infinitive indicates result:\n" +
            "ἐπλησαν ἀμφοτερα τα πλοια _ὡστε βυθιζεσθαι_ αὐτα They filled both boats so full that they began to sink"),

        new GrammarRule("Infinitive can be used to report indirect discourse."),

        new GrammarRule("Imperative conveys command or request (as in 'give us this day our daily bread').\n" +
            "Present imperative conveys a continuous command or a general precept (always ...)\n" +
            "While aorist applies to a particular situation."),

        new GrammarRule("Imperative active present paradigm:\n" +
            "     Stem  connecting personal form\n" +
            "           vowel      ending\n" +
            "2sg  λυ    ε          ?        λῦε\n" +
            "3sg  λυ    ε          τω       λυέτω\n" +
            "2pl  λυ    ε          τε       λύετε\n" +
            "3pl  λυ    ε          τωσαν    λυέτωσαν\n"),

        new GrammarRule("Imperative middle/passive present paradigm:\n" +
            "     Stem  connecting personal form\n" +
            "           vowel      ending\n" +
            "2sg  λυ    ε          ?        λύου\n" +
            "3sg  λυ    ε          σθω      λυέσθω\n" +
            "2pl  λυ    ε          σθε      λύεσθε\n" +
            "3pl  λυ    ε          σθωσαν   λυέσθωσαν\n"),

        new GrammarRule("Imperative active aorist paradigm:\n" +
            "     Stem  tense     connecting personal form\n" +
            "           formative vowel      ending\n" +
            "2sg  λυ    σ         α                   λῦσον\n" +
            "3sg  λυ    σ         α          τω       λυσάτω\n" +
            "2pl  λυ    σ         α          τε       λύσατε\n" +
            "3pl  λυ    σ         α          τωσαν    λυσάτωσαν\n"),

        new GrammarRule("Imperative middle aorist paradigm:\n" +
            "     Stem  tense     connecting personal form\n" +
            "           formative vowel      ending\n" +
            "2sg  λυ    σ         α                   λῦσαι\n" +
            "3sg  λυ    σ         α          σθω      λυσάσθω\n" +
            "2pl  λυ    σ         α          σθε      λύσασθε\n" +
            "3pl  λυ    σ         α          σθωσαν   λυσάσθωσαν\n"),

        new GrammarRule("Imperative passive aorist paradigm:\n" +
            "     Stem  tense     connecting personal form\n" +
            "           formative vowel      ending\n" +
            "2sg  λυ    θ         η                   λύθητι\n" +
            "3sg  λυ    θ         η          τω       λυθήτω\n" +
            "2pl  λυ    θ         η          τε       λύθητε\n" +
            "3pl  λυ    θ         ω          τωσαν    λυθήτωσαν\n"),

        new GrammarRule("Forms of negation:\n" +
            " * οὐ with future indicative = simple negation\n" +
            "   οὐ μοιχεύσεις you shall not commit adultery\n" +
            " * μή plus present imperative = prohibiting a continuous action\n" +
            "   μή μεριμνᾶτε τῇ ψυχῇ ὑμῶν do not worry about your life\n" +
            " * μή plus aorist imperative = prohibiting an undefinted action\n" +
            "   μή γνώτω ἡ ἀριστερά σου τί ποιεῖ ἡ δεξιά σου Do not let your left hand know what your right hand is doing"),

        new GrammarRule("Forms of negation continued:\n" +
            " * μή plus aorist subjunctive = stronger form of no than οὐ plus indicative\n" +
            "   μή φοβηθῇς παραλαβεῖν Μαρῖαν τὴν γυναῖκά σου Do not be afraid to take Mary home as your wife\n" +
            " * οὐ μή plus aorist subjunctive = very strong no\n" +
            "   οἱ λόγοι μου οὐ παρέλθωσιν  My words will by no means [or never, but without time reference] pass away"),

        new GrammarRule("Standard verb conjugation (e.g. λυω) is called thematic.  Verbs ending in μι are called athematic.\n" +
            "(because the connecting vowel is called the thematic vowel and athematic verbs lack a thematic vowel)."),

        new GrammarRule("Athematic verbs rule 1: they reduplicate their initial stem letter to form the present, inserting a ι between.\n" +
            "(This appears to apply to the imperfect as well, I assume because the imperfect is formed from the present stem)\n" +
            "Athematic verbs rule 2: they do not ordinarily use a connecting vowel in the present indicative." +
            "(rule 3 in next rule)\n" +
            "Athematic verbs rule 4: the stem vowel will often lengthen, shorten, or drop out (e.g. δο to διδωμι)\n" +
            "Athematic verbs rule 5: most use κα as the tense formative in the aorist."),

        new GrammarRule("Athematic verbs rule 3: they use different personal endings in present active indicative, but the same endings " +
            "everywhere else:\n" +
            "Example: *δο\n" +
            "     Stem    personal   form\n" +
            "             ending\n" +
            "1sg  διδω    μι         δίδωμι\n" +
            "2sg  διδω    ς          δίδως\n" +
            "3sg  διδω    σι         δίδωσι(ν)\n" +
            "1pl  διδο    μεν        δίδομεν\n" +
            "2pl  διδο    τε         δίδοτε\n" +
            "3pl  διδο    ασι        διδόασι(ν)\n"),

        new GrammarRule("Exceptions to a verb uses first aorist or second aorist only:\n" +
            "δίδωμι uses first aorist in indicative and second aorist for other moods\n" +
            "ἵστημι uses both, first aorist ἔστησα for transitive and second aorist ἔστην for intransitive."),

        new GrammarRule("Athemtic verbs use same endings as thematic verbs in everything but present active indicative.  Following\n" +
            "examples used to show just how the stems change in various situations.  Only first person singular used except where\n" +
            "noted otherwise\n" +
            "mood         voice           tense        stem    form         notes\n" +
            "indicative   active          present      διδω    δίδωμι\n" +
            "indicative   active          future       δω      δώσω\n" +
            "indicative   active          2nd aorist   δω      ἔδωκα\n" +
            "indicative   active          future       δω      δέδωκα\n" +
            "indicative   middle/passive  present      διδο    δίδομαι\n"),

        new GrammarRule("Athematic verb endings continued:\n" +
            "mood         voice           tense        stem    form         notes\n" +
            "subjunctive  active          present      διδω    διδῶ\n" +
            "subjunctive  active          2nd aorist   δω      δῶ\n" +
            "subjunctive  middle/passive  present      διδω    διδῶμαι\n" +
            "subjunctive  middle          2nd aorist   δω      δῶμαι\n" +
            "subjunctive  passive         2nd aorist   δο      δοθῶ\n"),

        new GrammarRule("Athematic verb endings continued:\n" +
            "mood         voice           tense        stem    form         notes\n" +
            "imperative   active          present      διδο    δίδοτε       2nd person plural\n" +
            "imperative   active          2nd aorist   δο      δότε         2nd person plural\n" +
            "imperative   middle/passive  present      διδο    δίδοσθε      2nd person plural\n" +
            "imperative   middle          2nd aorist   δο      δόσθε        2nd person plural\n" +
            "imperative   passive         2nd aorist   δο      δόθητε       2nd person plural"),

        new GrammarRule("Athematic verb endings continued:\n" +
            "mood         voice           tense        stem    form         notes\n" +
            "infinitive   active          present      διδο    διδόναι\n" +
            "infinitive   middle/passive  present      διδο    δίδοσθαι\n" +
            "infinitive   active          2nd aorist   δο      δοῦναι\n" +
            "infinitive   middle          2nd aorist   δο      δόσθαι\n" +
            "infinitive   passive         2nd aorist   δο      δοθῆναι"),

        new GrammarRule("Athematic verb endings continued:\n" +
            "mood         voice           tense        stem    form         notes\n" +
            "participle   active          present      διδο    διδούς       masculine nominative singular\n" +
            "participle   active          present      διδο    διδοῦσα      feminine nominative singular\n" +
            "participle   active          present      διδο    διδόν        neuter nominative singular\n" +
            "participle   active          2nd aorist   δο      δούς         masculine nominative singular\n" +
            "participle   active          2nd aorist   δο      δοῦσα        feminine nominative singular\n" +
            "participle   active          2nd aorist   δο      δόν          neuter nominative singular\n" +
            "participle   middle/passive  present      διδο    διδόμενος    masculine nominative singular\n" +
            "participle   middle          2nd aorist   δο      δόμενος      masculine nominative singular\n" +
            "participle   passive         2nd aorist   δο      δοθείς       masculine nominative singular"),

        new GrammarRule("Conditional senatances, if then:  if called protasis, then apodosis\n" +
            "  * First class conditional, aka conditions of fact:  assume something is true for argument (it may or \n" +
            "    may not be), then the apodosis must be true:\n" +
            "    protasis: εἰ + indicative any tense; apodosis: any mood, any tense; negated by οὐ\n" +
            "    εἰ δέ ἀνάστασις νεκρῶν οὐκ ἔστιν, οὐδὲ Χριστὸς ἐγήγερται\n" +
            "    But if there is no ressurection of the dead, then not even Christ has been raised."),

        new GrammarRule("Conditional senatances, if then:  if called protasis, then apodosis\n" +
            "  * Second class conditional, aka contrary to fact:  if something were true, which it isn't, then\n" +
            "    something else would be true.\n" +
            "    protasis: εἰ + indicative past tense; apodosis: ἄν plus same tense as protasis; negated by μή\n" +
            "    εἰ γάρ ἔγνωσαν, ούκ ἂν τὸν κύριον τῆς δόξης ἐσταύπωσαν\n" +
            "    For if they had known, they would not have crucified the Lord of glory"),

        new GrammarRule("Conditional senatances, if then:  if called protasis, then apodosis\n" +
            "  * Third class conditional, future more probable (something might be true in the future)\n" +
            "    or present general (generally true at all times)\n" +
            "    protasis: ἐάν + subjunctive; apodosis: any mood, any tense; negated by μή\n" +
            "    Future more probable: ταῦτα σοι πάντα δώσω, ἐάν πεσὼν _προσκυνήσῃς_ μοι\n" +
            "    All these things I will give you, if you will fall down and _worship_ me\n" +
            "    present general: ἐάν _θέλῃς_ δύνασαί με καθαρίσαι\n" +
            "    if _you want_ you can make me clean\n"),

        new GrammarRule("Optative mood, one further step from reality than subjunctive, the mood of wish or desire."),

        new GrammarRule("Optative active present paradigm:\n" +
            "     Stem  tense     mood       personal form\n" +
            "           formative formative  ending\n" +
            "1sg  λυ              οι         μι       λύοιμι\n" +
            "2sg  λυ              οι         ς        λύοις\n" +
            "3sg  λυ              οι         ι        λύοι\n" +
            "1pl  λυ              οι         μεν      λύοιμεν\n" +
            "2pl  λυ              οι         τε       λύοιτε\n" +
            "3pl  λυ              οι         νσι      λύοιεν\n"),

        new GrammarRule("Optative active aorist paradigm:\n" +
            "     Stem  tense     mood       personal form\n" +
            "           formative formative  ending\n" +
            "1sg  λυ    σα        ι          μι       λύσαιμι\n" +
            "2sg  λυ    σα        ι          ς        λύσαις\n" +
            "3sg  λυ    σα        ι          ι        λύσαι\n" +
            "1pl  λυ    σα        ι          μεν      λύσαιμεν\n" +
            "2pl  λυ    σα        ι          τε       λύσαιτε\n" +
            "3pl  λυ    σα        ι          νσι      λύσαιεν\n"),

        new GrammarRule("Optative middle/passive present paradigm:\n" +
            "     Stem  tense     mood       personal form\n" +
            "           formative formative  ending\n" +
            "1sg  λυ              οι         μαι      λυοίμην\n" +
            "2sg  λυ              οι         σαι      λύοιο\n" +
            "3sg  λυ              οι         ται      λύοιτο\n" +
            "1pl  λυ              οι         μεθα     λυοίμεθα\n" +
            "2pl  λυ              οι         σθε      λύοισθε\n" +
            "3pl  λυ              οι         νται     λύοιντο\n"),

        new GrammarRule("Optative middle aorist paradigm:\n" +
            "     Stem  tense     mood       personal form\n" +
            "           formative formative  ending\n" +
            "1sg  λυ    σα        ι          μαι      λυσαίμην\n" +
            "2sg  λυ    σα        ι          σαι      λύσαιο\n" +
            "3sg  λυ    σα        ι          ται      λύσαιτο\n" +
            "1pl  λυ    σα        ι          μεθα     λυσαίμεθα\n" +
            "2pl  λυ    σα        ι          σθε      λύσαισθε\n" +
            "3pl  λυ    σα        ι          νται     λύσαιντο\n"),

        new GrammarRule("Optative passive aorist paradigm:\n" +
            "     Stem  tense     mood       personal form\n" +
            "           formative formative  ending\n" +
            "1sg  λυ    θε        ιη                  λυθείην\n" +
            "2sg  λυ    θε        ιη         ς        λυθείης\n" +
            "3sg  λυ    θε        ιη         ι        λυθείη\n" +
            "1pl  λυ    θε        ιη         μεν      λυθείημεν\n" +
            "2pl  λυ    θε        ιη         τε       λυθείητε\n" +
            "3pl  λυ    θε        ιη         νσι      λυθείησαν\n"),

        new GrammarRule("The function of the article in Greek is not to make something definite\n" +
            "(note the use of the article with proper names, which are by definition definite).\n" +
            "Rather its presence emphasizes identity.  This can be:\n" +
            " * anaphoric: where the article refers back to a previous reference:\n" +
            "   κήρυξον τὸν λόγον preach the word (referring back to discussion in 2 Tim 3\n" +
            " * deictic: the article points out someone or something present and often is best translated as a demonstrative:\n" +
            "   προσῆλθον αὐτῷ οἱ μαθηταί λὲγοντες ἔρημός ἐστιν _ὁ_ τόπος The disciples came to him and said, '_This_ place is " +
            "desolate'\n" +
            " * par excellence: the article identifies a substantive as in a class by itself:\n" +
            "   ὁ προφήτης εἶ σύ; Are you the Prophet?"),

        new GrammarRule("The function of the article in Greek is not to make something definite\n" +
            "Rather its presence emphasizes identity.  This can be:\n" +
            " * monadic:  the article identifies a substantive as unique:\n" +
            "   ἴδε ὁ ἀμνος τοῦ θεοῦ Behold, the lamb of God\n" +
            " * the article can turn a participle or adjective into a noun\n" +
            "   Πᾶς _ὁ γεγεννημένος_ ἐκ τοῦ θεοῦ Everyone _who has been born of God_\n" +
            " * the article can function as a personal, possessive, or relative pronoun\n" +
            "   Οἱ δὲ εἶπαν πρὸς αὐτόν And they said to him\n" +
            "   Οἱ ἄνδρες, ἀγαπᾶτε _τὰς_ γυναῖκας Husbands, love _your_ wives\n" +
            "Article can function as a grammatical marker:\n" +
            "μετά τῶν ἀγγελων _τῶν_ ἁγίων with the holy angels"),

        new GrammarRule("When the article is not present, it is generally emphasizing the quality of the substantive:\n" +
            "ὁ θεὸς ἀγάπη ἐστίν God is love (focusing not on that God loves, but that he is the very essence of love\n" +
            "Article also not used when the substantive is not specific"),

        new GrammarRule("Koine Greek is VSO")


        // Continue with 36.5 page 334
        // Figure out what to do with 25.23


    );
  }
}
