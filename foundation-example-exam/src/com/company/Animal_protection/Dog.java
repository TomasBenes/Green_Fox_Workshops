package com.company.Animal_protection;

import java.util.Random;

public class Dog extends Animal {

    public Dog () {
        Random randomNumber = new Random();
        this.healCost = randomNumber.nextInt(8) + 1;
        this.name = "Dog";
    }

    public Dog (String name){
        super(name);
    }
}
