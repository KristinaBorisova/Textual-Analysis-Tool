package com.aubg.authorshipDetectionProgram.ui.fileInput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHelper {


    public String[] getContentFromFile(String fileLocation) throws IOException {
        FileReader fileReader = new FileReader (fileLocation);
        ArrayList<String> fileContent = new ArrayList<> ();
        StringBuffer singleText = new StringBuffer ();
        String line;

        try (BufferedReader bufferedReader = new BufferedReader (fileReader)) {
            while ((line = bufferedReader.readLine ()) != null) {

                if (!line.equals ("")) {
                    singleText.append (line);
                } else if (singleText.length () > 0) {
                    fileContent.add (singleText.toString ());
                    singleText = new StringBuffer ();
                }
            }
            if (singleText.length () > 0) {
                fileContent.add (singleText.toString ());
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return fileContent.toArray (new String[fileContent.size ()]);
    }
}
