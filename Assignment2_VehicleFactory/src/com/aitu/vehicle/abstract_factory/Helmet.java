package com.aitu.vehicle.abstract_factory;

public class Helmet implements SafetyFeature {
    @Override
    public void deploy() {
        System.out.println("Safety: Helmet and Riding Jacket");
    }
}