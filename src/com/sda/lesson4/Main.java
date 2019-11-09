package com.sda.lesson4;

public class Main {
    public static void main(String[] args) {
        Car m5 = new Car("BMW", 2017, "gas");
        System.out.println(m5.getModel());
        System.out.println(m5.getManufacturer());
        Car.hasInsurance = false;
        System.out.println(Car.hasInsurance);

        Car rav4 = new Car("Toyota", 2018, "Diesel");
        System.out.println(rav4.getManufacturer());
        System.out.println(Car.hasInsurance);

        System.out.println(Car.NUMBER_OF_CYL);

        Student student = new Student("Vasja", "qwe");
        System.out.println(student.toString());
    }
}
