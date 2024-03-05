package com.Practice.Functions;

import java.util.Scanner;

/*
Write a function to find if a number is a palindrome or not. Take number as parameter.


 */
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number to Check whether Palindrome or not:");
        int num = input.nextInt();
        if (isPalindrome(num)){
            System.out.println("The number "+num+" is a Palindrome Number.");
        }
        else System.out.println("The number "+num+" is not a Palindrome Number.");
    }

    private static boolean isPalindrome(int num) {
      int variableNumber = num;
      int reversedNumber =0;
      while (variableNumber!=0){
          int rem = variableNumber%10;
          variableNumber = variableNumber/10;
          reversedNumber= reversedNumber*10+rem;
      }
        return reversedNumber==num;
    }
}
