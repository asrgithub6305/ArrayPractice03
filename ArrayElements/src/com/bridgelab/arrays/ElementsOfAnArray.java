package com.bridgelab.arrays;

import java.util.Arrays;

public class ElementsOfAnArray {
    //public class SmallArrayElement {
    public static void main(String[] args) {
        int[] intArray = new int[] { 12, 112, 734, 5, 5313 };

        //System.out.println("Given array ");

        for (int i = 0; i < intArray.length; i++) {

            System.out.println(intArray[i]);
        }
        int minValue = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < minValue)

                minValue = intArray[i];
        }

        System.out.println(
                "Smallest element present in given array: " + minValue);
    }

}



