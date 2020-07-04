package com.company.Model_stringed_instruments.main.java.music;

public class BassGuitar extends StringedInstrument {


    public BassGuitar(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}
