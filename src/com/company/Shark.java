package com.company;

public class Shark extends  Animal{
    public Shark() {
    }

    public Shark(String name, int age) {
        super(name, age);
    }

    public void attack(){
        System.out.println("Sark is predator");
    }

    @Override
    public String toString() {
        return "Shark{} " + super.toString();
    }
}
