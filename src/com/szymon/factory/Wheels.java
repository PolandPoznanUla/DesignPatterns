package com.szymon.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class Wheels {
    private int size;
    private String type;

    public Wheels(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "size=" + size +
                ", type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;

    }
}
