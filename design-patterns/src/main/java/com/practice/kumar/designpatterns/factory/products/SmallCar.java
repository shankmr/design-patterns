package com.practice.kumar.designpatterns.factory.products;

import com.practice.kumar.designpatterns.factory.appconstants.CarType;

class SmallCar extends Car {

    protected SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Constructing small car...");
    }
}
