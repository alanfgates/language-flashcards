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
import java.util.Collections;
import java.util.List;
import java.util.Random;

abstract class BaseLanguageBuilder implements LanguageBuilder {

  abstract List<Word> buildGrammarWords();

  @Override
  public List<Word> getGrammarWords() {
    // abstract list doesn't support remove
    List<Word> words = new ArrayList<>(buildGrammarWords());
    Collections.shuffle(words);
    Random rand = new Random();
    int originalSize = words.size() / 4;
    List<Word> selectedWords = new ArrayList<>(originalSize);
    while (selectedWords.size() < originalSize) {
      int selection = rand.nextInt(words.size());
      selectedWords.add(words.get(selection));
      words.remove(selection);
    }
    return selectedWords;
  }
}
