package com.aitu.carbuilder;

public class CityCarBuilder implements CarBuilder{
    private String model = "Honda City Hatchback";
    private String color = "Red";
    private int maxSpeed = 180;
    private boolean isElectric = false;

    @Override
    public CityCarBuilder setModel(String model) {
        this.model = model;
        return this;
    }
    @Override
    public CityCarBuilder setColor(String color) {
        this.color = color;
        return this;
    }
    @Override
    public CityCarBuilder setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }
    @Override
    public CityCarBuilder setElectric(boolean isElectric) {
        this.isElectric = isElectric;
        return this;
    }
    @Override
    public Car build() {
        if (maxSpeed > 200) {
            throw new IllegalArgumentException("City car max speed cannot exceed 200 km/h!");
        }
        return new Car(model, color, maxSpeed, isElectric);
    }

}
