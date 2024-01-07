package com.Lec6;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][]arr = {
                {12,34,86,8,1256,345},
                {354,456,67,84,5,87,424,5},
                {235,89,67,3,78,76,1091},
                {56,78,97,45,14,899,78,7}
        };
        int target = 1091;
        int[]result = SearchElement(arr,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] SearchElement(int[][] arr, int target) {
        if (arr.length==0){
            return new int[]{-1,-1};
        }
        for (int row = 0;row<arr.length;row++){
            for (int col = 0;col<arr[row].length;col++){
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }


}
