package com.theironyard.sample;

abstract public class Soldier {
    private String name;
    private String rank;
    private int serialNumber;

    public Soldier(String name, String rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

    public String sleep(){
        return "Zzzzzz.";
    }

    public String eat(){
        return "Nomnomnom.";
    }

    public String walk(){
        return "Boom, boom, boom.";
    }

    abstract public String speak();
}
