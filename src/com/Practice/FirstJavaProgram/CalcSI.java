package com.Practice.FirstJavaProgram;

import java.util.Scanner;

/*
Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
 */
public class CalcSI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Principal amount:");
        float principal = input.nextFloat();
        System.out.println("Please Enter Your Rate of Interest:");
        float interest  = input.nextFloat();
        System.out.println("Please Enter Your Time Period in Years:");
        float time = input.nextFloat();
        double Simple_Interest = (principal*interest*time)/100;
        System.out.println("Your Simple Interest is "+Simple_Interest);
    }
}
