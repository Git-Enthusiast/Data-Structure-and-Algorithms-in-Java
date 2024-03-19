package com.Practice.Pattern;

/*
Please Enter No of Rows:
5
* * * * *
  * * * *
    * * *
      * *
        *


 */
import java.util.Scanner;

public class Pattern_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter No of Rows: ");
        int n = input.nextInt();
        for (int i = 1;i<=n;i++){
            for (int k = 1;k<=i-1;k++){
                System.out.print("  ");
            }
            for (int j = 1;j<= n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
