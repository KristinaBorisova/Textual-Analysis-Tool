package com.aubg.authorshipDetectionProgram.ui;

import java.io.IOException;

public class UiManagerImpl implements UiManager {
    private final ConsoleMessages msgManager;

    public UiManagerImpl() {
        msgManager = new ConsoleMessages ();
    }

    @Override
    public String[] getTextFromUser() throws IOException {
        showUserActionMenu ();
        //get text from user
        String textValue[] = {"some text for testing purposes", "here"};
        return textValue;
    }

    private void showUserActionMenu() {
        msgManager.displayMenu ();
    }

}
