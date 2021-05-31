/*
 * --- Upgrad-C6 FLight Reservation Project ---
 * 1. UML class diagram is implemented
 * 2. Abstraction concept implemented- checkpoint 2
 * 3. Aggregation and Composition Relationship Implemented checkpoint 3
 * 4. Generalization and Class Encapsulation implemented- checkpoint 4
 * 5. Polymorphism implemented- checkpoint 5
 *
 */
package com.upgrad.frs;

public class Main {

    // method accepts either Regular Ticket or Tourist Ticket and print respective pnr number
    public static void  printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnrNumber());
    }

    public static void main(String[] args) {

        // Creating Flight object
         Flight flight = new Flight(1, "AB56", 200);

         //Creating Regular Passenger object
         Passenger passenger1 = new Passenger("Name1", "1111111111", "name1@gmail.com", "Street1", "State1", "City1");
         RegularTicket regular = new RegularTicket("food", "XC43AB", "HOME1", "Destination1", "2/6/2021", "8:00 AM", "2/6/2021","11:00 AM", "27C", 4, 900, flight, passenger1);

        //creating Tourist Passenger object
        Passenger passenger2 = new Passenger("Name2", "1111111111", "name2@gmail.com", "Street2", "State2", "City2");
        TouristTicket tourist = new TouristTicket("Hotel1","Tourist Spot1","XC56DE", "HOME2", "Destination2", "2/6/2021", "8:00 AM", "2/6/2021", "11:00 AM", "11A", 4, 1000, flight, passenger2);


        System.out.print("Regular Ticket PNR number: ");
        //calling the printTicketDetails() method for printing regular ticket pnr number
        printTicketDetails(regular);
        //calling the printTicketDetails() method for printing tourist ticket pnr number
        System.out.print("Regular Ticket PNR number: ");
        printTicketDetails(tourist);

    }

}
