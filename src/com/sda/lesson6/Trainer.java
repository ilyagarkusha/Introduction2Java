package com.sda.lesson6;

public class Trainer {
    private String name;
    private Trainer atrainer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer(String name) {
        this.name = name;
    }
}
