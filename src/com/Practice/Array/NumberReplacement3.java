package com.Practice.Array;

import java.util.Arrays;

public class NumberReplacement3 {
    public static void main(String[] args) {
        int arr[]={12,14,8,3,120,23,232,4,64,21,231,121,12321,45,212};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%4==0)
            {
                if(arr[i]%6==0)
                    arr[i]=-6;
                else
                    arr[i]=-2;
            }
            else
            if(arr[i]%6==0)
                arr[i]=-4;
        }
        System.out.println(Arrays.toString(arr));
    }
}