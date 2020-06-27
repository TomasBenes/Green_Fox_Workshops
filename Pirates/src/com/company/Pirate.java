package com.company;

import java.util.Random;
import java.util.Scanner;

public class Pirate {
    String nameOfPirate;
    int rumShots;
    boolean goingToSleepItOff;
    boolean deadOrNot;

    public void nameOfPirates () {
        System.out.println("My name is " + this.nameOfPirate);
    }
    public void drinkSomeRum() {
        this.rumShots +=1;
        System.out.println("I have drank " + this.rumShots + " shots of rum.");
    }
    public void howsItGoingMate() {
        System.out.println("So hows it going mate?");
        if (this.rumShots < 5) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            goingToSleepItOff = true;
        }
    }
    public void die (){
        this.deadOrNot = true;
        System.out.println(this.nameOfPirate + " is dead.");
    }
    public void brawl (Pirate randomPirate) {
        System.out.println("Lets have some fight.");
        if (this.deadOrNot == true || randomPirate.deadOrNot == true) {
        return;
        }
        Random random = new Random();
        int firstOneDies = random.nextInt(10);
        int secondOneDies = random.nextInt(10);
        int theyBothPassOut = random.nextInt(10);
        switch (random.nextInt(3)) {
            case 0 :
                randomPirate.deadOrNot = true;
                    System.out.println("Second pirate is the winner");
                    break;
            case 1 :
                this.deadOrNot = true;
                    System.out.println("First pirate is the winner");
                break;
            case 2 :
                randomPirate.deadOrNot = true;
                this.deadOrNot = true;
                    System.out.println("They have both passed out");
                    break;
        }

    }
}
