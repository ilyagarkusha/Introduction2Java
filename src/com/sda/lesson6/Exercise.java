package com.sda.lesson6;

public class Exercise {
    private String name;
    private int difficulty;
    private int intensity;

    public Exercise(String name, int intensity, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
        this.intensity = intensity;
    }

    public int deceraseStamina(int stamina){
        int decreasedStamina = stamina - intensity;
        return decreasedStamina;
    }

    public int increaseStrength(int strength){
        int increasedStrength = strength + difficulty;
        return increasedStrength;
    }
}
