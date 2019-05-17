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

public class GrammarRule implements Serializable {
  private String rule;
  private int chapter;
  private boolean advanced;

  // For Jackson
  public GrammarRule() {
  }

  GrammarRule(String rule) {
    this(rule, Integer.MAX_VALUE, false);
  }

  GrammarRule(String rule, int chapter) {
    this(rule, chapter, false);
  }


  GrammarRule(String rule, int chapter, boolean advanced) {
    this.rule = rule;
    this.chapter = chapter;
    this.advanced = advanced;
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

  public int getChapter() {
    return chapter;
  }

  public void setChapter(int chapter) {
    this.chapter = chapter;
  }

  public boolean isAdvanced() {
    return advanced;
  }

  public void setAdvanced(boolean advanced) {
    this.advanced = advanced;
  }
}
