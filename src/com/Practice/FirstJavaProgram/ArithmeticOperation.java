package com.Practice.FirstJavaProgram;

import java.util.Scanner;

/*
Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
 */
public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter number num1:");
        float num1 = input.nextFloat();
        System.out.println("Please Enter number num2:");
        float num2 = input.nextFloat();
        System.out.println("Please Enter the Operator from ['+','-','*','/'](Please Enter only one.)");
        char ch = input.next().trim().charAt(0);
        if (ch == '+'){
            System.out.println("Sum of "+num1+" and "+num2+" = "+(num1+num2));
        }
        else if (ch == '-'){
            System.out.println("Subtract of "+num1+" and "+num2+" = "+(num1-num2));
        }
        else if (ch == '*'){
            System.out.println("Multiplication of "+num1+" and "+num2+" = "+(num1*num2));
        }
        else if (ch == '/'){
            if (num2!=0){
              double ans = num1/num2;
              System.out.println("Division of "+num1+" and "+num2+" = "+ans);
            }
            else {
                System.out.println(" Invalid! You can not divide a number by 0.");
            }
        }
        else {
            System.out.println("Invalid Input!");
        }

    }
}
