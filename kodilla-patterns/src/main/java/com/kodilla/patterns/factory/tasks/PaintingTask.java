package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private final String name;
    private final String color;
    private final String item;
    private boolean executed;

    public PaintingTask(String name, String color, String item) {
        this.name = name;
        this.color = color;
        this.item = item;
    }

    @Override
    public void execute() {
        executed = true;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getItem() {
        return item;
    }

    @Override
    public boolean isExecuted() {
        return executed;
    }
}
