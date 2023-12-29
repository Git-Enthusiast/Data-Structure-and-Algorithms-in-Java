package com.Lec5;

import java.util.Arrays;

public class SwapReverse {
    public static void main(String[] args) {
        int[]arr={12,33,44,26,74};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,3);
        reverse(arr);

    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            arr[start]=arr[start]+arr[end];
            arr[end]=arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int i1) {
        // by using temporary variable
        int temp = arr[i];
       arr[i]=arr[i1];
       arr[i1]=temp;
        // by without using temporary variable.
//        arr[i]=arr[i]+arr[i1];
//        arr[i1]=arr[i]-arr[i1];
//        arr[i]=arr[i]-arr[i1];
        System.out.println(Arrays.toString(arr));
    }
}
