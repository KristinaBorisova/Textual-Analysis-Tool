package com.aubg.authorshipDetectionProgram.analyzer.features;

import com.aubg.authorshipDetectionProgram.analyzer.SignatureFeature;

import java.io.IOException;

public class SentenceComplexityFeature extends BaseFeature{
    TextAnalyzer textAnalyzer = new TextAnalyzerImpl ();
    private static final double FEATURE_WEIGHT = 11;
    private static final SignatureFeature FEATURE_NAME = SignatureFeature.SENTENCE_COMPLEXITY_FEATURE;

    @Override
    public SignatureFeature getFeatureName() {
        return SignatureFeature.SENTENCE_COMPLEXITY_FEATURE;
    }

    @Override
    public double getDefaultWeight() {
        return FEATURE_WEIGHT;
    }

    @Override
    public double getFeatureValue(String content) throws IOException {
        //TODO find the value by dividing the number of phrases by the number of sentences
        double phrasesInText = textAnalyzer.getNumberOfPhrases (content);
        double sentencesCounter = textAnalyzer.getNumberOfSentences (content);
        return phrasesInText / sentencesCounter;
    }
}