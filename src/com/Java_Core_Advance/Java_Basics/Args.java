package com.Java_Core_Advance.Java_Basics;

public class Args {
    public static void main(String[] args) {
        System.out.println("Count = " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
