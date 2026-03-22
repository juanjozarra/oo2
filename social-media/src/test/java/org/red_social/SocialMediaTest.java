package org.red_social;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SocialMediaTest {
    private SocialMedia sm;

    @BeforeEach
    public void setUp() {
        sm = new SocialMedia();
    }

    @Test
    public void testKnowsAllUsers() {
        sm.addUser("alice");
        sm.addUser("bob");

        assertEquals(2, sm.getUsers().size());
        assertTrue(sm.getUsers().containsKey("alice"));
        assertTrue(sm.getUsers().containsKey("bob"));
    }

    @Test
    public void testUsersIdentifiedByScreenName() {
        sm.addUser("alice");
        User alice = sm.getUser("alice");

        assertNotNull(alice);
        assertEquals("alice", alice.getScreenName());
    }

    @Test
    public void testTwoUsersCannotHaveSameScreenName() {
        sm.addUser("alice");

        assertThrows(IllegalArgumentException.class, () -> sm.addUser("alice"));
    }

    @Test
    public void testUserAndTweetsDeleted() {
        sm.addUser("alice");
        User alice = sm.getUser("alice");
        alice.postTweet("Hi!");

        sm.deleteUser("alice");

        assertNull(sm.getUser("alice"));
        assertFalse(sm.getUsers().containsKey("alice"));
    }
}
