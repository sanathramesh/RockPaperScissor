package org.example.database;

import org.example.model.GameSummary;

import java.util.ArrayList;
import java.util.List;

public class GameHistory {
    public static List<GameSummary> gameStatus = new ArrayList<>();

    public static void addGame(GameSummary gameSummary) {
        gameStatus.add(gameSummary);
    }

    public static void printGamesHistory() {
        System.out.println("---------Printing Game History---------");
        for (GameSummary gameSummary : gameStatus) {
            try {
                System.out.println(gameSummary.toString() + "\n");
            } catch (Exception ignored) {
            }
        }
    }
}
