package com.kodilla.stream.world;

import java.util.*;

public class Continent {

    final private List<Country> countries;

    public Continent() {
        countries = new LinkedList<>();
    }

    public void addCountry(final Country country) {
        countries.add(country);
    }

    public List<Country> getCountries() {
        List<Country> resultList = new LinkedList<>(countries);
        return resultList;
    }
}
