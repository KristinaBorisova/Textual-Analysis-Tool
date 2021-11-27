package com.aubg.authorshipDetectionProgram.ui.fileInput;
import com.aubg.authorshipDetectionProgram.ui.ConsoleMessages;

import javax.accessibility.Accessible;
import javax.swing.*;
import java.io.IOException;

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
        String fileLocation = fileHelper.getFileLocationFromUi ();
        //get file content
        userFileContent = fileHelper.getContentFromFile (fileLocation);
        //print the content of the user file, formatted
        msgManager.printFileContent (userFileContent);
        return userFileContent;
    }
}
