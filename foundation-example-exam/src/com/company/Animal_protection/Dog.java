package com.company.Animal_protection;

import java.util.Random;

public class Dog extends Animal {

    Dog (int healCost) {
        Random randomNumber = new Random();
        this.healCost = randomNumber.nextInt(8 - 1 + 1) + 1;
    }
}
