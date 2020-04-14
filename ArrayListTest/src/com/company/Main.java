package com.company;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {

    private static MobilePhone myMobilePhone = new MobilePhone("888");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean check = false;
        int choice = 0;

        printInstruction();
        System.out.println("");

        while (!check) {

            System.out.println("Please enter your choice:  (0 to show the actions) ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 0:
                    printInstruction();
                    break;
                case 1:
                    myMobilePhone.printContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    check = true;
                    break;

            }
        }

    }

    public static void printInstruction() {

        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contact in this phone.");
        System.out.println("\t 2 - To add an item of the contact in this phone.");
        System.out.println("\t 3 - To modify an item of the contact in this phone.");
        System.out.println("\t 4 - To remove an item of the contact in this phone.");
        System.out.println("\t 5 - To search for an item of the contact in this phone.");
        System.out.println("\t 6 - To quit the mobile phone.");
    }

    public static void addContact() {

        System.out.println("Please enter the contact name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the contact phone number: ");
        String phoneNumber = scanner.nextLine();

        if (myMobilePhone.findContactName(name) == null) {

            Contact contact = new Contact(name, phoneNumber);

            myMobilePhone.addContact(contact);
            System.out.println("The contact has been added in this phone.");

        } else {

            System.out.println("The contact name is in this phone. If you want to update the contact, try updateContact.");
        }

    }

    public static void updateContact() {

        System.out.println("Please enter the contact name: ");
        String name = scanner.nextLine();

        if (myMobilePhone.findContactName(name) != null) {

//            Contact oldTemp = new Contact(myMobilePhone.findContactName(name), myMobilePhone.findContactPhoneNumber(name));
                                                                                                   // 不能用new 來取 contact => 因為 new 就會在  memory中  新的location   來store contents (store object)
                                                                                                   // => 就算contents相同, memory location不同, 也是不同object
            while (true) {

                System.out.println("Please enter the new contact name: ");
                String newName = scanner.nextLine();

                if (myMobilePhone.findContactName(newName) != null) {                                        //多加入此判斷，因為被修改後的contact name不可以和現有的contact name相同
                                                                                                             //otherwise duplication
                    System.out.println("The new name is in this phone. Try different name.");                // 多寫一個while loop => 無限確認 => 直到 user's new input contact name沒有重覆為止

                } else {

                    System.out.println("Please enter the new contact phone number: ");
                    String phoneNumber = scanner.nextLine();

                    Contact newTemp = new Contact(newName, phoneNumber);                                      //在OOP都是用new 來create new class object

                    myMobilePhone.modifyContact(myMobilePhone.findContactName(name), newTemp);
                    System.out.println("The contact is updated in this phone.");

                    break;

                }

            }

        } else {

            System.out.println("The contact name is not in this phone. If you want to create the contact, try addContact.");
        }

    }

    public static void removeContact() {


        System.out.println("Please enter the contact name: ");
        String name = scanner.nextLine();

        if (myMobilePhone.findContactName(name) != null) {

//            Contact oldTemp = new Contact(myMobilePhone.findContactName(name), myMobilePhone.findContactPhoneNumber(name));

            myMobilePhone.removeContact(myMobilePhone.findContactName(name));

        } else {

            System.out.println("The contact name is not in this phone.");
        }
    }

    public static void searchContact() {

        System.out.println("Please enter the contact name: ");
        String name = scanner.nextLine();

        if (myMobilePhone.findContactName(name) != null) {

            System.out.println("The contact name is found in this phone.");
            System.out.println("The contact name is " + myMobilePhone.findContactName(name).getContactName() + " and the phone number is " + myMobilePhone.findContactName(name).getPhoneNumber());
        } else {

            System.out.println("The contact name is not found.");
        }

    }

}