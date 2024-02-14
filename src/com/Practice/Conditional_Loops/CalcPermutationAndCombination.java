package com.Practice.Conditional_Loops;

import java.util.Scanner;

/*
 nCr: Combinations

Meaning: nCr represents the number of ways to select r objects without worrying about the order you choose them in. For example, if you have 4 different fruits and want to choose 2 to make a smoothie, the order you choose them (apple-banana or banana-apple) doesn't matter.

Formula: nCr = n! / (r! * (n-r)!)

n: total number of objects
r: number of objects you want to select
!: factorial (e.g., 4! = 4 * 3 * 2 * 1)
nPr: Permutations

Meaning: nPr represents the number of ways to arrange r objects in a specific order from a set of n objects. For example, if you have 3 trophies and want to display them on a shelf, the order you arrange them (gold-silver-bronze or bronze-silver-gold) makes a difference.

Formula: nPr = n! / (n-r)!

n: total number of objects
r: number of objects you want to arrange
 */
public class CalcPermutationAndCombination {
    public static void main(String[] args) {
        // nCr = n! / (r! * (n-r)!)
        // nPr = n! / (n-r)!
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter 'p' to calculate Permutation or 'c' for Combination");
        char ch = input.next().trim().charAt(0);
        if (ch == 'p') permutation();
        else if (ch == 'c') combination();
        else System.out.println("Invalid Input.");
    }

    private static void combination() {
        // nCr = n! / (r! * (n-r)!)
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter total number of objects: ");
        int n = input.nextInt();
        System.out.println("Please Enter number of objects you want to select: ");
        int r = input.nextInt();
        long com = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.print("The number of ways to select r objects from n objects is: "+com);
    }

    private static void permutation() {
        // nPr = n! / (n-r)!
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter total number of objects: ");
        int n = input.nextInt();
        System.out.println("Please Enter number of objects you want to arrange: ");
        int r = input.nextInt();
        long per = factorial(n)/(factorial(n-r));
        System.out.print("The number of ways to arrange r objects from n objects is: "+per);
    }
    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
