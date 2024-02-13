package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class CalcCompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Principal Amount:");
        double principal = input.nextDouble();
        System.out.println("Please Enter Annual rate of Interest:(like if 2.4% enter 2.4 only): ");
        double annualRateOfInterest = input.nextFloat();
        double roi = annualRateOfInterest/100;
        System.out.println("Please specify Compounding Frequency(How many times the interest compounds each year.) like:");
        System.out.println("for Once a year Enter 1");
        System.out.println("for Every 6 Months Enter 2");
        System.out.println("for Every 3 Months Enter 4");
        System.out.println("for Every Month Enter 12");
        System.out.println("for Every Day Enter 365");
        float compounding = input.nextFloat();
        System.out.println("Please Enter Maturity Time Period (in Years.): ");
        float timePeriod = input.nextFloat();
        double futureValue = (principal*Math.pow((1+(roi/compounding)),(compounding*timePeriod)));
        System.out.println("Your Principal amount is: Rs."+principal);
        System.out.println("Your Future Value of the Principal amount is: Rs."+futureValue);
        System.out.println("Total Interest Earned on the Principal Value Rs."+principal+" is Rs."+(futureValue-principal));

    }
}
