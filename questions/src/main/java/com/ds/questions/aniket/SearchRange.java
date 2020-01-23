package com.ds.questions.aniket;

/**
 * Given an array of integers nums sorted in ascending order, find the starting
 * and ending position of a given target value.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>
 * If the target is not found in the array, return [-1, -1].
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4] Example 2:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 6 Output: [-1,-1]
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
	if (nums == null || nums.length <= 0) {
	    return new int[0];
	}
	int[] result = { -1, -1 };
	int targetIndex = findIndexValue(nums, target);
	if (targetIndex == -1) {
	    return result;
	}
	return findStartEndPosition(nums, targetIndex, target);
    }

    private int findIndexValue(int[] nums, int target) {
	int left = 0, right = nums.length - 1;
	while (left <= right) {
	    int mid = left + (right - left) / 2;
	    if (nums[mid] == target) {
		return mid;
	    }
	    if (nums[mid] < target) {
		left = mid + 1;
	    } else {
		right = mid - 1;
	    }
	}
	return -1;
    }

    private int[] findStartEndPosition(int[] nums, int mid, int target) {
	int[] result = { mid, mid };
	int leftIndex = mid - 1;
	while (leftIndex >= 0 && nums[leftIndex] == target) {
	    leftIndex -= 1;
	    continue;
	}
	result[0] = leftIndex + 1;

	int rightIndex = mid + 1;
	while (rightIndex < nums.length && nums[rightIndex] == target) {
	    rightIndex += 1;
	    continue;
	}
	result[1] = rightIndex - 1;
	return result;
    }
}
