package com.aubg.authorshipDetectionProgram.ui;

import org.junit.Test;

import java.io.IOException;

import static com.aubg.authorshipDetectionProgram.ui.UserAction.*;
import static org.junit.Assert.assertSame;

public class UiManagerImplTest {
    private ConsoleMessages msgManager;
    private UserAction userChoiceConsole = consoleInput;
    private UserAction userChoiceFile = fileInput;


    @Test
    public void getTextFromConsole() throws IOException {
        String mockUserAction1 = "1";
        assertSame (mockUserAction1, consoleInput.getValue ());
    }

    @Test
    public void getTextFromUserFile() throws IOException {
        String mockUserAction2 = "2";
        assertSame (mockUserAction2, fileInput.getValue ());
    }
}