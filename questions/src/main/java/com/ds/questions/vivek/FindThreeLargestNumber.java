package com.ds.questions.vivek;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindThreeLargestNumber {

    private static final int[] inputData = {4, 6, 1, -2, 11, 9, -8, 14};

    public static void main(String[] args) {
        int[] threeLargestNumber = findThreeLargestNumber(inputData);
        System.out.println(Arrays.toString(threeLargestNumber));

        //Using Heap DS
        int[] threeLargestNum = findThreeLargestNum(inputData, 3);
        System.out.println(Arrays.toString(threeLargestNum));
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

    public static int[] findThreeLargestNum(int[] data, int target) {
        PriorityQueue<Integer> largestValues = new PriorityQueue<Integer>(target, Collections.reverseOrder());
        int[] result = new int[target];
        for (int i = 0; i < data.length; i++) {
            largestValues.add(data[i]);
        }

        for (int j = target - 1; j >= 0; j--) {
            result[j] = largestValues.remove();
        }
        return result;

    }
}
