package org.red_social;

public class ReTweet{
    private final Tweet original;

    public ReTweet(Tweet original) {
        this.original = original;
    }

    public Tweet getOriginal() {
        return original;
    }
}
