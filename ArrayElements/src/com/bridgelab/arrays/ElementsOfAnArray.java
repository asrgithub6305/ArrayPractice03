package com.bridgelab.arrays;

import java.util.Arrays;

public class ElementsOfAnArray {
    //public class LargeArrayElements {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 23, 45, 234, 992, 9233, 99349, 234,};
        Arrays.sort(arr);
        System.out.println("Largest number from given array: " + arr[arr.length - 1]);
    }
}

