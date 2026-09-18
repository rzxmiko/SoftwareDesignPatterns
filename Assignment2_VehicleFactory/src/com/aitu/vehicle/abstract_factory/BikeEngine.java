package com.aitu.vehicle.abstract_factory;

public class BikeEngine implements Engine {
    @Override
    public void getSpecs() {
        System.out.println("Engine: 600cc Motorcycle Engine");
    }
}