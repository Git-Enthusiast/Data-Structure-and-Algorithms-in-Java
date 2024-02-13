package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of 'n': ");
        int n = input.nextInt();
        System.out.println("Please Enter "+n+" number for Summation: ");
        double sum = 0;
        for ( int i = 1; i<= n;i++){
            double number = input.nextDouble();
            sum += number;
        }
        System.out.print("The Sum of "+n+" numbers is: "+sum);

    }
}
