package com.company.Animal_protection;

public class Animal {
    String ownerName;
    Boolean isHealthy;
    int healCost;
    String name;

    public void heal (Boolean isHealthy) {
        this.isHealthy = true;
    }

    public static boolean isAdoptable (Boolean isHealthy) {
        if (isHealthy == true) {
           return true;
        } else {
            return false;
        }
    }

    public String toString ( Boolean isHealthy, int healCost, String name) {
        if (isHealthy == true) {
            String goodAnimal = this.name + " is healthy, and adoptable";
            return goodAnimal;
        } else {
            String badAnimal = this.name + " is not healthy (" + this.healCost + "€), and not adoptable";
            return badAnimal;
        }
    }
}
