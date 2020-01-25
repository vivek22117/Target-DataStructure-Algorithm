package com.ds.questions.aniket;

import java.util.Arrays;

/*Given an input array of integers with negative value also, int[] inputData = {4, 7, -2. 9, 1}
 * Find out the three largest numbers from the given array without sorting.
 *
 * output[] = {4, 7, 9}
 * */
public class FindThreeLargestNumber {
    private static final int[] inputData = { 4, 6, -2, 11, 9, -8, 14 };

    public static void main(String[] args) {
	int[] threeLargestNumber = findThreeLargestNumber(inputData);
	System.out.println(Arrays.toString(threeLargestNumber));
	int[] nLargestNumber = findNLargestNumber(inputData, 2);
	System.out.println(Arrays.toString(nLargestNumber));
    }

    private static int[] findThreeLargestNumber(int[] inputData) {
	if (inputData == null || inputData.length < 3) {
	    return new int[0];
	}
	int[] result = new int[3];
	for (int i = 0; i < result.length; i++) {
	    result[i] = Integer.MIN_VALUE;
	}
	int resultIndex = result.length - 1;
	int highestNum = result[resultIndex];
	while (resultIndex >= 0) {
	    findNextHighestNumber(inputData, result, resultIndex, highestNum);
	    highestNum = result[resultIndex];
	    resultIndex -= 1;
	}
	return result;
    }

    private static void findNextHighestNumber(int[] inputData, int[] result, int resultIndex, int highestNum) {
	for (int i = 0; i < inputData.length; i++) {
	    if (resultIndex == result.length - 1 && inputData[i] > result[resultIndex]) {
		result[resultIndex] = inputData[i];
	    } else if (inputData[i] > result[resultIndex] && highestNum > inputData[i]) {
		result[resultIndex] = inputData[i];
	    }
	}
    }

    private static int[] findNLargestNumber(int[] inputData, int n) {
	if (inputData == null || inputData.length < n || n <= 0) {
	    return new int[0];
	}
	int[] result = new int[n];
	for (int i = 0; i < result.length; i++) {
	    result[i] = Integer.MIN_VALUE;
	}
	int resultIndex = result.length - 1;
	int highestNum = result[resultIndex];
	while (resultIndex >= 0) {
	    findNextHighestNumber(inputData, result, resultIndex, highestNum);
	    highestNum = result[resultIndex];
	    resultIndex -= 1;
	}
	return result;
    }
}
