package com.upgrad.frs;

public class TouristTicket extends Ticket {

    private final int id;
    private String hotelAddress;
    private String[] touristLocation = new String[5];

    //constructor for Tourist Ticket
    public TouristTicket(String hotelAddress, String touristLocation, String pnrNumber, String placeOfDeparture, String destination, String departureDate, String departureTime, String arrivalDate, String arrivalTime, String seatNumber, int duration,  float ticketPrice, Flight flight, Passenger passenger){
        //calling parent(Ticket) constructor
        super(pnrNumber, placeOfDeparture,destination, departureDate, arrivalDate, departureTime, arrivalTime, seatNumber, duration, ticketPrice, flight, passenger);
        this.id =super.getId();
        this.hotelAddress = hotelAddress;
        this.touristLocation[0] = touristLocation;
    }

    //method for adding maximum 5 number of tourist locations
    void addTouristLocation(String touristLocation){
        if(this.touristLocation.length<5){
            int k=touristLocation.length()+1;
            this.touristLocation[k] = touristLocation;
        }else{
            System.out.println("you can add maximum 5 no of tourist locations");
        }
    }

    //method for removing a tourist location
    void removeTouristLocation(String touristLocation){
        for(int i=0; i<5; i++){
            if(this.touristLocation[i].equalsIgnoreCase(touristLocation)){
                this.touristLocation[i]= null;
            }
        }
    }

    //setters and getters
    public int getID(){
        return id;
    }
    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocation() {
        return touristLocation;
    }

}
