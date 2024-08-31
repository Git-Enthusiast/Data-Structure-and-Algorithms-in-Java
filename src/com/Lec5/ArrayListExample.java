package com.Lec5;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);

        System.out.println(list.contains(765432));
        System.out.println(list);
        list.set(0, 99);

        list.remove(2);
        list.add(5,1091);

        System.out.println(list);
        System.out.println(list.get(2));

    ArrayList<String>str= new ArrayList<>() ;
        System.out.println(str);
        // input
        System.out.println("Please enter the element of the array list:");
        for (int i = 0; i < 5; i++) {
            str.add(in.next());
        }
        System.out.println(str);
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(str.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(str);



    }
}
