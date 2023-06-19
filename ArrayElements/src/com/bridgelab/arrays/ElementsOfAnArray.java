package com.bridgelab.arrays;

import java.util.Arrays;

public class ElementsOfAnArray {
    //public class SecondLargestNumberInAnArray {
    static void print2largest(int arr[], int arr_size)
    {
        int i, first, second;
        if (arr_size < 2) {
            System.out.println(" Invalid Input ");
            return;
        }
        int largest = second = Integer.MIN_VALUE;
        for(i = 0; i < arr_size; i++)
        {
            largest = Math.max(largest, arr[i]);
        }

        for(i = 0; i < arr_size; i++)
        {
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }
        if (second == Integer.MIN_VALUE)
            System.out.println("There is no second " + "largest element");
        else
            System.out.printf("The second largest " + "element is %d", second);
    }
    public static void main(String[] args)
    {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        print2largest(arr, n);
    }
}


