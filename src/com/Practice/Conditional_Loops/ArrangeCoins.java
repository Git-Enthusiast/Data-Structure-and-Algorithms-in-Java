package com.Practice.Conditional_Loops;
/*
441. Arranging Coins
Solved
Easy
Topics
Companies
You have n coins and you want to build a staircase with these coins.
The staircase consists of k rows where the ith row has exactly i coins.
The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.



Example 1:


Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.
Example 2:


Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.


Constraints:

1 <= n <= 231 - 1
 */
import java.util.Scanner;

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println("Please enter no of coins: ");
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Number of rows: "+arrangeCoins(n));
    }

    private static int arrangeCoins(int n) {
        int count = 0;
        for(int i = 1;i<=n;i++){
            n = n-i;
            count ++;
        }
        return count;
    }
}
