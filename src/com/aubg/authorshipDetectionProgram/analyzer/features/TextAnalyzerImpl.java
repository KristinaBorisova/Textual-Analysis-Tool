package com.aubg.authorshipDetectionProgram.analyzer.features;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    @Override
    public double getNumberOfSentences(String text) {
        double sentencesCount = 0;
        String[] split = text.trim ().split ("[!?.]");
        sentencesCount = split.length;
        return sentencesCount;
    }

    @Override
    public double getNumberOfPhrases(String content) throws IOException {
        int numberOfPhrases = 0;
        String matchingPunctuation = ",[\\w\\s]|:[\\w\\s]|;[\\w\\s].*?(\\.|\\!|\\?)";
        String regex = matchingPunctuation;
        Matcher m = Pattern.compile (regex).matcher (content);
        while (m.find ()) {
            numberOfPhrases++;
        }
        return numberOfPhrases;
    }

}
