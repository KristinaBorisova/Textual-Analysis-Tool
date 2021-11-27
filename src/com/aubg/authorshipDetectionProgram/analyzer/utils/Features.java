package com.aubg.authorshipDetectionProgram.analyzer.utils;


import com.aubg.authorshipDetectionProgram.analyzer.SignatureFeature;
import com.aubg.authorshipDetectionProgram.analyzer.features.*;

public class Features {

    private final BaseFeature[] features;

    public Features() {
        this.features = new BaseFeature[]{new AverageWordLengthFeature (),
                new AverageNumberOfWordsFeature (),
                new SentenceComplexityFeature (),
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
