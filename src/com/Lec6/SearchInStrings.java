package com.Lec6;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "This is an example of string ";
        // to check whether a string is present in a string or not by using contains method.
//        System.out.println(str.contains("x"));
        char target = 'x';
        boolean result = isResult(str, target);
        System.out.println(result);
        System.out.println(Arrays.toString(str.toCharArray()));

    }

    private static boolean isResult(String str, char target) {
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i<str.length();i++){

             if ( target == str.charAt(i)){
                 return true;
             }
        }
        return false;
    }
    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for(char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

}
