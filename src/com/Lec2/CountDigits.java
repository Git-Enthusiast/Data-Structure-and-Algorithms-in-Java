package com.Lec2;

// Count how many times a digit appears in the number. Here let's say "4".
public class CountDigits {
    public static void main(String[] args) {
        int num = 3403243;
        int n = num;
        int count = 0;
        while (n>0){
            int rem = n%10;
            if (rem ==4){
                count++;
            }
            n= n/10;
        }
        System.out.println(count);
        System.out.println("Total no of Digits in the number is "+ countTotalNoOfDigits(num));
    }
    // To count total no of digits in the numb

    private static int countTotalNoOfDigits(int num) {
        int count = 0;
        while (num>0){
            num = num/10;
            count++;
        }
        return count;
    }



}
