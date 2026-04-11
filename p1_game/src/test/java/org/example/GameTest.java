package org.example;

import org.example.options.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    private BaseOption stone;
    private BaseOption papper;
    private BaseOption scissor;
    private BaseOption lizard;
    private BaseOption spock;

    @BeforeEach
    public void setUp() {
        stone = new Stone();
        papper = new Papper();
        scissor = new Scissor();
        lizard = new Lizard();
        spock = new Spock();
    }

    @Test
    public void testStoneWins() {
        assertEquals("Stone", stone.vs(scissor));
        assertEquals("Stone", stone.vs(lizard));
        assertEquals("Papper", stone.vs(papper));
        assertEquals("Spock", stone.vs(spock));
        assertEquals("Draw", stone.vs(stone));
    }

    @Test
    public void testPapperWins() {
        assertEquals("Papper", papper.vs(stone));
        assertEquals("Papper", papper.vs(spock));
        assertEquals("Scissor", papper.vs(scissor));
        assertEquals("Lizard", papper.vs(lizard));
        assertEquals("Draw", papper.vs(papper));
    }

    @Test
    public void testScissorWins() {
        assertEquals("Scissor", scissor.vs(papper));
        assertEquals("Scissor", scissor.vs(lizard));
        assertEquals("Stone", scissor.vs(stone));
        assertEquals("Spock", scissor.vs(spock));
        assertEquals("Draw", scissor.vs(scissor));
    }

    @Test
    public void testLizardWins() {
        assertEquals("Lizard", lizard.vs(papper));
        assertEquals("Lizard", lizard.vs(spock));
        assertEquals("Stone", lizard.vs(stone));
        assertEquals("Scissor", lizard.vs(scissor));
        assertEquals("Draw", lizard.vs(lizard));
    }

    @Test
    public void testSpockWins() {
        assertEquals("Spock", spock.vs(stone));
        assertEquals("Spock", spock.vs(scissor));
        assertEquals("Papper", spock.vs(papper));
        assertEquals("Lizard", spock.vs(lizard));
        assertEquals("Draw", spock.vs(spock));
    }

    @Test
    public void testGamePlayDraw() {
        assertEquals("Draw", Game.playGame(stone, stone));
        assertEquals("Draw", Game.playGame(papper, papper));
        assertEquals("Draw", Game.playGame(scissor, scissor));
        assertEquals("Draw", Game.playGame(lizard, lizard));
        assertEquals("Draw", Game.playGame(spock, spock));
    }

    @Test
    public void testGamePlayPlayer1Wins() {
        assertEquals("Stone", Game.playGame(stone, scissor));
        assertEquals("Stone", Game.playGame(stone, lizard));

        assertEquals("Papper", Game.playGame(papper, stone));
        assertEquals("Papper", Game.playGame(papper, spock));

        assertEquals("Scissor", Game.playGame(scissor, papper));
        assertEquals("Scissor", Game.playGame(scissor, lizard));

        assertEquals("Lizard", Game.playGame(lizard, papper));
        assertEquals("Lizard", Game.playGame(lizard, spock));

        assertEquals("Spock", Game.playGame(spock, stone));
        assertEquals("Spock", Game.playGame(spock, scissor));
    }

    @Test
    public void testGamePlayPlayer2Wins() {
        // Player 2 wins when Player 1 plays an BaseOption that loses to Player 2
        assertEquals("Papper", Game.playGame(stone, papper));
        assertEquals("Spock", Game.playGame(stone, spock));

        assertEquals("Scissor", Game.playGame(papper, scissor));
        assertEquals("Lizard", Game.playGame(papper, lizard));

        assertEquals("Stone", Game.playGame(scissor, stone));
        assertEquals("Spock", Game.playGame(scissor, spock));

        assertEquals("Stone", Game.playGame(lizard, stone));
        assertEquals("Scissor", Game.playGame(lizard, scissor));

        assertEquals("Papper", Game.playGame(spock, papper));
        assertEquals("Lizard", Game.playGame(spock, lizard));
    }
}
