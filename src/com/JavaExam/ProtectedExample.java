package com.JavaExam;

public class ProtectedExample {

    protected int protectedField = 20;

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    public static void main(String[] args) {
        // Creating an instance of the subclass
        SubclassExamples subclass = new SubclassExamples();

        // Accessing protected members from the subclass
        subclass.accessProtectedMembers();
    }
}

class SubclassExamples extends Question_5 {

    public void accessProtectedMembers() {
        // Accessing protected field in the subclass
        int value = protectedField; // This is allowed

        // Accessing protected method in the subclass
        protectedMethod(); // This is allowed
    }
}

class AnotherClassInSamePackage {

    public void accessProtectedMembers() {
        // Creating an instance of the subclass
        SubclassExamples subclass = new SubclassExamples();

        // Accessing protected members from another class in the same package
        subclass.accessProtectedMembers();
    }
}

