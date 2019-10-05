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

import java.util.List;

public interface LanguageBuilder {

  String getLanguageName();

  /**
   * Build all the words, each word only occurring once
   * @return all the words, in one list
   */
  List<Word> buildWords();

  /**
   * Build all the words that are grammar oriented, such as verb forms, etc.
   * @return grammar words
   */
  List<Word> buildGrammarWords();

  /**
   * Build all the words that are vocabulary
   * @return vocab words
   */
  List<Word> buildVocabWords();

  /**
   * Build all the grammar rules, each rule occurring once.
   * @return all the grammar rules
   */
  List<GrammarRule> buildRules();
}
