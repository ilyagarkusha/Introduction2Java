package com.sda.lesson8;

public class Developer extends Person {
    private String skills;
    public Developer(String name, int age, String skills) {
        super(name, age);
        this.skills = skills;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}

