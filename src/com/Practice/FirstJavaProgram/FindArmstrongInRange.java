package com.Practice.FirstJavaProgram;

import java.util.Scanner;

/*
To find Armstrong Number between two given numbers.
 */
public class FindArmstrongInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the range within you want to find Armstrong numbers:");
        int start = input.nextInt();
        int end = input.nextInt();
        printArmstrong(start, end);
    }

    static void printArmstrong(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int num) {
        int noOfDigits = count(num);
        int temp = num;
        int ans = 0;

        while (temp > 0) {
            int rem = temp % 10;
            temp = temp / 10;
            ans = (int) (ans + Math.pow(rem, noOfDigits));
        }

        return num == ans;
    }

    static int count(int num) {
        int counter = 0;
        while (num > 0) {
            num = num / 10;
            counter++;
        }
        return counter;
    }
}

