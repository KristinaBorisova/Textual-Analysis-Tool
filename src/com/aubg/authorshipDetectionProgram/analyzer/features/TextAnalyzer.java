package com.aubg.authorshipDetectionProgram.analyzer.features;

import java.io.IOException;

public interface TextAnalyzer {
    // a class to help me with text analysis of a single file/text content entry

    //TODO Strip text from punctuation
    String removePunctuation(String content) throws IOException;

    //TODO find average word length
    double getNumberOfCharacters(String text) throws IOException;

}
