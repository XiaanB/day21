package com.example;


public class Main {

    public static void main(String[] args) {
        solve(10.25,17  ,5);
    }




    public static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double totalCostOfMeal = meal_cost + ((meal_cost * (double)tip_percent) / 100) + ((meal_cost * (double)tax_percent) / 100);
        System.out.println("The total meal cost is " + Math.round(totalCostOfMeal) + " dollars.");
    }

}
