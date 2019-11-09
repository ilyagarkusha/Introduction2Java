package com.sda.homeworks.homework4;

public class Supplement {

    private int staminaReduce = 3;
    private static int quantity = 0;

    public static int getQuantity() {
        return quantity;
    }

    public int getSupplement(){
        quantity++;
        return staminaReduce;

    }
}
