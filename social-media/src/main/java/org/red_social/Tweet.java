package org.red_social;

import java.util.Date;

public class Tweet {
    private String text;
    private Date date;

    public Tweet(String text) {
        if(text == null || text.isBlank())
            throw new IllegalArgumentException("Text cannot be null or empty");

        if(text.length()> 280) {
            throw new IllegalArgumentException("Text cannot be longer than 280 characters");
        }
        this.text = text;
        this.date = new Date();
    }

    public String getText() {
        return text;
    }

}
