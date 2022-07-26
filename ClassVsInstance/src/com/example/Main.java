package com.example;

public class Main {

    public static void main(String[] args) {
        Solution mamo = new Solution(15,10);
        mamo.amIOld();
        mamo.yearsPasses();
        mamo.yearsPasses();
        mamo.yearsPasses();
        mamo.yearsPasses();
        mamo.amIOld();

    }

    public static class Solution {
        int age;
        int initialAge;

        public Solution(int age, int initialAge) {
            if (initialAge > 0) {
                this.age = initialAge;
            }else{
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0..");
            }
            this.initialAge = initialAge;
        }

        public void yearsPasses() {
            this.age++;
        }

        public void amIOld() {
            if (this.age < 13) {
                System.out.println("You are young..");
            } else if (this.age < 18) {
                System.out.println("you are a teenager..");
            }else{
                System.out.println("You are old..");

        }

        }
        public void setAge(int age) {
            this.age = age;
        }

        public void setInitialAge(int initialAge) {
            this.initialAge = initialAge;
        }
    }
}
