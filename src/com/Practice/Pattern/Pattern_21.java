package com.Practice.Pattern;

import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number of rows:");
        int n = input.nextInt();
        for (int i = 1;i<=n;i++){
            char ch = (char) ('A'+n-i);
            for (int j = 1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
