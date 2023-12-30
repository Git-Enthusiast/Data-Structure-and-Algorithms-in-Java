package com.Practice.SpecialNumber;

public class PalindromeNo2 {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers between 100 and 1000:");

        for (int i = 100; i <= 1000; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    // Function to check if a number is a palindrome
    private static boolean isPalindrome(int num) {
        int n = num;
        int ans = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
        }

        return num == ans;
    }
}
