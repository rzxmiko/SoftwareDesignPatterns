package com.aitu.vehicle.abstract_factory;

public class Seatbelt implements SafetyFeature {
    @Override
    public void deploy() {
        System.out.println("Safety: Seatbelts & Dual Airbags");
    }
}