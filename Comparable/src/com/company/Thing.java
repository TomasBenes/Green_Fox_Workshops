package com.company;

public class Thing implements Comparable<Thing> {

    private String name;
    private boolean completed;

    public Thing(String name, Boolean completed) {
        this.name = name;
        this.completed = completed;
    }

    public boolean complete() {
        return completed;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Thing thing) {
        if (this.complete() == thing.complete()){
            return this.name.compareTo(thing.name);
    }
    return Boolean.compare(this.completed, thing.completed);
    }

}
