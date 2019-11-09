package com.foreign;

import com.local.ConsumerInSamePackage;
import com.local.PackagedClass;
import com.sda.lesson5.Dog;

import javax.crypto.Cipher;

public class ForeignClass {

    public boolean x;
    public double y;
    public Dog dog;

    public static void main(String[] args) {


ForeignClass cl = new ForeignClass();


        System.out.println(cl.x);
        System.out.println(cl.y);

    }
    public class Dog{}
}
