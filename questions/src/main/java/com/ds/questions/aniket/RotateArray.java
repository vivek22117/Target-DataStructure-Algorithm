package com.ds.questions.aniket;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4,5,6,7] and k = 3 Output: [5,6,7,1,2,3,4] Explanation: rotate
 * 1 steps to the right: [7,1,2,3,4,5,6] rotate 2 steps to the right:
 * [6,7,1,2,3,4,5] rotate 3 steps to the right: [5,6,7,1,2,3,4] Example 2:
 * <p>
 * Input: [-1,-100,3,99] and k = 2 Output: [3,99,-1,-100] Explanation: rotate 1
 * steps to the right: [99,-1,-100,3] rotate 2 steps to the right:
 * [3,99,-1,-100]
 */
public class RotateArray {

    public static void main(String[] args) {
	int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
	// int[] nums = {-1,-100,3,99};
	int k = 3;
	// System.out.println(Arrays.toString(new RotateArray().rotateLeft(nums, k)));
	System.out.println(Arrays.toString(new RotateArray().rotateRight(nums, k)));
    }

    private int[] rotateLeft(int[] nums, int k) {
	if (nums == null || nums.length <= 0 || k % nums.length == 0) {
	    return nums;
	}
	for (int j = 0; j < k % nums.length; j++) {
	    for (int i = 1; i < nums.length; i++) {
		int temp = nums[i];
		nums[i] = nums[i - 1];
		nums[i - 1] = temp;
	    }
	}
	return nums;
    }

    private int[] rotateRight(int[] nums, int k) {
	if (nums == null || nums.length <= 0 || k % nums.length == 0) {
	    return nums;
	}
	for (int j = 0; j < k % nums.length; j++) {
	    for (int i = nums.length - 2; i >= 0; i--) {
		int temp = nums[i];
		nums[i] = nums[i + 1];
		nums[i + 1] = temp;
	    }
	}
	return nums;
    }
}
