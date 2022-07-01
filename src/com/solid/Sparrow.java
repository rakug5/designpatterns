package com.solid;

public class Sparrow extends Bird implements Flyable, Eatable, FlyableAndEating {

    FlyingBehavior flyingBehavior;

    public Sparrow(FlyingBehavior flyingBehavior){
        this.flyingBehavior = flyingBehavior;
    }

    @Override
    public void fly() {
        flyingBehavior.makeFly();
    }

    @Override
    public void eat() {
        System.out.println("eat like sparrow");
    }
}
