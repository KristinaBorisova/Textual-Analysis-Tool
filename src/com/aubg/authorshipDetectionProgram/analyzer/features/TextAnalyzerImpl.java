package com.aubg.authorshipDetectionProgram.analyzer.features;
import java.io.IOException;

public class TextAnalyzerImpl implements TextAnalyzer {

    @Override
    public String removePunctuation(String content) throws IOException {
        //TODO remove punctuation from sentences
        return null;
    }

    @Override
    public double getNumberOfCharacters(String text) throws IOException {
        //set a variable to hold the number of characters in a text entry
        double charactersCount = 0;
        //find average words length by calculating the number of characters after a text is stripped from its punctuation
        return charactersCount;
    }
}
