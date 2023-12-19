package com.Lec2;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter 3 numbers to Find Largest among them.");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        // Below is implemented with help of reference variable.
//        int max = a;
//        if (max<b){
//            max = b;
//        }
//        if (max<c) {
//         max = c;
//        }
        // By Using Mathematical Function :
        int max = Math.max(c, Math.max(a, b));
        System.out.println("The largest among the three numbers is: "+ max);
    }
}
