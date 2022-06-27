package com.designpatterns.prototype;

public class Bird implements Cloneable<Bird> {

    public String name;
    public int weight;
    public String color;

    public Bird() {
    }

    public Bird(Bird original) {
        this.color = original.color;
        this.name = original.name;
        this.weight = original.weight;
    }


    @Override
    public Bird copy() {
        return new Bird(this);
    }
}
