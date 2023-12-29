package com.Practice.Loops;


public class StrongNo3 {
    public static void main(String[] args) {
        int count = 0;
        int num = 1;

        while (count < 4) {
            if (isStrongNumber(num)) {
                count++;
                if (count == 4) {
                    System.out.println("The 4th Strong number is: " + num);
                    break;
                }
            }
            num++;
        }
    }

    private static boolean isStrongNumber(int num) {
        int originalNumber = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return originalNumber == sum;
    }


    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

