package com.Lec4;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr ={81,51,81,96,92};
        getChange(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void getChange(int[] arr) {
        arr[4]=93;
    }
}
