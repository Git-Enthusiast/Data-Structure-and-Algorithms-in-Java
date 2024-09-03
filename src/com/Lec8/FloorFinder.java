package com.Lec8;

import java.util.Arrays;

public class FloorFinder {
    public static int findFloor(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1; // Invalid input
        }

        boolean isAscending = arr[0] < arr[arr.length - 1];

        // If target is smaller than the smallest number in the array
        if ((isAscending && target < arr[0]) ||
                (!isAscending && target < arr[arr.length - 1])) {
            return -1;
        }

        int start = 0;
        int end= arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }

            if (isAscending) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return isAscending ? arr[end] : arr[start];
    }

    public static void main(String[] args) {
        int[] ascendingArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int[] descendingArray = {15, 13, 11, 9, 7, 5, 3, 1};

        System.out.println("Ascending array: " + Arrays.toString(ascendingArray));
        System.out.println("Floor of 6: " + findFloor(ascendingArray, 6));
        System.out.println("Floor of 8: " + findFloor(ascendingArray, 8));
        System.out.println("Floor of 0: " + findFloor(ascendingArray, 0));
        System.out.println("Floor of 21: " + findFloor(ascendingArray, 21));


        System.out.println("\nDescending array: " + Arrays.toString(descendingArray));
        System.out.println("Floor of 6: " + findFloor(descendingArray, 6));
        System.out.println("Floor of 8: " + findFloor(descendingArray, 8));
        System.out.println("Floor of 0: " + findFloor(descendingArray, 0));
        System.out.println("Floor of 21: " + findFloor(descendingArray, 21));

    }
}
