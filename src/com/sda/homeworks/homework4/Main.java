package com.sda.homeworks.homework4;

public class Main {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total: " + calculator.getTotalCost());

        floor = new Floor(5.4, 4.5);
        carpet = new Carpet(-5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total: " + calculator.getTotalCost());


        Trainee trainee = new Trainee("David", 2, 2);
        trainee.training();

    }

}
