package com.company;

public class Flower {

    String colorOfFlower;
    int waterGivenForFlower;
    int waterAmountForFlower;
    int firstWatering = 40;
    int secondWatering = 70;

    public void lookOfGardenFlowers () {
        System.out.println("Garden has a " + this.colorOfFlower + " flower.");
    }

    public void wateringFlowers () {
        if (this.waterAmountForFlower < 5) {
            System.out.println("The " + this.colorOfFlower + " Flower needs water.");
            this.waterAmountForFlower += (double) this.waterGivenForFlower * 0.75;
        } else {
            System.out.println("The " + this.colorOfFlower + " Flower doesnt need water.");
        }
    }

    public void firstWateringFlower (){
        this.waterGivenForFlower += this.firstWatering/4;
    }

    public void secondWateringFLower (){
        this.waterGivenForFlower += this.secondWatering/4;
    }
}
