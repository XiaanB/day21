package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number less than 100: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            if (n<5) System.out.println("Not Weird");
            else if(n<21) System.out.println("Weird");
            else System.out.println("Not Weird");
        }else System.out.println("Weird");

//        if (n % 2 == 0 && n < 5) {
//            System.out.println("Not Weird");
//        } else if (n % 2 == 0 && n < 20) {
//            System.out.println("Weird");
//        } else if(n % 2 == 0 && n>20){
//            System.out.println("Not Weird");
//        }else{
//            System.out.println("Weird");
//        }
    }
//        if (n % 2 == 0) {
//            if (n < 6) System.out.println("Not Weird");
//            else if (n < 21) System.out.println("Weird");
//            else System.out.println("Not Weird");
//        } else System.out.println("Weird");

    }


