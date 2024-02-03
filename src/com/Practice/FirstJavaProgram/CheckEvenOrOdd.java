package com.Practice.FirstJavaProgram;

import java.util.Scanner;
/*
Write a program to print whether a number is even or odd, also take input from the user.
 */
public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Integer to check whether Even or Odd:");
        int num = input.nextInt();
        if (num%2 == 0){
            System.out.println(num+" is an Even Number");
        }
        else {
            System.out.println(num+" is an Odd Number");
        }
    }
}
