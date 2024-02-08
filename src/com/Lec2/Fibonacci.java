package com.Lec2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = in.nextInt();
        int p = 0; // previous
        int c = 1; // current
        int count = 2;
        while (count<=n){
            int temp = c;
            c = c+p;
            p = temp;
            count ++;

        }
        System.out.println("Your "+n+"th"+" Fibonacci number is : "+c);

    }
}
