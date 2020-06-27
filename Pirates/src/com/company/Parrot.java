package com.company;

public class Parrot {
    String name;
    int numberOfColors;
    String colors;

    public void ownsParrot () {
        System.out.println("Name of my parrot is " + this.name);
        System.out.println(this.name + " has " + this.numberOfColors + " colors.");
        System.out.println("The colors are " + this.colors + ".");
    }

}
