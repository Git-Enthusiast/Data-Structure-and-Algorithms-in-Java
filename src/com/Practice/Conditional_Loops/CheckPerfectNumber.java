package com.Practice.Conditional_Loops;

import java.util.Scanner;
/*
A perfect number is a positive integer that is equal to the sum of its proper
positive divisors (excluding the number itself). In other words, if we add up
all the factors of the number (excluding the number itself), the sum should
equal the original number.
Here's how to check if a number is perfect:

Find all the proper divisors of the number (factors excluding the number itself).
Sum these divisors.
If the sum equals the original number, it's a perfect number.

Let's look at an example:
The number 28:

Proper divisors: 1, 2, 4, 7, 14
Sum of divisors: 1 + 2 + 4 + 7 + 14 = 28
28 equals the sum of its proper divisors, so 28 is a perfect number.
 */
public class CheckPerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number to check whether Perfect or not:");
        int num = input.nextInt();
        if (isPerfectNumber(num)){
            System.out.println(num+" is a Perfect Number.");
        }
        else System.out.println(num+" is not a Perfect Number.");
    }

    private static boolean isPerfectNumber(int num) {
        if (num<=0) return false;
        int ans = 0;
        for (int i = 1; i<=num/2;i++){
            if (num%i==0){
                ans = ans+i;
            }
        }
        return ans == num;
    }
}
