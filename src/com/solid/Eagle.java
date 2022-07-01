package com.solid;

public class Eagle extends Bird implements Flyable, Eatable, FlyableAndEating {

    FlyingBehavior flyingBehavior;

    public Eagle(FlyingBehavior flyingBehavior){
        this.flyingBehavior = flyingBehavior;
    }
    public void fly() {
        flyingBehavior.makeFly();
    }

    @Override
    public void eat() {
        System.out.println("Eat like Eagle");
    }
}
