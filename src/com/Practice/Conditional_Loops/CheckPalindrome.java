package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number to check whether Palindrome or not:");
        int originalNumber  = input.nextInt();
        int num = originalNumber;
        int ans = 0;
        while (num>0){
            int rem = num%10;
            num = num/10;
            ans =  ans*10+rem;
        }
        System.out.println(ans==originalNumber);
    }
}
