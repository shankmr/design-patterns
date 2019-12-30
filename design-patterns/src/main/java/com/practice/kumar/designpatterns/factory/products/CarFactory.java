package com.practice.kumar.designpatterns.factory.products;

import com.practice.kumar.designpatterns.factory.appconstants.CarType;

public class CarFactory {
    public static Car buildCar(CarType carType) {
        switch (carType) {
            case SMALL:  return new SmallCar();
            case LUXURY:  return new LuxuryCar();
            case SEDAN:  return new SedanCar();
            default: return null;
        }
    }
}
