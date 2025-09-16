package com.Java_Core_Advance.Java_Basics;

import java.util.Scanner;

public class StringToUnicode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Print details for each character
        for (int i = 0; i < input.length(); i++) {
            int codePoint = input.codePointAt(i);

            // If it's a surrogate pair, skip the next index
            if (Character.isSupplementaryCodePoint(codePoint)) {
                System.out.println("Character: " + new String(Character.toChars(codePoint)));
                System.out.println("Unicode code point: " + codePoint + " (U+" + Integer.toHexString(codePoint).toUpperCase() + ")");
                System.out.println("UTF-16 code units: " 
                    + (int)input.charAt(i) + " " + (int)input.charAt(i+1));
                System.out.println();
                i++; // skip next char (part of surrogate pair)
            } else {
                System.out.println("Character: " + input.charAt(i));
                System.out.println("Unicode code point: " + codePoint + " (U+" + Integer.toHexString(codePoint).toUpperCase() + ")");
                System.out.println("UTF-16 code unit: " + (int)input.charAt(i));
                System.out.println();
            }
        }

        sc.close();
    }
}

