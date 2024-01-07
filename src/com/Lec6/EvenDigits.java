package com.Lec6;
// will return total no of element which has even no digits.
public class EvenDigits {
    public static void main(String[] args) {
        int[]arr = {12,2,553,4049,434,-5343,1091};
        System.out.println(NoOfElementOfEvenDigits(arr));
        System.out.println(returnTotalNoOfDigitsUsingFormula(334));
    }

    private static int NoOfElementOfEvenDigits(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (even(j)) {
                count++;
            }
        }
        return count;
    }

    private static boolean even(int i) {
        int noOfDigits = digits(i);
        return noOfDigits %2==0;
    }

    private static int digits(int i) {
        int count = 0;
        if (i<0){
            i = i*-1;
        }
        if (i==0){
            return 1;
        }
        while (i>0){
            i=i/10;
            count++;
        }
        return count;
    }
    // the below function directly return the total no digits using formula.
    static int returnTotalNoOfDigitsUsingFormula(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

}
