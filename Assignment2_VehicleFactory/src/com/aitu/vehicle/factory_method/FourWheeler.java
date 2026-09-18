package com.aitu.vehicle.factory_method;

public class FourWheeler implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Assembling a 4-wheel vehicle (Car)");
    }

    @Override
    public void drive() {
        System.out.println("Driving the car.");
    }
}