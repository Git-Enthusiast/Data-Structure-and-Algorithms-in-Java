package com.Practice.Pattern;

/*
Please Enter the Number of rows:
5
A
B C
C D E
D E F G
E F G H I

 */
import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number of rows:");
        int n = input.nextInt();
         for (int i = 1;i<=n;i++){
             char ch = (char) ('A'+i-1);
             for (int j = 1;j<=i;j++){
                 System.out.print(ch+" ");
                 ch++;
             }
             System.out.println();
         }

         /*
         ## Another Way!

         int row = 1;
         while (row<=n){
             int column = 1;
             while (column<=row){
                 System.out.print((char) (65+row+column-2));
                 column++;
             }
             row++;
             System.out.println();
         }
          */
    }
}
