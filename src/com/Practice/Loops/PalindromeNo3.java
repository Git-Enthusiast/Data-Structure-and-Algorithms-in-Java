package com.Practice.Loops;

public class PalindromeNo3 {
    public static void main(String[] args) {
        int count = 0;
        int num = 1;

        while (count < 109) {
            if (isPalindrome(num)) {
                count++;
                if (count == 109) {
                    System.out.println("The 109th palindrome number is: " + num);
                    break;
                }
            }
            num++;
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

