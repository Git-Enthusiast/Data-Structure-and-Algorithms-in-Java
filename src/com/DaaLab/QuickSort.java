package com.DaaLab;

/*
Enter the size of the array: 5
Enter the elements of the array:
12
67
45
06
34
Original Array:
12 67 45 6 34

Sorted Array:
6 12 34 45 67
Execution Time: 6 milliseconds

 */
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Original Array:");
        printArray(arr);

        long startTime = System.currentTimeMillis(); // Record start time

        quickSort(arr, 0, size - 1);

        long endTime = System.currentTimeMillis(); // Record end time

        System.out.println("\nSorted Array:");
        printArray(arr);

        printExecutionTime(startTime, endTime);

        input.close();
    }

    // Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    // Partition function to find the partition index
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
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
