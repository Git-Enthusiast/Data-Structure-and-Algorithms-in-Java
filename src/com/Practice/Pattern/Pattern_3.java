package com.Practice.Pattern;

public class Pattern_3 {
    /*
     1
    232
   34543
  4567654
 567898765

     */
    public static void main(String[] args) {
        int n = 5; // Change the value of n for a different size pyramid

        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=i;k<2*i-1;k++)
            {
                System.out.print(k);
            }
            for(int k=2*i-1;k>=i;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}


