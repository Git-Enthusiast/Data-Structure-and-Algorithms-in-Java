package com.Practice.Strings;

public class WordCount {
    public static void main(String[] args) {
        String input = "I am a java developer";
        int wordCount = countWords(input);
        System.out.println("Original String: " + input);
        System.out.println("Total Number of Words: " + wordCount);
    }

    public static int countWords(String input) {

        String[] words = input.split("\\s+");
        return words.length;
    }
}

