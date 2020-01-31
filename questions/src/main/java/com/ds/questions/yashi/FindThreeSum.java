package com.ds.questions.yashi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class FindThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<Set<int[]>> sets = threeSum(nums);
        System.out.println(sets
        );

    }

    public static List<Set<int[]>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<int[]> list = new HashSet<int[]>();


        List<Set<int[]>> combine = new ArrayList<Set<int[]>>();
        //        Set<Set<Integer>> combine = new HashSet<Set<Integer>>();
        for (int i = 0; i < nums.length - 3; i++) {
            int firstNum = nums[i];
            int threeSum[] = new int[3];
            int leftIndex = i + 1;
            int rightIndex = nums.length - 1;
            while (leftIndex < rightIndex) {
                int sum = firstNum + nums[leftIndex] + nums[rightIndex];
                if (sum > 0) {
                    rightIndex--;
                } else if (sum < 0) {
                    leftIndex++;
                } else if (sum == 0) {
                    threeSum[0] = firstNum;
                    threeSum[1] = nums[leftIndex];
                    threeSum[2] = nums[rightIndex];

                    list.add(threeSum);
                    leftIndex++;
                    rightIndex--;
                    threeSum= new int[3];
                } else {
                    continue;
                }

            }
        }
        combine.add(list);
        return combine;
    }
}
