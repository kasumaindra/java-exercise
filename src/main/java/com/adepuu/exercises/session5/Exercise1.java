package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise1 {

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

        System.out.println("Largest Array is : "+ largestArray(arr));

    }


    static int largestArray(int[] check){

        int large = 0;
        for(int i =0; i< check.length; i++){
            if  (check[i] > large){
                large = check[i];
            }
        }
        return large;
    }
}
