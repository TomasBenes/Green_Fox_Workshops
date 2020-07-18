package com.company.Animal_protection;

import java.util.Random;

public class Cat extends Animal {

    public Cat() {
        Random randomNumber = new Random();
        this.healCost = randomNumber.nextInt(7);
        this.name = "Cat";
    }

    public Cat(String name){
        super(name);
    }
}
