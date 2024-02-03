package com.Practice.FirstJavaProgram;

import java.util.Scanner;

/*
Input currency in rupees and output in USD.
 */
public class INR_to_USD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter value of currency in Indian Rupees:");
        double Inr = input.nextDouble();
        double Usd = (Inr*0.012);
        System.out.println("INR "+Inr+" = $"+Usd);
    }
}
