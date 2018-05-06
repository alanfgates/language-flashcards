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

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import java.io.IOException;

public class Main {
  private static final String FILENAME = "./cards.dat";
  private static final String TEST_NUMBER = "40";

  public static void main(String[] args) {
    Options options = new Options();

    options.addOption("f", "filename", true, "File to store deck in, defaults to " + FILENAME);
    options.addOption("h", "help", false, "You're looking at it.");
    options.addOption("n", "number-to-test", true, "Number of cards to test, defaults to " + TEST_NUMBER);
    options.addOption("s", "shuffle", false,
        "Shuffle the cards.  This puts all of the cards back in the deck");
    options.addOption("t", "test", false, "Do daily test");

    try {
      CommandLine cli = new GnuParser().parse(options, args);
      String filename = cli.getOptionValue("f", FILENAME);
      int testNumber = Integer.valueOf(cli.getOptionValue("n", TEST_NUMBER));

      if (cli.hasOption("h")) {
        usage(options);
      } else if (cli.hasOption("s")) {
        CardDeck.storeDeck(filename, new CardDeck());
      } else if (cli.hasOption("t")) {
        CardDeck deck = CardDeck.readDeck(filename);
        deck.daily(testNumber);
        CardDeck.storeDeck(filename, deck);
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
