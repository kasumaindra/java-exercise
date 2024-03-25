package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static boolean checkBooleanDuplicate(int[] arr){

        for (int number = 0; number < arr.length; number++){
            for (int check = arr[number] + 1; check < arr.length; check++ ){
                if (arr[check] == arr [number] ){
                    return true;
                }
            }
        }
        return false;

    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the array values
        System.out.print("Enter the number of elements in the array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean result = checkBooleanDuplicate(arr);
        System.out.println(result);
    }
}
