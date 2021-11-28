package com.aubg.authorshipDetectionProgram.analyzer.utils;

import com.aubg.authorshipDetectionProgram.analyzer.LinguisticSignature;
import com.aubg.authorshipDetectionProgram.analyzer.features.BaseFeature;
import com.aubg.authorshipDetectionProgram.core.FeaturesCalculator;

import java.io.IOException;

public class FeaturesCalculatorImpl implements FeaturesCalculator {
    private final Features features;

    public FeaturesCalculatorImpl() {
        this.features = new Features ();
    }

    @Override
    public LinguisticSignature getAllFeaturesValues(String text) throws IOException {

        LinguisticSignature linguisticSignature = new LinguisticSignature ();

        for (BaseFeature feature : features.getAllFeatures ()) {
            double featureValue = feature.getFeatureValue (text);
            linguisticSignature.setFeature (feature.getName (), featureValue);
        }
        return linguisticSignature;
    }
}
