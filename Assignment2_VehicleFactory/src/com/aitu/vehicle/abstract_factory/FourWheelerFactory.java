package com.aitu.vehicle.abstract_factory;

public class FourWheelerFactory implements VehicleFactory {
    @Override
    public Engine createEngine() {
        return new CarEngine();
    }

    @Override
    public SafetyFeature createSafetyFeature() {
        return new Seatbelt();
    }
}