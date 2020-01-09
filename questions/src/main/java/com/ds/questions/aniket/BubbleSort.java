package com.ds.questions.aniket;

//Question
//Given an integer array of size N, write an algorithm to sort the
// elements within the array using BubbleSort Algorithm.

//Handle all edge cases and explain the Space and Time complexity using Big (O) notation.

//Example
//Input : [5, 4, 11, 18, 1, 9]   Output: [1, 4, 5, 9, 11, 18]

// ans: Time Complexity is O(n2)

public class BubbleSort {
    private static int[] inputData = { 5, 4, 11, 18, 1, 9 };

    public static void main(String[] args) {
	int[] result = getSortedArray(inputData);
	for (int i = 0; i < result.length; i++) {
	    System.out.print(result[i] + " ");
	}
    }

    private static int[] getSortedArray(int[] inputData) {
	if (inputData == null || inputData.length == 0) {
	    return new int[0];
	}
	if (inputData.length == 1) {
	    return inputData;
	}
	for (int i = 0; i < inputData.length; i++) {
	    for (int j = i + 1; j < inputData.length; j++) {
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
