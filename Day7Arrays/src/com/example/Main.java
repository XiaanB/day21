package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Please enter the size of the array: ");
        final int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            in.nextLine();
            System.out.print(" " + arr[i]);
        }
        System.out.println(" the array contains "+ Arrays.toString(arr));
        System.out.println(" ");

        for(int i = n - 1; i > -1; i--){
            System.out.print(arr[i] + " ");
//            reverse(arr);
//        System.out.println();
//        System.out.print(Arrays.toString(arr));
//
    }

//    private static void reverse(int[] A) {
//        int maxIndex = A.length - 1;
//        int halveLength = A.length / 2;
//        for (int i = 0; i < halveLength; i++) {
//            int temp = A[i];
//            A[i] = A[maxIndex - i];
//            A[maxIndex - i] = temp;

      //  }

    }
}

