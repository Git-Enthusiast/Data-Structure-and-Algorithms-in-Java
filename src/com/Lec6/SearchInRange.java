package com.Lec6;
// to search the element in the particular range;
public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {12,43,75,4,73,1091};
        int target = 109;
        int start = 1;
        int end = arr.length;
        boolean result = InRange(arr,target,start,end);
        System.out.println(result);

    }

    private static boolean InRange(int[] arr, int target, int start, int end) {
        if (arr.length==0){
            return false;
        }
        for (int i=start ;i<end; i++){
            if (target==arr[i]){
                return true;
            }
        }
        return false;
    }
}
