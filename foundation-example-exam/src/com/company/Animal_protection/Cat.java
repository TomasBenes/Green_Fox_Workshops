package com.company.Animal_protection;

import java.util.Random;

public class Cat extends Animal {

    public Cat(int healCost) {
        Random randomNumber = new Random();
        this.healCost = randomNumber.nextInt(7);
    }
}
