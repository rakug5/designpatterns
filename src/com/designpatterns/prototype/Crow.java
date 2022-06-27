package com.designpatterns.prototype;

public class Crow extends Bird {

    public String singing;
    public Crow(){}
    public Crow(Crow original){
        super(original);
        this.singing = original.singing;
    }

    @Override
    public Crow copy() {
        return new Crow(this);
    }
}
