package com.sda.lesson6;

public class Supplement {
    private String name;
    private int recoverValue;

    public Supplement(String name, int recoverValue) {
        this.name = name;
        this.recoverValue = recoverValue;
    }

    public int recover(int currentStamina){
        if (currentStamina + recoverValue <= 100){
            return currentStamina + recoverValue;
        }
        else return 100;

    }
}
