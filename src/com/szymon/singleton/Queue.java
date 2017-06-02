package com.szymon.singleton;


import java.util.ArrayList;
import java.util.List;

public class Queue {

    private static Queue instance = null;

    public static Queue getInstance() {
        if(instance == null) {
            instance = new Queue();
        }
        return instance;
    }

    private Queue() {
        values = new ArrayList<>();
    }

// struktura singleton tzw. lazy loading

    private List<String> values;

    public void push(String value) {
        values.add(value);
    }

    public String pop() {
        String valueToReturn = null;
        if(values.size() > 0) {
            valueToReturn = values.remove(0);
        }
        return valueToReturn;
    }

}
