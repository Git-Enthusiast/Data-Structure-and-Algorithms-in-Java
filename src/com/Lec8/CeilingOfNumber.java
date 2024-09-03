package com.Lec8;

import java.util.Arrays;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] ascendingArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int[] descendingArray = {15, 13, 11, 9, 7, 5, 3, 1};

        System.out.println("Ascending array: " + Arrays.toString(ascendingArray));
        System.out.println("Ceiling of 6: " + findCeiling(ascendingArray, 6));
        System.out.println("Ceiling of 8: " + findCeiling(ascendingArray, 8));
        System.out.println("Ceiling of 16: " + findCeiling(ascendingArray, 16));
        System.out.println("Ceiling of -12: " + findCeiling(ascendingArray, -12));


        System.out.println("\nDescending array: " + Arrays.toString(descendingArray));
        System.out.println("Ceiling of 6: " + findCeiling(descendingArray, 6));
        System.out.println("Ceiling of 8: " + findCeiling(descendingArray, 8));
        System.out.println("Ceiling of 16: " + findCeiling(descendingArray, 16));
        System.out.println("Ceiling of -10: " + findCeiling(descendingArray, -10));

    }


    public static int findCeiling(int[] arr, int target) {
            if (arr == null || arr.length == 0) {
                return -1; // Invalid input
            }

            boolean isAscending = arr[0] < arr[arr.length - 1];

            // If target is greater than the largest number in the array
            if ((isAscending && target > arr[arr.length - 1]) ||
                    (!isAscending && target > arr[0])) {
                return -1;
            }

            int start = 0;
            int end = arr.length - 1;

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

            return isAscending ? arr[start] : arr[end];
        }


    }
