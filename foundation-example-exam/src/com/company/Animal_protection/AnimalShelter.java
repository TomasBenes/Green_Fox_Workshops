package com.company.Animal_protection;

import java.util.ArrayList;

public class AnimalShelter extends Animal {

    int budget = 50;
    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList <String> adoptersName;

    public int rescue (Animal animal) {
        this.animals.add(animal);
        return this.animals.size();
    }

    public void heal (){
    }

    public void addAdopter (String name) {
        this.adoptersName.add(name);
    }

    public void findNewOwner () {

    }

    public int earnDonation (int amount) {
        this.budget += amount;
        return this.budget;
    }

    public String toString () {
        System.out.println("Budget: " + this.budget + "€,");
        System.out.println("There are " + this.animals.size() + " animal(s) and " + this.adoptersName.size() + " potential adopter(s)");
        if (isHealthy == false) {
            String badAnimal = this.name + " is not healthy (" + this.healCost + "€), and not adoptable";
            return badAnimal;
        } else {
            String goodAnimal = this.name + " is healthy, and adoptable";
            return goodAnimal;
        }
    }
}
