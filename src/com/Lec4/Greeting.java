package com.Lec4;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        greeting();
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter your name :");
        String name = in.nextLine();
        String message = getGreet(name);
        System.out.println(message);
    }

    private static String getGreet(String name) {
        return "Hey, "+name+" How are you ?";
    }

    static void greeting(){
        System.out.println("Hello World!");
    }
}
