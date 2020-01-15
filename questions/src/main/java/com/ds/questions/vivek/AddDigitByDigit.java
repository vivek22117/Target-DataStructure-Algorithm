package com.ds.questions.vivek;

import java.util.ArrayList;
import java.util.List;

public class AddDigitByDigit {

    private static final int[] arrayA = {9, 9, 9};
    private static final int[] arrayB = {3, 5};

    public static void main(String[] args) {
        List<Integer> sum = addDigitByDigit(arrayA, arrayB);
        System.out.println(sum);
    }

    private static List<Integer> addDigitByDigit(int[] arrayA, int[] arrayB) {
        List<Integer> finalResult = new ArrayList<Integer>();

        int lastIndexOfA = arrayA.length - 1;
        int lastIndexOfB = arrayB.length - 1;

        int total = 0;
        int carry = 0;
        while (lastIndexOfA >= 0 && lastIndexOfB >= 0) {
            total = arrayA[lastIndexOfA--] + arrayB[lastIndexOfB--] + carry;
            carry = updateResultAndGetCarry(finalResult, total);
        }

        while (lastIndexOfA >= 0) {
            total = arrayA[lastIndexOfA--] + carry;
            carry = updateResultAndGetCarry(finalResult, total);
        }

        while (lastIndexOfB >= 0) {
            total = arrayB[lastIndexOfB--] + carry;
            carry = updateResultAndGetCarry(finalResult, total);
        }

        if (carry != 0) {
            finalResult.add(0, carry);
        }
        return finalResult;
    }

    private static int updateResultAndGetCarry(List<Integer> finalResult, int total) {
        finalResult.add(0, total % 10);
        return total / 10;
    }
}
