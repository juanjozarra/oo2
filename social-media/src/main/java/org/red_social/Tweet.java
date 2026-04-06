package org.red_social;


public class Tweet {
    private final String text;

    public Tweet(String text) {
        if(text == null || text.isBlank())
            throw new IllegalArgumentException("Text cannot be null or empty");

        if(text.length()> 280) {
            throw new IllegalArgumentException("Text cannot be longer than 280 characters");
        }
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
