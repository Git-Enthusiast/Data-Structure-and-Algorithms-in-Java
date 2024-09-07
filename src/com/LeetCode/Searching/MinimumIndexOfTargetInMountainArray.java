package com.LeetCode.Searching;

// Mock MountainArray interface
interface MinimumIndexInMountainArray {
    public int get(int index);
    public int length();
}

// Mock implementation of MountainArray
class MockMountainArray implements MinimumIndexInMountainArray {
    private int[] arr;

    public MockMountainArray(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }
}

class Solution {
    public int findInMountainArray(int target, MinimumIndexInMountainArray mountainArr) {
        int length = mountainArr.length();

        // Find the peak of the mountain
        int peakIndex = findPeak(mountainArr, 0, length - 1);

        // Search in the left side of the peak (ascending order)
        int leftResult = binarySearch(mountainArr, target, 0, peakIndex, true);
        if (leftResult != -1) {
            return leftResult;
        }

        // If not found in the left side, search in the right side (descending order)
        return binarySearch(mountainArr, target, peakIndex + 1, length - 1, false);
    }

    private int findPeak(MinimumIndexInMountainArray mountainArr, int left, int right) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int binarySearch(MinimumIndexInMountainArray mountainArr, int target, int left, int right, boolean ascending) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = mountainArr.get(mid);

            if (midVal == target) {
                return mid;
            }

            if (ascending) {
                if (midVal < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (midVal > target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] arr1 = {1, 2, 3, 4, 5, 3, 1};
        MinimumIndexInMountainArray mountainArr1 = new MockMountainArray(arr1);
        int target1 = 3;
        int result1 = solution.findInMountainArray(target1, mountainArr1);
        System.out.println("Example 1 Output: " + result1);  // Expected: 2

        // Example 2
        int[] arr2 = {0, 1, 2, 4, 2, 1};
        MinimumIndexInMountainArray mountainArr2 = new MockMountainArray(arr2);
        int target2 = 3;
        int result2 = solution.findInMountainArray(target2, mountainArr2);
        System.out.println("Example 2 Output: " + result2);  // Expected: -1

        // Additional Example
        int[] arr3 = {1, 5, 2};
        MinimumIndexInMountainArray mountainArr3 = new MockMountainArray(arr3);
        int target3 = 2;
        int result3 = solution.findInMountainArray(target3, mountainArr3);
        System.out.println("Additional Example Output: " + result3);  // Expected: 2
    }
}