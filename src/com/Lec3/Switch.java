package com.Lec3;


import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Please Enter  name of Fruits:");
//        String fruit = in.next();

        //  Old Switch syntax.

//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of fruits.");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit.");
//                break;
//            case "Orange":
//                System.out.println("Round Fruit");
//                break;
//            case "Grapes":
//                System.out.println("Small fruit.");
//                break;
//            default:
//                System.out.println("Invalid Input.");
//                break;
//        }


        // New switch syntax
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits.");
//            case "Apple" -> System.out.println("A sweet red fruit.");
//            case "Orange" -> System.out.println("Round Fruit");
//            case "Grapes" -> System.out.println("Small fruit.");
//            default -> System.out.println("Invalid Input.");
//        }

//        System.out.println("Please Enter the No. of day from 1 to 7 :");
//        int day = in.nextInt();
//        switch (day){
//            case 1-> System.out.println("Sunday");
//            case 2-> System.out.println("Monday");
//            case 3-> System.out.println("Tuesday");
//            case 4-> System.out.println("Wednesday");
//            case 5-> System.out.println("Thursday");
//            case 6-> System.out.println("Friday");
//            case 7-> System.out.println("Saturday");
//        }

        // Print  weekday if input is 1 to 5 and weekend if 6 to 7 else invalid input.
        System.out.println("Please Enter the No. of day from 1 to 7 :");
        int input = in.nextInt();
        switch (input){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("weekend");
            default -> System.out.println("Invalid Input");

        }


    }
}
