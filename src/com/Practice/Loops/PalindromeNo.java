package com.Practice.Loops;

public class PalindromeNo {

        public static void main(String[] args) {
            int originalNumber = 543;
            int n = originalNumber;
            int ans = 0;

            while (n > 0) {
                int rem = n % 10;
                n /= 10;
                ans = ans * 10 + rem;
            }

            if (originalNumber == ans) {
                System.out.println("Palindrome No");
            } else {
                System.out.println("Not a Palindrome No");
            }
        }
    }


// to check palindrome or not
// to print palindrome between some range
// starting from 1 find 109th.