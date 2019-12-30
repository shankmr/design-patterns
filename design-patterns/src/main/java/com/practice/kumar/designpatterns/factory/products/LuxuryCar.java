package com.practice.kumar.designpatterns.factory.products;

import com.practice.kumar.designpatterns.factory.appconstants.CarType;

public class LuxuryCar extends Car {

    protected LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Constructing Luxury car...");
    }
}
