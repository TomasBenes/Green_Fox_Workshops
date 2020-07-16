package com.company.Animal_protection;

public class Animal {
    public String ownerName;
    public Boolean isHealthy;
    public int healCost;
    public String name;

    public void heal () {
        this.isHealthy = true;
    }

    public boolean isAdoptable (Boolean isHealthy) {
        if (isHealthy == true) {
           return true;
        } else {
            return false;
        }
    }

    public String toString () {
        String goodAnimal;
        String badAnimal;
        if (isAdoptable(true) == true) {
            goodAnimal = this.name + " is healthy, and adoptable";
            System.out.println(goodAnimal);
            return goodAnimal;
        } else {
            badAnimal = this.name + " is not healthy (" + this.healCost + "€), and not adoptable";
            System.out.println(badAnimal);
            return badAnimal;
        }
    }
}
