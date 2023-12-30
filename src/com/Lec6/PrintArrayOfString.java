package com.Lec6;

// to print Array of characters of a string.
public class PrintArrayOfString {
    public static void main(String[] args) {
        String str ="Hi, This is Rajan Raj.";
        ArrayOfCharacters(str);
        ArrayOfCharactersWithoutSpaces(str);
    }

    // to print array of char with spaces.
    private static void ArrayOfCharacters(String str) {
        char[] arr = str.toCharArray();
        System.out.print("Characters as an array (with spaces): [");
        for (int i = 0;i<arr.length;i++){
            System.out.print( arr[i]+" ,");
        }
        System.out.println("]");
    }
    // to print array of char without spaces.
    private static void ArrayOfCharactersWithoutSpaces(String str){
        // Convert the string to an array of characters
        char[] charArray = str.toCharArray();

        // Print characters as an array (ignoring spaces)
        System.out.println("Original String: " + str);
        System.out.print("Characters as an array (ignoring spaces): [");
        boolean first = true;
        for (char ch : charArray) {
            if (ch != ' ') {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print("'" + ch + "'");
                first = false;
            }
        }
        System.out.println("]");
    }
}
