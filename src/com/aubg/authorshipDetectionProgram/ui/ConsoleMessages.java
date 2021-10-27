package com.aubg.authorshipDetectionProgram.ui;

import java.util.List;

public class ConsoleMessages {

    //show to the user existing options for text input
    void displayMenu() {
        System.out.print ("Please choose how to proceed with Text Authentication:" +
                "\n(1) - Use Console to enter text manually" +
                "\n(2) - Open existing file");
        System.out.println ();
    }

    //User Input process - Unexpected value for option menu
    void exceptionMsg() {
        System.out.println ("\"Exception! Unexpected value!");
    }

    // User Input process - ask user to continue with console text input
    void consoleMsgContinue() {
        System.out.println ("\nDo you want to continue with another text entry? y/n");
    }

    // User Input process - end
    void displayExitMsg() {
        System.out.println ("->You have chosen to END the text input process!");
    }

    // User Message - Enter text
    void consoleInputMsg() {
        System.out.println ("- Please enter the text to be analyzed. Terminate with '+' ");
    }

    // Print content
    void printListContent(List<String> arr) {
        System.out.println ("File content: \n ");
        for (int i = 0; i < arr.size (); i++) {
            System.out.println (arr.get (i) + " ");
        }
    }

    //Invalid input user message
    void inputError() {
        System.out.println ("Invalid input. Please Try again!");
    }

    // User Message - Continue text input process
    void displayMsgContinue() {
        System.out.println ("->You have chosen to enter another text!");
    }

    // Print user Text file content
    void printFileContent(String[] arr) {
        System.out.println ("File content: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println (arr[i] + " ");
            if (arr[i].equals (".") || arr[i].equals ("?") || arr[i].equals ("!")) {
                System.out.println (arr[i] + "\n\n");
            }
        }
        System.out.println ("\n");
    }
}