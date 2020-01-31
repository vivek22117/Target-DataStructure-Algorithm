package com.ds.questions.vivek;

import java.util.Arrays;

public class SearchRange {
    private static final int[] inputData = {3, 4, 4, 9, 9, 9};
    private static final int target = 4;

    public static void main(String[] args) {
        int[] range = findRange(inputData, target);
        System.out.println(Arrays.toString(range));
    }

    private static int[] findRange(int[] inputData, int target) {
        int[] result = {-1, -1};
        if (inputData == null || inputData.length == 0) {
            return result;
        }
        int lastIndex = inputData.length;
        int firstIndex = 0;
        return fetchRangeIndex(inputData, firstIndex, lastIndex, target);

    }

    private static int[] fetchRangeIndex(int[] inputData, int firstIndex, int lastIndex, int target) {
        if (lastIndex < firstIndex) {
            return new int[]{-1, -1};
        }
        int mid = (firstIndex + lastIndex) / 2;
        if (inputData[mid] == target) {
            return searchIndexes(inputData, mid, target);
        } else if (target > inputData[mid]) {
            return fetchRangeIndex(inputData, mid + 1, lastIndex, target);
        } else {
            return fetchRangeIndex(inputData, firstIndex, mid - 1, target);
        }
    }

    private static int[] searchIndexes(int[] inputData, int mid, int target) {
        int[] result = {mid, mid};
        int leftIndex = mid - 1;
        int rightIndex = mid + 1;
        while (leftIndex >= 0) {
            if (inputData[leftIndex] != target) {
                break;
            }
            result[0] = leftIndex;
            leftIndex -= 1;
        }

        while (rightIndex < inputData.length) {
            if (inputData[rightIndex] != target) {
                break;
            }
            result[1] = rightIndex;
            rightIndex += 1;
        }
        return result;
    }
}
