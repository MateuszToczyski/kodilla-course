package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.*;

public class Forum {

    private final List<ForumUser> userList;

    public Forum() {

        userList = new LinkedList<>();

        userList.add(new ForumUser(1, "John", 'M', LocalDate.of(1992, 10, 8), 10));
        userList.add(new ForumUser(2, "Sandy", 'F', LocalDate.of(1990, 8, 7), 5));
        userList.add(new ForumUser(3, "Nick", 'M', LocalDate.of(2005, 1, 8), 0));
        userList.add(new ForumUser(4, "Amy", 'F', LocalDate.of(1995, 10, 8), 0));
        userList.add(new ForumUser(5, "Sam", 'M', LocalDate.of(1990, 5, 10), 15));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
