package com.ds.questions.vivek;

public class SearchInsertPosition {
    private static final int[] inputData = {3};
    private static final int target = 11;

    public static void main(String[] args) {
        int insertingPosition = getInsertingPosition(inputData, target);
        System.out.println(insertingPosition);
    }

    private static int getInsertingPosition(int[] inputData, int target) {
        if (inputData == null || inputData.length == 0) {
            return -1;
        }
        int startIndex = 0;
        int lastIndex = inputData.length - 1;
        return getInsertingIndex(inputData, startIndex, lastIndex, target);
    }

    //Runtime Complexity: O(log n) => Space Complexity: O(1)
    private static int getInsertingIndex(int[] inputData, int startIndex, int lastIndex, int target) {
        if (lastIndex < startIndex) {
            return startIndex;
        }
        int middleIndex = (startIndex + lastIndex) / 2;
        if (inputData[middleIndex] == target) {
            return middleIndex;
        } else if (inputData[middleIndex] < target) {
            return getInsertingIndex(inputData, middleIndex + 1, lastIndex, target);
        } else {
            return getInsertingIndex(inputData, startIndex, middleIndex - 1, target);
        }
    }
}
