package com.Practice.Conditional_Loops;

import java.util.Scanner;

/*
 how to calculate the future value (FV) of an investment for both **compound** and
 **simple** annual interest:

**Compound Interest:**

1. **Formula:**

   FV = I * (1 + R) ^ T

   where:
     - FV is the future value
     - I is the initial investment amount
     - R is the annual interest rate (as a decimal)
     - T is the number of years


**Simple Interest:**

1. **Formula:**
   ```
   FV = I * (1 + R * T)
   ```
   where:
     - FV is the future value
     - I is the initial investment amount
     - R is the annual interest rate (as a decimal)
     - T is the number of years

**Example:**

Let's say you invest $1,000 for 5 years at a 10% annual interest rate.

**Compound Interest:**

- FV = 1000 * (1 + 0.10) ^ 5
- FV ≈ $1,610.51

**Simple Interest:**

- FV = 1000 * (1 + 0.10 * 5)
- FV = $1,500

*/


public class CalcFutureValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Initial Investment Value:");
        double initialInvestment = input.nextDouble();
        System.out.println("Please Enter the Annual Rate of Interest:");
        float rateOfInterest = input.nextFloat();
        System.out.println("Please Enter the Maturity Time Period (in Years):");
        float timePeriod = input.nextFloat();
        System.out.println("Please Enter '0' for Simple Annual Interest and '1' for Compound Annual Interest:");
        int check = input.nextInt();

        if (check == 0)
            simpleInterestFutureValue(initialInvestment, rateOfInterest, timePeriod);
        else if (check == 1)
            compoundInterestFutureValue(initialInvestment, rateOfInterest, timePeriod);
        else
            System.out.println("Invalid Input! Please Enter a Valid Input.");
    }

    private static void compoundInterestFutureValue(double initialInvestment, float rateOfInterest, float timePeriod) {
        double futureValue = initialInvestment * Math.pow(1 + (rateOfInterest / 100), timePeriod);
        System.out.printf("Your Future Value on Investment Rs.%.2f is = Rs.%.2f\n", initialInvestment, futureValue);
    }

    private static void simpleInterestFutureValue(double initialInvestment, float rateOfInterest, float timePeriod) {
        double futureValue = initialInvestment * (1 + (rateOfInterest / 100) * timePeriod);
        System.out.printf("Your Future Value on Investment Rs.%.2f is = Rs.%.2f\n", initialInvestment, futureValue);
    }
}
