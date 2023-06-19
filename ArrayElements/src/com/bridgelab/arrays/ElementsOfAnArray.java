package com.bridgelab.arrays;

import java.util.Arrays;

public class ElementsOfAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 5, 7, 4, 8, 6, 8, 1, 4, 3, 9, 5, 3};
        System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}