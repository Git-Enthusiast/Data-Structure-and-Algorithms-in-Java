package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class CalculateCommissionPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Sale Price of your Product: ");
        double salePrice = input.nextDouble();
        System.out.println("Please Enter your Commission Percentage: ");
        float commission = input.nextFloat();
        double totalCommission = (salePrice*commission)/100;
        double actualPrice = salePrice-totalCommission;
        System.out.println("You get "+commission+"% discount which is Rs."+totalCommission);
        System.out.println("Your Actual Price after discount is : Rs."+actualPrice);
    }
}
