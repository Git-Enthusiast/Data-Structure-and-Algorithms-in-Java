package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the String to reverse it:");
        String str = input.nextLine();
        String nStr = "";
        char ch;
        for (int i = 0;i<str.length();i++){
            ch = str.charAt(i);
            nStr = ch + nStr;
        }
        System.out.println("The Reversed String is:"+nStr);
    }
}
