package com.Practice.Loops;

public class StrongNO2 {
    public static void main(String[] args) {
        System.out.println("Strong numbers between 100 and 1000:");

        for (int i = 100; i <= 1000; i++) {
            if (isStrongNumber(i)) {
                System.out.println(i);
            }
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
