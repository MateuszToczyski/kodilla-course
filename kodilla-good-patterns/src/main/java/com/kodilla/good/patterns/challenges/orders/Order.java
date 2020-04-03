package com.kodilla.good.patterns.challenges.orders;

public class Order {

    private int productId;
    private int quantity;

    public Order(int productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}
