package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number less than 100: ");
        int n = scanner.nextInt();

        if (n % 2 == 1) {
            System.out.println("wierd");
            }            else if (n % 2 == 0 && n < 5) {
            System.out.println("Not wierd");

        } else if (n % 2 == 0 &&  n < 20) {
            System.out.println("Wierd");

        } else {
            System.out.println("not wierd");
        }
    }
}
