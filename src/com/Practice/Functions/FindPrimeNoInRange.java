package com.Practice.Functions;

import java.util.Scanner;

import static com.Practice.Functions.checkPrime.isPrime;

/*
Write a function that returns all prime numbers between two given numbers.


 */
public class FindPrimeNoInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Range (eg. 5-100 ):");
        System.out.println("Please Enter Starting Value:");
        int startRange = input.nextInt();
        System.out.println("Please Enter Ending value:");
        int endRange = input.nextInt();
        System.out.println("The Prime Number between "+startRange+" and "+endRange+" is:");
        for (int i = startRange;i<=endRange;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
