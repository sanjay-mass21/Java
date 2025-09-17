package com.index;

import java.util.Arrays;

public class ArrayOddEvenSeparate {
    public static void main(String[] args) {
        int[] numbers = {10, 21, 32, 43, 54, 65, 76, 87};
        int evenCount = 0, oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];
        int eIndex = 0, oIndex = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenArray[eIndex++] = num;
            } else { 
                oddArray[oIndex++] = num;
            }
        }
        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Even Numbers: " + Arrays.toString(evenArray));
        System.out.println("Odd Numbers: " + Arrays.toString(oddArray));
    }
}
