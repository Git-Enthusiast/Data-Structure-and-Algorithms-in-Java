package com.Practice.Pattern;

/*
1   1
 2 2
  3
 4 4
5   5

 */
public class Pattern_2 {
    public static void main(String[] args) {
//        int rows = 5;
//
//        for (int i = 1; i <= rows; i++) {
//            int num = i;
//
//            for (int space = rows - i; space > 0; space--) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num);
//                num--;
//            }
//
//            num = 2;
//            for (int j = 1; j < i; j++) {
//                System.out.print(num);
//                num++;
//            }
//
//            System.out.println();
//        }


//       int n = 5;
//       for (int i = 1; i <= n; i++) {
//           for (int j = n; j > i; j--) {
//               System.out.print(" ");
//           }
//           for (int j = i; j >= 1; j--) {
//               System.out.print(j);
//           }
//           for (int j = 2; j <= i; j++) {
//               System.out.print(j);
//           }
//           System.out.println();
//       }

//               int size = 5; // You can change the size as needed
//
//               for (int i = 1; i <= size; i++) {
//                   for (int j = 1; j <= size; j++) {
//                       if (i == j || i + j == size + 1) {
//                           System.out.print(i);
//                       } else {
//                           System.out.print(" ");
//                       }
//                   }
//                   System.out.println();
//               }


        int size = 5; // You can change the size as needed

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == j || i + j == size + 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}


