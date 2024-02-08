package com.Lec16;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        // to print number from 1 to 5.
        print(1);
    }
    static  void print(int n){
        if (n == 5){
            return;
        }
        System.out.println(n);
        print(n+1);
        System.out.println("Hi, I am the Last Line.");
    }
}