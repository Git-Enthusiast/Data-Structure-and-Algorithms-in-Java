package com.JavaExam;

public class Question_5 {

    // Protected field - accessible within the same package and by subclasses
    protected int protectedField = 20;

    // Protected method - accessible within the same package and by subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    public static void main(String[] args) {
        Question_5 example = new Question_5();

        // Accessing protected field directly within the same class
        int value = example.protectedField; // This is allowed

        // Accessing protected method directly within the same class
        example.protectedMethod(); // This is allowed

        // Creating an instance of the subclass and accessing protected members
        SubclassExamples subclass = new SubclassExamples();
        subclass.accessProtectedMembers();
    }
}

// Subclass in the same package
class SubclassExample extends Question_5 {

    public void accessProtectedMembers() {
        // Accessing protected field in the subclass
        int value = protectedField; // This is allowed

        // Accessing protected method in the subclass
        protectedMethod(); // This is allowed
    }
}

