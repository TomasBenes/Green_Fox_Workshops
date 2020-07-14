package com.company.Animal_protection;

import java.util.ArrayList;

public class AnimalShelter {

    int budget = 50;
    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList <String> adoptersName;

    public void rescue (ArrayList animals, Animal animal) {
        animals.add(animal);
        System.out.println(animals.size());
    }

    public void heal (){
    }
}
