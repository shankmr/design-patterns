package com.practice.kumar.designpatterns.factory;

import com.practice.kumar.designpatterns.factory.appconstants.CarType;
import com.practice.kumar.designpatterns.factory.products.CarFactory;

public class CarFactoryTester {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
    }
}
