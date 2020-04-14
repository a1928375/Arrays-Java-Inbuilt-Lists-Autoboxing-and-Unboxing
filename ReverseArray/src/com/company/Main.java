package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        reverse(array);
    }

    public static void reverse (int[] array) {

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            result[i] = array[i];
        }

        for (int i = 0; i < array.length; i++) {

            result[i] = array[ array.length-1-i ];
        }

        System.out.println("The original array is " + Arrays.toString(array));
        System.out.println("The reversed array is " + Arrays.toString(result));
    }
}
