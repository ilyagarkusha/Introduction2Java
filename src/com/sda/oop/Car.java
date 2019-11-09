package com.sda.oop;

public class Car {
    private String color;
    private String model;
    private int buildYear;
        //NOTE: Statics (methods + variables) belong to the class
            // While Non-Static belong to the instance Object
    //Constructor  -----> there it's no return type, unlike the regular methods
    public Car(int buildYear, String color, String model){
        this.buildYear = buildYear;
        this.color = color;
        this.model = model;
    }

    public Car(String model, int buildYear){
        this.model = model;
        this.buildYear = buildYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", buildYear=" + buildYear +
                '}';
    }

    public Car(){}   // no-arg constructor



    //writing setters methods
    public void setColor(String childColor){
        this.color = childColor;

    }

    public void setModel(String childModel){
        this.model = childModel;
    }

    public void setBuildYear(int childBuildYear){
        this.buildYear = childBuildYear;
    }


    // writing getters methods (Security as well as encapsulation)

    public String getColor(){
        return color;
    }

    public int getBuikdYear(){
        return this.buildYear;
    }

    public String getModel(){
        return this.model;
    }

    public int getBuildYear() {
        return buildYear;

    }
}
