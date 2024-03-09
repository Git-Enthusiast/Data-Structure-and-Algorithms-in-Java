package com.Practice.Pattern;

/*
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
 */


public class Pattern_1 {
    public static void main(String[] args) {
        generatePattern();
    }

    static void generatePattern() {
        int n = 5; // Number of rows in the pattern

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= i + n - 1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
