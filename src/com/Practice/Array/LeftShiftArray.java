package com.Practice.Array;

import java.util.Arrays;

public class LeftShiftArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 4;

        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(array));

        leftShift(array, k);

        System.out.println("\nArray after shifting " + k + " places to the left: ");
        System.out.println(Arrays.toString(array));
    }

    // Function to shift the elements of the array to the left by k places
    private static void leftShift(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[n];
        System.arraycopy(arr, 0, temp, n - k, k);
        System.arraycopy(arr, k, arr, 0, n - k);
        System.arraycopy(temp, n - k, arr, n - k, k);
    }
}

