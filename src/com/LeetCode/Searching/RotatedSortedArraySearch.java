package com.LeetCode.Searching;


public class RotatedSortedArraySearch {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which side is sorted
            if (nums[low] <= nums[mid]) {
                // Left side is sorted
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;  // Target is in the left side
                } else {
                    low = mid + 1;  // Target is in the right side
                }
            } else {
                // Right side is sorted
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;  // Target is in the right side
                } else {
                    high = mid - 1;  // Target is in the left side
                }
            }
        }

        return -1;  // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {70, 71, 72, 73, 74, 75,0, 1, 2};
        int target = 75;
        int result = search(nums, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}