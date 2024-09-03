package com.Lec7;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {99, 80, 75, 50, 11, 10, 5, 2, -3};
        int target = 0;
        int ans = agnosticBinarySearch(arr,target);
        System.out.println(ans);
    }

    private static int agnosticBinarySearch(int[] arr, int target) {
        if (arr.length==0){
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        boolean isAgnostic = arr[start]<arr[end];
        while (start<=end){
            //  int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start +(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (isAgnostic){
                if (target<arr[mid]){
                    end = mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else {
                if (target<arr[mid]){
                    start=mid+1;
                }
                else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
