package com.theironyard.sample;

public class Navy extends Soldier implements Punch, Stab, Shoot  {
    public Navy(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak() {
        return "Hello! I'm an Navy person.";
    }

    public String swing() {
        return "The intense Navy punch!";
    };

    public String knife() {
        return "Sliced!";
    };

    public String fire() {
        return "Kapow!";
    };
}
