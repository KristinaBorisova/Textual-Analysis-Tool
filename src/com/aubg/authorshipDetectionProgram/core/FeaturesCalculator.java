package com.aubg.authorshipDetectionProgram.core;

import com.aubg.authorshipDetectionProgram.analyzer.LinguisticSignature;

import java.io.IOException;

public interface FeaturesCalculator {

    LinguisticSignature getAllFeaturesValues(String text) throws IOException;

}


