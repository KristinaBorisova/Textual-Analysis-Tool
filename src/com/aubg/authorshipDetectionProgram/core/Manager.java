package com.aubg.authorshipDetectionProgram.core;

import com.aubg.authorshipDetectionProgram.ui.UiManager;
import com.aubg.authorshipDetectionProgram.ui.UiManagerImpl;

import java.io.IOException;
import java.lang.String;

public class Manager {

    private final UiManager uiManager;

    public Manager() throws IOException {
        this.uiManager = new UiManagerImpl ();
        startProcess ();
    }

    private void startProcess() throws IOException {
        //request user input/text file
        String[] texts = uiManager.getTextFromUser ();
        //TODO call features calcularions on the given input

        //TODO form linguistic signatures

        //TODO calculate similarity between features

        //TODO print final result
    }
}
