package com.Lec3;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter your Employee Id:");
        int empId = in.nextInt();
        System.out.println("Please Enter Your Department :");
        String dept = in.next();
        // old version of Switch
//        switch (empId){
//            case 1:
//                System.out.println("Rajan Raj");
//                switch (dept){
//                    case "cse":
//                        System.out.println("cse");
//                        break;
//                    case "it":
//                        System.out.println("IT");
//                        break;
//                    case "Management":
//                        System.out.println("Management");
//                        break;
//                    default:
//                        System.out.println("Invalid Input");
//
//                }
//                break;
//            case 2:
//                System.out.println("Om  ");
//                switch (dept){
//                    case "cse":
//                        System.out.println("cse");
//                        break;
//                    case "it":
//                        System.out.println("IT");
//                        break;
//                    case "Management":
//                        System.out.println("Management");
//                        break;
//                    default:
//                        System.out.println("Invalid Input");
//
//                }
//                break;
//            case 3:
//                System.out.println("Rahul");
//                switch (dept){
//                    case "cse":
//                        System.out.println("cse");
//                        break;
//                    case "it":
//                        System.out.println("IT");
//                        break;
//                    case "Management":
//                        System.out.println("Management");
//                        break;
//                    default:
//                        System.out.println("Invalid Input");
//
//                }
//                break;
//        }

        // New syntax of switch.


        switch (empId) {
            case 1 -> {
                System.out.println("Rajan Raj");
                switch (dept) {
                    case "cse" -> System.out.println("cse");
                    case "it" -> System.out.println("IT");
                    case "Management" -> System.out.println("Management");
                    default -> System.out.println("Invalid Input");
                }
            }
            case 2 -> {
                System.out.println("Om  ");
                switch (dept) {
                    case "cse" -> System.out.println("cse");
                    case "it" -> System.out.println("IT");
                    case "Management" -> System.out.println("Management");
                    default -> System.out.println("Invalid Input");
                }
            }
            case 3 -> {
                System.out.println("Rahul");
                switch (dept) {
                    case "cse" -> System.out.println("cse");
                    case "it" -> System.out.println("IT");
                    case "Management" -> System.out.println("Management");
                    default -> System.out.println("Invalid Input");
                }
            }
        }
    }
}
