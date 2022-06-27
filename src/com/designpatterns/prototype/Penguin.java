package com.designpatterns.prototype;

public class Penguin extends Bird {

    public String walks;

    public Penguin() {
    }

    public Penguin(Penguin original) {
        super(original);
        this.walks = original.walks;
    }

    @Override
    public Penguin copy() {
        return new Penguin(this);
    }
}
