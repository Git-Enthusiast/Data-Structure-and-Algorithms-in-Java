package com.Practice.Strings;

import java.util.Scanner;

public class TextProcessingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the haystack string: ");
        String haystack = scanner.nextLine();

        System.out.print("Enter the needle string: ");
        String needle = scanner.nextLine();

        int result = haystack.indexOf(needle);

        if (result != -1) {
            System.out.println("Needle Found at index: " + result);
        } else {
            System.out.println("Needle not found in haystack");
        }

        scanner.close();
    }
}

