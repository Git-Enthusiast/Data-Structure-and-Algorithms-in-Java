package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class CalcDepreciationValue {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Please Enter the Initial Price of the depreciating asset (Not a depreciating asset: Land, Gold etc.):  ");
        double initialPrice = input.nextDouble();
        System.out.println("Please Enter the Residual Value of the depreciating asset: ");
        double residualValue = input.nextDouble();
        System.out.println("Please Enter the Life Time of the asset (in Years): ");
        float lifeTime = input.nextFloat();
        double annualDepreciation  =  (initialPrice-residualValue)/lifeTime;
        System.out.println("The annual Depreciation of Your asset is: Rs."+annualDepreciation);

    }
}
