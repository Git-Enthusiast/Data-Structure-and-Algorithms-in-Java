package com.Lec9;

import java.util.Arrays;

public class BinarySearchInSortedTwoDArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1,  3,  4,  5},
                {2,  6,  8,  10},
                {11, 12, 14, 17}
        };

        int target = 11;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    // Not applicable for the different no of elements in the row of the matrix.
    private static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }
        int r = 0;
        int c = arr[0].length - 1;
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[]{r, c};
            }
            if (arr[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return new int[]{-1, -1};
    }
}