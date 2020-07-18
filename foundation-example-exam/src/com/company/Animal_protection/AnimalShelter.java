package com.company.Animal_protection;

import java.util.ArrayList;
import java.util.List;
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
               this.budget = this.budget - animal.healCost;
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
        Random random = new Random();
        List<Animal> adoptablesAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.isAdoptable()) {
                adoptablesAnimals.add(animal);
            }
        }
        String randomOwner = adoptersName.get(random.nextInt(adoptersName.size()));
        Animal randomAnimal = adoptablesAnimals.get(random.nextInt(adoptablesAnimals.size()));

    }


    public int earnDonation (int amount) {
        this.budget += amount;
        return this.budget;
    }

    public String toString () {
        String shelter = "Budget: " + budget + "€,\n";
        shelter += "There are " + animals.size() + " animal(s) and " + adoptersName.size() + " potential adopter(s)\n";
        for (Animal animal : animals) {
            shelter += animal.toString() + "\n";
        }
        return shelter;
    }
}
