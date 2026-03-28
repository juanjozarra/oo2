package org.example;

import org.example.options.Option;
import org.example.options.Rock;
import org.example.options.Scissor;
import org.example.options.Spock;

public class Application {
    public static void main(String[] args) {
        Option player1 = new Spock();
        Option player2 = new Rock();

        System.out.print(Game.playGame(player1, player2));
    }
}
