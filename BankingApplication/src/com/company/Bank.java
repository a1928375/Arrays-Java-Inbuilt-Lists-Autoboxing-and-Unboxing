package com.company;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches = new ArrayList<Branch>();

    private Branch aBranch;

    public boolean addBranch (int symbol) {

        for (int i = 0; i < branches.size(); i++) {

            if (branches.get(i).getSymbol() == symbol) {

                System.out.println("The branch exists in this bank. Try different symbols.");
                return false;
            }
        }
        aBranch = new Branch(symbol);                                            //create a new branch (aBranch) with symbol and put this branch into arrayList (branches)
        branches.add(aBranch);

        System.out.println("Adding branch succeeds.");
        return true;
    }

    public boolean addCustomer (int symbol, String name, double amount) {

        int temp = branches.size();

        for (int i = 0; i < temp; i++) {

            if (branches.get(i).getSymbol() == symbol) {

//                Branch result = new Branch(symbol);                                                        //不可以用new => 每一次進loop都會產生一個新的branch => 無法判斷是否有重覆
                                                                                                             // => 用setter
//                aBranch.setSymbol(symbol);

                if (branches.get(i).addCustomer(name, amount)) {

                    branches.add(aBranch);
                    return true;

                } else {

                    return false;
                }
            }
        }

        System.out.println("The branch does not exist in this bank. Try different symbols.");
        return false;
    }

    public boolean addTransaction (int symbol, String name, double amount) {

        for (int i = 0; i < branches.size(); i ++) {

            if (branches.get(i).getSymbol() == symbol) {

                if (!branches.get(i).addTransaction(name, amount)) {

                    return false;

                } else {

                    return true;
                }
            }
        }

        System.out.println("The branch does not exist in this bank. Try different symbols.");
        return false;
    }

    public boolean showCustomers (int symbol) {

        for (int i = 0; i < branches.size(); i++) {

            if (branches.get(i).getSymbol() == symbol) {

                System.out.println("Customers in this branch: ");

                if (branches.get(i).getCustomers().size() == 0) {

                    System.out.println("No customer in this branch.");
                    return false;
                }

                for (int j = 0; j < branches.get(i).getCustomers().size(); j++) {

                    System.out.println(branches.get(i).getCustomers().get(j).getName());
                }

                return true;
            }
        }

        System.out.println("The branch does not exist in this bank. Try different symbols.");
        return false;

    }

//    public boolean showCustomers (int symbol) {
//
//        int temp = 0;
//
//        for (int i = 0; i < branches.size(); i++) {
//
//            if (branches.get(i).getSymbol() == symbol) {
//
//                temp = i;
//                break;
//            } else {
//
//                System.out.println("The branch does not exist in this bank. Try different symbols.");
//                return false;
//            }
//        }
//
//        System.out.println("Customers in this branch: ");
//
//        for (int j = 0; j < branches.get(temp).getCustomers().size(); j++) {
//
//            System.out.println(branches.get(temp).getCustomers().get(j).getName());
//        }
//        return true;
//    }

    public boolean showTransactions (int symbol, String name) {

        for (int i = 0; i < branches.size(); i++) {

            if (branches.get(i).getSymbol() == symbol) {

                for (int j = 0; j < branches.get(i).getCustomers().size(); j++) {

                    if (branches.get(i).getCustomers().get(j).getName().equals(name)) {

                        System.out.println("Transactions of " + branches.get(i).getCustomers().get(j).getName() + " in this branch: ");

                        System.out.println(branches.get(i).getCustomers().get(j).getTransactions());
                        return true;

                    }
                }

                System.out.println("The name does not exist in this branch. Try different names.");
                return false;

            }
        }

        System.out.println("The branch does not exist in this bank. Try different symbols.");
        return false;

    }
}

//    public boolean showTransactions (int symbol) {
//
//        for (int i = 0; i < branches.size(); i++) {
//
//            if (branches.get(i).getSymbol() == symbol) {
//
//                System.out.println("Transactions of the customers in this branch: ");
//
//                for (int j = 0; j < branches.get(i).getCustomers().size(); j++) {
//
//                    System.out.println(branches.get(i).getCustomers().get(j).getTransactions());
//
//                }
//
//                break;
//            }
//        }
//    }