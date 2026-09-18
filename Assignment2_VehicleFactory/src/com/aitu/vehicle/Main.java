package com.aitu.vehicle;
import com.aitu.vehicle.factory_method.*;
import com.aitu.vehicle.abstract_factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part A: Factory Method");
        runFactoryMethod(new com.aitu.vehicle.factory_method.TwoWheelerFactory());
        runFactoryMethod(new com.aitu.vehicle.factory_method.FourWheelerFactory());

        System.out.println("Part B: Abstract Factory");
        runAbstractFactory("2-Wheeler Family", new com.aitu.vehicle.abstract_factory.TwoWheelerFactory());
        runAbstractFactory("4-Wheeler Family", new com.aitu.vehicle.abstract_factory.FourWheelerFactory());
    }

    private static void runFactoryMethod(com.aitu.vehicle.factory_method.VehicleFactory factory) {
        factory.deliverVehicle();
    }

    private static void runAbstractFactory(String title, com.aitu.vehicle.abstract_factory.VehicleFactory factory) {
        System.out.println(title);
        factory.createEngine().getSpecs();
        factory.createSafetyFeature().deploy();
        System.out.println();
    }
}