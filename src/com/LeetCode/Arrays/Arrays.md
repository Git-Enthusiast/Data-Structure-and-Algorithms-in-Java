
### **Easy** (Beginner-Friendly)

1. **Rotate Array by One**
    - **Problem**: Cyclically rotate the array by one position.
    - **Example**: `Input: [1, 2, 3, 4, 5] → Output: [5, 1, 2, 3, 4]`

2. **Move Zeros to the End**
    - **Problem**: Move all zeros to the end while maintaining the order of non-zero elements.
    - **Example**: `Input: [0, 1, 0, 3, 12] → Output: [1, 3, 12, 0, 0]`

3. **Shift All Negative Numbers to the Beginning**
    - **Problem**: Shift all negative numbers to the beginning without changing the order of positive numbers.
    - **Example**: `Input: [-1, 5, -6, 2] → Output: [-1, -6, 5, 2]`

4. **Maximum Consecutive 1s**
    - **Problem**: Find the maximum number of consecutive `1`s in a binary array.
    - **Example**: `Input: [1, 1, 0, 1, 1, 1] → Output: 3`

5. **Remove Duplicates from Sorted Array**
    - **Problem**: Remove duplicates in a sorted array in-place.
    - **Example**: `Input: [0, 1, 1, 2, 2, 3] → Output: [0, 1, 2, 3]`

6. **Remove Element**
    - **Problem**: Remove all instances of a specific value from an array in-place.
    - **Example**: `Input: [3, 2, 2, 3], val = 3 → Output: [2, 2]`

7. **Find Maximum in Rotated Array**
    - **Problem**: Find the maximum value in a rotated array.
    - **Example**: `Input: [3, 4, 5, 1, 2] → Output: 5`

8. **Second Largest Element in Array**
    - **Problem**: Find the second largest element in an array.
    - **Example**: `Input: [12, 35, 1, 10, 34, 1] → Output: 34`

9. **Find the Missing Number**
    - **Problem**: Given an array containing `n-1` numbers, find the missing number from `1` to `n`.
    - **Example**: `Input: [1, 2, 4, 5] → Output: 3`

10. **Find Single Element in a Pair Array**
    - **Problem**: Every element in the array appears twice except for one. Find that single one.
    - **Example**: `Input: [4, 1, 2, 1, 2] → Output: 4`

---

### **Medium**

1. **Rotate Array**
    - **Problem**: Rotate an array to the right by `k` steps.
    - **Example**: `Input: [1, 2, 3, 4, 5, 6, 7], k = 3 → Output: [5, 6, 7, 1, 2, 3, 4]`

2. **Sliding Window Maximum**
    - **Problem**: Find the maximum for each sliding window of size `k`.
    - **Example**: `Input: [1, 3, -1, -3, 5, 3, 6, 7], k = 3 → Output: [3, 3, 5, 5, 6, 7]`

3. **Rearrange Array Alternating Positive and Negative**
    - **Problem**: Rearrange the array such that positive and negative numbers alternate.
    - **Example**: `Input: [1, -2, 3, -4, 5, -6] → Output: [1, -2, 3, -4, 5, -6]`

4. **Merge Sorted Arrays**
    - **Problem**: Merge two sorted arrays into one sorted array.
    - **Example**: `Input: [1, 2, 3], [2, 5, 6] → Output: [1, 2, 2, 3, 5, 6]`

5. **Product of Array Except Self**
    - **Problem**: Return an array where each element is the product of all the elements except itself.
    - **Example**: `Input: [1, 2, 3, 4] → Output: [24, 12, 8, 6]`

6. **Next Greater Element**
    - **Problem**: Find the next greater element for each element in the array.
    - **Example**: `Input: [4, 5, 2, 10] → Output: [5, 10, 10, -1]`

7. **Insert Interval**
    - **Problem**: Insert a new interval into a list of sorted non-overlapping intervals, merging if necessary.
    - **Example**: `Input: [[1, 3], [6, 9]], newInterval = [2, 5] → Output: [[1, 5], [6, 9]]`

8. **Trapping Rain Water**
    - **Problem**: Given an elevation map, compute how much water it can trap after raining.
    - **Example**: `Input: [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1] → Output: 6`

9. **Rearrange Array by Even and Odd Indices**
    - **Problem**: Rearrange an array such that elements at even indices are even, and elements at odd indices are odd.
    - **Example**: `Input: [3, 1, 2, 4] → Output: [2, 1, 4, 3]`

10. **Find Majority Element**
    - **Problem**: Find the element that appears more than `n/2` times in the array.
    - **Example**: `Input: [3, 2, 3] → Output: 3`

---

### **Hard**

1. **Merge K Sorted Arrays**
    - **Problem**: Merge `k` sorted arrays into one sorted array.
    - **Example**: `Input: [[1, 4, 5], [1, 3, 4], [2, 6]] → Output: [1, 1, 2, 3, 4, 4, 5, 6]`

2. **Kth Largest Element in Array**
    - **Problem**: Find the `k`th largest element in an unsorted array.
    - **Example**: `Input: [3, 2, 1, 5, 6, 4], k = 2 → Output: 5`

3. **Maximum Product Subarray**
    - **Problem**: Find the contiguous subarray within an array that has the largest product.
    - **Example**: `Input: [2, 3, -2, 4] → Output: 6`

4. **Reverse Pairs**
    - **Problem**: Return the number of reverse pairs where `nums[i] > 2 * nums[j]` and `i < j`.
    - **Example**: `Input: [1, 3, 2, 3, 1] → Output: 2`

5. **Longest Consecutive Sequence**
    - **Problem**: Find the length of the longest consecutive elements sequence in an unsorted array.
    - **Example**: `Input: [100, 4, 200, 1, 3, 2] → Output: 4`

6. **Find Missing and Repeating Number**
    - **Problem**: Given an unsorted array of size `n`, find both the missing and repeating numbers.
    - **Example**: `Input: [4, 3, 6, 2, 1, 1] → Output: [5, 1]`

7. **Find Median from Data Stream**
    - **Problem**: Find the median of a stream of integers.
    - **Example**: Continuously insert numbers and find the median.

8. **Count Inversions in an Array**
    - **Problem**: Given an array, count the number of inversions where `nums[i] > nums[j]` and `i < j`.
    - **Example**: `Input: [8, 4, 2, 1] → Output: 6`

9. **Maximum Subarray with At Least K Elements**
    - **Problem**: Find the maximum sum of a subarray with at least `k` elements.
    - **Example**: `Input: [1, 1, 1, -1, -1, -1, 2] → Output: 5`

10. **Partition Array into Disjoint Intervals**
    - **Problem**: Partition the array into two disjoint intervals