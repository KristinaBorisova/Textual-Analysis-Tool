package com.aubg.authorshipDetectionProgram.ui;

import org.junit.Test;

import java.io.IOException;

import static com.aubg.authorshipDetectionProgram.ui.UserAction.consoleInput;
import static com.aubg.authorshipDetectionProgram.ui.UserAction.fileInput;
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

//    @Test
//    public void getTextFromUser() {
//    String [] userText = {"Object-Oriented Programming is...", "Object-Oriented Programmingis..."};
//    UserAction usersChoice = consoleInput;
//
//    UiManager conClass = new UiManagerImpl();
//    String actual = conClass.UiManagerImpl();
//
//    assertEquals("DEFAULT-1", actual);
//
//
//    }

//    @Test
//    public void givenNonAbstractMethod_whenMockitoMock_testCorrectBehaviour() {
//        UiManager abstractClass = Mockito.mock(AbstractIndependent.class, Mockito.CALLS_REAL_METHODS);
//        assertEquals("DEFAULT-1", abstractClass.defaultImpl());
//    }

}