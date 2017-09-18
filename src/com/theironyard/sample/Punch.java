package com.theironyard.sample;

public interface Punch {
    default public String swing() {
        return "Default Punch move!";
    };
}

