package com.upgrad.frs;

public abstract class Ticket {
    private int id;
    private int duration;
    private String pnrNumber, placeOfDeparture, destination, departureDate, departureTime, arrivalDate, arrivalTime, seatNumber;
    private Flight flight;
    private Passenger passenger;
    private float ticketPrice;
    private boolean status;

    //Constructor overloading
    public Ticket(String departureDate, String departureTime, String arrivalDate, String arrivalTime, String seatNumber, int duration){
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.departureTime = arrivalTime;
        this.seatNumber = seatNumber;
        this.duration = duration;
    }

    //providing Ticket constructor
    public Ticket(String pnrNumber, String placeOfDeparture, String destination, String departureDate, String departureTime, String arrivalDate, String arrivalTime, String seatNumber, int duration, float ticketPrice, Flight flight, Passenger passenger){
        this(departureDate, departureTime, arrivalDate, arrivalTime, seatNumber, duration);
        this.flight = flight;
        this.passenger = passenger;
        this.id = passenger.getId();
        this.pnrNumber = pnrNumber;
        this.placeOfDeparture = placeOfDeparture;
        this.destination = destination;
        this.ticketPrice = ticketPrice;
        status = true;
        flight.updateBookedSeat(); // to update the number of booked seats everytime a ticket is created
    }

    //method for cancelling tickets
    public void cancelTicket(){
        status = false;
    }

    //Checking Ticket Status Canceled or active
    public boolean checkStatus(){
        return status;
    }

    //check flight duration
    public int checkFlightDuration(){
           return duration;
    }

//getters and setters(some attributes cannot have setter methods)
    public int getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public String getPlaceOfDeparture() {
        return placeOfDeparture;
    }

    public void setDepartureLocation(String placeOfDeparture) {
        this.placeOfDeparture = placeOfDeparture;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

}
