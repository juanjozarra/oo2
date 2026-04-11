package org.red_social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReTweetTest {

    @Test
    public void testReTweetKnowsSource() {
        Tweet original = new Tweet("Original message");
        ReTweet retweet = new ReTweet(original);

        assertEquals(original, retweet.getOriginal());
    }

    @Test
    public void testReTweetHasSameText() {
        Tweet original = new Tweet("Original message");
        ReTweet retweet = new ReTweet(original);

        assertEquals("Original message", retweet.getOriginal().getText());
    }
}
