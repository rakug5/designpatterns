package com.solid;

public class Pigeon extends Bird implements Eatable, Flyable, FlyableAndEating {
    FlyingBehavior flyingBehavior;

    Pigeon(FlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }


    public void fly() {
        flyingBehavior.makeFly();
    }

    public void eat() {
        System.out.println("Eat like Pigeon");
    }
}
