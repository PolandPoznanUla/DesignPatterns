package com.szymon.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class MercedessFactory implements CarFactory {
    public Car buildCar(String model) {
        Car car = null;
        if (model.equals("m5")) {
            Engine engine = new Engine(200, 3000, "diesel");
            Wheels wheels = new Wheels(18, "summer");
            car = new Mercedess("m5", engine, wheels);
        } else if (model.equals("tt")) {
            Engine engine = new Engine(200, 3000, "diesel");
            Wheels wheels = new Wheels(18, "summer");
            car = new Mercedess("tt", engine, wheels);
        }
        return car;
    }
}

