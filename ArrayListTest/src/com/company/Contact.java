package com.company;

public class Contact {                                               //產生一個data type  => call Contact
                                                                     // => Contact object 包含   contact name   &   phone number

    private String contactName;
    private String phoneNumber;

    public Contact(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
