package com.Practice.Pattern;

/*
Please Enter no of rows in the Pattern:
5
Please Enter no of Columns in the Pattern:
5
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1

 */
import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter no of rows in the Pattern:");
        int noOfRows = input.nextInt();
        System.out.println("Please Enter no of Columns in the Pattern:");
        int noOfColumns = input.nextInt();

        for (int i = 1;i<=noOfRows;i++){
            for (int j = 1;j<=noOfColumns;j++){
                System.out.print((noOfColumns-j+1)+" ");
            }
            System.out.println();
        }

    }
}
