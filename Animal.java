package com.company;

interface Animal {

    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)

    public default void SomeDefaultMethod(){

        System.out.println("SomeDefaultMethod");

    }

    public default void SomeDefaultMethod_2(){

        System.out.println("SomeDefaultMethod_2");

    }
}
