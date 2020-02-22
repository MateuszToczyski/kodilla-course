package com.kodilla.stream.world;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        Country russia = new Country(new BigDecimal("140000000"));
        Country germany = new Country(new BigDecimal("80000000"));
        Country uk = new Country(new BigDecimal("60000000"));

        Country nigeria = new Country(new BigDecimal("190000000"));
        Country ethiopia = new Country(new BigDecimal("110000000"));
        Country egypt = new Country(new BigDecimal("100000000"));

        Continent europe = new Continent();
        Continent africa = new Continent();

        europe.addCountry(russia);
        europe.addCountry(germany);
        europe.addCountry(uk);

        africa.addCountry(nigeria);
        africa.addCountry(ethiopia);
        africa.addCountry(egypt);

        World world = new World();

        world.addContinent(europe);
        world.addContinent(africa);

        assertEquals(new BigDecimal("680000000"), world.getPeopleQuantity());
    }
}
