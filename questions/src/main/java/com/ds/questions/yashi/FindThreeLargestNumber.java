package com.ds.questions.yashi;

import java.util.Arrays;

/*Given an input array of integers with negative value also, int[] inputData = {4, 7, -2. 9, 1}
 * Find out the three largest numbers from the given array without sorting.
 *
 * output[] = {4, 7, 9}
 * */
public class FindThreeLargestNumber {
    private static final int[] inputData = {4, 6, 18, -2, 11, 9,20, -8, 14};



    public static void main(String[] args) {
        int[] threeLargestNumber = findThreeLargestNumber(inputData);
        System.out.println(Arrays.toString(threeLargestNumber));
    }

    private static int[] findThreeLargestNumber(int[] inputData) {
        int out[] = new int[3];
        if (inputData == null || inputData.length == 0) {
            return new int[]{-1, -1};
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j <= inputData.length - 1; j++) {
                    if (inputData[j] > inputData[i]) {
                        int temp = inputData[j];
                        inputData[j] = inputData[i];
                        inputData[i] = temp;
                    }
                }
                out[i]=inputData[i];
            }
        }
        return out;
    }
}
