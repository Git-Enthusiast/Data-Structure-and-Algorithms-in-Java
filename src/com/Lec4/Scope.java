package com.Lec4;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name ="kunal";
        {
//          int a = 78; // already initialised outside the block in the same method, hence you cannot initialise again
            a = 100; // reassign the origin ref variable to some other value
            System.out.println(a); //100
            int c = 99;
//        System.out.println(c); // cannot use outside the block
            name = "Rajan";
            System.out.println(name);
            // values initialised in this block, will remain in block
        }
        int c = 900;
        System.out.println(a);
        System.out.println(name);

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
//            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println(a);
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
    public static  void  scope1(){
        int  number = 1091;

    }

}
