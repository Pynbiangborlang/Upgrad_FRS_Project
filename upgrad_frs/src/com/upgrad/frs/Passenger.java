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

        //empty contact Constructor
        public Contact(){

        }

        //parameterized Contact constructor
        public Contact(int id, String name, String phone, String email) {
            this.id = id;
            contactName = name;
            contactPhone = phone;
            contactEmail = email;
        }

        //Copy constructor
        public Contact(Contact contact){
              this(contact.id, contact.contactName, contact.contactPhone, contact.contactEmail);
        }

        //method for updating Contact details
        public void updateContact(String contactName, String contactPhone, String contactEmail){
            this.contactName=contactName;
            this.contactPhone = contactPhone;
            this.contactEmail  = contactEmail;
        }

        //getter and setter method


        public int getId() {
            return id;
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

        //empty Constructor
        public Address(){

        }

        public Address(Address address){
            this(address.id, address.addressStreet, address.addressState, address.addressCity);
        }

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

        //getter and setter for Address
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAddressStreet() {
            return addressStreet;
        }

        public void setAddressStreet(String addressStreet) {
            this.addressStreet = addressStreet;
        }

        public String getAddressState() {
            return addressState;
        }

        public void setAddressState(String addressState) {
            this.addressState = addressState;
        }

        public String getAddressCity() {
            return addressCity;
        }

        public void setAddressCity(String addressCity) {
            this.addressCity = addressCity;
        }
    }//end of Address class

    //empty constructor
    public Passenger(){

    }

    //Passenger constructor
    public Passenger(String name, String phone, String email, String street, String state, String city){
       this.id = ++idCounter;
        Contact contact = new Contact(id, name, phone, email);
        Address address = new Address(id, street, state, city);
    }

    public Passenger(Passenger passenger){
        this.id = ++idCounter;
        this.contact = passenger.contact;
        this.address = passenger.address;
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

    //to get contact details
    public String getContact() {
        return "Name: " + contact.getContactName() +", Phone: " + contact.getContactPhone() + ", Email: " + contact.getContactEmail();
    }

    //updating Contact details method
    public void updateContactDetails(Contact contact, String contactName, String contactPhone, String contactEmail) {
        if(contact.getId()== this.id){
            contact.updateContact(contactName, contactPhone, contactEmail);
        }
    }

    //to check address details
    public String getAddress() {
        return "Street: " + address.getAddressStreet() +", State: " + address.getAddressState() + ", City: "+ address.addressCity;
    }

    //updating Address details method
    public void updateAddressDetails(Address address, String addressStreet, String addressState, String addressCity) {
        if(address.getId()== this.id){
            address.updateAddress(addressStreet, addressState, addressCity);
        }

    }
}
