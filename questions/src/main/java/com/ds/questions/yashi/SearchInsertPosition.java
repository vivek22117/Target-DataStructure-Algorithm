/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * <p>
 * Input: [1,3,5,6], 5
 * Output: 2
 * <p>
 * Input: [1,3,5,6], 2
 * Output: 1
 * <p>
 * Input: [1,3,5,6], 7
 * Output: 4
 * <p>
 * Input: [1,3,5,6], 0
 * Output: 0
 */
package com.ds.questions.yashi;

public class SearchInsertPosition {

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 2, 4, 5, 6}, 5));
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 2, 4, 5, 6}, 8));
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 2, 4, 5, 6}, 3));
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 2, 4, 5, 6}, 0));
    }

    public int searchInsert(int[] nums, int target) {
        int i;
        for (i = 0; i < nums.length - 1; i++) {
            if (target == nums[i]) {
                return i;
            } else if (target < nums[i]) {
                return i;
            }
        }
        return i + 1;

    }

}
