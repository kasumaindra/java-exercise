package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of element in the array : ");
        int length = scanner.nextInt();

        int arr [] =new int[length];
        System.out.println("Enter the numbers : ");

        for (int i =0; i < length; i++){
            arr [i] = scanner.nextInt();
        }

        descendingValue(arr);

//        System.out.println("Input Direction : (asc / desc)");
//        String direc = scanner.next();

//        if(direc.equalsIgnoreCase("asc")){
//            ascendingValue(arr);
//        }else if(direc.equalsIgnoreCase("desc")){
//            descendingValue(arr);
//        }else{
//            System.out.println("Unrecognize input");
//        }



    }

    public static void descendingValue(int [] arr){
        for (int i = 0; i < arr.length; i++){

            for (int j = i +1; j < arr.length; j++){

                if (arr[i] <= arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        System.out.println("Update Array : ");
        for (int result : arr){
            System.out.print(result + " ");
        }
    }
}
