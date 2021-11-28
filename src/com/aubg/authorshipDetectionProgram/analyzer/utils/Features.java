package com.aubg.authorshipDetectionProgram.analyzer.utils;
import com.aubg.authorshipDetectionProgram.analyzer.SignatureFeature;
import com.aubg.authorshipDetectionProgram.analyzer.features.*;

public class Features {
    // a class to implement the getAllFeatures method from the abstract class BaseFeature

    //an array of  BaseFeature type to hold every single feature
    private final BaseFeature[] features;

    //the constructor of the class which initializes the set of features from type BaseFeature with an object from each feature's class
    public Features() {
        this.features = new BaseFeature[]{
                new AverageWordLengthFeature (),
                new AverageNumberOfWordsFeature (),
                new SentenceComplexityFeature (),
                new UniqueWordsRatioFeature ()};
    }

    BaseFeature[] getAllFeatures() {
        return features;
    }

    public BaseFeature getFeature(SignatureFeature feature) {
        for (BaseFeature featureX : features) {
            if (featureX.getName ().equals (featureX.getName ())) return featureX;
        }
        return null;
    }
}
