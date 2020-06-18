package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FatHeadPizzaDecorator extends AbstractPizzaDecorator {

    public FatHeadPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + fat head crust";
    }
}
