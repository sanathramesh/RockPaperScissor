package org.example.model;

public abstract class Player {
    public String name;

    public Player(String name) {
        this.name = name;
    }


    public abstract Character pickChoice();

}
