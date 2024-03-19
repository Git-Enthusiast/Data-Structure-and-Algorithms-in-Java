package com.Practice.Pattern;

/*
Please Enter the no of rows:
7
1 2 3 4 5 6 7 7 6 5 4 3 2 1
1 2 3 4 5 6 * * 6 5 4 3 2 1
1 2 3 4 5 * * * * 5 4 3 2 1
1 2 3 4 * * * * * * 4 3 2 1
1 2 3 * * * * * * * * 3 2 1
1 2 * * * * * * * * * * 2 1
1 * * * * * * * * * * * * 1

 */
import java.util.Scanner;

public class Pattern_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the no of rows:");
        int n = input.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            for (int j = 1;j<=i-1;j++){
                System.out.print("* ");
            }
            for (int j = 1;j<=i-1;j++){
                System.out.print("* ");
            }
            for (int j = 1;j<=n-i+1;j++){
                System.out.print((n-j+2-i)+" ");
            }
            System.out.println();
        }
    }
}
