package com.kodilla.patterns.factory.tasks;

public interface Task {
    void execute();
    String getName();
    boolean isExecuted();
}