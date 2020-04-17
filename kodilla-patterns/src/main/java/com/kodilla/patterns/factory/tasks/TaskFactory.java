package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public enum Type {
        SHOPPING,
        PAINTING,
        DRIVING
    }

    public Task createTask(Type type, String name) {
        switch(type) {
            case SHOPPING:
                return new ShoppingTask(name, "Example product", 10);
            case PAINTING:
                return new PaintingTask(name, "red", "wall");
            case DRIVING:
                return new DrivingTask(name, "home", "car");
            default:
                return null;
        }
    }
}
