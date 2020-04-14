package com.company;

public class Main {

    public static void main(String[] args) {

        Bank newMoney = new Bank();

        newMoney.addBranch(123);
        newMoney.addBranch(123);

        newMoney.addCustomer(456, "Tina", 123456789);
        newMoney.addCustomer(123, "Tina", 123456789);
        newMoney.addCustomer(123, "Tina", 123456789);
        newMoney.addCustomer(123, "Jenny", 987654321);

        newMoney.addTransaction(123, "Tina", 123456789);
        newMoney.addTransaction(456, "Tina", 123456789);
        newMoney.addTransaction(123, "Jenny", 123456789);

        newMoney.showCustomers(123);
        newMoney.showTransactions(123, "Tina");
        newMoney.showCustomers(456);
        newMoney.showTransactions(123, "Amy");
        newMoney.showTransactions(123, "Jenny");
        newMoney.showTransactions(456, "Jenny");


//        Branch oneTwoThree = new Branch(123);
//
//        oneTwoThree.addCustomer("Tina", 123456789);
//        oneTwoThree.addCustomer("Tina", 123456789);
//        oneTwoThree.addTransaction("Tina", 123456789);
//        oneTwoThree.addTransaction("Jenny", 123456789);
//
//        newMoney.showCustomers(123);
//        newMoney.showTransactions(123, "Tina");

    }
}
