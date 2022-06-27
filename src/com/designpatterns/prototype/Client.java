package com.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

/***
 * Practise Prototype Design Pattern and Registry Design Pattern.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("hello");
        Crow crow = new Crow();
        Penguin penguin = new Penguin();
        Pigeon pigeon = new Pigeon();
        crow.color = "Black";
        crow.name = "village";
        crow.weight = 1000;
        crow.singing = "kawkaw";
        penguin.color = "whiteandblack";
        penguin.name = "cute";
        penguin.weight = 100000;
        penguin.walks = "slow";
        pigeon.color = "ash";
        pigeon.weight = 650;
        pigeon.name = "pet";
        pigeon.type = "city";

        List<Bird> prototypes = List.of(
                crow, penguin, pigeon
        );
        List<Bird> kids = new ArrayList<>();
        for (Bird b : prototypes) {
            kids.add(b.copy());
        }
        System.out.println("End of Program");

        Crow sweetCrow = new Crow();
        sweetCrow.singing = "sweet";
        Crow harshCrow = new Crow();
        harshCrow.singing = "kawkaw";
        //prototypes.add(sweetCrow);
        //prototypes.add(harshCrow);

        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.registerBird("sweetCrow", sweetCrow);
        birdRegistry.registerBird("harshCrow", harshCrow);

        List<Bird> registeredBirds = List.of(birdRegistry.getBird("sweetCrow"), birdRegistry.getBird("harshCrow"));


    }
}
