package com.Lec4;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        // swapping of two no without using Methods.
//        int a = 3;
//        int b = 4;
//
//        int temp = a;
//         a = b;
//         b = temp;
//        System.out.println(a+" "+b);

        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Two  no :");
        int  c = in.nextInt();
        int  d = in.nextInt();
        getSwap(c, d);

    }

    private static void getSwap(int c, int d) {
        int temp = c;
        c = d;
        d = temp;
        System.out.println(c + " "+ d);
    }

}
