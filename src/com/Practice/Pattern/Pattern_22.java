package com.Practice.Pattern;

/*
Please Enter the Number of rows:
5
    *
   * *
  * * *
 * * * *
* * * * *

 */
import java.util.Scanner;

public class Pattern_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number of rows:");
        int n = input.nextInt();
        for (int i =1;i<=n;i++){
            for (int j =1;j<=n-i;j++){
                System.out.print(" ");// Only One Space
            }
            for (int k = 1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
