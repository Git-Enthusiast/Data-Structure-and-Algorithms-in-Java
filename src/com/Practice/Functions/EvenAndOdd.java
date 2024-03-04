package com.Practice.Functions;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number to Check whether Even or Odd:");
        int num = input.nextInt();
        if (isEven(num)){
            System.out.println(num+" is an Even Number.");
        }
        else System.out.println(num+" is an Odd Number.");
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
