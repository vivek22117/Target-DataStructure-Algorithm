/**
 * Given an array of integers, return a new array such that
 * each element at index i of the new array is the product
 * of all the numbers in the original array except the one at i.
 * <p>
 * For example, if our input was [1, 2, 3, 4, 5],
 * the expected output would be [120, 60, 40, 30, 24].
 * If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 * <p>
 * Follow-up: what if you can't use division?
 */
package com.ds.questions;

import java.util.Arrays;

/**
 * @author Aniket Kulkarni
 *
 */
public class ArrayProduct {

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5};
        int[] nums = {3, 2, 1};
        System.out.println(Arrays.toString(productOfNumbers(nums)));
    }

    private static int[] productOfNumbers(int[] nums) {
        int out[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }else{
                    prod=prod*nums[j];
                }
                out[i]=prod;
            }
        }
        return out;
    }

}
