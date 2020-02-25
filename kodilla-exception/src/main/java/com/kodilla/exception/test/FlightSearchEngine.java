package com.kodilla.exception.test;

import java.util.*;

public class FlightSearchEngine {

    public List<Flight> findFlights(String destinationAirport, List<Flight> flights)
            throws RouteNotFoundException {

        List<Flight> flightsFound = new LinkedList<>();

        for(Flight flight : flights) {
            if(flight.getArrivalAirport().equals(destinationAirport)) {
                flightsFound.add(flight);
            }
        }

        if(flightsFound.size() == 0) {
            throw new RouteNotFoundException("Cannot find a flight to: " + destinationAirport);
        }

        return flightsFound;
    }
}
