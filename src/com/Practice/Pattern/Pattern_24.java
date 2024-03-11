package com.Practice.Pattern;

import java.util.Scanner;

public class Pattern_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the no of rows:");
        int  n = input.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j =1;j<=n-i-1;j++){
                System.out.print("* ");
            }
            for (int k = 1;k<=i-1;k++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
