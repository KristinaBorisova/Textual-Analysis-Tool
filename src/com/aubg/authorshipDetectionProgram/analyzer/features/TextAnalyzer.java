package com.aubg.authorshipDetectionProgram.analyzer.features;

import java.io.IOException;

public interface TextAnalyzer {
    // a class to help me with text analysis of a single file/text content entry

    String removePunctuation(String content) throws IOException;

    double getNumberOfCharacters(String text) throws IOException;

    double getNumberOfWords(String text) throws IOException;

}
