package com.Practice.Array;

import java.util.Arrays;

public class RightShiftingOfArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6,7,8,9,10};
        int k = 4;

        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(array));

        shiftRight(array, k);

        System.out.println("\nArray after shifting " + k + " places to the right: ");
        System.out.println(Arrays.toString(array));
    }

    // Function to shift the elements of the array to the right by k places
    private static void shiftRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handling the case where k is greater than the length of the array

        // Create a temporary array to store the shifted elements
        int[] temp = new int[n];

        // Copy the last k elements to the temporary array
        System.arraycopy(arr, n - k, temp, 0, k);

        // Shift the remaining elements to the right
        System.arraycopy(arr, 0, arr, k, n - k);

        // Copy the elements from the temporary array back to the original array
        System.arraycopy(temp, 0, arr, 0, k);
    }

}
