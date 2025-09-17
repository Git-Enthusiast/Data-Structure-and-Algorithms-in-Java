package com.Java_Core_Advance.Java_Basics;

/*
 🔹 Types of Variables in Java
 --------------------------------
 In Java, variables are classified mainly into 3 types:
   1. Local Variables
   2. Instance Variables (non-static)
   3. Static Variables (class variables)
*/

public class VariableTypesDemo {
    
    /* 
     🔹 Static Variable (Class Variable)
     - Declared with 'static' keyword inside a class but outside methods.
     - Shared by ALL objects of the class (only ONE copy exists).
     - Created when the class is loaded into memory, destroyed when the program ends.
     - Stored in Method Area (Class Area).
     - Accessed via Class Name (preferred) or object reference.
     - Default values like instance variables (0, 0.0, null, false).
     */
    static String university = "GGV";

    /*
     🔹 Instance Variables (Non-static Variables)
     - Declared inside a class but outside methods/constructors/blocks.
     - Each object gets its OWN COPY (unique to each object).
     - Created when an object is created with 'new'.
     - Destroyed when object is destroyed (Garbage Collection).
     - Stored in Heap memory (inside object).
     - Have default values if not initialized (int=0, float=0.0, String=null).
     */
    String studentName;
    int age;

    // Constructor to initialize instance variables
    public VariableTypesDemo(String name, int age) {
        this.studentName = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        /*
         🔹 Local Variable
         - Declared inside a method, constructor, or block.
         - Created when method is invoked, destroyed when method exits.
         - Scope: Only within that method/block.
         - Must be initialized before use (no default value assigned).
         - Stored in Stack memory.
         */
        String message = "Learning Java Variables";

        System.out.println("Student Name: " + studentName);   // Instance variable
        System.out.println("Age: " + age);                    // Instance variable
        System.out.println("University: " + university);      // Static variable
        System.out.println("Message: " + message);            // Local variable
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        // Creating two different objects (each has its own instance variables)
        VariableTypesDemo s1 = new VariableTypesDemo("Rajan", 22);
        VariableTypesDemo s2 = new VariableTypesDemo("Kumar", 25);

        // Displaying details of both students
        s1.displayDetails();
        s2.displayDetails();

        // Modifying static variable (affects ALL objects because it's shared)
        VariableTypesDemo.university = "IIT";

        System.out.println("After changing static variable:");
        s1.displayDetails();
        s2.displayDetails();
    }
}

/*
==================================
 🔹 Instance vs Static Variables
----------------------------------
Feature            | Instance Variable        | Static Variable
-------------------|--------------------------|----------------------------
Belongs to         | Object (each has a copy) | Class (only one copy shared)
Memory Location    | Heap (inside object)     | Method Area (class memory)
Lifetime           | As long as object exists | As long as class is loaded
Access             | Via object reference     | Via class name (preferred)
Example Use        | Student name, roll no.   | School name, interest rate
==================================

 🔹 Common Mistakes to Avoid
 1. Using uninitialized local variables:
    public void test() {
        int x;
        // System.out.println(x); ❌ ERROR: must initialize before use
    }

 2. Confusing == and .equals() for Strings:
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s1 == s2);      // false (compares references)
    System.out.println(s1.equals(s2)); // true (compares values)

 3. Misusing static variables in multi-threaded programs:
    Since static variables are shared, modifying them without synchronization can cause race conditions.
==================================

 ✅ Quick Syntax Recap:
 class Example {
     static int staticVar;   // Static variable
     int instanceVar;        // Instance variable
     
     public void method() {
         int localVar = 10;  // Local variable
     }
 }
==================================

 🔹 Memory Diagram (ASCII Art)

         +-------------------------+
         |      Method Area        |
         |-------------------------|
         |  Class info (VariableTypesDemo) 
         |  Static vars: university = "GGV"/"IIT"
         +-------------------------+

         +-------------------------+
         |          Heap           |
         |-------------------------|
         |  Object s1              |
         |   - studentName = "Rajan"
         |   - age = 22            |
         |                         |
         |  Object s2              |
         |   - studentName = "Kumar"
         |   - age = 25            |
         +-------------------------+

         +-------------------------+
         |          Stack          |
         |-------------------------|
         | main() frame            |
         |   - s1 (ref to Heap obj)|
         |   - s2 (ref to Heap obj)|
         | displayDetails() frame  |
         |   - local var: message  |
         +-------------------------+

 👉 Quick Recap:
 - Static vars → Method Area (one copy shared by all).
 - Instance vars → Heap (unique copy per object).
 - Local vars → Stack (exist only inside methods).
*/
