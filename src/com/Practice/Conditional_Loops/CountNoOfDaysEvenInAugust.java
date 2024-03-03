package com.Practice.Conditional_Loops;
/*
Rajan is allowed to go out with his friends only on the even days of a given month.
Write a program to count the number of days he can go out in the month of August.

 */
public class CountNoOfDaysEvenInAugust {
    public static void main(String[] args) {
        // No of Days in August = 31
        int count = 0;
        for (int i = 1; i<=31;i++){
            if (i%2==0) count+=1;
        }
        System.out.println("The No of Days Rajan Can go with his Friends is:"+count+" Days.");
    }
}
