package com.upgrad.frs;

public class RegularTicket {
    int id;
    String[] service = new String[3];

    //Constructor when regular ticket is call for first time
    RegularTicket(int id, String service){
        this.id=id;
        this.service[0]=service;
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
