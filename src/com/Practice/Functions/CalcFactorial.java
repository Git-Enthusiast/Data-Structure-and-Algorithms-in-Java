package com.Practice.Functions;

import java.util.Scanner;

/*
Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-

4! = 1 * 2 * 3 * 4 = 24
3! = 3 * 2 * 1 = 6
2! = 2 * 1 = 2
Also,
1! = 1
0! = 1

 */
public class CalcFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number to find Factorial:");
        int num = input.nextInt();
        int factorial = getFactorial(num);
        System.out.println("The Factorial of "+num+" is equal to: "+factorial);
    }

    private static int getFactorial(int num) {
        if (num == 0||num==1){
            return 1;
        }
        return (num* getFactorial(num-1));

    }
}
