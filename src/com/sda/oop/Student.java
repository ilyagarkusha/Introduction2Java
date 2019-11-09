package com.sda.oop;

public class Student {

    // attributes / properties
    private String name = "David";
    private int age = 20;
    private String id = "ST1002";

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }



    public void setAge(int newStudentAge){
        this.age = newStudentAge;
    }

    public void setId (String newStudentId){
        this.id = newStudentId;
    }

    public void setName(String newStundetnName){
        this.name = newStundetnName;
    }


    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }


    //behaviours
    public static boolean study(){
        System.out.println("I'm studying right now");
        return true;
    }

    public static boolean wirk(){
        System.out.println("I prefer not to work yet");
        return false;
    }

    public static boolean drive(Car car){
        System.out.println("I have recently bought a Toyota");
        return true;
    }
}
