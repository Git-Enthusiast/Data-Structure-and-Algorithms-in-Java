package com.Practice.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotationOfArray {
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // to handle cases where k > n

        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};
        int k = 4;

        rotateArray(arr, k);

        System.out.println("Rotated array:");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}