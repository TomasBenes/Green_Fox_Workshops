package com.company;

public class Main {

    public static void main(String[] args) {

     Pirate pirate1 = new Pirate();
     pirate1.nameOfPirate = "Jack Sparrow";
     pirate1.rumShots = 5;
     pirate1.nameOfPirates();
     Parrot parrot1 = new Parrot();
     parrot1.name = "Koko";
     parrot1.numberOfColors = 5;
     parrot1.colors = "blue, red, yellow, orange, purple";
     parrot1.ownsParrot();
     pirate1.drinkSomeRum();
     pirate1.howsItGoingMate();


     Pirate pirate2 = new Pirate();
     pirate1.brawl(pirate2);
    }
}
