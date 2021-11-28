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
}
