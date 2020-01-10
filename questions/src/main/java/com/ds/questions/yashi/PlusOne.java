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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOne {
    // complete the below function
    public int[] plusOne(int[] digits) {
        return approach3(digits);
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
//        int[] digits = {1, 2, 3};
        int[] digits = {1, 5, 9, 9};
        System.out.println(Arrays.toString(plusOne.plusOne(digits)));
    }

    private int[] populateOutputArray(String s) {
        int result = Integer.parseInt(s) + 1;
        int length = String.valueOf(result).length();
        int[] out = new int[length];
        int i = out.length - 1;
        while (result > 0) {
            int remainder = result % 10;
            out[i] = remainder;
            result = result / 10;
            i--;
        }
        return out;
    }


    /**
     * In this approach we first get the combined digits of array element
     * and then create list for output array
     * second loop is to get the remainder and add it in the list
     * at the end reverse the list and convert it into array
     *
     * @param digits
     * @return
     */
    private int[] approach3(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum = sum * 10 + digits[i];
        }
        sum = sum + 1;
        List<Integer> outList = new ArrayList<>();
        while (sum > 0) {
            int remainder = sum % 10;
            outList.add(remainder);
            sum = sum / 10;
        }
        Collections.reverse(outList);

        return outList.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * In this approach first take each element from an array  and append it in string
     * convert tht string to integer
     * add one to integer
     * then create an array of length of string
     * traverse the number and add it in the output array
     *
     * @param digits
     * @return
     */
    private int[] approachOne(int[] digits) {
        String s = "";
        for (int digit : digits) {
            if (digits[0] != 0) {
                s = s + digit;
            } else {
                continue;
            }
        }

        return populateOutputArray(s);
    }


    /**
     * * In this approach we first get the combined digits of array element
     * * and then create an output array of one plus size of an input array
     * * second loop is to get the remainder and add it in the output array
     *
     * @param digits
     * @return
     */
    private int[] approach2(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum = sum * 10 + digits[i];
        }
        sum = sum + 1;
        int out[] = new int[digits.length + 1];
        int i = out.length - 1;
        while (sum > 0) {
            int remainder = sum % 10;
            out[i] = (remainder);
            sum = sum / 10;
            i--;
        }

        return out;
    }
}
