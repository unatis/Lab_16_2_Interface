package com.company;

public class Main {

    public static void main(String[] args) {

        Pig pig = new Pig();

        pig.SomeDefaultMethod();
        pig.animalSound();
        pig.sleep();

        pig.Eat();
        pig.Digestion();
        pig.Walk();

        pig.PigMethod();
        
        //pig.Hello = "";
        //Animal animal = new Animal();
        Animal animal = pig;
        animal.animalSound();

    }

}
