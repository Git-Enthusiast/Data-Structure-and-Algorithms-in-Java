package com.Lec5;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new  int[5];
        for (int i = 0 ; i< arr.length;i++){
           arr[i]= in.nextInt();
        }
        arr[0] =24;
        arr[1] =25;
        arr[2] =26;
        arr[3] =27;
        arr[4] =29;

//          System.out.println(Arrays.toString(arr));
//        // taking input using loop
//        System.out.println("please enter the input of the array:");
//         for (int i = 0 ; i< arr.length;i++){
////            arr[i]= in.nextInt();
//        }

        // printing output without using loop
//        System.out.println(Arrays.toString(arr));


        // printing output using loop
//        for (int i = 0;i< arr.length;i++){
//            System.out.print(arr[i]);
//        }


        // enhanced for loop
//        for (int j : arr) {
//            System.out.print(j+" ");
//        }
//


        String[] str = new String[5];
        System.out.println("Please enter the input string:");
        for (int i = 0; i< str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
        str[3]="Rajan Raj";
        System.out.println(Arrays.toString(str));

    }
}
