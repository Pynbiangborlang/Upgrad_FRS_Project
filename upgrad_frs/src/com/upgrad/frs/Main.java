/*
* --- Upgrad-C6 FLight Reservation Project ---
* 1. Abstraction concept implemented
* 2. Aggregation and Composition Relationship Implemented
* 3. Generalization and Class Encapsulation implemented
* */
package com.upgrad.frs;

public class Main {

    public static void main(String[] args) {
	// write your code here
         Flight flight = new Flight(1, "AB56", 200);

         //Creating Regular Passenger object
         Passenger passenger1 = new Passenger("Name1", "1111111111", "name1@gmail.com", "Street1", "State1", "City1");
         RegularTicket regular = new RegularTicket("food", "XC43AB", "HOME1", "Destination1", "2/6/2021", "8:00 AM", "2/6/2021","11:00 AM", "27C", 4, 900, flight, passenger1);

        //creating Tourist Passenger object
        Passenger passenger2 = new Passenger("Name2", "1111111111", "name2@gmail.com", "Street2", "State2", "City2");
        TouristTicket tourist = new TouristTicket("Hotel1","Tourist Spot1","XC56DE", "HOME2", "Destination2", "2/6/2021", "8:00 AM", "2/6/2021", "11:00 AM", "11A", 4, 1000, flight, passenger2);

        System.out.println("Regular Ticket PNR NUmber: " + regular.getPnrNumber());
        System.out.println("Tourist Ticket PNR NUmber: " + tourist.getPnrNumber());

        //Flight Details
        System.out.println("FLIGHT DETAILS");
        System.out.println("Flight Number: " +flight.getFlightNumber());
        System.out.println("Flight Capacity: "+ flight.getCapacity());
        System.out.println("Seats Booked: "+flight.getBookedSeat());

    }

}
