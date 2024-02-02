package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class Calc_Sum_until_user_press_x {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        char ch;
        do {
            System.out.println("Please Enter value of Integer:");
            int num = input.nextInt();
            sum = sum +num;
            System.out.println("Please Enter 'x' to Stop or Other to Continue:");
            ch = input.next().trim().charAt(0);
        } while (ch !='x');
        System.out.println("sum = "+sum);
    }
}
