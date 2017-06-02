package com.szymon.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENT on 2017-06-02.
 */
public class AbstractCarFactory {

    private Map<CarFactorysEnums, CarFactory> factories;

    public AbstractCarFactory() {
        this.factories = new HashMap<>();
        initFactories();
    }

    public Car buildAudiCar(String model) {
        return buildAudiCar(CarFactorysEnums.AUDI, model);
    }

    public Car buildBMW(String model) {
        return buildAudiCar(CarFactorysEnums.BMW, model);
    }

    public Car buildMercedess(String model) {
        return buildAudiCar(CarFactorysEnums.MERCEDESS, model);
    }


    private void initFactories() {
        factories.put(CarFactorysEnums.AUDI, new AudiFactory());
        factories.put(CarFactorysEnums.MERCEDESS, new AudiFactory());
        factories.put(CarFactorysEnums.BMW, new AudiFactory());
    }

    private Car buildCar(CarFactorysEnums type, String model) {
        return factories.get(type).buildCar(model);
    }

}
