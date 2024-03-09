package com.Practice.Pattern;

/*
Please Enter the value of n:
5
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E

 */
import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of n:");
        int n = input.nextInt();
        int row = 0;
        while (row<n){
            int column = 0;
            while (column<n){
                System.out.print(((char) (65+column))+" ");
                column +=1;
            }
            row +=1;
            System.out.println();
        }
    }
}
