package com.company.Model_stringed_instruments.main.java.music;

public abstract class StringedInstrument extends Instrument {

    int numberOfStrings;

    StringedInstrument (String name, int numberOfStrings) {
        this.name = name;
        this.numberOfStrings = numberOfStrings;
    }

    public abstract String sound ();

    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());
    }
}
