package com.Practice.Pattern;
/*
9 8 7
6 5 4
3 2 1

 */
public class Pattern_9 {
    public static void main(String[] args) {
        int n = 3;
        int count = (int) Math.pow(3,2);
        for (int i =0;i<n;i++){
            for (int j = 0;j<n;j++){
                System.out.print(count+" ");
                count--;
            }
            System.out.println();
        }
    }
}
