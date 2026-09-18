package com.aitu.vehicle.abstract_factory;

public class CarEngine implements Engine {
    @Override
    public void getSpecs() {
        System.out.println("Engine: 2.0L Turbo Electric Motor");
    }
}