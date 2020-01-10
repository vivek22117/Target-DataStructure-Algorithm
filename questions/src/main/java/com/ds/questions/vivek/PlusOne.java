package com.ds.questions.vivek;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    private static int[] inputData = {9, 9};

    public static void main(String[] args) {
        List<Integer> plusOne = getPlusOne(inputData);
        System.out.println(plusOne.toString());
    }

    //Time Complexity: O(n) => Space Complexity: O(n + 1)
    private static List<Integer> getPlusOne(int[] inputData) {
        if (inputData == null) {
            return new ArrayList<Integer>();
        }

        int carry = 0;
        int result = 0;
        int total = 0;
        int index = inputData.length - 1;

//        int[] output = new int[inputData.length + 1];                       // +1 is required if you use array
//        int resultIndex = output.length - 1;                               // to hold the output of [9, 9, 9]

        List<Integer> response = new ArrayList<Integer>();

        while (index >= 0) {
            if (index == inputData.length - 1) {
                total = inputData[index--] + 1 + carry;
            } else {
                total = inputData[index--] + carry;
            }
            result = total % 10;
            carry = total / 10;
            response.add(0, result);
        }
        if (carry != 0) {
            response.add(0, carry);
        }
        return response;
    }
}
