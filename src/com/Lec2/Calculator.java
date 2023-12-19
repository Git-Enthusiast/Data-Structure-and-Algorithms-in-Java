package com.Lec2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user until user press 'X' or 'x'.
        int ans = 0;
        while (true){
            System.out.println("Please Enter the operator:");
            char op = in.next().trim().charAt(0);
            if (op=='+'||op=='-'||op=='%'||op=='*'||op=='/'){
                System.out.println("Please Enter value of two Number:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+') {
                    ans = num1+num2;
                }
                if (op == '-'){
                    ans = num1-num2;
                }
                if (op == '*'){
                    ans = num1*num2;
                }
                if (op == '%'){
                    ans = num1%num2;
                }
                if (op == '/'){
                    if (num2>0){
                        ans = num1/num2;
                    }
                }
            }
            else if (op == 'X'||op=='x') {
                break;
            }
            else {
                System.out.println("invalid Input");
            }
            System.out.println(ans);
        }
    }
}
