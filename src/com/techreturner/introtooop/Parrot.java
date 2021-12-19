package com.techreturner.introtooop;

public class Parrot extends Bird {
    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Morning Morning! I'm " + name + " and I'm a " + color + " parrot. Call me Captain Parrot!!");
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
}
