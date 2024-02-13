package com.Practice.Conditional_Loops;

import java.util.Scanner;
public class CalcCGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Specify total no of subjects (in a semester): ");
        int noOfSubject = input.nextInt();
        boolean fail = false;
        float totalHonourPointObtained = 0;
        float totalHonourPointAssigned = 0;
        for (int i = 1;i<=noOfSubject;i++){
            System.out.print("Please Enter Subject name: ");
            String subject = input.next();
            System.out.print("Please Enter your "+subject+" marks: ");
            int marks = input.nextInt();
            System.out.print("Please Enter Your "+subject+" subject Credit Point: ");
            float courseCredit = input.nextInt();
            float honourPoint;
            totalHonourPointAssigned +=courseCredit;
             if (marks>90&&marks<=100){
                 System.out.println("Your Grade in subject "+subject+"is: Grade-'OutStanding'");
                 System.out.println("Your Grade Pointer in the subject "+subject+" is: 10");
                 honourPoint = courseCredit*10;
                 totalHonourPointObtained += honourPoint;
             }
             else if (marks>=81&&marks<=90) {
                 System.out.println("Your Grade in subject "+subject+"is: Grade-'A++'");
                 System.out.println("Your Grade Pointer in the subject "+subject+" is: 9");
                 honourPoint = courseCredit*9;
                 totalHonourPointObtained += honourPoint;

             }
             else if (marks>=71&&marks<=80) {
                 System.out.println("Your Grade in subject "+subject+"is: Grade-'A+'");
                 System.out.println("Your Grade Pointer in the subject "+subject+" is: 8");
                 honourPoint = courseCredit*8;
                 totalHonourPointObtained += honourPoint;

             }
             else if (marks>=61&&marks<=70) {
                 System.out.println("Your Grade in subject "+subject+"is: Grade-'A'");
                 System.out.println("Your Grade Pointer in the subject "+subject+" is: 7");
                 honourPoint = courseCredit*7;
                 totalHonourPointObtained += honourPoint;

             }
             else if (marks>=51&&marks<=60) {
                 System.out.println("Your Grade in subject "+subject+"is: Grade-'B+'");
                 System.out.println("Your Grade Pointer in the subject "+subject+" is: 6");
                 honourPoint = courseCredit*6;
                 totalHonourPointObtained += honourPoint;

             }
             else if (marks>=41&&marks<=50) {
                 System.out.println("Your Grade in subject "+subject+"is: Grade-'C'");
                 System.out.println("Your Grade Pointer in the subject "+subject+" is: 5");
                 honourPoint = courseCredit*5;
                 totalHonourPointObtained += honourPoint;

             }
             else if (marks==40) {
                 System.out.println("Your Grade in subject "+subject+"is: Grade-'D'");
                 System.out.println("Your Grade Pointer in the subject "+subject+" is: 4");
                 honourPoint = courseCredit*4;
                 totalHonourPointObtained += honourPoint;

             }
             else {
                 System.out.println("You are Failed in the subject "+subject+".");
                 fail = true;
             }

        }
         if (fail){
             System.out.println("You did not cleared the semester so Prepare for ATKT.");
         }
         float CGPA = (float) totalHonourPointObtained /totalHonourPointAssigned;
        System.out.print("Your Final CGPA is:"+CGPA);
    }
}
