package org.example;
import org.example.database.GameHistory;
import org.example.model.BotPlayer;
import org.example.model.HumanPlayer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n-------WELCOME TO ROCK PAPER SCISSOR!!------\n");
        System.out.print("Enter your name player : ");
        String name = scan.nextLine();
        System.out.println();
        HumanPlayer humanPlayer = new HumanPlayer(name);
        BotPlayer botPlayer = new BotPlayer();
        Game game = new Game(humanPlayer, botPlayer);
        while (true) {
            game.play();
            System.out.print("\nDo you want to continue playing. If yes input y : ");
            String y = scan.nextLine();
            y = y.toLowerCase();
            if (!y.equals("y")) {
                System.out.println("I am exiting since it is not a y\n\n\n");
                break;
            }
            System.out.println();
        }
        GameHistory.printGamesHistory();
    }
}