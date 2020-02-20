package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int id;
    private final String name;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(final int id, final String name, final char gender,
                     final LocalDate dateOfBirth, final int numberOfPosts) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }
}
