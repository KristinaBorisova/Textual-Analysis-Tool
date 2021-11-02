package com.aubg.authorshipDetectionProgram.analyzer.features;

import com.aubg.authorshipDetectionProgram.analyzer.SignatureFeature;

import java.io.IOException;

public class UniqueWordsRatioFeature extends BaseFeature {
    TextAnalyzer textAnalyzer = new TextAnalyzerImpl ();
    private static final double FEATURE_WEIGHT = 11;
    private static final SignatureFeature FEATURE_NAME = SignatureFeature.UNIQUE_WORDS_RATIO_FEATURE;

    @Override
    public SignatureFeature getFeatureName() {
        return FEATURE_NAME;
    }
    @Override
    public double getDefaultWeight() {
        return FEATURE_WEIGHT;
    }
    @Override
    public double getFeatureValue(String content) throws IOException {
        //TODO divide number of unique words by the total number of words in a sentence
    }


}
