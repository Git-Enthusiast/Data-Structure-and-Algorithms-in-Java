package com.Lec5;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
             1 2 3
             4 5 6
             7 8 9
        */
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][];
        /*
        The array arr is a two-dimensional array of integers (int[][]).
        It has 3 rows, but the size of each row is not specified initially.
        This means that the size of each row can be different.

        In Java, when you create a two-dimensional array like this and only
        specify the number of rows (as in new int[3][]), you're essentially
        creating an array of arrays where the size of the second dimension
        (i.e., the number of columns in each row) is not predetermined.

        So, arr has 3 rows, but the size of each row is initially null until
        you explicitly define it later.
         */

//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows
        // input

        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // output
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}

