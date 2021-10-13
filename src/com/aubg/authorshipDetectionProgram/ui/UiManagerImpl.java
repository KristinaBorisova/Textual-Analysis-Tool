package com.aubg.authorshipDetectionProgram.ui;

import java.io.IOException;

public class UiManagerImpl implements UiManager {
    private final ConsoleMessages msgManager;
    private final ConsoleInputWindow consoleInput;

    public UiManagerImpl() {
        msgManager = new ConsoleMessages ();
        consoleInput = new ConsoleInputWindow ();
    }

    @Override
    public String[] getTextFromUser() throws IOException {
        showUserActionMenu ();
        //get preffered user action
        UserAction usersChoice = consoleInput.getUserChoice ();
        //get text from user
        String textValue[] = {"some text for testing purposes", "here"};
        return textValue;
    }

    private void showUserActionMenu() {
        msgManager.displayMenu ();
    }

}
