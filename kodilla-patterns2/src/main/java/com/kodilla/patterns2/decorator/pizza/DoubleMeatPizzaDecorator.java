package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DoubleMeatPizzaDecorator extends AbstractPizzaDecorator {

    public DoubleMeatPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(8));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + double meat";
    }
}