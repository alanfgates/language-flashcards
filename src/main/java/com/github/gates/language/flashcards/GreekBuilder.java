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
package com.github.gates.language.flashcards;

import java.util.Arrays;
import java.util.List;

public class GreekBuilder {

  public static List<Word> buildGreek() {
    Word[] words = new Word[]{
        GreekNoun.builder().greek("ὁ").english("the").masculine().nominative().singular().build(),
        GreekNoun.builder().greek("τοῦ").english("the").masculine().genitive().singular().build(),
        GreekNoun.builder().greek("τῷ").english("the").masculine().dative().singular().build(),
        GreekNoun.builder().greek("τόν").english("the").masculine().accusative().singular() .build(),
        GreekNoun.builder().greek("ὁι").english("the").masculine().nominative().plural().build(),
        GreekNoun.builder().greek("τῶν").english("the").masculine().genitive().plural().build(),
        GreekNoun.builder().greek("τοῖς").english("the").masculine().dative().plural().build(),
        GreekNoun.builder().greek("τούς").english("the").masculine().accusative().plural() .build(),
        GreekNoun.builder().greek("ἡ").english("the").feminine().nominative().singular().build(),
        GreekNoun.builder().greek("τῆς").english("the").feminine().genitive().singular().build(),
        GreekNoun.builder().greek("τῇ").english("the").feminine().dative().singular().build(),
        GreekNoun.builder().greek("τήν").english("the").feminine().accusative().singular() .build(),
        GreekNoun.builder().greek("ἁι").english("the").feminine().nominative().plural().build(),
        GreekNoun.builder().greek("τῶν").english("the").feminine().genitive().plural().build(),
        GreekNoun.builder().greek("ταῖς").english("the").feminine().dative().plural().build(),
        GreekNoun.builder().greek("τάς").english("the").feminine().accusative().plural() .build(),
        GreekNoun.builder().greek("τό").english("the").neuter().nominative().singular().build(),
        GreekNoun.builder().greek("τοῦ").english("the").neuter().genitive().singular().build(),
        GreekNoun.builder().greek("τῷ").english("the").neuter().dative().singular().build(),
        GreekNoun.builder().greek("τό").english("the").neuter().accusative().singular() .build(),
        GreekNoun.builder().greek("τά").english("the").neuter().nominative().plural().build(),
        GreekNoun.builder().greek("τῶν").english("the").neuter().genitive().plural().build(),
        GreekNoun.builder().greek("τοῖς").english("the").neuter().dative().plural().build(),
        GreekNoun.builder().greek("τά").english("the").neuter().accusative().plural() .build()
    };
    return Arrays.asList(words);


  }
}
