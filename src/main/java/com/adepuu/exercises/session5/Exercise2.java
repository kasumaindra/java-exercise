package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
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

        // Ask the user to input the swap limit
        System.out.print("Enter the number of elements to swap: ");
        int swapLimit = scanner.nextInt();

        // Swap the first 'swapLimit' elements with the last 'swapLimit' elements
        for (int i = 0; i < swapLimit; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - swapLimit + i];
            arr[arr.length - swapLimit + i] = temp;
        }

        // Print the updated array
        System.out.println("Updated array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }




    }
}
