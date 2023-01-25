package org.example.model;

public class GameSummary {
    public Player firstPlayer;
    public Character firstPlayerChoice;
    public Player secondPlayer;
    public Character secondPlayerChoice;
    public Player winner;

    public GameSummary(Player firstPlayer, Character firstPlayerChoice,
                       Player secondPlayer, Character secondPlayerChoice, Player winner) {
        this.firstPlayer = firstPlayer;
        this.firstPlayerChoice = firstPlayerChoice;
        this.secondPlayer = secondPlayer;
        this.secondPlayerChoice = secondPlayerChoice;
        this.winner = winner;
    }

    public String toString() {
        String result = firstPlayer.name + " choice : " + firstPlayerChoice + " --- "
                + secondPlayer.name + " choice : " + secondPlayerChoice + " --- result : ";
        if (this.winner == null) {
            result = result + " Match Tied";
        } else {
            result = result + this.winner.name + " WON";
        }
        return result;
    }
}
