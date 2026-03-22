package org.red_social;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User("juan");
    }

    @Test
    public void testKnowsAllTweets() {
        // Every user knows all the tweets they have posted.
        user.postTweet("First tweet");
        Tweet original = new Tweet("Another tweet");
        user.doReTweet(original);

        assertEquals(2, user.getTweets().size());
        assertEquals("First tweet", user.getTweets().get(0).getText());
        assertTrue(user.getTweets().get(1) instanceof ReTweet);
    }
}
