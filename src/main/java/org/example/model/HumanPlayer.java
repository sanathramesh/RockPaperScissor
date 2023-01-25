package org.example.model;

import java.util.Scanner;
import org.example.enums.Errors;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    public Character pickChoice() throws IllegalArgumentException{
        Scanner scan = new Scanner(System.in);
        char playerChoice;
        try {
            System.out.print("Enter your input r for Rock, p for Paper, s for Scissor : ");
            String input = scan.nextLine();
            input = input.trim();
            input = input.toLowerCase();
            if (input.length() != 1) {
                throw new IllegalArgumentException(Errors.INVALID_INPUT.getName());
            } else {
                playerChoice = input.charAt(0);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(Errors.INVALID_INPUT.getName());
        }
        if (!Choice.validateChoice(playerChoice)) {
            throw new IllegalArgumentException(Errors.INVALID_INPUT.getName());
        } else {
            return playerChoice;
        }
    }
}