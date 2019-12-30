package com.practice.kumar.designpatterns.factory.products;

import com.practice.kumar.designpatterns.factory.appconstants.CarType;

public class SedanCar extends Car {

    public SedanCar() {
        super(CarType.SEDAN);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Constructing Sedan Car");
    }
}
