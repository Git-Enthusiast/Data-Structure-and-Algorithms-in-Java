package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Alphabet to Check whether Vowel or Consonant:");
        char ch = input.next().trim().charAt(0);
        if (ch>=65&&ch<=90||ch>=97&&ch<=122){
            if (isVowel(ch)){
                System.out.println(ch+" is an Alphabet.");
            }
            else System.out.println(ch+" is a Consonant.");
        }
        else System.out.println("Please Enter a Valid Alphabet.");
    }

    private static boolean isVowel(char ch) {

        ch = Character.toLowerCase(ch);
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
}
