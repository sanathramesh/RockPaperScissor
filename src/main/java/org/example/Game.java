package org.example;

import org.example.database.GameHistory;
import org.example.enums.GameStatus;
import org.example.model.GameSummary;
import org.example.model.Player;

class Game {
    public Player player1;
    public Player player2;

    public GameStatus gameStatus;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Character player1Choice, player2Choice;
        try {
            player1Choice = player1.pickChoice();
            player2Choice = player2.pickChoice();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        this.gameStatus = matchStatus(player1Choice, player2Choice);
        GameSummary gameSummary = getGameSummary(player1Choice, player2Choice);
        if (gameSummary != null) {
            System.out.println(gameSummary);
            GameHistory.addGame(gameSummary);
        }

    }

    private GameSummary getGameSummary(Character player1Choice, Character player2Choice) {
        switch (this.gameStatus) {
            case WON:
                return new GameSummary(this.player1, player1Choice, this.player2, player2Choice, this.player1);
            case LOST:
                return new GameSummary(this.player1, player1Choice, this.player2, player2Choice, this.player2);
            case TIED:
                return new GameSummary(this.player1, player1Choice, this.player2, player2Choice, null);
        }
        return null;
    }

    private GameStatus matchStatus(Character playerChoice, Character botChoice) {
        GameStatus status = null;
        switch (playerChoice) {
            case 'r':
                if (botChoice == 'r')
                    status = GameStatus.TIED;
                else if (botChoice == 'p')
                    status = GameStatus.LOST;
                else
                    status = GameStatus.WON;
                break;
            case 'p':
                if (botChoice == 'r')
                    status = GameStatus.WON;
                else if (botChoice == 'p')
                    status = GameStatus.TIED;
                else
                    status = GameStatus.LOST;
                break;
            case 's':
                if (botChoice == 'r')
                    status = GameStatus.LOST;
                else if (botChoice == 'p')
                    status = GameStatus.WON;
                else
                    status = GameStatus.TIED;
                break;
        }
        return status;
    }
}