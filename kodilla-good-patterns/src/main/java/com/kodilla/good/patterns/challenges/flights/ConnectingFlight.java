package com.kodilla.good.patterns.challenges.flights;

public class ConnectingFlight {

    private Flight firstFlight;
    private Flight secondFlight;

    public ConnectingFlight(Flight firstFlight, Flight secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }

    public Flight getFirstFlight() {
        return firstFlight;
    }

    public Flight getSecondFlight() {
        return secondFlight;
    }
}
