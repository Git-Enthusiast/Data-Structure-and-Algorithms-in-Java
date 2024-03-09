package com.Practice.Pattern;

/*
Please Enter Value of n:
5
A A A A A
B B B B B
C C C C C
D D D D D
E E E E E

 */
import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Value of n:");
        int n = input.nextInt();
        for (int i = 0;i<n;i++){
            for (int j = 1;j<=n;j++){
                System.out.print(((char) (65+i))+" ");
            }
            System.out.println();
        }
    }
}
