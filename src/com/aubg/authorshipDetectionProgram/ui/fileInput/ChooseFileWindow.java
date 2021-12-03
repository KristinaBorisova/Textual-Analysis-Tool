package com.aubg.authorshipDetectionProgram.ui.fileInput;
import com.aubg.authorshipDetectionProgram.ui.ConsoleMessages;

import javax.accessibility.Accessible;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.IOException;

import static javax.swing.JFileChooser.APPROVE_OPTION;

public class ChooseFileWindow extends JComponent implements Accessible {
    private final ConsoleMessages msgManager;
    private final FileHelper fileHelper;

    public ChooseFileWindow() {
        this.msgManager = new ConsoleMessages ();
        this.fileHelper = new FileHelper ();
    }

    public String[] getFileContent() throws IOException {
        //create a variable to hold the file content
        String[] userFileContent;
        //create a string to hold File location
        String fileLocation = getFileLocationFromUi ();
        //get file content
        userFileContent = fileHelper.getContentFromFile (fileLocation);
        // display filepath in console
        msgManager.showFilePathMsg (new File (fileLocation));
        //print the content of the user file, formatted
        msgManager.printFileContent (userFileContent);
        return userFileContent;
    }

    private String getFileLocationFromUi() {
        String fileLocation = null;
        JFileChooser fileChooser = new JFileChooser ();
        fileChooser.addChoosableFileFilter (new FileNameExtensionFilter ("Text Files", "txt", "text"));
        if (fileChooser.showOpenDialog (null) == APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile ();
            fileLocation = file.getAbsolutePath ();
        }
        return fileLocation;
    }

}
