package org.red_social;

public class ReTweet extends Tweet{
    private final Tweet original;

    public ReTweet(Tweet original) {
        super(original.getText());
        this.original = original;
    }

    public Tweet getOriginal() {
        return original;
    }
}
