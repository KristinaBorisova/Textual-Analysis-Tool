package com.aubg.authorshipDetectionProgram.ui;

import java.io.*;
import javax.accessibility.Accessible;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ChooseFileWindow extends JComponent implements Accessible {
    private final ConsoleMessages msgManager;

    public ChooseFileWindow() {
        this.msgManager = new ConsoleMessages ();
    }

    public String[] getFileContent() {
        //create a string to hold File location
        String fileLocation = getFileLocationFromUi();
        //create a variable to hold the file content
        String[] userFileContent = null;
        //get file content
        //..
        return userFileContent;
    }

    private String getFileLocationFromUi() {
        String fileLocation = null;
        JFileChooser fileChooser = new JFileChooser ();
        fileChooser.addChoosableFileFilter (new FileNameExtensionFilter ("Text Files", "txt", "text"));
        if (fileChooser.showOpenDialog (null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile ();
            fileLocation = file.getAbsolutePath ();
        }
        return fileLocation;
    }

    public String[] getContentFromFile(String fileLocation) throws IOException {
        String[] fileContent = null;
        //..
        return fileContent;
    }

}
