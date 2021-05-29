package com.upgrad.frs;

public class Ticket {
    int id;
    int duration;
    String pnrNumber;
    String departureLocation;
    String destination;
    Flight flight;
    String departureDate;
    String departureTime;
    String arrivalDate;
    String arrivalTime;
    Passenger passenger;
    float ticketPrice;
    boolean status;

    public void cancelTicket(){
        status = false;
    }
    public boolean checkStatus(){
        return status;
    }

    public int checkFlightDuration(){
           return duration;
    }


}
