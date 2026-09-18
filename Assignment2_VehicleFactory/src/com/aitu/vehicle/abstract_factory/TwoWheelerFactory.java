package com.aitu.vehicle.abstract_factory;

public class TwoWheelerFactory implements VehicleFactory {
    @Override
    public Engine createEngine() {
        return new BikeEngine();
    }

    @Override
    public SafetyFeature createSafetyFeature() {
        return new Helmet();
    }
}