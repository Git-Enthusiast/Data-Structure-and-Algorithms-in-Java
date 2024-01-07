package com.Lec7;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr = {-12,-4,-1,0,7,11,51,91,1091};
        int target = 7;
        int index = binarySearchInArray(arr,target); // will return index of the element  if not found -1
        System.out.println(index);

    }

    private static int binarySearchInArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        if (arr.length==0){
            return -1;
        }
        // Assume the array is in ascending order sorted.
        while (start<=end){
          //  int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start +(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (target<arr[mid]){
                end = mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
