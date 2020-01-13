package com.ds.questions.vivek;

public class RemoveDuplicate {
    //    private static int[] inputData = {1, 1, 2, 3, 4, 4, 4, 5, 5, 5, 6};
//    private static int[] inputData = {1, 1};
    private static int[] inputData = {1, 1, 1, 2, 2, 3};
//    private static int[] inputData = {1, 1, 3};
//    private static int[] inputData = {1, 1, 1, 3};


    public static void main(String[] args) {
        int finalCount = removeDuplicates(inputData);
        System.out.println(finalCount);
    }

    //Runtime Complexity: O(n) => Space Complexity: O(1)
    private static int removeDuplicates(int[] inputData) {
        if (inputData == null || inputData.length == 0) {
            return -1;
        }

        int index = 0;
        int finalCount = 0;
        while (index < inputData.length) {
            int temp = inputData[index];
            int count = 1;
            int r = index + 1;
            while (r < inputData.length) {
                if (inputData[r] == temp && count < 2) {
                    count += 1;
                }
                if (inputData[r] != temp) break;
                r += 1;
            }
            finalCount += count;
            index = r;
        }
        return finalCount;
    }
}
