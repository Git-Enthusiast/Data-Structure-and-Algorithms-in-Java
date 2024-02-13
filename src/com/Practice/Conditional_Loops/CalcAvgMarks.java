package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class CalcAvgMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter No. of Subject to calculate average marks");
        int noOfSubject = input.nextInt();
        double sumOfMarks = 0;
        for (int i = 1; i<=noOfSubject;i++){
            System.out.print("Please Enter name of the subject: ");
            String nameOfSubject = input.next();
            System.out.print("Please Enter Your "+nameOfSubject+" subject Marks: ");
            float marks = input.nextFloat();
            sumOfMarks += marks;
        }
        double avgMarks = sumOfMarks/noOfSubject;
        System.out.print("The Average of the Marks is: "+avgMarks);
    }
}
