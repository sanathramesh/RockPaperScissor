package model;

import org.example.model.HumanPlayer;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HumanPlayerTest {

    @Test
    void pickChoiceCorrect() {
        HumanPlayer humanPlayer = new HumanPlayer("sanath");
        List<String> inputs = List.of(new String[]{"r", "p", "s"});
        for(String input : inputs) {
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            assertEquals(input.charAt(0), humanPlayer.pickChoice());
        }
    }

    @Test
    void pickChoiceInvalid() {
        HumanPlayer humanPlayer = new HumanPlayer("sanath");
        List<String> inputs = List.of(new String[]{"e", "", "hello"});
        for(String input: inputs) {
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            assertThrows(IllegalArgumentException.class, humanPlayer::pickChoice);
        }
    }
}