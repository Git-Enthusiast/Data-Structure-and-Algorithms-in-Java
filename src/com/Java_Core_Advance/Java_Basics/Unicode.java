package com.Java_Core_Advance.Java_Basics;

public class Unicode {
    public static void main(String[] args) {
        // Some characters
        char c1 = 'A';        // U+0041
        char c2 = '你';       // U+4F60
        String c3 = "😊";     // U+1F60A (needs surrogate pair)

        // Print char values and their code points
        System.out.println("Character: " + c1);
        System.out.println("UTF-16 code unit (numeric value): " + (int)c1);
        System.out.println("Unicode code point: " + Character.codePointAt(new char[]{c1}, 0));
        System.out.println();

        System.out.println("Character: " + c2);
        System.out.println("UTF-16 code unit (numeric value): " + (int)c2);
        System.out.println("Unicode code point: " + Character.codePointAt(new char[]{c2}, 0));
        System.out.println();

        System.out.println("Character: " + c3);
        System.out.println("UTF-16 code units (numeric values): " 
                           + (int)c3.charAt(0) + " " + (int)c3.charAt(1));
        System.out.println("Unicode code point: " + c3.codePointAt(0));
    }
}
