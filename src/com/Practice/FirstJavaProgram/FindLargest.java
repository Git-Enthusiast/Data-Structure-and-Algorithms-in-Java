package com.Practice.FirstJavaProgram;

import java.util.Scanner;

/*
Take 2 numbers as input and print the largest number.
 */
public class FindLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your 1st Number:");
        double num1 = input.nextDouble();
        System.out.println("Please Enter Your 2nd Number:");
        double num2  = input.nextDouble();
        if (num1>num2){
            System.out.println(num1+" is the Largest Number.");
        } else if (num1 < num2) {
            System.out.println(num2+" is the Largest Number.");
        }
        else {
            System.out.println("Both "+num1+" and "+num2+" are equal.");
        }
    }
}
