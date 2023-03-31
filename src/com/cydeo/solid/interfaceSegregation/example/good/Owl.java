package com.cydeo.solid.interfaceSegregation.example.good;

import com.cydeo.solid.interfaceSegregation.example.bad.Bird;

public class Owl implements Bird {

    @Override
    public void eat() {
        System.out.println("Eating.");
    }

    @Override
    public void walk() {
        System.out.println("Walking.");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

}
