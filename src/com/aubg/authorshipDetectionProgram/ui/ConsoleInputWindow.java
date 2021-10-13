package com.aubg.authorshipDetectionProgram.ui;

import java.util.Scanner;

public class ConsoleInputWindow {
    private final ConsoleMessages consoleMessages;
    private final Scanner input;

    public ConsoleInputWindow() {
        this.consoleMessages = new ConsoleMessages ();
        this.input = new Scanner (System.in);
    }

    UserAction getUserChoice() {

        int userChoice = Integer.parseInt (input.nextLine().trim ());
        switch (userChoice) {
            case 1 -> {
                System.out.println("You have chosen to enter text manually!");
                return UserAction.consoleInput;
            }
            case 2 -> {
                System.out.println("You have chosen to open existing file.");
                return UserAction.fileInput;
            }
            default -> {
                System.out.println("Error, please try again!");
                return getUserChoice ();
            }
        }
    }

}
