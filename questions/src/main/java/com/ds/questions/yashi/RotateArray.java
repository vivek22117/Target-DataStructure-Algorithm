package com.ds.questions.yashi;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * <p>
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */
public class RotateArray {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,6};
        RotateArray rotateArray = new RotateArray();
        System.out.println(Arrays.toString(rotateArray.rotate(nums, 6)));
    }

    //k*o(n) complexity
    //space is 0(1)
    public int[] rotate(int[] nums, int k) {

        if (nums == null || nums.length == 0) {
            return nums;
        }
        if (nums.length == k) {
            return nums;
        }
        for (int l = 0; l < k; l++) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i >= 1; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
        }
        return nums;
    }
}
