package com.Practice.Array;

public class NumberReplacement2 {
    public static void main(String[] args) {
        int[]arr = {12,14,8,3,120,23,232,4,64,21,231,121,12321,45,212};
        for (int i =0;i< arr.length;i++){
            if(arr[i]%10==1){
                arr[i]=-1;
                if(arr[i]/10%10==2){
                    arr[i]=-3;
                }
            }

        }
    }
}
