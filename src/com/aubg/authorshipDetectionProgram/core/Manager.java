package com.aubg.authorshipDetectionProgram.core;

import com.aubg.authorshipDetectionProgram.analyzer.LinguisticSignature;
import com.aubg.authorshipDetectionProgram.analyzer.features.*;
import com.aubg.authorshipDetectionProgram.ui.UiManager;
import com.aubg.authorshipDetectionProgram.ui.UiManagerImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Manager {

    private final UiManager uiManager;
    private final TextAnalyzer textAnalyzer;
    private final AverageWordLengthFeature featureCheck1;
    private final AverageNumberOfWordsFeature featureCheck2;
    private final SentenceComplexityFeature featureCheck3;

    public Manager() throws IOException {
        this.uiManager = new UiManagerImpl ();
        this.textAnalyzer = new TextAnalyzerImpl ();
        this.featureCheck1 = new AverageWordLengthFeature ();
        this.featureCheck2 = new AverageNumberOfWordsFeature ();
        this.featureCheck3 = new SentenceComplexityFeature ();

        startProcess ();

    }

    private void startProcess() throws IOException {
        //request user input/text file
        String[] texts = uiManager.getTextFromUser ();

        //create an array list to hold signature values
        List<LinguisticSignature> signatures = new ArrayList<> ();

        //TODO call features calcularions on the given input
        for (String text : texts) {

            System.out.println ("Textual Analysis of Text: ");
            double valueCheck1 = featureCheck1.getFeatureValue (text);
            System.out.println ("- Average Word Length is calculated by: \nCharacters / Number of words in text = " + valueCheck1);
            double valueCheck2 = featureCheck2.getFeatureValue (text);
            System.out.println ("- Average Number of Words is calculated by: \nWords / Sentences = " + valueCheck2);
            double valueCheck3 = featureCheck3.getFeatureValue (text);
            System.out.println ("- Sentence Complexity is calculated by: \nPhrases / Sentences = " + valueCheck3);
            System.out.println ("   -------     ");
        }

        //TODO form linguistic signatures

        //TODO calculate similarity between features

        //TODO print final result
    }
}
