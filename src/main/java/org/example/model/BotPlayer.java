package org.example.model;

public class BotPlayer extends Player {
    public BotPlayer() {
        super("BotPlayer");

    }


    public Character pickChoice() {
        return Choice.randomChoiceGenerator();
    }
}