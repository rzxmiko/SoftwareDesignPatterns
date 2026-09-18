package com.aitu.carbuilder;

public class Car {
    private final String model;
    private final String color;
    private final int maxSpeed;
    private final boolean isElectric;

    Car(String model, String color, int maxSpeed, boolean isElectric){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }


    public void printInfo(){
        System.out.println("Car Specifications");
        System.out.println("Model:" + model);
        System.out.println("Color:" + color);
        System.out.println("Max Speed:" + maxSpeed + "km/h");
        System.out.println("Engine Type:" + (isElectric? "Electric": "Gasoline/Diesel"));
    }
}
