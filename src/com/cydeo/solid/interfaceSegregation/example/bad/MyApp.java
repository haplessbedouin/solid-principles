package com.cydeo.solid.interfaceSegregation.example.bad;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Bird> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Owl());
        birds.add(new Chicken());

        letBirdsFly(birds);

    }

    public static void letBirdsFly(List<Bird> birds) {
        for (Bird bird : birds) {
            bird.fly();             // We implemented fly() in Chicken class but chickens can not fly.
        }
    }

}
