package com.upgrad.frs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Passenger passenger =new Passenger(2, "Rahul", "123456789", "rahul@gmail.com", "Street1", "State1", "City1");
        Contact contact =new Contact(passenger.id ,"Rahul", "123456789", "rahul@gmail.com");
        Address address= new Address(passenger.id, "Street1", "State1", "City1");

        System.out.println(passenger.id);
        System.out.println(contact.contactName);
        System.out.println(contact.contactPhone);
        System.out.println(contact.contactEmail);
        System.out.println(address.addressStreet);
        System.out.println(address.addressState);
        System.out.println(address.addressCity);
    }

}
