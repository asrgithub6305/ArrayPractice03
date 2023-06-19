package com.bridgelab.arrays;

import java.util.Arrays;

public class ElementsOfAnArray {
    //public class OddPositionArray {
    public static void main(String[] args) {
        int intArray[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        // 0-1, 1-2, 2-3, 3-4, 4-5, 5-6, 6-7, 7-8, 8-9, 9-11 = Index from 0
        //System.out.println("Array elements at odd position..");
        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 == 0) {

                System.out.println(intArray[i]);
            }
        }
    }
}

