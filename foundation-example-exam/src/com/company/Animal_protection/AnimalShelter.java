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
        if (this.budget > 0 && this.isHealthy == false) {
            heal();
        }
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
        String notHealthyAnimal;
        String healthyAnimal;
        if (isHealthy == false) {
            notHealthyAnimal = this.name + " is not healthy (healing would cost: " + this.healCost + "€), and not adoptable";
            System.out.println(notHealthyAnimal);
            return notHealthyAnimal;
        }
        else {
            healthyAnimal = this.name + " is healthy, and adoptable";
            System.out.println(healthyAnimal);
            return healthyAnimal;
        }
    }
}
