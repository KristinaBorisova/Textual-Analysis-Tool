package com.aubg.authorshipDetectionProgram.core;

import com.aubg.authorshipDetectionProgram.analyzer.LinguisticSignature;
import com.aubg.authorshipDetectionProgram.analyzer.features.AverageWordLengthFeature;
import com.aubg.authorshipDetectionProgram.analyzer.features.TextAnalyzer;
import com.aubg.authorshipDetectionProgram.analyzer.features.TextAnalyzerImpl;
import com.aubg.authorshipDetectionProgram.ui.UiManager;
import com.aubg.authorshipDetectionProgram.ui.UiManagerImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Manager {

    private final UiManager uiManager;
    private final TextAnalyzer textAnalyzer;
    private final AverageWordLengthFeature featureCheck;

    public Manager() throws IOException {
        this.uiManager = new UiManagerImpl ();
        this.textAnalyzer = new TextAnalyzerImpl ();
        this.featureCheck = new AverageWordLengthFeature ();
        startProcess ();

    }

    private void startProcess() throws IOException {
        //request user input/text file
        String[] texts = uiManager.getTextFromUser ();

        //create an array list to hold signature values
        List<LinguisticSignature> signatures = new ArrayList<> ();

        //TODO call features calcularions on the given input
        for (String text : texts) {
            double valueCheck = featureCheck.getFeatureValue (text);
            System.out.println (valueCheck);
        }

        //TODO form linguistic signatures

        //TODO calculate similarity between features

        //TODO print final result
    }
}
