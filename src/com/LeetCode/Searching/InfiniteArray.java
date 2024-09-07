package com.LeetCode.Searching;
/*

Find position of an element in a sorted array of infinite numbers

Suppose you have a sorted array of infinite numbers, how would you search an element
in the array?
Source: Amazon Interview Experience.
Since array is sorted, the first thing clicks into mind is binary search,
but the problem here is that we don’t know size of array.
If the array is infinite, that means we don’t have proper bounds to apply
binary search. So in order to find position of key, first we find bounds
and then apply binary search algorithm.
Let low be pointing to 1st element and high pointing to 2nd element of array,
Now compare key with high index element,
->if it is greater than high index element then copy high index in low index
and double the high index.
->if it is smaller, then apply binary search on high and low indices found.
 */
public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};

        int target = 110;
        int result = findPosition(arr, target);
        System.out.println(result);
    }

    private static int findPosition(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
            if (end >= arr.length) {
                end = arr.length - 1;

                if (target > arr[end]) {
                    return -1;
                }

            }
        }
        return BinarySearch(arr, target, start, end);
    }


    private static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}