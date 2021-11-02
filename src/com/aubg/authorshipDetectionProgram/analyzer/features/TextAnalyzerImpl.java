package com.aubg.authorshipDetectionProgram.analyzer.features;

import java.io.IOException;

public class TextAnalyzerImpl implements TextAnalyzer {

    @Override
    public String removePunctuation(String content) throws IOException {
        return cleanUpText (content);
    }

    //This private method removes the punctuation and excessive white space in the text input and replaces it with " "
    private String cleanUpText(String content) {
        String formattedContent = content.toLowerCase ().replaceAll ("[!.,:;\\-?<>#*'\"\\[(\\])\\n\\t\\\\]+|[!.,:;\\-?<>#*'\"\\[(\\])\\n\\t\\\\]+$", " ");
        formattedContent = formattedContent.trim ().replaceAll ("(\\s)+", "$1"); //remove excessive white space
        return formattedContent;
    }

    @Override
    public double getNumberOfCharacters(String text) throws IOException {
        //set a variable to hold the number of characters in a text entry
        double charactersCount = 0;
        //remove punctuation and excessive white space
        removePunctuation (text);
        for (int i = 0; i < text.length (); i++) {
            if (text.charAt (i) != ' ')
                charactersCount++;
        }
        return charactersCount;
    }

    @Override
    public double getNumberOfWords(String text) throws IOException {
        String userTextContent = removePunctuation (text);
        double wordsCounter = 0;
        userTextContent = text.trim ();
        String[] wordsInText = userTextContent.split ("\\s+");
        wordsCounter = wordsInText.length;
        return wordsCounter;
    }
}
