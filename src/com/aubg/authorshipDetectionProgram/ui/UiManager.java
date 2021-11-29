package com.aubg.authorshipDetectionProgram.ui;

import java.io.IOException;

public interface UiManager {
    //Request text from user
    String[] getTextFromUser() throws IOException;
    // Add matrix output method
    void printResultsMatrix(double[][] resultsMatrix, int matrixSize);
}
