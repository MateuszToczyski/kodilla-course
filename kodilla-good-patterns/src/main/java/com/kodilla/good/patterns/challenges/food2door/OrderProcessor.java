package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.suppliers.Supplier;

public class OrderProcessor {
    public void process(Supplier supplier, Order order) {
        supplier.process(order);
        System.out.println(order.getStatus().toString());
    }
}