package com.sda.lesson5;

public class AppDriver {
    public static void main(String[] args) {
        Dog dog = new Dog("Tom", 1);
        Dog dog2 = new Dog("Mike", 4);
        Dog dog3 = new Dog("Steve", 7);


        dog.bark();
        dog2.bark();
        dog3.bark();



        Room room = new Room(4.5,2.5, 3);

        System.out.println("Surface area: " + room.surfaceArea());
        System.out.println("Volume: " + room.volume());

    }

}
