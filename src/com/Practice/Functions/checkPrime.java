package com.Practice.Functions;

import java.util.Scanner;

/*
Define a method to find out if a number is prime or not.
 */
public class checkPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number to Check whether it is Prime or Not:");
        int num = input.nextInt();
        if (isPrime(num)) System.out.println(num+" is a Prime No.");
        else System.out.println(num+" is not a Prime No.");
    }

    private static boolean isPrime(int num) {
        if (num<=1)return false;
        for (int i = 2;i*i<=num;i++){
            if (num%i==0) return false;
        }
        return  true;
    }
}
