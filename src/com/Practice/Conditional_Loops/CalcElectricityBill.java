package com.Practice.Conditional_Loops;

import java.util.Scanner;

import java.util.Scanner;

public class CalcElectricityBill {
    public static void main(String[] args) {
        final double rate1 = 2.25;
        final double rate2 = 2.75;
        final double rate3 = 3.50;
        final double rate4 = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Total monthly consumed Electricity Units: ");
        double consumedUnits = input.nextDouble();
        double totalBill = 0;

        if (consumedUnits <= 100) {
            totalBill = consumedUnits * rate1;
        } else if (consumedUnits <= 200) {
            totalBill = (100 * rate1) + (consumedUnits - 100) * rate2;
        } else if (consumedUnits <= 400) {
            totalBill = (100 * rate1) + (100 * rate2) + (consumedUnits - 200) * rate3;
        } else {
            totalBill = (100 * rate1) + (100 * rate2) + (200 * rate3) + (consumedUnits - 400) * rate4;
        }

        System.out.println("Your Total Electricity Bill is: Rs." + totalBill);
    }
}


