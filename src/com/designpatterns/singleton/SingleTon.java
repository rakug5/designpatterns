package com.designpatterns.singleton;

public class SingleTon {
    private static SingleTon instance;

    private SingleTon() {

    }

    public static SingleTon getInstance() {

        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }

    public void display() {
        System.out.println("Hello inside singleton Method");
        //return null;
    }

}
