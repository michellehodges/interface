package com.theironyard.sample;

public class Marines extends Soldier implements Punch, Stab, Shoot  {
    public Marines(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak() {
        return "Hello! I'm an Marines person.";
    }

    public String knife() {
        return "Swish swish bish!";
    };

    public String fire() {
        return "Pow pow!";
    };
}
