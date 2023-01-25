package org.example.enums;

public enum Errors {
    INVALID_INPUT("Invalid Choice-Please pick r for Rock, p for paper and s for scissor");
    private final String name;

    Errors(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
