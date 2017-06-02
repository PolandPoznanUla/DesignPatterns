package com.szymon.factory;

public class Mercedess implements Car {
    private String model;

    private Engine engine;

    private Wheels wheels;


    public Mercedess(String model, Engine engine, Wheels wheels) {
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Override
    public void drive() {
        System.out.println("Drive with Mercedess" + model);
        System.out.println("Engine: " + engine.toString());
        System.out.println("Whells: " + wheels.toString());
    }
}
