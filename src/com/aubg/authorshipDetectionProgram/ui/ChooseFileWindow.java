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
        //create a variable to hold the file content
        String[] userFileContent = null;
        //get file content
        //..
        // get file location
        String fileLocation = null;
        JFileChooser fileChooser = new JFileChooser ();
        fileChooser.addChoosableFileFilter (new FileNameExtensionFilter ("Text Files",
                "txt",
                "text"));
        if (fileChooser.showOpenDialog (null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile ();
            fileLocation = file.getAbsolutePath ();
            //print file content for check
            //pass file content to the next function
        }
        System.out.println(fileLocation);
        return userFileContent;
    }

}
