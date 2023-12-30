package com.Practice.SpecialNumber;

public class PerfectNo3 {
    public static void main(String[] args) {
        int count =0;
        int num =1;
        while (count<10){
            if (isPerfectNumber(num)){
                count++;
                if (count==10){
                    System.out.println("The 10th perfect no is:"+num);
                }
            }
            num++;
        }

    }
    private static boolean isPerfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
