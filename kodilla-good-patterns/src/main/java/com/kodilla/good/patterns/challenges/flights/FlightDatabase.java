package com.kodilla.good.patterns.challenges.flights;

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

    public List<Flight> findDirectFlights(Airport departureAirport, Airport destinationAirport) {
        return flights.stream()
                .filter(flight ->
                        flight.getDepartureAirport().equals(departureAirport) &&
                        flight.getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList());
    }

    public List<ConnectingFlight> findConnectingFlights(Airport departureAirport, Airport destinationAirport) {

        if(departureAirport == null || destinationAirport == null) {
            throw new InvalidParameterException("None of the arguments can be null");
        }

        List<ConnectingFlight> connectingFlights = new ArrayList<>();

        for(Flight flight1 : flights) {
            if(flight1.getDepartureAirport().equals(departureAirport)) {
                for(Flight flight2 : flights) {
                    if(!flight1.equals(flight2) && flight2.getDestinationAirport().equals(destinationAirport)) {
                        connectingFlights.add(new ConnectingFlight(flight1, flight2));
                    }
                }
            }
        }

        return connectingFlights;
    }
}
