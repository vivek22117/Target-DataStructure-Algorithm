package com.ds.questions.yashi;

import java.util.Arrays;

/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>
 * If the target is not found in the array, return [-1, -1].
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
public class SearchRange {

    public static int[] searchRange(int[] nums, int target) {
        int count = 0;
        int[] out = new int[2];
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == target && count == 0) {
                out[0] = i;
                count++;
            } else if (count > 0 && nums[i] == target) {
                count++;
            }
            else if (count > 0 && nums[i] != target) {
                int pos=i-1;
                out[1]=pos;
            }
        }
        return out;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{8, 8, 8, 8, 8,8,8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
