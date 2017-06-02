package com.szymon.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class Engine {
    private int hordePower;
    private int capacity;
    private String type;

    public Engine(int hordePower, int capacity, String type) {
        this.hordePower = hordePower;
        this.capacity = capacity;
        this.type = type;
    }

    public int getHordePower() {
        return hordePower;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }
}
