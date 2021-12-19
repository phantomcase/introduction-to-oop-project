package com.techreturner.introtooop;

public class Penguin extends Bird {

    public Penguin(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " penguin.");
    }

    @Override
    public void fly() {
        System.out.println("Whoops, I can't fly. Waddle waddle.");
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
