package com.Practice.Loops;

public class ArmstrongNo3 {
    public static void main(String[] args) {
        int count =0;
        int num =1;
        while (count<10){
            if (isArmstrongNumber(num)){
                count++;
                if (count==10){
                    System.out.println("The 10th Armstrong no is:"+num);
                }
            }

            num++;
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
