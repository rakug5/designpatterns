package com.designpatterns.prototype;

public class Pigeon extends Bird {
    public String type = "cityFlyingBird";

    public Pigeon() {
    }

    public Pigeon(Pigeon original) {
        super(original);
        this.type = original.type;
    }

    @Override
    public Pigeon copy() {
        return new Pigeon(this);
    }
}
