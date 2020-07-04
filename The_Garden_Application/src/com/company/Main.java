package com.company;

public class Main {

    public static void main(String[] args) {
        Flower rose = new Flower();
        rose.colorOfFlower = "yellow";
        rose.waterAmountForFlower = 4;
        rose.lookOfGardenFlowers();

        Flower orchid = new Flower();
        orchid.colorOfFlower = "blue";
        orchid.waterAmountForFlower = 4;
        orchid.lookOfGardenFlowers();

        Tree purpleTree = new Tree();
        purpleTree.colorOfTree = "purple";
        purpleTree.waterAmountForTree = 9;
        purpleTree.lookOfGardenTree();

        Tree orangeTree = new Tree();
        orangeTree.colorOfTree = "orange";
        orangeTree.waterAmountForTree = 9;
        orangeTree.lookOfGardenTree();

        System.out.println();

        rose.wateringFlowers();
        orchid.wateringFlowers();
        purpleTree.wateringTrees();
        orangeTree.wateringTrees();

        System.out.println();

        System.out.println("Watering with 40");
        rose.firstWateringFlower();
        rose.wateringFlowers();


        System.out.println();

        System.out.println("Watering with 70");



    }
}
