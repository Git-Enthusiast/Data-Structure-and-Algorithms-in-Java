package com.Practice.Pattern;

import java.util.Scanner;

/*
Please Enter no of rows in the Pattern:
4
Please Enter no of Columns in the Pattern:
6
* * * * * *
* * * * * *
* * * * * *
* * * * * *

 */
public class Pattern_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter no of rows in the Pattern:");
        int noOfRows = input.nextInt();
        System.out.println("Please Enter no of Columns in the Pattern:");
        int noOfColumns = input.nextInt();

        for (int i = 0;i<noOfRows;i++){
            for (int j = 0;j<noOfColumns;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
