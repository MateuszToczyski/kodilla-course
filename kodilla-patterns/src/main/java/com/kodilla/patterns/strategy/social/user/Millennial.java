package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;

public class Millennial extends User {
    public Millennial(String name) {
        super(name);
        this.publisher = new FacebookPublisher();
    }
}
