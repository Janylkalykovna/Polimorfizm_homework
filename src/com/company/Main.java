package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Shark("Daisy", 5);
        Animal animal1 = new Turtle("Lolly", 45);
        Animal animal2 = new Eagle("Leo", 88);
        Animal[] animals = {animal, animal1, animal2};
        for (Animal a : animals) {
            if (animal instanceof Shark)
                System.out.println(a);
            ((Shark) animal).attack();
            System.out.println();
        }
        if (animal1 instanceof Turtle) {
            System.out.println(animal1);
            ((Turtle) animal1).swim();
            System.out.println();
        }
        if (animal2 instanceof Eagle) {
            System.out.println(animal2);
            ((Eagle) animal2).fly();
        }

    }
}

