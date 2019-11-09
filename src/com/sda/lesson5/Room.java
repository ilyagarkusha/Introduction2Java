package com.sda.lesson5;

public class Room {
    private double width;
    private double heigth;
    private double length;

    public Room(double width, double heigth, double length) {
        this.width = width;
        this.heigth = heigth;
        this.length = length;
    }

    public double surfaceArea(){
        return length * width;
    }

    public double volume(){
        return length * width * heigth;
    }
}
