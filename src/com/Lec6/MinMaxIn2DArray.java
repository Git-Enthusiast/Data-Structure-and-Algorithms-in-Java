package com.Lec6;

public class MinMaxIn2DArray {
    public static void main(String[] args) {
        int[][]arr = {
                {12,34,86,8,156,345},
                {354,456,67,84,5,87,424,5},
                {235,89,67,-3,78,76,1091},
                {56,78,97,45,14,899,78,7}
        };
        int min = findMin(arr);
        int max = findMax(arr);
        System.out.println(min);
        System.out.println(max);

    }

    private static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ins : arr) {
            for (int anInt : ins) {
                if (anInt >max) {
                    max = anInt;

                }
            }
        }
        return max;
    }

    private static int findMin(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] ins : arr) {
            for (int anInt : ins) {
                if (anInt < min) {
                    min = anInt;

                }
            }
        }

        return min;
    }
}
