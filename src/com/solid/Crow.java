package com.solid;

public class Crow extends Bird implements Flyable, Eatable, FlyableAndEating {

    FlyingBehavior flyingBehavior;

    public Crow(FlyingBehavior flyingBehavior){
        this.flyingBehavior = flyingBehavior;
    }

    public void fly() {
        flyingBehavior.makeFly();
    }

    @Override
    public void eat() {
        System.out.println("Eat like Crow");
    }
}
