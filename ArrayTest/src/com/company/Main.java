package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] a = getIntegers(5);
        printArray(a);
        sortIntegers(a);
        System.out.println("");
        printArray(a);

    }

    public static int[] getIntegers (int number) {

        System.out.println("Enter " + number + " integers. \r");

        int[] values = new int[number];

        for (int i = 0; i < number; i++) {

            values[i] = scanner.nextInt();
        }

        return values;

    }

    public static void printArray (int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("The #" + i + " element is " + array[i]);
        }
    }

    public static int[] sortIntegers (int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length -i-1; j ++) {

                if (array[j] < array[j+1]) {

                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

}
