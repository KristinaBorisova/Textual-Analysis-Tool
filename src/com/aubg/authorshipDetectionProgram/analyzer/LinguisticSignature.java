package com.aubg.authorshipDetectionProgram.analyzer;

import com.aubg.authorshipDetectionProgram.ui.ConsoleMessages;

import java.util.HashMap;
import java.util.Map;

public class LinguisticSignature {
    //This class should form the calculated values for each feature for a given text

        ConsoleMessages messageManager = new ConsoleMessages ();

        private HashMap<SignatureFeature, Double> signatureValues = new HashMap<> ();

        public void setFeature(SignatureFeature featureName, double value) {
            signatureValues.put (featureName, value);
        }

        @Override
        public String toString() {
            StringBuilder dataManager = new StringBuilder ();
            for (Map.Entry<SignatureFeature, Double> signature : signatureValues.entrySet ()) {
                dataManager.append (signature.getKey ().name ());
                dataManager.append (" | ");
                dataManager.append (signature.getValue ());
                dataManager.append ("\n");
            }
            return dataManager.toString ();
        }

        private String getFeatureName(LinguisticSignature signature) {
            for (Map.Entry<SignatureFeature, Double> signatureFeature : signatureValues.entrySet ()) {
                return signatureFeature.getKey ().name ();
            }
            return null;
        }

//        private Double getDefaultFeatureWeight(SignatureFeature featureAnalyzed) {
//            Features feature = new Features ();
//            double featureWeight = 0;
//
//            switch (featureAnalyzed) {
//                case AVG_NUMBER_OF_WORDS -> featureWeight = feature.getFeature (SignatureFeature.AVG_NUMBER_OF_WORDS).getDefaultWeight ();
//                case AVG_WORD_LENGTH_FEATURE -> featureWeight = feature.getFeature (SignatureFeature.AVG_WORD_LENGTH_FEATURE).getDefaultWeight ();
//                case SENTENCE_COMPLEXITY_FEATURE -> featureWeight = feature.getFeature (SignatureFeature.SENTENCE_COMPLEXITY_FEATURE).getDefaultWeight ();
//                case HAPAX_LEGOMENA_RATIO_FEATURE -> featureWeight = feature.getFeature (SignatureFeature.HAPAX_LEGOMENA_RATIO_FEATURE).getDefaultWeight ();
//                case TYPE_TOKEN_RATIO_FEATURE -> featureWeight = feature.getFeature (SignatureFeature.TYPE_TOKEN_RATIO_FEATURE).getDefaultWeight ();
//                default -> messageManager.featureNotFound ();
//            }
//            return featureWeight;
//        }
//
//        public Double getFeatureValue(SignatureFeature feature) {
//            for (Map.Entry<SignatureFeature, Double> signature : signatureValues.entrySet ()) {
//                if (feature.name ().equals (signature.getKey ().name ())) {
//                    return signature.getValue ();
//                }
//            }
//            return null;
//        }
//
//        public double calculateSimilarity(LinguisticSignature secondSignature) {
//            double finalResult = 0;
//            for (SignatureFeature feature : SignatureFeature.values ()) {
//                double delta = Math.abs (getFeatureValue (feature) - secondSignature.getFeatureValue (feature));
//                finalResult = finalResult + delta * getDefaultFeatureWeight (feature);
//            }
//            return finalResult;
//        }
}
