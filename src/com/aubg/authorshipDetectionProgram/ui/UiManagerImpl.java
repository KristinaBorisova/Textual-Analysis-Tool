package com.aubg.authorshipDetectionProgram.ui;

public class UiManagerImpl implements UiManager {
    private final ConsoleMessages msgManager;

    public UiManagerImpl() {
        msgManager = new ConsoleMessages ();
    }

    @Override
    public String[] getTextFromUser() throws IOException {
        msgManager.displayMenu();
        String[] text;
       // get text from user
        // return text
    }

}
