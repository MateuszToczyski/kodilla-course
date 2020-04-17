package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.publisher.SocialPublisher;

public class User {

    private final String name;
    private String lastPost;
    protected SocialPublisher publisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }

    public String getLastPost() {
        return lastPost;
    }

    public void share() {
        lastPost = publisher.share();
        System.out.println(lastPost);
    }
}
