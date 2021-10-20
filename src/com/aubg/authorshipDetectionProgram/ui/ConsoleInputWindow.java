package com.aubg.authorshipDetectionProgram.ui;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ConsoleInputWindow {
    private final ConsoleMessages consoleMessage;
    private final Scanner input;

    public ConsoleInputWindow() {
        this.consoleMessage = new ConsoleMessages ();
        this.input = new Scanner (System.in);
    }

    //Ask the user for their preffered way of importing text
    UserAction getUserChoice() {

        int userChoice = Integer.parseInt (input.nextLine ().trim ());
        switch (userChoice) {
            case 1 -> {
                System.out.println ("You have chosen to enter text manually!");
                return UserAction.consoleInput;
            }
            case 2 -> {
                System.out.println ("You have chosen to open existing file.");
                return UserAction.fileInput;
            }
            default -> {
                System.out.println ("Error, please try again!");
                return getUserChoice ();
            }
        }
    }

    //Get user text from console
    public String[] getUserConsoleInput() {
        UserAction userAction;
        List<String> texts = new ArrayList<> ();
        do {
            texts.add (getConsoleTextInput ());
            consoleMessage.consoleMsgContinue ();
            userAction = getUserDecision ();
        } while (userAction == UserAction.continueInput);
        texts.removeAll (Arrays.asList ("", "\n"));
        consoleMessage.printListContent (texts);
        return texts.toArray (new String[0]);
    }

    //Facilitate user decision process - Continue or terminate input process
    private UserAction getUserDecision() {
        String response = input.nextLine ();

        if (UserAction.yes.value.equalsIgnoreCase (response)) {
            consoleMessage.displayMsgContinue ();
            return UserAction.continueInput;
        } else if
        (UserAction.no.value.equalsIgnoreCase (response)) {
            consoleMessage.displayExitMsg ();
            return UserAction.endInput;
        } else {
            consoleMessage.inputError ();
            return getUserDecision ();
        }
    }

    //Convert text input from console to string and pass it back
    private String getConsoleTextInput() {
        StringBuilder userTextInput = new StringBuilder ();
        consoleMessage.consoleInputMsg ();
        String userConsoleInput;
        userConsoleInput = input.nextLine ();
        while (!(userConsoleInput.equals (UserAction.endOfFile.value))) {
            userTextInput.append (userConsoleInput);
            userTextInput.append ("\n");
            userConsoleInput = input.nextLine ();
        }
        return userTextInput.toString ();
    }
}
