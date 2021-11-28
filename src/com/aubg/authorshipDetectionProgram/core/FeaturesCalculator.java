package com.aubg.authorshipDetectionProgram.core;

import com.aubg.authorshipDetectionProgram.analyzer.LinguisticSignature;

import java.io.IOException;

public interface FeaturesCalculator {
        // a method to collect all feature values at one place
     LinguisticSignature getAllFeaturesValues(String text) throws IOException;
}


