package org.example;

import org.example.options.Option;

public class Game {
    public static String playGame(Option player1, Option player2) {
        if(player1.getName().equals(player2.getName())) {
            return "Draw";
        }
        if(player1.winsTo(player2)) {
            return "Player 1 win with: " + player1.getName() ;
        }
        return "Player 2 win with: " + player2.getName();
    }
}
