package com.designpatterns.singleton;

public class SingleTonClient {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        singleTon.display();
    }
}
