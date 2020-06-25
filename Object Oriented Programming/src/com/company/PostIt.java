package com.company;

import javafx.scene.layout.Background;

import java.awt.*;

public class PostIt {

    public String text;
    public String backgroundColor;
    public String textColor;

    public void printingStringsToConsole(){
        System.out.println("The text is: " + this.text + ", background color is: " + this.backgroundColor + ", text color is: " + this.textColor);
        }
    }
