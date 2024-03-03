package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number to check whether Perfect or not:");
        int num = input.nextInt();
        if (isPerfectNumber(num)){
            System.out.println(num+" is a Perfect Number.");
        }
        else System.out.println(num+" is not a Perfect Number.");
    }

    private static boolean isPerfectNumber(int num) {
        if (num<=0) return false;
        int ans = 0;
        for (int i = 1; i<=num/2;i++){
            if (num%i==0){
                ans = ans+i;
            }
        }
        return ans == num;
    }
}
