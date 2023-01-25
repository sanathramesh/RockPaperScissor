package org.example.model;

import java.util.*;

public class Choice {
    public static final Character[] choices = new Character[]{'r', 'p', 's'};
    public static final Set<Character> choicesSet = new HashSet<>(List.of(choices));
    public static final HashMap<Character, String> choiceMap;

    static {
        choiceMap = new HashMap<>();
        choiceMap.put('r', "ROCK");
        choiceMap.put('p', "PAPER");
        choiceMap.put('s', "SCISSOR");
    }

    public static boolean validateChoice(char choice) {
        return choicesSet.contains(choice);
    }

    public static Character randomChoiceGenerator() {
        int randomIndex = new Random().nextInt(choices.length);
        return choices[randomIndex];
    }
}
