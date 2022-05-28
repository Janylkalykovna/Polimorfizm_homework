package com.company;

public class Turtle extends  Animal {
    public Turtle() {
    }

    public Turtle(String name, int age) {
        super(name, age);
    }
    public void swim(){
        System.out.println("Turtle can swim");
    }

    @Override
    public String toString() {
        return "Turtle{} " + super.toString();
    }
}
