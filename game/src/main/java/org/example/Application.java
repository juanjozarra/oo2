package org.example;

import org.example.options.BaseOption;
import org.example.options.Stone;
import org.example.options.Spock;

public class Application {
    public static void main(String[] args) {
        BaseOption player1 = new Spock();
        BaseOption player2 = new Stone();

        System.out.print(Game.playGame(player1, player2));
    }
}
