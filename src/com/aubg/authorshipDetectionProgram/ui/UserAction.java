package com.aubg.authorshipDetectionProgram.ui;

public enum UserAction {
    //define constant variable
    consoleInput ("1"), fileInput ("2");

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

