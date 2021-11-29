package com.aubg.authorshipDetectionProgram.analyzer.utils;

import com.aubg.authorshipDetectionProgram.analyzer.LinguisticSignature;
import com.aubg.authorshipDetectionProgram.analyzer.features.BaseFeature;
import com.aubg.authorshipDetectionProgram.core.FeaturesCalculator;

import java.io.IOException;

public class FeaturesCalculatorImpl implements FeaturesCalculator {
   //a variable to hold
    private final Features features;

    public FeaturesCalculatorImpl() {
        this.features = new Features ();
    }

    @Override
    public LinguisticSignature getAllFeaturesValues(String text) throws IOException {

        LinguisticSignature linguisticSignature = new LinguisticSignature ();

        //For every single feature in the collection of features, calculate the name
        // and its value and add it to the Linguistic signature in the form "Feature Name, Feature Value"
        for (BaseFeature feature : features.getAllFeatures ()) {
            double featureValue = feature.getFeatureValue (text);
            //calls a method responsible for adding the feature's name and value to the HashMap LinguisticSignature
            linguisticSignature.setFeature (feature.getName (), featureValue);
        }
        return linguisticSignature;
    }
}
