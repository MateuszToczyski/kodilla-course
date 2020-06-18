package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DoubleCheesePizzaDecorator extends AbstractPizzaDecorator {

    public DoubleCheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + double cheese";
    }
}
