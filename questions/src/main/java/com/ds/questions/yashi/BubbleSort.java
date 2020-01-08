package com.ds.questions.yashi;


//Question
//Given an integer array of size N, write an algorithm to sort the
// elements within the array using BubbleSort Algorithm.

//Handle all edge cases and explain the Space and Time complexity using Big (O) notation.

//Example
//Input : [5, 4, 11, 18, 1, 9]   Output: [1, 4, 5, 9, 11, 18]

public class BubbleSort {
    private static int[] inputData = {5, 4, 11, 18, 1, 9};

    public static void main(String[] args) {
        getSortedArray(inputData);
    }

    private static int[] getSortedArray(int[] inputData) {

        //Overall O(n2) time complexity Worst Case
        //Space complexity is  O(1) because only one temp variable is required
        for (int i = 0; i < inputData.length; i++) {//O(n)
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
