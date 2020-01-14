package com.ds.questions.aniket;

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
    private static final int[] arrayA = { 2, 4, 5, 1 };
    private static final int[] arrayB = { 1, 7, 9 };

    public static void main(String[] args) {
	int[] result = preformAdditionDigitByDigit(arrayA, arrayB);
	System.out.println(Arrays.toString(result));
    }

    public static int[] preformAdditionDigitByDigit(int[] arrayA, int[] arrayB) {
	int maxLen = arrayA.length > arrayB.length ? arrayA.length : arrayB.length;
	int[] result = new int[maxLen];
	int carry = 0;
	int i = arrayA.length - 1;
	int j = arrayB.length - 1;
	int k = result.length - 1;
	for (; i >= 0 && j >= 0; i--) {
	    if (arrayA[i] + arrayB[j] + carry > 9) {
		result[k] = (arrayA[i] + arrayB[j] + carry) % 10;
		carry = 1;
	    } else {
		result[k] = arrayA[i] + arrayB[j] + carry;
		carry = 0;
	    }
	    k -= 1;
	    j -= 1;
	}
	while (i >= 0) {
	    if (arrayA[i] + carry > 9) {
		result[k] = (arrayA[i] + carry) % 10;
		carry = 1;
	    } else {
		result[k] = arrayA[i] + carry;
		carry = 0;
	    }
	    i -= 1;
	    k -= 1;
	}
	while (j >= 0) {
	    if (arrayB[j] + carry > 9) {
		result[k] = (arrayB[j] + carry) % 10;
		carry = 1;
	    } else {
		result[k] = arrayB[j] + carry;
		carry = 0;
	    }
	    j -= 1;
	    k -= 1;
	}
	if (carry != 0) {
	    int[] temp = new int[result.length + 1];
	    for (int l = result.length; l > 0; l--) {
		temp[l] = result[l - 1];
	    }
	    temp[0] = carry;
	    result = temp;
	}
	return result;
    }
}
