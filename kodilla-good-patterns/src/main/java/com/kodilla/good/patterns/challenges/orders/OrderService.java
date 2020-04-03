package com.kodilla.good.patterns.challenges.orders;

public class OrderService {
    public Order createOrder(OrderRequest request) {
        return new Order(request.getProductId(), request.getQuantity());
    }
}
