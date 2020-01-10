package com.ds.questions.yashi;


//Question
//Given an integer array of size N, write an algorithm to sort the
// elements within the array using BubbleSort Algorithm.

//Handle all edge cases and explain the Space and Time complexity using Big (O) notation.

//Example
//Input : [5, 4, 11, 18, 1, 9]   Output: [1, 4, 5, 9, 11, 18]

import java.util.Arrays;

public class BubbleSort {
    private static int[] inputData = {5, 4, 11, 18, 1, 9, 2};

    public static void main(String[] args) {
        int[] bubbleSortedOutput = getSortedArray(inputData);
        System.out.println(Arrays.toString(bubbleSortedOutput));

    }

    private static int[] getSortedArray(int[] inputData) {

        if (inputData == null || inputData.length == 0) {
            return new int[0];
        }

        if (inputData.length == 1) {
            return inputData;
        }
        //Overall O(n2) time complexity Worst Case
        //Space complexity is  O(1) because only one temp variable is required
        for (int i = 0; i < inputData.length - 1; i++) {//O(n)
            for (int j = i + 1; j < inputData.length; j++) {//O(n)
                if (inputData[i] > inputData[j]) {
                    int temp = inputData[i];
                    inputData[i] = inputData[j];
                    inputData[j] = temp;
                }
            }
        }
        return inputData;
    }

}
