package com.advanced;

public class Dog {
    private String name;
    private int age;
    private boolean isMale;
    private double weigth;

    public Dog(String name, int age, boolean isMale, int weigth) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.weigth = weigth;
    }

    public Dog(int age) {
        Dog aDog = new Dog("Name", 20, false, 60);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Age cannot be below 0. Please set right age");
        }
        this.age = age;
    }

    public double getWeigth() {
        if (weigth > 0){
            return weigth;
        }
        else {
            System.out.println("Weigth cannot be below 0. Please set right age");
        }
        return 0;

    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
}
