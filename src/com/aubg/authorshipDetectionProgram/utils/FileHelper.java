package com.aubg.authorshipDetectionProgram.utils;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static javax.swing.JFileChooser.APPROVE_OPTION;

public class FileHelper {

    public String getFileLocationFromUi() {
        String fileLocation = null;
        JFileChooser fileChooser = new JFileChooser ();
        fileChooser.addChoosableFileFilter (new FileNameExtensionFilter ("Text Files", "txt", "text"));
        if (fileChooser.showOpenDialog (null) == APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile ();
            fileLocation = file.getAbsolutePath ();
        }
        return fileLocation;
    }

    public String[] getContentFromFile(String fileLocation) throws IOException {
        String[] fileContent2 = null;
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
