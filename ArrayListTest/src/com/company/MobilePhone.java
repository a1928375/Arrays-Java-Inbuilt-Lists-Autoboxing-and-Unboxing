package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> myArrayList = new ArrayList<Contact>();
    private Contact contact;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public void addContact (Contact contact) {

        myArrayList.add(contact);

    }

    public void printContact () {

        System.out.println("You have " + myArrayList.size() + " contact(s) in this phone");

        for (int i = 0; i < myArrayList.size(); i++) {

            System.out.println((i+1) + ". " + myArrayList.get(i).getContactName() + ": " + myArrayList.get(i).getPhoneNumber());    // 不能寫 System.out.println((i+1) + ". " + myArrayList.get(i))
        }                                                                                                                          // 因為 myArrayList.get(i)是return一個Contact object (會顯示出memory location)

    }

    public void modifyContact (Contact currentContact, Contact newContact) {

        myArrayList.set(findContact(currentContact), newContact);

    }

    public void removeContact (Contact contact) {

        myArrayList.remove(myArrayList.indexOf(contact));

    }

    private int findContact (Contact contact) {

            return myArrayList.indexOf(contact);
        }

    public Contact findContactName (String contactName) {

        for (int i = 0; i < myArrayList.size(); i++) {

            Contact contact = myArrayList.get(i);                                                             //用  for loop & Contact contact = myArrayList.get(i) => 來取得arrayList中的每一element

            if (contact.getContactName().equals(contactName)) {                                               //不能用 ==   =>  要用 equals()

                return contact;
            }

        }

        return null;

    }

}
