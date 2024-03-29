package com.DaaLab;

/*
Enter the size of the array: 5
Enter the elements of the array:
12
67
98
45
51
Original Array:
12 67 98 45 51

Sorted Array:
12 45 51 67 98
Execution Time: 0 milliseconds

 */
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original Array:");
        printArray(arr);

        long startTime = System.currentTimeMillis(); // Record start time

        mergeSort(arr);

        long endTime = System.currentTimeMillis(); // Record end time

        System.out.println("\nSorted Array:");
        printArray(arr);

        printExecutionTime(startTime, endTime);

        scanner.close();
    }

    // Merge Sort function
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            int mid = n / 2;

            int[] left = new int[mid];
            int[] right = new int[n - mid];

            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, n - mid);

            mergeSort(left);
            mergeSort(right);

            merge(arr, left, right);
        }
    }

    // Merge function to merge two sorted arrays
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    // Utility function to print an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Utility function to print execution time
    public static void printExecutionTime(long startTime, long endTime) {
        System.out.println("Execution Time: " + (endTime - startTime) + " milliseconds");
    }
}
