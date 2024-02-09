package com.Practice.Conditional_Loops;

import java.util.Scanner;

/*
Take integer inputs till the user enters 0 and print the sum of all numbers
 */
public class PrintSumUntil0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        char ch;
        do {
            System.out.println("Please Enter the number for sum: ");
            double num = input.nextDouble();
            sum = sum + num;
            System.out.println("Please Enter '0' to exit and other to continue: ");
            ch = input.next().trim().charAt(0);
        } while (ch !='0');
        System.out.println("The Sum is: "+sum);
    }
}
