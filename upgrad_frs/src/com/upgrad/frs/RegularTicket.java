package com.upgrad.frs;

public class RegularTicket extends Ticket {
    private final int id;
    private String[] service = new String[3]; //number of service is randomly set to maximum 3 services for one passenger

    //Constructor when regular ticket is call for first time
    RegularTicket(String service, String pnrNumber, String placeOfDeparture, String destination, String departureDate, String departureTime, String arrivalDate, String arrivalTime, String seatNumber, int duration, float ticketPrice, Flight flight, Passenger passenger){

        //calling parent constructor
        super(pnrNumber, placeOfDeparture,destination, departureDate, arrivalDate, departureTime, arrivalTime, seatNumber, duration, ticketPrice, flight, passenger);
        this.id = super.getId();
        this.service[0]=service;
    }

    // method where passenger can check availed services
    public String[] checkServices(){
        return service;
    }

    //method where users can add new services
    public void updateServices(String service){
        if(this.service.length<3){
            int k=service.length()+1;
            this.service[k] = service;
        }else{
            System.out.println("You cannot avail more than 3 services");
        }
    }

}
