package com.upgrad.frs;

public class Passenger{
    int id;
    //contact details
    String contactName;
    String contactPhone;
    String contactEmail;
    //Address details
    String addressStreet;
    String addressState;
    String addressCity;

    Passenger(String addressStreet, String addressState, String addressCity){
        this.addressStreet=addressStreet;
        this.addressState=addressState;
        this.addressCity=addressCity;
    }

    Passenger(String contactName, String contactPhone, String contactEmail, String addressStreet, String addressState, String addressCity){
        this(addressStreet, addressState,addressCity);
        this.contactName=contactName;
        this.contactPhone=contactPhone;
        this.contactEmail=contactEmail;
    }

    Passenger(int id, String contactName, String contactPhone, String contactEmail, String addressStreet, String addressState, String addressCity ){
        this(contactName, contactPhone, contactEmail, addressStreet, addressState, addressCity);
        this.id=id;
    }


    public String getContactDetails(){
      return "contact details is: " + contactName +", " + contactPhone + ", " + contactEmail;
    }


    public String getAddress(){
        return "Address details is: " + addressStreet + ", " + addressState + ", "+ addressCity;

    }
  //method for updating Contact details
    public void updateContact(String contactName, String contactPhone, String contactEmail){
        this.contactName=contactName;
        this.contactPhone = contactPhone;
        this.contactEmail  = contactEmail;
    }
    //method for updating address details
    public void updateAddress(String addressStreet, String addressState, String addressCity){
        this.addressStreet=addressStreet;
        this.addressState=addressState;
        this.addressCity=addressCity;
    }

}
