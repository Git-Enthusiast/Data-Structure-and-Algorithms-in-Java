package com.Practice.SpecialNumber;
// print 10th palindrome no starting from 1.
public class CheckPalindrome {
    public static void main(String[] args) {
        int count =0;
        int num=1;
        while (count<10){
            if (IsPalindromeNumber(num)){
                count++;
                if (count==10){
                    System.out.println("The 10th Palindrome No is :"+num);
                }
            }
            num++;
        }
    }
    private static boolean IsPalindromeNumber(int num){
        int n = num;
        int sum =0;
        while (n>0){
            int rem= n%10;
            sum=sum*10+rem;
            n/=10;
        }
        return sum==num;
    }
}
