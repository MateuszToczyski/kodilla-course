package com.kodilla.good.patterns.challenges.flights;

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
}
