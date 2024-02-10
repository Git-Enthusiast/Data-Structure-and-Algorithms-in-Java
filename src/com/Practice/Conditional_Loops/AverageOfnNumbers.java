package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class AverageOfnNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please specify the No. of input values for which you want to calculate average: ");
        int noOfInput = input.nextInt();
        System.out.println("Please Enter the input values: ");
        double num ;
        double sum = 0;
        for (int i = 1;i<=noOfInput;i++){
            num = input.nextDouble();
            sum = sum + num;
        }
        double avg = sum/noOfInput;
        System.out.print("The average of your given input is: "+avg);
    }
}
