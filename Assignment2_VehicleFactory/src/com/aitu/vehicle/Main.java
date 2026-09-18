package com.aitu.vehicle;

import com.aitu.vehicle.factory_method.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part A");

        VehicleFactory bikeFactory = new TwoWheelerFactory();
        bikeFactory.deliverVehicle();

        VehicleFactory carFactory = new FourWheelerFactory();
        carFactory.deliverVehicle();
    }
}