package com.Lec1;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter temperature in Celsius :");
            float tempC = input.nextFloat();
            float tempF = (tempC * 9 / 5) + 32;
            System.out.println(tempF);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid temperature.");
        }
    }

}