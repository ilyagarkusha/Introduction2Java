package com.sda.lesson4;

public class Car {
    private String manufacturer;
    private int model;
    private String fuelType;
    public static int NUMBER_OF_CYL = 6;

    static {
        NUMBER_OF_CYL = 7;
    }

    //initialization block ----> local variable
    {
        double price = 40000;
    }


        static boolean hasInsurance = true;


    public Car(String manufacturer, int model, String fuelType) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.fuelType = fuelType;



    }

    public String getManufacturer() {
        if (manufacturer.equals("BMW")){
            return manufacturer + " is a german company";
        }
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
