package com.Lec6;

public class SearchMinMaxInTheArray {
    public static void main(String[] args) {
        int []arr= {12,4,53,-54,1091,7,50,15,3,9};
        int minResult= SearchMin(arr);
        System.out.println(minResult);
        int maxResult = SearchMax(arr);
        System.out.println(maxResult);

    }

    private static int SearchMax(int[] arr) {
        if (arr.length==0){
            return -1;
        }
        int max =arr[0];
        for (int i=1; i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];


            }
        }
        return max;
    }

    private static int SearchMin(int[] arr) {
        if (arr.length==0){
            return -1;
        }
        int min =arr[0];
        for (int i=1; i< arr.length;i++){
            if (arr[i]<min){
                min =arr[i];


            }
        }
        return min;
    }
}
