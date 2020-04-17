package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBuilder() {

        Bigmac bigmac = new Bigmac.Builder()
                .bun(Bigmac.Bun.SESAME)
                .sauce(Bigmac.Sauce.BBQ)
                .burgerCount(2)
                .ingredient(Bigmac.Ingredient.BACON)
                .ingredient(Bigmac.Ingredient.ONION)
                .ingredient(Bigmac.Ingredient.PEPPERS)
                .build();

        Assert.assertEquals(Bigmac.Bun.SESAME, bigmac.getBun());
        Assert.assertEquals(Bigmac.Sauce.BBQ, bigmac.getSauce());
        Assert.assertEquals(2, bigmac.getBurgerCount());
        Assert.assertEquals(3, bigmac.getIngredients().size());
    }
}
