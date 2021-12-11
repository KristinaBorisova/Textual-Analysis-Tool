package com.aubg.authorshipDetectionProgram.analyzer.features;

import com.aubg.authorshipDetectionProgram.analyzer.SignatureFeature;
import com.aubg.authorshipDetectionProgram.analyzer.TextAnalyzer;
import com.aubg.authorshipDetectionProgram.analyzer.TextAnalyzerImpl;

import java.io.IOException;

public class UniqueWordsRatioFeature extends BaseFeature {
    TextAnalyzer textAnalyzer = new TextAnalyzerImpl ();
    private static final double FEATURE_WEIGHT = 50.0D;
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
    public SignatureFeature getName() {
        return FEATURE_NAME;
    }

    @Override
    public double getFeatureValue(String content) throws IOException {
        double wordsInText = textAnalyzer.getNumberOfWords (content);
        double uniqueWordsCounter = textAnalyzer.getNumberOfUniqueWords (content);
        return uniqueWordsCounter/wordsInText;
    }

}
