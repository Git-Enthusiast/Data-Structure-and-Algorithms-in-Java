package com.Practice.SpecialNumber;

public class ArmstrongNo {
    public static void main(String[] args) {
        int number = 153;

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    private static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int numberOfDigits = countDigits(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return originalNumber == sum;
    }
    private static int countDigits(int num) {
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}

