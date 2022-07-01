package com.solid;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        FlyingBehavior lowFlyingBird = new LowAltitudeFlying();
        FlyingBehavior highFlyingBird = new HighAltitudeFlying();
        Crow crow = new Crow(highFlyingBird);
        crow.type = BirdType.CROW;
        crow.color = "black";
        crow.weight = 100;
        crow.size = 20;
        Eagle eagle = new Eagle(highFlyingBird);
        eagle.type = BirdType.EAGLE;
        eagle.color = "black";
        eagle.weight = 100;
        eagle.size = 20;
        Pigeon pigeon = new Pigeon(lowFlyingBird);
        pigeon.type = BirdType.PIGEON;
        pigeon.weight = 1000;
        pigeon.size = 15;
        pigeon.color = "grey";
        Penguin penguin = new Penguin();
        penguin.color = "blackandwhite";
        penguin.size = 500;
        penguin.weight = 10000;
        penguin.type = BirdType.PENGUIN;
        Sparrow sparrow = new Sparrow(lowFlyingBird);
        sparrow.type = BirdType.SPARROW;
        sparrow.color = "green";
        sparrow.size = 3;
        sparrow.weight = 50;
        ToyBird toyBird = new ToyBird();
        toyBird.color = "red";
        toyBird.size = 5;
        toyBird.type = BirdType.TOYBIRD;
        toyBird.weight = 55;
        crow.fly();
        crow.eat();
        pigeon.fly();
        pigeon.eat();
        penguin.eat();
        sparrow.fly();
        sparrow.eat();
        eagle.fly();

        List<Bird> birds = List.of(crow, penguin, pigeon, sparrow, toyBird);
        List<Flyable> flyableBirds = List.of(crow, pigeon, sparrow);
        List<FlyableAndEating> flyableAndEatingsList = List.of(crow, pigeon, sparrow);


    }
}
