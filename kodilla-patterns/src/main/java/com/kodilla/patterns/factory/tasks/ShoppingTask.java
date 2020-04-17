package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private final String name;
    private final String product;
    private final double quantity;
    private boolean executed;

    public ShoppingTask(String name, String product, double quantity) {
        this.name = name;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public void execute() {
        executed = true;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean isExecuted() {
        return executed;
    }
}
