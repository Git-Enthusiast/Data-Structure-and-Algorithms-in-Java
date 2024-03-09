package com.Practice.Pattern;

/*
Please Enter the Value of n:
5
A B C D E
F G H I J
K L M N O
P Q R S T
U V W X Y

 */
import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Value of n:");
        int n = input.nextInt();
        int row = 0;
        int ch = 65;
        while (row<n){
            int column = 0;
            while (column<n){
                System.out.print(((char) (ch))+" ");
                ch++;
                column +=1;
            }
            row +=1;
            System.out.println();
        }
    }
}
