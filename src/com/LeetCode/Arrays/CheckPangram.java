package com.LeetCode.Arrays;
/*
1832. Check if the Sentence Is Pangram
Easy
Topics
Companies
Hint
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence
is a pangram, or false otherwise.



Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false


Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.

 */
public class CheckPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean result = checkIfPangram(sentence);
        System.out.println(result);
    }

    private static boolean checkIfPangram(String sentence) {
       String alphabets = "abcdefghijklmnopqrstuvwxyz";
       int count = 0;
       for (int i = 0; i < alphabets.length(); i++) {
           char currentChar = alphabets.charAt(i);
           if (sentence.contains(String.valueOf(currentChar))) {
               count++;
           }

       }
        return count == 26;
    }
}
