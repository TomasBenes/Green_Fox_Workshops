package com.company;

import java.util.ArrayList;

public class Ship {


    public void fillShip () {
        ArrayList<Pirate> crew = new ArrayList<>();
        Pirate captain = new Pirate();
        System.out.println("Captain drank " + captain.rumShots + " of rum.");
        if (captain.goingToSleepItOff == true) {
            System.out.pgrintln("Captain has to sleep it off.");
        } if (captain.deadOrNot == true) {
            System.out.println("Captain died");
        } else {
            System.out.println("Captain is well");
        }
        System.out.println(crew.size());
    }

    public void shipBattle (Ship randomShip) {


    }
}
