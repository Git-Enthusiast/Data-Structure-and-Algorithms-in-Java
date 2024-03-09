package com.Practice.Pattern;

/*
Please Enter the Number of rows:
5
A
B B
C C C
D D D D
E E E E E

 */
import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number of rows:");
        int n = input.nextInt();
        for (int i = 0;i<n;i++){
            for (int j = 0;j<=i;j++){
                System.out.print(((char) (65+i))+" ");
            }
            System.out.println();
        }
    }
}
