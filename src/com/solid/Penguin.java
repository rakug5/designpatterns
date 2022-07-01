package com.solid;

public class Penguin extends Bird implements Eatable {

    @Override
    public void eat() {
        System.out.println("Eat like Penguin");
    }
}
