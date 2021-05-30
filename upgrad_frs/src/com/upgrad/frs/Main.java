package com.upgrad.frs;

public class Main {

    public static void main(String[] args) {
	// write your code here
         Flight flight = new Flight(1, "AB56", 200);
         Passenger passenger1 = new Passenger("Rahul", "1111111111", "rahul@gmail.com", "Street1", "State1", "City1");
         Ticket ticket = new Ticket("X36Q9C", "Home1", "Destination1", 800, flight, passenger1);

         //print ticket details
        System.out.println("TICKET NUMBER: "+ticket.getId());
        System.out.println("PNR Number: "+ticket.getPnrNumber());
        System.out.println("Place of Departure: "+ticket.getPlaceOfDeparture());
        System.out.println("Destination: "+ticket.getDestination());
        System.out.println("Ticket Price: "+ticket.getTicketPrice());
        System.out.println("Flight Number"+ticket.getFlight().getFlightNumber());

        //Flight Details
        System.out.println("FLIGHT DETAILS");
        System.out.println("Flight Number: " +flight.getFlightNumber());
        System.out.println("Flight Capacity: "+ flight.getCapacity());
        System.out.println("Seats Booked: "+flight.getBookedSeat());

    }

}
