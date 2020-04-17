package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private final String name;
    private final String destination;
    private final String vehicle;
    private boolean executed;

    public DrivingTask(String name, String destination, String vehicle) {
        this.name = name;
        this.destination = destination;
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        executed = true;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDestination() {
        return destination;
    }

    public String getVehicle() {
        return vehicle;
    }

    @Override
    public boolean isExecuted() {
        return executed;
    }
}
