package com.Lec2;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //  For Loops Syntax
        /*
           For(initialization ; condition; increment/decrement){
           body
           }
         */
        // Print no from 1 to 5.
//        for (int i =1;i<=5;i=i+1){
//            System.out.println(i+" ");
//
//        }

        /*
        while Loop Syntax

        initialization;
        while(Condition){
        body
        increment/decrement
        }
         */
        // Print no form 1 to 5
//        int num = 1;
//        while (num<=5){
//            System.out.println(num +" ");
//            num+=1;
//        }
        // print no from 1 to n.
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the value of n:");
        int n = in.nextInt();
        int num1 = 1;
        while (num1<=n){
            System.out.print(num1 + " ");
            num1+=1;
        }

        /*
         Do while loop Syntax

         initialization;
         Do {
            // body
         } while(condition);
         */
        System.out.println(in.nextLine());
        int i= 1;
        do {
            System.out.println(" Hey, How are you ?");
            i+=1;

        } while (i!=5);
    }
}
