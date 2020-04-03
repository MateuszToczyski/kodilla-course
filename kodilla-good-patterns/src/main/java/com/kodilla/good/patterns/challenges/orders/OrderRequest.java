package com.kodilla.good.patterns.challenges.orders;

public class OrderRequest {
    private int productId;
    private int quantity;

    public OrderRequest(int productId, int quantity) {
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
