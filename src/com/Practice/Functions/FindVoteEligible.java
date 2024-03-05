package com.Practice.Functions;
/*
A person is eligible to vote if his/her age is greater than or equal to 18.
Define a method to find out if he/she is eligible to vote.
 */
import java.util.Scanner;

public class FindVoteEligible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your age to Check whether you are Eligible for Voting or not:");
        int age = input.nextInt();
        checkVoteEligible(age);
    }

    private static void checkVoteEligible(int age) {
        if (age <= 0) {
            System.out.println("Invalid Age!, Please Enter valid age:");
        } else if (age >= 18) {
            System.out.println("Your age is above 18 so You can Vote.");
        } else {
            System.out.println("You are a Minor, You can not Vote.");
        }
    }
}
