package com.Practice.Array;
/*
 Input :- arr[] = {10,20,30,40,50,60};

Output :- arr[] = {60,50,40,30,20,10};
   */

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50,60};
//
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
//            arr[start] = arr[start] + arr[end];
//            arr[end] = arr[start] - arr[end];
//            arr[start] = arr[start] - arr[end];
//            start++;
//            end--;
//        }
//        System.out.print("Reversed Array: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }




//        int arr[]= {10,20,30,40,50};
//        int n=arr.length;
//        for(int i=0;i<n/2;i++) {
//            arr[i] = arr[i]+arr[n-i-1];
//            arr[n-i-1]=arr[i]-arr[n-i-1];
//            arr[i]=arr[i]-arr[n-i-1];
//        }
//        for(int i=0;i<n;i++) {
//            System.out.print(arr[i]+" ");
//        }

        Reverse();
    }

    public static void Reverse() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the array Element:");
        int [] enterArray = new int[6];
        for (int i = 0;i< enterArray.length;i++){
            enterArray[i]= in.nextInt();
        }
        System.out.println("Your Original Array ="+Arrays.toString(enterArray));
        int  start = 0;
        int  end = enterArray.length -1;

        while (start<end){
            enterArray[start] = enterArray[start] + enterArray[end];
            enterArray[end] =   enterArray[start] - enterArray[end];
            enterArray[start] = enterArray[start] - enterArray[end];
            start++;
            end--;
        }
        System.out.println("Reversed Array = "+ Arrays.toString(enterArray));
    }
}