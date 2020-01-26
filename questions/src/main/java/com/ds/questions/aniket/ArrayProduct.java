/**
 * Given an array of integers, return a new array such that 
 * each element at index i of the new array is the product 
 * of all the numbers in the original array except the one at i.

   For example, if our input was [1, 2, 3, 4, 5], 
   the expected output would be [120, 60, 40, 30, 24]. 
   If our input was [3, 2, 1], the expected output would be [2, 3, 6].

   Follow-up: what if you can't use division?
 */
package com.ds.questions.aniket;

import java.util.Arrays;

/**
 * @author Aniket Kulkarni
 *
 */
public class ArrayProduct {

    public static void main(String[] args) {
	int[] nums = { 1, 2, 3, 4, 5 };
	System.out.println(Arrays.toString(productOfNumbers1(nums)));
	System.out.println(Arrays.toString(productOfNumbers2(nums)));
	System.out.println(Arrays.toString(productOfNumbers3(nums)));
    }

    // O(n) with division
    private static int[] productOfNumbers1(int[] nums) {
	if (nums == null || nums.length <= 0) {
	    return new int[0];
	}
	int[] prod = new int[nums.length];
	int productOfAllNums = 1;
	for (int i = 0; i < nums.length; i++) {
	    productOfAllNums *= nums[i];
	}
	for (int i = 0; i < nums.length; i++) {
	    prod[i] = productOfAllNums / nums[i];
	}
	return prod;
    }

    // O(n2) without division
    private static int[] productOfNumbers2(int[] nums) {
	if (nums == null || nums.length <= 0) {
	    return new int[0];
	}
	int[] prod = new int[nums.length];

	for (int i = 0; i < nums.length; i++) {
	    int productOfAllNums = 1;
	    for (int j = 0; j < nums.length; j++) {
		if (i == j) {
		    continue;
		}
		productOfAllNums *= nums[j];
	    }
	    prod[i] = productOfAllNums;
	}
	return prod;
    }

    // O(n) without division
    private static int[] productOfNumbers3(int[] nums) {
	int left[] = new int[nums.length];
	int right[] = new int[nums.length];
	int prod[] = new int[nums.length];
	left[0] = 1;
	right[nums.length - 1] = 1;

	for (int i = 1; i < nums.length; i++) {
	    left[i] = nums[i - 1] * left[i - 1];
	}
	for (int j = nums.length - 2; j >= 0; j--) {
	    right[j] = nums[j + 1] * right[j + 1];
	}
	for (int k = 0; k < nums.length; k++) {
	    prod[k] = left[k] * right[k];
	}
	return prod;
    }

}
