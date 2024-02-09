package com.Practice.Conditional_Loops;

import java.util.Scanner;

/*
Take integer inputs till the user enters 'x' and print the largest number from all.
 */
public class PrintLargestInputFromUserUntilPressX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        char ch;
        do {
            System.out.println("Please Enter the Integer to Check largest: ");
            int num = input.nextInt();
            largest = Math.max(largest, num);
            System.out.println("Please Enter 'x' to exit and other to continue: ");
            ch = input.next().trim().charAt(0);
        } while (ch !='x');
        System.out.println("The Largest Integer is: "+largest);
    }
}
