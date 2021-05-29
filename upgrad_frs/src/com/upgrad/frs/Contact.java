package com.upgrad.frs;

public class Contact {

    int id;
    //contact details
    String contactName;
    String contactPhone;
    String contactEmail;

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
}
