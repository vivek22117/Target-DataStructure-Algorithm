package com.ds.questions.vivek;

import java.util.Arrays;

public class BubbleSortWithSwap {

//        private static final int[] inputData = {4, 3, 5, 1, 9, 6, 2};
    private static final int[] inputData = {1, 6, 2, 7, 9, 8, 3};
//    private static final int[] inputData = {1, 2, 3, 5};
    private static int counter = 0;

    public static void main(String[] args) {
        int[] sort = sort(inputData);
        System.out.println(Arrays.toString(sort));
    }

    private static int[] sort(int[] inputData) {
        if (inputData.length == 0) {
            return new int[0];
        }

        if (inputData.length == 1) {
            return inputData;
        }

        boolean isSwapped = false;
        for (int i = 0; i < inputData.length; i++) {
            isSwapped = true;
            for (int j = 1; j < inputData.length - i; j++) {
                if (inputData[j] < inputData[j - 1]) {
                    swap(inputData, j, j - 1);
                    counter += 1;
                    isSwapped = false;
                }
            }
            System.out.println(isSwapped);
            if (isSwapped) {
                System.out.println("Already sorted!  Counter is " + counter);
                return inputData;
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
