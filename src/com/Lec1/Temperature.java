package com.Lec1;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temperature in Celsius :");
        float tempC = input.nextFloat();
        float tempF =  (tempC*9/5)+32;
        System.out.println(tempF);
    }
}
