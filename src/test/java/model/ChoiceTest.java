package model;

import org.example.model.Choice;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ChoiceTest {

    @Test
    void validateChoice() {
        List<Character> correctInput = List.of(new Character[]{'r', 's', 'p'}) ;
        List<Character> wrongInput = List.of(new Character[]{'e', 'l', 'm'});

        for(Character input : correctInput) {
            assertTrue(Choice.validateChoice(input));
        }
        for(Character input : wrongInput) {
            assertFalse(Choice.validateChoice(input));
        }

    }

    @Test
    void randomChoiceGenerator() {
        Set<Character> set = new HashSet<>(List.of(new Character[]{'r', 's', 'p'}));
        Character randomChoice = Choice.randomChoiceGenerator();
        assertTrue(set.contains(randomChoice));
    }
}