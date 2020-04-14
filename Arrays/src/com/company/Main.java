package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArray = getIntegers(10);


        for (int i = 0; i < myIntArray.length; i++) {

            System.out.println(myIntArray[i]);
        }

        System.out.println("The average is " + getAverage(myIntArray));
    }

    public static int[] getIntegers (int number) {

        System.out.println("Enter " + number + " integers. \r" );

        int[] values = new int[number];

        for (int i=0; i < number; i++) {

            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage (int[] array) {

        int sum = 0;

        for (int i = 0 ; i < array.length; i++) {

            sum += array[i];
        }

        return (double) sum/array.length;
    }
}
