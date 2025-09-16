package com.Java_Core_Advance.Java_Basics;

public class VariableTypesDemo {

    // 🔹 Static Variable (class level, shared by all objects)
    static String university = "GGV";

    // 🔹 Instance Variable (unique to each object)
    String studentName;
    int age;

    // Constructor to initialize instance variables
    public VariableTypesDemo(String name, int age) {
        this.studentName = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        // 🔹 Local Variable (lives only inside this method)
        String message = "Learning Java Variables";

        System.out.println("Student Name: " + studentName); // Instance variable
        System.out.println("Age: " + age); // Instance variable
        System.out.println("University: " + university); // Static variable
        System.out.println("Message: " + message); // Local variable
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        // Creating two different objects
        VariableTypesDemo s1 = new VariableTypesDemo("Rajan", 22);
        VariableTypesDemo s2 = new VariableTypesDemo("Kumar", 25);

        // Displaying details of both students
        s1.displayDetails();
        s2.displayDetails();

        // Modifying static variable (affects all objects)
        VariableTypesDemo.university = "IIT";

        System.out.println("After changing static variable:");
        s1.displayDetails();
        s2.displayDetails();
    }
}
