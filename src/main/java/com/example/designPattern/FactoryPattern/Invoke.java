package com.example.designPattern.FactoryPattern;

public class Invoke {
    public static void main(String[] args) {
        CattleFactory cattleFactory = new CattleFactory();
        Animal animal = cattleFactory.getAnimal();
        animal.show();
        HorseFactory horseFactory = new HorseFactory();
        animal = horseFactory.getAnimal();
        animal.show();
    }
}
