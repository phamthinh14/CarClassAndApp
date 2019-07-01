package com.company;

public class Vehicle {

    public String Starting() {
        return " is starting.";
    }

    public String Accelerating() {
        return " is accelerating.";
    }

    public String Stopped() {
        return " is stopped.";
    }

    public String EmissionCheck() {
        return " has stopped to have its emissions checked.";
    }

    public String PassEmissionCheck(){
        return " passes its emission test.";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
