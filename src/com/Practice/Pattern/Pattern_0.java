package com.Practice.Pattern;
/*
## PatternWithoutArrayStringCollection
        *
      * *
    * * *
  * * * *
* * * * *
  * * * *
    * * *
      * *
        *


 */
public class Pattern_0 {
    public static void main(String[] args) {
        int n = 5; // Change the value of n to adjust the size of the pattern

        // Upper part of the pattern
        for (int i = 1; i <= n; i++) {

            // Inner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Inner loop for printing pattern
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {

            // Inner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Inner loop for printing pattern
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}

