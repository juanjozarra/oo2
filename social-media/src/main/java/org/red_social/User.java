package org.red_social;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String screenName;
    private final List<Tweet> tweets;
    private final List<ReTweet> retweets;

    public User(String screenName){
        this.screenName = screenName;
        this.tweets = new ArrayList<Tweet>();
        this.retweets = new ArrayList<ReTweet>();
    }

    public String getScreenName() {
        return screenName;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public List<ReTweet> getRetweets() {
        return retweets;
    }

    public void postTweet(String text){
        tweets.add(new Tweet(text));
    }

    public void doReTweet(Tweet tweet){
        retweets.add(new ReTweet(tweet));
    }

}
