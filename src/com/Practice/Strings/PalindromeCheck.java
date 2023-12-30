package com.Practice.Strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "never odd or even";
        boolean isPalindrome = isPalindrome(s);
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(String phrase) {

        String StirngWithoutSpace = phrase.replaceAll("\\s", "").toLowerCase();

        int length = StirngWithoutSpace.length();
        for (int i = 0; i < length / 2; i++) {
            if (StirngWithoutSpace.charAt(i) != StirngWithoutSpace.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}

