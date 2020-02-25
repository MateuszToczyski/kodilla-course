package com.kodilla.exception.test;

import java.util.*;

public class ThirdChallenge {

    public static void main(String... args) {

        List<Flight> flights = new LinkedList<>();

        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("Warsaw", "Budapest"));
        flights.add(new Flight("Moscow", "London"));
        flights.add(new Flight("Moscow", "Budapest"));
        flights.add(new Flight("Berlin", "London"));

        FlightSearchEngine engine = new FlightSearchEngine();

        try {
            List<Flight> flightsFound = engine.findFlights("New York", flights);
            flightsFound.forEach(flight -> System.out.println(flight.getDepartureAirport()));
        } catch(RouteNotFoundException ex) {
            System.out.println("An exception was thrown: " + ex.getMessage());
        } finally {
            System.out.println("Program completed.");
        }
    }
}
