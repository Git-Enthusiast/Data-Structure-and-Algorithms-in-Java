package com.Practice.FirstJavaProgram;

import java.util.Scanner;

/*
Take name as input and print a greeting message for that particular name.
 */
public class GreetWithName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name:");
        String name = input.nextLine();
        System.out.println("Hi,"+name+" How are You?");
    }
}
