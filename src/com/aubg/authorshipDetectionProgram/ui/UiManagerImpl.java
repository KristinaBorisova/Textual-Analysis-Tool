package com.aubg.authorshipDetectionProgram.ui;

import javax.swing.*;
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
        //get text from user input/file
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
}
