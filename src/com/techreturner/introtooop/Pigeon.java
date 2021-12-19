package com.techreturner.introtooop;

//The Pigeon extends the base class Bird
public class Pigeon extends Bird {

    //The Pigeon constructor calls the base class Bird constructor
    //The name and color parameters are passed to the Bird constructor
    public Pigeon(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " pigeon.");
    }

    @Override
    public void spin() {

    }

    @Override
    public void doTheCaterpillar() {

    }

    @Override
    public void jump() {

    }

    public void eatPizza() {
        System.out.println("Delicious pizza!");
    }

    public void sleep(){
        System.out.println("I'm a sleeping pigeon");
    }
}
