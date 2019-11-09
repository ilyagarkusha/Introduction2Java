package com.sda.lesson6;

public class SomeClassDriver {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass(300, "another-value");
        System.out.println("val: " + someClass.getVal());
        System.out.println("str: " + someClass.getStr());


    }
}
