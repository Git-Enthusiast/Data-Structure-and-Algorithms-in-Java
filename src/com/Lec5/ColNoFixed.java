package com.Lec5;

import java.util.Arrays;
import java.util.Scanner;

public class ColNoFixed {
    public static void main(String[] args) {
//        Array2D_staticInput();
        Array2D_DynamicInput();
    }

    public static void Array2D_staticInput() {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void Array2D_DynamicInput(){
        int[][]arr=new int[3][2];
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the element of the 2D array:");
        for (int row = 0;row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                arr[row][col]= in.nextInt();
            }
        }
        //  to print array without loop in matrix format
        System.out.println(Arrays.deepToString(arr)
                .replace("],", "]\n")
                .replace("[[", "[")
                .replace("]]", "]"));
        // to print array without loop normal format:
        System.out.println(Arrays.deepToString(arr));
        // to print array by using loop :
        System.out.println("[");
        for (int row = 0;row< arr.length;row++){
            System.out.print("{ ");
            for (int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println("}");

        }
        System.out.println("]");


    }
}