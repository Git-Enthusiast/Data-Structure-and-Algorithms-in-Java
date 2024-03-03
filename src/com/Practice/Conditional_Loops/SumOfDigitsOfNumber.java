package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number to Print its Sum of Digits:");
        int originalNumber = input.nextInt();
        int num  = originalNumber;
        int sum = 0;
        while (num>0){
            int rem = num%10;
            num = num /10;
            sum = sum +rem;
        }
        System.out.println("The Sum of Digits of "+originalNumber+" is equal to :"+sum);
    }
}
