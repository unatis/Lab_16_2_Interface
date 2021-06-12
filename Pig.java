package com.company;

public class Pig implements Animal, BiologicalTraits{


    @Override
    public void animalSound() {
        System.out.println("whee whee");
    }

    @Override
    public void sleep() {
        System.out.println("zzzzz");
    }

    @Override
    public void Eat() {
        System.out.println("om nom nom");
    }

    @Override
    public void Digestion() {
        System.out.println(".......");
    }

    @Override
    public void Walk() {
        System.out.println("step by step");
    }

    public void PigMethod() {
        System.out.println("PigMethod");
    }
}
