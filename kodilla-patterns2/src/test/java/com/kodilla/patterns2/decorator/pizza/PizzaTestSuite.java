package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaTestSuite {

    @Test
    public void testPizzaDecorators() {
        Pizza pizza = new BasicPizza();
        pizza = new DoubleCheesePizzaDecorator(pizza);
        pizza = new DoubleMeatPizzaDecorator(pizza);
        pizza = new FatHeadPizzaDecorator(pizza);
        assertEquals(new BigDecimal(43), pizza.getPrice());
        assertEquals("Pizza + double cheese + double meat + fat head crust", pizza.getDescription());
    }
}
