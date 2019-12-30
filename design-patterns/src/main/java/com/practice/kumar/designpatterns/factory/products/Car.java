package com.practice.kumar.designpatterns.factory.products;

import com.practice.kumar.designpatterns.factory.appconstants.CarType;

public abstract class Car {

    private CarType carType;

    public Car(CarType carType) {
        this.carType = carType;
    }

    protected abstract void construct();

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

}
