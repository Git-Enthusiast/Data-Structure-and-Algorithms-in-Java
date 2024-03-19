package com.Practice.Pattern;

/*
Please Enter the no of rows:
5
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
 */
import java.util.Scanner;

public class Pattern_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the no of rows:");
        int n = input.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j= 1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            for (int k = 1;k<=i-1;k++){
                System.out.print((i-k)+" ");
            }
            System.out.println();
        }
    }
}
