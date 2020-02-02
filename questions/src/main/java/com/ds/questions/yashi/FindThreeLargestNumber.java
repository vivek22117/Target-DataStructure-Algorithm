package com.ds.questions.yashi;

import java.util.Arrays;

/*Given an input array of integers with negative value also, int[] inputData = {4, 7, -2. 9, 1}
 * Find out the three largest numbers from the given array without sorting.
 *
 * output[] = {4, 7, 9}
 * */
public class FindThreeLargestNumber {
    private static final int[] inputData = {4, 6, 18,42,99,33, -2, 21, 11, 9, 20, -8, 14};


    public static void main(String[] args) {
        int[] threeLargestNumber = findThreeLargestNumber2(inputData);
        System.out.println(Arrays.toString(threeLargestNumber));
    }

    //3 O(n)
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
                out[i] = inputData[i];
            }
        }
        return out;
    }


    //o(n) complexity
    private static int[] findThreeLargestNumber2(int[] inputData) {
        int out[] = new int[3];
        int first = 0;
        int second = 0;
        int third = 0;
        if (inputData == null || inputData.length == 0) {
            return new int[]{-1, -1};
        } else {
            for (int i = 0; i < inputData.length; i++) {
                if (inputData[i] > first) {
                    third = second;
                    second = first;
                    first = inputData[i];
                } else if (inputData[i] > second) {
                    third = second;
                    second = inputData[i];
                } else if(inputData[i]>third){
                    third = inputData[i];
                }
            }
            out[0]=first;
            out[1]=second;
            out[2]=third;
        }
//        System.out.println("first " + first + " second " + second + " third " + third);
        return out;
    }
}
