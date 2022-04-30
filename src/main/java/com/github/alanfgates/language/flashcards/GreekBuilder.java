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
        new GrammarRule("Nouns rules: 1/2\n" +
            "1. Stems ending in α or η are in the first declension, stems ending in ο are in the second, and\n" +
            "   consonantal stems are in the third.\n" +
            "2. Every neuter word has the same form in the nominative and accusative.\n" +
            "3. Almost all neuter words end in α in the nominative and accusative plural.\n" +
            "4. In the dative singular, the ι subscripts if possible.\n" +
            "5. Vowels often change their length ('ablaut’).\n" +
            "6. In the genitive and dative, the masculine and neuter will always be identical.\n" +
            "8. A tau cannot stand at the end of the word and will drop off"),

        new GrammarRule("Nouns rules: 2/2\n" +
            "7. Square of stops\n" +
            "   Labial           Unvoiced π  Voiced β  Aspirates φ  Labial + σ = ψ\n" +
            "   Velar (Palatals) Unvoiced κ  Voiced γ  Aspirates χ  Velar + σ = ξ\n" +
            "   Dental           Unvoiced τ  Voiced δ  Aspirates θ  Dental + σ = σ"),

        new GrammarRule("Uses of Genitive 1/2\n" +
            " * descriptive: Let us put on the armor of light ενδυσμεθα τα οπλα του φωτος\n" +
            " * possessive\n" +
            " * showing apposition to the head noun: You will receive the gift, the Holy Spirit\n" +
            "   λημψεσθε την δωρεαν του αγιου πνευματος\n" +
            " * showing separation from the head noun: being alienated from the commonwealth of\n" +
            "   Israel απελλοτριωμενοι της πολιτειας του Ισραηλ\n" +
            " * subjective, expanding on the idea of the head noun: Who will separate us from\n" +
            "   Christ’s love τισ ημας χωρισει απο της αγαπης του Χπριστου"),

        new GrammarRule("Uses of Genitive 2/2\n" +
            " * objective, receiving the action of the head noun: The blasphemy against the\n" +
            "   Spirit will not be forgiven η του πνευματος βλασφημια ουκ αφεθησεται\n" +
            " * plenary, being both subjective and objective: For the love of Christ compels us\n" +
            "   η γαρ αγαπη του Χριστου συνεχει ημας\n" +
            " * relationship: Simon, son of John Σιμων Ιωαννου\n" +
            " * partitive, where the subject is a part of the whole, which is genitive: some of\n" +
            "   the branches τινες των κλαδων"),

        new GrammarRule("Uses of Dative 1/3\n" +
            " * Dative Proper (‘to’)\n" +
            " * indirect object: He has given him authority to execute judgment εξουσιαν εδωκεν\n" +
            "   αυτῳ κρισιν ποιεν\n" +
            " * dative of interest, expression “for”:  Your wife Elizabeth will bear a son for\n" +
            "   you η γυνη σου Ελισαβετ γεννησει υιον σοι (called the “dative of advantage” when\n" +
            "   the idea is to the subject’s advantage and “dative of disadvantage” when the idea\n" +
            "   is not to the subject’s advantage)\n" +
            " * reference or respect (English, with respect to): Consider yourselves dead to sin\n" +
            "   λογιζεσθε εαυτους ειναι νεκρους τῃ αμαρτιᾳ"),

        new GrammarRule("Uses of Dative 2/3\n" +
            " * Locative (‘in’, ‘with’)\n" +
            " * sphere or realm in which something occurs: Blessed are the pure in heart μακαριοι\n" +
            "   οι καθαροι τῃ καρδιᾳ\n" +
            " * A time designation in the dative specifies when something occurs: On the third\n" +
            "   day he will be raised τῃ τριτῃ ημερα εγερθησεται\n" +
            " * Association, indicating “with”: Do not be unequally yoked with unbelievers μη\n" +
            "   γινεσθε ετεροζυγουντες απιστοις"),

        new GrammarRule("Uses of Dative 3/3\n" +
            " * Instrumental (‘by’)\n" +
            " * The manner in which something is done: He speaks boldly παρρησιᾳ λαλει\n" +
            " * The means or instrument by which an action is accomplished:  For it is by grace\n" +
            "    you have been saved Τῃ γαρ χαριτι εστε σεσωσμενοι"),

        new GrammarRule("Adjectives can be attributive, substantival, or predicative\n" +
            " * Attributive - gives a quality or attribute to the word it modifies: ο αγαθος\n" +
            "   λογος εστιν - in this situation adjective agrees with word it modifies in case,\n" +
            "   number, and gender.\n" +
            " * Substantival - when an adjective functions as a noun: ο αγαθος εστιν “the good\n" +
            "   (person) is” - in this situation case is determined by its function (subject,\n" +
            "   object, etc.) its gender and number by what it stands for.\n" +
            " * Predicate - asserts (predicates) something about the subject. ο ανθρωπος αγαθος\n" +
            "   verb ειμι may be implied"),

        new GrammarRule("Determining adjective function: \n" +
            " * If there is an article immediately before the adjective, it is either attributive\n" +
            "   (if there is a noun to modify) or substantival.  In attributive case, adjective\n" +
            "   may be before or after the noun: ο αγαθος ανθρωπος or ο ανθρωπος ο αγαθος\n" +
            "  (Exception:  demonstrative pronouns are attributive without the article: ουτος ὁ ἀνθρωπος \"this man\")\n" +
            " * If the noun has an article and the adjective does not (called anarthrous) then\n" +
            "   the adjective is functioning as a predicate: ο ανθρωπος αγαθος\n" +
            " * When there is no article context is your only guide."),

        new GrammarRule("Adjective Declensions \n" +
            "2-1-2:  masculine and neuter in 2nd, feminine in 1st\n" +
            "3-1-3:  masculine and neuter in 3rd, feminine in 1st\n" +
            "2-2:    all in 2nd (masculine and feminine have same endings)\n" +
            "2-2 are listed in the lexicon with just 2nd declension masculine and neuter endings.\n" +
            "3-3:    all in 3rd (masculine and feminine have same endings)"),

        new GrammarRule("Article & a Prepositional Phrase \n" +
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

        new GrammarRule("Uses of article 1/2\n" +
            " 1. Definite article\n" +
            " 2. Attaching adjective to preceding noun μετα των αγγελων των αγιων\n" +
            " 3. Is often used with proper names and other nouns that English would not use it with\n" +
            " 4. Can be used with participle or adjective to make it into a noun."),

        new GrammarRule("Uses of article 2/2\n" +
            " 5. Is sometimes omitted when English would use it: Εν αρχη ην ο λογος\n" +
            " 6. Can function as a personal or possessive pronoun: Οι δε ειπαν προς αυτον And they said to him\n" +
            " 7. Can govern two nouns together, linking them:\n" +
            "    προσδεχομενοι την μακαριαν ελπιδα και επιφανειαν της δοξης του μεγαλου θεου και\n" +
            "      σωτηρος ημων Ιησου Χριστου\n" +
            "    waiting for our blessed hope, the appearing of the glory of our great God and\n" +
            "      Savior Jesus Christ."),

        new GrammarRule("The Three Uses of αὐτος \n" +
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

        new GrammarRule("Degrees of an adjective: \n" +
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

        new GrammarRule("Contract verbs are verbs that end in α, ε, or ο.  In the present and\n" +
            "imperfect tenses the final vowel contracts with the connecting vowel as follows: 1/2\n" +
            " * two like vowels combine to the associated long vowel\n" +
            " * two like vowels combine to the associated long vowel except\n" +
            "   * ο + ο = ου\n" +
            "   * ε + ε = ει\n" +
            " * (anything but ε) + ο = ω (commutative)\n" +
            " * ε + ο = ου (commutative)\n" +
            " * anything + ω = ω (commutative)"),

        new GrammarRule("Contract verbs are verbs that end in α, ε, or ο.  In the present and\n" +
            "imperfect tenses the final vowel contracts with the connecting vowel as follows: 2/2\n" +
            " * α + ε/η = α\n" +
            " * ε/η + α  = η\n" +
            " * α + ε + ι = ᾳ\n" +
            " * ε + α + ι = ῃ\n" +
            " * ο + ε + ι = οι\n" +
            " * Dipthongs:  if the contract vowel and the first vowel of the dipthong are the\n" +
            "   same, they combine to a single instance of the vowel.  Otherwise they contract.\n" +
            "   If the second vowel of the dipthong is a ι it subscripts if possible.\n"),

        new GrammarRule("A deponent verb is one that is middle or passive in form but active\n" +
            "in meaning.  It does not take a middle or passive meaning.\n" + 
            "Verbs can be deponent in one tense but not in another (e.g. ἔρχομαι is deponent in\n" +
            "the present but not in the aorist.)\n" +
            "75% of middle forms in the NT are deponent."),

        new GrammarRule("Separating γινομαι, γενναω and γινωσκω:\n" +
            " * γινομαι will always have a vowel between the γ and the ν.  Usually an ε.\n" +
            " * γενναω always has double ν and is completely regular.\n" +
            " * γινωσκω, except in the present tense, does not have a vowel between the γ and the ν."),

        new GrammarRule("Verb roots and stems: 1/3\n" +
            " * Pattern 1: root not modified.  Example: *ἀκου\n" +
            " * Pattern 2: different roots in different stems\n" +
            "   * Verbs that have second aorists are normally verbs that alter their\n" +
            "     root in the formation of their present tense stem.\n" +
            " * Pattern 3: verbs with roots ending in a liquid (λ, μ, ν, ρ)\n" +
            "   * Tense formative for future is εσ instead of just σ but σ often drops out\n" +
            "     when placed between two vowels resulting in future without σ.\n" +
            "     The contracted vowels always have a circumflex (except in 1st plural middle).\n" +
            "     For example: μεν + εσ + ω = μεν + ε + ω = μενῶ"),

        new GrammarRule("Common verb root modifications: \n" +
            " * When the present tense stem ends in ιζω or αζω the root generally ends in a\n" +
            "   dental (τ, δ, θ) *βαπτιδ -> βαπτιζω\n" +
            " * When the present tense stem ends in ασσω the root generally ends in a\n" +
            "   velar ( κ, γ, χ) *ταραχ -> ταρασσω\n" +
            " * When the present tense stem ends in a double consonant the root often ends in\n" +
            "   a single consonant: *βαλ -> βαλλω\n" +
            " * Some roots add a iota in the present stem: *αρ -> αἴρω\n" +
            " * Some roots add σκ or ισκ to form the present: *γνω -> γινωσκω\n" +
            " * Some stem vowels ablaut."),

        new GrammarRule("Augments for imperfect and aorist: 1/2\n" +
            "* If the word begins with a consonant, an ε is prepended.\n" +
            "* If the verb begins with a dipthong then either the first letter lengthens,\n" +
            "  and if the second letter is a ι it subscripts, or the verb does not show an augment."),

        new GrammarRule("Augments for imperfect and aorist: 2/2\n" +
            "* If the word begins with a vowel the vowel lengthens:\n" +
            "  α + ε = η\n" +
            "  ε + ε = η\n" +
            "  ο + ε = ω\n" +
            "  η + ε = η\n" +
            "  ι + ε = ι\n" +
            "  υ + ε = υ\n" +
            "  ω + ε = ω"),

        new GrammarRule("Base stems: \n" +
            "* Present stem (active, middle, passive)\n" +
            "* Future active stem (also used for middle)\n" +
            "* Aorist active stem (also used for middle)\n" +
            "* Perfect active stem\n" +
            "* Aorist passive stem\n" +
            "* Perfect middle/passive stem\n"),

        new GrammarRule("Tense stems used for other tenses: \n" +
            "* Imperfect tense built on present tense stem.\n" +
            "* Future passive built on aorist passive stem.\n" +
            "* Present participle built on present tense stem, aorist participle from aorist stem, perfect participle from perfect stem.\n" +
            "* Subjunctive present formed from present stem, aorist from aorist stem, perfect on the perfect stem.\n" +
            "* Infinitive present formed from present stem, aorist from aorist stem, perfect on the perfect stem.\n" +
            "* If verb is deponent in a stem, it will be deponent in other tenses built on that stem."),

        new GrammarRule("In a compound verb the augment comes after the preposition.\n" +
            "* If the preposition ends in a vowel it does not contract with the augment\n" +
            "  * Usually the final vowel of the preposition drops off.\n" +
            "  * Sometimes it remains but does not contract.\n" +
            "* When a compound verb with a preposition that ends in κ augments the κ\n" +
            "  changes to ξ."),

        new GrammarRule("Imperfect can describe: 1/2\n" +
            " * An ongoing action in the past (most common), called progressive, durative.\n" +
            "   ἐδιδασκεν τους μαθητας αυτου He was teaching his disciples\n" +
            " * Can place emphasis on the beginning of an action, called ingressive, inceptive.\n" +
            "   ἀγγελοι προσηλθον και διηκονουν αυτῳ Angles came and begin to minister to him\n" +
            " * Can stress the repetitive nature of an action, called iterative.\n" +
            "   ἠρχετο προσ αὐτον [the widow] kept coming to him"),

        new GrammarRule("Imperfect can describe: 2/2\n" +
            " * Used to desribe actions that occur regularly, called customary.\n" +
            "   Κατα δε ἑορτην _ἀπελυεν_ αὐτοις ἑνα δεσμιον\n" +
            "   Now at the feast _he used to release_ for them any one prisoner\n" +
            " * Can be used to describe a wish (voluntative)\n" +
            "   _ηὐχομην_ γαρ ἀναθεμα εἰναι αὐτος ἐγω\n" +
            "   For _I could wish_ that I myself were accursed\n" +
            " * Can be used to describe an attempt (conative)\n" +
            "   και ἐπορθουν αὐτην and I tried to destroy it\n" +
            " * Can describe something almost done (tendential)\n" +
            "   ὁ δε Ἰωαννης διεκωλυεν αὐτον John would have prevented him"),

        new GrammarRule("Aorist stems: \n" +
            " * In the active voice, a second aorist will always have a different stem from\n" +
            "   the present because the root will always have been modified to form the\n" +
            "   present stem.\n" +
            " * Almost always the second aorist stem is identical to the root.\n" +
            " * For first aorist the tense stem is normally identical to the present tense stem."),

        new GrammarRule("Aorist meaning: \n" +
            " * Aorist is undefined, just says that an action happened, nothing about when or\n" +
            "   how long.  It is often used for punctiliar (point in time) as in English\n" +
            "   past tense, but that is not always what it means.\n" +
            " * Aorist can refer to an action as a whole (constative)\n" +
            " * It can refer to the beginning of an action (ingressive)\n" +
            " * It can refer to a timeless truth (gnomic)\n" +
            " * It can refer to a future action that will certainly occur (proleptic)."),

        new GrammarRule("First aorist endings and verb types: \n" +
            " * Contract verbs lengthen the contract vowel before the tense formative:\n" +
            "   ἀγαπάω becomes ἠγάπησα\n" +
            " * Stems that end in a stop combine the stop with the sigma, as per the rules.\n" +
            " * Liquid verbs use α/ε as a tense formative rather than σα."),

        new GrammarRule("Perfect tense describes an action that was brought to completion\n" +
            "and whose effects are felt in the present (consummative, extensive).\n" +
            " * can be translated with have/has or present, e.g.\n" +
            "   τον δρομον τετεκεκα I have finished the race\n"+
            " * can also be intensive, stressing the resulting state of an action:\n" +
            "   ἀφεωνται σοι αἱ ἁμαρτιαι σου your sins are forgiven you"),

        new GrammarRule("Perfect tense reduplication: 1/2\n" +
            " * If the word starts with a single consonant, that consonant is doubled with\n" +
            "   and ε placed between.\n" +
            "   * φ goes to π   χ goes to κ    θ goes to τ\n" +
            " * If the word starts with a vowel or dipthong, the vowel is lengthened.\n" +
            "   * Dipthongs often do not change."),

        new GrammarRule("Perfect tense reduplication: 2/2\n" +
            " * If the word starts with two consonants, just the ε will usually be prepended,\n" +
            "   no reduplication.  Does not usually apply to words where λ or ρ are the second\n" +
            "   letter.\n" +
            " * Compound verbs reduplicate the verb portion of the word.\n" +
            " * Contract verbs lengthen their contract vowel (ending vowel).\n" +
            " * Second perfect has α instead of κα for the tense formative."),

        new GrammarRule("Middle voice: \n" +
            " * Indirect middle: the action of the verb in some way affects the subject.\n" +
            "   Example: ὁ Πιλατος ... λαβων ὕδωρ ἀπενιψατο τας χειρας\n" +
            "   Pilate took water and washed his hands.  Emphasizes Pilate's attempt to absolve himself.\n" +
            "   δεξασθε τον ἐμφυτον λογον receive the implanted word, receiving is something done for the self.\n" +
            " * Reflexive middle:  the subject does the action and receives it.\n" +
            "   Ἰουδας ... ἀπελθων ἀπηγξατο Judas went out and hung himself"),

        new GrammarRule("Pluperfect describes an action in the past that was completed and who's effect are felt in the past"),

        new GrammarRule("Participle aspect: \n" +
            " * Present participle describes a continuous action\n" +
            " * Aorist participle describes an action where the aspect is undefined\n" +
            " * Perfect participle describes a completed action with present effects\n" +
            " * Future participle describes an action that is intended, purposed, or expected."),

        new GrammarRule("Participle relative time:\n" +
            " * Present: describes an action occurring at the same time as the main verb\n" +
            " * Aorist: describes an action occurring before the main verb\n" +
            " * Aspect always trumps relative time."),

        // TODO Put Greek examples for the active and passive participles below.
        new GrammarRule("Participles have two basic types: \n" +
            " * Adverbial:  action described by the participle is primary directed towards the verb\n" +
            "   e.g.: While studying his Greek, Ian fell asleep\n" +
            "   If the participle is active, the word modified does the action of the participle\n" +
            "   If the participle is passive, the word modified receives the action of the participle\n" +
            "   Adverbial participles are always anarthrous (no article)\n" +
            " * Adjectival: action described by the participle modifies a noun or pronoun\n" +
            "   e.g.: The book lying on the floor belongs to Kathy"),

        new GrammarRule("Participles and other parts of speech:\n" +
            "* Participles do not have a subject and do not take personal endings\n" +
            "* Participles can take objects and prepositional phrases\n" +
            "* Participles are negated with μη"),

        new GrammarRule("Participal exegesis: 1/3\n" +
            "1. Temporal:  the aorist participle can describe an action occurring before the time\n" +
            "   of the finite verb, while the present participle can describe something happening\n" +
            "   at the same time as the action of the main verb:\n" +
            "   νηστεύσας ... ὕστερον ἐπείνασεν after fasting, ... he was hungry\n" +
            "   συναλιζόμενας παρήγγειλεν αὐτοις while staying with them he charged them.\n" +
            "2. Manner:  can indicate the manner in which the action of the finite verb occurs:\n" +
            "   ἀκουσας δε ὁ νεακισκος τον λογον ἀπηλθεν _λυπουμενος_\n" +
            "   When the young man heard this, he went away _sad_"),

        new GrammarRule("Participal exegesis: 2/3\n" +
            "3. Means:  can indicate the means by which the action of the finite verb occurs:\n" +
            "   κοπιωμεν _ἐργαζομενοι_ ταις ἰδιας χερσιν We toil _working_ with our own hands\n" +
            "4. Cause:  can indicate the cause or reason or ground of the action of the finite verb:\n" +
            "   ἠγαλλιασατο πανοικει _πεπιστευκως_ τῳ θεῳ\n" +
            "   He was filled with joy, along with his entire household, _because he had come to believe_ in God.\n" +
            "5. Conditional: can indicate a condition that must be fulfilled if the action of the\n" +
            "   finite verb is to be accomplished:\n" +
            "   παντα ὅσα ἄν αἰτηστε ... _πιστευοντες_ λημψεσθε\n" +
            "   And whatever you ask in prayer, you will receive, _if you have faith_"),

        new GrammarRule("Participal exegesis: 3/3\n" +
            "6. Concessive:  can indicate that the action of the finite verb is true despite the\n" +
            "   action of the participle:\n" +
            "   Και ὑμας _ὄντας_ νεκρους τοις παραπτωμασιν\n" +
            "   And _although you were dead_ in your transgressions\n" +
            "7. Purpose: can indicate the purpose of the finite verb (often translated as infinitive:\n" +
            "   ἄφες ἴδωμεν εἰ ἔρχεται Ἠλιας _σωσων_ αὐτον\n" +
            "   Wait! Let's see if Elijah comes _to save_ him\n" +
            "8. Result:  can indciate the result of the finite verb:\n" +
            "   ἵνα τους δυο κτισῆ ἐν αὐτῳ εἰς ἕνα καινον ἄνθρωπον _ποιων_ εἰρηνην\n" +
            "   In order to create in himself one new man out of the two, _thus making peace_"),

        new GrammarRule("Participles are often translated as indicatives for several reasons:\n" +
            "* Breaking up of long sentances (e.g. Eph 1:3-14 is one sentance in Greek)\n" +
            "* Greek likes aorist participle before the main verb where English prefers two\n" +
            "  finite verbs: εὐθυς _ἀφεντες_ τα δικτυα ἠκολουθησαν αὐτῳ\n" +
            "  Immediately _they left_ their nets and followed him."),

        new GrammarRule("Participle declensions: \n" +
            "* feminine participle always uses 1st declension\n" +
            "* active masculine & neuter use 3rd declension\n" +
            "* middle/passive present masculine & neuter use 2nd declension\n" +
            "* middle aorist masculine & neuter use 2nd declension\n" +
            "* aorist passive use 3rd declension"),

        new GrammarRule("Adjectival participles can be: \n" +
            "* attributive - acting as an adjective\n" +
            "* substantival - acting as a noun"),

        new GrammarRule("Adverbial participle is always anarthrous (no definite article)\n" +
            "Adjectival participle is usually articular (has definite article)."),

        new GrammarRule("For both adverbial and adjectival participles, relative time still applies,\n" +
            "so aorist still implies the participle is describing someone/something that acted before the main verb."),

        new GrammarRule("An 'absolute' grammatical construction is one that is not grammatically\n" +
            "related to the rest of the sentance, that is it does not modify any other words in the sentance.\n" +
            "_ταυτα αὐτου λαλουντος_ πολλοι ἐπιστευσαν εἰς αὐτον\n" +
            "_While he was saying these things_ many believed in him\n" +
            "This is called a genitive absolute (I assume because the participle is in the genitive case)\n" +
            "The genitive absolute can have a 'subject' such as he in the above example and object\n" +
            "such as these things in the above, or other modifiers"),

        new GrammarRule("Subjunctive describes possibility or probability.\n" +
            "Subjunctive has aspect, so present tense indicates continuous action while aorist indicates undefined.\n" +
            "Perfect subjunctive (very rare) indicates completed action with continuing consequences."),

        new GrammarRule("οὐ μή plus subjunctive indicates emphatic denial of a future possibility, e.g. Jesus'\n" +
            "words in Jn 10:28 οὐ μή ἀπόλωνται they [his sheep] will by no means perish."),

        new GrammarRule("Uses of the subjunctive: 1/3\n" +
            "* Possibility or probability.\n" +
            "* Hortatory: first person subjunctive, usually at the beginning of the sentance and plural:\n" +
            "    _διέλθωμεν_ εἰς τό πέραν _let us to across_ to the other side\n" +
            "* Deliberative, when the answer to a question is uncertain: τί φάγωμεν what should we eat?"),

        new GrammarRule("Uses of the subjunctive: 2/3\n" +
            "* ἵνα is almost always followed by the subjunctive, can indicate purpose:\n" +
            "  τίς σοι ἔδωκεν τήν ἐξουσίαν ταύτην ἵνα ταῦτα _ποιῇς_;\n" +
            "  Who gave you authority that _you do_ these things? \n" +
            "* Can also indicate content of the preceeding verb:\n" +
            "  ἐκήρθξαν ἵνα μετανοῶσιν they preached that they should repent\n" +
            "* ἵνα μή plus subjunctive can be translated as 'lest'\n" +
            "  οἱ πατέπρες, μή ἐρεθίζετε τὰ τέκνα ὑμῶν, _ἵνα μή ἀθυμῶσιν_\n" +
            "  Fathers, do not provoke your children, _lest they become discouraged_"),

        new GrammarRule("Uses of the subjunctive: 3/3\n" +
            "* Conditional statements introduced by ἐάν.  If (protasis) is in subjunctive, then (apodosis) any tense or mood.\n" +
            "  Can be future event: ταῦτα σοι πάντα δώσω, ἐάν πεσὼν _προσκυνήσῃς_ μοι\n" +
            "                       All these things I will give you, if you will fall down and _worship_ me\n" +
            "  Can be a timeless truth: ἐάν _θέλῃς_ δύνασαί με καθαρίσαι\n" +
            "                           if _you want_ you can make me clean"),

        new GrammarRule("ἴνα, ἕως, and most words that include ἄν are usually followed by a subjunctive:\n" +
            "  ὄταν (whenever) ἐάν (if) ὄς ἄν (whoever) ὅπου ἄν (whenever)\n" +
            "Subjunctive negated with μή"),

        new GrammarRule("Three ways to ask a question: \n" +
            "1. No indication is given as to the answer expected:\n" +
            "   σύ εἶ ὁ βασιλεύς τῶν Ἰουδαίων; Are you the king of the Jews?\n" +
            "2. If the question begins with (not just contains) οὐ the inquistor expects a positive answer:\n" +
            "   Διδάσκαλε, οὐ μέλει σοι ὅτι ἀπολλύμεθα Teacher, do you not care that we are perishing?\n" +
            "3. If the question being with μή the inquistor expects a negative answer:\n" +
            "   μή πάντες ἀπόστολοι;  Are all apostles?"),

        new GrammarRule("* Infinitive is a verbal noun.\n" + 
            "* Infinitive is viewed as singular neuter and can take a definite article in singular neuter, the case\n" +
            "   of which is determined by the function of the infinitive in the sentance.\n" +
            "* Infinitive can have a direct object and adverbial modifiers."),

        new GrammarRule("Infinitive 'tenses': 1/3\n" +
            "* present: continuous Οὐδεὶς δύναται δυσὶ κυρίος δουλεύειν No one is able to serve two masters.\n" +
            "* aorist: undefined μὴ φοβηθῇς παραλαβειν Μαρίαν τὴν γυναῖκά σου Do not be afraid to take Mary as your wife\n" +
            "* perfect: completed ἤκουσαν τοῦτο αὐτὸν πεποιηκέναι τὸ σημεῖον They heard he had done this sign"),

        new GrammarRule("Infinitives cannot take a subject (that's what infinite means in this context), but\n" +
            "they will sometimes have a noun in the accusative that acts like a subject:\n" +
            "οὐκ ἤφιεν λαλεῖν τὰ δαιμόνια literally: he would not permit to speak the demons,\n" +
            "better English: he would not permit the demons to speak."),

        new GrammarRule("Since infinitive can take direct object (which is in accusative) there are cases of\n" +
            "infinitive with two nouns in accusative,\n" +
            "Usually the 'subject' is first the object second:\n" +
            "βλέπειν αὐτὸν αὐτήν he to see her"),

        new GrammarRule("Uses of infininitive: \n" +
            "* as a substantive; is usually proceeded by the definite article, in which\n" +
            "  case it is called articular infinitive.  Best translated with 'to':\n" +
            "  ἐμοι _το ζην_ Χριστος και _το ἀποθανειν_ κερδος\n" +
            "  Literally: for me the live Christ and the die gain, better: for me to live is Christ, and to die is gain\n" +
            "* to complete a finite verb and are called 'complementary infinitive':\n" +
            "  ἤρξαντο λαλειν ἑτερπαις γλωσσαις They begin to speak in tongues\n" +
            "* δει, ἐξεστιν (it is lawful), μελλω, δυναμαι, ἀρχομαι will always be followed by an infinitive\n" +
            "* to report indirect discourse."),

        new GrammarRule("Infinitive and prepositions: 1/2\n" +
            "* δια plus article in the accusative plus infinitive means 'because', indicates reason\n" +
            "  αὐτος δε Ἰησους ουκ ἐπιστευεν αὐτον αὐτοις _δια το αὐτον γινωσκειν_ παντες\n" +
            "  But Jesus on his part did not entrust himself to them, _because he knew_ all people\n" +
            "* εις or προς plus article in the accusative plus infinitive means 'in order that', indicates purpose\n" +
            "  παραδοσουσιν αὐτον τοις ἐθνεσιν _εις το ἐμπαιξαι και μαστιγωσαι και σταυρωσαι_\n" +
            "  They will deliver him over to the Gentiles _to be mocked and flogged and crucified_\n" +
            "  Purpose can also be expressed with no preposition and article in genitive\n" +
            "* προ plus article in genitive plus infinitive means 'before'"),

        new GrammarRule("Infinitive and prepositions: 2/2\n" +
            "* ἐν plus article in dative plus infinitive means 'when' or 'while'\n" +
            "* μετα plus article in accusative plus infinitive means 'after'\n" +
            "  ἐν τῳ σπειρειν αὐτον ἁ μεν ἐπεσεν παρα την ὁδον As he sowed some seeds fell along the path\n" +
            "* ὡστε plus infinitive indicates result:\n" +
            "  ἐπλησαν ἀμφοτερα τα πλοια _ὡστε βυθιζεσθαι_ αὐτα They filled both boats so full that they began to sink"),

        new GrammarRule("Imperative conveys command or request (as in 'give us this day our daily bread').\n" +
            "Present imperative conveys a continuous command or a general precept (always ...)\n" +
            "Aorist applies to a particular situation."),

        new GrammarRule("Forms of negation: \n" +
            " * οὐ with future indicative = simple negation\n" +
            "   οὐ μοιχεύσεις you shall not commit adultery\n" +
            " * οὐ μή plus aorist subjunctive = very strong no\n" +
            "   οἱ λόγοι μου οὐ παρέλθωσιν  My words will by no means [or never, but without time reference] pass away\n" +
            " * μή plus present imperative = prohibiting a continuous action\n" +
            "   μή μεριμνᾶτε τῇ ψυχῇ ὑμῶν do not worry about your life\n" +
            " * μή plus aorist imperative = prohibiting an undefined action\n" +
            " * μή plus aorist subjunctive = stronger form of no than οὐ plus indicative\n" +
            "   μή φοβηθῇς παραλαβεῖν Μαρῖαν τὴν γυναῖκά σου Do not be afraid to take Mary home as your wife"),


        new GrammarRule("Standard verb conjugation (e.g. λυω) is called thematic.  Verbs ending in μι are called athematic.\n" +
            "(because the connecting vowel is called the thematic vowel and athematic verbs lack a thematic vowel)."),

        new GrammarRule("Athematic verb rules \n" +
            "* 1: they reduplicate their initial stem letter to form the present, inserting a ι between.\n" +
            "  (This appears to apply to the imperfect as well, I assume because the imperfect is formed from the present stem)\n" +
            "* 2: they do not ordinarily use a connecting vowel in the present indicative.\n" +
            "* 3: the stem vowel will often lengthen, shorten, or drop out (e.g. δο to διδωμι)\n" +
            "* 4: most use κα as the tense formative in the aorist."),

        new GrammarRule("Athematic verbs use different personal endings in present active indicative, but the same endings\n" +
            "    everywhere else, e.g.: *δο\n" +
            "    1sg  διδω    μι         δίδωμι\n" +
            "    2sg  διδω    ς          δίδως\n" +
            "    3sg  διδω    σι         δίδωσι(ν)\n" +
            "    1pl  διδο    μεν        δίδομεν\n" +
            "    2pl  διδο    τε         δίδοτε\n" +
            "    3pl  διδο    ασι        διδόασι(ν)"),

        new GrammarRule("Exceptions to a verb uses first aorist or second aorist only: \n" +
            "δίδωμι uses first aorist in indicative and second aorist for other moods\n" +
            "ἵστημι uses both, first aorist ἔστησα for transitive and second aorist ἔστην for intransitive."),

        new GrammarRule("Conditional senatances, if then:  if called protasis, then apodosis 1/3\n" +
            "  * First class conditional, aka conditions of fact:  assume something is true for argument (it may or \n" +
            "    may not be), then the apodosis must be true:\n" +
            "    protasis: εἰ + indicative any tense; apodosis: any mood, any tense; negated by οὐ\n" +
            "    εἰ δέ ἀνάστασις νεκρῶν οὐκ ἔστιν, οὐδὲ Χριστὸς ἐγήγερται\n" +
            "    But if there is no ressurection of the dead, then not even Christ has been raised."),

        new GrammarRule("Conditional senatances, if then:  if called protasis, then apodosis 2/3\n" +
            "  * Second class conditional, aka contrary to fact:  if something were true, which it isn't, then\n" +
            "    something else would be true.\n" +
            "    protasis: εἰ + indicative past tense; apodosis: ἄν plus same tense as protasis; negated by μή\n" +
            "    εἰ γάρ ἔγνωσαν, ούκ ἂν τὸν κύριον τῆς δόξης ἐσταύπωσαν\n" +
            "    For if they had known, they would not have crucified the Lord of glory"),

        new GrammarRule("Conditional senatances, if then:  if called protasis, then apodosis 3/3\n" +
            "  * Third class conditional, future more probable (something might be true in the future)\n" +
            "    or present general (generally true at all times)\n" +
            "    protasis: ἐάν + subjunctive; apodosis: any mood, any tense; negated by μή\n" +
            "    Future more probable: ταῦτα σοι πάντα δώσω, ἐάν πεσὼν _προσκυνήσῃς_ μοι\n" +
            "    All these things I will give you, if you will fall down and _worship_ me\n" +
            "    present general: ἐάν _θέλῃς_ δύνασαί με καθαρίσαι\n" +
            "    if _you want_ you can make me clean\n"),

        new GrammarRule("Optative mood, one further step from reality than subjunctive, the mood of wish or desire."),

        new GrammarRule("The function of the article in Greek is not to make something definite\n" +
            "Rather its presence emphasizes identity.  This can be:  1/2\n" +
            " * anaphoric: where the article refers back to a previous reference:\n" +
            "   κήρυξον τὸν λόγον preach the word (referring back to discussion in 2 Tim 3\n" +
            " * deictic: the article points out someone or something present and often is best translated as a demonstrative:\n" +
            "   προσῆλθον αὐτῷ οἱ μαθηταί λὲγοντες ἔρημός ἐστιν _ὁ_ τόπος The disciples came to him and said, '_This_ place is desolate'\n" +
            " * par excellence: the article identifies a substantive as in a class by itself:\n" +
            "   ὁ προφήτης εἶ σύ; Are you the Prophet?\n" +
            " * monadic:  the article identifies a substantive as unique:\n" +
            "   ἴδε ὁ ἀμνος τοῦ θεοῦ Behold, the lamb of God\n" +
            " * can turn a participle or adjective into a noun\n" +
            "   Πᾶς _ὁ γεγεννημένος_ ἐκ τοῦ θεοῦ Everyone _who has been born of God_"),

        new GrammarRule("The function of the article in Greek is not to make something definite\n" +
            "Rather its presence emphasizes identity.  This can be:  2/2\n" +
            " * can function as a personal, possessive, or relative pronoun\n" +
            "   Οἱ δὲ εἶπαν πρὸς αὐτόν And they said to him\n" +
            "   Οἱ ἄνδρες, ἀγαπᾶτε _τὰς_ γυναῖκας Husbands, love _your_ wives\n" +
            " * can function as a grammatical marker:  μετά τῶν ἀγγελων _τῶν_ ἁγίων with the holy angels\n" +
            " * When the article is not present, it is generally emphasizing the quality of the substantive:\n" +
            "   ὁ θεὸς ἀγάπη ἐστίν God is love (focusing not on that God loves, but that he is the very essence of love\n" +
            " * also not used when the substantive is not specific"),

        new GrammarRule("Koine Greek is VSO"),

        // From Greek Grammar Beyond the Basics, Wallace

        new GrammarRule("Break down of case based words in the the NT:\n" +
            "               Total    Percentage    Nouns    Pronouns    Articles     Participles    Adjectives\n" +
            "Nominative    24,618            31     7794        3145        6009            4621          3049\n" +
            "Genitive      19,613            25     7681        4986        5028             743          1195\n" +
            "Dative        12,173            15     4375        3565        2944             353           936\n" +
            "Accusative    23,105            29     8815        5009        5889             957          2435\n" +
            "Vocative         317            <1      292           0           0               1            24\n"),

        new GrammarRule("Predicate Nominative:\n" +
            "* Usually used with verbs εἰμί, γίνομαι, ὑπάρχω but can occur with some transitive verbs in passive as well.\n" +
            "* Most commonly asserts that subject is a subset of predicate nominative:\n" +
            "  Ὁ λόγος γάρ ὁ τοῦ σταυροῦ τοῖς μὲν ἀπολλθμένοις μωρία ἐστιν\n" +
            "  'The word of the cross is foolishness' means the this teaching is a foolish teaching, not that all foolish teaching\n" +
            "  is the word the of cross.\n" +
            "* Less frequenty it indicates equality: οὗτος ἐστιν ὁ υἱός ὁ ἀγαπητός This is my beloved son\n" +
            "* Since Greek is not as word order dependent as English, subject does not have to come first.\n" +
            "* Εἰς plus accusative occasionally replaces predicate nominative.  This is based on Hebrew usage and is most often\n" +
            "  found in LXX quotes."),

        new GrammarRule("Distinguishing subject in predicate nominative:\n" +
            "  In general, the subject is the known entity.  This knownness can be marked in three ways:\n" +
            "  * The subject will be a pronoun or implied in the verb:  οὗτος ἐστιν ὁ υἱός ὁ ἀγαπητός\n" +
            "  * The subject will be articular:  πνεῦμα ὁ θεός\n" +
            "  * The subject will be a proper name.\n" +
            "  * If both nouns are so marked, pronouns have the greatest priority.  This generally marks an equality condition\n" +
            "    as opposed to a subset condition."),

        new GrammarRule("Nominative in Simple Apposition:\n" +
            "An appositional construction involves two adjacent substantives in the same case which refer to the same person or\n" +
            "  thing and have the same syntatical relation to the rest of the clause.\n" +
            "ὁ μάρτθσ ὁ πιστός, -ὁ πρωτότοκος- τῶν νεκρῶν the faithful witness, -the firstborn- from the dead."),

        new GrammarRule("When the first noun in an appositional construction is a proper name it is generally anarthrous and\n" +
            "the appositional noun is articular:  ἐν ἇις καὶ Μαρία -ἡ Μαγδαληνή- among them also was Mary -the Magdalene-."),

        new GrammarRule("Nominative Absolute:\n" +
            "(subcase of independent nominative, meaning the substantive is grammatically unrelated to the rest of the sentance.)\n" +
            "The use of the nominative case in introductory material (such as titles, headings, salutations, and addresses)\n" +
            "which are not to be construed as sentences.\n" +
            "-Ἀρχὴ- τοῦ εὐαγγελίου Ἰησοῦ Χριστοῦ\n" +
            "-Παῦλος- δοῦλος Χριστοῦ Ἰησοῦ")/*,

        new GrammarRule("Nominativus Pendens:\n" +
            "(subcase of independent nominative, meaning the substantive is grammatically unrelated to the rest of the sentance.)\n" +
            ""),  // TODO fill out, p 51

        new GrammarRule("Parenthetic Nominative:\n" +
            "(subcase of independent nominative, meaning the substantive is grammatically unrelated to the rest of the sentance.)\n" +
            ""),  // TODO fill out, p 53

        new GrammarRule("Nominative in Proverbial Expressions:\n" +
            "(subcase of independent nominative, meaning the substantive is grammatically unrelated to the rest of the sentance.)\n" +
            ""),  // TODO fill out, p 54

        new GrammarRule("Nominative for Vocative (aka Nominative of Address):\n" +
            "(subcase of independent nominative, meaning the substantive is grammatically unrelated to the rest of the sentance.)\n" +
            ""),  // TODO fill out, p 56

        new GrammarRule("Nominative of Exclamation:\n" +
            "(subcase of independent nominative, meaning the substantive is grammatically unrelated to the rest of the sentance.)\n" +
            "")  // TODO fill out, p 59
         */



    );
  }
}
