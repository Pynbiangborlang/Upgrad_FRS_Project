package com.upgrad.frs;

public class RegularTicket {
    private int id;
    private String[] service = new String[3];
    private Flight flight;

    //Constructor when regular ticket is call for first time
    RegularTicket(int id, String service, Flight flight){
        this.id=id;
        this.service[0]=service;
        this.flight = flight;
    }

    // method where passenger can check availed services
    String[] checkServices(){
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
