package com.sda.lesson5;
//FNQ - Fully  qualified name

public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark(){
        if (age <= 2){
            System.out.println("Tjaf-Tjaf");
        }
        if (age > 2 && age <= 4){
            System.out.println("Gaf-Gaf");
        }
        if (age > 4){
            System.out.println("Wof-Wof");
        }
    }
}
