package com.upgrad.frs;

public class TouristTicket {
    int id;
    String hotelAddress;
    String[] touristLocation = new String[5];

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
}
