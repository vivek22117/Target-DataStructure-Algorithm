package com.ds.questions.vivek;

import java.util.Arrays;

public class FindThreeLargestNumber {

    private static final int[] inputData = {4, 6, 1, -2, 11, 9, -8, 14};

    public static void main(String[] args) {
        int[] threeLargestNumber = findThreeLargestNumber(inputData);
        System.out.println(Arrays.toString(threeLargestNumber));
    }

    // Time Complexity: O(n x m), where m is the number of largest numbers
    private static int[] findThreeLargestNumber(int[] inputData) {
        int[] result = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        int firstIndex = 0;
        for (int value : inputData) {
            if (value > result[firstIndex + 2]) {
                updateResult(value, result, firstIndex + 2);
            } else if (value > result[firstIndex + 1]) {
                updateResult(value, result, firstIndex + 1);
            } else if (value > result[firstIndex]) {
                updateResult(value, result, firstIndex);
            }
        }
        return result;
    }

    private static void updateResult(int data, int[] result, int index) {
        int N = 0;
        while (N <= index) {
            if (N != index) {
                result[N] = result[N + 1];
            } else {
                result[N] = data;
                break;
            }
            N++;
        }
    }
}
