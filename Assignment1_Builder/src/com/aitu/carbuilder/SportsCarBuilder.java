package com.aitu.carbuilder;

public class SportsCarBuilder implements CarBuilder{
    private String model = "Porsche 911";
    private String color = "pink";
    private int maxSpeed = 308;
    private boolean isElectric = false;

    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }
    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }
    @Override
    public CarBuilder setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }
    @Override
    public CarBuilder setElectric(boolean isElectric) {
        this.isElectric = isElectric;
        return this;
    }
    @Override
    public Car build() {
        if (maxSpeed < 200) {
            throw new IllegalArgumentException("Sports car max speed must be at least 200 km/h!");
        }
        return new Car(model, color, maxSpeed, isElectric);
    }
}
