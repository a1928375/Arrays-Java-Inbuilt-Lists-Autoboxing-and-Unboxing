package com.company;

import java.util.ArrayList;

public class Branch {

    private int symbol;

    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(int symbol) {
        this.symbol = symbol;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public int getSymbol() {
        return symbol;
    }

    public boolean addCustomer (String name, double amount) {

        ArrayList<Double> result = new ArrayList<Double>();

        result.add(Double.valueOf(amount));

        for (int i = 0; i < customers.size(); i++) {

            if (customers.get(i).getName().equals(name)) {

                System.out.println("The name exists in this branch. Try different names.");
                return false;
            }
        }

        Customer temp = new Customer(name, result);

        customers.add(temp);

        // customers.add(new Customer(name, result))

        System.out.println("Adding customer in this branch succeeds.");

        return true;
    }

    public boolean addTransaction (String name, double amount) {

        for (int i = 0; i < customers.size(); i++) {

            if (customers.get(i).getName().equals(name)) {

                customers.get(i).getTransactions().add(amount);

                System.out.println("Adding transaction of " + customers.get(i).getName() + " in this branch succeeds.");

                return true;
            }
        }

        System.out.println("The name dose not exist in this branch. Try different names.");
        return false;

    }

    public void setSymbol(int symbol) {
        this.symbol = symbol;
    }
}
