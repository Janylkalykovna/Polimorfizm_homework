package com.company;

public class Eagle extends Animal {
    public Eagle() {
    }

    public Eagle(String name, int age) {
        super(name, age);
    }

    public void fly(){
        System.out.println("Eagle like fly");
    }

    @Override
    public String toString() {
        return "Eagle{} " + super.toString();
    }
}
