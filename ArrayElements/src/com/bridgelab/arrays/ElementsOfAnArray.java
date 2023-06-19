package com.bridgelab.arrays;

import java.util.Arrays;

public class ElementsOfAnArray {
    //public class FrequencyOfEachElementArray {
        public static void main(String[] args) {
            int[] numbers = new int[]{4, 3, 9, 5, 3, 8, 7, 8, 2, 6, 9, 5, 2, 8, 7, 4, 6, 6, 6};
            int[] frequency = new int[numbers.length];
            int counted = -1;
            for (int i = 0; i < numbers.length; i++) {
                int count = 1;
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                        frequency[j] = counted;

                    }
                }
                if (frequency[i] != counted)
                    frequency[i] = count;
            }
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] != counted)
                    System.out.println("Element: " + numbers[i] + " Frequency: " + frequency[i]);
            }
        }
    }
