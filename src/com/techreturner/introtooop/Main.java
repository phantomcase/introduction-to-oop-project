package com.techreturner.introtooop;

public class Main {
    public static void main(String[] args) {

        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();
        pippa.eatPizza();
        pippa.sleep();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        pingu.spin();
        pingu.doTheCaterpillar();
        pingu.jump();

        Parrot captainparro = new Parrot("Parro", "Rainbow");
        captainparro.speak();
        captainparro.fly();
        captainparro.spin();
        captainparro.doTheCaterpillar();
        captainparro.jump();

    }
}
