package com.ds.questions.yashi;

/**
 * Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example 1:
 * <p>
 * Given nums = [1,1,1,2,2,3],
 * <p>
 * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
 * <p>
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 * <p>
 * Given nums = [0,0,1,1,1,1,2,3,3],
 * <p>
 * Your function should return length = 7, with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.
 * <p>
 * It doesn't matter what values are set beyond the returned length.
 */
public class RemoveDup {

    int removeDuplicates(int[] nums) {
        int total = 0;
        int count = 1;

        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                if (count > 2) {
                    count = 2;
                }
                total = total + count;
                count = 1;
            }
        }
        total = total + count;
        return total;
    }

    public static void main(String[] args) {
        RemoveDup removeDup = new RemoveDup();
//        int nums[] = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int nums[] = {1, 1, 1, 2, 2, 3, 3, 4};
        removeDup.removeDuplicates(nums);
    }
}
