package com.company.Animal_protection;

import java.util.Random;

public class Parrot extends Animal {

    Parrot () {
        Random randomNumber = new Random();
        this.healCost = randomNumber.nextInt(10 - 4 + 1) + 4;
    }
}
