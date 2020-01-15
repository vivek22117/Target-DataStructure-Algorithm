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
	int[] resultArr = new int[maxLen];
	int carry = 0;
	int aIndex = arrayA.length - 1;
	int bIndex = arrayB.length - 1;
	int resultIndex = resultArr.length - 1;
	for (; aIndex >= 0 && bIndex >= 0; aIndex--) {
	    carry = performSum(resultArr, resultIndex, arrayA[aIndex] + arrayB[bIndex] + carry);
	    resultIndex -= 1;
	    bIndex -= 1;
	}
	for (; aIndex >= 0; aIndex--) {
	    carry = performSum(resultArr, resultIndex, arrayA[aIndex] + carry);
	    resultIndex -= 1;
	}
	for (; bIndex >= 0; bIndex--) {
	    carry = performSum(resultArr, resultIndex, arrayB[bIndex] + carry);
	    resultIndex -= 1;
	}
	if (carry != 0) {
	    int[] temp = new int[resultArr.length + 1];
	    for (int l = resultArr.length; l > 0; l--) {
		temp[l] = resultArr[l - 1];
	    }
	    temp[0] = carry;
	    resultArr = temp;
	}
	return resultArr;
    }

    private static int performSum(int[] arr, int index, int sum) {
	arr[index] = sum;
	int carry = 0;
	if (sum > 9) {
	    arr[index] = sum % 10;
	    carry = 1;
	}
	return carry;
    }
}
