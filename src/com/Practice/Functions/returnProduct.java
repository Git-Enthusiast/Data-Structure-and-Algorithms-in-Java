package com.Practice.Functions;
/*
Define a method that returns the product of two numbers entered by user.


 */
import java.util.Scanner;

public class returnProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Value of two Number:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double sum = getProduct(num1,num2);
        System.out.println("The Product of "+num1+" and "+num2+" is equal to : "+sum);

    }

    private static double getProduct(double num1, double num2) {
        return num1*num2;
    }
}
