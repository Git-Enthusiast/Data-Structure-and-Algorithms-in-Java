package com.Practice.Functions;

import java.util.Scanner;

/*
Write a function to check if a given triplet is a Pythagorean triplet or not.
(A Pythagorean triplet is when the sum of the square of two numbers is equal
to the square of the third number).


 */
public class CheckPythagoreanTriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the three Number to Check Whether it is Pythagorean triplet or not:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if (isPythagoreanTriplet(num1,num2,num3)){
            System.out.println("The Given number ( "+num1+", "+num2+", "+num3+" ) is a Pythagorean Triplet.");
        }
        else System.out.println("The Given number ( "+num1+", "+num2+", "+num3+" ) is Not a Pythagorean Triplet.");
    }
    // the sum of square of smaller two number = square of largest number.
    private static boolean isPythagoreanTriplet(int num1, int num2, int num3) {
        int sum = num1+num2+num3;
        int midNumber = sum -(max(num1,num2,num3)+min(num1,num2,num3));
        return ((Math.pow(min(num1,num2,num3),2)+Math.pow(midNumber,2))==(Math.pow(max(num1, num2, num3),2)));
    }

    private static int min(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    private static int max(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}
