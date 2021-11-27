package com.aubg.authorshipDetectionProgram.analyzer.features;

import com.aubg.authorshipDetectionProgram.analyzer.SignatureFeature;
import com.aubg.authorshipDetectionProgram.analyzer.TextAnalyzer;
import com.aubg.authorshipDetectionProgram.analyzer.TextAnalyzerImpl;

import java.io.IOException;

public class AverageWordLengthFeature extends BaseFeature {

    /*This class represents the values of the Feature "Average Word Length" - namely the weight of the feature for the linguistic signature,
    the name of the feature and its value based  on the textual analysis process.
    This class inherits the "BaseFeature" Class and is responsible for gathering the needed information for this specific feature */
    TextAnalyzer textAnalyzer = new TextAnalyzerImpl ();
    private static final double FEATURE_WEIGHT = 11;
    private static final SignatureFeature FEATURE_NAME = SignatureFeature.AVG_WORD_LENGTH_FEATURE;

    @Override
    public double getDefaultWeight() {
        return FEATURE_WEIGHT;
    }

    @Override
    public SignatureFeature getName() {
        return FEATURE_NAME;
    }

    @Override
    public SignatureFeature getFeatureName() {
        return FEATURE_NAME;
    }

    @Override
    public double getFeatureValue(String content) throws IOException {
        //calculate the value of the feature based on the given text entry by dividing the characters
        // in the text by the number of words in the text
        String userContent = textAnalyzer.removePunctuation (content);
        double wordsInText = textAnalyzer.getNumberOfWords (userContent);
        double charactersInText = textAnalyzer.getNumberOfCharacters (userContent);
        return charactersInText / wordsInText;
    }
}