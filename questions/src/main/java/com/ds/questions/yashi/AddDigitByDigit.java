package com.ds.questions.yashi;

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
    private static final int[] arrayA = {2, 4, 9};
    private static final int[] arrayB = {1, 7, 9};

    public static void main(String[] args) {
        int[] result = preformAdditionDigitByDigit(arrayA, arrayB);
        System.out.println(Arrays.toString(result));
    }


    public static int[] preformAdditionDigitByDigit(int[] arrayA, int[] arrayB) {

        int out[];
        if (arrayA.length == arrayB.length) {
            out = new int[arrayA.length + 1];
        } else if (arrayA.length > arrayB.length) {
            out = new int[arrayA.length + 1];
        } else {
            out = new int[arrayB.length + 1];
        }
        int outIndex = out.length - 1;
        int carry = 0;
        for (int i = arrayA.length - 1, j = arrayB.length - 1; i >= 0 || j >= 0; i--, j--) {
            int total;
            int rem;
            if (i < 0) {
                total = 0 + arrayB[j] + carry;
            } else if (j < 0) {
                total = arrayA[i] + 0 + carry;
            } else {
                total = arrayA[i] + arrayB[j] + carry;
            }
            rem = total % 10;
            carry = total / 10;
            out[outIndex--] = rem;
        }
        return out;
    }
}

