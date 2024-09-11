package com.LeetCode.Searching;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
167. Two Sum II - Input Array Is Sorted
Solved
Medium
Topics
Companies
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
find two numbers such that they add up to a specific target number. Let these two numbers
be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array
[index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same
element twice.

Your solution must use only constant extra space.



Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].


Constraints:

2 <= numbers.length <= 3 * 104
-1000 <= numbers[i] <= 1000
numbers is sorted in non-decreasing order.
-1000 <= target <= 1000
The tests are generated such that there is exactly one solution.
 */
public class TwoSum_II {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum_II()));
    }
    public static int[] twoSum_II() {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 }; // Convert to 1-indexed positions
            } else if (sum < target) {
                left++; // Move left pointer to the right to increase the sum
            } else {
                right--; // Move right pointer to the left to decrease the sum
            }
        }

        // If no solution is found, though problem guarantees exactly one solution
        throw new IllegalArgumentException("No two sum solution");
    }

}
