package org.red_social;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String screenName;
    private List<Tweet> tweets;

    public User(String screenName){
        this.screenName = screenName;
        this.tweets = new ArrayList<Tweet>();
    }

    public String getScreenName() {
        return screenName;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void postTweet(String text){
        tweets.add(new Tweet(text));
    }

    public void doReTweet(Tweet tweet){
        tweets.add(new ReTweet(tweet));
    }

}
