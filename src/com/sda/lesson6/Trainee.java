package com.sda.lesson6;

public class Trainee {
    private String name;
    private int stamina;
    private int strength;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {

        if (stamina > 0){
            this.stamina = stamina;
        }
        else {
            System.out.println("Stamina can not be below zero");
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (this.strength <= 100){
        this.strength = strength;}
        else
        {
            System.out.println("Strength can't be over 100");
        }
    }

    public Trainee(String name, int stamina, int strength) {
        this.name = name;
        this.stamina = stamina;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "The current trainee state:\n"
                + "stamina: " + stamina + "\n"
                + "strength: " + strength + "\n";
    }
}
