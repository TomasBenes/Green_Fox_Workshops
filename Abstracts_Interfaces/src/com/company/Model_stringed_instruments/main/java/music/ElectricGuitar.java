package com.company.Model_stringed_instruments.main.java.music;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ElectricGuitar extends StringedInstrument {


    public ElectricGuitar(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }

    @Override
    public String sound() {
        return "Twang";
    }

}
