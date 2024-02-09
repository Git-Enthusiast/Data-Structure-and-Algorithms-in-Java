package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter two no for its Sum: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        System.out.println("The Sum of the Two number is: "+sum);

    }
}
