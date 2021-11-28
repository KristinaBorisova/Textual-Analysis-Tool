package com.aubg.authorshipDetectionProgram.ui;

import com.aubg.authorshipDetectionProgram.ui.fileInput.ChooseFileWindow;

import java.io.IOException;

public class UiManagerImpl implements UiManager {
    private final ConsoleMessages msgManager;
    private final ConsoleInputWindow consoleInput;
    private final ChooseFileWindow readFileWindow;

    public UiManagerImpl() {
        msgManager = new ConsoleMessages ();
        consoleInput = new ConsoleInputWindow ();
        readFileWindow = new ChooseFileWindow ();
    }

    @Override
    public String[] getTextFromUser() throws IOException {
        //Display option menu to user
        showUserActionMenu ();
        //get preferred user action
        UserAction usersChoice = consoleInput.getUserChoice ();
        //get text from user input/txt file
        String textValue[] = getText (usersChoice);
        return textValue;
    }

    private void showUserActionMenu() {
        msgManager.displayMenu ();
    }

    private String[] getText(UserAction usersChoice) throws IOException {
        String[] userTextContent = null;
        switch (usersChoice) {
            case consoleInput -> userTextContent = consoleInput.getUserConsoleInput ();
            case fileInput -> userTextContent = readFileWindow.getFileContent ();
            default -> msgManager.exceptionMsg ();
        }
        return userTextContent;
    }

    // Print similarity result matrix
    @Override
    public void printResultsMatrix(double[][] resultsMatrix, int matrixSize) {
        for (int col = 0; col < matrixSize; col++) {
            for (int row = 0; row < matrixSize; row++) {
                System.out.print (resultsMatrix[col][row] + " | ");
            }
            System.out.println ();
        }

    }



}
