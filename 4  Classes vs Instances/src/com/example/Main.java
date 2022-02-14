package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int initialAge = 0;

        System.out.print("Please enter your age: ");
        Scanner scan = new Scanner(System.in);
        initialAge = scan.nextInt();

        if (initialAge < 0 ) {
            System.out.println("Age is not valid, setting age to 0.");
            initialAge = 0;
        }

        Person person = new Person(initialAge);

        System.out.println(person.getAge());

        person.yearsPassed();
        person.yearsPassed();
        person.yearsPassed();

        System.out.println(person.getAge());

        person.amIOld();
    }
}
