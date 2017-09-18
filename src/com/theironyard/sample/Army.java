package com.theironyard.sample;

public class Army extends Soldier implements Punch, Stab, Shoot {
    public Army(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak() {
        return "Hello! I'm an Army person.";
    }

    @Override
    public String swing() {
        return "Override here!";
    }

    public String knife() {
        return "Stab stab!";
    };

    public String fire() {
        return "Boom!";
    };
}
