package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class CalcDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Original Price of your Product: ");
        double originalPrice = input.nextDouble();
        System.out.println("Please Enter your Discount Percentage: ");
        float discount = input.nextFloat();
        double totalDiscount = (originalPrice*discount)/100;
        double actualPrice = originalPrice-totalDiscount;
        System.out.println("You get "+discount+"% discount which is Rs."+totalDiscount);
        System.out.println("Your Actual Price after discount is : Rs."+actualPrice);
    }
}
