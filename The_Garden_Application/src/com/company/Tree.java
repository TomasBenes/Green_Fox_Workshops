package com.company;

public class Tree {

    String colorOfTree;
    int waterGivenForTree;
    int waterAmountForTree;
    int firstWatering = 40;
    int secondWatering = 70;

    public void lookOfGardenTree() {
        System.out.println("Garden has a " + this.colorOfTree + " tree.");
    }

    public void wateringTrees () {
        if (this.waterAmountForTree < 10) {
            System.out.println("The " + this.colorOfTree + " Tree needs water.");
            this.waterAmountForTree += (double) this.waterGivenForTree * 0.4;
        } else {
            System.out.println("The " + this.colorOfTree + " Tree doesnt need water.");
        }
    }

    public void firstWateringTree (){
        this.waterGivenForTree += this.firstWatering/4;
    }

    public void secondWateringTree (){
        this.waterGivenForTree += this.secondWatering/4;
    }
}
