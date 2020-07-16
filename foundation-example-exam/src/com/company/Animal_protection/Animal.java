package com.company.Animal_protection;

public class Animal {
    public String ownerName;
    public boolean isHealthy;
    public int healCost;
    public String name;

    public Animal () {

    }

    public Animal (String name) {
        this.name = name;
    }

    public void heal () {
        this.isHealthy = true;
    }

    public boolean isAdoptable () {
            return this.isHealthy;
        }

    public String toString () {
        String animal;
        if (isAdoptable()) {
            animal = this.name + " is healthy, and adoptable";
            return animal;
        } else {
            animal = this.name + " is not healthy (" + this.healCost + "€), and not adoptable";
            return animal;
        }
    }
}
