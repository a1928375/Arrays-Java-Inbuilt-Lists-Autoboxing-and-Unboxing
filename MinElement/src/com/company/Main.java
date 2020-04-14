package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);  //scanner 是 main的  field

    public static void main(String[] args) {

        System.out.println("Enter count: ");

        int newCount = scanner.nextInt();

        int[] array = readIntegers(newCount);

        System.out.println(findMin(array));

    }

    public static int[] readIntegers (int count) {

        System.out.println("Enter " + count + " integers: \r");

        int[] array = new int[count];

        for (int i = 0; i < count; i++) {

            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        scanner.close();
        return array;
    }

    public static int findMin (int[] array) {

        int temp = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < temp) {

                temp = array[i];
            }
        }

        System.out.println("The minimum value: ");
        return temp;
    }
}
