package org.example;

import org.example.model.BotPlayer;
import org.example.model.HumanPlayer;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void play() {
        Game game = new Game(new HumanPlayer("sanath"), new BotPlayer());
        List<String> inputs = List.of(new String[]{"r", "p", "s", " sanath "});
        for(String input : inputs) {
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            game.play();
        }
    }
}