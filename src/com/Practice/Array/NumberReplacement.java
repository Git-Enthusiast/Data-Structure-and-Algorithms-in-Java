package com.Practice.Array;

import java.util.Arrays;

public class NumberReplacement {
    public static void replaceNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0 && arr[i] % 8 == 0) {
//                arr[i] = -3;
//            }  else if (arr[i] % 2 == 0) {
//                arr[i] = -1;
//            }
            if (arr[i]%2==0){
                arr[i]=-1;
                if (arr[i]%8==0){
                    arr[i]=-3;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 14, 8, 3, 120, 23, 232, 4, 64, 21, 231, 121, 12321, 45, 212};

        replaceNumbers(arr);

        System.out.println("Modified array:");
        System.out.println(Arrays.toString(arr));
    }
}
