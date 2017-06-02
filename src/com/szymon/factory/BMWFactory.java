package com.szymon.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class BMWFactory implements CarFactory{
    public Car buildCar(String model) {
        Car car = null;
        if(model.equals("s600")) {
            Engine engine = new Engine(200, 3000, "diesel");
            Wheels wheels = new Wheels(18, "summer");
            car= new BMW("s600", engine, wheels);
        } else if (model.equals("cls")){
            Engine engine = new Engine(200, 3000, "diesel");
            Wheels wheels = new Wheels(18, "summer");
            car= new BMW("cls", engine, wheels);
        }
        return car;
    }
}
