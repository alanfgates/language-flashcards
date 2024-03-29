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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GrammarRule implements Serializable {
  private String rule;

  // For Jackson
  public GrammarRule() {
  }

  GrammarRule(String rule) {
    this.rule = rule;
  }

  void show() {
    System.out.println(rule);
  }

  // for Jackson
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  @Override
  public String toString() {
    return rule;
  }

  static List<GrammarRule> getSomeGrammarRules(List<GrammarRule> rules, int numRules) {
    Random rand = new Random();
    int start = rand.nextInt(numRules);
    List<GrammarRule> toUse = new ArrayList<>(numRules);
    for (int i = start; i < start + numRules; i++) {
      toUse.add(rules.get(i % rules.size()));
    }
    return toUse;
  }
}
