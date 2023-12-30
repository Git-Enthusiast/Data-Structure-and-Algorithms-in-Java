package com.Practice.Strings;

public class StringLeftShift {
    public static void main(String[] args) {
        String input = "India";
        int shiftBy = 1;

        String shiftedString = leftShiftString(input, shiftBy);
        System.out.println("Original String: " + input);
        System.out.println("Left Shifted String: " + shiftedString);
    }

    public static String leftShiftString(String input, int shiftBy) {
        // Ensure shiftBy is non-negative
        shiftBy = shiftBy % input.length();
        if (shiftBy < 0) {
            shiftBy += input.length();
        }

        // Shift the characters to the left
        char[] chars = input.toCharArray();
        reverse(chars, 0, shiftBy - 1);
        reverse(chars, shiftBy, input.length() - 1);
        reverse(chars, 0, input.length() - 1);

        return new String(chars);
    }

    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}

