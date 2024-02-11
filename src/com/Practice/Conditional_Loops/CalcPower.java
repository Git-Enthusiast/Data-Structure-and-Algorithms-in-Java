package com.Practice.Conditional_Loops;

import java.util.Scanner;

import java.util.Scanner;

public class CalcPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your Value for which you want to calculate Power: ");
        double num = input.nextDouble();

        System.out.print("Please Enter the Degree of Power: ");
        int power = input.nextInt();

        double result = calculatePower(num, power);

        System.out.println("Result: " + result);
    }

    private static double calculatePower(double base, int exponent) {
        if (exponent < 0) {
            System.out.println("This program does not handle negative exponents.");
            System.exit(1);
        }

        double result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }
}

