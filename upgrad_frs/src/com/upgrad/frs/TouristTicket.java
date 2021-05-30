package com.upgrad.frs;

public class TouristTicket {

    private int id;
    private String hotelAddress;
    private String[] touristLocation = new String[5];
    private Flight flight;

    public TouristTicket(int id, String hotelAddress, String location, Flight flight){
        this.id =id;
        this.hotelAddress = hotelAddress;
        this.touristLocation[0] = location;
        this.flight = flight;
    }

    TouristTicket(int id, String hotelAddress, String touristLocation){
        this.id=id;
        this.hotelAddress=hotelAddress;
        this.touristLocation[0] = touristLocation;
    }

    void addTouristLocation(String touristLocation){
        if(this.touristLocation.length<5){
            int k=touristLocation.length()+1;
            this.touristLocation[k] = touristLocation;
        }else{
            System.out.println("you can add maximum 5 no of tourist locations");
        }
    }

    void removeTouristLocation(String touristLocation){
        for(int i=0; i<5; i++){
            if(this.touristLocation[i].equalsIgnoreCase(touristLocation)){
                this.touristLocation[i]= null;
            }
        }
    }

    //setters and getters
    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocation() {
        return touristLocation;
    }

    public Flight getFlight() {
        return flight;
    }

}
