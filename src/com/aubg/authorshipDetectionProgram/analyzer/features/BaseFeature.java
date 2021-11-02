package com.aubg.authorshipDetectionProgram.analyzer.features;

import com.aubg.authorshipDetectionProgram.analyzer.SignatureFeature;

import java.io.IOException;

public abstract class BaseFeature {
    // This class should be responsible for calling single features and their calculated values and their weight for the signature

    // The name of the feature called
    public abstract SignatureFeature getFeatureName();

    // The value of the feature calculated
    public abstract double getFeatureValue(String content) throws IOException;

    //The weight each feature has in formulating the final linguistic signature
    public abstract double getDefaultWeight();

}
