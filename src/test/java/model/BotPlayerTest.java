package model;

import org.example.model.BotPlayer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BotPlayerTest {

    @Test
    void pickChoice() {
        Set<Character> set = new HashSet<>(List.of(new Character[]{'r', 's', 'p'}));
        BotPlayer botPlayer = new BotPlayer();
        Character botPlayerChoice = botPlayer.pickChoice();
        assertTrue(set.contains(botPlayerChoice));
    }
}