package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();
        String str1 = "", str2 = "";

        for (int i = 0; i < noOfTest; i++) {
            String input = sc.nextLine();
            char[] char1 = input.toCharArray();
            for (int j = 0; j < char1.length; j++) {
                if (j % 2 == 0) {
                    str1 = str1 + char1[j];
//                    System.out.println(str1);

                } else {
                    str2 = str2 + char1[j];
//                    System.out.println(str2);
                }
            }
        }
        System.out.println(str1 + " " + str2);
       str1 = str2 = "";

    }

}
