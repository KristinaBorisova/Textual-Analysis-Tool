package com.aubg.authorshipDetectionProgram.ui;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.aubg.authorshipDetectionProgram.ui.UserAction.consoleInput;
import static com.aubg.authorshipDetectionProgram.ui.UserAction.fileInput;
import static org.junit.jupiter.api.Assertions.assertSame;

class UiManagerImplTest {
    private ConsoleMessages msgManager;
    private UserAction userChoiceConsole = consoleInput;
    private UserAction userChoiceFile = fileInput;

    @org.junit.jupiter.api.Test
    void getTextFromUser() {
    }

    @Test
    public void testGetTextFromConsoleValidInput() throws IOException {
        String mockUserAction1 = "1";
        assertSame (mockUserAction1, consoleInput.getValue ());
    }

    @Test
    public void testgetTextFromUserFileValidInput() throws IOException {
        String mockUserAction2 = "2";
       assertSame (mockUserAction2, fileInput.getValue ());
    }

    @org.junit.jupiter.api.Test
    void printResultsMatrix() {
    }
}