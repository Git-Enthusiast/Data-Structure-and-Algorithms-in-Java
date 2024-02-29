package com.JavaLab;

/*
Animal is eating...
Dog is barking...

Animal is eating...
Dog is barking...
BabyDog is weeping...

Animal is eating...
Cat is meowing...
Animal is eating...
Lion is roaring...

 */
// Parent class (Superclass)
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Single Inheritance: Dog is a subclass of Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Multilevel Inheritance: BabyDog is a subclass of Dog
class BabyDog extends Dog {
    void weep() {
        System.out.println("BabyDog is weeping...");
    }
}

// Hierarchical Inheritance: Cat and Lion are subclasses of Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Lion is roaring...");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Single Inheritance example
        Dog dog = new Dog();
        dog.eat(); // inherited from Animal class
        dog.bark();
        System.out.println();

        // Multilevel Inheritance example
        BabyDog babyDog = new BabyDog();
        babyDog.eat(); // inherited from Animal class
        babyDog.bark(); // inherited from Dog class
        babyDog.weep();
        System.out.println();

        // Hierarchical Inheritance example
        Cat cat = new Cat();
        cat.eat(); // inherited from Animal class
        cat.meow();

        Lion lion = new Lion();
        lion.eat(); // inherited from Animal class
        lion.roar();
    }
}

