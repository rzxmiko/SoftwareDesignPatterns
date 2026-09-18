package com.aitu.carbuilder;

public class Main {
    public static void main(String[] args) {
        Car cityCar = new CityCarBuilder()
                .setColor("Blue")
                .setMaxSpeed(160)
                .build();
        cityCar.printInfo();

        System.out.println();

        Car sportsCar = new SportsCarBuilder().build();
        sportsCar.printInfo();
    }
}
