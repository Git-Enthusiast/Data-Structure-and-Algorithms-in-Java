package com.Practice.Pattern;

/*

Please Enter the Number of rows:
5
A
B C
D E F
G H I J
K L M N O


 */
import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number of rows:");
        int n = input.nextInt();
        int ch = 65;
         for (int i = 1;i<=n;i++){
             for (int j = 1;j<=i;j++){
                 System.out.print(((char) (ch))+" ");
                 ch +=1;

             }
             System.out.println();
         }
    }
}
