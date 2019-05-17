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

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import java.io.IOException;

public class Main {
  private static final String FILENAME = "./cards.json";
  private static final String TEST_NUMBER = "0";

  public static void main(String[] args) {
    Options options = new Options();

    options.addOption("A", "no-advanced", false, "Exclude advanced grammar rules, defaults to false.\n" +
        "This option only has an affect when sorting the deck");
    options.addOption("c", "chapter", true, "Include words and rules through this chapter when creating the deck," +
        "defaults to all chapters.  This option only has an affect when sorting the deck ");
    options.addOption("f", "filename", true, "File to store deck in, defaults to " + FILENAME);
    options.addOption("h", "help", false, "You're looking at it.");
    options.addOption("n", "number-to-test", true, "No longer used, number to test now calculated automatically.");
    options.addOption("s", "shuffle", false, "Shuffle the cards.  This puts all of the cards back in the deck");
    options.addOption("t", "test", false, "Do daily test");

    try {
      CommandLine cli = new GnuParser().parse(options, args);
      String filename = cli.getOptionValue("f", FILENAME);
      int testNumber = Integer.valueOf(cli.getOptionValue("n", TEST_NUMBER));

      if (cli.hasOption("h")) {
        usage(options);
      } else if (cli.hasOption("s")) {
        int throughChapter = cli.hasOption("c") ? Integer.valueOf(cli.getOptionValue("c")) : Integer.MAX_VALUE;
        CardDeck deck = new CardDeck(throughChapter, !cli.hasOption("A"));
        deck.storeDeck(filename);
      } else if (cli.hasOption("t")) {
        CardDeck deck = new CardDeck(filename);
        deck.daily(testNumber);
        deck.storeDeck(filename);
      } else {
        System.err.println("I'm not really sure what you're looking for here, my friend.");
        usage(options);
      }
    } catch (ParseException e) {
      System.err.println("Failed to parse the command line: " + e.getMessage());
    } catch (IOException e) {
      System.err.println("Got an IO exception, this is generally bad: " + e.getMessage());
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      System.err.println("I don't think this should ever really happen: " + e.getMessage());
      e.printStackTrace();
    }
  }

  private static void usage(Options options) {
    HelpFormatter formatter = new HelpFormatter();
    formatter.printHelp("langtest", options);
  }
}
