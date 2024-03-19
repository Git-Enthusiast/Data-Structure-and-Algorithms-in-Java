package com.Practice.Pattern;

/*
Please Enter the no of rows:
4
      1
    2 3
  4 5 6
7 8 9 10


 */
import java.util.Scanner;

public class Pattern_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the no of rows:");
        int n = input.nextInt();
        int counter = 1;
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int k = 1;k<=i;k++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
