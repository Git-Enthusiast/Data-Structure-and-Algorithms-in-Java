package com.Lec5;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int []arr={12,34,54,53,23};
        System.out.println(Arrays.toString(arr));
        extracted(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void extracted(int[]arr) {
        arr[3]=1091;
    }
}
