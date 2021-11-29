package com.aubg.authorshipDetectionProgram.analyzer.features;

import com.aubg.authorshipDetectionProgram.analyzer.SignatureFeature;
import com.aubg.authorshipDetectionProgram.analyzer.TextAnalyzer;
import com.aubg.authorshipDetectionProgram.analyzer.TextAnalyzerImpl;

import java.io.IOException;

public class AverageNumberOfWordsFeature extends BaseFeature {

    TextAnalyzer textAnalyzer = new TextAnalyzerImpl ();
    private static final double FEATURE_WEIGHT = 11;
    private static final SignatureFeature FEATURE_NAME = SignatureFeature.AVG_NUMBER_OF_WORDS_FEATURE;

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
        //calculate the value of the feature based on the given text entry by
        // dividing the number of words in the text by the number of sentences
        double sentencesCount = textAnalyzer.getNumberOfSentences (content);
        String userText = textAnalyzer.removePunctuation (content);
        double wordsCount = textAnalyzer.getNumberOfWords (userText);
        return wordsCount / sentencesCount;
    }
}

