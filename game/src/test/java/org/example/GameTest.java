package org.example;

import org.example.options.Lizard;
import org.example.options.Option;
import org.example.options.Papper;
import org.example.options.Rock;
import org.example.options.Scissor;
import org.example.options.Spock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {

    private Option rock;
    private Option papper;
    private Option scissor;
    private Option lizard;
    private Option spock;

    @BeforeEach
    public void setUp() {
        rock = new Rock();
        papper = new Papper();
        scissor = new Scissor();
        lizard = new Lizard();
        spock = new Spock();
    }

    @Test
    public void testRockWins() {
        assertTrue(rock.winsTo(scissor));
        assertTrue(rock.winsTo(lizard));
        assertFalse(rock.winsTo(papper));
        assertFalse(rock.winsTo(spock));
        assertFalse(rock.winsTo(rock));
    }

    @Test
    public void testPapperWins() {
        assertTrue(papper.winsTo(rock));
        assertTrue(papper.winsTo(spock));
        assertFalse(papper.winsTo(scissor));
        assertFalse(papper.winsTo(lizard));
        assertFalse(papper.winsTo(papper));
    }

    @Test
    public void testScissorWins() {
        assertTrue(scissor.winsTo(papper));
        assertTrue(scissor.winsTo(lizard));
        assertFalse(scissor.winsTo(rock));
        assertFalse(scissor.winsTo(spock));
        assertFalse(scissor.winsTo(scissor));
    }

    @Test
    public void testLizardWins() {
        assertTrue(lizard.winsTo(papper));
        assertTrue(lizard.winsTo(spock));
        assertFalse(lizard.winsTo(rock));
        assertFalse(lizard.winsTo(scissor));
        assertFalse(lizard.winsTo(lizard));
    }

    @Test
    public void testSpockWins() {
        assertTrue(spock.winsTo(rock));
        assertTrue(spock.winsTo(scissor));
        assertFalse(spock.winsTo(papper));
        assertFalse(spock.winsTo(lizard));
        assertFalse(spock.winsTo(spock));
    }

    @Test
    public void testGamePlayDraw() {
        assertEquals("Draw", Game.playGame(rock, rock));
        assertEquals("Draw", Game.playGame(papper, papper));
        assertEquals("Draw", Game.playGame(scissor, scissor));
        assertEquals("Draw", Game.playGame(lizard, lizard));
        assertEquals("Draw", Game.playGame(spock, spock));
    }

    @Test
    public void testGamePlayPlayer1Wins() {
        assertEquals("Player 1 win with: rock", Game.playGame(rock, scissor));
        assertEquals("Player 1 win with: rock", Game.playGame(rock, lizard));
        
        assertEquals("Player 1 win with: papper", Game.playGame(papper, rock));
        assertEquals("Player 1 win with: papper", Game.playGame(papper, spock));
        
        assertEquals("Player 1 win with: scissor", Game.playGame(scissor, papper));
        assertEquals("Player 1 win with: scissor", Game.playGame(scissor, lizard));
        
        assertEquals("Player 1 win with: lizard", Game.playGame(lizard, papper));
        assertEquals("Player 1 win with: lizard", Game.playGame(lizard, spock));
        
        assertEquals("Player 1 win with: spock", Game.playGame(spock, rock));
        assertEquals("Player 1 win with: spock", Game.playGame(spock, scissor));
    }

    @Test
    public void testGamePlayPlayer2Wins() {
        // Player 2 wins when Player 1 plays an option that loses to Player 2
        assertEquals("Player 2 win with: papper", Game.playGame(rock, papper));
        assertEquals("Player 2 win with: spock", Game.playGame(rock, spock));
        
        assertEquals("Player 2 win with: scissor", Game.playGame(papper, scissor));
        assertEquals("Player 2 win with: lizard", Game.playGame(papper, lizard));
        
        assertEquals("Player 2 win with: rock", Game.playGame(scissor, rock));
        assertEquals("Player 2 win with: spock", Game.playGame(scissor, spock));
        
        assertEquals("Player 2 win with: rock", Game.playGame(lizard, rock));
        assertEquals("Player 2 win with: scissor", Game.playGame(lizard, scissor));
        
        assertEquals("Player 2 win with: papper", Game.playGame(spock, papper));
        assertEquals("Player 2 win with: lizard", Game.playGame(spock, lizard));
    }
}
