package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalDateTime;
import java.util.Objects;

public class Flight {

    private int id;
    private int clientId;
    private Airport departureAirport;
    private Airport destinationAirport;
    private LocalDateTime time;

    public Flight(int id, int clientId, Airport departureAirport, Airport destinationAirport, LocalDateTime time) {
        this.id = id;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.time = time;
        this.clientId = clientId;
    }

    public int getId() {
        return id;
    }

    public int getClientId() {
        return clientId;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return id == flight.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
