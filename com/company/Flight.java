package com.company;

public class Flight {


    public String flightNumber;
    public String airline;
    private int capacity;
    public int bookedSeats;


    public Flight(String flightNumber, String airline,
                   int capacity,int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.setCapacity(capacity);
        this.bookedSeats = bookedSeats;
    }


    public String getFlightDetails() {
        return FlightDetails;
    }

    public boolean checkAvailability() {
        return checkAvailability;
    }

    public void incrementBookingCounter() {
        return incrementBookingCounter;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private class FlightDetails {
    }

