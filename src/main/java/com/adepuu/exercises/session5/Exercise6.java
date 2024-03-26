package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of element in the array : ");
        int length = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the numbers : ");

        for (int i =0; i < length; i++){
            arr.add(scanner.nextInt());
        }

        System.out.println("Input Key Number : ");
        int key = scanner.nextInt();

        for (int i = 0; i < arr.size(); i++){
            if (key == arr.get(i)){
                arr.remove(i);
            }
        }

        System.out.println("Update Array : ");
        for (int result : arr){
            System.out.print(result + " ");
        }


    }
}
