package com.upgrad.frs;

public class Address {
    int id;
    //Address details
    String addressStreet;
    String addressState;
    String addressCity;

    public Address(int id, String street, String state, String city) {
        this.id =id;
        addressStreet = street;
        addressState = state;
        addressCity = city;
    }

    //method for updating address details
    public void updateAddress(String addressStreet, String addressState, String addressCity){
        this.addressStreet=addressStreet;
        this.addressState=addressState;
        this.addressCity=addressCity;
    }
}
