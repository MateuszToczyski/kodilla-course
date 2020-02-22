package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class World {

    final private List<Continent> continents;

    public World() {
        continents = new LinkedList<>();
    }

    public void addContinent(final Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
