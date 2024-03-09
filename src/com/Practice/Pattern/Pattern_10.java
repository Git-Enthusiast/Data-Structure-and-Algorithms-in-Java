package com.Practice.Pattern;

import java.util.Scanner;

/*
Please Enter the Value of n :
5
*
* *
* * *
* * * *
* * * * *

 */
public class Pattern_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Value of n :");
        int n = input.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
