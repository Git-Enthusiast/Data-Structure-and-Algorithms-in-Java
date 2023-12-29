package com.Practice.Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        generatePattern();
    }

    static void generatePattern() {
        int n = 5; // Number of rows in the pattern

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= i + n - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
