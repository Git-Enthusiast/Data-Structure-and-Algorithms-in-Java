package com.Practice.Pattern;

/*
Please Enter the no of rows:
5
1 1 1 1 1
  2 2 2 2
    3 3 3
      4 4
        5

 */
import java.util.Scanner;

public class Pattern_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the no of rows:");
        int n = input.nextInt();
        for (int i = 1;i<=n;i++){
            for (int k=1 ;k<=i-1;k++){
                System.out.print("  ");
            }
            for (int j = 1;j<=n-i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
