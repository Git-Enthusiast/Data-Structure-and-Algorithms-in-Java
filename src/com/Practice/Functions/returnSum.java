package com.Practice.Functions;

/*
Write a program to print the sum of two numbers
entered by user by defining your own method.
 */
import java.util.Scanner;

public class returnSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Value of two Number:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double sum = getSum(num1,num2);
        System.out.println("The Sum of "+num1+" and "+num2+" is equal to : "+sum);

    }

    static double getSum(double num1, double num2) {
        return num1+num2;
    }
}
