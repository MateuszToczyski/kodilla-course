package com.kodilla.patterns2.observer.homework;

public class Task {

    private final String name;
    private boolean solved;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isSolved() {
        return solved;
    }

    public void markAsSolved() {
        solved = true;
    }
}
