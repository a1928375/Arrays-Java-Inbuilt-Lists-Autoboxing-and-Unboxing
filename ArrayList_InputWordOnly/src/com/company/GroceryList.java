package com.company;
import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem (String item) {

        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {

        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for (int i = 0; i < groceryList.size(); i++) {

            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem (String currentItem, String newItem) {

        if (findItem(currentItem) >= 0) {

            modifyGroceryItem(findItem(currentItem), newItem);
        }
    }

    private void modifyGroceryItem (int position, String newItem) {

        groceryList.set(position, newItem);
        System.out.println("Grocery item " + position + " has been modified.");
    }

    public void removeGroceryItem (String item) {

        if (findItem(item) >= 0) {

            removeGroceryItem(findItem(item));
        }
    }

    private void removeGroceryItem (int position) {

        groceryList.remove(position);
    }

    private int findItem (String searchItem) {

        return groceryList.indexOf(searchItem);
    }

    public boolean inGroceryList (String searchItem) {

        if (findItem(searchItem) >= 0) {

            return true;

        }   else {

            return false;
        }
    }


}
