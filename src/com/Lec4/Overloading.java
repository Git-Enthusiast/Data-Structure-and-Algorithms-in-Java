package com.Lec4;

import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {
//        fun(67);
//        fun("Rajan Raj");
        int ans = sum(3, 4, 78);
        System.out.println(ans);
        sum();
    }

    private static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of num1 and num2 for addition: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Addition = "+(num1+num2));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
