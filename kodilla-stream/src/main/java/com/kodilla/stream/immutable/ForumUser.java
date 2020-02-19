package com.kodilla.stream.immutable;

public class ForumUser {

    final private String username;
    final private String realName;

    public ForumUser(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
