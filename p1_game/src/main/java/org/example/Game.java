package org.example;

import org.example.options.BaseOption;

public class Game {
    public static String playGame(BaseOption player1, BaseOption player2) {
        return player1.vs(player2);
    }
}
