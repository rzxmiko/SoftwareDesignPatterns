package com.aitu.vehicle;
import com.aitu.vehicle.abstract_factory.Engine;
import com.aitu.vehicle.abstract_factory.SafetyFeature;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part A: Factory Method");

        runFactoryMethod(new com.aitu.vehicle.factory_method.TwoWheelerFactory());
        runFactoryMethod(new com.aitu.vehicle.factory_method.FourWheelerFactory());

        System.out.println("Part B: Abstract Factory");

        runAbstractFactory("Two-Wheeler Family", new com.aitu.vehicle.abstract_factory.TwoWheelerFactory());
        runAbstractFactory("Four-Wheeler Family", new com.aitu.vehicle.abstract_factory.FourWheelerFactory());
    }

    private static void runFactoryMethod(com.aitu.vehicle.factory_method.VehicleFactory factory) {
        factory.deliverVehicle();
    }

    private static void runAbstractFactory(String title, com.aitu.vehicle.abstract_factory.VehicleFactory factory) {
        System.out.println(title);
        Engine engine = factory.createEngine();
        SafetyFeature safety = factory.createSafetyFeature();

        engine.getSpecs();
        safety.deploy();
        System.out.println();
    }
}