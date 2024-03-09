package com.Practice.Pattern;

/*

1 2 3
4 5 6
7 8 9

 */
public class Pattern_8 {
    public static void main(String[] args) {
        int n = 3;
        int count = 1;
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
