package com.Practice.Pattern;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Value of n :");
        int n = input.nextInt();
        int count = 1;
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
