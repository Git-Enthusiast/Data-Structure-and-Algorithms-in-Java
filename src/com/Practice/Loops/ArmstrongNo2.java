package com.Practice.Loops;

public class ArmstrongNo2 {
    public static void main(String[] args) {
        System.out.println("The no of Armstrong no between 100 to 1000 is :");
        for (int i= 100; i<1000;i++){
            if (isArmstrongNumber(i)){
                System.out.println(i);
            }

        }
    }
    private static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int numberOfDigits = countDigits(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
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
