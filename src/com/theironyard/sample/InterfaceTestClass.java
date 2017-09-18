package com.theironyard.sample;

public class InterfaceTestClass extends Soldier implements SameInterface1, SameInterface2{
    public InterfaceTestClass(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    @Override
    public String speak() {
        return null;
    }

    @Override
    public void Test() {

    }
}
