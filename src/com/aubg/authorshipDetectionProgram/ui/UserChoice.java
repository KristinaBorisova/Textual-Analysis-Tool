package com.aubg.authorshipDetectionProgram.ui;

public enum UserChoice {
    //define constant variable
    consoleInput ("1"), fileInput ("2");

    public final String value;

    UserChoice() {
        this.value = "";
    }

    UserChoice(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    }

