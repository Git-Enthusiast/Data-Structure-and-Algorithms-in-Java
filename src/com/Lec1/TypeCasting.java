package com.Lec1;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TypeCasting
        int and =  (int)(1091.54);
        System.out.println(and);
        // Byte can store max value of int 256 .
//        int num1 = 257;
//        byte b = (byte) (num1);
        // will return 257 % 256 = 1
//        System.out.println(b);
        byte a = 40;
        byte bi = 50;
        byte ci = 100;
        int di = (a *bi) /ci;
        System.out.println(di);

//        byte no = 32;
//        no = no+2;
//        -----> lead to an error as we are assigning  int to byte .
        int  alp ='A';
        System.out.println(alp);
        // Here string is converted to int.
        System.out.println("नमस्ते");
        System.out.println(3*3093.334324324f);
        // Above when int is multiplied with float it will return value into float
        // this is done  to automatic type conversion  into the uppermost operand's variable type.


        byte b = 42;
        char c  = 'a';
        short  s = 1091;
        int  i = 59990;
        float f = 23.3233f;
        double d  = 1.333255;
        double result = (f*b) + (i / c)  - ( d*s);
        //   float + int - double = double
        System.out.println((f*b) +" " +(i / c) +" "+( d*s));
        System.out.println(result);
    }
}
