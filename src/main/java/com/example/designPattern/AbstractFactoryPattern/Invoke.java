package com.example.designPattern.AbstractFactoryPattern;

public class Invoke {
    public static void main(String[] args) {
        MixFactory mixFactory = new MixOneFactory();
        Animal animal = mixFactory.getAnimal();
        Plant plant = mixFactory.getPlant();
        animal.show();
        plant.show();
        mixFactory = new MixTwoFactory();
        animal = mixFactory.getAnimal();
        plant = mixFactory.getPlant();
        animal.show();
        plant.show();
    }
}
