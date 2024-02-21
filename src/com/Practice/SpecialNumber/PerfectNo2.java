package com.Practice.SpecialNumber;

public class PerfectNo2 {
    public static void main(String[] args) {
        System.out.println("Total no perfect no between 100 to 1000 is: ");
        for (int i = 100; i<=1000;i++){
            if (isPerfectNumber(i)){
                System.out.println(i);
            }
        }
    }
    private  static boolean isPerfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
