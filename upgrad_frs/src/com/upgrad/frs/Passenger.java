package com.upgrad.frs;

public class Passenger{
    private static int idCounter= 0;
    private int id;
    private Contact contact;
    private Address address;

    //creating a composition relationship between Passenger and contact
    private static class Contact {

        private int id;
        //contact details
        private String contactName, contactPhone, contactEmail;

        public Contact(int id, String name, String phone, String email) {
            this.id = id;
            contactName = name;
            contactPhone = phone;
            contactEmail = email;
        }

        //method for updating Contact details
        public void updateContact(String contactName, String contactPhone, String contactEmail){
            this.contactName=contactName;
            this.contactPhone = contactPhone;
            this.contactEmail  = contactEmail;
        }

        public String getContactName() {
            return contactName;
        }

        public void setContactName(String contactName) {
            this.contactName = contactName;
        }

        public String getContactPhone() {
            return contactPhone;
        }

        public void setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
        }

        public String getContactEmail() {
            return contactEmail;
        }

        public void setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
        }
    }//end of contact class

    // composition between Address and Passenger
    private static class Address {
        int id;
        //Address details
        private String addressStreet, addressState, addressCity;

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
    }//end of Address class

    //Passenger constructor
    Passenger(String name, String phone, String email, String street, String state, String city){
       this.id = ++idCounter;
        Contact contact = new Contact(id, name, phone, email);
        Address address = new Address(id, street, state, city);
    }

    // getter for id
    public int getId(){
        return id;
    }

    // method to get passenger count
    public int getPassengerCount(){
        //this will return the number of passenger objects created
        return idCounter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contact getContact() {
        return contact;
    }

    //updating Contact details method
    public void updateContactDetails(Contact contact, String contactName, String contactPhone, String contactEmail) {
         contact.updateContact(contactName, contactPhone, contactEmail);
    }

    public Address getAddress() {
        return address;
    }

    //updating Address details method
    public void updateContactDetails(Address address, String addressStreet, String addressState, String addressCity) {
        contact.updateContact(addressStreet, addressState, addressCity);
    }
}
