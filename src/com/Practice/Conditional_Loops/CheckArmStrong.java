package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class CheckArmStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Number to be checked Armstrong or not: ");
        int num = input.nextInt();
        boolean check = checkArmstrong(num);
        if (check) System.out.println("ArmStrong Number.");
        else System.out.println("Not an Armstrong Number.");
    }

    private static boolean checkArmstrong(int num) {
        int i = num;
        int noOfDigits = countDigits(num);
        int sum = 0;
        while (i>0){
            int rem = i%10;
            sum += (int) Math.pow(rem,noOfDigits);
            i /=10;
        }
        return sum == num;
    }

    private static int countDigits(int num) {
        int i = num;
        int count = 0;
        while (i>0){
            i/=10;
            count++;
        }
        return count;
    }
}
