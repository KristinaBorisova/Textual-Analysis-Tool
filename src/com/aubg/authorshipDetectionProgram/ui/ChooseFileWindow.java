package com.aubg.authorshipDetectionProgram.ui;
import java.io.*;
import java.util.ArrayList;
import javax.accessibility.Accessible;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import static javax.swing.JFileChooser.*;

public class ChooseFileWindow extends JComponent implements Accessible {
    private final ConsoleMessages msgManager;

    public ChooseFileWindow() {
        this.msgManager = new ConsoleMessages ();
    }

    public String[] getFileContent() throws IOException {
        //create a variable to hold the file content
        String[] userFileContent;
        //create a string to hold File location
        String fileLocation = getFileLocationFromUi ();
        //get file content
        userFileContent = getContentFromFile (fileLocation);
        return userFileContent;
    }

    private String getFileLocationFromUi() {
        String fileLocation = null;
        JFileChooser fileChooser = new JFileChooser ();
        fileChooser.addChoosableFileFilter (new FileNameExtensionFilter ("Text Files", "txt", "text"));
        if (fileChooser.showOpenDialog (null) == APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile ();
            fileLocation = file.getAbsolutePath();
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
                } else if(singleText.length () > 0){
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
