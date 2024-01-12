
# Authorship and Plagiarism Detection Program

**_About the project_**: 
Program that identifies and calculates plagiarism levels with the help of textual analysis algorithms. The aim of the program is to form a linguistic signature for every single text input. The signature consists of 5 double values which are based on values of the features from the text analyzing process. The final process includes comparison between the values of the different linguistic signatures. 

Technologies used:
☕ Java, SQL

**About the Authorship Detection Process:**

`Authorship detection` is the process of algorithmic identification of the author of a given text. The main idea behind the process is to extract various statistics from the text (the so-called "features" in the context of Machine Learning) so that the program is able to form a "Linguistic Signature" for every text.

Examples of features needed to form a linguistic signature are: The average number of words in a sentence or the average length of words. 

Why is it useful? 
Having the linguistic signatures of two texts (the sequence of numbers that represent the value of each feature) we can identify the similarity between the texts and the likelihood of them being written by the same author.

Nowadays the automated authorship detection is an area of active research interest and is applicable for: plagiarism detection, email filtering,  social science research, even in support of law cases in lawsuits.  


## **Definitions**

For the scope of the project, a few definitions and terms will be introducsed:

- tokens - separate Strings, that are formed after calling the method String.split("\s+") on a specific text.
    
- words  - not empty tokens, which do not include punctuation marks.

- sentences - a sequence of symbols, which is not empty, is terminated by "!,? or ." but excludes the punctuation, End of File, trailing and leading whitespaces.  
    
- phrases - a sequence of sentences, which is not empty and is divided by [,] or [:] or [;].

   
## **Features**

The program uses the following features to perfrom the text analysis and identify the values for the linguistic signature:

`Average number of words in a sentence` - overall number of words divided by the number of sentences.

`Average word length` - average number of symbols in a word after removing punctuation. 

`Type-Token Ration` - number of all different words used in the text divided by the overall number of words. This feature aims to checks the repetitiveness of the vocabulary in a single text entry.

`Unique Words ratio - the number of unique word (appearing only once in the text) divided by the overall number of words.  

`Sentence complexity` - the average number of phrases used in a sentence.



## **Project Architecture**
The project is following the MVC design pattern, as well as clean code and object-oriented principles.  
```bash
src
╷
└─ com.aubg.authorishipDetectionProgram
   └─ analyzer
        └─features
        ╷     └─AverageNumberOfWordsFeature.java
        ╷     └─AverageWordLengthFeature.java
        ╷     └─BaseFeature.java
        ╷     └─SentenceComplexityFeature.java
        ╷     └─UniqueWordsRatioFeature.java
        ╷     └─TextAnalyzer.java
              └─TextAnalyzerImpl.java
  └─ utils
        └─Features.java
        └─FileHelper.java
        └─LinguisticSignature.java
        └─SignatureFeature.java
  └─ core
        └─Manager.java
  └─ ui
        └─UiManager.java
        └─UiManagerImpl.java
        └─UserAction.java
        └─ConsoleMessages.java
        └─ChooseFileWindow.java
        └─ConsoleInputWindow.java
  └─ uml-diagrams
        └─authorshipDetectionProgram.uml
        └─ui.uml
 └─ Main.java
       
        
```

