package com.sda.oop;

public class Main {
    public static void main(String[] args) {

            // copy of a class/blueprint is called : instance (sample)
        //create instance of car

        /*Car childCar = new Car();
        childCar.setBuildYear(2010);
        childCar.setColor("Black");
        childCar.setModel("FIAT");

        System.out.println("My car model is " + childCar.getModel() + " and it is built in " + childCar.getBuildYear() + " colored in " + childCar.getColor());

        childCar.setModel("Mazda");
        System.out.println(childCar.getModel());*/

        //first method for instantiation  ----> no-arg constructor
        Car fisrtCar = new Car();

        //first method for initialization: use setters and getters
        fisrtCar.setModel("Mazda");
        fisrtCar.setColor("Black");
        fisrtCar.setBuildYear(2010);

        //======================================================================
        //second method for instantiation and initialization together: using constructors

        Car secondCar = new Car(2006, "beez", "Honda");
        Car thirdCar = new Car("BMW", 2019);

        System.out.println(secondCar.getModel());

    }
}
