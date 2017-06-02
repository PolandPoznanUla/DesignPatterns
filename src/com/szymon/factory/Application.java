package com.szymon.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class Application {
    public static void main(String[] args) {

//        AudiFactory audiFactory = new AudiFactory();
//        Car car = audiFactory.buildCar("a3");

        AbstractCarFactory abstractCarFactory = new AbstractCarFactory();
        Car car = abstractCarFactory.buildAudiCar("a3");
        Car car2 = abstractCarFactory.buildBMW("x5");
        Car car3 = abstractCarFactory.buildMercedess("s600");

//        Engine audiEngine = new Engine(200, 3000, "diesel");
//        Wheels wheels = new Wheels(18, "summer");
//        Audi audi = new Audi("a3", audiEngine, wheels);
//
//        audi.drive();
//
//        Engine mercedessEngine = new Engine(300, 3000, "gas");
//        Wheels mercedessWheels = new Wheels(19, "winter");
//        Mercedess mercedess = new Mercedess("s600", mercedessEngine, mercedessWheels);
//
//        mercedess.drive();
    }
}
