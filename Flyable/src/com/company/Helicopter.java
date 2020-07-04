package com.company;

public class Helicopter extends Vehicle {



    @Override
    public void land() {
        System.out.println("Helicopter is landing");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    public void takeOff() {
        System.out.println("Helicopter is taking off");
    }

    @Override
    public void introduce() {
        System.out.println("This " + this.type + " helicopter has a max speed " + this.maxSpeed + "km/h and it weighs " + this.weight + "kg.");
    }
}
