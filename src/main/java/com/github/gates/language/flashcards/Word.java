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

import java.io.Serializable;

public abstract class Word implements Serializable {
  public final String english;
  public final String other;

  protected Word(String english, String other) {
    this.english = english;
    this.other = other;
  }

  public void showFront() {
    System.out.println(other);
  }

  public abstract void flipOver();

  // equals chosen so that two words with the same 'other' will be equal
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Word)) return false;
    return other.equals(((Word)obj).other);
  }
}
