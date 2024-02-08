package com.Practice.FirstJavaProgram;

import java.util.Scanner;

/*
To find out whether the given String is Palindrome or not.
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number to check whether Palindrome or not: ");
        int n = input.nextInt();
        boolean ans = checkPalindrome(n);
        System.out.println(ans);
    }
    //  This will return True if the number is Palindrome else False.
    static boolean checkPalindrome(int n){
        int num = n;
        int ans = 0;

        while (n>0){
            int rem = n%10;
            n = n / 10;
            ans = ans * 10 + rem;
        }
       return num == ans;
    }
}
