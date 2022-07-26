package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter the number of test cases: ");
        int T = scan.nextInt();
        //System.out.println("You have selected: " + T + " cases.");
        scan.nextLine();

        int count = 1;
        if (T>=1 && T <=10) {
            while (count <= T) {
                System.out.print("Please type in a word:");
                String s = scan.nextLine();
                //System.out.println("You have typed: " + s + " and it has " + s.length() + " letters");
                count++;

                char[] charArray = s.toCharArray();
                for (int i = 0; i <charArray.length ; i++) {
                    if (i % 2 == 0) {
                        System.out.print(charArray[i]);
                                            }
                }
                System.out.println(" ");

                for (int i = 0; i < charArray.length; i++) {
                    if (i % 2 != 0) {
                        System.out.print(charArray[i]);
                    }
                }
                System.out.println();
            }

        }






        }




    }

