package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of element in the array : ");
        int length = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the numbers : ");

        for (int i =0; i < length; i++){
            arr.add(scanner.nextInt());
        }


        removeDuplicate(arr);


    }

    public static void removeDuplicate(ArrayList<Integer> arr){

        for (int i = 0; i < arr.size(); i++){
            for (int j = i +1; j < arr.size(); j++){
                if(arr.get(i) == arr.get(j)){
                    arr.remove(j);
                }
            }
        }

        System.out.println("Update Array : ");
        for (int itr : arr){
            System.out.print(itr+ " ");
        }
    }

}
