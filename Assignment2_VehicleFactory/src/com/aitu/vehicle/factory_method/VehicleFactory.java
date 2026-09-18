package com.aitu.vehicle.factory_method;

public abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public void deliverVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.assemble();
        vehicle.drive();
        System.out.println("Vehicle ready for delivery!\n");
    }
}