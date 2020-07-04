package com.company;

public class Main {

    public static void main(String[] args) {
	Helicopter apache = new Helicopter();
	apache.weight = 10000;
	apache.type = "Military";
	apache.maxSpeed = 800;
	apache.introduce();
	apache.takeOff();
	apache.fly();
	apache.land();

    }
}
