package com.aubg.authorshipDetectionProgram.ui;

public enum UserAction {
    //define constant variable
    consoleInput ("1"), fileInput ("2"),
    // constant variables for continuous user console input
    endOfFile ("+"),
    continueInput, endInput,
    yes ("Y"), no ("N");

    public final String value;

    UserAction() {
        this.value = "";
    }

    UserAction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

