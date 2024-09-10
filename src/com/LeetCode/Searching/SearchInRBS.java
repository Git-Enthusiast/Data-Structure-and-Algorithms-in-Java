package com.LeetCode.Searching;

public class SearchInRBS {

    // Function to find the pivot in the rotated sorted array
    public static int findPivot(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Check if mid element is greater than the next one
            if (mid < high && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // Check if mid element is smaller than the previous one
            if (mid > low && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Decide the side to move on
            if (nums[low] >= nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // If the array is not rotated
    }

    // Function to perform binary search in a subarray
    public static int binarySearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Target not found
    }

    // Main search function
    public static int search(int[] nums, int target) {
        int n = nums.length;

        // Step 1: Find the pivot
        int pivot = findPivot(nums);

        // If there's no pivot, just do a binary search on the entire array
        if (pivot == -1) {
            return binarySearch(nums, 0, n - 1, target);
        }

        // Step 2: Determine which part of the array to search
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, 0, pivot - 1, target);
        } else {
            return binarySearch(nums, pivot + 1, n - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(nums, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}