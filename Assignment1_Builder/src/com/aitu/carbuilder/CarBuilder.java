package com.aitu.carbuilder;

public interface CarBuilder {
    CarBuilder setModel(String model);
    CarBuilder setColor(String color);
    CarBuilder setMaxSpeed(int maxSpeed);
    CarBuilder setElectric(boolean isElectric);
    Car build();
}
