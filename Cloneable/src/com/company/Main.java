package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

Student student = new Student();
Student johnTheClone = student.clone();
johnTheClone.name = "John";
johnTheClone.age = 20;
johnTheClone.gender = "male";
johnTheClone.previousOrganization = "BME";
student.introduce();
johnTheClone.introduce();

    }
}
