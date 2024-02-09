package com.Practice.Conditional_Loops;

import java.util.Scanner;

/*
Input a number and print all the factors of that number (use loops).

Calculating the factors of a number involves finding all the numbers that can evenly divide
the given number without leaving a remainder. Factors always come in pairs, as multiplying two
factors together results in the original number.

Example Problems and Solutions:
Problem 1:
Find the factors of 24.

Solution:
1 × 24 = 24
2 × 12 = 24
3 × 8 = 24
4 × 6 = 24
So, the factors of 24 are 1, 2, 3, 4, 6, 8, 12, and 24.

Problem 2:
Find the factors of 18.

Solution:
1 × 18 = 18
2 × 9 = 18
3 × 6 = 18
So, the factors of 18 are 1, 2, 3, 6, 9, and 18.
 */
public class PrintFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Integer to print its Factors: ");
        int num = input.nextInt();
        System.out.print("The Factors of "+num+" is: ");
        for (int i = 1;i<=num;i++){
            if (num%i == 0){
                System.out.print(" "+i);
            }
        }

    }
}
