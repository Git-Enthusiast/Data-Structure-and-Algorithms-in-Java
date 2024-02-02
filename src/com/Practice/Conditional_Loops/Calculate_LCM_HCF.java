package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class Calculate_LCM_HCF {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter 1st Number:");
        int num1 = input.nextInt();
        System.out.println("Please Enter 2nd Number:");
        int num2 = input.nextInt();
        int temp1 = num1;
        int temp2 = num2;
        int temp;
        while (temp2!=0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }
        int HCF = temp1;
        int LCM = (num1*num2)/HCF;
        System.out.println("The HCF of"+num1+" and "+num2+" = "+HCF);
        System.out.println("The LCM of"+num1+" and "+num2+" = "+LCM);
    }
}
