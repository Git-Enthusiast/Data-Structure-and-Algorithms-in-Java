package com.Practice.Pattern;

import java.util.Scanner;

/*
Please Enter no of rows in the Pattern:
5
Please Enter no of Columns in the Pattern:
7
1 1 1 1 1 1 1
2 2 2 2 2 2 2
3 3 3 3 3 3 3
4 4 4 4 4 4 4
5 5 5 5 5 5 5

 */
public class Pattern_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter no of rows in the Pattern:");
        int noOfRows = input.nextInt();
        System.out.println("Please Enter no of Columns in the Pattern:");
        int noOfColumns = input.nextInt();

        for (int i = 1;i<=noOfRows;i++){
            for (int j = 0;j<noOfColumns;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
