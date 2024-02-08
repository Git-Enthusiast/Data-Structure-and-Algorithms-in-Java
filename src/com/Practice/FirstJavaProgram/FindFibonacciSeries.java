package com.Practice.FirstJavaProgram;

import java.util.Scanner;


/*
To calculate Fibonacci Series up to n numbers.
 */
public class FindFibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the value of 'n' to find the fibonacci number: ");
        int num = in.nextInt();
        System.out.println("The "+num+"th Fibonacci Number is: "+fib(num)+".");
    }
    static int fib(int n){
        if (n == 1|| n == 0) return n;
     return fib(n-1)+fib(n-2);
    }
}
