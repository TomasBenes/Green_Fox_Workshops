package com.company;

public class Sharpie {
    String color;
    double width;
    double inkAmount;

    Sharpie (String inkAmount) {
        this.inkAmount = 100;
    }

    public void use () {
        this.inkAmount -= 5.5;
        System.out.println(this.inkAmount);
    }

}
