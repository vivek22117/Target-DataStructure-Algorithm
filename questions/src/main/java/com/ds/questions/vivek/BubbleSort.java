package com.ds.questions.vivek;


//Question
//Given an integer array of size N, write an algorithm to sort the
// elements within the array using BubbleSort Algorithm.

//Handle all edge cases and explain the Space and Time complexity using Big (O) notation.

//Example
//Input : [5, 4, 11, 18, 1, 9]   Output: [1, 4, 5, 9, 11, 18]

import java.util.Arrays;

public class BubbleSort {
    private static int[] inputData = {15, 4, 11, 8, 1, 9};

    public static void main(String[] args) {
        int[] sortedArray = getSortedArray(inputData);
        System.out.println(Arrays.toString(sortedArray));
    }

    // Runtime Complexity: O(n2) => Space Complexity: O(1)
    private static int[] getSortedArray(int[] inputData) {
        if (inputData.length == 0) {
            return new int[0];
        }

        if (inputData.length == 1) {
            return inputData;
        }

        for (int i = 0; i < inputData.length - 1; i++) {
            for (int j = i + 1; j < inputData.length; j++) {
                if (inputData[i] > inputData[j]) {
                    swap(inputData, i, j);
                }
            }
        }

        return inputData;
    }

    private static void swap(int[] inputData, int i, int j) {
        int temp = inputData[i];
        inputData[i] = inputData[j];
        inputData[j] = temp;
    }

}
