package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements Pizza {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(20);
    }

    @Override
    public String getDescription() {
        return "Pizza";
    }
}
