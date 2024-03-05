package com.Lec4;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun();// variable arguments may be null
        multiple(2, 4,"Rajan", "Rahul", "om");
        demo(23,58,23,54,56,7); // calling function of line 13
        demo("Rajan","Raj","Om","Vishnu Majumdar"); // calling function of line 17
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b,String ...v) {
        System.out.println(Arrays.toString(v));

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
