package com.Lec4;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please Enter First no :");
//        int a = in.nextInt();
//        System.out.println("Please Enter Second no :");
//        int b = in.nextInt();
//        int sum = a + b;
//        System.out.println("The Sum is "+sum);


      //  sum();


        int ans = sum2();
        System.out.println(ans);
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter First no :");
        int a = in.nextInt();
        System.out.println("Please Enter Second no :");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("The Sum is "+sum);

    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter First no :");
        int a = in.nextInt();
        System.out.println("Please Enter Second no :");
        int b = in.nextInt();
        int sum = a + b;
        return sum;
    }
}
