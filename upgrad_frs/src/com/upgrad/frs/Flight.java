package com.upgrad.frs;

public class Flight {
    private final int id;
    private String flightNumber;
    private int capacity;
    private int bookedSeat;
    private  boolean availability;


    //Flight constructor to initialize the Flight object
    public Flight(int id, String flightNumber, int capacity){
           this.id = id;
           this.flightNumber = flightNumber;
           this.capacity = capacity;
           bookedSeat = 0;
           availability = true;
    }


    public void updateBookedSeat(){

        if ((bookedSeat < capacity)) {
            bookedSeat++;
        } else {
            System.out.println();
        }

    }
    //return the flight number
    public String getFlightNumber() {
        return flightNumber;
    }

    //return the flight capacity
    public int getCapacity() {
        return capacity;
    }

    // return the number of seat booked
    public int getBookedSeat() {
        return bookedSeat;
    }

    //return flight ia available or not
    public boolean getAvailability(){
        return availability;
    }

    //set flight availability
    private void setAvailability(boolean availability){
           this.availability = availability;
    }
}
