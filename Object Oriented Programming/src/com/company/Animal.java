package com.company;

public class Animal {

    int hunger = 50;
    int thirst = 50;

    /*public void defaultValues () {
        this.hunger = 50;
        this.thirst = 50;
    }*/
    public void eat () {
        this.hunger -= 1;
        System.out.println(this.hunger);
    }
    public void drink (){
        this.thirst -= 1;
        System.out.println(this.thirst);
    }
    public void play (){
        this.hunger += 1;
        this.thirst +=1;
        System.out.println(this.hunger);
        System.out.println(this.thirst);
    }

}
