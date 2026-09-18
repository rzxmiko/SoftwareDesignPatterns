package com.aitu.vehicle.abstract_factory;

public interface VehicleFactory {
    Engine createEngine();
    SafetyFeature createSafetyFeature();
}