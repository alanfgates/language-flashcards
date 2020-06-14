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

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@JsonSerialize(using = Word.Serializer.class)
@JsonDeserialize(using = Word.Deserializer.class)
public class Word {
  private String english;
  private String other;
  private Enum[] modifiers;

  // For Jackson
  public Word() {
  }

  public Word(String other, String english, Enum... modifiers) {
    this.english = english;
    this.other = other;
    this.modifiers = modifiers;
  }

  boolean test(BufferedReader input) throws IOException {
    showFront();
    input.readLine();
    flipOver();
    System.out.println("Success?[y]");
    String answer = input.readLine();
    return (answer.length() == 0 || answer.toLowerCase().startsWith("y"));
  }

  public String getEnglish() {
    return english;
  }

  public Word setEnglish(String english) {
    this.english = english;
    return this;
  }

  public String getOther() {
    return other;
  }

  public Word setOther(String other) {
    this.other = other;
    return this;
  }

  public Enum[] getModifiers() {
    return modifiers;
  }

  public Word setModifiers(Enum[] modifiers) {
    this.modifiers = modifiers;
    return this;
  }

  private void showFront() {
    System.out.println(other);
  }

  private void flipOver() {
    StringBuilder buf = new StringBuilder(other)
        .append(" : ")
        .append(english)
        .append(" - ");
    boolean first = true;
    for (Enum modifier : modifiers) {
      if (first) first = false;
      else buf .append(", ");
      buf.append(modifier.name().toLowerCase().replace('_', ' '));
    }
    System.out.println(buf.toString());
  }

  public static class Serializer extends StdSerializer<Word> {
    public Serializer() {
      super(Word.class);
    }

    @Override
    public void serialize(Word word, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
      jsonGenerator.writeStartObject();
      jsonGenerator.writeStringField("english", word.getEnglish());
      jsonGenerator.writeStringField("other", word.getOther());
      jsonGenerator.writeArrayFieldStart("modifiers");
      for (Enum e : word.getModifiers()) jsonGenerator.writeString(e.name());
      jsonGenerator.writeEndArray();
      jsonGenerator.writeEndObject();

    }
  }

  public static class Deserializer extends StdDeserializer<Word> {
    private List<Class<? extends Enum>> enums;
    public Deserializer() {
      super(Word.class);
      enums = new ArrayList<>();
      enums.add(Declension.class);
      enums.add(Gender.class);
      enums.add(Mood.class);
      enums.add(Number.class);
      enums.add(Other.class);
      enums.add(PartOfSpeech.class);
      enums.add(Person.class);
      enums.add(Tense.class);
      enums.add(VerbRoot.class);
      enums.add(Voice.class);
    }

    @Override
    public Word deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      List<Enum> modifiers = new ArrayList<>();
      Iterator<JsonNode> iter = node.get("modifiers").elements();
      while (iter.hasNext()) {
        String val = iter.next().asText();
        // This is kludgy, but I don't know a better way
        try {
          for (Class<? extends Enum> e : enums) {
            modifiers.add(Enum.valueOf(e, val));
            break;
          }
        } catch (IllegalArgumentException e) {
          // NOP
        }
      }
      return new Word()
          .setEnglish(node.get("english").asText())
          .setOther(node.get("other").asText())
          .setModifiers(modifiers.toArray(new Enum[0]));
    }
  }
}
