package com.github.alanfgates.language.flashcards;

import java.util.ArrayList;
import java.util.List;

class GrammarRuleSet {
  private final String title;
  private final String[] rules;

  GrammarRuleSet(String title, String... rules) {
    this.title = title;
    this.rules = rules;
  }

  List<GrammarRule> toGrammarRules() {
    List<GrammarRule> list = new ArrayList<>(rules.length);
    for (String rule : rules) {
      list.add(new GrammarRule(title + "\n" + rule));
    }
    return list;
  }

}
