package com.bridgelab.arrays;

import java.util.Arrays;

public class ElementsOfAnArray {
    public static void main(String[] args) {

        int[] array = new int[]{7, 3, 8, 1, 6, -23, -5};

        //System.out.print("Elements of original array: ");
        for (int i = 0; i < array.length; i++) {
            //System.out.print(array[i] + " ");
        }
        Arrays.sort(array);

        System.out.println();

        System.out.println("Elements of array sorted in ascending order : " + Arrays.toString(array));
    }
}