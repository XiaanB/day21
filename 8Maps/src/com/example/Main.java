package com.example;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 1;

        while (count <= n) {
            String name = scan.nextLine().toLowerCase(Locale.ROOT);
            scan.nextLine();
            Integer num = scan.nextInt();
            scan.nextLine();
            phoneBook.put(name, num);
            count++;
        }
        while (scan.hasNext()) {
            String name = scan.next();
            if (phoneBook.containsKey(name)) {
                int phone = phoneBook.get(name);
                System.out.println(name + "=" + phone);
            } else {
                System.out.println("Not found");
            }
        }

    }
}
