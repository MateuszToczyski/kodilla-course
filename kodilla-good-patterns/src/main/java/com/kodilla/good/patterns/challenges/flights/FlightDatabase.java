package com.kodilla.good.patterns.challenges.flights;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlightDatabase {

    private List<Flight> flights;

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Flight> findFlightsByDeparturePoint(Airport airport) {
        return flights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(airport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsByDestination(Airport airport) {
        return flights.stream()
                .filter(flight -> flight.getDestinationAirport().equals(airport))
                .collect(Collectors.toList());
    }

    public List<Flight> findConnectingFlight(Airport departureAirport, Airport destinationAirport) {

        if(departureAirport == null || destinationAirport == null) {
            throw new InvalidParameterException("None of the arguments can be null");
        }

        Flight firstFlight = null;
        Flight secondFlight = null;

        for(Flight flight1 : flights) {
            if(flight1.getDepartureAirport().equals(departureAirport)) {
                for(Flight flight2 : flights) {
                    if(flight2.getDestinationAirport().equals(destinationAirport)) {
                        firstFlight = flight1;
                        secondFlight = flight2;
                    }
                }
            }
        }

        if(firstFlight != null) {
            return new ArrayList<>(Arrays.asList(firstFlight, secondFlight));
        } else {
            return null;
        }
    }
}
