package com.example;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age) {
        this.age = age;


    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    public void yearsPassed() {
        this.age++;
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.. ");
        }else if(age >=13 && age < 18){
            System.out.println("You are a teenager.. ");
        }else
        System.out.println("You are old..");

    }
}
