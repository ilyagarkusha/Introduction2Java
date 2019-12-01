package com.advanced;

public class Main {
    public static void main(String[] args) {
        //create a Dog object and check if anything works fine
        Dog somaDog = new Dog("Shepparf", 3, true, 20);


        System.out.println("getter for age: " + somaDog.getAge());
        somaDog.setAge(-5);
        somaDog.setAge(7);
        System.out.println("new age for dog is " + somaDog.getAge());



    }
}
