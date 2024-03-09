package com.Practice.Pattern;

/*
Please Enter the value of n:
5
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

 */
import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of n:");
        int n = input.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j = i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
