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
    List<GrammarRule> allRules = new ArrayList<>();
    allRules.addAll(new GrammarRuleSet("Noun rules",
        "1. Stems ending in α or η are in the first declension, stems ending in ο are in the second, and consonantal " +
            "stems are in the third.",
        "2. Every neuter word has the same form in the nominative and accusative.",
        "",
        "3. Almost all neuter words end in α in the nominative and accusative plural.",
        "4. In the dative singular, the ι subscripts if possible.",
        "5. Vowels often change their length ('ablaut’).",
        "6. In the genitive and dative, the masculine and neuter will always be identical.",
        "7. Square of stops\n" +
            "  Labial           Unvoiced π  Voiced β  Aspirates φ  Labial + σ = ψ\n" +
            "  Velar (Palatals) Unvoiced κ  Voiced γ  Aspirates χ  Velar + σ = ξ\n" +
            "  Dental           Unvoiced τ  Voiced δ  Aspirates θ  Dental + σ = σ",
        "8. A tau cannot stand at the end of the word and will drop off"
    ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Uses of Genitive ",
        "descriptive: Let us put on the armor of light ενδυσμεθα τα οπλα του φωτος",
        "possessive",
        "showing apposition to the head noun: You will receive the gift, the Holy Spirit\n" +
            "  λημψεσθε την δωρεαν του αγιου πνευματος",
        "showing separation from the head noun: being alienated from the commonwealth of\n" +
            "   Israel απελλοτριωμενοι της πολιτειας του Ισραηλ",
        "subjective, expanding on the idea of the head noun: Who will separate us from\n" +
            "   Christ’s love τισ ημας χωρισει απο της αγαπης του Χπριστου",
        "objective, receiving the action of the head noun: The blasphemy against the\n" +
            "   Spirit will not be forgiven η του πνευματος βλασφημια ουκ αφεθησεται",
        "plenary, being both subjective and objective: For the love of Christ compels us\n" +
            "   η γαρ αγαπη του Χριστου συνεχει ημας",
        " * relationship: Simon, son of John Σιμων Ιωαννου",
        " * partitive, where the subject is a part of the whole, which is genitive: some of\n" +
            "   the branches τινες των κλαδων").toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Uses of Dative 1/3",
        "Dative Proper (‘to’)",
        "indirect object: He has given him authority to execute judgment εξουσιαν εδωκεν\n" +
            "   αυτῳ κρισιν ποιεν",
        "dative of interest, expression “for”:  Your wife Elizabeth will bear a son for\n" +
            "   you η γυνη σου Ελισαβετ γεννησει υιον σοι (called the “dative of advantage” when\n" +
            "   the idea is to the subject’s advantage and “dative of disadvantage” when the idea\n" +
            "   is not to the subject’s advantage)",
        "reference or respect (English, with respect to): Consider yourselves dead to sin\n" +
            "   λογιζεσθε εαυτους ειναι νεκρους τῃ αμαρτιᾳ",
        "Locative (‘in’, ‘with’)",
        "sphere or realm in which something occurs: Blessed are the pure in heart μακαριοι\n" +
            "   οι καθαροι τῃ καρδιᾳ",
        "A time designation in the dative specifies when something occurs: On the third\n" +
            "   day he will be raised τῃ τριτῃ ημερα εγερθησεται",
        "Association, indicating “with”: Do not be unequally yoked with unbelievers μη\n" +
            "   γινεσθε ετεροζυγουντες απιστοις",
        "Instrumental (‘by’)",
        "The manner in which something is done: He speaks boldly παρρησιᾳ λαλει",
        "The means or instrument by which an action is accomplished:  For it is by grace\n" +
            "    you have been saved Τῃ γαρ χαριτι εστε σεσωσμενοι"
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Adjectives",
        "Adjectives can be attributive, substantival, or predicative",
        "Attributive - gives a quality or attribute to the word it modifies: ο αγαθος\n" +
          "   λογος εστιν - in this situation adjective agrees with word it modifies in case,\n" +
          "   number, and gender.",
        "Substantival - when an adjective functions as a noun: ο αγαθος εστιν “the good\n" +
          "   (person) is” - in this situation case is determined by its function (subject,\n" +
          "   object, etc.) its gender and number by what it stands for.",
        "Predicate - asserts (predicates) something about the subject. ο ανθρωπος αγαθος\n" +
          "   verb ειμι may be implied",
        "If there is an article immediately before the adjective, it is either attributive\n" +
          "   (if there is a noun to modify) or substantival.  In attributive case, adjective\n" +
          "   may be before or after the noun: ο αγαθος ανθρωπος or ο ανθρωπος ο αγαθος\n" +
          "  (Exception:  demonstrative pronouns are attributive without the article: ουτος ὁ ἀνθρωπος \"this man\")",
        "If the noun has an article and the adjective does not (called anarthrous) then\n" +
          "   the adjective is functioning as a predicate: ο ανθρωπος αγαθος",
        "When there is no article context is your only guide."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Adjective Declensions",
        "2-1-2:  masculine and neuter in 2nd, feminine in 1st",
        "3-1-3:  masculine and neuter in 3rd, feminine in 1st",
        "2-2:    all in 2nd (masculine and feminine have same endings)",
        "2-2 are listed in the lexicon with just 2nd declension masculine and neuter endings.",
        "3-3:    all in 3rd (masculine and feminine have same endings)"
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Degrees of an adjective",
        "Positive: uncompared e.g μεγας large",
        "Comparative: greater of two items: e.g. μειζων larger",
        "Superlative: greatest, or comparison of 3 or more e.g. μεγιστος largest\n" +
        "    where English would expect a superlative"
        ).toGrammarRules());

    allRules.add(new GrammarRule("Neuter Plural Subjects\n" +
        "Greek normally uses a singular verb when the subject is neuter plural.  Indicates\n" +
        "the writer is viewing the subject as a group rather than as individuals.  In English\n" +
        "this will require a plural verb:\n" +
        "  δοκιμαζετε τα πνευματα ει εκ του θεου εστιν\n" +
        "  Test the spirits and see if they are from God."));

    allRules.addAll(new GrammarRuleSet("Uses of article ",
        "Definite article",
        "Attaching adjective to preceding noun μετα των αγγελων των αγιων",
        "Is often used with proper names and other nouns that English would not use it with",
        "Can be used with participle or adjective to make it into a noun.",
        "Is sometimes omitted when English would use it: Εν αρχη ην ο λογος",
        "Can function as a personal or possessive pronoun: Οι δε ειπαν προς αυτον And they said to him",
        "Can govern two nouns together, linking them:\n" +
        "    προσδεχομενοι την μακαριαν ελπιδα και επιφανειαν της δοξης του μεγαλου θεου και\n" +
        "      σωτηρος ημων Ιησου Χριστου\n",
        "    waiting for our blessed hope, the appearing of the glory of our great God and\n" +
        "      Savior Jesus Christ."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("The function of the article in Greek is not to make something definite, \n",
        "Rather its presence emphasizes identity.",
        "anaphoric: where the article refers back to a previous reference:\n" +
        "   κήρυξον τὸν λόγον preach the word (referring back to discussion in 2 Tim 3",
        "deictic: the article points out someone or something present and often is best translated as a demonstrative:\n" +
        "   προσῆλθον αὐτῷ οἱ μαθηταί λὲγοντες ἔρημός ἐστιν _ὁ_ τόπος The disciples came to him and said, '_This_ place is desolate'",
        "par excellence: the article identifies a substantive as in a class by itself:\n" +
        "   ὁ προφήτης εἶ σύ; Are you the Prophet?\n",
        "monadic:  the article identifies a substantive as unique:\n" +
        "   ἴδε ὁ ἀμνος τοῦ θεοῦ Behold, the lamb of God",
        "can turn a participle or adjective into a noun\n" +
        "   Πᾶς _ὁ γεγεννημένος_ ἐκ τοῦ θεοῦ Everyone _who has been born of God_",
        "can function as a personal, possessive, or relative pronoun\n" +
        "   Οἱ δὲ εἶπαν πρὸς αὐτόν And they said to him\n" +
        "   Οἱ ἄνδρες, ἀγαπᾶτε _τὰς_ γυναῖκας Husbands, love _your_ wives",
        "can function as a grammatical marker:  μετά τῶν ἀγγελων _τῶν_ ἁγίων with the holy angels",
        "When the article is not present, it is generally emphasizing the quality of the substantive:\n" +
        "   ὁ θεὸς ἀγάπη ἐστίν God is love (focusing not on that God loves, but that he is the very essence of love",
        "also not used when the substantive is not specific"
    ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Articles can proceed prepositional phrases",
        "Usually turning them into relative clauses:\n" +
        "     τους παιδας τους εν βηθλεεμ\n" +
        "     The children who are in Bethlehem",
        "Sometimes turning it into a substantive: \n" +
        "     ελαλησαν τον λογον του κυριου πασιν τοις εν τῃ οικιᾳ\n" +
        "     They spoke the word of the Lord to all who were in the house "
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Three Uses of αὐτος ",
        " 1. Personal pronoun.",
        " 2. Adjectival intensive.  This is used to modify another word and is placed in the\n" +
        "    predicate position.  This is usually translated into English with a reflexive\n" +
        "    pronoun: αὐτος ὁ ἀποστολος the apostle himself.  When functioning as an intensive,\n" +
        "    αὐτος is usually in the nominative case and modifies the subject.",
        " 3. Identical adjective, meaning “the same”.  Usually in the attributive position.\n" +
        "    και παλιν απελθων προσηυξατο τον αυτον λογον",
        "    And again after going away he prayed the same word."
        ).toGrammarRules());

    allRules.add(new GrammarRule("The demonstratives οὑτος and ἐκεινος can be used as pronouns or\n" +
            "adjectives.  Can also be used as a personal pronoun at times."));

    allRules.add(new GrammarRule("ἀν used in conjunction with a relative pronoun makes it indefinite\n" +
            "e.g. ὅς who ὅς ἀν whoever"));

    allRules.add(new GrammarRule("Attraction: Occasionally the case of the relative pronoun is determined\n" +
            "not by its function in the relative clause but by its antecedent.  This usually\n" +
            "happens when it is in the immediate proximity of its antecedent, when the\n" +
            "antecedent is dative or genitive and the relative pronoun normally would be\n" +
            "accusative."));

    allRules.addAll(new GrammarRuleSet("Contract verbs are verbs that end in α, ε, or ο.  In the present and\n" +
        "  imperfect tenses the final vowel contracts with the connecting vowel as follows: ",
        " * two like vowels combine to the associated long vowel",
        " * two like vowels combine to the associated long vowel except\n" +
        "   * ο + ο = ου\n" +
        "   * ε + ε = ει\n",
        " * (anything but ε) + ο = ω (commutative)",
        " * ε + ο = ου (commutative)",
        " * anything + ω = ω (commutative)",
        " * α + ε/η = α",
        " * ε/η + α  = η",
        " * α + ε + ι = ᾳ",
        " * ε + α + ι = ῃ",
        " * ο + ε + ι = οι",
        " * Dipthongs:  if the contract vowel and the first vowel of the dipthong are the\n" +
        "   same, they combine to a single instance of the vowel.  Otherwise they contract.\n" +
        "   If the second vowel of the dipthong is a ι it subscripts if possible.\n"
        ).toGrammarRules());


    allRules.add(new GrammarRule("A deponent verb is one that is middle or passive in form but active\n" +
        "in meaning.  It does not take a middle or passive meaning.\n" +
        "Verbs can be deponent in one tense but not in another (e.g. ἔρχομαι is deponent in\n" +
        "the present but not in the aorist.)\n" +
        "75% of middle forms in the NT are deponent."));

    allRules.add(new GrammarRule("Separating γινομαι, γενναω and γινωσκω:\n" +
        " * γινομαι will always have a vowel between the γ and the ν.  Usually an ε.\n" +
        " * γενναω always has double ν and is completely regular.\n" +
        " * γινωσκω, except in the present tense, does not have a vowel between the γ and the ν."));

    allRules.addAll(new GrammarRuleSet("Verb roots and stems",
        "Pattern 1: root not modified.  Example: *ἀκου",
        "Pattern 2: different roots in different stems",
        "Verbs that have second aorists are normally verbs that alter their\n" +
        "     root in the formation of their present tense stem.",
        "Pattern 3: verbs with roots ending in a liquid (λ, μ, ν, ρ)",
        "Tense formative for future is εσ instead of just σ but σ often drops out\n" +
        "     when placed between two vowels resulting in future without σ.\n" +
        "     The contracted vowels always have a circumflex (except in 1st plural middle).\n" +
        "     For example: μεν + εσ + ω = μεν + ε + ω = μενῶ",
        "When the present tense stem ends in ιζω or αζω the root generally ends in a\n" +
        "   dental (τ, δ, θ) *βαπτιδ -> βαπτιζω",
        "When the present tense stem ends in ασσω the root generally ends in a\n" +
        "   velar (κ, γ, χ) *ταραχ -> ταρασσω",
        "When the present tense stem ends in a double consonant the root often ends in\n" +
        "   a single consonant: *βαλ -> βαλλω",
        "Some roots add a iota in the present stem: *αρ -> αἴρω",
        "Some roots add σκ or ισκ to form the present: *γνω -> γινωσκω",
        "Some stem vowels ablaut."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Augments for imperfect and aorist",
        "If the word begins with a consonant, an ε is prepended.",
        "If the verb begins with a dipthong then either the first letter lengthens,\n" +
        "  and if the second letter is a ι it subscripts, or the verb does not show an augment.",
        "If the word begins with a vowel the vowel lengthens:\n" +
        "  α + ε = η",
        "If the word begins with a vowel the vowel lengthens:\n" +
        "  ε + ε = η",
        "If the word begins with a vowel the vowel lengthens:\n" +
        "  ο + ε = ω",
        "If the word begins with a vowel the vowel lengthens:\n" +
        "  η + ε = η",
        "If the word begins with a vowel the vowel lengthens:\n" +
        "  ι + ε = ι",
        "If the word begins with a vowel the vowel lengthens:\n" +
        "  υ + ε = υ",
        "If the word begins with a vowel the vowel lengthens:\n" +
        "  ω + ε = ω"
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Base verb stems",
        "Present stem (active, middle, passive)",
        "Future active stem (also used for middle)",
        "Aorist active stem (also used for middle)",
        "Perfect active stem",
        "Aorist passive stem",
        "Perfect middle/passive stem"
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("In a compound verb the augment comes after the preposition.",
        "If the preposition ends in a vowel it does not contract with the augment\n" +
        "  Usually the final vowel of the preposition drops off.\n" +
        "  Sometimes it remains but does not contract.",
        "When a compound verb with a preposition that ends in κ augments the κ\n" +
        "  changes to ξ."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Tense stems used for other tenses",
        "Imperfect tense built on present tense stem.",
        "Future passive built on aorist passive stem.",
        "Present participle built on present tense stem, aorist participle from aorist stem, perfect participle from perfect stem.",
        "Subjunctive present formed from present stem, aorist from aorist stem, perfect on the perfect stem.",
        "Infinitive present formed from present stem, aorist from aorist stem, perfect on the perfect stem.",
        "If verb is deponent in a stem, it will be deponent in other tenses built on that stem."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Imperfect can describe",
        "An ongoing action in the past (most common), called progressive, durative.\n" +
        "   ἐδιδασκεν τους μαθητας αυτου He was teaching his disciples",
        "Can place emphasis on the beginning of an action, called ingressive, inceptive.\n" +
        "   ἀγγελοι προσηλθον και διηκονουν αυτῳ Angles came and begin to minister to him",
        "Can stress the repetitive nature of an action, called iterative.\n" +
        "   ἠρχετο προσ αὐτον [the widow] kept coming to him",
        "Used to desribe actions that occur regularly, called customary.\n" +
        "   Κατα δε ἑορτην _ἀπελυεν_ αὐτοις ἑνα δεσμιον\n" +
        "   Now at the feast _he used to release_ for them any one prisoner",
        "Can be used to describe a wish (voluntative)\n" +
        "   _ηὐχομην_ γαρ ἀναθεμα εἰναι αὐτος ἐγω\n" +
        "   For _I could wish_ that I myself were accursed",
        "Can be used to describe an attempt (conative)\n" +
        "   και ἐπορθουν αὐτην and I tried to destroy it",
        "Can describe something almost done (tendential)\n" +
        "   ὁ δε Ἰωαννης διεκωλυεν αὐτον John would have prevented him"
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Aorist stems",
        "In the active voice, a second aorist will always have a different stem from\n" +
        "   the present because the root will always have been modified to form the\n" +
        "   present stem.",
        "Almost always the second aorist stem is identical to the root.",
        "For first aorist the tense stem is normally identical to the present tense stem."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Aorist meaning",
        "Aorist is undefined, just says that an action happened, nothing about when or\n" +
        "   how long.  It is often used for punctiliar (point in time) as in English\n" +
        "   past tense, but that is not always what it means.",
        "Aorist can refer to an action as a whole (constative)",
        "It can refer to the beginning of an action (ingressive)",
        "It can refer to a timeless truth (gnomic)",
        "It can refer to a future action that will certainly occur (proleptic)."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("First aorist endings and verb types",
        "Contract verbs lengthen the contract vowel before the tense formative:\n" +
        "   ἀγαπάω becomes ἠγάπησα",
        "Stems that end in a stop combine the stop with the sigma, as per the rules.",
        "Liquid verbs use α/ε as a tense formative rather than σα."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Perfect tense describes an action that was brought to completion\n" +
        "and whose effects are felt in the present (consummative, extensive).",
        "can be translated with have/has or present, e.g.\n" +
        "   τον δρομον τετεκεκα I have finished the race",
        "can also be intensive, stressing the resulting state of an action:\n" +
        "   ἀφεωνται σοι αἱ ἁμαρτιαι σου your sins are forgiven you"
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Perfect tense reduplication",
        "If the word starts with a single consonant, that consonant is doubled with\n" +
        "   and ε placed between.\n" +
        "   * φ goes to π   χ goes to κ    θ goes to τ",
        "If the word starts with a vowel or dipthong, the vowel is lengthened.\n" +
        "   * Dipthongs often do not change.",
        "If the word starts with two consonants, just the ε will usually be prepended,\n" +
        "   no reduplication.  Does not usually apply to words where λ or ρ are the second\n" +
        "   letter.",
        "Compound verbs reduplicate the verb portion of the word.",
        "Contract verbs lengthen their contract vowel (ending vowel).",
        "Second perfect has α instead of κα for the tense formative."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Middle voice",
        "Indirect middle: the action of the verb in some way affects the subject.\n" +
        "   Example: ὁ Πιλατος ... λαβων ὕδωρ ἀπενιψατο τας χειρας\n" +
        "   Pilate took water and washed his hands.  Emphasizes Pilate's attempt to absolve himself.\n" +
        "   δεξασθε τον ἐμφυτον λογον receive the implanted word, receiving is something done for the self.",
        "Reflexive middle:  the subject does the action and receives it.\n" +
        "   Ἰουδας ... ἀπελθων ἀπηγξατο Judas went out and hung himself"
        ).toGrammarRules());

    allRules.add(new GrammarRule("Pluperfect describes an action in the past that was completed and who's effect are felt in the past"));

    allRules.addAll(new GrammarRuleSet("Participle aspect and relative time",
        "Present participle describes a continuous action",
        "Aorist participle describes an action where the aspect is undefined",
        "Perfect participle describes a completed action with present effects",
        "Future participle describes an action that is intended, purposed, or expected.",
        "Present: describes an action occurring at the same time as the main verb",
        "Aorist: describes an action occurring before the main verb",
        "Aspect always trumps relative time."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Participles have two basic types",
        "Adverbial:  action described by the participle is primary directed towards the verb\n" +
        "   e.g.: While studying his Greek, Ian fell asleep",
        "If the participle is active, the word modified does the action of the participle",
        "If the participle is passive, the word modified receives the action of the participle",
        "Adverbial participles are always anarthrous (no article)",
        "Adjectival: action described by the participle modifies a noun or pronoun\n" +
        "   e.g.: The book lying on the floor belongs to Kathy"
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Participles and other parts of speech",
        "Participles do not have a subject and do not take personal endings",
        "Participles can take objects and prepositional phrases",
        "Participles are negated with μη"
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Participal exegesis",
        "Temporal:  the aorist participle can describe an action occurring before the time\n" +
        "   of the finite verb, while the present participle can describe something happening\n" +
        "   at the same time as the action of the main verb:\n" +
        "   νηστεύσας ... ὕστερον ἐπείνασεν after fasting, ... he was hungry\n" +
        "   συναλιζόμενας παρήγγειλεν αὐτοις while staying with them he charged them.",
        "Manner:  can indicate the manner in which the action of the finite verb occurs:\n" +
        "   ἀκουσας δε ὁ νεακισκος τον λογον ἀπηλθεν _λυπουμενος_\n" +
        "   When the young man heard this, he went away _sad_",
        "Means:  can indicate the means by which the action of the finite verb occurs:\n" +
        "   κοπιωμεν _ἐργαζομενοι_ ταις ἰδιας χερσιν We toil _working_ with our own hands\n",
        "Cause:  can indicate the cause or reason or ground of the action of the finite verb:\n" +
        "   ἠγαλλιασατο πανοικει _πεπιστευκως_ τῳ θεῳ\n" +
        "   He was filled with joy, along with his entire household, _because he had come to believe_ in God.",
        "Conditional: can indicate a condition that must be fulfilled if the action of the\n" +
        "   finite verb is to be accomplished:\n" +
        "   παντα ὅσα ἄν αἰτηστε ... _πιστευοντες_ λημψεσθε\n" +
        "   And whatever you ask in prayer, you will receive, _if you have faith_",
        "Concessive:  can indicate that the action of the finite verb is true despite the\n" +
        "   action of the participle:\n" +
        "   Και ὑμας _ὄντας_ νεκρους τοις παραπτωμασιν\n" +
        "   And _although you were dead_ in your transgressions",
        "Purpose: can indicate the purpose of the finite verb (often translated as infinitive:\n" +
        "   ἄφες ἴδωμεν εἰ ἔρχεται Ἠλιας _σωσων_ αὐτον\n" +
        "   Wait! Let's see if Elijah comes _to save_ him",
        "Result:  can indciate the result of the finite verb:\n" +
        "   ἵνα τους δυο κτισῆ ἐν αὐτῳ εἰς ἕνα καινον ἄνθρωπον _ποιων_ εἰρηνην\n" +
        "   In order to create in himself one new man out of the two, _thus making peace_"
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Participles are often translated as indicatives",
        "Breaking up of long sentances (e.g. Eph 1:3-14 is one sentance in Greek)",
        "Greek likes aorist participle before the main verb where English prefers two\n" +
        "  finite verbs: εὐθυς _ἀφεντες_ τα δικτυα ἠκολουθησαν αὐτῳ\n" +
        "  Immediately _they left_ their nets and followed him."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Participle declensions",
        "feminine participle always uses 1st declension",
        "active masculine & neuter use 3rd declension",
        "middle/passive present masculine & neuter use 2nd declension",
        "middle aorist masculine & neuter use 2nd declension",
        "aorist passive use 3rd declension"
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Adjectival & adverbial participles",
        "Can be attributive - acting as an adjective",
        "Can be substantival - acting as a noun",
        "Adverbial participle is always anarthrous (no definite article)",
        "Adjectival participle is usually articular (has definite article).",
        "For both adverbial and adjectival participles, relative time still applies,\n" +
        "  so aorist still implies the participle is describing someone/something that acted before the main verb."
        ).toGrammarRules());

    allRules.add(new GrammarRule("An 'absolute' grammatical construction is one that is not grammatically\n" +
        "related to the rest of the sentance, that is it does not modify any other words in the sentance.\n" +
        "_ταυτα αὐτου λαλουντος_ πολλοι ἐπιστευσαν εἰς αὐτον\n" +
        "_While he was saying these things_ many believed in him\n" +
        "This is called a genitive absolute (I assume because the participle is in the genitive case)\n" +
        "The genitive absolute can have a 'subject' such as he in the above example and object\n" +
        "such as these things in the above, or other modifiers"));

    allRules.addAll(new GrammarRuleSet("Subjunctive",
        "Describes possibility or probability.",
        "Has aspect, so present tense indicates continuous action while aorist indicates undefined.",
        "Perfect subjunctive (very rare) indicates completed action with continuing consequences.",
        "οὐ μή plus subjunctive indicates emphatic denial of a future possibility, e.g. Jesus'\n" +
            "words in Jn 10:28 οὐ μή ἀπόλωνται they [his sheep] will by no means perish."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Uses of the subjunctive",
        "Possibility or probability.",
        "Hortatory: first person subjunctive, usually at the beginning of the sentance and plural:\n" +
        "    _διέλθωμεν_ εἰς τό πέραν _let us to across_ to the other side",
        "Deliberative, when the answer to a question is uncertain: τί φάγωμεν what should we eat?",
        "ἵνα is almost always followed by the subjunctive, can indicate purpose:\n" +
        "  τίς σοι ἔδωκεν τήν ἐξουσίαν ταύτην ἵνα ταῦτα _ποιῇς_;\n" +
        "  Who gave you authority that _you do_ these things?",
        "Can also indicate content of the preceeding verb:\n" +
        "  ἐκήρθξαν ἵνα μετανοῶσιν they preached that they should repent",
        "ἵνα μή plus subjunctive can be translated as 'lest'\n" +
        "  οἱ πατέπρες, μή ἐρεθίζετε τὰ τέκνα ὑμῶν, _ἵνα μή ἀθυμῶσιν_\n" +
        "  Fathers, do not provoke your children, _lest they become discouraged_",
        "Conditional statements introduced by ἐάν.  If (protasis) is in subjunctive, then (apodosis) any tense or mood.",
        "Can be future event: ταῦτα σοι πάντα δώσω, ἐάν πεσὼν _προσκυνήσῃς_ μοι\n" +
        "                       All these things I will give you, if you will fall down and _worship_ me",
        "Can be a timeless truth: ἐάν _θέλῃς_ δύνασαί με καθαρίσαι\n" +
        "                           if _you want_ you can make me clean",
        "ἴνα, ἕως, and most words that include ἄν are usually followed by a subjunctive:\n" +
        "  ὄταν (whenever) ἐάν (if) ὄς ἄν (whoever) ὅπου ἄν (whenever)",
        "Subjunctive negated with μή"
        ).toGrammarRules());


    allRules.addAll(new GrammarRuleSet("Three ways to ask a question",
        "1. No indication is given as to the answer expected:\n" +
        "   σύ εἶ ὁ βασιλεύς τῶν Ἰουδαίων; Are you the king of the Jews?",
        "2. If the question begins with (not just contains) οὐ the inquistor expects a positive answer:\n" +
        "   Διδάσκαλε, οὐ μέλει σοι ὅτι ἀπολλύμεθα Teacher, do you not care that we are perishing?",
        "3. If the question being with μή the inquistor expects a negative answer:\n" +
        "   μή πάντες ἀπόστολοι;  Are all apostles?"
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Infinitive is a verbal noun.",
        "Infinitive is viewed as singular neuter and can take a definite article in singular neuter, the case\n" +
        "   of which is determined by the function of the infinitive in the sentance.",
        "Infinitive can have a direct object and adverbial modifiers.",
        "Infinitives cannot take a subject (that's what infinite means in this context), but\n" +
        "  they will sometimes have a noun in the accusative that acts like a subject:\n" +
        "  οὐκ ἤφιεν λαλεῖν τὰ δαιμόνια literally: he would not permit to speak the demons,\n" +
        "  better English: he would not permit the demons to speak.",
        "Since infinitive can take direct object (which is in accusative) there are cases of\n" +
        "  infinitive with two nouns in accusative, usually the 'subject' is first the object second:\n" +
        "  βλέπειν αὐτὸν αὐτήν he to see her"
        ).toGrammarRules());


    allRules.addAll(new GrammarRuleSet("Infinitive 'tenses'",
        "present: continuous Οὐδεὶς δύναται δυσὶ κυρίος δουλεύειν No one is able to serve two masters.",
        "aorist: undefined μὴ φοβηθῇς παραλαβειν Μαρίαν τὴν γυναῖκά σου Do not be afraid to take Mary as your wife",
        "perfect: completed ἤκουσαν τοῦτο αὐτὸν πεποιηκέναι τὸ σημεῖον They heard he had done this sign"
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Uses of infinitive:",
        "As a substantive; is usually proceeded by the definite article, in which\n" +
        "  case it is called articular infinitive.  Best translated with 'to':\n" +
        "  ἐμοι _το ζην_ Χριστος και _το ἀποθανειν_ κερδος\n" +
        "  Literally: for me the live Christ and the die gain, better: for me to live is Christ, and to die is gain",
        "To complete a finite verb and are called 'complementary infinitive':\n" +
        "  ἤρξαντο λαλειν ἑτερπαις γλωσσαις They begin to speak in tongues",
        "δει, ἐξεστιν (it is lawful), μελλω, δυναμαι, ἀρχομαι will always be followed by an infinitive",
        "to report indirect discourse."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Infinitive and prepositions",
        "δια plus article in the accusative plus infinitive means 'because', indicates reason\n" +
        "  αὐτος δε Ἰησους ουκ ἐπιστευεν αὐτον αὐτοις _δια το αὐτον γινωσκειν_ παντες\n" +
        "  But Jesus on his part did not entrust himself to them, _because he knew_ all people",
        "εις or προς plus article in the accusative plus infinitive means 'in order that', indicates purpose\n" +
        "  παραδοσουσιν αὐτον τοις ἐθνεσιν _εις το ἐμπαιξαι και μαστιγωσαι και σταυρωσαι_\n" +
        "  They will deliver him over to the Gentiles _to be mocked and flogged and crucified_",
        "Purpose can also be expressed with no preposition and article in genitive",
        "προ plus article in genitive plus infinitive means 'before'",
        "ἐν plus article in dative plus infinitive means 'when' or 'while'",
        "μετα plus article in accusative plus infinitive means 'after'\n" +
        "  ἐν τῳ σπειρειν αὐτον ἁ μεν ἐπεσεν παρα την ὁδον As he sowed some seeds fell along the path",
        "ὡστε plus infinitive indicates result:\n" +
        "  ἐπλησαν ἀμφοτερα τα πλοια _ὡστε βυθιζεσθαι_ αὐτα They filled both boats so full that they began to sink"
        ).toGrammarRules());

    allRules.add(new GrammarRule("Imperative conveys command or request (as in 'give us this day our daily bread').\n" +
            "Present imperative conveys a continuous command or a general precept (always ...)\n" +
            "Aorist applies to a particular situation."));

    allRules.addAll(new GrammarRuleSet("Forms of negation:",
        "οὐ with future indicative = simple negation\n" +
        "   οὐ μοιχεύσεις you shall not commit adultery",
        "οὐ μή plus aorist subjunctive = very strong no\n" +
        "   οἱ λόγοι μου οὐ παρέλθωσιν  My words will by no means [or never, but without time reference] pass away",
        "μή plus present imperative = prohibiting a continuous action\n" +
        "   μή μεριμνᾶτε τῇ ψυχῇ ὑμῶν do not worry about your life",
        "μή plus aorist imperative = prohibiting an undefined action",
        "μή plus aorist subjunctive = stronger form of no than οὐ plus indicative\n" +
        "   μή φοβηθῇς παραλαβεῖν Μαρῖαν τὴν γυναῖκά σου Do not be afraid to take Mary home as your wife"
        ).toGrammarRules());

    allRules.add(new GrammarRule("Standard verb conjugation (e.g. λυω) is called thematic.  Verbs ending in μι are called athematic.\n" +
            "(because the connecting vowel is called the thematic vowel and athematic verbs lack a thematic vowel)."));

    allRules.addAll(new GrammarRuleSet("Athematic verb rules",
        "They reduplicate their initial stem letter to form the present, inserting a ι between.\n" +
        "  (This appears to apply to the imperfect as well, I assume because the imperfect is formed from the present stem)",
        "They do not ordinarily use a connecting vowel in the present indicative.",
        "The stem vowel will often lengthen, shorten, or drop out (e.g. δο to διδωμι)",
        "Most use κα as the tense formative in the aorist."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Athematic verbs use different personal endings in present active indicative, but the same endings",
        "    everywhere else, e.g.: *δο",
        "    1sg  διδω    μι         δίδωμι",
        "    2sg  διδω    ς          δίδως",
        "    3sg  διδω    σι         δίδωσι(ν)",
        "    1pl  διδο    μεν        δίδομεν",
        "    2pl  διδο    τε         δίδοτε",
        "    3pl  διδο    ασι        διδόασι(ν)"
        ).toGrammarRules());

    allRules.add(new GrammarRule("Exceptions to a verb uses first aorist or second aorist only: \n" +
        "δίδωμι uses first aorist in indicative and second aorist for other moods\n" +
        "ἵστημι uses both, first aorist ἔστησα for transitive and second aorist ἔστην for intransitive."));

    allRules.addAll(new GrammarRuleSet("Conditional senatances, if then:  if called protasis, then apodosis",
        "First class conditional, aka conditions of fact:  assume something is true for argument (it may or \n" +
        "    may not be), then the apodosis must be true:\n" +
        "    protasis: εἰ + indicative any tense; apodosis: any mood, any tense; negated by οὐ\n" +
        "    εἰ δέ ἀνάστασις νεκρῶν οὐκ ἔστιν, οὐδὲ Χριστὸς ἐγήγερται\n" +
        "    But if there is no ressurection of the dead, then not even Christ has been raised.",
        "Second class conditional, aka contrary to fact:  if something were true, which it isn't, then\n" +
        "    something else would be true.\n" +
        "    protasis: εἰ + indicative past tense; apodosis: ἄν plus same tense as protasis; negated by μή\n" +
        "    εἰ γάρ ἔγνωσαν, ούκ ἂν τὸν κύριον τῆς δόξης ἐσταύπωσαν\n" +
        "    For if they had known, they would not have crucified the Lord of glory",
        "Third class conditional, future more probable (something might be true in the future)\n" +
        "    or present general (generally true at all times)\n" +
        "    protasis: ἐάν + subjunctive; apodosis: any mood, any tense; negated by μή\n" +
        "    Future more probable: ταῦτα σοι πάντα δώσω, ἐάν πεσὼν _προσκυνήσῃς_ μοι\n" +
        "    All these things I will give you, if you will fall down and _worship_ me\n" +
        "    present general: ἐάν _θέλῃς_ δύνασαί με καθαρίσαι\n" +
        "    if _you want_ you can make me clean\n"
        ).toGrammarRules());

    allRules.add(new GrammarRule("Optative mood, one further step from reality than subjunctive, the mood of wish or desire."));


    allRules.add(new GrammarRule("Koine Greek is VSO"));

    // From Greek Grammar Beyond the Basics, Wallace

    allRules.add(new GrammarRule("Break down of case based words in the the NT:\n" +
        "               Total    Percentage    Nouns    Pronouns    Articles     Participles    Adjectives\n" +
        "Nominative    24,618            31     7794        3145        6009            4621          3049\n" +
        "Genitive      19,613            25     7681        4986        5028             743          1195\n" +
        "Dative        12,173            15     4375        3565        2944             353           936\n" +
        "Accusative    23,105            29     8815        5009        5889             957          2435\n" +
        "Vocative         317            <1      292           0           0               1            24\n"));

    allRules.addAll(new GrammarRuleSet("Predicate Nominative:",
        "* Usually used with verbs εἰμί, γίνομαι, ὑπάρχω but can occur with some transitive verbs in passive as well.",
        "* Most commonly asserts that subject is a subset of predicate nominative:\n" +
        "  Ὁ λόγος γάρ ὁ τοῦ σταυροῦ τοῖς μὲν ἀπολλθμένοις μωρία ἐστιν\n" +
        "  'The word of the cross is foolishness' means the this teaching is a foolish teaching, not that all foolish teaching\n" +
        "  is the word the of cross.",
        "* Less frequenty it indicates equality: οὗτος ἐστιν ὁ υἱός ὁ ἀγαπητός This is my beloved son",
        "* Since Greek is not as word order dependent as English, subject does not have to come first.",
        "* Εἰς plus accusative occasionally replaces predicate nominative.  This is based on Hebrew usage and is most often\n" +
        "  found in LXX quotes."
        ).toGrammarRules());

    allRules.addAll(new GrammarRuleSet("Distinguishing subject in predicate nominative:\n" +
        "  In general, the subject is the known entity.  This knownness can be marked in three ways",
        "  The subject will be a pronoun or implied in the verb:  οὗτος ἐστιν ὁ υἱός ὁ ἀγαπητός",
        "  The subject will be articular:  πνεῦμα ὁ θεός",
        "  The subject will be a proper name.",
        "  If both nouns are so marked, pronouns have the greatest priority.  This generally marks an equality condition\n" +
        "    as opposed to a subset condition."
        ).toGrammarRules());

    allRules.add(new GrammarRule("Nominative in Simple Apposition:\n" +
            "An appositional construction involves two adjacent substantives in the same case which refer to the same person or\n" +
            "  thing and have the same syntatical relation to the rest of the clause.\n" +
            "ὁ μάρτθσ ὁ πιστός, -ὁ πρωτότοκος- τῶν νεκρῶν the faithful witness, -the firstborn- from the dead."));

    allRules.add(new GrammarRule("When the first noun in an appositional construction is a proper name it is generally anarthrous and\n" +
            "the appositional noun is articular:  ἐν ἇις καὶ Μαρία -ἡ Μαγδαληνή- among them also was Mary -the Magdalene-."));

    allRules.add(new GrammarRule("Nominative Absolute:\n" +
            "(subcase of independent nominative, meaning the substantive is grammatically unrelated to the rest of the sentance.)\n" +
            "The use of the nominative case in introductory material (such as titles, headings, salutations, and addresses)\n" +
            "which are not to be construed as sentences.\n" +
            "-Ἀρχὴ- τοῦ εὐαγγελίου Ἰησοῦ Χριστοῦ\n" +
            "-Παῦλος- δοῦλος Χριστοῦ Ἰησοῦ"));
    /*,

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



    return allRules;
  }
}
