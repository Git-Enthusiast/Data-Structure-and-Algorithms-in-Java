package com.Practice.Functions;

import java.util.Scanner;

/*
Write a function that returns the sum of first n natural numbers.
 */
public class SumOfFirstNNaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Value of 'n' to find the sum of 'n' Natural Number:");
        int n = input.nextInt();
        long sum = getSum(n);
        System.out.println("The Sum of first "+n+" natural number is "+sum);
    }

    private static long getSum(int n) {
        long sum = 0;
        for (int i = 1; i<=n;i++){
            sum = sum +i;
        }
        return sum;
    }
}
