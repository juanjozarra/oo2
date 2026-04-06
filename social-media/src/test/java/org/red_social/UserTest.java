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

        assertEquals(1, user.getTweets().size());
        assertEquals("First tweet", user.getTweets().get(0).getText());
        assertNotNull(user.getRetweets().get(0));
        assertEquals("Another tweet", user.getRetweets().get(0).getOriginal().getText());
    }
}
