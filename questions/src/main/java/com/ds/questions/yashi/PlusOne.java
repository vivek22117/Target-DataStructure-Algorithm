/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list,
 * and each element in the array contain a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: 123
 * +  1
 * ------
 * 124
 * Input: [1,5,9,9]
 * Output: [1,6,0,0]
 * Explanation: 1599
 * +   1
 * -------
 * 1600
 */
package com.ds.questions.yashi;

import java.util.Arrays;

public class PlusOne {
    // complete the below function
    public int[] plusOne(int[] digits) {
        return approach4(digits);
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
//        int[] digits = {9, 9, 9, 9,8,9,1,9};
//        int[] digits = {1, 5, 9, 9};
        int[] digits = {1, 2, 3, 4};
        System.out.println(Arrays.toString(plusOne.plusOne(digits)));
    }


    private int[] approach4(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        } else {
            int result = 0;
            int carry = 0;
            int total = 0;
            int[] out = new int[digits.length + 1];
            int j = out.length - 1;
            for (int i = digits.length - 1; i >= 0; i--) {
                if (i == digits.length - 1) {
                    total = digits[i] + 1 + carry;
                } else {
                    total = digits[i] + carry;
                }
                result = total % 10;
                carry = total / 10;
                out[j--] = result;

                if (i == 0 && carry == 1) {
                    out[0] = 1;
                }
            }
            return out;
        }
    }
}
