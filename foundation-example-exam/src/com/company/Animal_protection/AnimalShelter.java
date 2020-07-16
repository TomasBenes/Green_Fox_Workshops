package com.company.Animal_protection;

import java.util.ArrayList;
import java.util.Random;

public class AnimalShelter {

    int budget = 50;
    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList <String> adoptersName;

    public int rescue (Animal animal) {
        this.animals.add(animal);
        return this.animals.size();
    }

    public int heal (){
        int count = 0;
        for (Animal animal : animals) {
            if (animal.isHealthy == false && this.budget >= animal.healCost) {
               animal.heal();
               count += 1;
                break;
            }
        }
        return count;
    }

    public void addAdopter (String name) {
        this.adoptersName.add(name);
    }

    public void findNewOwner () {
        Random randomAnimal = new Random();
        Random randomName = new Random();
        for (String name : adoptersName) {
            for (Animal animal : animals) {
                if (animal.isAdoptable() == true) {
                    name = randomName.toString();
                    animal = randomAnimal.toString();
                }

            }

        }
    }

    public int earnDonation (int amount) {
        this.budget += amount;
        return this.budget;
    }

    public String toString () {
        String shelter;
        System.out.println("Budget: " + this.budget + "€,");
        System.out.println("There are " + this.animals.size() + " animal(s) and " + this.adoptersName.size() + " potential adopter(s)");
        for (Animal animal : animals) {
            if (animal.isHealthy == true) {
                shelter = animal.name + " is healthy, and adoptable";
                return shelter;
            } else {
                shelter = animal.name + " is not healthy (" + animal.healCost + "€), and not adoptable";
                return shelter;
            }
        }
    }
}
