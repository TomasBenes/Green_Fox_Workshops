package com.company;

import java.util.ArrayList;

public class Cohort {
    String name;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public Cohort (String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent (Student student) {
        this.students.add(student);
    }

    public void addMentor (Mentor mentor) {
        this.mentors.add(mentor);
    }

    public void info () {
        System.out.println("The " + this.name + " cohort has " + this.students.size() + " students and " + this.mentors.size() + " mentors.");
    }


}
