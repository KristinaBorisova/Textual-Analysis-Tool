package com.aubg.authorshipDetectionProgram.ui;

import java.io.File;
import java.util.List;

public class ConsoleMessages {

    // A wrapper function for printing
    public void printMsg(String content) {
        System.out.println (content);
    }

    //Welcome Message
    void displayWelcomeMessage(){
        printMsg ("| Welcome to \"Grade Me\" - the tool for| \n" +
                "| assessing digitally written work!   | \n");
    }

    //show to the user existing options for text input
    void displayMenu() {
        printMsg ("Please choose how to proceed with Text Authentication:" +
                "\n(1) - Use Console to enter text manually" +
                "\n(2) - Open existing file");
        System.out.println ();
    }


    //Print file name in console
    public void openingFileMsg(File file) {
        printMsg ("\nOpening: " + file.getName () + ".");
    }

    //Print file path in console
    public void showFilePathMsg(File file) {
        printMsg ("At location:" + file.getAbsolutePath () + "\n");
    }

    //Feature Not Found Message
    public void featureNotFound() {
        printMsg ("Error, feature not found!");
    }

    //User Input process - Unexpected value for option menu
    void exceptionMsg() {
        printMsg ("\"Exception! Unexpected value!");
    }

    // User Input process - ask user to continue with console text input
    void consoleMsgContinue() {
        printMsg ("\nDo you want to continue with another text entry? y/n");
    }

    // User Input process - end
    void displayExitMsg() {
        printMsg ("->You have chosen to END the text input process!");
    }

    // User Message - Enter text
    protected void consoleInputMsg() {
        printMsg ("- Please enter the text to be analyzed. Terminate with '+' ");
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
        printMsg ("Invalid input. Please Try again!");
    }

    // User Message - Continue text input process
    void displayMsgContinue() {
        printMsg ("->You have chosen to enter another text!");
    }

    // Print user Text file content
    public void printFileContent(String[] arr) {
        printMsg ("File content: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println (arr[i] + "\n\n");
            if (arr[i].equals (".") || arr[i].equals ("?") || arr[i].equals ("!")) {
                System.out.println (arr[i] + "\n\n");
            }
        }
        System.out.println ("\n");
    }
}