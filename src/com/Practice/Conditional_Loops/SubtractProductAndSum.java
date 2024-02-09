package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        subtractProductAndSum(n);
    }

    private static void subtractProductAndSum(int n) {
        System.out.println(product(n)-add(n));
    }

    static int product (int n ){
        int num = n;
        int pro = 1;
        while(num>0){
            int rem = num % 10;
            pro = pro *rem;
            num = num/10;
        }
        return pro;
    }

   static int add (int n ){
        int num = n;
        int add = 0;
        while(num>0){
            int rem = num % 10;
            add = add + rem;
            num = num/10;
        }
        return add;
    }

    /*
     This is code which is submmited in leetcode.
    class Solution {
    public int subtractProductAndSum(int n) {
         int p = product(n);
         int a = add(n);
         return p - a;
    }

        int product (int n ){
        int num = n;
        int pro = 1;
        while(num>0){
            int rem = num % 10;
            pro = pro *rem;
            num = num/10;
        }
        return pro;
        }

        int add (int n ){
        int num = n;
        int add = 0;
        while(num>0){
            int rem = num % 10;
            add = add + rem;
            num = num/10;
        }
        return add;
    }
}
     */
}
