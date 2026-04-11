package org.red_social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TweetTest {

    @Test
    public void testValidTweet() {
        Tweet t = new Tweet("Hello");
        assertEquals("Hello", t.getText());
    }

    @Test
    public void testInvalidTweetEmptyOrBlank() {
        assertThrows(IllegalArgumentException.class, () -> new Tweet(""));
        assertThrows(IllegalArgumentException.class, () -> new Tweet("   "));
        assertThrows(IllegalArgumentException.class, () -> new Tweet(null));
    }

    @Test
    public void testInvalidTweetTooLong() {
        String longText = "a".repeat(281);
        assertThrows(IllegalArgumentException.class, () -> new Tweet(longText));
    }
}
