package org.red_social;

import java.util.HashMap;
import java.util.Map;

public class SocialMedia {
    private final Map<String, User> users;

    public SocialMedia() {
        users = new HashMap<String, User>();
    }

    public User getUser(String screenName) {
        return users.getOrDefault(screenName, null);
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void deleteUser(String screenName) {
        users.remove(screenName);
    }

    public void addUser(String screenName) {
        if(users.containsKey(screenName)) {
            throw new IllegalArgumentException(screenName + " already exists");
        }
        users.put(screenName, new User(screenName));
    }
}
