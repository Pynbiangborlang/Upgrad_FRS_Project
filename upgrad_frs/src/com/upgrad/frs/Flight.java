package com.upgrad.frs;

public class Flight {
    int id;
    int flightNumber;
    int capacity;
    private int bookedSeat;

    public void updateBookedSeat(int bookedSeat){
        this.bookedSeat = this.bookedSeat - bookedSeat;
    }
}
