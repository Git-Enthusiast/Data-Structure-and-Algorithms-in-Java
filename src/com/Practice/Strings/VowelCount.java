package com.Practice.Strings;

public class VowelCount {
    public static void main(String[] args) {
        String s="This is an international Airport";

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);


            if (vowels.contains(String.valueOf(currentChar))) {
                count++;
            }
        }
        System.out.print(count);
    }

}


