package com.sda.lesson7.oop;

public class Animal {
    public int age;
    public String colour;
    public String sound = "some voice";

    public Animal(int age, String colour) {
        this.age = age;
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
