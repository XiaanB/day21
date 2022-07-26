package com.example;

public class Main {

    public static void main(String[] args) {
        sum(5);

        }


    public static void sum( int n) {
        int i = 1;
    while (i >= 0 && i <= 10) {
            System.out.println(n + " x " + i + " = "+ n*i);
        i++;
        }
    }
}
