package com.ds.questions;

import java.util.Arrays;

/*Given two input array of size X >= 0 or Y >= 0 (Can be of same size also!)
 * A = [2, 4, 5, 1]
 * B = [1, 7, 9]
 *
 * Perform addition of both the arrays digit by digit, such as:-
 *
 *       2 4 5 1
 *         1 7 9
 *      _________
 *       2 6 3 0
 *
 * Return new array of result Result: [2, 6, 3, 0]!
 * */
public class AddDigitByDigit {
    private static final int[] arrayA = {2, 4, 5, 1};
    private static final int[] arrayB = {1, 7, 9};

    public static void main(String[] args) {
        int[] result = preformAdditionDigitByDigit(arrayA, arrayB);
        System.out.println(Arrays.toString(result));
    }


    public static int[] preformAdditionDigitByDigit(int[] arrayA, int[] arrayB) {

        return null;
    }
}
