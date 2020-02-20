package com.kodilla.stream;

import com.kodilla.stream.forumuser.*;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, String> users =  forum.getUserList().stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> DAYS.between(user.getDateOfBirth(), LocalDate.now()) >= 20)
                .filter(user -> user.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, ForumUser::getName));

        users.entrySet().stream()
                .map(entry -> "id: " + entry.getKey() + ", name: " + entry.getValue())
                .forEach(System.out::println);
    }
}