package com.index;
import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 5, 4};
      
        System.out.println("arr1 and arr2 are equal: " + Arrays.equals(arr1, arr2)); 
        System.out.println("arr1 and arr3 are equal: " + Arrays.equals(arr1, arr3));
        System.out.println("Manual check (arr1 & arr2): " + checkEqual(arr1, arr2));
        System.out.println("Manual check (arr1 & arr3): " + checkEqual(arr1, arr3));
    }
    public static boolean checkEqual(int[] a, int[] b) { 
        if (a.length != b.length) return false; 

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false; 
        }
        return true; 
    }
}
