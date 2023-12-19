package com.Lec2;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter an Alphabet to check its case:");
        char ch = in.next().trim().charAt(0);
        if (ch >= 'a'&& ch<='z'){
            System.out.println(ch+" is LowerCase Alphabet.");
        }
        else {
            System.out.println(ch+" is UpperCase Alphabet.");
        }

    }
}
